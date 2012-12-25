package run.elements;
import run.*;

import java.util.Hashtable;

public class Rod_2 extends Element implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Rod_2 copy = (Rod_2)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.Contact, copy.Contact)) copy.Contact = this.Contact;
      if (po.writeDiff(this.Friction_is_set, copy.Friction_is_set)) copy.Friction_is_set = this.Friction_is_set;
      if (po.writeDiff(this.Factor_is_set, copy.Factor_is_set)) copy.Factor_is_set = this.Factor_is_set;
      if (po.writeDiff(this.Material_is_set, copy.Material_is_set)) copy.Material_is_set = this.Material_is_set;
      if (po.writeDiff(this.Nodes_are_set, copy.Nodes_are_set)) copy.Nodes_are_set = this.Nodes_are_set;
      if (po.writeDiff(this.D_is_set, copy.D_is_set)) copy.D_is_set = this.D_is_set;
      if (po.writeDiff(this.friction, copy.friction)) copy.friction = this.friction;
      if (po.writeDiff(this.factor, copy.factor)) copy.factor = this.factor;
      if (po.writeDiff(this.initial_cross_section_area, copy.initial_cross_section_area)) copy.initial_cross_section_area = this.initial_cross_section_area;
      if (po.writeDiff(this.initial_length, copy.initial_length)) copy.initial_length = this.initial_length;
      if (po.writeDiff(this.diameter, copy.diameter)) copy.diameter = this.diameter;
      if (po.writeDiff(this.cross_section_area, copy.cross_section_area)) copy.cross_section_area = this.cross_section_area;
      copy.internal_contact_element = this.internal_contact_element = (run.elements.Contact_Line)po.writeDiff(this.internal_contact_element, copy.internal_contact_element);
      copy.dstrain = this.dstrain = (Jama.Matrix)po.writeDiff(this.dstrain, copy.dstrain);
      copy.force = this.force = (Jama.Matrix)po.writeDiff(this.force, copy.force);
      copy.stress = this.stress = (Jama.Matrix)po.writeDiff(this.stress, copy.stress);
      copy.strain = this.strain = (Jama.Matrix)po.writeDiff(this.strain, copy.strain);
      copy.inertia = this.inertia = (Jama.Matrix)po.writeDiff(this.inertia, copy.inertia);
      copy.local_coordinate_system = this.local_coordinate_system = (Jama.Matrix)po.writeDiff(this.local_coordinate_system, copy.local_coordinate_system);
      copy.material = this.material = (run.Material)po.writeDiff(this.material, copy.material);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Rod_2 copy = (Rod_2)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.Contact = this.Contact = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.Friction_is_set = this.Friction_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Factor_is_set = this.Factor_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Material_is_set = this.Material_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Nodes_are_set = this.Nodes_are_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.D_is_set = this.D_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.friction = this.friction = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.factor = this.factor = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.initial_cross_section_area = this.initial_cross_section_area = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.initial_length = this.initial_length = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.diameter = this.diameter = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.cross_section_area = this.cross_section_area = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.internal_contact_element = this.internal_contact_element = (run.elements.Contact_Line)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.dstrain = this.dstrain = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.force = this.force = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.stress = this.stress = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.strain = this.strain = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.inertia = this.inertia = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.local_coordinate_system = this.local_coordinate_system = (Jama.Matrix)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.material = this.material = (run.Material)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.internal_contact_element);
      c.descend(this.dstrain);
      c.descend(this.force);
      c.descend(this.stress);
      c.descend(this.strain);
      c.descend(this.inertia);
      c.descend(this.local_coordinate_system);
      c.descend(this.material);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.internal_contact_element = (run.elements.Contact_Line)f.filter(this.internal_contact_element);
      this.dstrain = (Jama.Matrix)f.filter(this.dstrain);
      this.force = (Jama.Matrix)f.filter(this.force);
      this.stress = (Jama.Matrix)f.filter(this.stress);
      this.strain = (Jama.Matrix)f.filter(this.strain);
      this.inertia = (Jama.Matrix)f.filter(this.inertia);
      this.local_coordinate_system = (Jama.Matrix)f.filter(this.local_coordinate_system);
      this.material = (run.Material)f.filter(this.material);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new Rod_2(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((Rod_2)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Rod_2)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Rod_2)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new Rod_2((Rod_2)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((Rod_2)copy).deepCloneReferences((Rod_2)orig, _helper);
         return false;
      }
      public Class getType() {
         return Rod_2.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double;
   public Rod_2(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(Rod_2._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.Contact = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.Friction_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Factor_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Material_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Nodes_are_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.D_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.friction = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.factor = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.initial_cross_section_area = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.initial_length = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.diameter = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.cross_section_area = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      _stream.accept(Rod_2._SIZE);
      this.internal_contact_element = (run.elements.Contact_Line)_stream.readReference();
      this.dstrain = (Jama.Matrix)_stream.readReference();
      this.force = (Jama.Matrix)_stream.readReference();
      this.stress = (Jama.Matrix)_stream.readReference();
      this.strain = (Jama.Matrix)_stream.readReference();
      this.inertia = (Jama.Matrix)_stream.readReference();
      this.local_coordinate_system = (Jama.Matrix)_stream.readReference();
      this.material = (run.Material)_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(Rod_2._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Contact);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Friction_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Factor_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Material_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Nodes_are_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.D_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.friction);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.factor);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.initial_cross_section_area);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.initial_length);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.diameter);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.cross_section_area);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.internal_contact_element);
      _stream.writeReference(this.dstrain);
      _stream.writeReference(this.force);
      _stream.writeReference(this.stress);
      _stream.writeReference(this.strain);
      _stream.writeReference(this.inertia);
      _stream.writeReference(this.local_coordinate_system);
      _stream.writeReference(this.material);
   }
   public Rod_2(Rod_2 _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.Contact = _orig.Contact;
      this.Friction_is_set = _orig.Friction_is_set;
      this.Factor_is_set = _orig.Factor_is_set;
      this.Material_is_set = _orig.Material_is_set;
      this.Nodes_are_set = _orig.Nodes_are_set;
      this.D_is_set = _orig.D_is_set;
      this.friction = _orig.friction;
      this.factor = _orig.factor;
      this.initial_cross_section_area = _orig.initial_cross_section_area;
      this.initial_length = _orig.initial_length;
      this.diameter = _orig.diameter;
      this.cross_section_area = _orig.cross_section_area;
   }
   public void deepCloneReferences(Rod_2 _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.internal_contact_element = (run.elements.Contact_Line)_helper.internalDeepClone(_orig.internal_contact_element);
      this.dstrain = (Jama.Matrix)_helper.internalDeepClone(_orig.dstrain);
      this.force = (Jama.Matrix)_helper.internalDeepClone(_orig.force);
      this.stress = (Jama.Matrix)_helper.internalDeepClone(_orig.stress);
      this.strain = (Jama.Matrix)_helper.internalDeepClone(_orig.strain);
      this.inertia = (Jama.Matrix)_helper.internalDeepClone(_orig.inertia);
      this.local_coordinate_system = (Jama.Matrix)_helper.internalDeepClone(_orig.local_coordinate_system);
      this.material = (run.Material)_helper.internalDeepClone(_orig.material);
   }
   private static int DISABLED = 0;
   private static int BASIC = 1;
   private double cross_section_area;
   private Material material;
   private Jama.Matrix local_coordinate_system;
   private double diameter;
   private double initial_length;
   private Jama.Matrix inertia;
   private Jama.Matrix strain;
   private Jama.Matrix stress;
   private Jama.Matrix force;
   private Jama.Matrix dstrain;
   private double initial_cross_section_area;
   private double factor;
   private double friction;
   private boolean D_is_set;
   private boolean Nodes_are_set;
   private boolean Material_is_set;
   private boolean Factor_is_set;
   private boolean Friction_is_set;
   private Contact_Line internal_contact_element;
   private int Contact;
   public Rod_2() {
      super();
      this.type = new String("ROD_2");
      this.inertia = new Jama.Matrix(3, 3);
      this.force = new Jama.Matrix(3, 1);
      this.stress = new Jama.Matrix(6, 1);
      this.strain = new Jama.Matrix(6, 1);
      this.dstrain = new Jama.Matrix(6, 1);
      this.local_coordinate_system = new Jama.Matrix(3, 3);
      this.processed = false;
      this.node = new Node[2];
      this.Contact = run.elements.Rod_2.BASIC;
   }
   public void assembleMassMatrix() throws IllegalArgumentException {
      double mass;
      this.initial_cross_section_area = Math.PI * this.diameter * this.diameter / 4;
      this.cross_section_area = this.initial_cross_section_area;
      if (this.cross_section_area <= 0) {
         throw new IllegalArgumentException("Error in rod element " + this.number + ", Cross section area is zero or negative");
      }
      this.initial_length = java.lang.Math.sqrt((this.node[0].getX_pos() - this.node[1].getX_pos()) * (this.node[0].getX_pos() - this.node[1].getX_pos()) + (this.node[0].getY_pos() - this.node[1].getY_pos()) * (this.node[0].getY_pos() - this.node[1].getY_pos()) + (this.node[0].getZ_pos() - this.node[1].getZ_pos()) * (this.node[0].getZ_pos() - this.node[1].getZ_pos()));
      mass = this.material.getDensity() * this.cross_section_area * this.initial_length;
      if (mass <= 0) {
         throw new IllegalArgumentException("Error in rod element " + this.number + ". Element mass is zero or negative.\nElement length: " + this.initial_length + "   Material density: " + this.material.getDensity());
      }
      this.node[0].addMass(mass / 2.0);
      this.node[1].addMass(mass / 2.0);
      this.inertia.set(0, 0, Math.max(mass * this.diameter * this.diameter / 8, mass * this.initial_length * this.initial_length / 12));
      this.inertia.set(1, 1, this.inertia.get(0, 0));
      this.inertia.set(2, 2, this.inertia.get(0, 0));
      this.inertia.set(1, 0, 0);
      this.inertia.set(2, 0, 0);
      this.inertia.set(0, 1, 0);
      this.inertia.set(0, 2, 0);
      this.inertia.set(2, 1, 0);
      this.inertia.set(1, 2, 0);
      this.node[0].addInertia(this.inertia);
      this.node[1].addInertia(this.inertia);
      if (this.Contact == run.elements.Rod_2.BASIC) {
         this.internal_contact_element.assembleMassMatrix();
      }
   }
   public void calculateContactForces() {
      if (this.Contact == run.elements.Rod_2.BASIC) {
         this.internal_contact_element.calculateContactForces();
      }
   }
   public void calculateExternalForces(double currtime) {
      if (this.Contact == run.elements.Rod_2.BASIC) {
         this.internal_contact_element.calculateExternalForces(currtime);
      }
   }
   public void calculateNodalForces(int integration_point, double timestep) {
      Jama.Matrix global_force;
      this.force.set(0, 0, this.stress.get(0, 0) * this.cross_section_area);
      this.force.set(1, 0, 0);
      this.force.set(2, 0, 0);
      global_force = this.local_coordinate_system.transpose().times(this.force);
      this.node[0].addInternalForce(global_force.times(1));
      this.node[1].addInternalForce(global_force.times(-1));
   }
   public void calculateStrain(double timestep, int integration_point) {
      double xpos1;
      double ypos1;
      double zpos1;
      double xpos2;
      double ypos2;
      double zpos2;
      double new_length;
      xpos1 = this.node[0].getX_pos();
      ypos1 = this.node[0].getY_pos();
      zpos1 = this.node[0].getZ_pos();
      xpos2 = this.node[1].getX_pos();
      ypos2 = this.node[1].getY_pos();
      zpos2 = this.node[1].getZ_pos();
      new_length = java.lang.Math.sqrt((xpos2 - xpos1) * (xpos2 - xpos1) + (ypos2 - ypos1) * (ypos2 - ypos1) + (zpos2 - zpos1) * (zpos2 - zpos1));
      this.dstrain.set(0, 0, Math.log(1 + (new_length - this.initial_length) / this.initial_length) - this.strain.get(0, 0));
      this.cross_section_area = this.initial_cross_section_area * this.initial_length / new_length;
   }
   public void calculateStress(int integration_point, double timestep) {
      this.material.calculateStressOneDimensional(this.strain, this.dstrain, this.stress, timestep);
   }
   public double checkTimestep(double current_timestep) {
      double timestep;
      double critical_length;
      double xpos1;
      double ypos1;
      double zpos1;
      double xpos2;
      double ypos2;
      double zpos2;
      xpos1 = this.node[0].getX_pos();
      ypos1 = this.node[0].getY_pos();
      zpos1 = this.node[0].getZ_pos();
      xpos2 = this.node[1].getX_pos();
      ypos2 = this.node[1].getY_pos();
      zpos2 = this.node[1].getZ_pos();
      critical_length = java.lang.Math.sqrt((xpos2 - xpos1) * (xpos2 - xpos1) + (ypos2 - ypos1) * (ypos2 - ypos1) + (zpos2 - zpos1) * (zpos2 - zpos1));
      timestep = critical_length / this.material.wavespeedOneDimensional(0.0, 0.0);
      return Math.min(0.9 * timestep, current_timestep);
   }
   private double getI1() {
      return this.inertia.get(0, 0);
   }
   private double getI2() {
      return this.inertia.get(1, 1);
   }
   private double getI3() {
      return this.inertia.get(2, 2);
   }
   public int getNumberOfIntegrationPoints() {
      return 1;
   }
   public double getForce() {
      return this.force.get(0, 0);
   }
   public void parse_Fembic(Token[] param, int lineno, RplVector nodelist, RplVector materiallist, RplVector loadlist, Hashtable nodetable) throws java.text.ParseException {
      int nodenumber;
      int i = 0;
      Token[] contact_input;
      while (i < param.length) {
         if (param[i].getw().toUpperCase().equals("NODES") && param[i + 1].getw().toUpperCase().equals("=")) {
            if (!param[i + 2].getw().toUpperCase().startsWith("[") || !param[i + 2].getw().toUpperCase().endsWith("]")) {
               throw new java.text.ParseException("Error, node number definition should be [nodenr,nodenr]", lineno);
            }
            try {
               nodenumber = super.getNodeNumber(1, param[i + 2].getw());
               this.node[0] = super.findNode(nodenumber, nodetable);
               nodenumber = super.getNodeNumber(2, param[i + 2].getw());
               this.node[1] = super.findNode(nodenumber, nodetable);
               i += 3;
               this.Nodes_are_set = true;
            }  catch (IllegalArgumentException e) {
               throw new java.text.ParseException("Error in Rod_2 element\n" + e.getMessage() + "in line ", lineno);
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
         } else if (param[i].getw().toUpperCase().equals("FRICTION") && param[i + 1].getw().toUpperCase().equals("=")) {
            this.friction = param[i + 2].getn();
            i += 3;
            this.Friction_is_set = true;
         } else if (param[i].getw().toUpperCase().equals("CONTACT") && param[i + 1].getw().toUpperCase().equals("=")) {
            if (param[i + 2].getw().toUpperCase().equals("OFF")) {
               this.Contact = run.elements.Rod_2.DISABLED;
            } else {
               throw new java.text.ParseException("Unrecognized contact parameter", lineno);
            }
            i += 3;
         } else {
            throw new java.text.ParseException("Unknown Rod element parameter ", lineno);
         }
      }
      if (this.Contact == run.elements.Rod_2.BASIC) {
         this.internal_contact_element = new Contact_Line();
         this.internal_contact_element.setNumber(-1);
         i = 6;
         if (this.Factor_is_set) i += 3;
         if (this.Friction_is_set) i += 3;
         contact_input = new Token[i];
         contact_input[0] = new Token(new String("nodes"));
         contact_input[1] = new Token(new String("="));
         contact_input[2] = new Token(new String("[" + this.node[0].getNumber() + "," + this.node[1].getNumber() + "]"));
         contact_input[3] = new Token(new String("D"));
         contact_input[4] = new Token(new String("="));
         contact_input[5] = new Token(this.diameter);
         i = 6;
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
   }
   public void checkIndata() throws IllegalArgumentException {
      if (!this.D_is_set) {
         throw new IllegalArgumentException("No Diameter defined for Rod element nr" + this.number);
      }
      if (!this.Nodes_are_set) {
         throw new IllegalArgumentException("No nodes defined for Rod element nr" + this.number);
      }
      if (!this.Material_is_set) {
         throw new IllegalArgumentException("No Material defined for Rod element nr" + this.number);
      }
      if (this.Contact == run.elements.Rod_2.BASIC) {
         this.internal_contact_element.checkIndata();
      }
   }
   public void checkIfFailed() {
      if (!this.material.failureStrainIsSet() && !this.material.failureStressIsSet()) {
         this.failed = false;
         return;
      }
      if (this.material.failureStressIsSet()) {
         if (this.stress.get(0, 0) > this.material.getFailureStress()) {
            this.failed = true;
            return;
         }
      }
      if (this.material.failureStrainIsSet()) {
         if (this.strain.get(0, 0) > this.material.getFailureStrain()) {
            this.failed = true;
            return;
         }
      }
      this.failed = false;
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
         out += this.stress.get(0, 0) + "\n";
         return out;
      
      case run.Element.RESULT_STRAIN_LOCAL: 
         out = new String(this.number + " ");
         out += this.strain.get(0, 0) + "\n";
         return out;
      
      default: 
         return new String("");
      
      }
   }
   public String print_Fembic(int ctrl, int gpn) {
      String out;
      switch (ctrl) {
      case run.Element.MESH: 
         out = new String(this.number + "\t nodes = [" + this.node[0].getNumber() + "," + this.node[1].getNumber() + "]\t" + "D = " + this.diameter + "\t" + "material = " + this.material.getName() + "\t");
         if (this.Factor_is_set) out += " factor = " + this.factor;
         if (this.Friction_is_set) out += " friction = " + this.friction;
         if (this.Contact == run.elements.Rod_2.DISABLED) out += " contact = OFF";
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
      if (this.Contact == run.elements.Rod_2.BASIC) {
         this.internal_contact_element.setInitialConditions();
      }
   }
   public void updateLocalCoordinateSystem() {
      this.calculateLocalBaseVectors(0, 0, 0, this.node[1].getX_pos() - this.node[0].getX_pos(), this.node[1].getY_pos() - this.node[0].getY_pos(), this.node[1].getZ_pos() - this.node[0].getZ_pos(), this.node[1].getZ_pos() - this.node[0].getZ_pos(), this.node[0].getX_pos() - this.node[1].getX_pos(), this.node[1].getY_pos() - this.node[0].getY_pos(), this.local_coordinate_system);
      if (this.Contact == run.elements.Rod_2.BASIC) {
         this.internal_contact_element.updateLocalCoordinateSystem();
      }
   }
   public void deActivate() {
      super.deActivate();
      if (this.internal_contact_element != null) this.internal_contact_element.deActivate();
   }
}
