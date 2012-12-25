package Jama;
import Jama.util.*;

public class SingularValueDecomposition implements uka.patch.Patchable, uka.transport.Transportable, java.io.Serializable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      SingularValueDecomposition copy = (SingularValueDecomposition)_copy;
      if (po.writeDiff(this.n, copy.n)) copy.n = this.n;
      if (po.writeDiff(this.m, copy.m)) copy.m = this.m;
      copy.s = this.s = (double[])po.writeDiff(this.s, copy.s);
      copy.V = this.V = (double[][])po.writeDiff(this.V, copy.V);
      copy.U = this.U = (double[][])po.writeDiff(this.U, copy.U);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      SingularValueDecomposition copy = (SingularValueDecomposition)_copy;
      if (pi.hasDiff()) copy.n = this.n = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.m = this.m = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.s = this.s = (double[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.V = this.V = (double[][])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.U = this.U = (double[][])pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      c.descend(this.s);
      c.descend(this.V);
      c.descend(this.U);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      this.s = (double[])f.filter(this.s);
      this.V = (double[][])f.filter(this.V);
      this.U = (double[][])f.filter(this.U);
   }
   public Object flatClone() {
      try {
         return super.clone();
      }  catch (CloneNotSupportedException ex) {
         throw new AssertionError("Declared Cloneable but clone() is still unsupported");
      }
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new SingularValueDecomposition(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((SingularValueDecomposition)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((SingularValueDecomposition)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((SingularValueDecomposition)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new SingularValueDecomposition((SingularValueDecomposition)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((SingularValueDecomposition)copy).deepCloneReferences((SingularValueDecomposition)orig, _helper);
         return false;
      }
      public Class getType() {
         return SingularValueDecomposition.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int;
   public SingularValueDecomposition(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      _stream.request(SingularValueDecomposition._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.n = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.m = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      _stream.accept(SingularValueDecomposition._SIZE);
      this.s = (double[])_stream.readReference();
      this.V = (double[][])_stream.readReference();
      this.U = (double[][])_stream.readReference();
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      _stream.reserve(SingularValueDecomposition._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.n);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.m);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.s);
      _stream.writeReference(this.V);
      _stream.writeReference(this.U);
   }
   public SingularValueDecomposition(SingularValueDecomposition _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
      this.n = _orig.n;
      this.m = _orig.m;
   }
   public void deepCloneReferences(SingularValueDecomposition _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      this.s = (double[])_helper.internalDeepClone(_orig.s);
      this.V = (double[][])_helper.internalDeepClone(_orig.V);
      this.U = (double[][])_helper.internalDeepClone(_orig.U);
   }
   private double[][] U;
   private double[][] V;
   private double[] s;
   private int m;
   private int n;
   public SingularValueDecomposition(Matrix Arg) {
      super();
      double[][] A = Arg.getArrayCopy();
      this.m = Arg.getRowDimension();
      this.n = Arg.getColumnDimension();
      int nu = Math.min(this.m, this.n);
      this.s = new double[Math.min(this.m + 1, this.n)];
      this.U = new double[this.m][nu];
      this.V = new double[this.n][this.n];
      double[] e = new double[this.n];
      double[] work = new double[this.m];
      boolean wantu = true;
      boolean wantv = true;
      int nct = Math.min(this.m - 1, this.n);
      int nrt = Math.max(0, Math.min(this.n - 2, this.m));
      for (int k = 0; k < Math.max(nct, nrt); k++) {
         if (k < nct) {
            this.s[k] = 0;
            for (int i = k; i < this.m; i++) {
               this.s[k] = Maths.hypot(this.s[k], A[i][k]);
            }
            if (this.s[k] != 0.0) {
               if (A[k][k] < 0.0) {
                  this.s[k] = -this.s[k];
               }
               for (int i = k; i < this.m; i++) {
                  A[i][k] /= this.s[k];
               }
               A[k][k] += 1.0;
            }
            this.s[k] = -this.s[k];
         }
         for (int j = k + 1; j < this.n; j++) {
            if (k < nct & this.s[k] != 0.0) {
               double t = 0;
               for (int i = k; i < this.m; i++) {
                  t += A[i][k] * A[i][j];
               }
               t = -t / A[k][k];
               for (int i = k; i < this.m; i++) {
                  A[i][j] += t * A[i][k];
               }
            }
            e[j] = A[k][j];
         }
         if (wantu & k < nct) {
            for (int i = k; i < this.m; i++) {
               this.U[i][k] = A[i][k];
            }
         }
         if (k < nrt) {
            e[k] = 0;
            for (int i = k + 1; i < this.n; i++) {
               e[k] = Maths.hypot(e[k], e[i]);
            }
            if (e[k] != 0.0) {
               if (e[k + 1] < 0.0) {
                  e[k] = -e[k];
               }
               for (int i = k + 1; i < this.n; i++) {
                  e[i] /= e[k];
               }
               e[k + 1] += 1.0;
            }
            e[k] = -e[k];
            if (k + 1 < this.m & e[k] != 0.0) {
               for (int i = k + 1; i < this.m; i++) {
                  work[i] = 0.0;
               }
               for (int j = k + 1; j < this.n; j++) {
                  for (int i = k + 1; i < this.m; i++) {
                     work[i] += e[j] * A[i][j];
                  }
               }
               for (int j = k + 1; j < this.n; j++) {
                  double t = -e[j] / e[k + 1];
                  for (int i = k + 1; i < this.m; i++) {
                     A[i][j] += t * work[i];
                  }
               }
            }
            if (wantv) {
               for (int i = k + 1; i < this.n; i++) {
                  this.V[i][k] = e[i];
               }
            }
         }
      }
      int p = Math.min(this.n, this.m + 1);
      if (nct < this.n) {
         this.s[nct] = A[nct][nct];
      }
      if (this.m < p) {
         this.s[p - 1] = 0.0;
      }
      if (nrt + 1 < p) {
         e[nrt] = A[nrt][p - 1];
      }
      e[p - 1] = 0.0;
      if (wantu) {
         for (int j = nct; j < nu; j++) {
            for (int i = 0; i < this.m; i++) {
               this.U[i][j] = 0.0;
            }
            this.U[j][j] = 1.0;
         }
         for (int k = nct - 1; k >= 0; k--) {
            if (this.s[k] != 0.0) {
               for (int j = k + 1; j < nu; j++) {
                  double t = 0;
                  for (int i = k; i < this.m; i++) {
                     t += this.U[i][k] * this.U[i][j];
                  }
                  t = -t / this.U[k][k];
                  for (int i = k; i < this.m; i++) {
                     this.U[i][j] += t * this.U[i][k];
                  }
               }
               for (int i = k; i < this.m; i++) {
                  this.U[i][k] = -this.U[i][k];
               }
               this.U[k][k] = 1.0 + this.U[k][k];
               for (int i = 0; i < k - 1; i++) {
                  this.U[i][k] = 0.0;
               }
            } else {
               for (int i = 0; i < this.m; i++) {
                  this.U[i][k] = 0.0;
               }
               this.U[k][k] = 1.0;
            }
         }
      }
      if (wantv) {
         for (int k = this.n - 1; k >= 0; k--) {
            if (k < nrt & e[k] != 0.0) {
               for (int j = k + 1; j < nu; j++) {
                  double t = 0;
                  for (int i = k + 1; i < this.n; i++) {
                     t += this.V[i][k] * this.V[i][j];
                  }
                  t = -t / this.V[k + 1][k];
                  for (int i = k + 1; i < this.n; i++) {
                     this.V[i][j] += t * this.V[i][k];
                  }
               }
            }
            for (int i = 0; i < this.n; i++) {
               this.V[i][k] = 0.0;
            }
            this.V[k][k] = 1.0;
         }
      }
      int pp = p - 1;
      int iter = 0;
      double eps = Math.pow(2.0, -52.0);
      while (p > 0) {
         int k;
         int kase;
         for (k = p - 2; k >= -1; k--) {
            if (k == -1) {
               break;
            }
            if (Math.abs(e[k]) <= eps * (Math.abs(this.s[k]) + Math.abs(this.s[k + 1]))) {
               e[k] = 0.0;
               break;
            }
         }
         if (k == p - 2) {
            kase = 4;
         } else {
            int ks;
            for (ks = p - 1; ks >= k; ks--) {
               if (ks == k) {
                  break;
               }
               double t = (ks != p ? Math.abs(e[ks]) : 0.0) + (ks != k + 1 ? Math.abs(e[ks - 1]) : 0.0);
               if (Math.abs(this.s[ks]) <= eps * t) {
                  this.s[ks] = 0.0;
                  break;
               }
            }
            if (ks == k) {
               kase = 3;
            } else if (ks == p - 1) {
               kase = 1;
            } else {
               kase = 2;
               k = ks;
            }
         }
         k++;
         switch (kase) {
         case 1: 
            {
               double f = e[p - 2];
               e[p - 2] = 0.0;
               for (int j = p - 2; j >= k; j--) {
                  double t = Maths.hypot(this.s[j], f);
                  double cs = this.s[j] / t;
                  double sn = f / t;
                  this.s[j] = t;
                  if (j != k) {
                     f = -sn * e[j - 1];
                     e[j - 1] = cs * e[j - 1];
                  }
                  if (wantv) {
                     for (int i = 0; i < this.n; i++) {
                        t = cs * this.V[i][j] + sn * this.V[i][p - 1];
                        this.V[i][p - 1] = -sn * this.V[i][j] + cs * this.V[i][p - 1];
                        this.V[i][j] = t;
                     }
                  }
               }
            }
            break;
         
         case 2: 
            {
               double f = e[k - 1];
               e[k - 1] = 0.0;
               for (int j = k; j < p; j++) {
                  double t = Maths.hypot(this.s[j], f);
                  double cs = this.s[j] / t;
                  double sn = f / t;
                  this.s[j] = t;
                  f = -sn * e[j];
                  e[j] = cs * e[j];
                  if (wantu) {
                     for (int i = 0; i < this.m; i++) {
                        t = cs * this.U[i][j] + sn * this.U[i][k - 1];
                        this.U[i][k - 1] = -sn * this.U[i][j] + cs * this.U[i][k - 1];
                        this.U[i][j] = t;
                     }
                  }
               }
            }
            break;
         
         case 3: 
            {
               double scale = Math.max(Math.max(Math.max(Math.max(Math.abs(this.s[p - 1]), Math.abs(this.s[p - 2])), Math.abs(e[p - 2])), Math.abs(this.s[k])), Math.abs(e[k]));
               double sp = this.s[p - 1] / scale;
               double spm1 = this.s[p - 2] / scale;
               double epm1 = e[p - 2] / scale;
               double sk = this.s[k] / scale;
               double ek = e[k] / scale;
               double b = ((spm1 + sp) * (spm1 - sp) + epm1 * epm1) / 2.0;
               double c = sp * epm1 * (sp * epm1);
               double shift = 0.0;
               if (b != 0.0 | c != 0.0) {
                  shift = Math.sqrt(b * b + c);
                  if (b < 0.0) {
                     shift = -shift;
                  }
                  shift = c / (b + shift);
               }
               double f = (sk + sp) * (sk - sp) + shift;
               double g = sk * ek;
               for (int j = k; j < p - 1; j++) {
                  double t = Maths.hypot(f, g);
                  double cs = f / t;
                  double sn = g / t;
                  if (j != k) {
                     e[j - 1] = t;
                  }
                  f = cs * this.s[j] + sn * e[j];
                  e[j] = cs * e[j] - sn * this.s[j];
                  g = sn * this.s[j + 1];
                  this.s[j + 1] = cs * this.s[j + 1];
                  if (wantv) {
                     for (int i = 0; i < this.n; i++) {
                        t = cs * this.V[i][j] + sn * this.V[i][j + 1];
                        this.V[i][j + 1] = -sn * this.V[i][j] + cs * this.V[i][j + 1];
                        this.V[i][j] = t;
                     }
                  }
                  t = Maths.hypot(f, g);
                  cs = f / t;
                  sn = g / t;
                  this.s[j] = t;
                  f = cs * e[j] + sn * this.s[j + 1];
                  this.s[j + 1] = -sn * e[j] + cs * this.s[j + 1];
                  g = sn * e[j + 1];
                  e[j + 1] = cs * e[j + 1];
                  if (wantu && j < this.m - 1) {
                     for (int i = 0; i < this.m; i++) {
                        t = cs * this.U[i][j] + sn * this.U[i][j + 1];
                        this.U[i][j + 1] = -sn * this.U[i][j] + cs * this.U[i][j + 1];
                        this.U[i][j] = t;
                     }
                  }
               }
               e[p - 2] = f;
               iter = iter + 1;
            }
            break;
         
         case 4: 
            {
               if (this.s[k] <= 0.0) {
                  this.s[k] = this.s[k] < 0.0 ? -this.s[k] : 0.0;
                  if (wantv) {
                     for (int i = 0; i <= pp; i++) {
                        this.V[i][k] = -this.V[i][k];
                     }
                  }
               }
               while (k < pp) {
                  if (this.s[k] >= this.s[k + 1]) {
                     break;
                  }
                  double t = this.s[k];
                  this.s[k] = this.s[k + 1];
                  this.s[k + 1] = t;
                  if (wantv && k < this.n - 1) {
                     for (int i = 0; i < this.n; i++) {
                        t = this.V[i][k + 1];
                        this.V[i][k + 1] = this.V[i][k];
                        this.V[i][k] = t;
                     }
                  }
                  if (wantu && k < this.m - 1) {
                     for (int i = 0; i < this.m; i++) {
                        t = this.U[i][k + 1];
                        this.U[i][k + 1] = this.U[i][k];
                        this.U[i][k] = t;
                     }
                  }
                  k++;
               }
               iter = 0;
               p--;
            }
            break;
         
         }
      }
   }
   public double cond() {
      return this.s[0] / this.s[Math.min(this.m, this.n) - 1];
   }
   public Matrix getS() {
      Matrix X = new Matrix(this.n, this.n);
      double[][] S = X.getArray();
      for (int i = 0; i < this.n; i++) {
         for (int j = 0; j < this.n; j++) {
            S[i][j] = 0.0;
         }
         S[i][i] = this.s[i];
      }
      return X;
   }
   public double[] getSingularValues() {
      return this.s;
   }
   public Matrix getU() {
      return new Matrix(this.U, this.m, Math.min(this.m + 1, this.n));
   }
   public Matrix getV() {
      return new Matrix(this.V, this.n, this.n);
   }
   public double norm2() {
      return this.s[0];
   }
   public int rank() {
      double eps = Math.pow(2.0, -52.0);
      double tol = Math.max(this.m, this.n) * this.s[0] * eps;
      int r = 0;
      for (int i = 0; i < this.s.length; i++) {
         if (this.s[i] > tol) {
            r++;
         }
      }
      return r;
   }
}
