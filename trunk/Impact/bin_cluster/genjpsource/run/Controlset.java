package run;
import java.text.ParseException;

import uka.karmi.rmi.RemoteException;

public class Controlset implements uka.patch.Patchable, uka.transport.Transportable, java.io.Serializable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      Controlset copy = (Controlset)_copy;
      if (po.writeDiff(this.Track_Print_is_set, copy.Track_Print_is_set)) copy.Track_Print_is_set = this.Track_Print_is_set;
      if (po.writeDiff(this.Print_is_set, copy.Print_is_set)) copy.Print_is_set = this.Print_is_set;
      if (po.writeDiff(this.Run_is_set, copy.Run_is_set)) copy.Run_is_set = this.Run_is_set;
      if (po.writeDiff(this.counter_tracker, copy.counter_tracker)) copy.counter_tracker = this.counter_tracker;
      if (po.writeDiff(this.counter, copy.counter)) copy.counter = this.counter;
      if (po.writeDiff(this.printstep_tracker, copy.printstep_tracker)) copy.printstep_tracker = this.printstep_tracker;
      if (po.writeDiff(this.printstep, copy.printstep)) copy.printstep = this.printstep;
      if (po.writeDiff(this.endtime, copy.endtime)) copy.endtime = this.endtime;
      if (po.writeDiff(this.starttime, copy.starttime)) copy.starttime = this.starttime;
      copy.trackwriter = this.trackwriter = (java.lang.String)po.writeDiff(this.trackwriter, copy.trackwriter);
      copy.writer = this.writer = (java.lang.String)po.writeDiff(this.writer, copy.writer);
      copy.timestep = this.timestep = (run.Variable)po.writeDiff(this.timestep, copy.timestep);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      Controlset copy = (Controlset)_copy;
      if (pi.hasDiff()) copy.Track_Print_is_set = this.Track_Print_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Print_is_set = this.Print_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.Run_is_set = this.Run_is_set = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.counter_tracker = this.counter_tracker = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.counter = this.counter = pi.getDiffAsInt();
      if (pi.hasDiff()) copy.printstep_tracker = this.printstep_tracker = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.printstep = this.printstep = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.endtime = this.endtime = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.starttime = this.starttime = pi.getDiffAsDouble();
      if (pi.hasDiff()) copy.trackwriter = this.trackwriter = (java.lang.String)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.writer = this.writer = (java.lang.String)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.timestep = this.timestep = (run.Variable)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      c.descend(this.trackwriter);
      c.descend(this.writer);
      c.descend(this.timestep);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      this.trackwriter = (java.lang.String)f.filter(this.trackwriter);
      this.writer = (java.lang.String)f.filter(this.writer);
      this.timestep = (run.Variable)f.filter(this.timestep);
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
         return new Controlset(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((Controlset)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Controlset)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((Controlset)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new Controlset((Controlset)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((Controlset)copy).deepCloneReferences((Controlset)orig, _helper);
         return false;
      }
      public Class getType() {
         return Controlset.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_int + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double + uka.transport.BasicIO.SIZEOF_double;
   public Controlset(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      _stream.register(this, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      _stream.request(Controlset._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.Track_Print_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Print_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.Run_is_set = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.counter_tracker = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.counter = uka.transport.BasicIO.extractInt(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_int;
      this.printstep_tracker = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.printstep = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.endtime = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      this.starttime = uka.transport.BasicIO.extractDouble(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_double;
      _stream.accept(Controlset._SIZE);
      this.trackwriter = (java.lang.String)_stream.readReference();
      this.writer = (java.lang.String)_stream.readReference();
      this.timestep = (run.Variable)_stream.readReference();
   }
   public void marshalReference(uka.transport.MarshalStream _stream) throws java.io.IOException {
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      _stream.reserve(Controlset._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Track_Print_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Print_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.Run_is_set);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.counter_tracker);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.counter);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.printstep_tracker);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.printstep);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.endtime);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.starttime);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.trackwriter);
      _stream.writeReference(this.writer);
      _stream.writeReference(this.timestep);
   }
   public Controlset(Controlset _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      _helper.add(_id, this);
      this.Track_Print_is_set = _orig.Track_Print_is_set;
      this.Print_is_set = _orig.Print_is_set;
      this.Run_is_set = _orig.Run_is_set;
      this.counter_tracker = _orig.counter_tracker;
      this.counter = _orig.counter;
      this.printstep_tracker = _orig.printstep_tracker;
      this.printstep = _orig.printstep;
      this.endtime = _orig.endtime;
      this.starttime = _orig.starttime;
   }
   public void deepCloneReferences(Controlset _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      this.trackwriter = (java.lang.String)_helper.internalDeepClone(_orig.trackwriter);
      this.writer = (java.lang.String)_helper.internalDeepClone(_orig.writer);
      this.timestep = (run.Variable)_helper.internalDeepClone(_orig.timestep);
   }
   private double starttime;
   private double endtime;
   private double printstep;
   private double printstep_tracker;
   private Variable timestep;
   private int counter;
   private int counter_tracker;
   private String writer;
   private String trackwriter;
   private boolean Run_is_set;
   private boolean Print_is_set;
   private boolean Track_Print_is_set;
   public Controlset() throws RemoteException {
      super();
      this.counter = 0;
      this.counter_tracker = 0;
      this.timestep = new Variable(0);
      this.writer = new String("GIDWRITER");
      this.trackwriter = new String("GIDTRACKWRITER");
   }
   public void parse_Fembic(Token[] param, int lineno) throws java.text.ParseException {
      int i = 0;
      while (i < param.length) {
         if (param[i].getw().toUpperCase().equals("RUN")) {
            if (param[i + 1].getw().toUpperCase().equals("FROM")) {
               if (param[i + 2].is_a_number()) {
                  this.starttime = param[i + 2].getn();
                  if (param[i + 3].getw().toUpperCase().equals("TO")) {
                     if (param[i + 4].is_a_number()) {
                        this.endtime = param[i + 4].getn();
                        i += 5;
                        this.Run_is_set = true;
                        if (i + 1 < param.length) {
                           if (param[i].getw().toUpperCase().equals("STEP")) {
                              if (param[i + 1].is_a_word()) {
                                 if (param[i + 1].getw().startsWith("[") && param[i + 1].getw().endsWith("]")) {
                                    this.timestep = new Variable(param[i + 1].getw().substring(1, param[i + 1].getw().length() - 1));
                                    i += 2;
                                 } else {
                                    throw new ParseException("Illegal parameter. Syntax: STEP [t1,ts1,t2,ts2,...] ", lineno);
                                 }
                              } else if (param[i + 1].is_a_number()) {
                                 this.timestep = new Variable(param[i + 1].getn());
                                 i += 2;
                              } else {
                                 throw new ParseException("No number xx defined in RUN FROM .. TO .. STEP xx", lineno);
                              }
                           }
                        }
                     } else {
                        throw new ParseException("No number xx defined in RUN FROM .. TO xx", lineno);
                     }
                  }
               } else {
                  throw new ParseException("No number xx defined in RUN FROM xx TO ..", lineno);
               }
            }
         } else if (param[i].getw().toUpperCase().equals("PRINT")) {
            if (param[i + 1].getw().toUpperCase().equals("EVERY")) {
               if (param[i + 2].is_a_number()) {
                  this.printstep = param[i + 2].getn();
                  if (param[i + 3].getw().toUpperCase().equals("STEP")) {
                     i += 4;
                  }
                  this.Print_is_set = true;
               } else {
                  throw new ParseException("No number xx defined in PRINT EVERY xx STEP", lineno);
               }
            } else if (param[i + 1].getw().toUpperCase().equals("TRACKER")) {
               if (param[i + 2].getw().toUpperCase().equals("EVERY")) {
                  if (param[i + 3].is_a_number()) {
                     this.printstep_tracker = param[i + 3].getn();
                     if (param[i + 4].getw().toUpperCase().equals("STEP")) {
                        i += 5;
                     }
                     this.Track_Print_is_set = true;
                  } else {
                     throw new ParseException("No number xx defined in PRINT TRACKER EVERY xx STEP", lineno);
                  }
               }
            }
         } else if (param[i].getw().toUpperCase().equals("FOR")) {
            if (param[i + 1].getw().toUpperCase().equals("WRITER")) {
               if (param[i + 2].getw().toUpperCase().equals("USE")) {
                  if (param[i + 3].is_a_word()) {
                     this.writer = new String(param[i + 3].getw());
                     i += 4;
                  }
               }
            } else if (param[i + 1].getw().toUpperCase().equals("TRACKWRITER")) {
               if (param[i + 2].getw().toUpperCase().equals("USE")) {
                  if (param[i + 3].is_a_word()) {
                     this.trackwriter = new String(param[i + 3].getw());
                     i += 4;
                  }
               }
            }
         } else {
            throw new java.text.ParseException("No recognized control command found or missing parameter", lineno);
         }
      }
   }
   public void parse_Nastran(Token[] param, int lineno) throws java.text.ParseException {
   }
   public String print_Fembic(int ctrl) {
      String out;
      switch (ctrl) {
      case Element.MESH: 
         out = new String("");
         if (this.Run_is_set) out += "Run from " + this.starttime + " to " + this.endtime;
         if (this.timestep.value(0) != 0) out += " step " + this.timestep.printFembic();
         out += "\n";
         if (this.Print_is_set) out += "Print every " + this.printstep + " step \n";
         if (this.Track_Print_is_set) out += "Print tracker every " + this.printstep_tracker + " step \n";
         out += "For writer use " + this.writer + "\n";
         out += "For trackwriter use " + this.trackwriter + "\n";
         out += "\n";
         return out;
      
      default: 
         return new String("");
      
      }
   }
   public void checkIndata() throws IllegalArgumentException {
      if (!this.Run_is_set) {
         throw new IllegalArgumentException("No RUN FROM .. TO ..  defined in the controlset");
      }
      if (!this.Print_is_set) {
         throw new IllegalArgumentException("No PRINT EVERY .. STEP defined in the controlset");
      }
   }
   public void setInitialConditions() throws IllegalArgumentException {
      if (!this.Track_Print_is_set) {
         this.printstep_tracker = this.printstep;
      }
   }
   public double getEndtime() {
      return this.endtime;
   }
   public double getPrintstep() {
      return this.printstep;
   }
   public double getStarttime() {
      return this.starttime;
   }
   public double getTimestep(double time) {
      if (this.timestep.on(time)) return this.timestep.value(time); else return 0;
   }
   public String getWriter() {
      return this.writer;
   }
   public String getTrackWriter() {
      return this.trackwriter;
   }
   public void setEndtime(double newEndtime) {
      this.endtime = newEndtime;
   }
   public void setPrintstep(double newPrintstep) {
      this.printstep = newPrintstep;
   }
   public void setStarttime(double newStarttime) {
      this.starttime = newStarttime;
   }
   public boolean timeToPrint(double current_time) {
      if (current_time >= this.printstep * this.counter) {
         this.counter++;
         return true;
      } else {
         return false;
      }
   }
   public boolean timeToPrintTracker(double current_time) {
      if (current_time >= this.printstep_tracker * this.counter_tracker) {
         this.counter_tracker++;
         return true;
      } else {
         return false;
      }
   }
}
