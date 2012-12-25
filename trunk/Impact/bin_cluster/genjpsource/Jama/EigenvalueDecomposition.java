package Jama;
import Jama.util.*;

public class EigenvalueDecomposition implements uka.patch.Patchable, uka.transport.Transportable, java.io.Serializable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      EigenvalueDecomposition copy = (EigenvalueDecomposition)_copy;
      if (po.writeDiff(this.issymmetric, copy.issymmetric)) copy.issymmetric = this.issymmetric;
      if (po.writeDiff(this.n, copy.n)) copy.n = this.n;
      copy.ort = this.ort = (double[])po.writeDiff(this.ort, copy.ort);
      copy.H = this.H = (double[][])po.writeDiff(this.H, copy.H);
      copy.V = this.V = (double[][])po.writeDiff(this.V, copy.V);
      copy.e = this.e = (double[])po.writeDiff(this.e, copy.e);
      copy.d = this.d = (double[])po.writeDiff(this.d, copy.d);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      EigenvalueDecomposition copy = (EigenvalueDecomposition)_copy;
      if (pi.hasDiff()) copy.issymmetric = this.issymmetric = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.n = this.n = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.ort = this.ort = (double[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.H = this.H = (double[][])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.V = this.V = (double[][])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.e = this.e = (double[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.d = this.d = (double[])pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      c.descend(this.ort);
      c.descend(this.H);
      c.descend(this.V);
      c.descend(this.e);
      c.descend(this.d);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      this.ort = (double[])f.filter(this.ort);
      this.H = (double[][])f.filter(this.H);
      this.V = (double[][])f.filter(this.V);
      this.e = (double[])f.filter(this.e);
      this.d = (double[])f.filter(this.d);
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
         return new EigenvalueDecomposition(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((EigenvalueDecomposition)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((EigenvalueDecomposition)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((EigenvalueDecomposition)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new EigenvalueDecomposition((EigenvalueDecomposition)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((EigenvalueDecomposition)copy).deepCloneReferences((EigenvalueDecomposition)orig, _helper);
         return false;
      }
      public Class getType() {
         return EigenvalueDecomposition.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_int;
   public EigenvalueDecomposition(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      _stream.request(EigenvalueDecomposition._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.issymmetric = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.n = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      _stream.accept(EigenvalueDecomposition._SIZE);
      this.ort = (double[])_stream.readReference();
      this.H = (double[][])_stream.readReference();
      this.V = (double[][])_stream.readReference();
      this.e = (double[])_stream.readReference();
      this.d = (double[])_stream.readReference();
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      _stream.reserve(EigenvalueDecomposition._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.issymmetric);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.n);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.ort);
      _stream.writeReference(this.H);
      _stream.writeReference(this.V);
      _stream.writeReference(this.e);
      _stream.writeReference(this.d);
   }
   public EigenvalueDecomposition(EigenvalueDecomposition _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
      this.issymmetric = _orig.issymmetric;
      this.n = _orig.n;
   }
   public void deepCloneReferences(EigenvalueDecomposition _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      this.ort = (double[])_helper.internalDeepClone(_orig.ort);
      this.H = (double[][])_helper.internalDeepClone(_orig.H);
      this.V = (double[][])_helper.internalDeepClone(_orig.V);
      this.e = (double[])_helper.internalDeepClone(_orig.e);
      this.d = (double[])_helper.internalDeepClone(_orig.d);
   }
   private int n;
   private boolean issymmetric;
   private double[] d;
   private double[] e;
   private double[][] V;
   private double[][] H;
   private double[] ort;
   private transient double cdivr;
   private transient double cdivi;
   public EigenvalueDecomposition(Matrix Arg) {
      super();
      double[][] A = Arg.getArray();
      this.n = Arg.getColumnDimension();
      this.V = new double[this.n][this.n];
      this.d = new double[this.n];
      this.e = new double[this.n];
      this.issymmetric = true;
      for (int j = 0; j < this.n & this.issymmetric; j++) {
         for (int i = 0; i < this.n & this.issymmetric; i++) {
            this.issymmetric = A[i][j] == A[j][i];
         }
      }
      if (this.issymmetric) {
         for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.n; j++) {
               this.V[i][j] = A[i][j];
            }
         }
         tred2();
         tql2();
      } else {
         this.H = new double[this.n][this.n];
         this.ort = new double[this.n];
         for (int j = 0; j < this.n; j++) {
            for (int i = 0; i < this.n; i++) {
               this.H[i][j] = A[i][j];
            }
         }
         orthes();
         hqr2();
      }
   }
   private void cdiv(double xr, double xi, double yr, double yi) {
      double r;
      double d;
      if (Math.abs(yr) > Math.abs(yi)) {
         r = yi / yr;
         d = yr + r * yi;
         this.cdivr = (xr + r * xi) / d;
         this.cdivi = (xi - r * xr) / d;
      } else {
         r = yr / yi;
         d = yi + r * yr;
         this.cdivr = (r * xr + xi) / d;
         this.cdivi = (r * xi - xr) / d;
      }
   }
   public Matrix getD() {
      Matrix X = new Matrix(this.n, this.n);
      double[][] D = X.getArray();
      for (int i = 0; i < this.n; i++) {
         for (int j = 0; j < this.n; j++) {
            D[i][j] = 0.0;
         }
         D[i][i] = this.d[i];
         if (this.e[i] > 0) {
            D[i][i + 1] = this.e[i];
         } else if (this.e[i] < 0) {
            D[i][i - 1] = this.e[i];
         }
      }
      return X;
   }
   public double[] getImagEigenvalues() {
      return this.e;
   }
   public double[] getRealEigenvalues() {
      return this.d;
   }
   public Matrix getV() {
      return new Matrix(this.V, this.n, this.n);
   }
   private void hqr2() {
      int nn = this.n;
      int n = nn - 1;
      int low = 0;
      int high = nn - 1;
      double eps = Math.pow(2.0, -52.0);
      double exshift = 0.0;
      double p = 0;
      double q = 0;
      double r = 0;
      double s = 0;
      double z = 0;
      double t;
      double w;
      double x;
      double y;
      double norm = 0.0;
      for (int i = 0; i < nn; i++) {
         if (i < low | i > high) {
            this.d[i] = this.H[i][i];
            this.e[i] = 0.0;
         }
         for (int j = Math.max(i - 1, 0); j < nn; j++) {
            norm = norm + Math.abs(this.H[i][j]);
         }
      }
      int iter = 0;
      while (n >= low) {
         int l = n;
         while (l > low) {
            s = Math.abs(this.H[l - 1][l - 1]) + Math.abs(this.H[l][l]);
            if (s == 0.0) {
               s = norm;
            }
            if (Math.abs(this.H[l][l - 1]) < eps * s) {
               break;
            }
            l--;
         }
         if (l == n) {
            this.H[n][n] = this.H[n][n] + exshift;
            this.d[n] = this.H[n][n];
            this.e[n] = 0.0;
            n--;
            iter = 0;
         } else if (l == n - 1) {
            w = this.H[n][n - 1] * this.H[n - 1][n];
            p = (this.H[n - 1][n - 1] - this.H[n][n]) / 2.0;
            q = p * p + w;
            z = Math.sqrt(Math.abs(q));
            this.H[n][n] = this.H[n][n] + exshift;
            this.H[n - 1][n - 1] = this.H[n - 1][n - 1] + exshift;
            x = this.H[n][n];
            if (q >= 0) {
               if (p >= 0) {
                  z = p + z;
               } else {
                  z = p - z;
               }
               this.d[n - 1] = x + z;
               this.d[n] = this.d[n - 1];
               if (z != 0.0) {
                  this.d[n] = x - w / z;
               }
               this.e[n - 1] = 0.0;
               this.e[n] = 0.0;
               x = this.H[n][n - 1];
               s = Math.abs(x) + Math.abs(z);
               p = x / s;
               q = z / s;
               r = Math.sqrt(p * p + q * q);
               p = p / r;
               q = q / r;
               for (int j = n - 1; j < nn; j++) {
                  z = this.H[n - 1][j];
                  this.H[n - 1][j] = q * z + p * this.H[n][j];
                  this.H[n][j] = q * this.H[n][j] - p * z;
               }
               for (int i = 0; i <= n; i++) {
                  z = this.H[i][n - 1];
                  this.H[i][n - 1] = q * z + p * this.H[i][n];
                  this.H[i][n] = q * this.H[i][n] - p * z;
               }
               for (int i = low; i <= high; i++) {
                  z = this.V[i][n - 1];
                  this.V[i][n - 1] = q * z + p * this.V[i][n];
                  this.V[i][n] = q * this.V[i][n] - p * z;
               }
            } else {
               this.d[n - 1] = x + p;
               this.d[n] = x + p;
               this.e[n - 1] = z;
               this.e[n] = -z;
            }
            n = n - 2;
            iter = 0;
         } else {
            x = this.H[n][n];
            y = 0.0;
            w = 0.0;
            if (l < n) {
               y = this.H[n - 1][n - 1];
               w = this.H[n][n - 1] * this.H[n - 1][n];
            }
            if (iter == 10) {
               exshift += x;
               for (int i = low; i <= n; i++) {
                  this.H[i][i] -= x;
               }
               s = Math.abs(this.H[n][n - 1]) + Math.abs(this.H[n - 1][n - 2]);
               x = y = 0.75 * s;
               w = -0.4375 * s * s;
            }
            if (iter == 30) {
               s = (y - x) / 2.0;
               s = s * s + w;
               if (s > 0) {
                  s = Math.sqrt(s);
                  if (y < x) {
                     s = -s;
                  }
                  s = x - w / ((y - x) / 2.0 + s);
                  for (int i = low; i <= n; i++) {
                     this.H[i][i] -= s;
                  }
                  exshift += s;
                  x = y = w = 0.964;
               }
            }
            iter = iter + 1;
            int m = n - 2;
            while (m >= l) {
               z = this.H[m][m];
               r = x - z;
               s = y - z;
               p = (r * s - w) / this.H[m + 1][m] + this.H[m][m + 1];
               q = this.H[m + 1][m + 1] - z - r - s;
               r = this.H[m + 2][m + 1];
               s = Math.abs(p) + Math.abs(q) + Math.abs(r);
               p = p / s;
               q = q / s;
               r = r / s;
               if (m == l) {
                  break;
               }
               if (Math.abs(this.H[m][m - 1]) * (Math.abs(q) + Math.abs(r)) < eps * (Math.abs(p) * (Math.abs(this.H[m - 1][m - 1]) + Math.abs(z) + Math.abs(this.H[m + 1][m + 1])))) {
                  break;
               }
               m--;
            }
            for (int i = m + 2; i <= n; i++) {
               this.H[i][i - 2] = 0.0;
               if (i > m + 2) {
                  this.H[i][i - 3] = 0.0;
               }
            }
            for (int k = m; k <= n - 1; k++) {
               boolean notlast = k != n - 1;
               if (k != m) {
                  p = this.H[k][k - 1];
                  q = this.H[k + 1][k - 1];
                  r = notlast ? this.H[k + 2][k - 1] : 0.0;
                  x = Math.abs(p) + Math.abs(q) + Math.abs(r);
                  if (x != 0.0) {
                     p = p / x;
                     q = q / x;
                     r = r / x;
                  }
               }
               if (x == 0.0) {
                  break;
               }
               s = Math.sqrt(p * p + q * q + r * r);
               if (p < 0) {
                  s = -s;
               }
               if (s != 0) {
                  if (k != m) {
                     this.H[k][k - 1] = -s * x;
                  } else if (l != m) {
                     this.H[k][k - 1] = -this.H[k][k - 1];
                  }
                  p = p + s;
                  x = p / s;
                  y = q / s;
                  z = r / s;
                  q = q / p;
                  r = r / p;
                  for (int j = k; j < nn; j++) {
                     p = this.H[k][j] + q * this.H[k + 1][j];
                     if (notlast) {
                        p = p + r * this.H[k + 2][j];
                        this.H[k + 2][j] = this.H[k + 2][j] - p * z;
                     }
                     this.H[k][j] = this.H[k][j] - p * x;
                     this.H[k + 1][j] = this.H[k + 1][j] - p * y;
                  }
                  for (int i = 0; i <= Math.min(n, k + 3); i++) {
                     p = x * this.H[i][k] + y * this.H[i][k + 1];
                     if (notlast) {
                        p = p + z * this.H[i][k + 2];
                        this.H[i][k + 2] = this.H[i][k + 2] - p * r;
                     }
                     this.H[i][k] = this.H[i][k] - p;
                     this.H[i][k + 1] = this.H[i][k + 1] - p * q;
                  }
                  for (int i = low; i <= high; i++) {
                     p = x * this.V[i][k] + y * this.V[i][k + 1];
                     if (notlast) {
                        p = p + z * this.V[i][k + 2];
                        this.V[i][k + 2] = this.V[i][k + 2] - p * r;
                     }
                     this.V[i][k] = this.V[i][k] - p;
                     this.V[i][k + 1] = this.V[i][k + 1] - p * q;
                  }
               }
            }
         }
      }
      if (norm == 0.0) {
         return;
      }
      for (n = nn - 1; n >= 0; n--) {
         p = this.d[n];
         q = this.e[n];
         if (q == 0) {
            int l = n;
            this.H[n][n] = 1.0;
            for (int i = n - 1; i >= 0; i--) {
               w = this.H[i][i] - p;
               r = 0.0;
               for (int j = l; j <= n; j++) {
                  r = r + this.H[i][j] * this.H[j][n];
               }
               if (this.e[i] < 0.0) {
                  z = w;
                  s = r;
               } else {
                  l = i;
                  if (this.e[i] == 0.0) {
                     if (w != 0.0) {
                        this.H[i][n] = -r / w;
                     } else {
                        this.H[i][n] = -r / (eps * norm);
                     }
                  } else {
                     x = this.H[i][i + 1];
                     y = this.H[i + 1][i];
                     q = (this.d[i] - p) * (this.d[i] - p) + this.e[i] * this.e[i];
                     t = (x * s - z * r) / q;
                     this.H[i][n] = t;
                     if (Math.abs(x) > Math.abs(z)) {
                        this.H[i + 1][n] = (-r - w * t) / x;
                     } else {
                        this.H[i + 1][n] = (-s - y * t) / z;
                     }
                  }
                  t = Math.abs(this.H[i][n]);
                  if (eps * t * t > 1) {
                     for (int j = i; j <= n; j++) {
                        this.H[j][n] = this.H[j][n] / t;
                     }
                  }
               }
            }
         } else if (q < 0) {
            int l = n - 1;
            if (Math.abs(this.H[n][n - 1]) > Math.abs(this.H[n - 1][n])) {
               this.H[n - 1][n - 1] = q / this.H[n][n - 1];
               this.H[n - 1][n] = -(this.H[n][n] - p) / this.H[n][n - 1];
            } else {
               cdiv(0.0, -this.H[n - 1][n], this.H[n - 1][n - 1] - p, q);
               this.H[n - 1][n - 1] = this.cdivr;
               this.H[n - 1][n] = this.cdivi;
            }
            this.H[n][n - 1] = 0.0;
            this.H[n][n] = 1.0;
            for (int i = n - 2; i >= 0; i--) {
               double ra;
               double sa;
               double vr;
               double vi;
               ra = 0.0;
               sa = 0.0;
               for (int j = l; j <= n; j++) {
                  ra = ra + this.H[i][j] * this.H[j][n - 1];
                  sa = sa + this.H[i][j] * this.H[j][n];
               }
               w = this.H[i][i] - p;
               if (this.e[i] < 0.0) {
                  z = w;
                  r = ra;
                  s = sa;
               } else {
                  l = i;
                  if (this.e[i] == 0) {
                     cdiv(-ra, -sa, w, q);
                     this.H[i][n - 1] = this.cdivr;
                     this.H[i][n] = this.cdivi;
                  } else {
                     x = this.H[i][i + 1];
                     y = this.H[i + 1][i];
                     vr = (this.d[i] - p) * (this.d[i] - p) + this.e[i] * this.e[i] - q * q;
                     vi = (this.d[i] - p) * 2.0 * q;
                     if (vr == 0.0 & vi == 0.0) {
                        vr = eps * norm * (Math.abs(w) + Math.abs(q) + Math.abs(x) + Math.abs(y) + Math.abs(z));
                     }
                     cdiv(x * r - z * ra + q * sa, x * s - z * sa - q * ra, vr, vi);
                     this.H[i][n - 1] = this.cdivr;
                     this.H[i][n] = this.cdivi;
                     if (Math.abs(x) > Math.abs(z) + Math.abs(q)) {
                        this.H[i + 1][n - 1] = (-ra - w * this.H[i][n - 1] + q * this.H[i][n]) / x;
                        this.H[i + 1][n] = (-sa - w * this.H[i][n] - q * this.H[i][n - 1]) / x;
                     } else {
                        cdiv(-r - y * this.H[i][n - 1], -s - y * this.H[i][n], z, q);
                        this.H[i + 1][n - 1] = this.cdivr;
                        this.H[i + 1][n] = this.cdivi;
                     }
                  }
                  t = Math.max(Math.abs(this.H[i][n - 1]), Math.abs(this.H[i][n]));
                  if (eps * t * t > 1) {
                     for (int j = i; j <= n; j++) {
                        this.H[j][n - 1] = this.H[j][n - 1] / t;
                        this.H[j][n] = this.H[j][n] / t;
                     }
                  }
               }
            }
         }
      }
      for (int i = 0; i < nn; i++) {
         if (i < low | i > high) {
            for (int j = i; j < nn; j++) {
               this.V[i][j] = this.H[i][j];
            }
         }
      }
      for (int j = nn - 1; j >= low; j--) {
         for (int i = low; i <= high; i++) {
            z = 0.0;
            for (int k = low; k <= Math.min(j, high); k++) {
               z = z + this.V[i][k] * this.H[k][j];
            }
            this.V[i][j] = z;
         }
      }
   }
   private void orthes() {
      int low = 0;
      int high = this.n - 1;
      for (int m = low + 1; m <= high - 1; m++) {
         double scale = 0.0;
         for (int i = m; i <= high; i++) {
            scale = scale + Math.abs(this.H[i][m - 1]);
         }
         if (scale != 0.0) {
            double h = 0.0;
            for (int i = high; i >= m; i--) {
               this.ort[i] = this.H[i][m - 1] / scale;
               h += this.ort[i] * this.ort[i];
            }
            double g = Math.sqrt(h);
            if (this.ort[m] > 0) {
               g = -g;
            }
            h = h - this.ort[m] * g;
            this.ort[m] = this.ort[m] - g;
            for (int j = m; j < this.n; j++) {
               double f = 0.0;
               for (int i = high; i >= m; i--) {
                  f += this.ort[i] * this.H[i][j];
               }
               f = f / h;
               for (int i = m; i <= high; i++) {
                  this.H[i][j] -= f * this.ort[i];
               }
            }
            for (int i = 0; i <= high; i++) {
               double f = 0.0;
               for (int j = high; j >= m; j--) {
                  f += this.ort[j] * this.H[i][j];
               }
               f = f / h;
               for (int j = m; j <= high; j++) {
                  this.H[i][j] -= f * this.ort[j];
               }
            }
            this.ort[m] = scale * this.ort[m];
            this.H[m][m - 1] = scale * g;
         }
      }
      for (int i = 0; i < this.n; i++) {
         for (int j = 0; j < this.n; j++) {
            this.V[i][j] = i == j ? 1.0 : 0.0;
         }
      }
      for (int m = high - 1; m >= low + 1; m--) {
         if (this.H[m][m - 1] != 0.0) {
            for (int i = m + 1; i <= high; i++) {
               this.ort[i] = this.H[i][m - 1];
            }
            for (int j = m; j <= high; j++) {
               double g = 0.0;
               for (int i = m; i <= high; i++) {
                  g += this.ort[i] * this.V[i][j];
               }
               g = g / this.ort[m] / this.H[m][m - 1];
               for (int i = m; i <= high; i++) {
                  this.V[i][j] += g * this.ort[i];
               }
            }
         }
      }
   }
   private void tql2() {
      for (int i = 1; i < this.n; i++) {
         this.e[i - 1] = this.e[i];
      }
      this.e[this.n - 1] = 0.0;
      double f = 0.0;
      double tst1 = 0.0;
      double eps = Math.pow(2.0, -52.0);
      for (int l = 0; l < this.n; l++) {
         tst1 = Math.max(tst1, Math.abs(this.d[l]) + Math.abs(this.e[l]));
         int m = l;
         while (m < this.n) {
            if (Math.abs(this.e[m]) <= eps * tst1) {
               break;
            }
            m++;
         }
         if (m > l) {
            int iter = 0;
            do {
               iter = iter + 1;
               double g = this.d[l];
               double p = (this.d[l + 1] - g) / (2.0 * this.e[l]);
               double r = Maths.hypot(p, 1.0);
               if (p < 0) {
                  r = -r;
               }
               this.d[l] = this.e[l] / (p + r);
               this.d[l + 1] = this.e[l] * (p + r);
               double dl1 = this.d[l + 1];
               double h = g - this.d[l];
               for (int i = l + 2; i < this.n; i++) {
                  this.d[i] -= h;
               }
               f = f + h;
               p = this.d[m];
               double c = 1.0;
               double c2 = c;
               double c3 = c;
               double el1 = this.e[l + 1];
               double s = 0.0;
               double s2 = 0.0;
               for (int i = m - 1; i >= l; i--) {
                  c3 = c2;
                  c2 = c;
                  s2 = s;
                  g = c * this.e[i];
                  h = c * p;
                  r = Maths.hypot(p, this.e[i]);
                  this.e[i + 1] = s * r;
                  s = this.e[i] / r;
                  c = p / r;
                  p = c * this.d[i] - s * g;
                  this.d[i + 1] = h + s * (c * g + s * this.d[i]);
                  for (int k = 0; k < this.n; k++) {
                     h = this.V[k][i + 1];
                     this.V[k][i + 1] = s * this.V[k][i] + c * h;
                     this.V[k][i] = c * this.V[k][i] - s * h;
                  }
               }
               p = -s * s2 * c3 * el1 * this.e[l] / dl1;
               this.e[l] = s * p;
               this.d[l] = c * p;
            }             while (Math.abs(this.e[l]) > eps * tst1);
         }
         this.d[l] = this.d[l] + f;
         this.e[l] = 0.0;
      }
      for (int i = 0; i < this.n - 1; i++) {
         int k = i;
         double p = this.d[i];
         for (int j = i + 1; j < this.n; j++) {
            if (this.d[j] < p) {
               k = j;
               p = this.d[j];
            }
         }
         if (k != i) {
            this.d[k] = this.d[i];
            this.d[i] = p;
            for (int j = 0; j < this.n; j++) {
               p = this.V[j][i];
               this.V[j][i] = this.V[j][k];
               this.V[j][k] = p;
            }
         }
      }
   }
   private void tred2() {
      for (int j = 0; j < this.n; j++) {
         this.d[j] = this.V[this.n - 1][j];
      }
      for (int i = this.n - 1; i > 0; i--) {
         double scale = 0.0;
         double h = 0.0;
         for (int k = 0; k < i; k++) {
            scale = scale + Math.abs(this.d[k]);
         }
         if (scale == 0.0) {
            this.e[i] = this.d[i - 1];
            for (int j = 0; j < i; j++) {
               this.d[j] = this.V[i - 1][j];
               this.V[i][j] = 0.0;
               this.V[j][i] = 0.0;
            }
         } else {
            for (int k = 0; k < i; k++) {
               this.d[k] /= scale;
               h += this.d[k] * this.d[k];
            }
            double f = this.d[i - 1];
            double g = Math.sqrt(h);
            if (f > 0) {
               g = -g;
            }
            this.e[i] = scale * g;
            h = h - f * g;
            this.d[i - 1] = f - g;
            for (int j = 0; j < i; j++) {
               this.e[j] = 0.0;
            }
            for (int j = 0; j < i; j++) {
               f = this.d[j];
               this.V[j][i] = f;
               g = this.e[j] + this.V[j][j] * f;
               for (int k = j + 1; k <= i - 1; k++) {
                  g += this.V[k][j] * this.d[k];
                  this.e[k] += this.V[k][j] * f;
               }
               this.e[j] = g;
            }
            f = 0.0;
            for (int j = 0; j < i; j++) {
               this.e[j] /= h;
               f += this.e[j] * this.d[j];
            }
            double hh = f / (h + h);
            for (int j = 0; j < i; j++) {
               this.e[j] -= hh * this.d[j];
            }
            for (int j = 0; j < i; j++) {
               f = this.d[j];
               g = this.e[j];
               for (int k = j; k <= i - 1; k++) {
                  this.V[k][j] -= f * this.e[k] + g * this.d[k];
               }
               this.d[j] = this.V[i - 1][j];
               this.V[i][j] = 0.0;
            }
         }
         this.d[i] = h;
      }
      for (int i = 0; i < this.n - 1; i++) {
         this.V[this.n - 1][i] = this.V[i][i];
         this.V[i][i] = 1.0;
         double h = this.d[i + 1];
         if (h != 0.0) {
            for (int k = 0; k <= i; k++) {
               this.d[k] = this.V[k][i + 1] / h;
            }
            for (int j = 0; j <= i; j++) {
               double g = 0.0;
               for (int k = 0; k <= i; k++) {
                  g += this.V[k][i + 1] * this.V[k][j];
               }
               for (int k = 0; k <= i; k++) {
                  this.V[k][j] -= g * this.d[k];
               }
            }
         }
         for (int k = 0; k <= i; k++) {
            this.V[k][i + 1] = 0.0;
         }
      }
      for (int j = 0; j < this.n; j++) {
         this.d[j] = this.V[this.n - 1][j];
         this.V[this.n - 1][j] = 0.0;
      }
      this.V[this.n - 1][this.n - 1] = 1.0;
      this.e[0] = 0.0;
   }
}
