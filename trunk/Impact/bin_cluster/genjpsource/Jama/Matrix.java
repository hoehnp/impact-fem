package Jama;
import Jama.util.*;

import uka.transport.*;

import uka.patch.*;

import java.io.BufferedReader;

import java.io.PrintWriter;

import java.io.StreamTokenizer;

import java.text.DecimalFormat;

import java.text.DecimalFormatSymbols;

import java.text.NumberFormat;

import java.util.Locale;

import uka.util.Printable;

import uka.util.ToString;

public class Matrix implements Printable, Cloneable, Transportable, Patchable, java.io.Serializable {
   protected double[][] A;
   protected int m;
   protected int n;
   public Matrix(int m, int n) {
      super();
      this.m = m;
      this.n = n;
      this.A = new double[m][n];
   }
   public Matrix(int m, int n, double s) {
      super();
      this.m = m;
      this.n = n;
      this.A = new double[m][n];
      for (int i = 0; i < m; i++) {
         for (int j = 0; j < n; j++) {
            this.A[i][j] = s;
         }
      }
   }
   public Matrix(double[] vals, int m) {
      super();
      this.m = m;
      this.n = m != 0 ? vals.length / m : 0;
      if (m * this.n != vals.length) {
         throw new IllegalArgumentException("Array length must be a multiple of m.");
      }
      this.A = new double[m][this.n];
      for (int i = 0; i < m; i++) {
         for (int j = 0; j < this.n; j++) {
            this.A[i][j] = vals[i + j * m];
         }
      }
   }
   public Matrix(double[][] A) {
      super();
      this.m = A.length;
      this.n = A[0].length;
      for (int i = 0; i < this.m; i++) {
         if (A[i].length != this.n) {
            throw new IllegalArgumentException("All rows must have the same length.");
         }
      }
      this.A = A;
   }
   public Matrix(float[][] A) {
      super();
      this.m = A.length;
      this.n = A[0].length;
      for (int i = 0; i < this.m; i++) {
         if (A[i].length != this.n) {
            throw new IllegalArgumentException("All rows must have the same length.");
         }
      }
      this.A = new double[this.m][this.n];
      for (int i = 0; i < this.m; i++) for (int j = 0; j < this.n; j++) this.A[i][j] = (double)A[i][j];
   }
   public Matrix(double[][] A, int m, int n) {
      super();
      this.A = A;
      this.m = m;
      this.n = n;
   }
   public Matrix arrayLeftDivide(Matrix B) {
      checkMatrixDimensions(B);
      Matrix X = new Matrix(this.m, this.n);
      double[][] C = X.getArray();
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            C[i][j] = B.A[i][j] / this.A[i][j];
         }
      }
      return X;
   }
   public Matrix arrayLeftDivideEquals(Matrix B) {
      checkMatrixDimensions(B);
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            this.A[i][j] = B.A[i][j] / this.A[i][j];
         }
      }
      return this;
   }
   public Matrix arrayRightDivide(Matrix B) {
      checkMatrixDimensions(B);
      Matrix X = new Matrix(this.m, this.n);
      double[][] C = X.getArray();
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            C[i][j] = this.A[i][j] / B.A[i][j];
         }
      }
      return X;
   }
   public Matrix arrayRightDivideEquals(Matrix B) {
      checkMatrixDimensions(B);
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            this.A[i][j] = this.A[i][j] / B.A[i][j];
         }
      }
      return this;
   }
   public Matrix arrayTimes(Matrix B) {
      checkMatrixDimensions(B);
      Matrix X = new Matrix(this.m, this.n);
      double[][] C = X.getArray();
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            C[i][j] = this.A[i][j] * B.A[i][j];
         }
      }
      return X;
   }
   public Matrix arrayTimesEquals(Matrix B) {
      checkMatrixDimensions(B);
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            this.A[i][j] = this.A[i][j] * B.A[i][j];
         }
      }
      return this;
   }
   private void checkMatrixDimensions(Matrix B) {
      if (B.m != this.m || B.n != this.n) {
         throw new IllegalArgumentException("Matrix dimensions must agree.");
      }
   }
   public CholeskyDecomposition chol() {
      return new CholeskyDecomposition(this);
   }
   public double cond() {
      return new SingularValueDecomposition(this).cond();
   }
   public static Matrix constructWithCopy(double[][] A) {
      int m = A.length;
      int n = A[0].length;
      Matrix X = new Matrix(m, n);
      double[][] C = X.getArray();
      for (int i = 0; i < m; i++) {
         if (A[i].length != n) {
            throw new IllegalArgumentException("All rows must have the same length.");
         }
         for (int j = 0; j < n; j++) {
            C[i][j] = A[i][j];
         }
      }
      return X;
   }
   public Matrix copy() {
      Matrix X = new Matrix(this.m, this.n);
      double[][] C = X.getArray();
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            C[i][j] = this.A[i][j];
         }
      }
      return X;
   }
   public double det() {
      return new LUDecomposition(this).det();
   }
   public EigenvalueDecomposition eig() {
      return new EigenvalueDecomposition(this);
   }
   public double get(int i, int j) {
      return this.A[i][j];
   }
   public double[][] getArray() {
      return this.A;
   }
   public double[][] getArrayCopy() {
      double[][] C = new double[this.m][this.n];
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            C[i][j] = this.A[i][j];
         }
      }
      return C;
   }
   public int getColumnDimension() {
      return this.n;
   }
   public double[] getColumnPackedCopy() {
      double[] vals = new double[this.m * this.n];
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            vals[i + j * this.m] = this.A[i][j];
         }
      }
      return vals;
   }
   public Matrix getMatrix(int i0, int i1, int j0, int j1) {
      Matrix X = new Matrix(i1 - i0 + 1, j1 - j0 + 1);
      double[][] B = X.getArray();
      try {
         for (int i = i0; i <= i1; i++) {
            for (int j = j0; j <= j1; j++) {
               B[i - i0][j - j0] = this.A[i][j];
            }
         }
      }  catch (ArrayIndexOutOfBoundsException e) {
         throw new ArrayIndexOutOfBoundsException("Submatrix indices");
      }
      return X;
   }
   public Matrix getMatrix(int i0, int i1, int[] c) {
      Matrix X = new Matrix(i1 - i0 + 1, c.length);
      double[][] B = X.getArray();
      try {
         for (int i = i0; i <= i1; i++) {
            for (int j = 0; j < c.length; j++) {
               B[i - i0][j] = this.A[i][c[j]];
            }
         }
      }  catch (ArrayIndexOutOfBoundsException e) {
         throw new ArrayIndexOutOfBoundsException("Submatrix indices");
      }
      return X;
   }
   public Matrix getMatrix(int[] r, int j0, int j1) {
      Matrix X = new Matrix(r.length, j1 - j0 + 1);
      double[][] B = X.getArray();
      try {
         for (int i = 0; i < r.length; i++) {
            for (int j = j0; j <= j1; j++) {
               B[i][j - j0] = this.A[r[i]][j];
            }
         }
      }  catch (ArrayIndexOutOfBoundsException e) {
         throw new ArrayIndexOutOfBoundsException("Submatrix indices");
      }
      return X;
   }
   public Matrix getMatrix(int[] r, int[] c) {
      Matrix X = new Matrix(r.length, c.length);
      double[][] B = X.getArray();
      try {
         for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < c.length; j++) {
               B[i][j] = this.A[r[i]][c[j]];
            }
         }
      }  catch (ArrayIndexOutOfBoundsException e) {
         throw new ArrayIndexOutOfBoundsException("Submatrix indices");
      }
      return X;
   }
   public int getRowDimension() {
      return this.m;
   }
   public double[] getRowPackedCopy() {
      double[] vals = new double[this.m * this.n];
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            vals[i * this.n + j] = this.A[i][j];
         }
      }
      return vals;
   }
   public static Matrix identity(int m, int n) {
      Matrix A = new Matrix(m, n);
      double[][] X = A.getArray();
      for (int i = 0; i < m; i++) {
         for (int j = 0; j < n; j++) {
            X[i][j] = i == j ? 1.0 : 0.0;
         }
      }
      return A;
   }
   public Matrix inverse() {
      return solve(identity(this.m, this.m));
   }
   public double length() throws java.lang.IllegalArgumentException {
      double length;
      if (this.getColumnDimension() != 1) {
         throw new IllegalArgumentException("Vector Lengths can only be applied to vectors. There can only be one column.");
      }
      if (this.getRowDimension() != 3) {
         throw new IllegalArgumentException("The length method currently applies only to three dimensional vectors");
      }
      length = Math.sqrt(this.get(0, 0) * this.get(0, 0) + this.get(1, 0) * this.get(1, 0) + this.get(2, 0) * this.get(2, 0));
      return length;
   }
   public LUDecomposition lu() {
      return new LUDecomposition(this);
   }
   public Matrix minus(Matrix B) {
      checkMatrixDimensions(B);
      Matrix X = new Matrix(this.m, this.n);
      double[][] C = X.getArray();
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            C[i][j] = this.A[i][j] - B.A[i][j];
         }
      }
      return X;
   }
   public Matrix minusEquals(Matrix B) {
      checkMatrixDimensions(B);
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            this.A[i][j] = this.A[i][j] - B.A[i][j];
         }
      }
      return this;
   }
   public double norm1() {
      double f = 0;
      for (int j = 0; j < this.n; j++) {
         double s = 0;
         for (int i = 0; i < this.m; i++) {
            s += Math.abs(this.A[i][j]);
         }
         f = Math.max(f, s);
      }
      return f;
   }
   public double norm2() {
      return new SingularValueDecomposition(this).norm2();
   }
   public double normF() {
      double f = 0;
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            f = Maths.hypot(f, this.A[i][j]);
         }
      }
      return f;
   }
   public double normInf() {
      double f = 0;
      for (int i = 0; i < this.m; i++) {
         double s = 0;
         for (int j = 0; j < this.n; j++) {
            s += Math.abs(this.A[i][j]);
         }
         f = Math.max(f, s);
      }
      return f;
   }
   public Matrix plus(Matrix B) {
      checkMatrixDimensions(B);
      Matrix X = new Matrix(this.m, this.n);
      double[][] C = X.getArray();
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            C[i][j] = this.A[i][j] + B.A[i][j];
         }
      }
      return X;
   }
   public Matrix plusEquals(Matrix B) {
      checkMatrixDimensions(B);
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            this.A[i][j] = this.A[i][j] + B.A[i][j];
         }
      }
      return this;
   }
   public void print(int w, int d) {
      print(new PrintWriter(System.out, true), w, d);
   }
   public void print(PrintWriter output, int w, int d) {
      DecimalFormat format = new DecimalFormat();
      format.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
      format.setMinimumIntegerDigits(1);
      format.setMaximumFractionDigits(d);
      format.setMinimumFractionDigits(d);
      format.setGroupingUsed(false);
      print(output, format, w + 2);
   }
   public void print(PrintWriter output, NumberFormat format, int width) {
      output.println();
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            String s = format.format(this.A[i][j]);
            int padding = Math.max(1, width - s.length());
            for (int k = 0; k < padding; k++) {
               output.print(' ');
            }
            output.print(s);
         }
         output.println();
      }
      output.println();
   }
   public void print(NumberFormat format, int width) {
      print(new PrintWriter(System.out, true), format, width);
   }
   public QRDecomposition qr() {
      return new QRDecomposition(this);
   }
   public static Matrix random(int m, int n) {
      Matrix A = new Matrix(m, n);
      double[][] X = A.getArray();
      for (int i = 0; i < m; i++) {
         for (int j = 0; j < n; j++) {
            X[i][j] = Math.random();
         }
      }
      return A;
   }
   public int rank() {
      return new SingularValueDecomposition(this).rank();
   }
   public static Matrix read(BufferedReader input) throws java.io.IOException {
      StreamTokenizer tokenizer = new StreamTokenizer(input);
      tokenizer.resetSyntax();
      tokenizer.wordChars(0, 255);
      tokenizer.whitespaceChars(0, ' ');
      tokenizer.eolIsSignificant(true);
      java.util.Vector v = new java.util.Vector();
      while (tokenizer.nextToken() == StreamTokenizer.TT_EOL) {
         {
         }
      }
      if (tokenizer.ttype == StreamTokenizer.TT_EOF) {
         throw new java.io.IOException("Unexpected EOF on matrix read.");
      }
      do {
         v.addElement(Double.valueOf(tokenizer.sval));
      }       while (tokenizer.nextToken() == StreamTokenizer.TT_WORD);
      int n = v.size();
      double[] row = new double[n];
      for (int j = 0; j < n; j++) {
         row[j] = ((Double)v.elementAt(j)).doubleValue();
      }
      v.removeAllElements();
      v.addElement(row);
      while (tokenizer.nextToken() == StreamTokenizer.TT_WORD) {
         v.addElement(row = new double[n]);
         int j = 0;
         do {
            if (j >= n) {
               throw new java.io.IOException("Row " + v.size() + " is too long.");
            }
            row[j++] = Double.valueOf(tokenizer.sval).doubleValue();
         }          while (tokenizer.nextToken() == StreamTokenizer.TT_WORD);
         if (j < n) {
            throw new java.io.IOException("Row " + v.size() + " is too short.");
         }
      }
      int m = v.size();
      double[][] A = new double[m][];
      v.copyInto(A);
      return new Matrix(A);
   }
   public void set(int i, int j, double s) {
      this.A[i][j] = s;
   }
   public void setMatrix(Matrix X) {
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            this.A[i][j] = X.get(i, j);
         }
      }
   }
   public void setMatrix(int i0, int i1, int j0, int j1, Matrix X) {
      try {
         for (int i = i0; i <= i1; i++) {
            for (int j = j0; j <= j1; j++) {
               this.A[i][j] = X.get(i - i0, j - j0);
            }
         }
      }  catch (ArrayIndexOutOfBoundsException e) {
         throw new ArrayIndexOutOfBoundsException("Submatrix indices");
      }
   }
   public void setMatrix(int i0, int i1, int[] c, Matrix X) {
      try {
         for (int i = i0; i <= i1; i++) {
            for (int j = 0; j < c.length; j++) {
               this.A[i][c[j]] = X.get(i - i0, j);
            }
         }
      }  catch (ArrayIndexOutOfBoundsException e) {
         throw new ArrayIndexOutOfBoundsException("Submatrix indices");
      }
   }
   public void setMatrix(int[] r, int j0, int j1, Matrix X) {
      try {
         for (int i = 0; i < r.length; i++) {
            for (int j = j0; j <= j1; j++) {
               this.A[r[i]][j] = X.get(i, j - j0);
            }
         }
      }  catch (ArrayIndexOutOfBoundsException e) {
         throw new ArrayIndexOutOfBoundsException("Submatrix indices");
      }
   }
   public void setMatrix(int[] r, int[] c, Matrix X) {
      try {
         for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < c.length; j++) {
               this.A[r[i]][c[j]] = X.get(i, j);
            }
         }
      }  catch (ArrayIndexOutOfBoundsException e) {
         throw new ArrayIndexOutOfBoundsException("Submatrix indices");
      }
   }
   public Matrix solve(Matrix B) {
      return this.m == this.n ? new LUDecomposition(this).solve(B) : new QRDecomposition(this).solve(B);
   }
   public Matrix solveTranspose(Matrix B) {
      return transpose().solve(B.transpose());
   }
   public SingularValueDecomposition svd() {
      return new SingularValueDecomposition(this);
   }
   public Matrix times(double s) {
      Matrix X = new Matrix(this.m, this.n);
      double[][] C = X.getArray();
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            C[i][j] = s * this.A[i][j];
         }
      }
      return X;
   }
   public Matrix times(Matrix B) {
      if (B.m != this.n) {
         throw new IllegalArgumentException("Matrix inner dimensions must agree.");
      }
      Matrix X = new Matrix(this.m, B.n);
      double[][] C = X.getArray();
      double[] Bcolj = new double[this.n];
      for (int j = 0; j < B.n; j++) {
         for (int k = 0; k < this.n; k++) {
            Bcolj[k] = B.A[k][j];
         }
         for (int i = 0; i < this.m; i++) {
            double[] Arowi = this.A[i];
            double s = 0;
            for (int k = 0; k < this.n; k++) {
               s += Arowi[k] * Bcolj[k];
            }
            C[i][j] = s;
         }
      }
      return X;
   }
   public Matrix timesEquals(double s) {
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            this.A[i][j] = s * this.A[i][j];
         }
      }
      return this;
   }
   public double trace() {
      double t = 0;
      for (int i = 0; i < Math.min(this.m, this.n); i++) {
         t += this.A[i][i];
      }
      return t;
   }
   public Matrix transpose() {
      Matrix X = new Matrix(this.n, this.m);
      double[][] C = X.getArray();
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            C[j][i] = this.A[i][j];
         }
      }
      return X;
   }
   public Matrix uminus() {
      Matrix X = new Matrix(this.m, this.n);
      double[][] C = X.getArray();
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            C[i][j] = -this.A[i][j];
         }
      }
      return X;
   }
   public Matrix vectorProduct(Jama.Matrix B) throws java.lang.IllegalArgumentException {
      Matrix result_vector = new Matrix(3, 1);
      if (B.getColumnDimension() != 1 || this.getColumnDimension() != 1) {
         throw new IllegalArgumentException("Vector Products can only be applied to vectors. There can only be one column.");
      }
      if (B.getRowDimension() != 3 || this.getRowDimension() != 3) {
         throw new IllegalArgumentException("Matrix inner dimensions must agree.");
      }
      result_vector.set(0, 0, this.get(1, 0) * B.get(2, 0) - B.get(1, 0) * this.get(2, 0));
      result_vector.set(1, 0, this.get(2, 0) * B.get(0, 0) - B.get(2, 0) * this.get(0, 0));
      result_vector.set(2, 0, this.get(0, 0) * B.get(1, 0) - B.get(0, 0) * this.get(1, 0));
      return result_vector;
   }
   public void appendTo(ToString s) {
      s.append("A", this.A);
   }
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Matrix copy = (Matrix)_copy;
      if (this.n != copy.n) {
         throw new AssertionError("Matrix dimension has changed");
      }
      if (this.m != copy.m) {
         throw new AssertionError("Matrix dimension has changed");
      }
      for (int row = 0; row < getRowDimension(); row++) {
         for (int col = 0; col < getColumnDimension(); col++) {
            if (po.writeDiff(this.get(row, col) - copy.get(row, col), 0.0)) {
               copy.set(row, col, this.get(row, col));
            }
         }
      }
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Matrix copy = (Matrix)_copy;
      if (this.n != copy.n) {
         throw new AssertionError("Matrix dimension has changed");
      }
      if (this.m != copy.m) {
         throw new AssertionError("Matrix dimension has changed");
      }
      for (int row = 0; row < getRowDimension(); row++) {
         for (int col = 0; col < getColumnDimension(); col++) {
            if (pi.hasDiff()) {
               double dd = pi.getDiffAsDouble();
               this.set(row, col, this.get(row, col) + dd);
               copy.set(row, col, copy.get(row, col) + dd);
            }
         }
      }
   }
   public Object clone() {
      return copy();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new Matrix(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((Matrix)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Matrix)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Matrix)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         Matrix c = ((Matrix)orig).copy();
         _helper.add(id, c);
         return c;
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         return false;
      }
      public Class getType() {
         return Matrix.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return Jama.Matrix.TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int;
   public Matrix(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super();
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      _stream.request(Matrix._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.n = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.m = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      _stream.accept(Matrix._SIZE);
      this.A = uka.transport.ValueIO.readValueArrayArrayDouble(_stream);
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      _stream.reserve(Matrix._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.n);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.m);
      _stream.deliver(Jama.Matrix._SIZE);
      uka.transport.ValueIO.writeValue(_stream, this.A);
   }
   public Object flatClone() {
      return copy();
   }
}
