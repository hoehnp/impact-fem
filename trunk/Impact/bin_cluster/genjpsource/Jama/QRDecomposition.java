package Jama;
import Jama.util.*;

public class QRDecomposition implements uka.patch.Patchable, uka.transport.Transportable, java.io.Serializable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      QRDecomposition copy = (QRDecomposition)_copy;
      if (po.writeDiff(this.n, copy.n)) copy.n = this.n;
      if (po.writeDiff(this.m, copy.m)) copy.m = this.m;
      copy.Rdiag = this.Rdiag = (double[])po.writeDiff(this.Rdiag, copy.Rdiag);
      copy.QR = this.QR = (double[][])po.writeDiff(this.QR, copy.QR);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      QRDecomposition copy = (QRDecomposition)_copy;
      if (pi.hasDiff()) copy.n = this.n = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.m = this.m = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.Rdiag = this.Rdiag = (double[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.QR = this.QR = (double[][])pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      c.descend(this.Rdiag);
      c.descend(this.QR);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      this.Rdiag = (double[])f.filter(this.Rdiag);
      this.QR = (double[][])f.filter(this.QR);
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
         return new QRDecomposition(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((QRDecomposition)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((QRDecomposition)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((QRDecomposition)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new QRDecomposition((QRDecomposition)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((QRDecomposition)copy).deepCloneReferences((QRDecomposition)orig, _helper);
         return false;
      }
      public Class getType() {
         return QRDecomposition.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int;
   public QRDecomposition(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      _stream.request(QRDecomposition._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.n = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.m = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      _stream.accept(QRDecomposition._SIZE);
      this.Rdiag = (double[])_stream.readReference();
      this.QR = (double[][])_stream.readReference();
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      _stream.reserve(QRDecomposition._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.n);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.m);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.Rdiag);
      _stream.writeReference(this.QR);
   }
   public QRDecomposition(QRDecomposition _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
      this.n = _orig.n;
      this.m = _orig.m;
   }
   public void deepCloneReferences(QRDecomposition _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      this.Rdiag = (double[])_helper.internalDeepClone(_orig.Rdiag);
      this.QR = (double[][])_helper.internalDeepClone(_orig.QR);
   }
   private double[][] QR;
   private int m;
   private int n;
   private double[] Rdiag;
   public QRDecomposition(Matrix A) {
      super();
      this.QR = A.getArrayCopy();
      this.m = A.getRowDimension();
      this.n = A.getColumnDimension();
      this.Rdiag = new double[this.n];
      for (int k = 0; k < this.n; k++) {
         double nrm = 0;
         for (int i = k; i < this.m; i++) {
            nrm = Maths.hypot(nrm, this.QR[i][k]);
         }
         if (nrm != 0.0) {
            if (this.QR[k][k] < 0) {
               nrm = -nrm;
            }
            for (int i = k; i < this.m; i++) {
               this.QR[i][k] /= nrm;
            }
            this.QR[k][k] += 1.0;
            for (int j = k + 1; j < this.n; j++) {
               double s = 0.0;
               for (int i = k; i < this.m; i++) {
                  s += this.QR[i][k] * this.QR[i][j];
               }
               s = -s / this.QR[k][k];
               for (int i = k; i < this.m; i++) {
                  this.QR[i][j] += s * this.QR[i][k];
               }
            }
         }
         this.Rdiag[k] = -nrm;
      }
   }
   public Matrix getH() {
      Matrix X = new Matrix(this.m, this.n);
      double[][] H = X.getArray();
      for (int i = 0; i < this.m; i++) {
         for (int j = 0; j < this.n; j++) {
            if (i >= j) {
               H[i][j] = this.QR[i][j];
            } else {
               H[i][j] = 0.0;
            }
         }
      }
      return X;
   }
   public Matrix getQ() {
      Matrix X = new Matrix(this.m, this.n);
      double[][] Q = X.getArray();
      for (int k = this.n - 1; k >= 0; k--) {
         for (int i = 0; i < this.m; i++) {
            Q[i][k] = 0.0;
         }
         Q[k][k] = 1.0;
         for (int j = k; j < this.n; j++) {
            if (this.QR[k][k] != 0) {
               double s = 0.0;
               for (int i = k; i < this.m; i++) {
                  s += this.QR[i][k] * Q[i][j];
               }
               s = -s / this.QR[k][k];
               for (int i = k; i < this.m; i++) {
                  Q[i][j] += s * this.QR[i][k];
               }
            }
         }
      }
      return X;
   }
   public Matrix getR() {
      Matrix X = new Matrix(this.n, this.n);
      double[][] R = X.getArray();
      for (int i = 0; i < this.n; i++) {
         for (int j = 0; j < this.n; j++) {
            if (i < j) {
               R[i][j] = this.QR[i][j];
            } else if (i == j) {
               R[i][j] = this.Rdiag[i];
            } else {
               R[i][j] = 0.0;
            }
         }
      }
      return X;
   }
   public boolean isFullRank() {
      for (int j = 0; j < this.n; j++) {
         if (this.Rdiag[j] == 0) {
            return false;
         }
      }
      return true;
   }
   public Matrix solve(Matrix B) {
      if (B.getRowDimension() != this.m) {
         throw new IllegalArgumentException("Matrix row dimensions must agree.");
      }
      if (!this.isFullRank()) {
         throw new RuntimeException("Matrix is rank deficient.");
      }
      int nx = B.getColumnDimension();
      double[][] X = B.getArrayCopy();
      for (int k = 0; k < this.n; k++) {
         for (int j = 0; j < nx; j++) {
            double s = 0.0;
            for (int i = k; i < this.m; i++) {
               s += this.QR[i][k] * X[i][j];
            }
            s = -s / this.QR[k][k];
            for (int i = k; i < this.m; i++) {
               X[i][j] += s * this.QR[i][k];
            }
         }
      }
      for (int k = this.n - 1; k >= 0; k--) {
         for (int j = 0; j < nx; j++) {
            X[k][j] /= this.Rdiag[k];
         }
         for (int i = 0; i < k; i++) {
            for (int j = 0; j < nx; j++) {
               X[i][j] -= X[k][j] * this.QR[i][k];
            }
         }
      }
      return new Matrix(X, this.n, nx).getMatrix(0, this.n - 1, 0, nx - 1);
   }
}
