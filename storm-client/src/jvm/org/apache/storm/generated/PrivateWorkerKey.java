/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)")
public class PrivateWorkerKey implements org.apache.thrift.TBase<PrivateWorkerKey, PrivateWorkerKey._Fields>, java.io.Serializable, Cloneable, Comparable<PrivateWorkerKey> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PrivateWorkerKey");

  private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("userName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EXPIRATION_TIME_MILLIS_FIELD_DESC = new org.apache.thrift.protocol.TField("expirationTimeMillis", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PrivateWorkerKeyStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PrivateWorkerKeyTupleSchemeFactory();

  private java.nio.ByteBuffer key; // required
  private java.lang.String userName; // required
  private long expirationTimeMillis; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    KEY((short)1, "key"),
    USER_NAME((short)2, "userName"),
    EXPIRATION_TIME_MILLIS((short)3, "expirationTimeMillis");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

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
        case 1: // KEY
          return KEY;
        case 2: // USER_NAME
          return USER_NAME;
        case 3: // EXPIRATION_TIME_MILLIS
          return EXPIRATION_TIME_MILLIS;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __EXPIRATIONTIMEMILLIS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEY, new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("userName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXPIRATION_TIME_MILLIS, new org.apache.thrift.meta_data.FieldMetaData("expirationTimeMillis", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PrivateWorkerKey.class, metaDataMap);
  }

  public PrivateWorkerKey() {
  }

  public PrivateWorkerKey(
    java.nio.ByteBuffer key,
    java.lang.String userName,
    long expirationTimeMillis)
  {
    this();
    this.key = org.apache.thrift.TBaseHelper.copyBinary(key);
    this.userName = userName;
    this.expirationTimeMillis = expirationTimeMillis;
    set_expirationTimeMillis_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PrivateWorkerKey(PrivateWorkerKey other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.is_set_key()) {
      this.key = org.apache.thrift.TBaseHelper.copyBinary(other.key);
    }
    if (other.is_set_userName()) {
      this.userName = other.userName;
    }
    this.expirationTimeMillis = other.expirationTimeMillis;
  }

  public PrivateWorkerKey deepCopy() {
    return new PrivateWorkerKey(this);
  }

  @Override
  public void clear() {
    this.key = null;
    this.userName = null;
    set_expirationTimeMillis_isSet(false);
    this.expirationTimeMillis = 0;
  }

  public byte[] get_key() {
    set_key(org.apache.thrift.TBaseHelper.rightSize(key));
    return key == null ? null : key.array();
  }

  public java.nio.ByteBuffer buffer_for_key() {
    return org.apache.thrift.TBaseHelper.copyBinary(key);
  }

  public void set_key(byte[] key) {
    this.key = key == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(key.clone());
  }

  public void set_key(java.nio.ByteBuffer key) {
    this.key = org.apache.thrift.TBaseHelper.copyBinary(key);
  }

  public void unset_key() {
    this.key = null;
  }

  /** Returns true if field key is set (has been assigned a value) and false otherwise */
  public boolean is_set_key() {
    return this.key != null;
  }

  public void set_key_isSet(boolean value) {
    if (!value) {
      this.key = null;
    }
  }

  public java.lang.String get_userName() {
    return this.userName;
  }

  public void set_userName(java.lang.String userName) {
    this.userName = userName;
  }

  public void unset_userName() {
    this.userName = null;
  }

  /** Returns true if field userName is set (has been assigned a value) and false otherwise */
  public boolean is_set_userName() {
    return this.userName != null;
  }

  public void set_userName_isSet(boolean value) {
    if (!value) {
      this.userName = null;
    }
  }

  public long get_expirationTimeMillis() {
    return this.expirationTimeMillis;
  }

  public void set_expirationTimeMillis(long expirationTimeMillis) {
    this.expirationTimeMillis = expirationTimeMillis;
    set_expirationTimeMillis_isSet(true);
  }

  public void unset_expirationTimeMillis() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EXPIRATIONTIMEMILLIS_ISSET_ID);
  }

  /** Returns true if field expirationTimeMillis is set (has been assigned a value) and false otherwise */
  public boolean is_set_expirationTimeMillis() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EXPIRATIONTIMEMILLIS_ISSET_ID);
  }

  public void set_expirationTimeMillis_isSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EXPIRATIONTIMEMILLIS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case KEY:
      if (value == null) {
        unset_key();
      } else {
        if (value instanceof byte[]) {
          set_key((byte[])value);
        } else {
          set_key((java.nio.ByteBuffer)value);
        }
      }
      break;

    case USER_NAME:
      if (value == null) {
        unset_userName();
      } else {
        set_userName((java.lang.String)value);
      }
      break;

    case EXPIRATION_TIME_MILLIS:
      if (value == null) {
        unset_expirationTimeMillis();
      } else {
        set_expirationTimeMillis((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case KEY:
      return get_key();

    case USER_NAME:
      return get_userName();

    case EXPIRATION_TIME_MILLIS:
      return get_expirationTimeMillis();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case KEY:
      return is_set_key();
    case USER_NAME:
      return is_set_userName();
    case EXPIRATION_TIME_MILLIS:
      return is_set_expirationTimeMillis();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof PrivateWorkerKey)
      return this.equals((PrivateWorkerKey)that);
    return false;
  }

  public boolean equals(PrivateWorkerKey that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_key = true && this.is_set_key();
    boolean that_present_key = true && that.is_set_key();
    if (this_present_key || that_present_key) {
      if (!(this_present_key && that_present_key))
        return false;
      if (!this.key.equals(that.key))
        return false;
    }

    boolean this_present_userName = true && this.is_set_userName();
    boolean that_present_userName = true && that.is_set_userName();
    if (this_present_userName || that_present_userName) {
      if (!(this_present_userName && that_present_userName))
        return false;
      if (!this.userName.equals(that.userName))
        return false;
    }

    boolean this_present_expirationTimeMillis = true;
    boolean that_present_expirationTimeMillis = true;
    if (this_present_expirationTimeMillis || that_present_expirationTimeMillis) {
      if (!(this_present_expirationTimeMillis && that_present_expirationTimeMillis))
        return false;
      if (this.expirationTimeMillis != that.expirationTimeMillis)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((is_set_key()) ? 131071 : 524287);
    if (is_set_key())
      hashCode = hashCode * 8191 + key.hashCode();

    hashCode = hashCode * 8191 + ((is_set_userName()) ? 131071 : 524287);
    if (is_set_userName())
      hashCode = hashCode * 8191 + userName.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(expirationTimeMillis);

    return hashCode;
  }

  @Override
  public int compareTo(PrivateWorkerKey other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(is_set_key()).compareTo(other.is_set_key());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_key()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key, other.key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(is_set_userName()).compareTo(other.is_set_userName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_userName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userName, other.userName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(is_set_expirationTimeMillis()).compareTo(other.is_set_expirationTimeMillis());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_expirationTimeMillis()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expirationTimeMillis, other.expirationTimeMillis);
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
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PrivateWorkerKey(");
    boolean first = true;

    sb.append("key:");
    if (this.key == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.key, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userName:");
    if (this.userName == null) {
      sb.append("null");
    } else {
      sb.append(this.userName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("expirationTimeMillis:");
    sb.append(this.expirationTimeMillis);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!is_set_key()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'key' is unset! Struct:" + toString());
    }

    if (!is_set_userName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userName' is unset! Struct:" + toString());
    }

    if (!is_set_expirationTimeMillis()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'expirationTimeMillis' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PrivateWorkerKeyStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PrivateWorkerKeyStandardScheme getScheme() {
      return new PrivateWorkerKeyStandardScheme();
    }
  }

  private static class PrivateWorkerKeyStandardScheme extends org.apache.thrift.scheme.StandardScheme<PrivateWorkerKey> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PrivateWorkerKey struct) throws org.apache.thrift.TException {
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
              struct.set_key_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userName = iprot.readString();
              struct.set_userName_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXPIRATION_TIME_MILLIS
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.expirationTimeMillis = iprot.readI64();
              struct.set_expirationTimeMillis_isSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PrivateWorkerKey struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.key != null) {
        oprot.writeFieldBegin(KEY_FIELD_DESC);
        oprot.writeBinary(struct.key);
        oprot.writeFieldEnd();
      }
      if (struct.userName != null) {
        oprot.writeFieldBegin(USER_NAME_FIELD_DESC);
        oprot.writeString(struct.userName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(EXPIRATION_TIME_MILLIS_FIELD_DESC);
      oprot.writeI64(struct.expirationTimeMillis);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PrivateWorkerKeyTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PrivateWorkerKeyTupleScheme getScheme() {
      return new PrivateWorkerKeyTupleScheme();
    }
  }

  private static class PrivateWorkerKeyTupleScheme extends org.apache.thrift.scheme.TupleScheme<PrivateWorkerKey> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PrivateWorkerKey struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeBinary(struct.key);
      oprot.writeString(struct.userName);
      oprot.writeI64(struct.expirationTimeMillis);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PrivateWorkerKey struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.key = iprot.readBinary();
      struct.set_key_isSet(true);
      struct.userName = iprot.readString();
      struct.set_userName_isSet(true);
      struct.expirationTimeMillis = iprot.readI64();
      struct.set_expirationTimeMillis_isSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
