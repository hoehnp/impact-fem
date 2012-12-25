package run.elements;
import run.*;

import java.text.ParseException;

import java.util.*;

public class Shell_BT_4 extends Element implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Shell_BT_4 copy = (Shell_BT_4)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.Thinning_is_enabled, copy.Thinning_is_enabled)) copy.Thinning_is_enabled = this.Thinning_is_enabled;
      if (po.writeDiff(this.Friction_is_set, copy.Friction_is_set)) copy.Friction_is_set = this.Friction_is_set;
      if (po.writeDiff(this.Factor_is_set, copy.Factor_is_set)) copy.Factor_is_set = this.Factor_is_set;
      if (po.writeDiff(this.T_is_set, copy.T_is_set)) copy.T_is_set = this.T_is_set;
      if (po.writeDiff(this.Material_is_set, copy.Material_is_set)) copy.Material_is_set = this.Material_is_set;
      if (po.writeDiff(this.Nodes_are_set, copy.Nodes_are_set)) copy.Nodes_are_set = this.Nodes_are_set;
      if (po.writeDiff(this.PIP_is_set, copy.PIP_is_set)) copy.PIP_is_set = this.PIP_is_set;
      if (po.writeDiff(this.NIP_is_set, copy.NIP_is_set)) copy.NIP_is_set = this.NIP_is_set;
      if (po.writeDiff(this.rotation_hourglass_coeff, copy.rotation_hourglass_coeff)) copy.rotation_hourglass_coeff = this.rotation_hourglass_coeff;
      if (po.writeDiff(this.out_of_plane_hourglass_coeff, copy.out_of_plane_hourglass_coeff)) copy.out_of_plane_hourglass_coeff = this.out_of_plane_hourglass_coeff;
      if (po.writeDiff(this.membrane_hourglass_coeff, copy.membrane_hourglass_coeff)) copy.membrane_hourglass_coeff = this.membrane_hourglass_coeff;
      if (po.writeDiff(this.hourglass_control, copy.hourglass_control)) copy.hourglass_control = this.hourglass_control;
      if (po.writeDiff(this.shear_factor, copy.shear_factor)) copy.shear_factor = this.shear_factor;
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
      copy.internal_contact_line_element_4 = this.internal_contact_line_element_4 = (run.elements.Contact_Line)po.writeDiff(this.internal_contact_line_element_4, copy.internal_contact_line_element_4);
      copy.internal_contact_line_element_3 = this.internal_contact_line_element_3 = (run.elements.Contact_Line)po.writeDiff(this.internal_contact_line_element_3, copy.internal_contact_line_element_3);
      copy.internal_contact_line_element_2 = this.internal_contact_line_element_2 = (run.elements.Contact_Line)po.writeDiff(this.internal_contact_line_element_2, copy.internal_contact_line_element_2);
      copy.internal_contact_line_element_1 = this.internal_contact_line_element_1 = (run.elements.Contact_Line)po.writeDiff(this.internal_contact_line_element_1, copy.internal_contact_line_element_1);
      copy.internal_contact_element_4 = this.internal_contact_element_4 = (run.elements.Contact_Triangle)po.writeDiff(this.internal_contact_element_4, copy.internal_contact_element_4);
      copy.internal_contact_element_3 = this.internal_contact_element_3 = (run.elements.Contact_Triangle)po.writeDiff(this.internal_contact_element_3, copy.internal_contact_element_3);
      copy.internal_contact_element_2 = this.internal_contact_element_2 = (run.elements.Contact_Triangle)po.writeDiff(this.internal_contact_element_2, copy.internal_contact_element_2);
      copy.internal_contact_element_1 = this.internal_contact_element_1 = (run.elements.Contact_Triangle)po.writeDiff(this.internal_contact_element_1, copy.internal_contact_element_1);
      copy.load = this.load = (run.Load)po.writeDiff(this.load, copy.load);
      copy.hourglass_vector = this.hourglass_vector = (Jama.Matrix)po.writeDiff(this.hourglass_vector, copy.hourglass_vector);
      copy.material = this.material = (run.Material[])po.writeDiff(this.material, copy.material);
      copy.weight_factor = this.weight_factor = (double[])po.writeDiff(this.weight_factor, copy.weight_factor);
      copy.z = this.z = (double[])po.writeDiff(this.z, copy.z);
      copy.trash = this.trash = (Jama.Matrix)po.writeDiff(this.trash, copy.trash);
      copy.a = this.a = (Jama.Matrix)po.writeDiff(this.a, copy.a);
      copy.v = this.v = (Jama.Matrix)po.writeDiff(this.v, copy.v);
      copy.p = this.p = (Jama.Matrix)po.writeDiff(this.p, copy.p);
      copy.B = this.B = (Jama.Matrix)po.writeDiff(this.B, copy.B);
      copy.hourglass_moment = this.hourglass_moment = (Jama.Matrix)po.writeDiff(this.hourglass_moment, copy.hourglass_moment);
      copy.moment = this.moment = (Jama.Matrix)po.writeDiff(this.moment, copy.moment);
      copy.hourglass_force = this.hourglass_force = (Jama.Matrix)po.writeDiff(this.hourglass_force, copy.hourglass_force);
      copy.force = this.force = (Jama.Matrix)po.writeDiff(this.force, copy.force);
      copy.stress = this.stress = (Jama.Matrix[])po.writeDiff(this.stress, copy.stress);
      copy.strainrate = this.strainrate = (Jama.Matrix)po.writeDiff(this.strainrate, copy.strainrate);
      copy.dstrain = this.dstrain = (Jama.Matrix[])po.writeDiff(this.dstrain, copy.dstrain);
      copy.strain = this.strain = (Jama.Matrix[])po.writeDiff(this.strain, copy.strain);
      copy.local_coordinate_system = this.local_coordinate_system = (Jama.Matrix)po.writeDiff(this.local_coordinate_system, copy.local_coordinate_system);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Shell_BT_4 copy = (Shell_BT_4)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.Thinning_is_enabled = this.Thinning_is_enabled = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Friction_is_set = this.Friction_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Factor_is_set = this.Factor_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.T_is_set = this.T_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Material_is_set = this.Material_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Nodes_are_set = this.Nodes_are_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.PIP_is_set = this.PIP_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.NIP_is_set = this.NIP_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.rotation_hourglass_coeff = this.rotation_hourglass_coeff = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.out_of_plane_hourglass_coeff = this.out_of_plane_hourglass_coeff = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.membrane_hourglass_coeff = this.membrane_hourglass_coeff = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.hourglass_control = this.hourglass_control = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.shear_factor = this.shear_factor = pi.getDiffAsDouble();
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
      if (pi.hasDiff()) copy.internal_contact_line_element_4 = this.internal_contact_line_element_4 = (run.elements.Contact_Line)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.internal_contact_line_element_3 = this.internal_contact_line_element_3 = (run.elements.Contact_Line)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.internal_contact_line_element_2 = this.internal_contact_line_element_2 = (run.elements.Contact_Line)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.internal_contact_line_element_1 = this.internal_contact_line_element_1 = (run.elements.Contact_Line)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.internal_contact_element_4 = this.internal_contact_element_4 = (run.elements.Contact_Triangle)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.internal_contact_element_3 = this.internal_contact_element_3 = (run.elements.Contact_Triangle)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.internal_contact_element_2 = this.internal_contact_element_2 = (run.elements.Contact_Triangle)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.internal_contact_element_1 = this.internal_contact_element_1 = (run.elements.Contact_Triangle)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.load = this.load = (run.Load)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.hourglass_vector = this.hourglass_vector = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.material = this.material = (run.Material[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.weight_factor = this.weight_factor = (double[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.z = this.z = (double[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.trash = this.trash = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.a = this.a = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.v = this.v = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.p = this.p = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.B = this.B = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.hourglass_moment = this.hourglass_moment = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.moment = this.moment = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.hourglass_force = this.hourglass_force = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.force = this.force = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.stress = this.stress = (Jama.Matrix[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.strainrate = this.strainrate = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.dstrain = this.dstrain = (Jama.Matrix[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.strain = this.strain = (Jama.Matrix[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.local_coordinate_system = this.local_coordinate_system = (Jama.Matrix)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.internal_contact_line_element_4);
      c.descend(this.internal_contact_line_element_3);
      c.descend(this.internal_contact_line_element_2);
      c.descend(this.internal_contact_line_element_1);
      c.descend(this.internal_contact_element_4);
      c.descend(this.internal_contact_element_3);
      c.descend(this.internal_contact_element_2);
      c.descend(this.internal_contact_element_1);
      c.descend(this.load);
      c.descend(this.hourglass_vector);
      c.descend(this.material);
      c.descend(this.weight_factor);
      c.descend(this.z);
      c.descend(this.trash);
      c.descend(this.a);
      c.descend(this.v);
      c.descend(this.p);
      c.descend(this.B);
      c.descend(this.hourglass_moment);
      c.descend(this.moment);
      c.descend(this.hourglass_force);
      c.descend(this.force);
      c.descend(this.stress);
      c.descend(this.strainrate);
      c.descend(this.dstrain);
      c.descend(this.strain);
      c.descend(this.local_coordinate_system);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.internal_contact_line_element_4 = (run.elements.Contact_Line)f.filter(this.internal_contact_line_element_4);
      this.internal_contact_line_element_3 = (run.elements.Contact_Line)f.filter(this.internal_contact_line_element_3);
      this.internal_contact_line_element_2 = (run.elements.Contact_Line)f.filter(this.internal_contact_line_element_2);
      this.internal_contact_line_element_1 = (run.elements.Contact_Line)f.filter(this.internal_contact_line_element_1);
      this.internal_contact_element_4 = (run.elements.Contact_Triangle)f.filter(this.internal_contact_element_4);
      this.internal_contact_element_3 = (run.elements.Contact_Triangle)f.filter(this.internal_contact_element_3);
      this.internal_contact_element_2 = (run.elements.Contact_Triangle)f.filter(this.internal_contact_element_2);
      this.internal_contact_element_1 = (run.elements.Contact_Triangle)f.filter(this.internal_contact_element_1);
      this.load = (run.Load)f.filter(this.load);
      this.hourglass_vector = (Jama.Matrix)f.filter(this.hourglass_vector);
      this.material = (run.Material[])f.filter(this.material);
      this.weight_factor = (double[])f.filter(this.weight_factor);
      this.z = (double[])f.filter(this.z);
      this.trash = (Jama.Matrix)f.filter(this.trash);
      this.a = (Jama.Matrix)f.filter(this.a);
      this.v = (Jama.Matrix)f.filter(this.v);
      this.p = (Jama.Matrix)f.filter(this.p);
      this.B = (Jama.Matrix)f.filter(this.B);
      this.hourglass_moment = (Jama.Matrix)f.filter(this.hourglass_moment);
      this.moment = (Jama.Matrix)f.filter(this.moment);
      this.hourglass_force = (Jama.Matrix)f.filter(this.hourglass_force);
      this.force = (Jama.Matrix)f.filter(this.force);
      this.stress = (Jama.Matrix[])f.filter(this.stress);
      this.strainrate = (Jama.Matrix)f.filter(this.strainrate);
      this.dstrain = (Jama.Matrix[])f.filter(this.dstrain);
      this.strain = (Jama.Matrix[])f.filter(this.strain);
      this.local_coordinate_system = (Jama.Matrix)f.filter(this.local_coordinate_system);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new Shell_BT_4(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((Shell_BT_4)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Shell_BT_4)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Shell_BT_4)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new Shell_BT_4((Shell_BT_4)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((Shell_BT_4)copy).deepCloneReferences((Shell_BT_4)orig, _helper);
         return false;
      }
      public Class getType() {
         return Shell_BT_4.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double;
   public Shell_BT_4(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(Shell_BT_4._SIZE);
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
      this.rotation_hourglass_coeff = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.out_of_plane_hourglass_coeff = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.membrane_hourglass_coeff = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.hourglass_control = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.shear_factor = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
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
      _stream.accept(Shell_BT_4._SIZE);
      this.internal_contact_line_element_4 = (run.elements.Contact_Line)_stream.readReference();
      this.internal_contact_line_element_3 = (run.elements.Contact_Line)_stream.readReference();
      this.internal_contact_line_element_2 = (run.elements.Contact_Line)_stream.readReference();
      this.internal_contact_line_element_1 = (run.elements.Contact_Line)_stream.readReference();
      this.internal_contact_element_4 = (run.elements.Contact_Triangle)_stream.readReference();
      this.internal_contact_element_3 = (run.elements.Contact_Triangle)_stream.readReference();
      this.internal_contact_element_2 = (run.elements.Contact_Triangle)_stream.readReference();
      this.internal_contact_element_1 = (run.elements.Contact_Triangle)_stream.readReference();
      this.load = (run.Load)_stream.readReference();
      this.hourglass_vector = (Jama.Matrix)_stream.readReference();
      this.material = (run.Material[])_stream.readReference();
      this.weight_factor = (double[])_stream.readReference();
      this.z = (double[])_stream.readReference();
      this.trash = (Jama.Matrix)_stream.readReference();
      this.a = (Jama.Matrix)_stream.readReference();
      this.v = (Jama.Matrix)_stream.readReference();
      this.p = (Jama.Matrix)_stream.readReference();
      this.B = (Jama.Matrix)_stream.readReference();
      this.hourglass_moment = (Jama.Matrix)_stream.readReference();
      this.moment = (Jama.Matrix)_stream.readReference();
      this.hourglass_force = (Jama.Matrix)_stream.readReference();
      this.force = (Jama.Matrix)_stream.readReference();
      this.stress = (Jama.Matrix[])_stream.readReference();
      this.strainrate = (Jama.Matrix)_stream.readReference();
      this.dstrain = (Jama.Matrix[])_stream.readReference();
      this.strain = (Jama.Matrix[])_stream.readReference();
      this.local_coordinate_system = (Jama.Matrix)_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(Shell_BT_4._SIZE);
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
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.rotation_hourglass_coeff);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.out_of_plane_hourglass_coeff);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.membrane_hourglass_coeff);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.hourglass_control);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.shear_factor);
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
      _stream.writeReference(this.internal_contact_line_element_4);
      _stream.writeReference(this.internal_contact_line_element_3);
      _stream.writeReference(this.internal_contact_line_element_2);
      _stream.writeReference(this.internal_contact_line_element_1);
      _stream.writeReference(this.internal_contact_element_4);
      _stream.writeReference(this.internal_contact_element_3);
      _stream.writeReference(this.internal_contact_element_2);
      _stream.writeReference(this.internal_contact_element_1);
      _stream.writeReference(this.load);
      _stream.writeReference(this.hourglass_vector);
      _stream.writeReference(this.material);
      _stream.writeReference(this.weight_factor);
      _stream.writeReference(this.z);
      _stream.writeReference(this.trash);
      _stream.writeReference(this.a);
      _stream.writeReference(this.v);
      _stream.writeReference(this.p);
      _stream.writeReference(this.B);
      _stream.writeReference(this.hourglass_moment);
      _stream.writeReference(this.moment);
      _stream.writeReference(this.hourglass_force);
      _stream.writeReference(this.force);
      _stream.writeReference(this.stress);
      _stream.writeReference(this.strainrate);
      _stream.writeReference(this.dstrain);
      _stream.writeReference(this.strain);
      _stream.writeReference(this.local_coordinate_system);
   }
   public Shell_BT_4(Shell_BT_4 _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.Thinning_is_enabled = _orig.Thinning_is_enabled;
      this.Friction_is_set = _orig.Friction_is_set;
      this.Factor_is_set = _orig.Factor_is_set;
      this.T_is_set = _orig.T_is_set;
      this.Material_is_set = _orig.Material_is_set;
      this.Nodes_are_set = _orig.Nodes_are_set;
      this.PIP_is_set = _orig.PIP_is_set;
      this.NIP_is_set = _orig.NIP_is_set;
      this.rotation_hourglass_coeff = _orig.rotation_hourglass_coeff;
      this.out_of_plane_hourglass_coeff = _orig.out_of_plane_hourglass_coeff;
      this.membrane_hourglass_coeff = _orig.membrane_hourglass_coeff;
      this.hourglass_control = _orig.hourglass_control;
      this.shear_factor = _orig.shear_factor;
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
   public void deepCloneReferences(Shell_BT_4 _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.internal_contact_line_element_4 = (run.elements.Contact_Line)_helper.internalDeepClone(_orig.internal_contact_line_element_4);
      this.internal_contact_line_element_3 = (run.elements.Contact_Line)_helper.internalDeepClone(_orig.internal_contact_line_element_3);
      this.internal_contact_line_element_2 = (run.elements.Contact_Line)_helper.internalDeepClone(_orig.internal_contact_line_element_2);
      this.internal_contact_line_element_1 = (run.elements.Contact_Line)_helper.internalDeepClone(_orig.internal_contact_line_element_1);
      this.internal_contact_element_4 = (run.elements.Contact_Triangle)_helper.internalDeepClone(_orig.internal_contact_element_4);
      this.internal_contact_element_3 = (run.elements.Contact_Triangle)_helper.internalDeepClone(_orig.internal_contact_element_3);
      this.internal_contact_element_2 = (run.elements.Contact_Triangle)_helper.internalDeepClone(_orig.internal_contact_element_2);
      this.internal_contact_element_1 = (run.elements.Contact_Triangle)_helper.internalDeepClone(_orig.internal_contact_element_1);
      this.load = (run.Load)_helper.internalDeepClone(_orig.load);
      this.hourglass_vector = (Jama.Matrix)_helper.internalDeepClone(_orig.hourglass_vector);
      this.material = (run.Material[])_helper.internalDeepClone(_orig.material);
      this.weight_factor = (double[])_helper.internalDeepClone(_orig.weight_factor);
      this.z = (double[])_helper.internalDeepClone(_orig.z);
      this.trash = (Jama.Matrix)_helper.internalDeepClone(_orig.trash);
      this.a = (Jama.Matrix)_helper.internalDeepClone(_orig.a);
      this.v = (Jama.Matrix)_helper.internalDeepClone(_orig.v);
      this.p = (Jama.Matrix)_helper.internalDeepClone(_orig.p);
      this.B = (Jama.Matrix)_helper.internalDeepClone(_orig.B);
      this.hourglass_moment = (Jama.Matrix)_helper.internalDeepClone(_orig.hourglass_moment);
      this.moment = (Jama.Matrix)_helper.internalDeepClone(_orig.moment);
      this.hourglass_force = (Jama.Matrix)_helper.internalDeepClone(_orig.hourglass_force);
      this.force = (Jama.Matrix)_helper.internalDeepClone(_orig.force);
      this.stress = (Jama.Matrix[])_helper.internalDeepClone(_orig.stress);
      this.strainrate = (Jama.Matrix)_helper.internalDeepClone(_orig.strainrate);
      this.dstrain = (Jama.Matrix[])_helper.internalDeepClone(_orig.dstrain);
      this.strain = (Jama.Matrix[])_helper.internalDeepClone(_orig.strain);
      this.local_coordinate_system = (Jama.Matrix)_helper.internalDeepClone(_orig.local_coordinate_system);
   }
   private static int DISABLED = 0;
   private static int BASIC = 1;
   private static int ADVANCED = 2;
   private static int EDGE = 3;
   private static int ADVANCED_EDGE = 4;
   private double area;
   private Jama.Matrix local_coordinate_system;
   private Jama.Matrix[] strain;
   private Jama.Matrix[] dstrain;
   private Jama.Matrix strainrate;
   private Jama.Matrix[] stress;
   private Jama.Matrix force;
   private Jama.Matrix hourglass_force;
   private Jama.Matrix moment;
   private Jama.Matrix hourglass_moment;
   private Jama.Matrix B;
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
   private double shear_factor;
   private boolean hourglass_control;
   private double membrane_hourglass_coeff;
   private double out_of_plane_hourglass_coeff;
   private double rotation_hourglass_coeff;
   private Jama.Matrix hourglass_vector;
   private Load load;
   private boolean NIP_is_set;
   private boolean PIP_is_set;
   private boolean Nodes_are_set;
   private boolean Material_is_set;
   private boolean T_is_set;
   private boolean Factor_is_set;
   private boolean Friction_is_set;
   private boolean Thinning_is_enabled;
   private Contact_Triangle internal_contact_element_1;
   private Contact_Triangle internal_contact_element_2;
   private Contact_Triangle internal_contact_element_3;
   private Contact_Triangle internal_contact_element_4;
   private Contact_Line internal_contact_line_element_1;
   private Contact_Line internal_contact_line_element_2;
   private Contact_Line internal_contact_line_element_3;
   private Contact_Line internal_contact_line_element_4;
   public Shell_BT_4() {
      super();
      this.type = new String("SHELL_BT_4");
      int i;
      this.p = new Jama.Matrix(12, 1);
      this.v = new Jama.Matrix(12, 1);
      this.a = new Jama.Matrix(12, 1);
      this.trash = new Jama.Matrix(12, 1);
      this.B = new Jama.Matrix(2, 4);
      this.node = new Node[4];
      this.force = new Jama.Matrix(3, 1);
      this.hourglass_force = new Jama.Matrix(3, 1);
      this.moment = new Jama.Matrix(3, 1);
      this.hourglass_moment = new Jama.Matrix(3, 1);
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
      this.hourglass_vector = new Jama.Matrix(4, 1);
      this.shear_factor = 1.0;
      this.hourglass_control = true;
      this.membrane_hourglass_coeff = 0.1;
      this.out_of_plane_hourglass_coeff = 0.1;
      this.rotation_hourglass_coeff = 0.1;
      this.Contact = run.elements.Shell_BT_4.BASIC;
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
      this.node[0].addMass(mass / 4);
      this.node[1].addMass(mass / 4);
      this.node[2].addMass(mass / 4);
      this.node[3].addMass(mass / 4);
      I = mass / 4 * (this.area / 12 + this.thickness * this.thickness / 12);
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
      this.node[3].addInertia(inertia);
      if (this.Contact == run.elements.Shell_BT_4.BASIC || this.Contact == run.elements.Shell_BT_4.EDGE) {
         this.internal_contact_element_1.assembleMassMatrix();
         this.internal_contact_element_2.assembleMassMatrix();
      }
      if (this.Contact == run.elements.Shell_BT_4.ADVANCED || this.Contact == run.elements.Shell_BT_4.ADVANCED_EDGE) {
         this.internal_contact_element_1.assembleMassMatrix();
         this.internal_contact_element_2.assembleMassMatrix();
         this.internal_contact_element_3.assembleMassMatrix();
         this.internal_contact_element_4.assembleMassMatrix();
      }
      if (this.Contact == run.elements.Shell_BT_4.EDGE || this.Contact == run.elements.Shell_BT_4.ADVANCED_EDGE) {
         if (this.internal_contact_line_element_1 != null) {
            this.internal_contact_line_element_1.assembleMassMatrix();
         }
         if (this.internal_contact_line_element_2 != null) {
            this.internal_contact_line_element_2.assembleMassMatrix();
         }
         if (this.internal_contact_line_element_3 != null) {
            this.internal_contact_line_element_3.assembleMassMatrix();
         }
         if (this.internal_contact_line_element_4 != null) {
            this.internal_contact_line_element_4.assembleMassMatrix();
         }
      }
   }
   public void calculateContactForces() {
      if (this.Contact == run.elements.Shell_BT_4.BASIC || this.Contact == run.elements.Shell_BT_4.EDGE) {
         this.internal_contact_element_1.calculateContactForces();
         this.internal_contact_element_2.calculateContactForces();
      }
      if (this.Contact == run.elements.Shell_BT_4.ADVANCED || this.Contact == run.elements.Shell_BT_4.ADVANCED_EDGE) {
         this.internal_contact_element_1.calculateContactForces();
         this.internal_contact_element_2.calculateContactForces();
         this.internal_contact_element_3.calculateContactForces();
         this.internal_contact_element_4.calculateContactForces();
         this.node[0].addInternalForce(this.middle_node.getForce().times(0.25));
         this.node[1].addInternalForce(this.middle_node.getForce().times(0.25));
         this.node[2].addInternalForce(this.middle_node.getForce().times(0.25));
         this.node[3].addInternalForce(this.middle_node.getForce().times(0.25));
         this.middle_node.clearNodalForces();
      }
      if (this.Contact == run.elements.Shell_BT_4.EDGE || this.Contact == run.elements.Shell_BT_4.ADVANCED_EDGE) {
         if (this.internal_contact_line_element_1 != null) {
            this.internal_contact_line_element_1.calculateContactForces();
         }
         if (this.internal_contact_line_element_2 != null) {
            this.internal_contact_line_element_2.calculateContactForces();
         }
         if (this.internal_contact_line_element_3 != null) {
            this.internal_contact_line_element_3.calculateContactForces();
         }
         if (this.internal_contact_line_element_4 != null) {
            this.internal_contact_line_element_4.calculateContactForces();
         }
      }
   }
   public void calculateExternalForces(double currtime) {
      int i;
      if (this.load != null) {
         this.force.set(0, 0, 0);
         this.force.set(1, 0, 0);
         this.force.set(2, 0, this.area * this.load.getPressure(currtime) * 0.25);
         this.force = this.local_coordinate_system.transpose().times(this.force);
         for (i = 0; i < 4; i++) {
            this.node[i].addInternalForce(this.force);
         }
      }
      if (this.Contact == run.elements.Shell_BT_4.BASIC || this.Contact == run.elements.Shell_BT_4.EDGE) {
         this.internal_contact_element_1.calculateExternalForces(currtime);
         this.internal_contact_element_2.calculateExternalForces(currtime);
      }
      if (this.Contact == run.elements.Shell_BT_4.ADVANCED || this.Contact == run.elements.Shell_BT_4.ADVANCED_EDGE) {
         this.internal_contact_element_1.calculateExternalForces(currtime);
         this.internal_contact_element_2.calculateExternalForces(currtime);
         this.internal_contact_element_3.calculateExternalForces(currtime);
         this.internal_contact_element_4.calculateExternalForces(currtime);
      }
      if (this.Contact == run.elements.Shell_BT_4.EDGE || this.Contact == run.elements.Shell_BT_4.ADVANCED_EDGE) {
         if (this.internal_contact_line_element_1 != null) {
            this.internal_contact_line_element_1.calculateExternalForces(currtime);
         }
         if (this.internal_contact_line_element_2 != null) {
            this.internal_contact_line_element_2.calculateExternalForces(currtime);
         }
         if (this.internal_contact_line_element_3 != null) {
            this.internal_contact_line_element_3.calculateExternalForces(currtime);
         }
         if (this.internal_contact_line_element_4 != null) {
            this.internal_contact_line_element_4.calculateExternalForces(currtime);
         }
      }
   }
   public void calculateLocalBaseVectors(double x1, double y1, double z1, double x2, double y2, double z2, double x3, double y3, double z3, double x4, double y4, double z4, Jama.Matrix bvs) {
      bvs.set(0, 0, x2 - x1);
      bvs.set(0, 1, y2 - y1);
      bvs.set(0, 2, z2 - z1);
      bvs.set(1, 0, x4 - x1);
      bvs.set(1, 1, y4 - y1);
      bvs.set(1, 2, z4 - z1);
      bvs.set(2, 0, (y3 - y1) * (z4 - z2) - (z3 - z1) * (y4 - y2));
      bvs.set(2, 1, (z3 - z1) * (x4 - x2) - (z4 - z2) * (x3 - x1));
      bvs.set(2, 2, (x3 - x1) * (y4 - y2) - (y3 - y1) * (x4 - x2));
      bvs.set(1, 0, Math.sqrt(bvs.get(2, 0) * bvs.get(2, 0) + bvs.get(2, 1) * bvs.get(2, 1) + bvs.get(2, 2) * bvs.get(2, 2)));
      bvs.set(2, 0, bvs.get(2, 0) / bvs.get(1, 0));
      bvs.set(2, 1, bvs.get(2, 1) / bvs.get(1, 0));
      bvs.set(2, 2, bvs.get(2, 2) / bvs.get(1, 0));
      bvs.set(1, 0, bvs.get(0, 0) * bvs.get(2, 0) * bvs.get(2, 0) + bvs.get(0, 0) * bvs.get(2, 1) * bvs.get(2, 1) + bvs.get(0, 0) * bvs.get(2, 2) * bvs.get(2, 2));
      bvs.set(1, 1, bvs.get(0, 1) * bvs.get(2, 0) * bvs.get(2, 0) + bvs.get(0, 1) * bvs.get(2, 1) * bvs.get(2, 1) + bvs.get(0, 1) * bvs.get(2, 2) * bvs.get(2, 2));
      bvs.set(1, 2, bvs.get(0, 2) * bvs.get(2, 0) * bvs.get(2, 0) + bvs.get(0, 2) * bvs.get(2, 1) * bvs.get(2, 1) + bvs.get(0, 2) * bvs.get(2, 2) * bvs.get(2, 2));
      bvs.set(0, 2, Math.sqrt(bvs.get(1, 0) * bvs.get(1, 0) + bvs.get(1, 1) * bvs.get(1, 1) + bvs.get(1, 2) * bvs.get(1, 2)));
      bvs.set(0, 0, bvs.get(1, 0) / bvs.get(0, 2));
      bvs.set(0, 1, bvs.get(1, 1) / bvs.get(0, 2));
      bvs.set(0, 2, bvs.get(1, 2) / bvs.get(0, 2));
      bvs.set(1, 0, bvs.get(2, 1) * bvs.get(0, 2) - bvs.get(2, 2) * bvs.get(0, 1));
      bvs.set(1, 1, bvs.get(2, 2) * bvs.get(0, 0) - bvs.get(2, 0) * bvs.get(0, 2));
      bvs.set(1, 2, bvs.get(2, 0) * bvs.get(0, 1) - bvs.get(2, 1) * bvs.get(0, 0));
   }
   public void calculateNodalForces(int integration_point, double timestep) {
      int i;
      double ki;
      double ko;
      double kr;
      Jama.Matrix transposed_coordinate_system;
      ki = 0.0;
      ko = 0.0;
      kr = 0.0;
      transposed_coordinate_system = this.local_coordinate_system.transpose();
      if (integration_point == 0) {
         if (this.area <= 0) {
            throw new IllegalArgumentException("Error in Shell_BT_4 element. Negative or zero area. ");
         }
      }
      for (i = 0; i < 4; i++) {
         this.force.set(0, 0, 0.5 * this.thickness * this.area * this.weight_factor[integration_point] * (this.B.get(0, i) * this.stress[integration_point].get(0, 0) + this.B.get(1, i) * this.stress[integration_point].get(3, 0)));
         this.force.set(1, 0, 0.5 * this.thickness * this.area * this.weight_factor[integration_point] * (this.B.get(1, i) * this.stress[integration_point].get(1, 0) + this.B.get(0, i) * this.stress[integration_point].get(3, 0)));
         this.force.set(2, 0, 0.5 * this.thickness * this.area * this.shear_factor * this.weight_factor[integration_point] * (this.B.get(0, i) * this.stress[integration_point].get(5, 0) + this.B.get(1, i) * this.stress[integration_point].get(4, 0)));
         if (integration_point == 0 && this.hourglass_control == true) {
            if (i == 0) {
               ki = 0.25 * this.material[0].getDensity() * this.material[0].wavespeedTwoDimensional(0.0, 0.0) * this.thickness * Math.sqrt(this.membrane_hourglass_coeff * this.area / 2);
               ko = 0.25 * this.material[0].getDensity() * this.material[0].wavespeedTwoDimensional(0.0, 0.0) * this.thickness * this.thickness * Math.sqrt(this.out_of_plane_hourglass_coeff / 10);
               kr = 0.02 * this.material[0].getDensity() * this.material[0].wavespeedTwoDimensional(0.0, 0.0) * this.thickness * this.thickness * this.area * Math.sqrt(this.rotation_hourglass_coeff / 2);
            }
            this.hourglass_force.set(0, 0, ki * (this.v.get(0, 0) - this.v.get(3, 0) + this.v.get(6, 0) - this.v.get(9, 0)) * this.hourglass_vector.get(i, 0));
            this.hourglass_force.set(1, 0, ki * (this.v.get(1, 0) - this.v.get(4, 0) + this.v.get(7, 0) - this.v.get(10, 0)) * this.hourglass_vector.get(i, 0));
            this.hourglass_force.set(2, 0, ko * (this.v.get(2, 0) - this.v.get(5, 0) + this.v.get(8, 0) - this.v.get(11, 0)) * this.hourglass_vector.get(i, 0));
            this.hourglass_force = transposed_coordinate_system.times(this.hourglass_force);
            this.node[i].addHourglassForce(this.hourglass_force.times(-1.0));
         }
         this.force = transposed_coordinate_system.times(this.force);
         this.moment.set(0, 0, 0.5 * this.thickness * this.area * this.weight_factor[integration_point] * (this.B.get(1, i) * (-this.z[integration_point] * this.stress[integration_point].get(1, 0)) + this.B.get(0, i) * (-this.z[integration_point] * this.stress[integration_point].get(3, 0)) - 0.25 * this.shear_factor * this.stress[integration_point].get(4, 0)));
         this.moment.set(1, 0, 0.5 * this.thickness * this.area * this.weight_factor[integration_point] * (-this.B.get(0, i) * (-this.z[integration_point] * this.stress[integration_point].get(0, 0)) - this.B.get(1, i) * (-this.z[integration_point] * this.stress[integration_point].get(3, 0)) + 0.25 * this.shear_factor * this.stress[integration_point].get(5, 0)));
         this.moment.set(2, 0, 0);
         if (integration_point == 0 && this.hourglass_control == true) {
            this.hourglass_moment.set(0, 0, kr * (this.a.get(0, 0) - this.a.get(3, 0) + this.a.get(6, 0) - this.a.get(9, 0)) * this.hourglass_vector.get(i, 0));
            this.hourglass_moment.set(1, 0, kr * (this.a.get(1, 0) - this.a.get(4, 0) + this.a.get(7, 0) - this.a.get(10, 0)) * this.hourglass_vector.get(i, 0));
            this.hourglass_moment.set(2, 0, kr * (this.a.get(2, 0) - this.a.get(5, 0) + this.a.get(8, 0) - this.a.get(11, 0)) * this.hourglass_vector.get(i, 0));
            this.hourglass_moment = transposed_coordinate_system.times(this.hourglass_moment);
            this.node[i].addHourglassMoment(this.hourglass_moment.times(-1.0));
         }
         this.moment = transposed_coordinate_system.times(this.moment);
         this.node[i].addInternalForce(this.force.times(-1.0));
         this.node[i].addInternalMoment(this.moment.times(-1.0));
      }
   }
   public void calculateStrain(double tstep, int integration_point) {
      if (integration_point == 0) {
         this.updateLocalCoordinateSystem();
         this.calculateLocalVariables();
         if (this.Contact == run.elements.Shell_BT_4.ADVANCED || this.Contact == run.elements.Shell_BT_4.ADVANCED_EDGE) {
            this.area = this.internal_contact_element_1.getArea() + this.internal_contact_element_2.getArea() + this.internal_contact_element_3.getArea() + this.internal_contact_element_4.getArea();
         }
         this.B.set(0, 0, this.p.get(4, 0) - this.p.get(10, 0));
         this.B.set(0, 1, this.p.get(7, 0) - this.p.get(1, 0));
         this.B.set(0, 2, this.p.get(10, 0) - this.p.get(4, 0));
         this.B.set(0, 3, this.p.get(1, 0) - this.p.get(7, 0));
         this.B.set(1, 0, this.p.get(9, 0) - this.p.get(3, 0));
         this.B.set(1, 1, this.p.get(0, 0) - this.p.get(6, 0));
         this.B.set(1, 2, this.p.get(3, 0) - this.p.get(9, 0));
         this.B.set(1, 3, this.p.get(6, 0) - this.p.get(0, 0));
         this.B.timesEquals(1.0 / (2.0 * this.area));
         this.dmx = this.B.get(0, 0) * (this.v.get(0, 0) - this.v.get(6, 0)) + this.B.get(0, 1) * (this.v.get(3, 0) - this.v.get(9, 0));
         this.dmy = this.B.get(1, 0) * (this.v.get(1, 0) - this.v.get(7, 0)) + this.B.get(1, 1) * (this.v.get(4, 0) - this.v.get(10, 0));
         this.dmxy = this.B.get(1, 0) * (this.v.get(0, 0) - this.v.get(6, 0)) + this.B.get(1, 1) * (this.v.get(3, 0) - this.v.get(9, 0)) + this.B.get(0, 0) * (this.v.get(1, 0) - this.v.get(7, 0)) + this.B.get(0, 1) * (this.v.get(4, 0) - this.v.get(10, 0));
         this.kappax = -(this.B.get(0, 0) * (this.a.get(1, 0) - this.a.get(7, 0)) + this.B.get(0, 1) * (this.a.get(4, 0) - this.a.get(10, 0)));
         this.kappay = this.B.get(1, 0) * (this.a.get(0, 0) - this.a.get(6, 0)) + this.B.get(1, 1) * (this.a.get(3, 0) - this.a.get(9, 0));
         this.kappaxy = -this.B.get(1, 0) * (this.a.get(1, 0) - this.a.get(7, 0)) - this.B.get(1, 1) * (this.a.get(4, 0) - this.a.get(10, 0)) + this.B.get(0, 0) * (this.a.get(0, 0) - this.a.get(6, 0)) + this.B.get(0, 1) * (this.a.get(3, 0) - this.a.get(9, 0));
      }
      this.strainrate.set(0, 0, this.dmx - this.z[integration_point] * this.kappax);
      this.strainrate.set(1, 0, this.dmy - this.z[integration_point] * this.kappay);
      this.strainrate.set(3, 0, this.dmxy - this.z[integration_point] * this.kappaxy);
      this.strainrate.set(4, 0, this.B.get(1, 0) * (this.v.get(2, 0) - this.v.get(8, 0)) + this.B.get(1, 1) * (this.v.get(5, 0) - this.v.get(11, 0)) - 0.25 * (this.a.get(0, 0) + this.a.get(3, 0) + this.a.get(6, 0) + this.a.get(9, 0)));
      this.strainrate.set(5, 0, this.B.get(0, 0) * (this.v.get(2, 0) - this.v.get(8, 0)) + this.B.get(0, 1) * (this.v.get(5, 0) - this.v.get(11, 0)) + 0.25 * (this.a.get(1, 0) + this.a.get(4, 0) + this.a.get(7, 0) + this.a.get(10, 0)));
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
      critical_length = Math.max(critical_length, Math.sqrt((this.node[3].getX_pos() - this.node[2].getX_pos()) * (this.node[3].getX_pos() - this.node[2].getX_pos()) + (this.node[3].getY_pos() - this.node[2].getY_pos()) * (this.node[3].getY_pos() - this.node[2].getY_pos()) + (this.node[3].getZ_pos() - this.node[2].getZ_pos()) * (this.node[3].getZ_pos() - this.node[2].getZ_pos())));
      critical_length = Math.max(critical_length, Math.sqrt((this.node[0].getX_pos() - this.node[3].getX_pos()) * (this.node[0].getX_pos() - this.node[3].getX_pos()) + (this.node[0].getY_pos() - this.node[3].getY_pos()) * (this.node[0].getY_pos() - this.node[3].getY_pos()) + (this.node[0].getZ_pos() - this.node[3].getZ_pos()) * (this.node[0].getZ_pos() - this.node[3].getZ_pos())));
      critical_length = this.area / critical_length;
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
               throw new java.text.ParseException("Error, node number definition should be [nodenr1,nodenr2,nodenr3,nodenr4]", lineno);
            }
            try {
               for (j = 0; j < 4; j++) {
                  this.node[j] = super.findNode(super.getNodeNumber(j + 1, param[i + 2].getw()), nodetable);
               }
               i += 3;
               this.Nodes_are_set = true;
            }  catch (IllegalArgumentException e) {
               throw new ParseException(e.getMessage(), lineno);
            }
         } else if (param[i].getw().toUpperCase().equals("MATERIAL") && param[i + 1].getw().toUpperCase().equals("=")) {
            try {
               this.material[0] = super.findMaterial(param[i + 2].getw().toUpperCase(), materiallist);
               i += 3;
               this.Material_is_set = true;
            }  catch (IllegalArgumentException e) {
               throw new java.text.ParseException("Error in Shell_BT_4 element\n" + e.getMessage(), lineno);
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
         } else if (param[i].getw().toUpperCase().equals("FRICTION") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.friction = param[i + 2].getn();
            i += 3;
            this.Friction_is_set = true;
         } else if (param[i].getw().toUpperCase().equals("SHEAR_FACTOR") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.shear_factor = param[i + 2].getn();
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("HOURGLASS") && param[i + 1].getw().toUpperCase().equals("=")) {
            if (param[i + 2].getw().toUpperCase().equals("OFF")) {
               this.hourglass_control = false;
            }
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("MHC") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.membrane_hourglass_coeff = param[i + 2].getn();
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("OOPHC") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.out_of_plane_hourglass_coeff = param[i + 2].getn();
            i += 3;
         } else if (param[i].getw().toUpperCase().equals("RHC") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.rotation_hourglass_coeff = param[i + 2].getn();
            i += 3;
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
         } else if (param[i].getw().toUpperCase().equals("FACTOR") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.factor = param[i + 2].getn();
            i += 3;
            this.Factor_is_set = true;
         } else if (param[i].getw().toUpperCase().equals("CONTACT") && param[i + 1].getw().toUpperCase().equals("=")) {
            if (param[i + 2].getw().toUpperCase().equals("OFF")) {
               this.Contact = run.elements.Shell_BT_4.DISABLED;
            } else if (param[i + 2].getw().toUpperCase().equals("ADVANCED")) {
               this.Contact = run.elements.Shell_BT_4.ADVANCED;
            } else if (param[i + 2].getw().toUpperCase().equals("EDGE")) {
               this.Contact = run.elements.Shell_BT_4.EDGE;
            } else if (param[i + 2].getw().toUpperCase().equals("ADVANCED_EDGE")) {
               this.Contact = run.elements.Shell_BT_4.ADVANCED_EDGE;
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
      if (this.Contact == run.elements.Shell_BT_4.BASIC || this.Contact == run.elements.Shell_BT_4.EDGE) {
         this.internal_contact_element_1 = new Contact_Triangle();
         this.internal_contact_element_2 = new Contact_Triangle();
         this.internal_contact_element_1.setNumber(-1);
         this.internal_contact_element_2.setNumber(-2);
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
         this.internal_contact_element_1.parse_Fembic(contact_input, lineno, nodelist, materiallist, loadlist, nodetable);
         contact_input[2] = new Token(new String("[" + this.node[2].getNumber() + "," + this.node[3].getNumber() + "," + this.node[0].getNumber() + "]"));
         this.internal_contact_element_2.parse_Fembic(contact_input, lineno, nodelist, materiallist, loadlist, nodetable);
      }
      if (this.Contact == run.elements.Shell_BT_4.ADVANCED || this.Contact == run.elements.Shell_BT_4.ADVANCED_EDGE) {
         this.internal_contact_element_1 = new Contact_Triangle();
         this.internal_contact_element_2 = new Contact_Triangle();
         this.internal_contact_element_3 = new Contact_Triangle();
         this.internal_contact_element_4 = new Contact_Triangle();
         this.internal_contact_element_1.setNumber(-1);
         this.internal_contact_element_2.setNumber(-2);
         this.internal_contact_element_3.setNumber(-3);
         this.internal_contact_element_4.setNumber(-4);
         this.middle_node = new InternalNode();
         this.middle_node.setNumber(-this.number);
         this.middle_node.registerMasterElement(this);
         nodelist.add(this.middle_node);
         nodetable.put(new Integer(-this.number), this.middle_node);
         contact_input[0] = new Token(new String("nodes"));
         contact_input[1] = new Token(new String("="));
         contact_input[2] = new Token(new String("[" + this.node[0].getNumber() + "," + this.node[1].getNumber() + "," + this.middle_node.getNumber() + "]"));
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
         this.internal_contact_element_1.parse_Fembic(contact_input, lineno, nodelist, materiallist, loadlist, nodetable);
         contact_input[2] = new Token(new String("[" + this.node[1].getNumber() + "," + this.node[2].getNumber() + "," + this.middle_node.getNumber() + "]"));
         this.internal_contact_element_2.parse_Fembic(contact_input, lineno, nodelist, materiallist, loadlist, nodetable);
         contact_input[2] = new Token(new String("[" + this.node[2].getNumber() + "," + this.node[3].getNumber() + "," + this.middle_node.getNumber() + "]"));
         this.internal_contact_element_3.parse_Fembic(contact_input, lineno, nodelist, materiallist, loadlist, nodetable);
         contact_input[2] = new Token(new String("[" + this.node[3].getNumber() + "," + this.node[0].getNumber() + "," + this.middle_node.getNumber() + "]"));
         this.internal_contact_element_4.parse_Fembic(contact_input, lineno, nodelist, materiallist, loadlist, nodetable);
      }
      if (this.Contact == run.elements.Shell_BT_4.EDGE || this.Contact == run.elements.Shell_BT_4.ADVANCED_EDGE) {
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
         if (!this.node[2].hasContact_LineElementConnectedTo(this.node[3])) {
            this.internal_contact_line_element_3 = new Contact_Line();
            this.internal_contact_line_element_3.setNumber(-3);
            contact_input[2] = new Token(new String("[" + this.node[2].getNumber() + "," + this.node[3].getNumber() + "]"));
            contact_input[3] = new Token(new String("D"));
            contact_input[4] = new Token(new String("="));
            contact_input[5] = new Token(this.thickness);
            this.internal_contact_line_element_3.parse_Fembic(contact_input, lineno, nodelist, materiallist, loadlist, nodetable);
         }
         if (!this.node[3].hasContact_LineElementConnectedTo(this.node[0])) {
            this.internal_contact_line_element_4 = new Contact_Line();
            this.internal_contact_line_element_4.setNumber(-4);
            contact_input[2] = new Token(new String("[" + this.node[3].getNumber() + "," + this.node[0].getNumber() + "]"));
            contact_input[3] = new Token(new String("D"));
            contact_input[4] = new Token(new String("="));
            contact_input[5] = new Token(this.thickness);
            this.internal_contact_line_element_4.parse_Fembic(contact_input, lineno, nodelist, materiallist, loadlist, nodetable);
         }
      }
   }
   public void checkIndata() throws IllegalArgumentException {
      if (!this.Nodes_are_set) {
         throw new IllegalArgumentException("No nodes defined for Shell_BT_4 element nr" + this.number);
      }
      if (!this.Material_is_set) {
         throw new IllegalArgumentException("No Material defined for Shell_BT_4 element nr" + this.number);
      }
      if (!this.T_is_set) {
         throw new IllegalArgumentException("No Thickness (T) defined for Shell_BT_4 element nr" + this.number);
      }
      if (this.PIP_is_set) {
         if (this.printed_integration_point >= this.number_of_integration_points) {
            throw new IllegalArgumentException("Printed integration point larger than available points");
         }
         if (this.printed_integration_point < 0) {
            throw new IllegalArgumentException("Printed integration point less than 1");
         }
      }
      if (this.Contact == run.elements.Shell_BT_4.BASIC || this.Contact == run.elements.Shell_BT_4.EDGE) {
         this.internal_contact_element_1.checkIndata();
         this.internal_contact_element_2.checkIndata();
      }
      if (this.Contact == run.elements.Shell_BT_4.ADVANCED || this.Contact == run.elements.Shell_BT_4.ADVANCED_EDGE) {
         this.internal_contact_element_1.checkIndata();
         this.internal_contact_element_2.checkIndata();
         this.internal_contact_element_3.checkIndata();
         this.internal_contact_element_4.checkIndata();
      }
      if (this.Contact == run.elements.Shell_BT_4.EDGE || this.Contact == run.elements.Shell_BT_4.ADVANCED_EDGE) {
         if (this.internal_contact_line_element_1 != null) {
            this.internal_contact_line_element_1.checkIndata();
         }
         if (this.internal_contact_line_element_2 != null) {
            this.internal_contact_line_element_2.checkIndata();
         }
         if (this.internal_contact_line_element_3 != null) {
            this.internal_contact_line_element_3.checkIndata();
         }
         if (this.internal_contact_line_element_4 != null) {
            this.internal_contact_line_element_4.checkIndata();
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
         out = new String("MESH \"MeshType" + this.type + "\" Dimension 3 ElemType Quadrilateral Nnode 4\n");
         return out;
      
      case run.Element.MESH: 
         out = new String(this.number + "\t" + this.node[0].getNumber() + "\t" + this.node[1].getNumber() + "\t" + this.node[2].getNumber() + "\t" + this.node[3].getNumber() + "\n");
         return out;
      
      case run.Element.RESULT_HEADER: 
         out = new String("GaussPoints \"Type" + this.type + "\" ElemType Quadrilateral \"MeshType" + this.type + "\"\n");
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
      case Element.MESH: 
         out = new String(this.number + "\t nodes = [" + this.node[0].getNumber() + "," + this.node[1].getNumber() + "," + this.node[2].getNumber() + "," + this.node[3].getNumber() + "]\t" + "T = " + this.thickness + "\t" + "material = " + this.material[0].getName() + "\t");
         if (this.Factor_is_set) out += "factor = " + this.factor;
         if (this.Friction_is_set) out += "friction = " + this.friction;
         if (this.Contact == run.elements.Shell_BT_4.DISABLED) out += " contact = OFF";
         if (this.Contact == run.elements.Shell_BT_4.EDGE) out += " contact = EDGE";
         if (this.Contact == run.elements.Shell_BT_4.ADVANCED) out += " contact = ADVANCED";
         if (this.Contact == run.elements.Shell_BT_4.ADVANCED_EDGE) out += " contact = ADVANCED_EDGE";
         if (this.NIP_is_set) out += " nip = " + this.number_of_integration_points;
         if (this.PIP_is_set) out += " pip = " + this.printed_integration_point;
         if (this.shear_factor != 0) out += " shear_factor = " + this.shear_factor;
         if (this.hourglass_control) out += " hourglass = ON";
         if (this.membrane_hourglass_coeff != 0) out += " mhc = " + this.membrane_hourglass_coeff;
         if (this.out_of_plane_hourglass_coeff != 0) out += " oophc = " + this.out_of_plane_hourglass_coeff;
         if (this.rotation_hourglass_coeff != 0) out += " rhc = " + this.rotation_hourglass_coeff;
         if (this.load != null) out += " load = " + this.load.getName();
         if (!this.Thinning_is_enabled) out += " thinning = OFF";
         out += "\n";
         return out;
      
      default: 
         return new String("");
      
      }
   }
   public void setInitialConditions() throws IllegalArgumentException {
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
      this.hourglass_vector.set(0, 0, 1);
      this.hourglass_vector.set(1, 0, -1);
      this.hourglass_vector.set(2, 0, 1);
      this.hourglass_vector.set(3, 0, -1);
      if (this.Contact == run.elements.Shell_BT_4.BASIC || this.Contact == run.elements.Shell_BT_4.EDGE) {
         this.internal_contact_element_1.setInitialConditions();
         this.internal_contact_element_2.setInitialConditions();
      }
      if (this.Contact == run.elements.Shell_BT_4.ADVANCED || this.Contact == run.elements.Shell_BT_4.ADVANCED_EDGE) {
         this.internal_contact_element_1.setInitialConditions();
         this.internal_contact_element_2.setInitialConditions();
         this.internal_contact_element_3.setInitialConditions();
         this.internal_contact_element_4.setInitialConditions();
      }
      if (this.Contact == run.elements.Shell_BT_4.EDGE || this.Contact == run.elements.Shell_BT_4.ADVANCED_EDGE) {
         if (this.internal_contact_line_element_1 != null) {
            this.internal_contact_line_element_1.setInitialConditions();
         }
         if (this.internal_contact_line_element_2 != null) {
            this.internal_contact_line_element_2.setInitialConditions();
         }
         if (this.internal_contact_line_element_3 != null) {
            this.internal_contact_line_element_3.setInitialConditions();
         }
         if (this.internal_contact_line_element_4 != null) {
            this.internal_contact_line_element_4.setInitialConditions();
         }
      }
      if (!this.PIP_is_set) {
         this.printed_integration_point = this.number_of_integration_points / 2;
      }
   }
   public void updateLocalCoordinateSystem() {
      this.calculateLocalBaseVectors(this.node[0].getX_pos(), this.node[0].getY_pos(), this.node[0].getZ_pos(), this.node[1].getX_pos(), this.node[1].getY_pos(), this.node[1].getZ_pos(), this.node[2].getX_pos(), this.node[2].getY_pos(), this.node[2].getZ_pos(), this.node[3].getX_pos(), this.node[3].getY_pos(), this.node[3].getZ_pos(), this.local_coordinate_system);
      if (this.Contact == run.elements.Shell_BT_4.BASIC || this.Contact == run.elements.Shell_BT_4.EDGE) {
         this.internal_contact_element_1.updateLocalCoordinateSystem();
         this.internal_contact_element_2.updateLocalCoordinateSystem();
      }
      if (this.Contact == run.elements.Shell_BT_4.ADVANCED || this.Contact == run.elements.Shell_BT_4.ADVANCED_EDGE) {
         this.internal_contact_element_1.updateLocalCoordinateSystem();
         this.internal_contact_element_2.updateLocalCoordinateSystem();
         this.internal_contact_element_3.updateLocalCoordinateSystem();
         this.internal_contact_element_4.updateLocalCoordinateSystem();
      }
      if (this.Contact == run.elements.Shell_BT_4.EDGE || this.Contact == run.elements.Shell_BT_4.ADVANCED_EDGE) {
         if (this.internal_contact_line_element_1 != null) {
            this.internal_contact_line_element_1.updateLocalCoordinateSystem();
         }
         if (this.internal_contact_line_element_2 != null) {
            this.internal_contact_line_element_2.updateLocalCoordinateSystem();
         }
         if (this.internal_contact_line_element_3 != null) {
            this.internal_contact_line_element_3.updateLocalCoordinateSystem();
         }
         if (this.internal_contact_line_element_4 != null) {
            this.internal_contact_line_element_4.updateLocalCoordinateSystem();
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
      this.trash.set(9, 0, this.node[3].getX_pos());
      this.trash.set(10, 0, this.node[3].getY_pos());
      this.trash.set(11, 0, this.node[3].getZ_pos());
      this.p.set(0, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(0, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(1, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(2, 0));
      this.p.set(1, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(0, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(1, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(2, 0));
      this.p.set(2, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(0, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(1, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(2, 0));
      this.p.set(3, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(3, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(4, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(5, 0));
      this.p.set(4, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(3, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(4, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(5, 0));
      this.p.set(5, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(3, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(4, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(5, 0));
      this.p.set(6, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(6, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(7, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(8, 0));
      this.p.set(7, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(6, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(7, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(8, 0));
      this.p.set(8, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(6, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(7, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(8, 0));
      this.p.set(9, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(9, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(10, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(11, 0));
      this.p.set(10, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(9, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(10, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(11, 0));
      this.p.set(11, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(9, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(10, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(11, 0));
      this.trash.set(0, 0, this.node[0].getX_vel());
      this.trash.set(1, 0, this.node[0].getY_vel());
      this.trash.set(2, 0, this.node[0].getZ_vel());
      this.trash.set(3, 0, this.node[1].getX_vel());
      this.trash.set(4, 0, this.node[1].getY_vel());
      this.trash.set(5, 0, this.node[1].getZ_vel());
      this.trash.set(6, 0, this.node[2].getX_vel());
      this.trash.set(7, 0, this.node[2].getY_vel());
      this.trash.set(8, 0, this.node[2].getZ_vel());
      this.trash.set(9, 0, this.node[3].getX_vel());
      this.trash.set(10, 0, this.node[3].getY_vel());
      this.trash.set(11, 0, this.node[3].getZ_vel());
      this.v.set(0, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(0, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(1, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(2, 0));
      this.v.set(1, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(0, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(1, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(2, 0));
      this.v.set(2, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(0, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(1, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(2, 0));
      this.v.set(3, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(3, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(4, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(5, 0));
      this.v.set(4, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(3, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(4, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(5, 0));
      this.v.set(5, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(3, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(4, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(5, 0));
      this.v.set(6, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(6, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(7, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(8, 0));
      this.v.set(7, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(6, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(7, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(8, 0));
      this.v.set(8, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(6, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(7, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(8, 0));
      this.v.set(9, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(9, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(10, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(11, 0));
      this.v.set(10, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(9, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(10, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(11, 0));
      this.v.set(11, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(9, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(10, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(11, 0));
      this.trash.set(0, 0, this.node[0].getX_rot_vel());
      this.trash.set(1, 0, this.node[0].getY_rot_vel());
      this.trash.set(2, 0, this.node[0].getZ_rot_vel());
      this.trash.set(3, 0, this.node[1].getX_rot_vel());
      this.trash.set(4, 0, this.node[1].getY_rot_vel());
      this.trash.set(5, 0, this.node[1].getZ_rot_vel());
      this.trash.set(6, 0, this.node[2].getX_rot_vel());
      this.trash.set(7, 0, this.node[2].getY_rot_vel());
      this.trash.set(8, 0, this.node[2].getZ_rot_vel());
      this.trash.set(9, 0, this.node[3].getX_rot_vel());
      this.trash.set(10, 0, this.node[3].getY_rot_vel());
      this.trash.set(11, 0, this.node[3].getZ_rot_vel());
      this.a.set(0, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(0, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(1, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(2, 0));
      this.a.set(1, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(0, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(1, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(2, 0));
      this.a.set(2, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(0, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(1, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(2, 0));
      this.a.set(3, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(3, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(4, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(5, 0));
      this.a.set(4, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(3, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(4, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(5, 0));
      this.a.set(5, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(3, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(4, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(5, 0));
      this.a.set(6, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(6, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(7, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(8, 0));
      this.a.set(7, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(6, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(7, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(8, 0));
      this.a.set(8, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(6, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(7, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(8, 0));
      this.a.set(9, 0, this.local_coordinate_system.get(0, 0) * this.trash.get(9, 0) + this.local_coordinate_system.get(0, 1) * this.trash.get(10, 0) + this.local_coordinate_system.get(0, 2) * this.trash.get(11, 0));
      this.a.set(10, 0, this.local_coordinate_system.get(1, 0) * this.trash.get(9, 0) + this.local_coordinate_system.get(1, 1) * this.trash.get(10, 0) + this.local_coordinate_system.get(1, 2) * this.trash.get(11, 0));
      this.a.set(11, 0, this.local_coordinate_system.get(2, 0) * this.trash.get(9, 0) + this.local_coordinate_system.get(2, 1) * this.trash.get(10, 0) + this.local_coordinate_system.get(2, 2) * this.trash.get(11, 0));
      this.area = 0.5 * ((this.p.get(6, 0) - this.p.get(0, 0)) * (this.p.get(10, 0) - this.p.get(4, 0)) + (this.p.get(3, 0) - this.p.get(9, 0)) * (this.p.get(7, 0) - this.p.get(1, 0)));
   }
   public void setInternalNodePosition() {
      this.middle_node.setX_pos_orig((this.node[0].getX_pos() + this.node[1].getX_pos() + this.node[2].getX_pos() + this.node[3].getX_pos()) / 4);
      this.middle_node.setY_pos_orig((this.node[0].getY_pos() + this.node[1].getY_pos() + this.node[2].getY_pos() + this.node[3].getY_pos()) / 4);
      this.middle_node.setZ_pos_orig((this.node[0].getZ_pos() + this.node[1].getZ_pos() + this.node[2].getZ_pos() + this.node[3].getZ_pos()) / 4);
   }
   public Node getInternalNode() {
      return this.middle_node;
   }
   public void deActivate() {
      super.deActivate();
      if (this.internal_contact_element_1 != null) this.internal_contact_element_1.deActivate();
      if (this.internal_contact_element_2 != null) this.internal_contact_element_2.deActivate();
      if (this.internal_contact_element_3 != null) this.internal_contact_element_3.deActivate();
      if (this.internal_contact_element_4 != null) this.internal_contact_element_4.deActivate();
      if (this.internal_contact_line_element_1 != null) this.internal_contact_line_element_1.deActivate();
      if (this.internal_contact_line_element_2 != null) this.internal_contact_line_element_2.deActivate();
      if (this.internal_contact_line_element_3 != null) this.internal_contact_line_element_3.deActivate();
      if (this.internal_contact_line_element_4 != null) this.internal_contact_line_element_4.deActivate();
      if (this.middle_node != null) this.middle_node.deActivate();
   }
}
