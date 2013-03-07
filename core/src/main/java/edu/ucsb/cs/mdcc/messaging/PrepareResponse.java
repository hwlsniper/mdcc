/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.ucsb.cs.mdcc.messaging;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrepareResponse implements org.apache.thrift.TBase<PrepareResponse, PrepareResponse._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PrepareResponse");

  private static final org.apache.thrift.protocol.TField OK_FIELD_DESC = new org.apache.thrift.protocol.TField("ok", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField OUTSTANDING_FIELD_DESC = new org.apache.thrift.protocol.TField("outstanding", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PrepareResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PrepareResponseTupleSchemeFactory());
  }

  public boolean ok; // required
  public String outstanding; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OK((short)1, "ok"),
    OUTSTANDING((short)2, "outstanding");

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
        case 1: // OK
          return OK;
        case 2: // OUTSTANDING
          return OUTSTANDING;
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
  private static final int __OK_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OK, new org.apache.thrift.meta_data.FieldMetaData("ok", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.OUTSTANDING, new org.apache.thrift.meta_data.FieldMetaData("outstanding", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PrepareResponse.class, metaDataMap);
  }

  public PrepareResponse() {
  }

  public PrepareResponse(
    boolean ok,
    String outstanding)
  {
    this();
    this.ok = ok;
    setOkIsSet(true);
    this.outstanding = outstanding;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PrepareResponse(PrepareResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    this.ok = other.ok;
    if (other.isSetOutstanding()) {
      this.outstanding = other.outstanding;
    }
  }

  public PrepareResponse deepCopy() {
    return new PrepareResponse(this);
  }

  @Override
  public void clear() {
    setOkIsSet(false);
    this.ok = false;
    this.outstanding = null;
  }

  public boolean isOk() {
    return this.ok;
  }

  public PrepareResponse setOk(boolean ok) {
    this.ok = ok;
    setOkIsSet(true);
    return this;
  }

  public void unsetOk() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __OK_ISSET_ID);
  }

  /** Returns true if field ok is set (has been assigned a value) and false otherwise */
  public boolean isSetOk() {
    return EncodingUtils.testBit(__isset_bitfield, __OK_ISSET_ID);
  }

  public void setOkIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __OK_ISSET_ID, value);
  }

  public String getOutstanding() {
    return this.outstanding;
  }

  public PrepareResponse setOutstanding(String outstanding) {
    this.outstanding = outstanding;
    return this;
  }

  public void unsetOutstanding() {
    this.outstanding = null;
  }

  /** Returns true if field outstanding is set (has been assigned a value) and false otherwise */
  public boolean isSetOutstanding() {
    return this.outstanding != null;
  }

  public void setOutstandingIsSet(boolean value) {
    if (!value) {
      this.outstanding = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OK:
      if (value == null) {
        unsetOk();
      } else {
        setOk((Boolean)value);
      }
      break;

    case OUTSTANDING:
      if (value == null) {
        unsetOutstanding();
      } else {
        setOutstanding((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OK:
      return Boolean.valueOf(isOk());

    case OUTSTANDING:
      return getOutstanding();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OK:
      return isSetOk();
    case OUTSTANDING:
      return isSetOutstanding();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PrepareResponse)
      return this.equals((PrepareResponse)that);
    return false;
  }

  public boolean equals(PrepareResponse that) {
    if (that == null)
      return false;

    boolean this_present_ok = true;
    boolean that_present_ok = true;
    if (this_present_ok || that_present_ok) {
      if (!(this_present_ok && that_present_ok))
        return false;
      if (this.ok != that.ok)
        return false;
    }

    boolean this_present_outstanding = true && this.isSetOutstanding();
    boolean that_present_outstanding = true && that.isSetOutstanding();
    if (this_present_outstanding || that_present_outstanding) {
      if (!(this_present_outstanding && that_present_outstanding))
        return false;
      if (!this.outstanding.equals(that.outstanding))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(PrepareResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    PrepareResponse typedOther = (PrepareResponse)other;

    lastComparison = Boolean.valueOf(isSetOk()).compareTo(typedOther.isSetOk());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOk()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ok, typedOther.ok);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOutstanding()).compareTo(typedOther.isSetOutstanding());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOutstanding()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.outstanding, typedOther.outstanding);
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
    StringBuilder sb = new StringBuilder("PrepareResponse(");
    boolean first = true;

    sb.append("ok:");
    sb.append(this.ok);
    first = false;
    if (!first) sb.append(", ");
    sb.append("outstanding:");
    if (this.outstanding == null) {
      sb.append("null");
    } else {
      sb.append(this.outstanding);
    }
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

  private static class PrepareResponseStandardSchemeFactory implements SchemeFactory {
    public PrepareResponseStandardScheme getScheme() {
      return new PrepareResponseStandardScheme();
    }
  }

  private static class PrepareResponseStandardScheme extends StandardScheme<PrepareResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PrepareResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OK
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.ok = iprot.readBool();
              struct.setOkIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OUTSTANDING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.outstanding = iprot.readString();
              struct.setOutstandingIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PrepareResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(OK_FIELD_DESC);
      oprot.writeBool(struct.ok);
      oprot.writeFieldEnd();
      if (struct.outstanding != null) {
        oprot.writeFieldBegin(OUTSTANDING_FIELD_DESC);
        oprot.writeString(struct.outstanding);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PrepareResponseTupleSchemeFactory implements SchemeFactory {
    public PrepareResponseTupleScheme getScheme() {
      return new PrepareResponseTupleScheme();
    }
  }

  private static class PrepareResponseTupleScheme extends TupleScheme<PrepareResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PrepareResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOk()) {
        optionals.set(0);
      }
      if (struct.isSetOutstanding()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetOk()) {
        oprot.writeBool(struct.ok);
      }
      if (struct.isSetOutstanding()) {
        oprot.writeString(struct.outstanding);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PrepareResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.ok = iprot.readBool();
        struct.setOkIsSet(true);
      }
      if (incoming.get(1)) {
        struct.outstanding = iprot.readString();
        struct.setOutstandingIsSet(true);
      }
    }
  }

}

