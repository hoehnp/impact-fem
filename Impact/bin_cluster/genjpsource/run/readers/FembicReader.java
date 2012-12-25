package run.readers;
import run.Constraint;

import run.Controlset;

import run.Element;

import run.Load;

import run.Material;

import run.ModifiedStreamTokenizer;

import run.Node;

import run.Reader;

import run.RplVector;

import run.Token;

import run.TrackWriter;

import run.Tracker;

import run.Writer;

import uka.karmi.rmi.RemoteException;

import java.io.*;

import java.text.ParseException;

import java.util.*;

import jp.lang.RemoteObject;

public class FembicReader extends Reader implements uka.patch.Patchable, uka.transport.Transportable {
   public void createPatch(Object _copy, uka.patch.PatchOutput po) throws java.io.IOException {
      FembicReader copy = (FembicReader)_copy;
      super.createPatch(copy, po);
      if (po.writeDiff(this.constraint_in_block, copy.constraint_in_block)) copy.constraint_in_block = this.constraint_in_block;
      if (po.writeDiff(this.control_in_block, copy.control_in_block)) copy.control_in_block = this.control_in_block;
      if (po.writeDiff(this.material_in_block, copy.material_in_block)) copy.material_in_block = this.material_in_block;
      if (po.writeDiff(this.tracker_in_block, copy.tracker_in_block)) copy.tracker_in_block = this.tracker_in_block;
      if (po.writeDiff(this.element_in_block, copy.element_in_block)) copy.element_in_block = this.element_in_block;
      if (po.writeDiff(this.in_block, copy.in_block)) copy.in_block = this.in_block;
      copy.current_constraint_type = this.current_constraint_type = (java.lang.String)po.writeDiff(this.current_constraint_type, copy.current_constraint_type);
      copy.current_tracker_type = this.current_tracker_type = (java.lang.String)po.writeDiff(this.current_tracker_type, copy.current_tracker_type);
      copy.current_element_type = this.current_element_type = (java.lang.String)po.writeDiff(this.current_element_type, copy.current_element_type);
      copy.temporary_load = this.temporary_load = (run.Load)po.writeDiff(this.temporary_load, copy.temporary_load);
      copy.temporary_node = this.temporary_node = (run.Node)po.writeDiff(this.temporary_node, copy.temporary_node);
      copy.str = this.str = (java.io.StreamTokenizer)po.writeDiff(this.str, copy.str);
      copy.keywords = this.keywords = (java.lang.String[])po.writeDiff(this.keywords, copy.keywords);
      copy.filename = this.filename = (java.lang.String)po.writeDiff(this.filename, copy.filename);
      copy.br = this.br = (java.io.BufferedReader)po.writeDiff(this.br, copy.br);
   }
   public void applyPatch(Object _copy, uka.patch.PatchInput pi) throws java.io.IOException, ClassNotFoundException {
      FembicReader copy = (FembicReader)_copy;
      super.applyPatch(copy, pi);
      if (pi.hasDiff()) copy.constraint_in_block = this.constraint_in_block = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.control_in_block = this.control_in_block = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.material_in_block = this.material_in_block = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.tracker_in_block = this.tracker_in_block = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.element_in_block = this.element_in_block = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.in_block = this.in_block = pi.getDiffAsBoolean();
      if (pi.hasDiff()) copy.current_constraint_type = this.current_constraint_type = (java.lang.String)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.current_tracker_type = this.current_tracker_type = (java.lang.String)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.current_element_type = this.current_element_type = (java.lang.String)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.temporary_load = this.temporary_load = (run.Load)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.temporary_node = this.temporary_node = (run.Node)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.str = this.str = (java.io.StreamTokenizer)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.keywords = this.keywords = (java.lang.String[])pi.getDiffAsObject();
      if (pi.hasDiff()) copy.filename = this.filename = (java.lang.String)pi.getDiffAsObject();
      if (pi.hasDiff()) copy.br = this.br = (java.io.BufferedReader)pi.getDiffAsObject();
   }
   public void descendReferences(uka.patch.ReferenceConsumer c) throws java.io.IOException {
      super.descendReferences(c);
      c.descend(this.current_constraint_type);
      c.descend(this.current_tracker_type);
      c.descend(this.current_element_type);
      c.descend(this.temporary_load);
      c.descend(this.temporary_node);
      c.descend(this.str);
      c.descend(this.keywords);
      c.descend(this.filename);
      c.descend(this.br);
   }
   public void filterReferences(uka.patch.ReferenceFilter f) {
      super.filterReferences(f);
      this.current_constraint_type = (java.lang.String)f.filter(this.current_constraint_type);
      this.current_tracker_type = (java.lang.String)f.filter(this.current_tracker_type);
      this.current_element_type = (java.lang.String)f.filter(this.current_element_type);
      this.temporary_load = (run.Load)f.filter(this.temporary_load);
      this.temporary_node = (run.Node)f.filter(this.temporary_node);
      this.str = (java.io.StreamTokenizer)f.filter(this.str);
      this.keywords = (java.lang.String[])f.filter(this.keywords);
      this.filename = (java.lang.String)f.filter(this.filename);
      this.br = (java.io.BufferedReader)f.filter(this.br);
   }
   public static final uka.transport.TransportDescriptor TRANSPORT_DESCRIPTOR = new uka.transport.TransportDescriptor(){
      public Object unmarshalReference(uka.transport.UnmarshalStream s, int id) throws java.io.IOException, ClassNotFoundException {
         return new FembicReader(s, id);
      }
      public boolean unmarshal(Object obj, uka.transport.UnmarshalStream s) throws ClassNotFoundException, java.io.IOException {
         ((FembicReader)obj).unmarshal(s);
         return false;
      }
      public void marshalReference(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((FembicReader)obj).marshalReference(s);
      }
      public void marshal(Object obj, uka.transport.MarshalStream s) throws java.io.IOException {
         ((FembicReader)obj).marshal(s);
      }
      public Object deepClone(Object orig, int id, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         try {
            return new FembicReader((FembicReader)orig, id, _helper);
         }  catch (java.io.IOException ex) {
            throw (CloneNotSupportedException)new CloneNotSupportedException().initCause(ex);
         }
      }
      public boolean deepCloneReferences(Object orig, Object copy, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
         ((FembicReader)copy).deepCloneReferences((FembicReader)orig, _helper);
         return false;
      }
      public Class getType() {
         return FembicReader.class;
      }
   };
   public uka.transport.TransportDescriptor getTransportDescriptor() {
      return TRANSPORT_DESCRIPTOR;
   }
   private static final int _SIZE = uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean + uka.transport.BasicIO.SIZEOF_boolean;
   public FembicReader(uka.transport.UnmarshalStream _stream, int _id) throws java.io.IOException, ClassNotFoundException {
      super(_stream, _id);
   }
   public void unmarshal(uka.transport.UnmarshalStream _stream) throws java.io.IOException, ClassNotFoundException {
      super.unmarshal(_stream);
      _stream.request(FembicReader._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      this.constraint_in_block = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.control_in_block = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.material_in_block = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.tracker_in_block = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.element_in_block = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      this.in_block = uka.transport.BasicIO.extractBoolean(_buffer, _pos);
      _pos += uka.transport.BasicIO.SIZEOF_boolean;
      _stream.accept(FembicReader._SIZE);
      this.current_constraint_type = (java.lang.String)_stream.readReference();
      this.current_tracker_type = (java.lang.String)_stream.readReference();
      this.current_element_type = (java.lang.String)_stream.readReference();
      this.temporary_load = (run.Load)_stream.readReference();
      this.temporary_node = (run.Node)_stream.readReference();
      this.str = (java.io.StreamTokenizer)_stream.readReference();
      this.keywords = (java.lang.String[])_stream.readReference();
      this.filename = (java.lang.String)_stream.readReference();
      this.br = (java.io.BufferedReader)_stream.readReference();
   }
   public void marshal(uka.transport.MarshalStream _stream) throws java.io.IOException {
      super.marshal(_stream);
      _stream.reserve(FembicReader._SIZE);
      byte[] _buffer = _stream.getBuffer();
      int _pos = _stream.getPosition();
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.constraint_in_block);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.control_in_block);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.material_in_block);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.tracker_in_block);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.element_in_block);
      _pos = uka.transport.BasicIO.insert(_buffer, _pos, this.in_block);
      _stream.deliver(_SIZE);
      _stream.writeReference(this.current_constraint_type);
      _stream.writeReference(this.current_tracker_type);
      _stream.writeReference(this.current_element_type);
      _stream.writeReference(this.temporary_load);
      _stream.writeReference(this.temporary_node);
      _stream.writeReference(this.str);
      _stream.writeReference(this.keywords);
      _stream.writeReference(this.filename);
      _stream.writeReference(this.br);
   }
   public FembicReader(FembicReader _orig, int _id, uka.transport.DeepClone _helper) throws CloneNotSupportedException, java.io.IOException {
      super(_orig, _id, _helper);
      this.constraint_in_block = _orig.constraint_in_block;
      this.control_in_block = _orig.control_in_block;
      this.material_in_block = _orig.material_in_block;
      this.tracker_in_block = _orig.tracker_in_block;
      this.element_in_block = _orig.element_in_block;
      this.in_block = _orig.in_block;
   }
   public void deepCloneReferences(FembicReader _orig, uka.transport.DeepClone _helper) throws CloneNotSupportedException {
      super.deepCloneReferences(_orig, _helper);
      this.current_constraint_type = (java.lang.String)_helper.internalDeepClone(_orig.current_constraint_type);
      this.current_tracker_type = (java.lang.String)_helper.internalDeepClone(_orig.current_tracker_type);
      this.current_element_type = (java.lang.String)_helper.internalDeepClone(_orig.current_element_type);
      this.temporary_load = (run.Load)_helper.internalDeepClone(_orig.temporary_load);
      this.temporary_node = (run.Node)_helper.internalDeepClone(_orig.temporary_node);
      this.str = (java.io.StreamTokenizer)_helper.internalDeepClone(_orig.str);
      this.keywords = (java.lang.String[])_helper.internalDeepClone(_orig.keywords);
      this.filename = (java.lang.String)_helper.internalDeepClone(_orig.filename);
      this.br = (java.io.BufferedReader)_helper.internalDeepClone(_orig.br);
   }
   private java.io.BufferedReader br;
   private java.lang.String filename;
   private java.lang.String[] keywords = {"TITLE", "CONTROLS", "ELEMENTS", "NODES", "LOADS", "CONSTRAINTS", "MATERIALS", "TRACKERS", "GROUPS", "GEOMETRY"};
   private boolean in_block = false;
   private java.io.StreamTokenizer str;
   private Node temporary_node;
   private Load temporary_load;
   private boolean element_in_block = false;
   private boolean tracker_in_block = false;
   private boolean material_in_block = false;
   private java.lang.String current_element_type;
   private java.lang.String current_tracker_type;
   private java.lang.String current_constraint_type;
   private boolean control_in_block;
   private boolean constraint_in_block;
   public FembicReader(String fn) {
      super();
      this.filename = new String(fn);
   }
   public void close() {
      try {
         this.br.close();
      }  catch (IOException ioe) {
         System.out.println("An IOException has occurred when closing the indata file");
         return;
      }
   }
   public void getControlSet(Controlset temporary_controlset) throws IllegalArgumentException {
      try {
         if (!this.control_in_block) {
            while (this.str.nextToken() != java.io.StreamTokenizer.TT_EOF) {
               if (this.str.ttype == java.io.StreamTokenizer.TT_WORD) {
                  if (this.str.sval.toUpperCase().equals("CONTROLS") && this.str.nextToken() == this.str.TT_EOL) {
                     this.control_in_block = true;
                     break;
                  }
               }
            }
         }
         if (!this.control_in_block) {
            throw new java.text.ParseException("No controls block found or missing controls ", this.str.lineno());
         }
         while (this.str.nextToken() == java.io.StreamTokenizer.TT_EOL) {
            {
            }
         }
         this.str.pushBack();
         while (this.str.nextToken() != this.str.TT_EOF) {
            if (this.str.ttype == this.str.TT_WORD) {
               if (!this.isAKeyword(this.str.sval)) {
                  this.str.pushBack();
                  temporary_controlset.parse_Fembic(tokenize(this.str), this.str.lineno());
               } else {
                  this.str.pushBack();
                  break;
               }
            }
         }
         temporary_controlset.checkIndata();
      }  catch (java.io.IOException e) {
         throw new IllegalArgumentException("IO error in when generating control set" + e.toString());
      } catch (ParseException e) {
         throw new IllegalArgumentException("Failed to generate control set, Parse exception" + e);
      } catch (IllegalArgumentException e) {
         throw new IllegalArgumentException(e.getMessage());
      }
   }
   public Element getNextElement(RplVector materiallist, RplVector nodelist, RplVector loadlist, Hashtable nodetable) throws java.text.ParseException {
      Element temporary_element;
      try {
         while (this.str.nextToken() == java.io.StreamTokenizer.TT_EOL) {
            {
            }
         }
         this.str.pushBack();
         while (this.str.nextToken() != java.io.StreamTokenizer.TT_NUMBER) {
            this.str.pushBack();
            this.element_in_block = false;
            while (this.str.nextToken() != java.io.StreamTokenizer.TT_EOF) {
               if (this.str.ttype == java.io.StreamTokenizer.TT_WORD) {
                  if (this.str.sval.toUpperCase().equals("ELEMENTS")) {
                     if (this.str.nextToken() == java.io.StreamTokenizer.TT_WORD) {
                        if (this.str.sval.toUpperCase().equals("OF")) {
                           {
                           }
                        } else {
                           throw new java.text.ParseException("No \'OF\' defined in element block header", this.str.lineno());
                        }
                     }
                     if (this.str.nextToken() == java.io.StreamTokenizer.TT_WORD) {
                        if (this.str.sval.toUpperCase().equals("TYPE")) {
                           {
                           }
                        } else {
                           throw new java.text.ParseException("No \'TYPE\' defined in element block header", this.str.lineno());
                        }
                     }
                     if (this.str.nextToken() == java.io.StreamTokenizer.TT_WORD) {
                        this.current_element_type = new String(this.str.sval.toUpperCase());
                     } else {
                        throw new java.text.ParseException("Unknown type defined in element block header", this.str.lineno());
                     }
                     System.out.println("Element block found!");
                     this.element_in_block = true;
                     this.str.nextToken();
                     break;
                  }
               }
            }
         }
         if (!this.element_in_block) {
            throw new java.text.ParseException("No elements block found or missing elements", this.str.lineno());
         }
         temporary_element = Element.getElementOfType_Fembic(this.current_element_type);
         temporary_element.setNumber((int)this.str.nval);
         temporary_element.parse_Fembic(tokenize(this.str), this.str.lineno(), nodelist, materiallist, loadlist, nodetable);
         temporary_element.checkIndata();
         return (Element)temporary_element;
      }  catch (java.io.IOException e) {
         throw new IllegalArgumentException("IO Exception when generating next element" + e.getMessage());
      } catch (ParseException e) {
         throw new IllegalArgumentException(e.getMessage() + " in line: " + (e.getErrorOffset() - 1));
      } catch (IllegalArgumentException e) {
         throw new IllegalArgumentException(e.toString());
      }
   }
   public Tracker getNextTracker(RplVector nodelist, RplVector elementlist) throws java.text.ParseException {
      Tracker temporary_tracker;
      try {
         while (this.str.nextToken() == java.io.StreamTokenizer.TT_EOL) {
            {
            }
         }
         this.str.pushBack();
         while (this.str.nextToken() != java.io.StreamTokenizer.TT_NUMBER) {
            this.str.pushBack();
            this.tracker_in_block = false;
            while (this.str.nextToken() != java.io.StreamTokenizer.TT_EOF) {
               if (this.str.ttype == java.io.StreamTokenizer.TT_WORD) {
                  if (this.str.sval.toUpperCase().equals("TRACKERS")) {
                     if (this.str.nextToken() == java.io.StreamTokenizer.TT_WORD) {
                        if (this.str.sval.toUpperCase().equals("OF")) {
                           {
                           }
                        } else {
                           throw new java.text.ParseException("No \'OF\' defined in tracker block header", this.str.lineno());
                        }
                     }
                     if (this.str.nextToken() == java.io.StreamTokenizer.TT_WORD) {
                        if (this.str.sval.toUpperCase().equals("TYPE")) {
                           {
                           }
                        } else {
                           throw new java.text.ParseException("No \'TYPE\' defined in tracker block header", this.str.lineno());
                        }
                     }
                     if (this.str.nextToken() == java.io.StreamTokenizer.TT_WORD) {
                        this.current_tracker_type = new String(this.str.sval.toUpperCase());
                     } else {
                        throw new java.text.ParseException("Unknown type defined in tracker block header", this.str.lineno());
                     }
                     System.out.println("Tracker block found!");
                     this.tracker_in_block = true;
                     this.str.nextToken();
                     break;
                  }
               }
            }
         }
         if (!this.tracker_in_block) {
            throw new java.text.ParseException("No trackers block found or missing trackers", this.str.lineno());
         }
         temporary_tracker = Tracker.getTrackerOfType_Fembic(this.current_tracker_type);
         temporary_tracker.setNumber((int)this.str.nval);
         temporary_tracker.parse_Fembic(tokenize(this.str), this.str.lineno(), nodelist, elementlist);
         temporary_tracker.checkIndata();
         return (Tracker)temporary_tracker;
      }  catch (java.io.IOException e) {
         throw new IllegalArgumentException("IO Exception when reading Tracker" + e.getMessage());
      } catch (ParseException e) {
         throw new IllegalArgumentException(e.getMessage() + " in line: " + (e.getErrorOffset() - 1));
      } catch (IllegalArgumentException e) {
         throw new IllegalArgumentException(e.getMessage());
      }
   }
   public Constraint getNextConstraint(RplVector nodelist) throws java.text.ParseException {
      Constraint temporary_constraint;
      try {
         while (this.str.nextToken() == java.io.StreamTokenizer.TT_EOL) {
            {
            }
         }
         this.str.pushBack();
         while (this.str.nextToken() != java.io.StreamTokenizer.TT_WORD || this.isAKeyword(this.str.sval)) {
            this.str.pushBack();
            this.constraint_in_block = false;
            while (this.str.nextToken() != java.io.StreamTokenizer.TT_EOF) {
               if (this.str.ttype == java.io.StreamTokenizer.TT_WORD) {
                  if (this.str.sval.toUpperCase().equals("CONSTRAINTS")) {
                     if (this.str.nextToken() == java.io.StreamTokenizer.TT_WORD) {
                        if (this.str.sval.toUpperCase().equals("OF")) {
                           {
                           }
                        } else {
                           throw new java.text.ParseException("No \'OF\' defined in constraint block header", this.str.lineno());
                        }
                     }
                     if (this.str.nextToken() == java.io.StreamTokenizer.TT_WORD) {
                        if (this.str.sval.toUpperCase().equals("TYPE")) {
                           {
                           }
                        } else {
                           throw new java.text.ParseException("No \'TYPE\' defined in constraint block header", this.str.lineno());
                        }
                     }
                     if (this.str.nextToken() == java.io.StreamTokenizer.TT_WORD) {
                        this.current_constraint_type = new String(this.str.sval.toUpperCase());
                     } else {
                        throw new java.text.ParseException("Unknown type defined in constraint block header", this.str.lineno());
                     }
                     System.out.println("Constraint block found!");
                     this.constraint_in_block = true;
                     this.str.nextToken();
                     break;
                  }
               }
            }
         }
         if (!this.constraint_in_block) {
            throw new java.text.ParseException("No constraint block found or missing constraints", this.str.lineno());
         }
         temporary_constraint = Constraint.getConstraintOfType_Fembic(this.current_constraint_type);
         temporary_constraint.setName(this.str.sval.toUpperCase().trim());
         temporary_constraint.parse_Fembic(tokenize(this.str), this.str.lineno(), nodelist);
         temporary_constraint.checkIndata();
         return (Constraint)temporary_constraint;
      }  catch (java.io.IOException e) {
         throw new IllegalArgumentException("IO Exception when reading Constraint" + e.getMessage());
      } catch (ParseException e) {
         throw new IllegalArgumentException(e.getMessage() + " in line: " + (e.getErrorOffset() - 1));
      } catch (IllegalArgumentException e) {
         throw new IllegalArgumentException(e.getMessage());
      }
   }
   public Load getNextLoad(RplVector nodelist) throws java.text.ParseException {
      try {
         if (!this.in_block) {
            while (this.str.nextToken() != java.io.StreamTokenizer.TT_EOF) {
               if (this.str.ttype == java.io.StreamTokenizer.TT_WORD) {
                  if (this.str.sval.toUpperCase().equals("LOADS") && this.str.nextToken() == this.str.TT_EOL) {
                     this.in_block = true;
                     break;
                  }
               }
            }
         }
         if (!this.in_block) {
            throw new java.text.ParseException("No loads block found or missing loads", this.str.lineno());
         }
         while (this.str.nextToken() == java.io.StreamTokenizer.TT_EOL) {
            {
            }
         }
         if (this.str.ttype != java.io.StreamTokenizer.TT_WORD) {
            throw new java.text.ParseException("No load name found", this.str.lineno());
         }
         this.temporary_load = new Load();
         this.temporary_load.name = this.str.sval.toUpperCase();
         this.temporary_load.parse_Fembic(tokenize(this.str), this.str.lineno());
         this.temporary_load.checkIndata();
         return this.temporary_load;
      }  catch (java.io.IOException e) {
         throw new IllegalArgumentException("IO Exception when reading Load" + e.getMessage());
      } catch (ParseException e) {
         throw new IllegalArgumentException(e.getMessage() + " in line: " + (e.getErrorOffset() - 1));
      } catch (IllegalArgumentException e) {
         throw new IllegalArgumentException(e.getMessage());
      }
   }
   public Material getNextMaterial() throws java.text.ParseException {
      Material temporary_material;
      try {
         while (this.str.nextToken() == java.io.StreamTokenizer.TT_EOL) {
            {
            }
         }
         this.str.pushBack();
         while (this.str.nextToken() != java.io.StreamTokenizer.TT_WORD || this.isAKeyword(this.str.sval)) {
            this.str.pushBack();
            this.material_in_block = false;
            while (this.str.nextToken() != java.io.StreamTokenizer.TT_EOF) {
               if (this.str.ttype == java.io.StreamTokenizer.TT_WORD) {
                  if (this.str.sval.toUpperCase().equals("MATERIALS")) {
                     if (this.str.nextToken() == java.io.StreamTokenizer.TT_WORD) {
                        if (this.str.sval.toUpperCase().equals("OF")) {
                           {
                           }
                        } else {
                           throw new java.text.ParseException("No \'OF\' defined in material block header", this.str.lineno());
                        }
                     }
                     if (this.str.nextToken() == java.io.StreamTokenizer.TT_WORD) {
                        if (this.str.sval.toUpperCase().equals("TYPE")) {
                           {
                           }
                        } else {
                           throw new java.text.ParseException("No \'TYPE\' defined in material block header", this.str.lineno());
                        }
                     }
                     if (this.str.nextToken() == java.io.StreamTokenizer.TT_WORD) {
                        this.current_element_type = new String(this.str.sval.toUpperCase());
                     } else {
                        throw new java.text.ParseException("Unknown type defined in element block header", this.str.lineno());
                     }
                     System.out.println("Block found!");
                     this.material_in_block = true;
                     this.str.nextToken();
                     break;
                  }
               }
            }
         }
         if (!this.material_in_block) {
            throw new java.text.ParseException("No materials block found or missing materials", this.str.lineno());
         }
         temporary_material = Material.getMaterialOfType_Fembic(this.current_element_type);
         temporary_material.setName(this.str.sval.toUpperCase());
         temporary_material.parse_Fembic(tokenize(this.str), this.str.lineno());
         temporary_material.checkIndata();
         return (Material)temporary_material;
      }  catch (java.io.IOException e) {
         throw new IllegalArgumentException("IO Exception when reading Material" + e.getMessage());
      } catch (ParseException e) {
         throw new IllegalArgumentException(e.getMessage() + " in line: " + (e.getErrorOffset() - 1));
      } catch (IllegalArgumentException e) {
         throw new IllegalArgumentException(e.getMessage());
      }
   }
   public Node getNextNode(RplVector constraintlist, RplVector loadlist) throws java.text.ParseException {
      try {
         while (this.str.nextToken() == java.io.StreamTokenizer.TT_EOL) {
            {
            }
         }
         this.str.pushBack();
         while (this.str.nextToken() != java.io.StreamTokenizer.TT_NUMBER && this.str.ttype != java.io.StreamTokenizer.TT_EOF) {
            this.in_block = false;
            this.str.pushBack();
            while (this.str.nextToken() != java.io.StreamTokenizer.TT_EOF) {
               if (this.str.ttype == java.io.StreamTokenizer.TT_WORD) {
                  if (this.str.sval.toUpperCase().equals("NODES") && this.str.nextToken() == this.str.TT_EOL) {
                     this.in_block = true;
                     break;
                  }
               }
            }
         }
         if (!this.in_block) {
            throw new java.text.ParseException("No nodes block found or missing nodes", this.str.lineno());
         }
         this.temporary_node = new Node();
         this.temporary_node.setNumber((int)this.str.nval);
         this.temporary_node.parse_Fembic(tokenize(this.str), this.str.lineno(), constraintlist, loadlist);
         this.temporary_node.checkIndata();
         return this.temporary_node;
      }  catch (java.io.IOException e) {
         throw new IllegalArgumentException(e.getMessage());
      } catch (ParseException e) {
         throw new IllegalArgumentException(e.getMessage() + " in line: " + (e.getErrorOffset() - 1));
      } catch (IllegalArgumentException e) {
         throw new IllegalArgumentException(e.getMessage());
      }
   }
   private boolean isAKeyword(String param) {
      int i;
      for (i = 0; i < this.keywords.length; i++) {
         if (this.keywords[i].equals(param.toUpperCase())) {
            return true;
         }
      }
      return false;
   }
   public int numberOfConstraints() throws java.text.ParseException {
      int noc = 0;
      this.open();
      try {
         while (this.str.nextToken() != this.str.TT_EOF) {
            if (this.str.ttype == this.str.TT_WORD) {
               if (this.str.sval.toUpperCase().equals("CONSTRAINTS")) {
                  while (this.str.nextToken() != this.str.TT_EOL) {
                     {
                     }
                  }
                  this.str.pushBack();
                  while (this.str.nextToken() != this.str.TT_EOF) {
                     if (this.str.ttype == this.str.TT_WORD) {
                        if (this.isAKeyword(this.str.sval)) {
                           this.str.pushBack();
                           break;
                        }
                     }
                     if (this.str.ttype == this.str.TT_WORD) {
                        noc++;
                        while (this.str.nextToken() != this.str.TT_EOL && this.str.ttype != this.str.TT_EOF) {
                           {
                           }
                        }
                     }
                  }
               }
            }
         }
         System.out.println("Found " + noc + " constraints");
      }  catch (IOException ioe) {
         System.out.println("IOException when reading a constraintline from indata file");
         this.close();
         return -1;
      }
      this.close();
      return noc;
   }
   public int numberOfControls() throws java.text.ParseException {
      int noc = 0;
      this.open();
      try {
         while (this.str.nextToken() != this.str.TT_EOF) {
            if (this.str.ttype == this.str.TT_WORD) {
               if (this.str.sval.toUpperCase().equals("CONTROLS") && this.str.nextToken() == this.str.TT_EOL) {
                  while (this.str.nextToken() != this.str.TT_EOF) {
                     if (this.str.ttype == this.str.TT_WORD) {
                        if (!this.isAKeyword(this.str.sval)) {
                           noc++;
                           while (this.str.nextToken() != this.str.TT_EOL && this.str.ttype != this.str.TT_EOF) {
                              {
                              }
                           }
                        } else {
                           this.str.pushBack();
                           break;
                        }
                     }
                  }
               }
            }
         }
         System.out.println("Found " + noc + " controls");
      }  catch (IOException ioe) {
         System.out.println("IOException when reading a line from indata file");
         this.close();
         return -1;
      }
      if (noc == 0) {
         this.close();
         throw new java.text.ParseException("No controls found", 0);
      }
      this.close();
      return noc;
   }
   public int numberOfElements() throws java.text.ParseException {
      int noe = 0;
      this.open();
      try {
         while (this.str.nextToken() != this.str.TT_EOF) {
            if (this.str.ttype == this.str.TT_WORD) {
               if (this.str.sval.toUpperCase().equals("ELEMENTS")) {
                  while (this.str.nextToken() != this.str.TT_EOL) {
                     {
                     }
                  }
                  this.str.pushBack();
                  while (this.str.nextToken() != this.str.TT_EOF) {
                     if (this.str.ttype == this.str.TT_WORD) {
                        if (this.isAKeyword(this.str.sval)) {
                           this.str.pushBack();
                           break;
                        }
                     }
                     if (this.str.ttype == this.str.TT_NUMBER) {
                        noe++;
                        while (this.str.nextToken() != this.str.TT_EOL && this.str.ttype != this.str.TT_EOF) {
                           {
                           }
                        }
                     }
                  }
               }
            }
         }
         System.out.println("Found " + noe + " elements");
      }  catch (IOException ioe) {
         System.out.println("IOException when reading a line from indata file");
         this.close();
         return -1;
      }
      if (noe == 0) {
         this.close();
         throw new java.text.ParseException("No elements found", 0);
      }
      this.close();
      return noe;
   }
   public int numberOfTrackers() throws java.text.ParseException {
      int not = 0;
      this.open();
      try {
         while (this.str.nextToken() != this.str.TT_EOF) {
            if (this.str.ttype == this.str.TT_WORD) {
               if (this.str.sval.toUpperCase().equals("TRACKERS")) {
                  while (this.str.nextToken() != this.str.TT_EOL) {
                     {
                     }
                  }
                  this.str.pushBack();
                  while (this.str.nextToken() != this.str.TT_EOF) {
                     if (this.str.ttype == this.str.TT_WORD) {
                        if (this.isAKeyword(this.str.sval)) {
                           this.str.pushBack();
                           break;
                        }
                     }
                     if (this.str.ttype == this.str.TT_NUMBER) {
                        not++;
                        while (this.str.nextToken() != this.str.TT_EOL && this.str.ttype != this.str.TT_EOF) {
                           {
                           }
                        }
                     }
                  }
               }
            }
         }
         System.out.println("Found " + not + " trackers");
      }  catch (IOException ioe) {
         System.out.println("IOException when reading a trackerline from indata file");
         this.close();
         return -1;
      }
      this.close();
      return not;
   }
   public int numberOfGroups() throws java.text.ParseException {
      int noc = 0;
      this.open();
      try {
         while (this.str.nextToken() != this.str.TT_EOF) {
            if (this.str.ttype == this.str.TT_WORD) {
               if (this.str.sval.toUpperCase().equals("GROUPS") && this.str.nextToken() == this.str.TT_EOL) {
                  while (this.str.nextToken() != this.str.TT_EOF) {
                     if (this.str.ttype == this.str.TT_WORD) {
                        if (!this.isAKeyword(this.str.sval)) {
                           noc++;
                           while (this.str.nextToken() != this.str.TT_EOL && this.str.ttype != this.str.TT_EOF) {
                              {
                              }
                           }
                        } else {
                           this.str.pushBack();
                           break;
                        }
                     }
                  }
               }
            }
         }
         System.out.println("Found " + noc + " groups");
      }  catch (IOException ioe) {
         System.out.println("IOException when reading a line from indata file");
         this.close();
         return -1;
      }
      this.close();
      return noc;
   }
   public int numberOfLoads() throws java.text.ParseException {
      int noc = 0;
      this.open();
      try {
         while (this.str.nextToken() != this.str.TT_EOF) {
            if (this.str.ttype == this.str.TT_WORD) {
               if (this.str.sval.toUpperCase().equals("LOADS") && this.str.nextToken() == this.str.TT_EOL) {
                  while (this.str.nextToken() != this.str.TT_EOF) {
                     if (this.str.ttype == this.str.TT_WORD) {
                        if (!this.isAKeyword(this.str.sval)) {
                           noc++;
                           while (this.str.nextToken() != this.str.TT_EOL && this.str.ttype != this.str.TT_EOF) {
                              {
                              }
                           }
                        } else {
                           this.str.pushBack();
                           break;
                        }
                     }
                  }
               }
            }
         }
         System.out.println("Found " + noc + " loads");
      }  catch (IOException ioe) {
         System.out.println("IOException when reading a line from indata file");
         this.close();
         return -1;
      }
      this.close();
      return noc;
   }
   public int numberOfMaterials() throws java.text.ParseException {
      int nom = 0;
      this.open();
      try {
         while (this.str.nextToken() != this.str.TT_EOF) {
            if (this.str.ttype == this.str.TT_WORD) {
               if (this.str.sval.toUpperCase().equals("MATERIALS")) {
                  while (this.str.nextToken() != this.str.TT_EOL) {
                     {
                     }
                  }
                  while (this.str.nextToken() != this.str.TT_EOF) {
                     if (this.str.ttype == this.str.TT_WORD) {
                        if (!this.isAKeyword(this.str.sval)) {
                           nom++;
                           while (this.str.nextToken() != this.str.TT_EOL && this.str.ttype != this.str.TT_EOF) {
                              {
                              }
                           }
                        } else {
                           this.str.pushBack();
                           break;
                        }
                     }
                  }
               }
            }
         }
         System.out.println("Found " + nom + " materials");
      }  catch (IOException ioe) {
         System.out.println("IOException when reading a line from indata file");
         this.close();
         return -1;
      }
      if (nom == 0) {
         this.close();
         throw new java.text.ParseException("No materials found", 0);
      }
      this.close();
      return nom;
   }
   public int numberOfNodes() throws java.text.ParseException {
      int non = 0;
      this.open();
      try {
         while (this.str.nextToken() != this.str.TT_EOF) {
            if (this.str.ttype == this.str.TT_WORD) {
               if (this.str.sval.toUpperCase().equals("NODES") && this.str.nextToken() == this.str.TT_EOL) {
                  while (this.str.nextToken() != this.str.TT_EOF) {
                     if (this.str.ttype == this.str.TT_WORD) {
                        if (this.isAKeyword(this.str.sval)) {
                           break;
                        }
                     }
                     if (this.str.ttype == this.str.TT_NUMBER) {
                        non++;
                        while (this.str.nextToken() != this.str.TT_EOL && this.str.ttype != this.str.TT_EOF) {
                           {
                           }
                        }
                     }
                  }
               }
            }
         }
         System.out.println("Found " + non + " nodes");
      }  catch (IOException ioe) {
         System.out.println("IOException when reading a line from indata file");
         this.close();
         return -1;
      }
      if (non == 0) {
         this.close();
         throw new java.text.ParseException("No nodes found", 0);
      }
      this.close();
      return non;
   }
   public void open() {
      FileReader fr;
      this.in_block = false;
      this.control_in_block = false;
      this.constraint_in_block = false;
      this.element_in_block = false;
      try {
         fr = new FileReader(this.filename);
      }  catch (FileNotFoundException fnfe) {
         System.out.println("Fembic file does not exist");
         return;
      }
      try {
         this.br = new BufferedReader(fr);
      }  catch (IllegalArgumentException ioe) {
         System.out.println("An IllegalArgumentException has occurred when opening the indata file");
         return;
      }
      this.str = new ModifiedStreamTokenizer(this.br);
   }
   public Writer getWriter(RplVector nodelist, RplVector elementlist, Controlset control, RemoteObject[] cluster_nodes) throws RemoteException {
      Writer a;
      a = Writer.getWriterOfType_Fembic(control.getWriter(), nodelist, elementlist, cluster_nodes);
      a.checkIndata();
      return a;
   }
   public TrackWriter getTrackWriter(RplVector trackerlist, Controlset control, RemoteObject[] cluster_nodes) throws RemoteException {
      TrackWriter a;
      a = TrackWriter.getTrackWriterOfType_Fembic(control.getTrackWriter(), trackerlist);
      a.checkIndata();
      return a;
   }
   public Token[] tokenize(java.io.StreamTokenizer str) throws IOException {
      int i;
      String temp;
      Vector v = new Vector();
      Token t;
      Token[] arr;
      while (str.nextToken() != java.io.StreamTokenizer.TT_EOL && str.ttype != java.io.StreamTokenizer.TT_EOF) {
         if (str.ttype == java.io.StreamTokenizer.TT_WORD) {
            v.add(new Token(str.sval.trim()));
         } else {
            v.add(new Token(str.nval));
         }
      }
      for (i = 0; i < v.size(); i++) {
         t = (Token)v.elementAt(i);
         if (t.is_a_word()) {
            temp = new String(t.getw());
            if (temp.startsWith("[") && !temp.endsWith("]")) {
               v.remove(i);
               while (!temp.endsWith("]")) {
                  if (i >= v.size()) {
                     throw new IOException("IO Exception trying to find end ] of a parameter set in string\n");
                  }
                  t = (Token)v.elementAt(i);
                  v.remove(i);
                  if (t.is_a_number()) {
                     temp += new Double(t.getn()).toString();
                  } else {
                     temp += t.getw().trim();
                  }
               }
               v.insertElementAt(new Token(temp), i);
            } else if (temp.indexOf("=") != -1 && temp.length() > 1) {
               v.remove(i);
               if (temp.indexOf("=") != 0) {
                  v.insertElementAt(new Token(temp.substring(0, temp.indexOf("="))), i);
               } else {
                  i--;
               }
               v.insertElementAt(new Token(new String("=")), i + 1);
               if (temp.indexOf("=") != temp.length() - 1) {
                  v.insertElementAt(new Token(temp.substring(temp.indexOf("=") + 1, temp.length())), i + 2);
               }
               i--;
            }
         } else {
         }
      }
      arr = new Token[v.size()];
      for (i = 0; i < v.size(); i++) {
         arr[i] = (Token)v.elementAt(i);
      }
      return arr;
   }
   public void preProcess() throws java.text.ParseException {
   }
}
