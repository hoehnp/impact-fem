package Jama;
public class CholeskyDecomposition implements uka.patch.Patchable, uka.transport.Transportable, java.io.Serializable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      CholeskyDecomposition copy = (CholeskyDecomposition)_copy;
      if (po.writeDiff(this.isspd, copy.isspd)) copy.isspd = this.isspd;
      if (po.writeDiff(this.n, copy.n)) copy.n = this.n;
      copy.L = this.L = (double[][])po.writeDiff(this.L, copy.L);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      CholeskyDecomposition copy = (CholeskyDecomposition)_copy;
      if (pi.hasDiff()) copy.isspd = this.isspd = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.n = this.n = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.L = this.L = (double[][])pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      c.descend(this.L);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      this.L = (double[][])f.filter(this.L);
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
         return new CholeskyDecomposition(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((CholeskyDecomposition)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((CholeskyDecomposition)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((CholeskyDecomposition)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new CholeskyDecomposition((CholeskyDecomposition)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((CholeskyDecomposition)copy).deepCloneReferences((CholeskyDecomposition)orig, _helper);
         return false;
      }
      public Class getType() {
         return CholeskyDecomposition.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_int;
   public CholeskyDecomposition(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      _stream.request(CholeskyDecomposition._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.isspd = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.n = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      _stream.accept(CholeskyDecomposition._SIZE);
      this.L = (double[][])_stream.readReference();
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      _stream.reserve(CholeskyDecomposition._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.isspd);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.n);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.L);
   }
   public CholeskyDecomposition(CholeskyDecomposition _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
      this.isspd = _orig.isspd;
      this.n = _orig.n;
   }
   public void deepCloneReferences(CholeskyDecomposition _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      this.L = (double[][])_helper.internalDeepClone(_orig.L);
   }
   private double[][] L;
   private int n;
   private boolean isspd;
   public CholeskyDecomposition(Matrix Arg) {
      super();
      double[][] A = Arg.getArray();
      this.n = Arg.getRowDimension();
      this.L = new double[this.n][this.n];
      this.isspd = Arg.getColumnDimension() == this.n;
      for (int j = 0; j < this.n; j++) {
         double[] Lrowj = this.L[j];
         double d = 0.0;
         for (int k = 0; k < j; k++) {
            double[] Lrowk = this.L[k];
            double s = 0.0;
            for (int i = 0; i < k; i++) {
               s += Lrowk[i] * Lrowj[i];
            }
            Lrowj[k] = s = (A[j][k] - s) / this.L[k][k];
            d = d + s * s;
            this.isspd = this.isspd & A[k][j] == A[j][k];
         }
         d = A[j][j] - d;
         this.isspd = this.isspd & d > 0.0;
         this.L[j][j] = Math.sqrt(Math.max(d, 0.0));
         for (int k = j + 1; k < this.n; k++) {
            this.L[j][k] = 0.0;
         }
      }
   }
   public Matrix getL() {
      return new Matrix(this.L, this.n, this.n);
   }
   public boolean isSPD() {
      return this.isspd;
   }
   public Matrix solve(Matrix B) {
      if (B.getRowDimension() != this.n) {
         throw new IllegalArgumentException("Matrix row dimensions must agree.");
      }
      if (!this.isspd) {
         throw new RuntimeException("Matrix is not symmetric positive definite.");
      }
      double[][] X = B.getArrayCopy();
      int nx = B.getColumnDimension();
      for (int k = 0; k < this.n; k++) {
         for (int i = k + 1; i < this.n; i++) {
            for (int j = 0; j < nx; j++) {
               X[i][j] -= X[k][j] * this.L[i][k];
            }
         }
         for (int j = 0; j < nx; j++) {
            X[k][j] /= this.L[k][k];
         }
      }
      for (int k = this.n - 1; k >= 0; k--) {
         for (int j = 0; j < nx; j++) {
            X[k][j] /= this.L[k][k];
         }
         for (int i = 0; i < k; i++) {
            for (int j = 0; j < nx; j++) {
               X[i][j] -= X[k][j] * this.L[k][i];
            }
         }
      }
      return new Matrix(X, this.n, nx);
   }
}
