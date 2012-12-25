package run.elements;
import run.*;

import java.util.Hashtable;

import Jama.Matrix;

public class Beam_Spring_2 extends Element implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Beam_Spring_2 copy = (Beam_Spring_2)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.Contact, copy.Contact)) copy.Contact = this.Contact;
      if (po.writeDiff(this.D_is_set, copy.D_is_set)) copy.D_is_set = this.D_is_set;
      if (po.writeDiff(this.Material_is_set, copy.Material_is_set)) copy.Material_is_set = this.Material_is_set;
      if (po.writeDiff(this.Factor_is_set, copy.Factor_is_set)) copy.Factor_is_set = this.Factor_is_set;
      if (po.writeDiff(this.Nodes_are_set, copy.Nodes_are_set)) copy.Nodes_are_set = this.Nodes_are_set;
      if (po.writeDiff(this.diameter, copy.diameter)) copy.diameter = this.diameter;
      if (po.writeDiff(this.factor, copy.factor)) copy.factor = this.factor;
      copy.material = this.material = (run.Material)po.writeDiff(this.material, copy.material);
      copy.internal_contact_element = this.internal_contact_element = (run.elements.Contact_Line)po.writeDiff(this.internal_contact_element, copy.internal_contact_element);
      copy.drot1 = this.drot1 = (Jama.Matrix)po.writeDiff(this.drot1, copy.drot1);
      copy.drot0 = this.drot0 = (Jama.Matrix)po.writeDiff(this.drot0, copy.drot0);
      copy.dpos1 = this.dpos1 = (Jama.Matrix)po.writeDiff(this.dpos1, copy.dpos1);
      copy.dpos0 = this.dpos0 = (Jama.Matrix)po.writeDiff(this.dpos0, copy.dpos0);
      copy.global_m = this.global_m = (Jama.Matrix)po.writeDiff(this.global_m, copy.global_m);
      copy.force = this.force = (Jama.Matrix)po.writeDiff(this.force, copy.force);
      copy.velocity = this.velocity = (Jama.Matrix)po.writeDiff(this.velocity, copy.velocity);
      copy.displacement = this.displacement = (Jama.Matrix)po.writeDiff(this.displacement, copy.displacement);
      copy.global_moment = this.global_moment = (Jama.Matrix)po.writeDiff(this.global_moment, copy.global_moment);
      copy.global_force = this.global_force = (Jama.Matrix)po.writeDiff(this.global_force, copy.global_force);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Beam_Spring_2 copy = (Beam_Spring_2)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.Contact = this.Contact = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.D_is_set = this.D_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Material_is_set = this.Material_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Factor_is_set = this.Factor_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Nodes_are_set = this.Nodes_are_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.diameter = this.diameter = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.factor = this.factor = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.material = this.material = (run.Material)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.internal_contact_element = this.internal_contact_element = (run.elements.Contact_Line)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.drot1 = this.drot1 = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.drot0 = this.drot0 = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.dpos1 = this.dpos1 = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.dpos0 = this.dpos0 = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.global_m = this.global_m = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.force = this.force = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.velocity = this.velocity = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.displacement = this.displacement = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.global_moment = this.global_moment = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.global_force = this.global_force = (Jama.Matrix)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.material);
      c.descend(this.internal_contact_element);
      c.descend(this.drot1);
      c.descend(this.drot0);
      c.descend(this.dpos1);
      c.descend(this.dpos0);
      c.descend(this.global_m);
      c.descend(this.force);
      c.descend(this.velocity);
      c.descend(this.displacement);
      c.descend(this.global_moment);
      c.descend(this.global_force);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.material = (run.Material)f.filter(this.material);
      this.internal_contact_element = (run.elements.Contact_Line)f.filter(this.internal_contact_element);
      this.drot1 = (Jama.Matrix)f.filter(this.drot1);
      this.drot0 = (Jama.Matrix)f.filter(this.drot0);
      this.dpos1 = (Jama.Matrix)f.filter(this.dpos1);
      this.dpos0 = (Jama.Matrix)f.filter(this.dpos0);
      this.global_m = (Jama.Matrix)f.filter(this.global_m);
      this.force = (Jama.Matrix)f.filter(this.force);
      this.velocity = (Jama.Matrix)f.filter(this.velocity);
      this.displacement = (Jama.Matrix)f.filter(this.displacement);
      this.global_moment = (Jama.Matrix)f.filter(this.global_moment);
      this.global_force = (Jama.Matrix)f.filter(this.global_force);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new Beam_Spring_2(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((Beam_Spring_2)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Beam_Spring_2)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Beam_Spring_2)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new Beam_Spring_2((Beam_Spring_2)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((Beam_Spring_2)copy).deepCloneReferences((Beam_Spring_2)orig, _helper);
         return false;
      }
      public Class getType() {
         return Beam_Spring_2.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double;
   public Beam_Spring_2(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(Beam_Spring_2._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.Contact = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.D_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Material_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Factor_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Nodes_are_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.diameter = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.factor = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      _stream.accept(Beam_Spring_2._SIZE);
      this.material = (run.Material)_stream.readReference();
      this.internal_contact_element = (run.elements.Contact_Line)_stream.readReference();
      this.drot1 = (Jama.Matrix)_stream.readReference();
      this.drot0 = (Jama.Matrix)_stream.readReference();
      this.dpos1 = (Jama.Matrix)_stream.readReference();
      this.dpos0 = (Jama.Matrix)_stream.readReference();
      this.global_m = (Jama.Matrix)_stream.readReference();
      this.force = (Jama.Matrix)_stream.readReference();
      this.velocity = (Jama.Matrix)_stream.readReference();
      this.displacement = (Jama.Matrix)_stream.readReference();
      this.global_moment = (Jama.Matrix)_stream.readReference();
      this.global_force = (Jama.Matrix)_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(Beam_Spring_2._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Contact);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.D_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Material_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Factor_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Nodes_are_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.diameter);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.factor);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.material);
      _stream.writeReference(this.internal_contact_element);
      _stream.writeReference(this.drot1);
      _stream.writeReference(this.drot0);
      _stream.writeReference(this.dpos1);
      _stream.writeReference(this.dpos0);
      _stream.writeReference(this.global_m);
      _stream.writeReference(this.force);
      _stream.writeReference(this.velocity);
      _stream.writeReference(this.displacement);
      _stream.writeReference(this.global_moment);
      _stream.writeReference(this.global_force);
   }
   public Beam_Spring_2(Beam_Spring_2 _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.Contact = _orig.Contact;
      this.D_is_set = _orig.D_is_set;
      this.Material_is_set = _orig.Material_is_set;
      this.Factor_is_set = _orig.Factor_is_set;
      this.Nodes_are_set = _orig.Nodes_are_set;
      this.diameter = _orig.diameter;
      this.factor = _orig.factor;
   }
   public void deepCloneReferences(Beam_Spring_2 _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.material = (run.Material)_helper.internalDeepClone(_orig.material);
      this.internal_contact_element = (run.elements.Contact_Line)_helper.internalDeepClone(_orig.internal_contact_element);
      this.drot1 = (Jama.Matrix)_helper.internalDeepClone(_orig.drot1);
      this.drot0 = (Jama.Matrix)_helper.internalDeepClone(_orig.drot0);
      this.dpos1 = (Jama.Matrix)_helper.internalDeepClone(_orig.dpos1);
      this.dpos0 = (Jama.Matrix)_helper.internalDeepClone(_orig.dpos0);
      this.global_m = (Jama.Matrix)_helper.internalDeepClone(_orig.global_m);
      this.force = (Jama.Matrix)_helper.internalDeepClone(_orig.force);
      this.velocity = (Jama.Matrix)_helper.internalDeepClone(_orig.velocity);
      this.displacement = (Jama.Matrix)_helper.internalDeepClone(_orig.displacement);
      this.global_moment = (Jama.Matrix)_helper.internalDeepClone(_orig.global_moment);
      this.global_force = (Jama.Matrix)_helper.internalDeepClone(_orig.global_force);
   }
   private static int DISABLED = 0;
   private static int BASIC = 1;
   private Jama.Matrix global_force;
   private Jama.Matrix global_moment;
   private Jama.Matrix displacement;
   private Jama.Matrix velocity;
   private Jama.Matrix force;
   private Jama.Matrix global_m;
   private Jama.Matrix dpos0;
   private Jama.Matrix dpos1;
   private Jama.Matrix drot0;
   private Jama.Matrix drot1;
   private double factor;
   private double diameter;
   private boolean Nodes_are_set;
   private boolean Factor_is_set;
   private boolean Material_is_set;
   private boolean D_is_set;
   private Contact_Line internal_contact_element;
   private int Contact;
   private Material material;
   public Beam_Spring_2() {
      super();
      this.type = new String("BEAM_SPRING_2");
      this.force = new Jama.Matrix(6, 1);
      this.displacement = new Jama.Matrix(6, 1);
      this.velocity = new Jama.Matrix(6, 1);
      this.global_force = new Jama.Matrix(3, 1);
      this.global_moment = new Jama.Matrix(3, 1);
      this.dpos0 = new Jama.Matrix(3, 1);
      this.drot0 = new Matrix(3, 1);
      this.dpos1 = new Jama.Matrix(3, 1);
      this.drot1 = new Matrix(3, 1);
      this.global_m = new Jama.Matrix(3, 1);
      this.processed = false;
      this.node = new Node[2];
      this.Contact = run.elements.Beam_Spring_2.DISABLED;
   }
   public void assembleMassMatrix() throws IllegalArgumentException {
      this.updateLocalCoordinateSystem();
      if (this.Contact == run.elements.Beam_Spring_2.BASIC) {
         this.internal_contact_element.assembleMassMatrix();
      }
   }
   public void calculateContactForces() {
      if (this.Contact == run.elements.Beam_Spring_2.BASIC) {
         this.internal_contact_element.calculateContactForces();
      }
   }
   public void calculateExternalForces(double currtime) {
      if (this.Contact == run.elements.Beam_Spring_2.BASIC) {
         this.internal_contact_element.calculateExternalForces(currtime);
      }
   }
   public void calculateNodalForces(int integration_point, double timestep) {
      for (int i = 0; i < 3; i++) this.global_force.set(i, 0, this.force.get(i, 0));
      for (int i = 0; i < 3; i++) this.global_moment.set(i, 0, this.force.get(i + 3, 0));
      this.node[0].addInternalForce(this.global_force.times(1));
      this.node[1].addInternalForce(this.global_force.times(-1));
      this.node[0].addInternalMoment(this.global_moment.times(1));
      this.node[1].addInternalMoment(this.global_moment.times(-1));
   }
   public void calculateStrain(double timestep, int integration_point) throws IllegalArgumentException {
      this.dpos0 = this.node[0].getPos().minus(this.node[0].getPos_orig());
      this.dpos1 = this.node[1].getPos().minus(this.node[1].getPos_orig());
      this.drot0 = this.node[0].getRot().minus(this.node[0].getRot_orig());
      this.drot1 = this.node[1].getRot().minus(this.node[1].getRot_orig());
      this.displacement.set(0, 0, this.dpos1.get(0, 0) - this.dpos0.get(0, 0));
      this.displacement.set(1, 0, this.dpos1.get(1, 0) - this.dpos0.get(1, 0));
      this.displacement.set(2, 0, this.dpos1.get(2, 0) - this.dpos0.get(2, 0));
      this.displacement.set(3, 0, this.drot1.get(0, 0) - this.drot0.get(0, 0));
      this.displacement.set(4, 0, this.drot1.get(1, 0) - this.drot0.get(1, 0));
      this.displacement.set(5, 0, this.drot1.get(2, 0) - this.drot0.get(2, 0));
      this.dpos0 = this.node[0].getVel();
      this.dpos1 = this.node[1].getVel();
      this.drot0 = this.node[0].getRotVel();
      this.drot1 = this.node[1].getRotVel();
      this.velocity.set(0, 0, this.dpos1.get(0, 0) - this.dpos0.get(0, 0));
      this.velocity.set(1, 0, this.dpos1.get(1, 0) - this.dpos0.get(1, 0));
      this.velocity.set(2, 0, this.dpos1.get(2, 0) - this.dpos0.get(2, 0));
      this.velocity.set(3, 0, this.drot1.get(0, 0) - this.drot0.get(0, 0));
      this.velocity.set(4, 0, this.drot1.get(1, 0) - this.drot0.get(1, 0));
      this.velocity.set(5, 0, this.drot1.get(2, 0) - this.drot0.get(2, 0));
   }
   public void calculateStress(int integration_point, double timestep) throws IllegalArgumentException {
      this.material.calculateStressOneDimensional(this.displacement, this.velocity, this.force, timestep);
   }
   public double checkTimestep(double current_timestep) {
      double I1;
      double I2;
      I1 = (this.node[0].getInertia().get(0, 0) + this.node[0].getInertia().get(1, 1) + this.node[0].getInertia().get(2, 2)) / 3.0;
      I2 = (this.node[1].getInertia().get(0, 0) + this.node[1].getInertia().get(1, 1) + this.node[1].getInertia().get(2, 2)) / 3.0;
      return Math.min(current_timestep, this.material.wavespeedOneDimensional(4 * this.node[0].getMass() * this.node[1].getMass() / (this.node[0].getMass() + this.node[1].getMass()), 4 * I1 * I2 / (I1 + I2)));
   }
   public int getNumberOfIntegrationPoints() {
      return 1;
   }
   public Jama.Matrix getForce() {
      return this.force;
   }
   public void parse_Fembic(Token[] param, int lineno, RplVector nodelist, RplVector materiallist, RplVector loadlist, Hashtable nodetable) throws java.text.ParseException {
      int nodenumber;
      int i = 0;
      Token[] contact_input;
      while (i < param.length) {
         if (param[i].getw().toUpperCase().equals("NODES") && param[i + 1].getw().toUpperCase().equals("=")) {
            if (!param[i + 2].getw().toUpperCase().startsWith("[") || !param[i + 2].getw().toUpperCase().endsWith("]")) {
               throw new java.text.ParseException("Error, node number definition should be [nodenr,nodenr,nodenr]", lineno);
            }
            try {
               nodenumber = super.getNodeNumber(1, param[i + 2].getw());
               this.node[0] = super.findNode(nodenumber, nodetable);
               nodenumber = super.getNodeNumber(2, param[i + 2].getw());
               this.node[1] = super.findNode(nodenumber, nodetable);
               i += 3;
               this.Nodes_are_set = true;
            }  catch (IllegalArgumentException e) {
               throw new java.text.ParseException("Error in BeamSpring element\n" + e.getMessage() + "in line ", lineno);
            }
         } else if (param[i].getw().toUpperCase().equals("MATERIAL") && param[i + 1].getw().toUpperCase().equals("=")) {
            try {
               this.material = super.findMaterial(param[i + 2].getw().toUpperCase(), materiallist);
               i += 3;
               this.Material_is_set = true;
            }  catch (IllegalArgumentException e) {
               throw new java.text.ParseException(e.getMessage(), lineno);
            }
         } else if (param[i].getw().toUpperCase().equals("D") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.diameter = param[i + 2].getn();
            i += 3;
            this.D_is_set = true;
         } else if (param[i].getw().toUpperCase().equals("FACTOR") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.factor = param[i + 2].getn();
            i += 3;
            this.Factor_is_set = true;
         } else if (param[i].getw().toUpperCase().equals("CONTACT") && param[i + 1].getw().toUpperCase().equals("=")) {
            if (param[i + 2].getw().toUpperCase().equals("BASIC")) {
               this.Contact = run.elements.Beam_Spring_2.BASIC;
            } else {
               throw new java.text.ParseException("Unrecognized contact parameter", lineno);
            }
            i += 3;
         } else {
            throw new java.text.ParseException("Unknown BeamSpring element parameter ", lineno);
         }
      }
      if (this.Contact == run.elements.Beam_Spring_2.BASIC) {
         this.internal_contact_element = new Contact_Line();
         this.internal_contact_element.setNumber(-1);
         if (this.Factor_is_set) {
            contact_input = new Token[9];
         } else {
            contact_input = new Token[6];
         }
         contact_input[0] = new Token(new String("nodes"));
         contact_input[1] = new Token(new String("="));
         contact_input[2] = new Token(new String("[" + this.node[0].getNumber() + "," + this.node[1].getNumber() + "]"));
         contact_input[3] = new Token(new String("D"));
         contact_input[4] = new Token(new String("="));
         contact_input[5] = new Token(this.diameter);
         if (this.Factor_is_set) {
            contact_input[6] = new Token(new String("factor"));
            contact_input[7] = new Token(new String("="));
            contact_input[8] = new Token(this.factor);
         }
         this.internal_contact_element.parse_Fembic(contact_input, lineno, nodelist, materiallist, loadlist, nodetable);
      }
   }
   public void checkIndata() throws IllegalArgumentException {
      if (this.Contact == run.elements.Beam_Spring_2.BASIC && !this.D_is_set) {
         throw new IllegalArgumentException("No Diameter defined for BeamSpring element nr" + this.number);
      }
      if (!this.Nodes_are_set) {
         throw new IllegalArgumentException("No nodes defined for BeamSpring element nr" + this.number);
      }
      if (!this.Material_is_set) {
         throw new IllegalArgumentException("No Material defined for BeamSpring element nr" + this.number);
      }
      if (this.Contact == run.elements.Beam_Spring_2.BASIC) {
         this.internal_contact_element.checkIndata();
      }
   }
   public void checkIfFailed() {
   }
   public String print_Gid(int ctrl, int gpn) {
      String out;
      switch (ctrl) {
      case run.Element.MESH_HEADER: 
         out = new String("MESH \"MeshType" + this.type + "\" Dimension 3 ElemType Linear Nnode 2\n");
         return out;
      
      case run.Element.MESH: 
         out = new String(this.number + "\t" + this.node[0].getNumber() + "\t" + this.node[1].getNumber() + "\n");
         return out;
      
      case run.Element.RESULT_HEADER: 
         out = new String("GaussPoints \"Type" + this.type + "\" ElemType Linear \"MeshType" + this.type + "\"\n");
         out += "Number Of Gauss Points: 1\n";
         out += "Nodes Not Included\n";
         out += "Natural Coordinates: Internal\n";
         out += "End GaussPoints\n";
         return out;
      
      case run.Element.RESULT_SUB_HEADER: 
         out = new String(" 1 2 0 \"Type" + this.type + "\"\n");
         return out;
      
      case run.Element.RESULT_STRESS_LOCAL: 
         out = new String(this.number + " ");
         out += "0.0 \n";
         return out;
      
      case run.Element.RESULT_STRAIN_LOCAL: 
         out = new String(this.number + " ");
         out += "0.0 \n";
         return out;
      
      default: 
         return new String("");
      
      }
   }
   public String print_Fembic(int ctrl, int gpn) {
      String out;
      switch (ctrl) {
      case run.Element.MESH: 
         out = new String(this.number + "\t  nodes = [" + this.node[0].getNumber() + "," + this.node[1].getNumber() + "," + this.node[2].getNumber() + "]\t" + "material = " + this.material.getName() + "\t");
         if (this.D_is_set) out += " D = " + this.diameter;
         if (this.Factor_is_set) out += " factor = " + this.factor;
         if (this.Contact == run.elements.Beam_Spring_2.BASIC) out += " contact = BASIC";
         out += "\n";
         return out;
      
      default: 
         return new String("");
      
      }
   }
   public void setInitialConditions() throws IllegalArgumentException {
      try {
         this.material = (Material)this.material.copy();
      }  catch (CloneNotSupportedException e) {
         System.err.println("Object cannot clone");
      }
      this.material.setInitialConditions();
      if (this.Contact == run.elements.Beam_Spring_2.BASIC) {
         this.internal_contact_element.setInitialConditions();
      }
   }
   public void updateLocalCoordinateSystem() {
      if (this.Contact == run.elements.Beam_Spring_2.BASIC) {
         this.internal_contact_element.updateLocalCoordinateSystem();
      }
   }
   public double getFx() {
      return this.force.get(0, 0);
   }
   public double getFy() {
      return this.force.get(1, 0);
   }
   public double getFz() {
      return this.force.get(2, 0);
   }
   public double getMx() {
      return this.force.get(3, 0);
   }
   public double getMy() {
      return this.force.get(4, 0);
   }
   public double getMz() {
      return this.force.get(5, 0);
   }
   public void deActivate() {
      super.deActivate();
      if (this.internal_contact_element != null) this.internal_contact_element.deActivate();
   }
}
