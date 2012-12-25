package run.elements;
import Jama.*;

import run.*;

import java.text.ParseException;

import java.util.*;

public class Shell_C0_3 extends Element implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Shell_C0_3 copy = (Shell_C0_3)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.Thinning_is_enabled, copy.Thinning_is_enabled)) copy.Thinning_is_enabled = this.Thinning_is_enabled;
      if (po.writeDiff(this.Friction_is_set, copy.Friction_is_set)) copy.Friction_is_set = this.Friction_is_set;
      if (po.writeDiff(this.Factor_is_set, copy.Factor_is_set)) copy.Factor_is_set = this.Factor_is_set;
      if (po.writeDiff(this.T_is_set, copy.T_is_set)) copy.T_is_set = this.T_is_set;
      if (po.writeDiff(this.Material_is_set, copy.Material_is_set)) copy.Material_is_set = this.Material_is_set;
      if (po.writeDiff(this.Nodes_are_set, copy.Nodes_are_set)) copy.Nodes_are_set = this.Nodes_are_set;
      if (po.writeDiff(this.PIP_is_set, copy.PIP_is_set)) copy.PIP_is_set = this.PIP_is_set;
      if (po.writeDiff(this.NIP_is_set, copy.NIP_is_set)) copy.NIP_is_set = this.NIP_is_set;
      if (po.writeDiff(this.original_thickness, copy.original_thickness)) copy.original_thickness = this.original_thickness;
      if (po.writeDiff(this.friction, copy.friction)) copy.friction = this.friction;
      if (po.writeDiff(this.factor, copy.factor)) copy.factor = this.factor;
      if (po.writeDiff(this.thickness, copy.thickness)) copy.thickness = this.thickness;
      if (po.writeDiff(this.printed_integration_point, copy.printed_integration_point)) copy.printed_integration_point = this.printed_integration_point;
      if (po.writeDiff(this.Contact, copy.Contact)) copy.Contact = this.Contact;
      if (po.writeDiff(this.number_of_integration_points, copy.number_of_integration_points)) copy.number_of_integration_points = this.number_of_integration_points;
      if (po.writeDiff(this.kappaxy, copy.kappaxy)) copy.kappaxy = this.kappaxy;
      if (po.writeDiff(this.kappay, copy.kappay)) copy.kappay = this.kappay;
      if (po.writeDiff(this.kappax, copy.kappax)) copy.kappax = this.kappax;
      if (po.writeDiff(this.dmxy, copy.dmxy)) copy.dmxy = this.dmxy;
      if (po.writeDiff(this.dmy, copy.dmy)) copy.dmy = this.dmy;
      if (po.writeDiff(this.dmx, copy.dmx)) copy.dmx = this.dmx;
      if (po.writeDiff(this.area, copy.area)) copy.area = this.area;
      copy.internal_contact_line_element_3 = this.internal_contact_line_element_3 = (run.elements.Contact_Line)po.writeDiff(this.internal_contact_line_element_3, copy.internal_contact_line_element_3);
      copy.internal_contact_line_element_2 = this.internal_contact_line_element_2 = (run.elements.Contact_Line)po.writeDiff(this.internal_contact_line_element_2, copy.internal_contact_line_element_2);
      copy.internal_contact_line_element_1 = this.internal_contact_line_element_1 = (run.elements.Contact_Line)po.writeDiff(this.internal_contact_line_element_1, copy.internal_contact_line_element_1);
      copy.internal_contact_element = this.internal_contact_element = (run.elements.Contact_Triangle)po.writeDiff(this.internal_contact_element, copy.internal_contact_element);
      copy.load = this.load = (run.Load)po.writeDiff(this.load, copy.load);
      copy.material = this.material = (run.Material[])po.writeDiff(this.material, copy.material);
      copy.weight_factor = this.weight_factor = (double[])po.writeDiff(this.weight_factor, copy.weight_factor);
      copy.z = this.z = (double[])po.writeDiff(this.z, copy.z);
      copy.trash = this.trash = (Jama.Matrix)po.writeDiff(this.trash, copy.trash);
      copy.a = this.a = (Jama.Matrix)po.writeDiff(this.a, copy.a);
      copy.v = this.v = (Jama.Matrix)po.writeDiff(this.v, copy.v);
      copy.p = this.p = (Jama.Matrix)po.writeDiff(this.p, copy.p);
      copy.Bs = this.Bs = (Jama.Matrix)po.writeDiff(this.Bs, copy.Bs);
      copy.Bb = this.Bb = (Jama.Matrix)po.writeDiff(this.Bb, copy.Bb);
      copy.Bm = this.Bm = (Jama.Matrix)po.writeDiff(this.Bm, copy.Bm);
      copy.moment = this.moment = (Jama.Matrix)po.writeDiff(this.moment, copy.moment);
      copy.force = this.force = (Jama.Matrix)po.writeDiff(this.force, copy.force);
      copy.stress = this.stress = (Jama.Matrix[])po.writeDiff(this.stress, copy.stress);
      copy.strainrate = this.strainrate = (Jama.Matrix)po.writeDiff(this.strainrate, copy.strainrate);
      copy.dstrain = this.dstrain = (Jama.Matrix[])po.writeDiff(this.dstrain, copy.dstrain);
      copy.strain = this.strain = (Jama.Matrix[])po.writeDiff(this.strain, copy.strain);
      copy.local_coordinate_system = this.local_coordinate_system = (Jama.Matrix)po.writeDiff(this.local_coordinate_system, copy.local_coordinate_system);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Shell_C0_3 copy = (Shell_C0_3)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.Thinning_is_enabled = this.Thinning_is_enabled = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Friction_is_set = this.Friction_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Factor_is_set = this.Factor_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.T_is_set = this.T_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Material_is_set = this.Material_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Nodes_are_set = this.Nodes_are_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.PIP_is_set = this.PIP_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.NIP_is_set = this.NIP_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.original_thickness = this.original_thickness = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.friction = this.friction = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.factor = this.factor = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.thickness = this.thickness = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.printed_integration_point = this.printed_integration_point = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.Contact = this.Contact = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.number_of_integration_points = this.number_of_integration_points = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.kappaxy = this.kappaxy = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.kappay = this.kappay = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.kappax = this.kappax = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.dmxy = this.dmxy = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.dmy = this.dmy = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.dmx = this.dmx = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.area = this.area = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.internal_contact_line_element_3 = this.internal_contact_line_element_3 = (run.elements.Contact_Line)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.internal_contact_line_element_2 = this.internal_contact_line_element_2 = (run.elements.Contact_Line)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.internal_contact_line_element_1 = this.internal_contact_line_element_1 = (run.elements.Contact_Line)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.internal_contact_element = this.internal_contact_element = (run.elements.Contact_Triangle)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.load = this.load = (run.Load)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.material = this.material = (run.Material[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.weight_factor = this.weight_factor = (double[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.z = this.z = (double[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.trash = this.trash = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.a = this.a = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.v = this.v = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.p = this.p = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.Bs = this.Bs = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.Bb = this.Bb = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.Bm = this.Bm = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.moment = this.moment = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.force = this.force = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.stress = this.stress = (Jama.Matrix[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.strainrate = this.strainrate = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.dstrain = this.dstrain = (Jama.Matrix[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.strain = this.strain = (Jama.Matrix[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.local_coordinate_system = this.local_coordinate_system = (Jama.Matrix)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.internal_contact_line_element_3);
      c.descend(this.internal_contact_line_element_2);
      c.descend(this.internal_contact_line_element_1);
      c.descend(this.internal_contact_element);
      c.descend(this.load);
      c.descend(this.material);
      c.descend(this.weight_factor);
      c.descend(this.z);
      c.descend(this.trash);
      c.descend(this.a);
      c.descend(this.v);
      c.descend(this.p);
      c.descend(this.Bs);
      c.descend(this.Bb);
      c.descend(this.Bm);
      c.descend(this.moment);
      c.descend(this.force);
      c.descend(this.stress);
      c.descend(this.strainrate);
      c.descend(this.dstrain);
      c.descend(this.strain);
      c.descend(this.local_coordinate_system);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.internal_contact_line_element_3 = (run.elements.Contact_Line)f.filter(this.internal_contact_line_element_3);
      this.internal_contact_line_element_2 = (run.elements.Contact_Line)f.filter(this.internal_contact_line_element_2);
      this.internal_contact_line_element_1 = (run.elements.Contact_Line)f.filter(this.internal_contact_line_element_1);
      this.internal_contact_element = (run.elements.Contact_Triangle)f.filter(this.internal_contact_element);
      this.load = (run.Load)f.filter(this.load);
      this.material = (run.Material[])f.filter(this.material);
      this.weight_factor = (double[])f.filter(this.weight_factor);
      this.z = (double[])f.filter(this.z);
      this.trash = (Jama.Matrix)f.filter(this.trash);
      this.a = (Jama.Matrix)f.filter(this.a);
      this.v = (Jama.Matrix)f.filter(this.v);
      this.p = (Jama.Matrix)f.filter(this.p);
      this.Bs = (Jama.Matrix)f.filter(this.Bs);
      this.Bb = (Jama.Matrix)f.filter(this.Bb);
      this.Bm = (Jama.Matrix)f.filter(this.Bm);
      this.moment = (Jama.Matrix)f.filter(this.moment);
      this.force = (Jama.Matrix)f.filter(this.force);
      this.stress = (Jama.Matrix[])f.filter(this.stress);
      this.strainrate = (Jama.Matrix)f.filter(this.strainrate);
      this.dstrain = (Jama.Matrix[])f.filter(this.dstrain);
      this.strain = (Jama.Matrix[])f.filter(this.strain);
      this.local_coordinate_system = (Jama.Matrix)f.filter(this.local_coordinate_system);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new Shell_C0_3(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((Shell_C0_3)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Shell_C0_3)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Shell_C0_3)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new Shell_C0_3((Shell_C0_3)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((Shell_C0_3)copy).deepCloneReferences((Shell_C0_3)orig, _helper);
         return false;
      }
      public Class getType() {
         return Shell_C0_3.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double;
   public Shell_C0_3(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(Shell_C0_3._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.Thinning_is_enabled = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Friction_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Factor_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.T_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Material_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Nodes_are_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.PIP_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.NIP_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.original_thickness = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.friction = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.factor = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.thickness = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.printed_integration_point = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.Contact = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.number_of_integration_points = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.kappaxy = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.kappay = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.kappax = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.dmxy = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.dmy = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.dmx = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.area = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      _stream.accept(Shell_C0_3._SIZE);
      this.internal_contact_line_element_3 = (run.elements.Contact_Line)_stream.readReference();
      this.internal_contact_line_element_2 = (run.elements.Contact_Line)_stream.readReference();
      this.internal_contact_line_element_1 = (run.elements.Contact_Line)_stream.readReference();
      this.internal_contact_element = (run.elements.Contact_Triangle)_stream.readReference();
      this.load = (run.Load)_stream.readReference();
      this.material = (run.Material[])_stream.readReference();
      this.weight_factor = (double[])_stream.readReference();
      this.z = (double[])_stream.readReference();
      this.trash = (Jama.Matrix)_stream.readReference();
      this.a = (Jama.Matrix)_stream.readReference();
      this.v = (Jama.Matrix)_stream.readReference();
      this.p = (Jama.Matrix)_stream.readReference();
      this.Bs = (Jama.Matrix)_stream.readReference();
      this.Bb = (Jama.Matrix)_stream.readReference();
      this.Bm = (Jama.Matrix)_stream.readReference();
      this.moment = (Jama.Matrix)_stream.readReference();
      this.force = (Jama.Matrix)_stream.readReference();
      this.stress = (Jama.Matrix[])_stream.readReference();
      this.strainrate = (Jama.Matrix)_stream.readReference();
      this.dstrain = (Jama.Matrix[])_stream.readReference();
      this.strain = (Jama.Matrix[])_stream.readReference();
      this.local_coordinate_system = (Jama.Matrix)_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(Shell_C0_3._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Thinning_is_enabled);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Friction_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Factor_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.T_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Material_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Nodes_are_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.PIP_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.NIP_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.original_thickness);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.friction);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.factor);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.thickness);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.printed_integration_point);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Contact);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.number_of_integration_points);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.kappaxy);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.kappay);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.kappax);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.dmxy);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.dmy);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.dmx);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.area);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.internal_contact_line_element_3);
      _stream.writeReference(this.internal_contact_line_element_2);
      _stream.writeReference(this.internal_contact_line_element_1);
      _stream.writeReference(this.internal_contact_element);
      _stream.writeReference(this.load);
      _stream.writeReference(this.material);
      _stream.writeReference(this.weight_factor);
      _stream.writeReference(this.z);
      _stream.writeReference(this.trash);
      _stream.writeReference(this.a);
      _stream.writeReference(this.v);
      _stream.writeReference(this.p);
      _stream.writeReference(this.Bs);
      _stream.writeReference(this.Bb);
      _stream.writeReference(this.Bm);
      _stream.writeReference(this.moment);
      _stream.writeReference(this.force);
      _stream.writeReference(this.stress);
      _stream.writeReference(this.strainrate);
      _stream.writeReference(this.dstrain);
      _stream.writeReference(this.strain);
      _stream.writeReference(this.local_coordinate_system);
   }
   public Shell_C0_3(Shell_C0_3 _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.Thinning_is_enabled = _orig.Thinning_is_enabled;
      this.Friction_is_set = _orig.Friction_is_set;
      this.Factor_is_set = _orig.Factor_is_set;
      this.T_is_set = _orig.T_is_set;
      this.Material_is_set = _orig.Material_is_set;
      this.Nodes_are_set = _orig.Nodes_are_set;
      this.PIP_is_set = _orig.PIP_is_set;
      this.NIP_is_set = _orig.NIP_is_set;
      this.original_thickness = _orig.original_thickness;
      this.friction = _orig.friction;
      this.factor = _orig.factor;
      this.thickness = _orig.thickness;
      this.printed_integration_point = _orig.printed_integration_point;
      this.Contact = _orig.Contact;
      this.number_of_integration_points = _orig.number_of_integration_points;
      this.kappaxy = _orig.kappaxy;
      this.kappay = _orig.kappay;
      this.kappax = _orig.kappax;
      this.dmxy = _orig.dmxy;
      this.dmy = _orig.dmy;
      this.dmx = _orig.dmx;
      this.area = _orig.area;
   }
   public void deepCloneReferences(Shell_C0_3 _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.internal_contact_line_element_3 = (run.elements.Contact_Line)_helper.internalDeepClone(_orig.internal_contact_line_element_3);
      this.internal_contact_line_element_2 = (run.elements.Contact_Line)_helper.internalDeepClone(_orig.internal_contact_line_element_2);
      this.internal_contact_line_element_1 = (run.elements.Contact_Line)_helper.internalDeepClone(_orig.internal_contact_line_element_1);
      this.internal_contact_element = (run.elements.Contact_Triangle)_helper.internalDeepClone(_orig.internal_contact_element);
      this.load = (run.Load)_helper.internalDeepClone(_orig.load);
      this.material = (run.Material[])_helper.internalDeepClone(_orig.material);
      this.weight_factor = (double[])_helper.internalDeepClone(_orig.weight_factor);
      this.z = (double[])_helper.internalDeepClone(_orig.z);
      this.trash = (Jama.Matrix)_helper.internalDeepClone(_orig.trash);
      this.a = (Jama.Matrix)_helper.internalDeepClone(_orig.a);
      this.v = (Jama.Matrix)_helper.internalDeepClone(_orig.v);
      this.p = (Jama.Matrix)_helper.internalDeepClone(_orig.p);
      this.Bs = (Jama.Matrix)_helper.internalDeepClone(_orig.Bs);
      this.Bb = (Jama.Matrix)_helper.internalDeepClone(_orig.Bb);
      this.Bm = (Jama.Matrix)_helper.internalDeepClone(_orig.Bm);
      this.moment = (Jama.Matrix)_helper.internalDeepClone(_orig.moment);
      this.force = (Jama.Matrix)_helper.internalDeepClone(_orig.force);
      this.stress = (Jama.Matrix[])_helper.internalDeepClone(_orig.stress);
      this.strainrate = (Jama.Matrix)_helper.internalDeepClone(_orig.strainrate);
      this.dstrain = (Jama.Matrix[])_helper.internalDeepClone(_orig.dstrain);
      this.strain = (Jama.Matrix[])_helper.internalDeepClone(_orig.strain);
      this.local_coordinate_system = (Jama.Matrix)_helper.internalDeepClone(_orig.local_coordinate_system);
   }
   private static int DISABLED = 0;
   private static int BASIC = 1;
   private static int EDGE = 2;
   private double area;
   private Jama.Matrix local_coordinate_system;
   private Jama.Matrix[] strain;
   private Jama.Matrix[] dstrain;
   private Jama.Matrix strainrate;
   private Jama.Matrix[] stress;
   private Jama.Matrix force;
   private Jama.Matrix moment;
   private Jama.Matrix Bm;
   private Jama.Matrix Bb;
   private Jama.Matrix Bs;
   private Jama.Matrix p;
   private Jama.Matrix v;
   private Jama.Matrix a;
   private Jama.Matrix trash;
   private double dmx;
   private double dmy;
   private double dmxy;
   private double kappax;
   private double kappay;
   private double kappaxy;
   private double[] z;
   private double[] weight_factor;
   private int number_of_integration_points;
   private int Contact;
   private int printed_integration_point;
   private double thickness;
   private double factor;
   private double friction;
   private double original_thickness;
   private Material[] material;
   private Load load;
   private boolean NIP_is_set;
   private boolean PIP_is_set;
   private boolean Nodes_are_set;
   private boolean Material_is_set;
   private boolean T_is_set;
   private boolean Factor_is_set;
   private boolean Friction_is_set;
   private boolean Thinning_is_enabled;
   private Contact_Triangle internal_contact_element;
   private Contact_Line internal_contact_line_element_1;
   private Contact_Line internal_contact_line_element_2;
   private Contact_Line internal_contact_line_element_3;
   public Shell_C0_3() {
      super();
      this.type = new String("SHELL_C0_3");
      int i;
      this.p = new Jama.Matrix(9, 1);
      this.v = new Jama.Matrix(9, 1);
      this.a = new Jama.Matrix(9, 1);
      this.trash = new Jama.Matrix(9, 1);
      this.Bm = new Jama.Matrix(3, 6);
      this.Bb = new Jama.Matrix(3, 6);
      this.Bs = new Jama.Matrix(2, 6);
      this.node = new Node[3];
      this.force = new Jama.Matrix(9, 1);
      this.moment = new Jama.Matrix(9, 1);
      this.material = new Material[5];
      this.strainrate = new Jama.Matrix(6, 1);
      this.local_coordinate_system = new Jama.Matrix(3, 3);
      this.strain = new Jama.Matrix[5];
      for (i = 0; i < 5; i++) {
         this.strain[i] = new Jama.Matrix(6, 1);
      }
      this.dstrain = new Jama.Matrix[5];
      for (i = 0; i < 5; i++) {
         this.dstrain[i] = new Jama.Matrix(6, 1);
      }
      this.stress = new Jama.Matrix[5];
      for (i = 0; i < 5; i++) {
         this.stress[i] = new Jama.Matrix(6, 1);
      }
      this.z = new double[5];
      this.weight_factor = new double[5];
      this.Contact = run.elements.Shell_C0_3.BASIC;
      this.Thinning_is_enabled = true;
      this.number_of_integration_points = 5;
   }
   public void assembleMassMatrix() throws IllegalArgumentException {
      Jama.Matrix inertia;
      inertia = new Jama.Matrix(3, 3);
      double I;
      double mass;
      this.updateLocalCoordinateSystem();
      this.calculateLocalVariables();
      mass = this.material[0].getDensity() * this.area * this.thickness;
      this.node[0].addMass(mass / 3);
      this.node[1].addMass(mass / 3);
      this.node[2].addMass(mass / 3);
      I = mass / 3 * (this.area / 12 + this.thickness * this.thickness / 12);
      inertia.set(0, 0, I);
      inertia.set(1, 1, I);
      inertia.set(2, 2, I);
      inertia.set(1, 0, 0);
      inertia.set(2, 0, 0);
      inertia.set(0, 1, 0);
      inertia.set(0, 2, 0);
      inertia.set(2, 1, 0);
      inertia.set(1, 2, 0);
      this.node[0].addInertia(inertia);
      this.node[1].addInertia(inertia);
      this.node[2].addInertia(inertia);
      if (this.Contact == run.elements.Shell_C0_3.BASIC || this.Contact == run.elements.Shell_C0_3.EDGE) {
         this.internal_contact_element.assembleMassMatrix();
      }
      if (this.Contact == run.elements.Shell_C0_3.EDGE) {
         if (this.internal_contact_line_element_1 != null) {
            this.internal_contact_line_element_1.assembleMassMatrix();
         }
         if (this.internal_contact_line_element_2 != null) {
            this.internal_contact_line_element_2.assembleMassMatrix();
         }
         if (this.internal_contact_line_element_3 != null) {
            this.internal_contact_line_element_3.assembleMassMatrix();
         }
      }
   }
   public void calculateContactForces() {
      if (this.Contact == run.elements.Shell_C0_3.BASIC || this.Contact == run.elements.Shell_C0_3.EDGE) {
         this.internal_contact_element.calculateContactForces();
      }
      if (this.Contact == run.elements.Shell_C0_3.EDGE) {
         if (this.internal_contact_line_element_1 != null) {
            this.internal_contact_line_element_1.calculateContactForces();
         }
         if (this.internal_contact_line_element_2 != null) {
            this.internal_contact_line_element_2.calculateContactForces();
         }
         if (this.internal_contact_line_element_3 != null) {
            this.internal_contact_line_element_3.calculateContactForces();
         }
      }
   }
   public void calculateExternalForces(double currtime) {
      int i;
      Matrix f = new Matrix(3, 1);
      if (this.load != null) {
         f.set(0, 0, 0);
         f.set(1, 0, 0);
         f.set(2, 0, this.area * this.load.getPressure(currtime) / 3);
         f = this.local_coordinate_system.transpose().times(f);
         for (i = 0; i < 3; i++) {
            this.node[i].addExternalForce(f);
         }
      }
      if (this.Contact == run.elements.Shell_C0_3.BASIC || this.Contact == run.elements.Shell_C0_3.EDGE) {
         this.internal_contact_element.calculateExternalForces(currtime);
      }
      if (this.Contact == run.elements.Shell_C0_3.EDGE) {
         if (this.internal_contact_line_element_1 != null) {
            this.internal_contact_line_element_1.calculateExternalForces(currtime);
         }
         if (this.internal_contact_line_element_2 != null) {
            this.internal_contact_line_element_2.calculateExternalForces(currtime);
         }
         if (this.internal_contact_line_element_3 != null) {
            this.internal_contact_line_element_3.calculateExternalForces(currtime);
         }
      }
   }
   public void calculateNodalForces(int integration_point, double timestep) {
      Matrix f;
      Matrix ft;
      Matrix transposed_coordinate_system;
      if (integration_point == 0) {
         if (this.area <= 0) {
            throw new IllegalArgumentException("Error in Shell_C0_3 element. Negative or zero area. ");
         }
      }
      f = new Matrix(3, 1);
      f.set(0, 0, 0.5 * this.thickness * this.weight_factor[integration_point] * this.stress[integration_point].get(0, 0));
      f.set(1, 0, 0.5 * this.thickness * this.weight_factor[integration_point] * this.stress[integration_point].get(1, 0));
      f.set(2, 0, 0.5 * this.thickness * this.weight_factor[integration_point] * this.stress[integration_point].get(3, 0));
      this.force.setMatrix(0, 5, 0, 0, this.Bm.transpose().times(f).times(this.area));
      f.timesEquals(-this.z[integration_point]);
      ft = new Matrix(2, 1);
      ft.set(0, 0, 0.5 * this.thickness * this.weight_factor[integration_point] * this.stress[integration_point].get(5, 0));
      ft.set(1, 0, 0.5 * this.thickness * this.weight_factor[integration_point] * this.stress[integration_point].get(4, 0));
      this.moment.setMatrix(0, 5, 0, 0, this.Bb.transpose().times(f).plus(this.Bs.transpose().times(ft)).times(this.area));
      this.force.setMatrix(6, 7, 0, 0, this.force.getMatrix(4, 5, 0, 0));
      this.force.setMatrix(3, 4, 0, 0, this.force.getMatrix(2, 3, 0, 0));
      this.moment.setMatrix(6, 7, 0, 0, this.moment.getMatrix(4, 5, 0, 0));
      this.moment.setMatrix(3, 4, 0, 0, this.moment.getMatrix(2, 3, 0, 0));
      this.force.set(8, 0, -(this.moment.get(0, 0) + this.moment.get(3, 0) + this.moment.get(6, 0)) / this.p.get(7, 0));
      this.force.set(5, 0, (this.moment.get(1, 0) + this.moment.get(4, 0) + this.moment.get(7, 0) - this.p.get(6, 0) * this.force.get(8, 0)) / this.p.get(3, 0));
      this.force.set(2, 0, -this.force.get(5, 0) - this.force.get(8, 0));
      this.moment.set(2, 0, 0);
      this.moment.set(5, 0, 0);
      this.moment.set(8, 0, 0);
      transposed_coordinate_system = this.local_coordinate_system.transpose();
      this.moment.setMatrix(0, 2, 0, 0, transposed_coordinate_system.times(this.moment.getMatrix(0, 2, 0, 0)));
      this.moment.setMatrix(3, 5, 0, 0, transposed_coordinate_system.times(this.moment.getMatrix(3, 5, 0, 0)));
      this.moment.setMatrix(6, 8, 0, 0, transposed_coordinate_system.times(this.moment.getMatrix(6, 8, 0, 0)));
      this.force.setMatrix(0, 2, 0, 0, transposed_coordinate_system.times(this.force.getMatrix(0, 2, 0, 0)));
      this.force.setMatrix(3, 5, 0, 0, transposed_coordinate_system.times(this.force.getMatrix(3, 5, 0, 0)));
      this.force.setMatrix(6, 8, 0, 0, transposed_coordinate_system.times(this.force.getMatrix(6, 8, 0, 0)));
      this.force.timesEquals(-1.0);
      this.moment.timesEquals(-1.0);
      this.node[0].addInternalForce(this.force.getMatrix(0, 2, 0, 0));
      this.node[0].addInternalMoment(this.moment.getMatrix(0, 2, 0, 0));
      this.node[1].addInternalForce(this.force.getMatrix(3, 5, 0, 0));
      this.node[1].addInternalMoment(this.moment.getMatrix(3, 5, 0, 0));
      this.node[2].addInternalForce(this.force.getMatrix(6, 8, 0, 0));
      this.node[2].addInternalMoment(this.moment.getMatrix(6, 8, 0, 0));
   }
   public void calculateStrain(double tstep, int integration_point) {
      double rbx;
      double rby;
      if (integration_point == 0) {
         this.updateLocalCoordinateSystem();
         this.calculateLocalVariables();
         this.Bm.set(0, 0, -this.p.get(7, 0));
         this.Bm.set(0, 2, this.p.get(7, 0));
         this.Bm.set(1, 1, this.p.get(6, 0) - this.p.get(3, 0));
         this.Bm.set(1, 3, -this.p.get(6, 0));
         this.Bm.set(1, 5, this.p.get(3, 0));
         this.Bm.set(2, 0, this.p.get(6, 0) - this.p.get(3, 0));
         this.Bm.set(2, 1, -this.p.get(7, 0));
         this.Bm.set(2, 2, -this.p.get(6, 0));
         this.Bm.set(2, 3, this.p.get(7, 0));
         this.Bm.set(2, 4, this.p.get(3, 0));
         this.Bm.timesEquals(1.0 / (2.0 * this.area));
         this.Bb.set(0, 1, -this.p.get(7, 0));
         this.Bb.set(0, 3, this.p.get(7, 0));
         this.Bb.set(1, 0, this.p.get(3, 0) - this.p.get(6, 0));
         this.Bb.set(1, 2, this.p.get(6, 0));
         this.Bb.set(1, 4, -this.p.get(3, 0));
         this.Bb.set(2, 0, this.p.get(7, 0));
         this.Bb.set(2, 1, this.p.get(6, 0) - this.p.get(3, 0));
         this.Bb.set(2, 2, -this.p.get(7, 0));
         this.Bb.set(2, 3, -this.p.get(6, 0));
         this.Bb.set(2, 5, this.p.get(3, 0));
         this.Bb.timesEquals(-1.0 / (2.0 * this.area));
         this.Bs.set(0, 0, -this.p.get(7, 0) * this.p.get(7, 0));
         this.Bs.set(0, 1, this.p.get(7, 0) * (2.0 * this.p.get(3, 0) + this.p.get(6, 0)));
         this.Bs.set(0, 2, this.p.get(7, 0) * this.p.get(7, 0));
         this.Bs.set(0, 3, this.p.get(7, 0) * (3.0 * this.p.get(3, 0) - this.p.get(6, 0)));
         this.Bs.set(0, 5, this.p.get(3, 0) * this.p.get(7, 0));
         this.Bs.set(1, 0, this.p.get(7, 0) * (this.p.get(6, 0) - 2.0 * this.p.get(3, 0)));
         this.Bs.set(1, 1, this.p.get(3, 0) * this.p.get(3, 0) - this.p.get(6, 0) * this.p.get(6, 0));
         this.Bs.set(1, 2, -this.p.get(7, 0) * (this.p.get(3, 0) + this.p.get(6, 0)));
         this.Bs.set(1, 3, this.p.get(6, 0) * (this.p.get(6, 0) - 2.0 * this.p.get(3, 0)));
         this.Bs.set(1, 4, -3.0 * this.p.get(3, 0) * this.p.get(7, 0));
         this.Bs.set(1, 5, this.p.get(3, 0) * (2.0 * this.p.get(6, 0) - this.p.get(3, 0)));
         this.Bs.timesEquals(1.0 / (12.0 * this.area));
         rbx = ((this.v.get(8, 0) - this.v.get(2, 0)) * this.p.get(3, 0) - (this.v.get(5, 0) - this.v.get(2, 0)) * this.p.get(6, 0)) / (this.p.get(3, 0) * this.p.get(7, 0));
         rby = (this.v.get(2, 0) - this.v.get(5, 0)) / this.p.get(3, 0);
         this.a.set(0, 0, this.a.get(0, 0) - rbx);
         this.a.set(1, 0, this.a.get(1, 0) - rby);
         this.a.set(3, 0, this.a.get(3, 0) - rbx);
         this.a.set(4, 0, this.a.get(4, 0) - rby);
         this.a.set(6, 0, this.a.get(6, 0) - rbx);
         this.a.set(7, 0, this.a.get(7, 0) - rby);
         this.dmx = this.Bm.get(0, 0) * this.v.get(0, 0) + this.Bm.get(0, 2) * this.v.get(3, 0);
         this.dmy = this.Bm.get(1, 1) * this.v.get(1, 0) + this.Bm.get(1, 3) * this.v.get(4, 0) + this.Bm.get(1, 5) * this.v.get(7, 0);
         this.dmxy = this.Bm.get(2, 0) * this.v.get(0, 0) + this.Bm.get(2, 1) * this.v.get(1, 0) + this.Bm.get(2, 2) * this.v.get(3, 0) + this.Bm.get(2, 3) * this.v.get(4, 0) + this.Bm.get(2, 4) * this.v.get(6, 0);
         this.kappax = this.Bb.get(0, 1) * this.a.get(1, 0) + this.Bb.get(0, 3) * this.a.get(4, 0);
         this.kappay = this.Bb.get(1, 0) * this.a.get(0, 0) + this.Bb.get(1, 2) * this.a.get(3, 0) + this.Bb.get(1, 4) * this.a.get(6, 0);
         this.kappaxy = this.Bb.get(2, 0) * this.a.get(0, 0) + this.Bb.get(2, 1) * this.a.get(1, 0) + this.Bb.get(2, 2) * this.a.get(3, 0) + this.Bb.get(2, 3) * this.a.get(4, 0) + this.Bb.get(2, 5) * this.a.get(7, 0);
      }
      this.strainrate.set(0, 0, this.dmx - this.z[integration_point] * this.kappax);
      this.strainrate.set(1, 0, this.dmy - this.z[integration_point] * this.kappay);
      this.strainrate.set(3, 0, this.dmxy - this.z[integration_point] * this.kappaxy);
      this.strainrate.set(4, 0, this.Bs.get(1, 0) * this.a.get(0, 0) + this.Bs.get(1, 1) * this.a.get(1, 0) + this.Bs.get(1, 2) * this.a.get(3, 0) + this.Bs.get(1, 3) * this.a.get(4, 0) + this.Bs.get(1, 4) * this.a.get(6, 0) + this.Bs.get(1, 5) * this.a.get(7, 0));
      this.strainrate.set(5, 0, this.Bs.get(0, 0) * this.a.get(0, 0) + this.Bs.get(0, 1) * this.a.get(1, 0) + this.Bs.get(0, 2) * this.a.get(3, 0) + this.Bs.get(0, 3) * this.a.get(4, 0) + this.Bs.get(0, 5) * this.a.get(7, 0));
      this.dstrain[integration_point] = this.strainrate.times(tstep);
   }
   public void calculateStress(int integration_point, double timestep) {
      this.material[integration_point].calculateStressTwoDimensionalPlaneStress(this.strain[integration_point], this.dstrain[integration_point], this.stress[integration_point], timestep);
      if (this.Thinning_is_enabled && integration_point == this.number_of_integration_points / 2) {
         this.thickness = (1 + this.strain[this.number_of_integration_points / 2].get(2, 0)) * this.original_thickness;
      }
   }
   public double checkTimestep(double current_timestep) {
      double critical_length;
      double timestep;
      critical_length = Math.sqrt((this.node[1].getX_pos() - this.node[0].getX_pos()) * (this.node[1].getX_pos() - this.node[0].getX_pos()) + (this.node[1].getY_pos() - this.node[0].getY_pos()) * (this.node[1].getY_pos() - this.node[0].getY_pos()) + (this.node[1].getZ_pos() - this.node[0].getZ_pos()) * (this.node[1].getZ_pos() - this.node[0].getZ_pos()));
      critical_length = Math.max(critical_length, Math.sqrt((this.node[2].getX_pos() - this.node[1].getX_pos()) * (this.node[2].getX_pos() - this.node[1].getX_pos()) + (this.node[2].getY_pos() - this.node[1].getY_pos()) * (this.node[2].getY_pos() - this.node[1].getY_pos()) + (this.node[2].getZ_pos() - this.node[1].getZ_pos()) * (this.node[2].getZ_pos() - this.node[1].getZ_pos())));
      critical_length = Math.max(critical_length, Math.sqrt((this.node[0].getX_pos() - this.node[2].getX_pos()) * (this.node[0].getX_pos() - this.node[2].getX_pos()) + (this.node[0].getY_pos() - this.node[2].getY_pos()) * (this.node[0].getY_pos() - this.node[2].getY_pos()) + (this.node[0].getZ_pos() - this.node[2].getZ_pos()) * (this.node[0].getZ_pos() - this.node[2].getZ_pos())));
      critical_length = 2.0 * this.area / critical_length;
      timestep = critical_length / this.material[0].wavespeedTwoDimensional(0.0, 0.0);
      return Math.min(0.96 * timestep, current_timestep);
   }
   public int getNumberOfIntegrationPoints() {
      return this.number_of_integration_points;
   }
   public void parse_Fembic(Token[] param, int lineno, RplVector nodelist, RplVector materiallist, RplVector loadlist, Hashtable nodetable) throws java.text.ParseException {
      int j;
      int i = 0;
      int index;
      Load temp_load;
      Token[] contact_input;
      while (i < param.length) {
         if (param[i].getw().toUpperCase().equals("NODES") && param[i + 1].getw().toUpperCase().equals("=")) {
            if (!param[i + 2].getw().toUpperCase().startsWith("[") || !param[i + 2].getw().toUpperCase().endsWith("]")) {
               throw new java.text.ParseException("Error, node number definition should be [nodenr1,nodenr2,nodenr3]", lineno);
            }
            try {
               for (j = 0; j < 3; j++) {
                  this.node[j] = super.findNode(super.getNodeNumber(j + 1, param[i + 2].getw()), nodetable);
               }
               i += 3;
               this.Nodes_are_set = true;
            }  catch (IllegalArgumentException e) {
               throw new java.text.ParseException(e.getMessage() + " in line ", lineno);
            }
         } else if (param[i].getw().toUpperCase().equals("MATERIAL") && param[i + 1].getw().toUpperCase().equals("=")) {
            try {
               this.material[0] = super.findMaterial(param[i + 2].getw().toUpperCase(), materiallist);
               i += 3;
               this.Material_is_set = true;
            }  catch (IllegalArgumentException e) {
               throw new ParseException(e.getMessage() + "In line ", lineno);
            }
         } else if (param[i].getw().toUpperCase().equals("NIP") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.number_of_integration_points = (int)param[i + 2].getn();
            i += 3;
            this.NIP_is_set = true;
         } else if (param[i].getw().toUpperCase().equals("PIP") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.printed_integration_point = (int)param[i + 2].getn() - 1;
            i += 3;
            this.PIP_is_set = true;
         } else if (param[i].getw().toUpperCase().equals("T") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.thickness = param[i + 2].getn();
            this.original_thickness = this.thickness;
            i += 3;
            this.T_is_set = true;
         } else if (param[i].getw().toUpperCase().equals("FACTOR") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.factor = param[i + 2].getn();
            i += 3;
            this.Factor_is_set = true;
         } else if (param[i].getw().toUpperCase().equals("FRICTION") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.friction = param[i + 2].getn();
            i += 3;
            this.Friction_is_set = true;
         } else if (param[i].getw().toUpperCase().equals("LOAD") && param[i + 2].is_a_word()) {
            for (index = 0; index < loadlist.size(); index++) {
               temp_load = (Load)loadlist.elementAt(index);
               if (temp_load.name.equals(param[i + 2].getw().toUpperCase())) {
                  this.load = temp_load;
                  break;
               }
            }
            if (index == loadlist.size()) {
               throw new java.text.ParseException("Load name specified does not exist", lineno);
            }
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("CONTACT") && param[i + 1].getw().toUpperCase().equals("=")) {
            if (param[i + 2].getw().toUpperCase().equals("OFF")) {
               this.Contact = run.elements.Shell_C0_3.DISABLED;
            } else if (param[i + 2].getw().toUpperCase().equals("EDGE")) {
               this.Contact = run.elements.Shell_C0_3.EDGE;
            } else {
               throw new ParseException("Unrecognized contact parameter", lineno);
            }
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("THINNING") && param[i + 1].getw().toUpperCase().equals("=")) {
            if (param[i + 2].getw().toUpperCase().equals("OFF")) {
               this.Thinning_is_enabled = false;
            } else {
               throw new ParseException("Unrecognized thinning parameter", lineno);
            }
            i += 3;
         } else {
            throw new java.text.ParseException("Unknown Shell element parameter ", lineno);
         }
      }
      i = 6;
      if (this.Factor_is_set) {
         i += 3;
      }
      if (this.Friction_is_set) {
         i += 3;
      }
      contact_input = new Token[i];
      i = 6;
      if (this.Contact == run.elements.Shell_C0_3.BASIC || this.Contact == run.elements.Shell_C0_3.EDGE) {
         this.internal_contact_element = new Contact_Triangle();
         this.internal_contact_element.setNumber(-1);
         contact_input[0] = new Token(new String("nodes"));
         contact_input[1] = new Token(new String("="));
         contact_input[2] = new Token(new String("[" + this.node[0].getNumber() + "," + this.node[1].getNumber() + "," + this.node[2].getNumber() + "]"));
         contact_input[3] = new Token(new String("t"));
         contact_input[4] = new Token(new String("="));
         contact_input[5] = new Token(this.thickness);
         if (this.Factor_is_set) {
            contact_input[i] = new Token(new String("factor"));
            contact_input[i + 1] = new Token(new String("="));
            contact_input[i + 2] = new Token(this.factor);
            i += 3;
         }
         if (this.Friction_is_set) {
            contact_input[i] = new Token(new String("friction"));
            contact_input[i + 1] = new Token(new String("="));
            contact_input[i + 2] = new Token(this.friction);
            i += 3;
         }
         this.internal_contact_element.parse_Fembic(contact_input, lineno, nodelist, materiallist, loadlist, nodetable);
      }
      if (this.Contact == run.elements.Shell_C0_3.EDGE) {
         if (!this.node[0].hasContact_LineElementConnectedTo(this.node[1])) {
            this.internal_contact_line_element_1 = new Contact_Line();
            this.internal_contact_line_element_1.setNumber(-1);
            contact_input[2] = new Token(new String("[" + this.node[0].getNumber() + "," + this.node[1].getNumber() + "]"));
            contact_input[3] = new Token(new String("D"));
            contact_input[4] = new Token(new String("="));
            contact_input[5] = new Token(this.thickness);
            this.internal_contact_line_element_1.parse_Fembic(contact_input, lineno, nodelist, materiallist, loadlist, nodetable);
         }
         if (!this.node[1].hasContact_LineElementConnectedTo(this.node[2])) {
            this.internal_contact_line_element_2 = new Contact_Line();
            this.internal_contact_line_element_2.setNumber(-2);
            contact_input[2] = new Token(new String("[" + this.node[1].getNumber() + "," + this.node[2].getNumber() + "]"));
            contact_input[3] = new Token(new String("D"));
            contact_input[4] = new Token(new String("="));
            contact_input[5] = new Token(this.thickness);
            this.internal_contact_line_element_2.parse_Fembic(contact_input, lineno, nodelist, materiallist, loadlist, nodetable);
         }
         if (!this.node[2].hasContact_LineElementConnectedTo(this.node[0])) {
            this.internal_contact_line_element_3 = new Contact_Line();
            this.internal_contact_line_element_3.setNumber(-3);
            contact_input[2] = new Token(new String("[" + this.node[2].getNumber() + "," + this.node[0].getNumber() + "]"));
            contact_input[3] = new Token(new String("D"));
            contact_input[4] = new Token(new String("="));
            contact_input[5] = new Token(this.thickness);
            this.internal_contact_line_element_3.parse_Fembic(contact_input, lineno, nodelist, materiallist, loadlist, nodetable);
         }
      }
   }
   public void checkIndata() throws IllegalArgumentException {
      if (!this.Nodes_are_set) {
         throw new IllegalArgumentException("No nodes defined for Shell_C0_3 element nr" + this.number);
      }
      if (!this.Material_is_set) {
         throw new IllegalArgumentException("No Material defined for Shell_C0_3 element nr" + this.number);
      }
      if (!this.T_is_set) {
         throw new IllegalArgumentException("No Thickness (T) defined for Shell_C0_3 element nr" + this.number);
      }
      if (this.PIP_is_set) {
         if (this.printed_integration_point >= this.number_of_integration_points) {
            throw new IllegalArgumentException("Printed integration point larger than available points");
         }
         if (this.printed_integration_point < 0) {
            throw new IllegalArgumentException("Printed integration point less than 1");
         }
      }
      if (this.Contact == run.elements.Shell_C0_3.BASIC || this.Contact == run.elements.Shell_C0_3.EDGE) {
         this.internal_contact_element.checkIndata();
      }
      if (this.Contact == run.elements.Shell_C0_3.EDGE) {
         if (this.internal_contact_line_element_1 != null) {
            this.internal_contact_line_element_1.checkIndata();
         }
         if (this.internal_contact_line_element_2 != null) {
            this.internal_contact_line_element_2.checkIndata();
         }
         if (this.internal_contact_line_element_3 != null) {
            this.internal_contact_line_element_3.checkIndata();
         }
      }
   }
   public void checkIfFailed() {
      if (!this.material[0].failureStrainIsSet() && !this.material[0].failureStressIsSet()) {
         this.failed = false;
         return;
      }
      if (this.material[0].failureStressIsSet()) {
         double s = 0.7071F * Math.sqrt(Math.pow(this.stress[this.printed_integration_point].get(0, 0) - this.stress[this.printed_integration_point].get(1, 0), 2) + Math.pow(this.stress[this.printed_integration_point].get(1, 0) - this.stress[this.printed_integration_point].get(2, 0), 2) + Math.pow(this.stress[this.printed_integration_point].get(2, 0) - this.stress[this.printed_integration_point].get(0, 0), 2) + 6 * (Math.pow(this.stress[this.printed_integration_point].get(3, 0), 2) + Math.pow(this.stress[this.printed_integration_point].get(4, 0), 2) + Math.pow(this.stress[this.printed_integration_point].get(5, 0), 2)));
         if (s > this.material[0].getFailureStress()) {
            this.failed = true;
            return;
         }
      }
      if (this.material[0].failureStrainIsSet()) {
         double e = 0.4714F * Math.sqrt(Math.pow(this.strain[this.printed_integration_point].get(0, 0) - this.strain[this.printed_integration_point].get(1, 0), 2) + Math.pow(this.strain[this.printed_integration_point].get(1, 0) - this.strain[this.printed_integration_point].get(2, 0), 2) + Math.pow(this.strain[this.printed_integration_point].get(2, 0) - this.strain[this.printed_integration_point].get(0, 0), 2) + 1.5 * (Math.pow(this.strain[this.printed_integration_point].get(3, 0), 2) + Math.pow(this.strain[this.printed_integration_point].get(4, 0), 2) + Math.pow(this.strain[this.printed_integration_point].get(5, 0), 2)));
         if (e > this.material[0].getFailureStrain()) {
            this.failed = true;
            return;
         }
      }
      this.failed = false;
   }
   public String print_Gid(int ctrl, int gpn) {
      String out;
      int i;
      switch (ctrl) {
      case run.Element.MESH_HEADER: 
         out = new String("MESH \"MeshType" + this.type + "\" Dimension 3 ElemType Triangle Nnode 3\n");
         return out;
      
      case run.Element.MESH: 
         out = new String(this.number + "\t" + this.node[0].getNumber() + "\t" + this.node[1].getNumber() + "\t" + this.node[2].getNumber() + "\n");
         return out;
      
      case run.Element.RESULT_HEADER: 
         out = new String("GaussPoints \"Type" + this.type + "\" ElemType Triangle \"MeshType" + this.type + "\"\n");
         out += "Number Of Gauss Points: 1\n";
         out += "Nodes Not Included\n";
         out += "Natural Coordinates: Given\n";
         out += "0.0 0.0 \n";
         out += "End GaussPoints\n";
         return out;
      
      case run.Element.RESULT_SUB_HEADER: 
         out = new String(" 3 2 0 \"Type" + this.type + "\"\n");
         return out;
      
      case run.Element.RESULT_STRESS_LOCAL: 
         if (gpn == 0) {
            out = new String(this.number + " ");
            for (i = 0; i < 6; i++) {
               out += this.stress[this.printed_integration_point].get(i, 0) + "\t";
            }
            out += "\n";
         } else {
            out = new String("");
         }
         return out;
      
      case run.Element.RESULT_STRAIN_LOCAL: 
         if (gpn == 0) {
            out = new String(this.number + " ");
            for (i = 0; i < 6; i++) {
               out += this.strain[this.printed_integration_point].get(i, 0) + "\t";
            }
            out += "\n";
         } else {
            out = new String("");
         }
         return out;
      
      default: 
         return new String("");
      
      }
   }
   public String print_Fembic(int ctrl, int gpn) {
      String out;
      switch (ctrl) {
      case run.Element.MESH: 
         out = new String(this.number + "\t nodes = [" + this.node[0].getNumber() + "," + this.node[1].getNumber() + "," + this.node[2].getNumber() + "]\t" + "T = " + this.thickness + "\t" + "material = " + this.material[0].getName() + "\t");
         if (this.Factor_is_set) out += "factor = " + this.factor;
         if (this.Friction_is_set) out += "friction = " + this.friction;
         if (this.Contact == run.elements.Shell_C0_3.DISABLED) out += " contact = OFF";
         if (this.Contact == run.elements.Shell_C0_3.EDGE) out += " contact = EDGE";
         if (this.NIP_is_set) out += " nip = " + this.number_of_integration_points;
         if (this.PIP_is_set) out += " pip = " + this.printed_integration_point;
         if (this.load != null) out += " load = " + this.load.getName();
         if (!this.Thinning_is_enabled) out += " thinning = OFF";
         out += "\n";
         return out;
      
      default: 
         return new String("");
      
      }
   }
   public void setInitialConditions() {
      int i;
      try {
         for (i = 0; i < this.number_of_integration_points; i++) {
            this.material[i] = (Material)this.material[0].copy();
         }
      }  catch (CloneNotSupportedException e) {
         System.err.println("Object cannot clone");
      }
      for (i = 0; i < this.number_of_integration_points; i++) {
         this.material[i].setInitialConditions();
      }
      if (this.number_of_integration_points == 1) {
         this.z[0] = 0 * (this.thickness / 2.0);
         this.weight_factor[0] = 2.0;
      } else if (this.number_of_integration_points == 2) {
         this.z[0] = 0.577350269189626 * (this.thickness / 2.0);
         this.weight_factor[0] = 1.0;
         this.z[1] = -0.577350269189626 * (this.thickness / 2.0);
         this.weight_factor[1] = 1.0;
      } else if (this.number_of_integration_points == 3) {
         this.z[0] = 0.774596669241483 * (this.thickness / 2.0);
         this.weight_factor[0] = 5.0 / 9.0;
         this.z[1] = 0 * (this.thickness / 2.0);
         this.weight_factor[1] = 8.0 / 9.0;
         this.z[2] = -0.774596669241483 * (this.thickness / 2.0);
         this.weight_factor[2] = 5.0 / 9.0;
      } else if (this.number_of_integration_points == 4) {
         this.z[0] = 0.861136311594053 * (this.thickness / 2.0);
         this.weight_factor[0] = 0.347854845137454;
         this.z[1] = 0.339981043584856 * (this.thickness / 2.0);
         this.weight_factor[1] = 0.652145154862546;
         this.z[2] = -0.339981043584856 * (this.thickness / 2.0);
         this.weight_factor[2] = 0.652145154862546;
         this.z[3] = -0.861136311594053 * (this.thickness / 2.0);
         this.weight_factor[1] = 0.347854845137454;
      } else if (this.number_of_integration_points == 5) {
         this.z[0] = 0.90618 * (this.thickness / 2.0);
         this.weight_factor[0] = 0.236927;
         this.z[1] = 0.538469 * (this.thickness / 2.0);
         this.weight_factor[1] = 0.478629;
         this.z[2] = 0 * (this.thickness / 2.0);
         this.weight_factor[2] = 0.568889;
         this.z[3] = -0.538469 * (this.thickness / 2.0);
         this.weight_factor[3] = 0.478629;
         this.z[4] = -0.90618 * (this.thickness / 2.0);
         this.weight_factor[4] = 0.236927;
      }
      if (this.Contact == run.elements.Shell_C0_3.BASIC || this.Contact == run.elements.Shell_C0_3.EDGE) {
         this.internal_contact_element.setInitialConditions();
      }
      if (this.Contact == run.elements.Shell_C0_3.EDGE) {
         if (this.internal_contact_line_element_1 != null) {
            this.internal_contact_line_element_1.setInitialConditions();
         }
         if (this.internal_contact_line_element_2 != null) {
            this.internal_contact_line_element_2.setInitialConditions();
         }
         if (this.internal_contact_line_element_3 != null) {
            this.internal_contact_line_element_3.setInitialConditions();
         }
      }
      if (!this.PIP_is_set) {
         this.printed_integration_point = this.number_of_integration_points / 2;
      }
   }
   public void updateLocalCoordinateSystem() {
      this.calculateLocalBaseVectors(this.node[0].getX_pos(), this.node[0].getY_pos(), this.node[0].getZ_pos(), this.node[1].getX_pos(), this.node[1].getY_pos(), this.node[1].getZ_pos(), this.node[2].getX_pos(), this.node[2].getY_pos(), this.node[2].getZ_pos(), this.local_coordinate_system);
      if (this.Contact == run.elements.Shell_C0_3.BASIC || this.Contact == run.elements.Shell_C0_3.EDGE) {
         this.internal_contact_element.updateLocalCoordinateSystem();
      }
      if (this.Contact == run.elements.Shell_C0_3.EDGE) {
         if (this.internal_contact_line_element_1 != null) {
            this.internal_contact_line_element_1.updateLocalCoordinateSystem();
         }
         if (this.internal_contact_line_element_2 != null) {
            this.internal_contact_line_element_2.updateLocalCoordinateSystem();
         }
         if (this.internal_contact_line_element_3 != null) {
            this.internal_contact_line_element_3.updateLocalCoordinateSystem();
         }
      }
   }
   private void calculateLocalVariables() {
      this.trash.set(0, 0, this.node[0].getX_pos());
      this.trash.set(1, 0, this.node[0].getY_pos());
      this.trash.set(2, 0, this.node[0].getZ_pos());
      this.trash.set(3, 0, this.node[1].getX_pos());
      this.trash.set(4, 0, this.node[1].getY_pos());
      this.trash.set(5, 0, this.node[1].getZ_pos());
      this.trash.set(6, 0, this.node[2].getX_pos());
      this.trash.set(7, 0, this.node[2].getY_pos());
      this.trash.set(8, 0, this.node[2].getZ_pos());
      this.p.set(0, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(0, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(1, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(2, 0));
      this.p.set(1, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(0, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(1, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(2, 0));
      this.p.set(2, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(0, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(1, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(2, 0));
      this.p.set(3, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(3, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(4, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(5, 0));
      this.p.set(4, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(3, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(4, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(5, 0));
      this.p.set(5, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(3, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(4, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(5, 0));
      this.p.set(6, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(6, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(7, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(8, 0));
      this.p.set(7, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(6, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(7, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(8, 0));
      this.p.set(8, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(6, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(7, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(8, 0));
      this.p.setMatrix(3, 5, 0, 0, this.p.getMatrix(3, 5, 0, 0).minus(this.p.getMatrix(0, 2, 0, 0)));
      this.p.setMatrix(6, 8, 0, 0, this.p.getMatrix(6, 8, 0, 0).minus(this.p.getMatrix(0, 2, 0, 0)));
      this.p.setMatrix(0, 2, 0, 0, this.p.getMatrix(0, 2, 0, 0).minus(this.p.getMatrix(0, 2, 0, 0)));
      this.trash.set(0, 0, this.node[0].getX_vel());
      this.trash.set(1, 0, this.node[0].getY_vel());
      this.trash.set(2, 0, this.node[0].getZ_vel());
      this.trash.set(3, 0, this.node[1].getX_vel());
      this.trash.set(4, 0, this.node[1].getY_vel());
      this.trash.set(5, 0, this.node[1].getZ_vel());
      this.trash.set(6, 0, this.node[2].getX_vel());
      this.trash.set(7, 0, this.node[2].getY_vel());
      this.trash.set(8, 0, this.node[2].getZ_vel());
      this.v.set(0, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(0, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(1, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(2, 0));
      this.v.set(1, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(0, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(1, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(2, 0));
      this.v.set(2, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(0, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(1, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(2, 0));
      this.v.set(3, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(3, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(4, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(5, 0));
      this.v.set(4, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(3, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(4, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(5, 0));
      this.v.set(5, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(3, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(4, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(5, 0));
      this.v.set(6, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(6, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(7, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(8, 0));
      this.v.set(7, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(6, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(7, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(8, 0));
      this.v.set(8, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(6, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(7, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(8, 0));
      this.trash.set(0, 0, this.node[0].getX_rot_vel());
      this.trash.set(1, 0, this.node[0].getY_rot_vel());
      this.trash.set(2, 0, this.node[0].getZ_rot_vel());
      this.trash.set(3, 0, this.node[1].getX_rot_vel());
      this.trash.set(4, 0, this.node[1].getY_rot_vel());
      this.trash.set(5, 0, this.node[1].getZ_rot_vel());
      this.trash.set(6, 0, this.node[2].getX_rot_vel());
      this.trash.set(7, 0, this.node[2].getY_rot_vel());
      this.trash.set(8, 0, this.node[2].getZ_rot_vel());
      this.a.set(0, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(0, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(1, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(2, 0));
      this.a.set(1, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(0, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(1, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(2, 0));
      this.a.set(2, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(0, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(1, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(2, 0));
      this.a.set(3, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(3, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(4, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(5, 0));
      this.a.set(4, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(3, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(4, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(5, 0));
      this.a.set(5, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(3, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(4, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(5, 0));
      this.a.set(6, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(6, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(7, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(8, 0));
      this.a.set(7, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(6, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(7, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(8, 0));
      this.a.set(8, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(6, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(7, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(8, 0));
      this.area = 0.5 * this.p.get(3, 0) * this.p.get(7, 0);
   }
   public void deActivate() {
      super.deActivate();
      if (this.internal_contact_element != null) this.internal_contact_element.deActivate();
      if (this.internal_contact_line_element_1 != null) this.internal_contact_line_element_1.deActivate();
      if (this.internal_contact_line_element_2 != null) this.internal_contact_line_element_2.deActivate();
      if (this.internal_contact_line_element_3 != null) this.internal_contact_line_element_3.deActivate();
   }
}
