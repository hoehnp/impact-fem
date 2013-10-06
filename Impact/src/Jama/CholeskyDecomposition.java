/*
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOUSE. See the GNU
 * General Public License for more details.
 *
 * You should have recieved a copy of the GNU General Public License
 * along with this program; if not write to the Free Software
 * Foundation, inc., 59 Temple Place, Suite 330, Boston MA 02111-1307
 * USA
 */

package Jama;

/**
 * Cholesky Decomposition.
 * 
 * <P>
 * For a symmetric, positive definite matrix A, the Cholesky decomposition is an
 * lower triangular matrix L so that A = LL'.
 * </p>
 * 
 * <P>
 * If the matrix is not symmetric or positive definite, the constructor returns
 * a partial decomposition and sets an internal flag that may be queried by the
 * isSPD() method.
 * </p>
 */
public class CholeskyDecomposition implements java.io.Serializable {
	/*
	 * ------------------------ Class variables ------------------------
	 */

	/**
	 * Array for internal storage of decomposition.
	 * 
	 * @serial internal array storage.
	 */
	private double[][] L;

	/**
	 * Row and column dimension (square matrix).
	 * 
	 * @serial matrix dimension.
	 */
	private int n;

	/**
	 * Symmetric and positive definite flag.
	 * 
	 * @serial is symmetric and positive definite flag.
	 */
	private boolean isspd;

	/*
	 * ------------------------ Constructor ------------------------
	 */

	/**
	 * Cholesky algorithm for symmetric and positive definite matrix.
	 * 
	 * @param A
	 *            Square, symmetric matrix.
	 */
	public CholeskyDecomposition(Matrix Arg) {
		// Initialize.
		double[][] A = Arg.getArray();
		n = Arg.getRowDimension();
		L = new double[n][n];
		isspd = (Arg.getColumnDimension() == n);

		// Main loop.
		for (int j = 0; j < n; j++) {
			double[] Lrowj = L[j];
			double d = 0.0;

			for (int k = 0; k < j; k++) {
				double[] Lrowk = L[k];
				double s = 0.0;

				for (int i = 0; i < k; i++) {
					s += (Lrowk[i] * Lrowj[i]);
				}

				Lrowj[k] = s = (A[j][k] - s) / L[k][k];
				d = d + (s * s);
				isspd = isspd & (A[k][j] == A[j][k]);
			}

			d = A[j][j] - d;
			isspd = isspd & (d > 0.0);
			L[j][j] = Math.sqrt(Math.max(d, 0.0));

			for (int k = j + 1; k < n; k++) {
				L[j][k] = 0.0;
			}
		}
	}

	/**
	 * Return triangular factor.
	 * 
	 * @return L
	 */
	public Matrix getL() {
		return new Matrix(L, n, n);
	}

	/*
	 * ------------------------ Temporary, experimental code.
	 * ------------------------ *\ \** Right Triangular Cholesky Decomposition.
	 * <P> For a symmetric, positive definite matrix A, the Right Cholesky
	 * decomposition is an upper triangular matrix R so that A = R'*R. This
	 * constructor computes R with the Fortran inspired column oriented
	 * algorithm used in LINPACK and MATLAB. In Java, we suspect a row oriented,
	 * lower triangular decomposition is faster. We have temporarily included
	 * this constructor here until timing experiments confirm this suspicion.\
	 * \** Array for internal storage of right triangular decomposition. **\
	 * private transient double[][] R; \** Cholesky algorithm for symmetric and
	 * positive definite matrix.
	 * 
	 * @param A Square, symmetric matrix.
	 * 
	 * @param rightflag Actual value ignored.
	 * 
	 * @return Structure to access R and isspd flag.\ public
	 * CholeskyDecomposition (Matrix Arg, int rightflag) { // Initialize.
	 * double[][] A = Arg.getArray(); n = Arg.getColumnDimension(); R = new
	 * double[n][n]; isspd = (Arg.getColumnDimension() == n); // Main loop. for
	 * (int j = 0; j < n; j++) { double d = 0.0; for (int k = 0; k < j; k++) {
	 * double s = A[k][j]; for (int i = 0; i < k; i++) { s = s -
	 * R[i][k]*R[i][j]; } R[k][j] = s = s/R[k][k]; d = d + s*s; isspd = isspd &
	 * (A[k][j] == A[j][k]); } d = A[j][j] - d; isspd = isspd & (d > 0.0);
	 * R[j][j] = Math.sqrt(Math.max(d,0.0)); for (int k = j+1; k < n; k++) {
	 * R[k][j] = 0.0; } } } \** Return upper triangular factor.
	 * 
	 * @return R\ public Matrix getR () { return new Matrix(R,n,n); } \*
	 * ------------------------ End of temporary code. ------------------------
	 */
	/*
	 * ------------------------ Public Methods ------------------------
	 */

	/**
	 * Is the matrix symmetric and positive definite?
	 * 
	 * @return true if A is symmetric and positive definite.
	 */
	public boolean isSPD() {
		return isspd;
	}

	/**
	 * Solve AX = B
	 * 
	 * @param B
	 *            A Matrix with as many rows as A and any number of columns.
	 * 
	 * @return X so that LL'X = B
	 * 
	 * @exception IllegalArgumentException
	 *                Matrix row dimensions must agree.
	 * @exception RuntimeException
	 *                Matrix is not symmetric positive definite.
	 */
	public Matrix solve(Matrix B) {
		if (B.getRowDimension() != n) {
			throw new IllegalArgumentException(
					"Matrix row dimensions must agree.");
		}

		if (!isspd) {
			throw new RuntimeException(
					"Matrix is not symmetric positive definite.");
		}

		// Copy right hand side.
		double[][] X = B.getArrayCopy();
		int nx = B.getColumnDimension();

		// Solve L*Y = B;
		for (int k = 0; k < n; k++) {
			for (int i = k + 1; i < n; i++) {
				for (int j = 0; j < nx; j++) {
					X[i][j] -= (X[k][j] * L[i][k]);
				}
			}

			for (int j = 0; j < nx; j++) {
				X[k][j] /= L[k][k];
			}
		}

		// Solve L'*X = Y;
		for (int k = n - 1; k >= 0; k--) {
			for (int j = 0; j < nx; j++) {
				X[k][j] /= L[k][k];
			}

			for (int i = 0; i < k; i++) {
				for (int j = 0; j < nx; j++) {
					X[i][j] -= (X[k][j] * L[k][i]);
				}
			}
		}

		return new Matrix(X, n, nx);
	}
}
