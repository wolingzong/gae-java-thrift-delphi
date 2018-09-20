/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.example.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * Todo
 */
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2018-09-20")
public class TTodo implements org.apache.thrift.TBase<TTodo, TTodo._Fields>, java.io.Serializable, Cloneable, Comparable<TTodo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTodo");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CHECKED_FIELD_DESC = new org.apache.thrift.protocol.TField("checked", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField DETAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("detail", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTodoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTodoTupleSchemeFactory();

  public int id; // required
  public boolean checked; // required
  public String detail; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    CHECKED((short)2, "checked"),
    DETAIL((short)3, "detail");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // CHECKED
          return CHECKED;
        case 3: // DETAIL
          return DETAIL;
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
  private static final int __ID_ISSET_ID = 0;
  private static final int __CHECKED_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "todoId")));
    tmpMap.put(_Fields.CHECKED, new org.apache.thrift.meta_data.FieldMetaData("checked", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.DETAIL, new org.apache.thrift.meta_data.FieldMetaData("detail", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTodo.class, metaDataMap);
  }

  public TTodo() {
  }

  public TTodo(
    int id,
    boolean checked,
    String detail)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.checked = checked;
    setCheckedIsSet(true);
    this.detail = detail;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTodo(TTodo other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    this.checked = other.checked;
    if (other.isSetDetail()) {
      this.detail = other.detail;
    }
  }

  public TTodo deepCopy() {
    return new TTodo(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setCheckedIsSet(false);
    this.checked = false;
    this.detail = null;
  }

  public int getId() {
    return this.id;
  }

  public TTodo setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public boolean isChecked() {
    return this.checked;
  }

  public TTodo setChecked(boolean checked) {
    this.checked = checked;
    setCheckedIsSet(true);
    return this;
  }

  public void unsetChecked() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CHECKED_ISSET_ID);
  }

  /** Returns true if field checked is set (has been assigned a value) and false otherwise */
  public boolean isSetChecked() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CHECKED_ISSET_ID);
  }

  public void setCheckedIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CHECKED_ISSET_ID, value);
  }

  public String getDetail() {
    return this.detail;
  }

  public TTodo setDetail(String detail) {
    this.detail = detail;
    return this;
  }

  public void unsetDetail() {
    this.detail = null;
  }

  /** Returns true if field detail is set (has been assigned a value) and false otherwise */
  public boolean isSetDetail() {
    return this.detail != null;
  }

  public void setDetailIsSet(boolean value) {
    if (!value) {
      this.detail = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case CHECKED:
      if (value == null) {
        unsetChecked();
      } else {
        setChecked((Boolean)value);
      }
      break;

    case DETAIL:
      if (value == null) {
        unsetDetail();
      } else {
        setDetail((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case CHECKED:
      return isChecked();

    case DETAIL:
      return getDetail();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case CHECKED:
      return isSetChecked();
    case DETAIL:
      return isSetDetail();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TTodo)
      return this.equals((TTodo)that);
    return false;
  }

  public boolean equals(TTodo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_checked = true;
    boolean that_present_checked = true;
    if (this_present_checked || that_present_checked) {
      if (!(this_present_checked && that_present_checked))
        return false;
      if (this.checked != that.checked)
        return false;
    }

    boolean this_present_detail = true && this.isSetDetail();
    boolean that_present_detail = true && that.isSetDetail();
    if (this_present_detail || that_present_detail) {
      if (!(this_present_detail && that_present_detail))
        return false;
      if (!this.detail.equals(that.detail))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + id;

    hashCode = hashCode * 8191 + ((checked) ? 131071 : 524287);

    hashCode = hashCode * 8191 + ((isSetDetail()) ? 131071 : 524287);
    if (isSetDetail())
      hashCode = hashCode * 8191 + detail.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TTodo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetChecked()).compareTo(other.isSetChecked());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChecked()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.checked, other.checked);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDetail()).compareTo(other.isSetDetail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDetail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.detail, other.detail);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TTodo(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("checked:");
    sb.append(this.checked);
    first = false;
    if (!first) sb.append(", ");
    sb.append("detail:");
    if (this.detail == null) {
      sb.append("null");
    } else {
      sb.append(this.detail);
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

  private static class TTodoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTodoStandardScheme getScheme() {
      return new TTodoStandardScheme();
    }
  }

  private static class TTodoStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTodo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTodo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CHECKED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.checked = iprot.readBool();
              struct.setCheckedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // DETAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.detail = iprot.readString();
              struct.setDetailIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTodo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CHECKED_FIELD_DESC);
      oprot.writeBool(struct.checked);
      oprot.writeFieldEnd();
      if (struct.detail != null) {
        oprot.writeFieldBegin(DETAIL_FIELD_DESC);
        oprot.writeString(struct.detail);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTodoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTodoTupleScheme getScheme() {
      return new TTodoTupleScheme();
    }
  }

  private static class TTodoTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTodo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTodo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetChecked()) {
        optionals.set(1);
      }
      if (struct.isSetDetail()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetChecked()) {
        oprot.writeBool(struct.checked);
      }
      if (struct.isSetDetail()) {
        oprot.writeString(struct.detail);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTodo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.checked = iprot.readBool();
        struct.setCheckedIsSet(true);
      }
      if (incoming.get(2)) {
        struct.detail = iprot.readString();
        struct.setDetailIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

