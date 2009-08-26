/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.cassandra.service;
/*
 * 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * 
 */


import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import org.apache.log4j.Logger;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;

public class SlicePredicate implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("SlicePredicate");
  private static final TField COLUMN_NAMES_FIELD_DESC = new TField("column_names", TType.LIST, (short)1);
  private static final TField SLICE_RANGE_FIELD_DESC = new TField("slice_range", TType.STRUCT, (short)2);

  public List<byte[]> column_names;
  public static final int COLUMN_NAMES = 1;
  public SliceRange slice_range;
  public static final int SLICE_RANGE = 2;

  private final Isset __isset = new Isset();
  private static final class Isset implements java.io.Serializable {
  }

  public static final Map<Integer, FieldMetaData> metaDataMap = Collections.unmodifiableMap(new HashMap<Integer, FieldMetaData>() {{
    put(COLUMN_NAMES, new FieldMetaData("column_names", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.STRING))));
    put(SLICE_RANGE, new FieldMetaData("slice_range", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, SliceRange.class)));
  }});

  static {
    FieldMetaData.addStructMetaDataMap(SlicePredicate.class, metaDataMap);
  }

  public SlicePredicate() {
  }

  public SlicePredicate(
    List<byte[]> column_names,
    SliceRange slice_range)
  {
    this();
    this.column_names = column_names;
    this.slice_range = slice_range;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SlicePredicate(SlicePredicate other) {
    if (other.isSetColumn_names()) {
      List<byte[]> __this__column_names = new ArrayList<byte[]>();
      for (byte[] other_element : other.column_names) {
        byte[] temp_binary_element = new byte[other_element.length];
        System.arraycopy(other_element, 0, temp_binary_element, 0, other_element.length);
        __this__column_names.add(temp_binary_element);
      }
      this.column_names = __this__column_names;
    }
    if (other.isSetSlice_range()) {
      this.slice_range = new SliceRange(other.slice_range);
    }
  }

  @Override
  public SlicePredicate clone() {
    return new SlicePredicate(this);
  }

  public List<byte[]> getColumn_names() {
    return this.column_names;
  }

  public SlicePredicate setColumn_names(List<byte[]> column_names) {
    this.column_names = column_names;
    return this;
  }

  public void unsetColumn_names() {
    this.column_names = null;
  }

  // Returns true if field column_names is set (has been asigned a value) and false otherwise
  public boolean isSetColumn_names() {
    return this.column_names != null;
  }

  public void setColumn_namesIsSet(boolean value) {
    if (!value) {
      this.column_names = null;
    }
  }

  public SliceRange getSlice_range() {
    return this.slice_range;
  }

  public SlicePredicate setSlice_range(SliceRange slice_range) {
    this.slice_range = slice_range;
    return this;
  }

  public void unsetSlice_range() {
    this.slice_range = null;
  }

  // Returns true if field slice_range is set (has been asigned a value) and false otherwise
  public boolean isSetSlice_range() {
    return this.slice_range != null;
  }

  public void setSlice_rangeIsSet(boolean value) {
    if (!value) {
      this.slice_range = null;
    }
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case COLUMN_NAMES:
      if (value == null) {
        unsetColumn_names();
      } else {
        setColumn_names((List<byte[]>)value);
      }
      break;

    case SLICE_RANGE:
      if (value == null) {
        unsetSlice_range();
      } else {
        setSlice_range((SliceRange)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case COLUMN_NAMES:
      return getColumn_names();

    case SLICE_RANGE:
      return getSlice_range();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case COLUMN_NAMES:
      return isSetColumn_names();
    case SLICE_RANGE:
      return isSetSlice_range();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SlicePredicate)
      return this.equals((SlicePredicate)that);
    return false;
  }

  public boolean equals(SlicePredicate that) {
    if (that == null)
      return false;

    boolean this_present_column_names = true && this.isSetColumn_names();
    boolean that_present_column_names = true && that.isSetColumn_names();
    if (this_present_column_names || that_present_column_names) {
      if (!(this_present_column_names && that_present_column_names))
        return false;
      if (!this.column_names.equals(that.column_names))
        return false;
    }

    boolean this_present_slice_range = true && this.isSetSlice_range();
    boolean that_present_slice_range = true && that.isSetSlice_range();
    if (this_present_slice_range || that_present_slice_range) {
      if (!(this_present_slice_range && that_present_slice_range))
        return false;
      if (!this.slice_range.equals(that.slice_range))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case COLUMN_NAMES:
          if (field.type == TType.LIST) {
            {
              TList _list4 = iprot.readListBegin();
              this.column_names = new ArrayList<byte[]>(_list4.size);
              for (int _i5 = 0; _i5 < _list4.size; ++_i5)
              {
                byte[] _elem6;
                _elem6 = iprot.readBinary();
                this.column_names.add(_elem6);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SLICE_RANGE:
          if (field.type == TType.STRUCT) {
            this.slice_range = new SliceRange();
            this.slice_range.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.column_names != null) {
      if (isSetColumn_names()) {
        oprot.writeFieldBegin(COLUMN_NAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.column_names.size()));
          for (byte[] _iter7 : this.column_names)          {
            oprot.writeBinary(_iter7);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.slice_range != null) {
      if (isSetSlice_range()) {
        oprot.writeFieldBegin(SLICE_RANGE_FIELD_DESC);
        this.slice_range.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SlicePredicate(");
    boolean first = true;

    if (isSetColumn_names()) {
      sb.append("column_names:");
      if (this.column_names == null) {
        sb.append("null");
      } else {
        sb.append(this.column_names);
      }
      first = false;
    }
    if (isSetSlice_range()) {
      if (!first) sb.append(", ");
      sb.append("slice_range:");
      if (this.slice_range == null) {
        sb.append("null");
      } else {
        sb.append(this.slice_range);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

