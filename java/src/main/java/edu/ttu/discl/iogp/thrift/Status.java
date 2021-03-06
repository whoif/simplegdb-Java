/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.ttu.discl.iogp.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2016-7-30")
public class Status implements org.apache.thrift.TBase<Status, Status._Fields>, java.io.Serializable, Cloneable, Comparable<Status> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Status");

  private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ISSPLIT_FIELD_DESC = new org.apache.thrift.protocol.TField("issplit", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("location", org.apache.thrift.protocol.TType.I32, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StatusStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StatusTupleSchemeFactory());
  }

  public ByteBuffer key; // required
  public int issplit; // required
  public int location; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    KEY((short)1, "key"),
    ISSPLIT((short)2, "issplit"),
    LOCATION((short)3, "location");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // KEY
          return KEY;
        case 2: // ISSPLIT
          return ISSPLIT;
        case 3: // LOCATION
          return LOCATION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ISSPLIT_ISSET_ID = 0;
  private static final int __LOCATION_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEY, new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.ISSPLIT, new org.apache.thrift.meta_data.FieldMetaData("issplit", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LOCATION, new org.apache.thrift.meta_data.FieldMetaData("location", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Status.class, metaDataMap);
  }

  public Status() {
  }

  public Status(
    ByteBuffer key,
    int issplit,
    int location)
  {
    this();
    this.key = org.apache.thrift.TBaseHelper.copyBinary(key);
    this.issplit = issplit;
    setIssplitIsSet(true);
    this.location = location;
    setLocationIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Status(Status other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetKey()) {
      this.key = org.apache.thrift.TBaseHelper.copyBinary(other.key);
    }
    this.issplit = other.issplit;
    this.location = other.location;
  }

  public Status deepCopy() {
    return new Status(this);
  }

  @Override
  public void clear() {
    this.key = null;
    setIssplitIsSet(false);
    this.issplit = 0;
    setLocationIsSet(false);
    this.location = 0;
  }

  public byte[] getKey() {
    setKey(org.apache.thrift.TBaseHelper.rightSize(key));
    return key == null ? null : key.array();
  }

  public ByteBuffer bufferForKey() {
    return org.apache.thrift.TBaseHelper.copyBinary(key);
  }

  public Status setKey(byte[] key) {
    this.key = key == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(key, key.length));
    return this;
  }

  public Status setKey(ByteBuffer key) {
    this.key = org.apache.thrift.TBaseHelper.copyBinary(key);
    return this;
  }

  public void unsetKey() {
    this.key = null;
  }

  /** Returns true if field key is set (has been assigned a value) and false otherwise */
  public boolean isSetKey() {
    return this.key != null;
  }

  public void setKeyIsSet(boolean value) {
    if (!value) {
      this.key = null;
    }
  }

  public int getIssplit() {
    return this.issplit;
  }

  public Status setIssplit(int issplit) {
    this.issplit = issplit;
    setIssplitIsSet(true);
    return this;
  }

  public void unsetIssplit() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISSPLIT_ISSET_ID);
  }

  /** Returns true if field issplit is set (has been assigned a value) and false otherwise */
  public boolean isSetIssplit() {
    return EncodingUtils.testBit(__isset_bitfield, __ISSPLIT_ISSET_ID);
  }

  public void setIssplitIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISSPLIT_ISSET_ID, value);
  }

  public int getLocation() {
    return this.location;
  }

  public Status setLocation(int location) {
    this.location = location;
    setLocationIsSet(true);
    return this;
  }

  public void unsetLocation() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LOCATION_ISSET_ID);
  }

  /** Returns true if field location is set (has been assigned a value) and false otherwise */
  public boolean isSetLocation() {
    return EncodingUtils.testBit(__isset_bitfield, __LOCATION_ISSET_ID);
  }

  public void setLocationIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LOCATION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case KEY:
      if (value == null) {
        unsetKey();
      } else {
        setKey((ByteBuffer)value);
      }
      break;

    case ISSPLIT:
      if (value == null) {
        unsetIssplit();
      } else {
        setIssplit((Integer)value);
      }
      break;

    case LOCATION:
      if (value == null) {
        unsetLocation();
      } else {
        setLocation((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case KEY:
      return getKey();

    case ISSPLIT:
      return Integer.valueOf(getIssplit());

    case LOCATION:
      return Integer.valueOf(getLocation());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case KEY:
      return isSetKey();
    case ISSPLIT:
      return isSetIssplit();
    case LOCATION:
      return isSetLocation();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Status)
      return this.equals((Status)that);
    return false;
  }

  public boolean equals(Status that) {
    if (that == null)
      return false;

    boolean this_present_key = true && this.isSetKey();
    boolean that_present_key = true && that.isSetKey();
    if (this_present_key || that_present_key) {
      if (!(this_present_key && that_present_key))
        return false;
      if (!this.key.equals(that.key))
        return false;
    }

    boolean this_present_issplit = true;
    boolean that_present_issplit = true;
    if (this_present_issplit || that_present_issplit) {
      if (!(this_present_issplit && that_present_issplit))
        return false;
      if (this.issplit != that.issplit)
        return false;
    }

    boolean this_present_location = true;
    boolean that_present_location = true;
    if (this_present_location || that_present_location) {
      if (!(this_present_location && that_present_location))
        return false;
      if (this.location != that.location)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_key = true && (isSetKey());
    list.add(present_key);
    if (present_key)
      list.add(key);

    boolean present_issplit = true;
    list.add(present_issplit);
    if (present_issplit)
      list.add(issplit);

    boolean present_location = true;
    list.add(present_location);
    if (present_location)
      list.add(location);

    return list.hashCode();
  }

  @Override
  public int compareTo(Status other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetKey()).compareTo(other.isSetKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key, other.key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIssplit()).compareTo(other.isSetIssplit());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIssplit()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.issplit, other.issplit);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocation()).compareTo(other.isSetLocation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.location, other.location);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Status(");
    boolean first = true;

    sb.append("key:");
    if (this.key == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.key, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("issplit:");
    sb.append(this.issplit);
    first = false;
    if (!first) sb.append(", ");
    sb.append("location:");
    sb.append(this.location);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StatusStandardSchemeFactory implements SchemeFactory {
    public StatusStandardScheme getScheme() {
      return new StatusStandardScheme();
    }
  }

  private static class StatusStandardScheme extends StandardScheme<Status> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Status struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.key = iprot.readBinary();
              struct.setKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ISSPLIT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.issplit = iprot.readI32();
              struct.setIssplitIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.location = iprot.readI32();
              struct.setLocationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Status struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.key != null) {
        oprot.writeFieldBegin(KEY_FIELD_DESC);
        oprot.writeBinary(struct.key);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ISSPLIT_FIELD_DESC);
      oprot.writeI32(struct.issplit);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LOCATION_FIELD_DESC);
      oprot.writeI32(struct.location);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StatusTupleSchemeFactory implements SchemeFactory {
    public StatusTupleScheme getScheme() {
      return new StatusTupleScheme();
    }
  }

  private static class StatusTupleScheme extends TupleScheme<Status> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Status struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetKey()) {
        optionals.set(0);
      }
      if (struct.isSetIssplit()) {
        optionals.set(1);
      }
      if (struct.isSetLocation()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetKey()) {
        oprot.writeBinary(struct.key);
      }
      if (struct.isSetIssplit()) {
        oprot.writeI32(struct.issplit);
      }
      if (struct.isSetLocation()) {
        oprot.writeI32(struct.location);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Status struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.key = iprot.readBinary();
        struct.setKeyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.issplit = iprot.readI32();
        struct.setIssplitIsSet(true);
      }
      if (incoming.get(2)) {
        struct.location = iprot.readI32();
        struct.setLocationIsSet(true);
      }
    }
  }

}

