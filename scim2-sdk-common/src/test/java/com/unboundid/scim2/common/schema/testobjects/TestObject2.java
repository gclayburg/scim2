/*
 * Copyright 2015 UnboundID Corp.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License (GPLv2 only)
 * or the terms of the GNU Lesser General Public License (LGPLv2.1 only)
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see <http://www.gnu.org/licenses>.
 */

package com.unboundid.scim2.common.schema.testobjects;

import com.unboundid.scim2.common.annotations.SchemaInfo;
import com.unboundid.scim2.common.annotations.SchemaProperty;
import com.unboundid.scim2.common.BaseScimResource;
import com.unboundid.scim2.common.AttributeDefinition;

/**
 * Test class.
 */
@SchemaInfo(id="urn:id:TestObject1",
    description = "description:TestObject1", name = "name:TestObject1")
public class TestObject2 extends BaseScimResource
{
  @SchemaProperty(description = "description:stringField",
      isCaseExact = true, isRequired = true)
  private String stringField;

  @SchemaProperty(description = "description:booleanObjectField",
      isCaseExact = true, isRequired = false,
      returned = AttributeDefinition.Returned.REQUEST)
  private Boolean booleanObjectField;

  @SchemaProperty(description = "description:booleanField",
      isCaseExact = false, isRequired = false,
      returned = AttributeDefinition.Returned.NEVER)
  private boolean booleanField;

  @SchemaProperty(description = "description:integerObjectField",
      isCaseExact = false, isRequired = true,
      returned = AttributeDefinition.Returned.DEFAULT)
  private Integer integerObjectField;

  @SchemaProperty(description = "description:integerField",
      isCaseExact = true, isRequired = true,
      returned = AttributeDefinition.Returned.ALWAYS)
  private int integerField;

  @SchemaProperty(description = "description:mutabilityImmutable",
      mutability = AttributeDefinition.Mutability.IMMUTABLE)
  private String mutabilityImmutable;

  @SchemaProperty(description = "description:mutabilityReadWrite",
      mutability = AttributeDefinition.Mutability.READ_WRITE)
  private String mutabilityReadWrite;

  @SchemaProperty(description = "description:mutabilityWriteOnly",
      mutability = AttributeDefinition.Mutability.WRITE_ONLY)
  private String mutabilityWriteOnly;

  @SchemaProperty(description = "description:mutabilityReadOnly",
      mutability = AttributeDefinition.Mutability.READ_ONLY)
  private String mutabilityReadOnly;

  /**
   * Getter for attribute in test class.
   * @return attribute value.
   */
  public String getStringField()
  {
    return stringField;
  }

  /**
   * Setter for attribute in test class.
   * @param stringField  attribute value.
   */
  public void setStringField(String stringField)
  {
    this.stringField = stringField;
  }

  /**
   * Getter for attribute in test class.
   * @return attribute value.
   */
  public Boolean getBooleanObjectField()
  {
    return booleanObjectField;
  }

  /**
   * Setter for attribute in test class.
   * @param booleanObjectField  attribute value.
   */
  public void setBooleanObjectField(Boolean booleanObjectField)
  {
    this.booleanObjectField = booleanObjectField;
  }

  /**
   * Getter for attribute in test class.
   * @return attribute value.
   */
  public boolean isBooleanField()
  {
    return booleanField;
  }

  /**
   * Setter for attribute in test class.
   * @param booleanField  attribute value.
   */
  public void setBooleanField(boolean booleanField)
  {
    this.booleanField = booleanField;
  }

  /**
   * Getter for attribute in test class.
   * @return attribute value.
   */
  public Integer getIntegerObjectField()
  {
    return integerObjectField;
  }

  /**
   * Setter for attribute in test class.
   * @param integerObjectField  attribute value.
   */
  public void setIntegerObjectField(Integer integerObjectField)
  {
    this.integerObjectField = integerObjectField;
  }

  /**
   * Getter for attribute in test class.
   * @return attribute value.
   */
  public int getIntegerField()
  {
    return integerField;
  }

  /**
   * Setter for attribute in test class.
   * @param integerField  attribute value.
   */
  public void setIntegerField(int integerField)
  {
    this.integerField = integerField;
  }

  /**
   * Getter for attribute in test class.
   * @return attribute value.
   */
  public String getMutabilityImmutable()
  {
    return mutabilityImmutable;
  }

  /**
   * Getter for attribute in test class.
   * @return attribute value.
   */
  public String getMutabilityReadOnly()
  {
    return mutabilityReadOnly;
  }

  /**
   * Setter for attribute in test class.
   * @param mutabilityWriteOnly  attribute value.
   */
  public void setMutabilityWriteOnly(String mutabilityWriteOnly)
  {
    this.mutabilityWriteOnly = mutabilityWriteOnly;
  }

  /**
   * Getter for attribute in test class.
   * @return attribute value.
   */
  public String getMutabilityReadWrite()
  {
    return mutabilityReadWrite;
  }

  /**
   * Setter for attribute in test class.
   * @param mutabilityReadWrite  attribute value.
   */
  public void setMutabilityReadWrite(String mutabilityReadWrite)
  {
    this.mutabilityReadWrite = mutabilityReadWrite;
  }
}