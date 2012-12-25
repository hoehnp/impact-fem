package Jama;
public class LUDecomposition implements uka.patch.Patchable, uka.transport.Transportable, java.io.Serializable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      LUDecomposition copy = (LUDecomposition)_copy;
      if (po.writeDiff(this.pivsign, copy.pivsign)) copy.pivsign = this.pivsign;
      if (po.writeDiff(this.n, copy.n)) copy.n = this.n;
      if (po.writeDiff(this.m, copy.m)) copy.m = this.m;
      copy.piv = this.piv = (int[])po.writeDiff(this.piv, copy.piv);
      copy.LU = this.LU = (double[][])po.writeDiff(this.LU, copy.LU);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      LUDecomposition copy = (LUDecomposition)_copy;
      if (pi.hasDiff()) copy.pivsign = this.pivsign = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.n = this.n = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.m = this.m = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.piv = this.piv = (int[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.LU = this.LU = (double[][])pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      c.descend(this.piv);
      c.descend(this.LU);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      this.piv = (int[])f.filter(this.piv);
      this.LU = (double[][])f.filter(this.LU);
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
         return new LUDecomposition(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((LUDecomposition)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((LUDecomposition)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((LUDecomposition)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new LUDecomposition((LUDecomposition)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((LUDecomposition)copy).deepCloneReferences((LUDecomposition)orig, _helper);
         return false;
      }
      public Class getType() {
         return LUDecomposition.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int;
   public LUDecomposition(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      _stream.request(LUDecomposition._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.pivsign = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.n = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.m = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      _stream.accept(LUDecomposition._SIZE);
      this.piv = (int[])_stream.readReference();
      this.LU = (double[][])_stream.readReference();
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      _stream.reserve(LUDecomposition._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.pivsign);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.n);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.m);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.piv);
      _stream.writeReference(this.LU);
   }
   public LUDecomposition(LUDecomposition _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
      this.pivsign = _orig.pivsign;
      this.n = _orig.n;
      this.m = _orig.m;
   }
   public void deepCloneReferences(LUDecomposition _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      this.piv = (int[])_helper.internalDeepClone(_orig.piv);
      this.LU = (double[][])_helper.internalDeepClone(_orig.LU);
   }
   private double[][] LU;
   private int m;
   private int n;
   private int pivsign;
   private int[] piv;
   public LUDecomposition(Matrix A) {
      super();
      this.LU = A.getArrayCopy();
      this.m = A.getRowDimension();
      this.n = A.getColumnDimension();
      this.piv = new int[this.m];
      for (int i = 0; i < this.m; i++) {
         this.piv[i] = i;
      }
      this.pivsign = 1;
      double[] LUrowi;
      double[] LUcolj = new double[this.m];
      for (int j = 0; j < this.n; j++) {
         for (int i = 0; i < this.m; i++) {
            LUcolj[i] = this.LU[i][j];
         }
         for (int i = 0; i < this.m; i++) {
            LUrowi = this.LU[i];
            int kmax = Math.min(i, j);
            double s = 0.0;
            for (int k = 0; k < kmax; k++) {
               s += LUrowi[k] * LUcolj[k];
            }
            LUrowi[j] = LUcolj[i] -= s;
         }
         int p = j;
         for (int i = j + 1; i < this.m; i++) {
            if (Math.abs(LUcolj[i]) > Math.abs(LUcolj[p])) {
               p = i;
            }
         }
         if (p != j) {
            for (int k = 0; k < this.n; k++) {
               double t = this.LU[p][k];
               this.LU[p][k] = this.LU[j][k];
               this.LU[j][k] = t;
            }
            int k = this.piv[p];
            this.piv[p] = this.piv[j];
            this.piv[j] = k;
            this.pivsign = -this.pivsign;
         }
         if (j < this.m & this.LU[j][j] != 0.0) {
            for (int i = j + 1; i < this.m; i++) {
               this.LU[i][j] /= this.LU[j][j];
            }
         }
      }
   }
   public double det() {
      if (this.m != this.n) {
         throw new IllegalArgumentException("Matrix must be square.");
      }
      double d = (double)this.pivsign;
      for (int j = 0; j < this.n; j++) {
         d *= this.LU[j][j];
      }
      return d;
   }
   public double[] getDoublePivot() {
      double[] vals = new double[this.m];
      for (int i = 0; i < this.m; i++) {
         vals[i] = (double)this.piv[i];
      }
      return vals;
   }
   public Matrix getL() {
      Matrix X = new Matrix(this.m, this.n);
      double[][] L = X.getArray();
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            if (i > j) {
               L[i][j] = this.LU[i][j];
            } else if (i == j) {
               L[i][j] = 1.0;
            } else {
               L[i][j] = 0.0;
            }
         }
      }
      return X;
   }
   public int[] getPivot() {
      int[] p = new int[this.m];
      for (int i = 0; i < this.m; i++) {
         p[i] = this.piv[i];
      }
      return p;
   }
   public Matrix getU() {
      Matrix X = new Matrix(this.n, this.n);
      double[][] U = X.getArray();
      for (int i = 0; i < this.n; i++) {
         for (int j = 0; j < this.n; j++) {
            if (i <= j) {
               U[i][j] = this.LU[i][j];
            } else {
               U[i][j] = 0.0;
            }
         }
      }
      return X;
   }
   public boolean isNonsingular() {
      for (int j = 0; j < this.n; j++) {
         if (this.LU[j][j] == 0) {
            return false;
         }
      }
      return true;
   }
   public Matrix solve(Matrix B) {
      if (B.getRowDimension() != this.m) {
         throw new IllegalArgumentException("Matrix row dimensions must agree.");
      }
      if (!this.isNonsingular()) {
         throw new RuntimeException("Matrix is singular.");
      }
      int nx = B.getColumnDimension();
      Matrix Xmat = B.getMatrix(this.piv, 0, nx - 1);
      double[][] X = Xmat.getArray();
      for (int k = 0; k < this.n; k++) {
         for (int i = k + 1; i < this.n; i++) {
            for (int j = 0; j < nx; j++) {
               X[i][j] -= X[k][j] * this.LU[i][k];
            }
         }
      }
      for (int k = this.n - 1; k >= 0; k--) {
         for (int j = 0; j < nx; j++) {
            X[k][j] /= this.LU[k][k];
         }
         for (int i = 0; i < k; i++) {
            for (int j = 0; j < nx; j++) {
               X[i][j] -= X[k][j] * this.LU[i][k];
            }
         }
      }
      return Xmat;
   }
}
