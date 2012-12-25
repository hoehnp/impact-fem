package run.materials;
import run.*;

import java.text.ParseException;

public class SpringMaterial extends Material implements uka.patch.Patchable, uka.transport.Transportable, Cloneable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      SpringMaterial copy = (SpringMaterial)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.crz, copy.crz)) copy.crz = this.crz;
      if (po.writeDiff(this.cry, copy.cry)) copy.cry = this.cry;
      if (po.writeDiff(this.crx, copy.crx)) copy.crx = this.crx;
      if (po.writeDiff(this.cz, copy.cz)) copy.cz = this.cz;
      if (po.writeDiff(this.cy, copy.cy)) copy.cy = this.cy;
      if (po.writeDiff(this.cx, copy.cx)) copy.cx = this.cx;
      if (po.writeDiff(this.krz, copy.krz)) copy.krz = this.krz;
      if (po.writeDiff(this.kry, copy.kry)) copy.kry = this.kry;
      if (po.writeDiff(this.krx, copy.krx)) copy.krx = this.krx;
      if (po.writeDiff(this.kz, copy.kz)) copy.kz = this.kz;
      if (po.writeDiff(this.ky, copy.ky)) copy.ky = this.ky;
      if (po.writeDiff(this.kx, copy.kx)) copy.kx = this.kx;
      if (po.writeDiff(this.crz_is_set, copy.crz_is_set)) copy.crz_is_set = this.crz_is_set;
      if (po.writeDiff(this.cry_is_set, copy.cry_is_set)) copy.cry_is_set = this.cry_is_set;
      if (po.writeDiff(this.crx_is_set, copy.crx_is_set)) copy.crx_is_set = this.crx_is_set;
      if (po.writeDiff(this.cz_is_set, copy.cz_is_set)) copy.cz_is_set = this.cz_is_set;
      if (po.writeDiff(this.cy_is_set, copy.cy_is_set)) copy.cy_is_set = this.cy_is_set;
      if (po.writeDiff(this.cx_is_set, copy.cx_is_set)) copy.cx_is_set = this.cx_is_set;
      if (po.writeDiff(this.krz_is_set, copy.krz_is_set)) copy.krz_is_set = this.krz_is_set;
      if (po.writeDiff(this.kry_is_set, copy.kry_is_set)) copy.kry_is_set = this.kry_is_set;
      if (po.writeDiff(this.krx_is_set, copy.krx_is_set)) copy.krx_is_set = this.krx_is_set;
      if (po.writeDiff(this.kz_is_set, copy.kz_is_set)) copy.kz_is_set = this.kz_is_set;
      if (po.writeDiff(this.ky_is_set, copy.ky_is_set)) copy.ky_is_set = this.ky_is_set;
      if (po.writeDiff(this.kx_is_set, copy.kx_is_set)) copy.kx_is_set = this.kx_is_set;
      copy.vcrz = this.vcrz = (run.Variable)po.writeDiff(this.vcrz, copy.vcrz);
      copy.vcry = this.vcry = (run.Variable)po.writeDiff(this.vcry, copy.vcry);
      copy.vcrx = this.vcrx = (run.Variable)po.writeDiff(this.vcrx, copy.vcrx);
      copy.vcz = this.vcz = (run.Variable)po.writeDiff(this.vcz, copy.vcz);
      copy.vcy = this.vcy = (run.Variable)po.writeDiff(this.vcy, copy.vcy);
      copy.vcx = this.vcx = (run.Variable)po.writeDiff(this.vcx, copy.vcx);
      copy.vkrz = this.vkrz = (run.Variable)po.writeDiff(this.vkrz, copy.vkrz);
      copy.vkry = this.vkry = (run.Variable)po.writeDiff(this.vkry, copy.vkry);
      copy.vkrx = this.vkrx = (run.Variable)po.writeDiff(this.vkrx, copy.vkrx);
      copy.vkz = this.vkz = (run.Variable)po.writeDiff(this.vkz, copy.vkz);
      copy.vky = this.vky = (run.Variable)po.writeDiff(this.vky, copy.vky);
      copy.vkx = this.vkx = (run.Variable)po.writeDiff(this.vkx, copy.vkx);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      SpringMaterial copy = (SpringMaterial)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.crz = this.crz = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.cry = this.cry = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.crx = this.crx = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.cz = this.cz = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.cy = this.cy = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.cx = this.cx = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.krz = this.krz = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.kry = this.kry = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.krx = this.krx = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.kz = this.kz = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.ky = this.ky = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.kx = this.kx = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.crz_is_set = this.crz_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.cry_is_set = this.cry_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.crx_is_set = this.crx_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.cz_is_set = this.cz_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.cy_is_set = this.cy_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.cx_is_set = this.cx_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.krz_is_set = this.krz_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.kry_is_set = this.kry_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.krx_is_set = this.krx_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.kz_is_set = this.kz_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.ky_is_set = this.ky_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.kx_is_set = this.kx_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.vcrz = this.vcrz = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.vcry = this.vcry = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.vcrx = this.vcrx = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.vcz = this.vcz = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.vcy = this.vcy = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.vcx = this.vcx = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.vkrz = this.vkrz = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.vkry = this.vkry = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.vkrx = this.vkrx = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.vkz = this.vkz = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.vky = this.vky = (run.Variable)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.vkx = this.vkx = (run.Variable)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.vcrz);
      c.descend(this.vcry);
      c.descend(this.vcrx);
      c.descend(this.vcz);
      c.descend(this.vcy);
      c.descend(this.vcx);
      c.descend(this.vkrz);
      c.descend(this.vkry);
      c.descend(this.vkrx);
      c.descend(this.vkz);
      c.descend(this.vky);
      c.descend(this.vkx);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.vcrz = (run.Variable)f.filter(this.vcrz);
      this.vcry = (run.Variable)f.filter(this.vcry);
      this.vcrx = (run.Variable)f.filter(this.vcrx);
      this.vcz = (run.Variable)f.filter(this.vcz);
      this.vcy = (run.Variable)f.filter(this.vcy);
      this.vcx = (run.Variable)f.filter(this.vcx);
      this.vkrz = (run.Variable)f.filter(this.vkrz);
      this.vkry = (run.Variable)f.filter(this.vkry);
      this.vkrx = (run.Variable)f.filter(this.vkrx);
      this.vkz = (run.Variable)f.filter(this.vkz);
      this.vky = (run.Variable)f.filter(this.vky);
      this.vkx = (run.Variable)f.filter(this.vkx);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new SpringMaterial(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((SpringMaterial)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((SpringMaterial)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((SpringMaterial)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new SpringMaterial((SpringMaterial)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((SpringMaterial)copy).deepCloneReferences((SpringMaterial)orig, _helper);
         return false;
      }
      public Class getType() {
         return SpringMaterial.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean;
   public SpringMaterial(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(SpringMaterial._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.crz = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.cry = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.crx = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.cz = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.cy = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.cx = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.krz = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.kry = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.krx = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.kz = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.ky = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.kx = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.crz_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.cry_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.crx_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.cz_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.cy_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.cx_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.krz_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.kry_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.krx_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.kz_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.ky_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.kx_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      _stream.accept(SpringMaterial._SIZE);
      this.vcrz = (run.Variable)_stream.readReference();
      this.vcry = (run.Variable)_stream.readReference();
      this.vcrx = (run.Variable)_stream.readReference();
      this.vcz = (run.Variable)_stream.readReference();
      this.vcy = (run.Variable)_stream.readReference();
      this.vcx = (run.Variable)_stream.readReference();
      this.vkrz = (run.Variable)_stream.readReference();
      this.vkry = (run.Variable)_stream.readReference();
      this.vkrx = (run.Variable)_stream.readReference();
      this.vkz = (run.Variable)_stream.readReference();
      this.vky = (run.Variable)_stream.readReference();
      this.vkx = (run.Variable)_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(SpringMaterial._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.crz);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.cry);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.crx);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.cz);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.cy);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.cx);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.krz);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.kry);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.krx);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.kz);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.ky);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.kx);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.crz_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.cry_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.crx_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.cz_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.cy_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.cx_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.krz_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.kry_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.krx_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.kz_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.ky_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.kx_is_set);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.vcrz);
      _stream.writeReference(this.vcry);
      _stream.writeReference(this.vcrx);
      _stream.writeReference(this.vcz);
      _stream.writeReference(this.vcy);
      _stream.writeReference(this.vcx);
      _stream.writeReference(this.vkrz);
      _stream.writeReference(this.vkry);
      _stream.writeReference(this.vkrx);
      _stream.writeReference(this.vkz);
      _stream.writeReference(this.vky);
      _stream.writeReference(this.vkx);
   }
   public SpringMaterial(SpringMaterial _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.crz = _orig.crz;
      this.cry = _orig.cry;
      this.crx = _orig.crx;
      this.cz = _orig.cz;
      this.cy = _orig.cy;
      this.cx = _orig.cx;
      this.krz = _orig.krz;
      this.kry = _orig.kry;
      this.krx = _orig.krx;
      this.kz = _orig.kz;
      this.ky = _orig.ky;
      this.kx = _orig.kx;
      this.crz_is_set = _orig.crz_is_set;
      this.cry_is_set = _orig.cry_is_set;
      this.crx_is_set = _orig.crx_is_set;
      this.cz_is_set = _orig.cz_is_set;
      this.cy_is_set = _orig.cy_is_set;
      this.cx_is_set = _orig.cx_is_set;
      this.krz_is_set = _orig.krz_is_set;
      this.kry_is_set = _orig.kry_is_set;
      this.krx_is_set = _orig.krx_is_set;
      this.kz_is_set = _orig.kz_is_set;
      this.ky_is_set = _orig.ky_is_set;
      this.kx_is_set = _orig.kx_is_set;
   }
   public void deepCloneReferences(SpringMaterial _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.vcrz = (run.Variable)_helper.internalDeepClone(_orig.vcrz);
      this.vcry = (run.Variable)_helper.internalDeepClone(_orig.vcry);
      this.vcrx = (run.Variable)_helper.internalDeepClone(_orig.vcrx);
      this.vcz = (run.Variable)_helper.internalDeepClone(_orig.vcz);
      this.vcy = (run.Variable)_helper.internalDeepClone(_orig.vcy);
      this.vcx = (run.Variable)_helper.internalDeepClone(_orig.vcx);
      this.vkrz = (run.Variable)_helper.internalDeepClone(_orig.vkrz);
      this.vkry = (run.Variable)_helper.internalDeepClone(_orig.vkry);
      this.vkrx = (run.Variable)_helper.internalDeepClone(_orig.vkrx);
      this.vkz = (run.Variable)_helper.internalDeepClone(_orig.vkz);
      this.vky = (run.Variable)_helper.internalDeepClone(_orig.vky);
      this.vkx = (run.Variable)_helper.internalDeepClone(_orig.vkx);
   }
   private boolean kx_is_set;
   private boolean ky_is_set;
   private boolean kz_is_set;
   private boolean krx_is_set;
   private boolean kry_is_set;
   private boolean krz_is_set;
   private boolean cx_is_set;
   private boolean cy_is_set;
   private boolean cz_is_set;
   private boolean crx_is_set;
   private boolean cry_is_set;
   private boolean crz_is_set;
   private Variable vkx;
   private Variable vky;
   private Variable vkz;
   private Variable vkrx;
   private Variable vkry;
   private Variable vkrz;
   private Variable vcx;
   private Variable vcy;
   private Variable vcz;
   private Variable vcrx;
   private Variable vcry;
   private Variable vcrz;
   private double kx;
   private double ky;
   private double kz;
   private double krx;
   private double kry;
   private double krz;
   private double cx;
   private double cy;
   private double cz;
   private double crx;
   private double cry;
   private double crz;
   public SpringMaterial() {
      super();
   }
   public void calculateStressOneDimensional(Jama.Matrix displacement, Jama.Matrix velocity, Jama.Matrix force, double timestep) {
      this.kx = this.vkx.value(displacement.get(0, 0));
      this.ky = this.vky.value(displacement.get(1, 0));
      this.kz = this.vkz.value(displacement.get(2, 0));
      this.krx = this.vkrx.value(displacement.get(3, 0));
      this.kry = this.vkry.value(displacement.get(4, 0));
      this.krz = this.vkrz.value(displacement.get(5, 0));
      this.cx = this.vcx.value(displacement.get(0, 0));
      this.cy = this.vcy.value(displacement.get(1, 0));
      this.cz = this.vcz.value(displacement.get(2, 0));
      this.crx = this.vcrx.value(displacement.get(3, 0));
      this.cry = this.vcry.value(displacement.get(4, 0));
      this.crz = this.vcrz.value(displacement.get(5, 0));
      force.set(0, 0, this.kx * displacement.get(0, 0) + this.cx * velocity.get(0, 0));
      force.set(1, 0, this.ky * displacement.get(1, 0) + this.cy * velocity.get(1, 0));
      force.set(2, 0, this.kz * displacement.get(2, 0) + this.cz * velocity.get(2, 0));
      force.set(3, 0, this.krx * displacement.get(3, 0) + this.crx * velocity.get(3, 0));
      force.set(4, 0, this.kry * displacement.get(4, 0) + this.cry * velocity.get(4, 0));
      force.set(5, 0, this.krz * displacement.get(5, 0) + this.crz * velocity.get(5, 0));
   }
   public void calculateStressThreeDimensional(Jama.Matrix strain, Jama.Matrix dstrain, Jama.Matrix stress, double timestep) {
   }
   public void calculateStressTwoDimensionalPlaneStress(Jama.Matrix strain, Jama.Matrix dstrain, Jama.Matrix stress, double timestep) {
   }
   public void parse_Fembic(Token[] param, int lineno) throws java.text.ParseException {
      int i = 0;
      while (i < param.length) {
         if (param[i].getw().toUpperCase().equals("KX")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.vkx = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: KX = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.vkx = new Variable(param[i + 2].getn());
            }
            this.kx_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("KY")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.vky = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: KY = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.vky = new Variable(param[i + 2].getn());
            }
            this.ky_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("KZ")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.vkz = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: KZ = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.vkz = new Variable(param[i + 2].getn());
            }
            this.kz_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("KRX")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.vkrx = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: KRX = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.vkrx = new Variable(param[i + 2].getn());
            }
            this.krx_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("KRY")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.vkry = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: KRY = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.vkry = new Variable(param[i + 2].getn());
            }
            this.kry_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("KRZ")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.vkrz = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: KRZ = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.vkrz = new Variable(param[i + 2].getn());
            }
            this.krz_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("CX")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.vcx = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: CX = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.vcx = new Variable(param[i + 2].getn());
            }
            this.cx_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("CY")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.vcy = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: CY = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.vcy = new Variable(param[i + 2].getn());
            }
            this.cy_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("CZ")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.vcz = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: CZ = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.vcz = new Variable(param[i + 2].getn());
            }
            this.cz_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("CRX")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.vcrx = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: CRX = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.vcrx = new Variable(param[i + 2].getn());
            }
            this.crx_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("CRY")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.vcry = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: CRY = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.vcry = new Variable(param[i + 2].getn());
            }
            this.cry_is_set = true;
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("CRZ")) {
            if (param[i + 2].is_a_word()) {
               if (param[i + 2].getw().startsWith("[") && param[i + 2].getw().endsWith("]")) {
                  this.vcrz = new Variable(param[i + 2].getw().substring(1, param[i + 2].getw().length() - 1));
               } else {
                  throw new ParseException("Illegal parameter. Syntax: CRZ = [ax,ay,bx,by,...] ", lineno);
               }
            } else {
               this.vcrz = new Variable(param[i + 2].getn());
            }
            this.crz_is_set = true;
            i += 3;
         } else {
            throw new java.text.ParseException("Unknown material parameter in line ", lineno);
         }
      }
   }
   public void parse_Nastran(Token[] param, int lineno) throws java.text.ParseException {
   }
   public void parse_Gmsh(Token[] param, int lineno) throws java.text.ParseException {
   }
   public void checkIndata() throws IllegalArgumentException {
   }
   public String print_Fembic(int ctrl) {
      String out;
      switch (ctrl) {
      case Element.MESH: 
         out = new String(this.name);
         if (this.kx_is_set) out += " kx = " + this.vkx.printFembic();
         if (this.ky_is_set) out += " ky = " + this.vky.printFembic();
         if (this.kz_is_set) out += " kz = " + this.vkz.printFembic();
         if (this.krx_is_set) out += " krx = " + this.vkrx.printFembic();
         if (this.kry_is_set) out += " kry = " + this.vkry.printFembic();
         if (this.krz_is_set) out += " krz = " + this.vkrz.printFembic();
         if (this.cx_is_set) out += " cx = " + this.vcx.printFembic();
         if (this.cy_is_set) out += " cy = " + this.vcy.printFembic();
         if (this.cz_is_set) out += " cz = " + this.vcz.printFembic();
         if (this.crx_is_set) out += " crx = " + this.vcrx.printFembic();
         if (this.cry_is_set) out += " cry = " + this.vcry.printFembic();
         if (this.crz_is_set) out += " crz = " + this.vcrz.printFembic();
         out += "\n";
         return out;
      
      default: 
         return new String("");
      
      }
   }
   public void setInitialConditions() {
      if (!this.kx_is_set) {
         this.vkx = new Variable(0.0);
      }
      if (!this.krx_is_set) {
         this.vkrx = new Variable(0.0);
      }
      if (!this.cx_is_set) {
         this.vcx = new Variable(0.0);
      }
      if (!this.crx_is_set) {
         this.vcrx = new Variable(0.0);
      }
      try {
         if (!this.ky_is_set) {
            this.vky = (Variable)this.vkx.copy();
         }
         if (!this.kz_is_set) {
            this.vkz = (Variable)this.vkx.copy();
         }
         if (!this.kry_is_set) {
            this.vkry = (Variable)this.vkrx.copy();
         }
         if (!this.krz_is_set) {
            this.vkrz = (Variable)this.vkrx.copy();
         }
         if (!this.cy_is_set) {
            this.vcy = (Variable)this.vcx.copy();
         }
         if (!this.cz_is_set) {
            this.vcz = (Variable)this.vcx.copy();
         }
         if (!this.cry_is_set) {
            this.vcry = (Variable)this.vcrx.copy();
         }
         if (!this.crz_is_set) {
            this.vcrz = (Variable)this.vcrx.copy();
         }
      }  catch (CloneNotSupportedException e) {
         System.err.println("Object cannot clone");
      }
      this.kx = this.vkx.value(0);
      this.ky = this.vky.value(0);
      this.kz = this.vkz.value(0);
      this.krx = this.vkrx.value(0);
      this.kry = this.vkry.value(0);
      this.krz = this.vkrz.value(0);
      this.cx = this.vcx.value(0);
      this.cy = this.vcy.value(0);
      this.cz = this.vcz.value(0);
      this.crx = this.vcrx.value(0);
      this.cry = this.vcry.value(0);
      this.crz = this.vcrz.value(0);
   }
   public double wavespeedOneDimensional(double mass, double inertia) {
      double timestep = 1.0E15;
      if (this.kx_is_set && this.cx_is_set && this.kx != 0) {
         timestep = (Math.sqrt(mass * this.kx + this.cx * this.cx) - this.cx) / this.kx;
      } else if (this.cx_is_set && this.cx != 0) {
         timestep = 0.5 * mass / this.cx;
      } else if (this.kx_is_set && this.kx != 0) {
         timestep = Math.sqrt(mass / this.kx);
      }
      if (this.ky_is_set && this.cy_is_set && this.ky != 0) {
         timestep = Math.min(timestep, (Math.sqrt(mass * this.ky + this.cy * this.cy) - this.cy) / this.ky);
      } else if (this.cy_is_set && this.cy != 0) {
         timestep = Math.min(timestep, 0.5 * mass / this.cy);
      } else if (this.ky_is_set && this.ky != 0) {
         timestep = Math.min(timestep, Math.sqrt(mass / this.ky));
      }
      if (this.kz_is_set && this.cz_is_set && this.kz != 0) {
         timestep = Math.min(timestep, (Math.sqrt(mass * this.kz + this.cz * this.cz) - this.cz) / this.kz);
      } else if (this.cz_is_set && this.cz != 0) {
         timestep = Math.min(timestep, 0.5 * mass / this.cz);
      } else if (this.kz_is_set && this.kz != 0) {
         timestep = Math.min(timestep, Math.sqrt(mass / this.kz));
      }
      if (this.crx_is_set && this.crx_is_set && this.krx != 0) {
         timestep = Math.min(timestep, (Math.sqrt(inertia * this.krx + this.crx * this.crx) - this.crx) / this.krx);
      } else if (this.crx_is_set && this.crx != 0) {
         timestep = Math.min(timestep, 0.5 * inertia / this.crx);
      } else if (this.krx_is_set && this.krx != 0) {
         timestep = Math.min(timestep, Math.sqrt(inertia / this.krx));
      }
      if (this.kry_is_set && this.cry_is_set && this.kry != 0) {
         timestep = Math.min(timestep, (Math.sqrt(inertia * this.kry + this.cry * this.cry) - this.cry) / this.kry);
      } else if (this.cry_is_set && this.cry != 0) {
         timestep = Math.min(timestep, 0.5 * inertia / this.cry);
      } else if (this.kry_is_set && this.kry != 0) {
         timestep = Math.min(timestep, Math.sqrt(inertia / this.kry));
      }
      if (this.krz_is_set && this.crz_is_set && this.krz != 0) {
         timestep = Math.min(timestep, (Math.sqrt(inertia * this.krz + this.crz * this.crz) - this.crz) / this.krz);
      } else if (this.crz_is_set && this.crz != 0) {
         timestep = Math.min(timestep, 0.5 * inertia / this.crz);
      } else if (this.krz_is_set && this.krz != 0) {
         timestep = Math.min(timestep, Math.sqrt(inertia / this.krz));
      }
      return timestep;
   }
   public double wavespeedThreeDimensional(double param, double param2) {
      return 0.0;
   }
   public double wavespeedTwoDimensional(double param, double param2) {
      return 0.0;
   }
}
