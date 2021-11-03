/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The filter applied to ListProfileObjects response to include profile objects with the specified index values. This
 * filter is only supported for ObjectTypeName _asset and _case.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ObjectFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObjectFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A searchable identifier of a standard profile object. The predefined keys you can use to search for _asset
     * include: _assetId, _assetName, _serialNumber. The predefined keys you can use to search for _case include:
     * _caseId.
     * </p>
     */
    private String keyName;
    /**
     * <p>
     * A list of key values.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * A searchable identifier of a standard profile object. The predefined keys you can use to search for _asset
     * include: _assetId, _assetName, _serialNumber. The predefined keys you can use to search for _case include:
     * _caseId.
     * </p>
     * 
     * @param keyName
     *        A searchable identifier of a standard profile object. The predefined keys you can use to search for _asset
     *        include: _assetId, _assetName, _serialNumber. The predefined keys you can use to search for _case include:
     *        _caseId.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * A searchable identifier of a standard profile object. The predefined keys you can use to search for _asset
     * include: _assetId, _assetName, _serialNumber. The predefined keys you can use to search for _case include:
     * _caseId.
     * </p>
     * 
     * @return A searchable identifier of a standard profile object. The predefined keys you can use to search for
     *         _asset include: _assetId, _assetName, _serialNumber. The predefined keys you can use to search for _case
     *         include: _caseId.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * A searchable identifier of a standard profile object. The predefined keys you can use to search for _asset
     * include: _assetId, _assetName, _serialNumber. The predefined keys you can use to search for _case include:
     * _caseId.
     * </p>
     * 
     * @param keyName
     *        A searchable identifier of a standard profile object. The predefined keys you can use to search for _asset
     *        include: _assetId, _assetName, _serialNumber. The predefined keys you can use to search for _case include:
     *        _caseId.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectFilter withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * A list of key values.
     * </p>
     * 
     * @return A list of key values.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * A list of key values.
     * </p>
     * 
     * @param values
     *        A list of key values.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * A list of key values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        A list of key values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectFilter withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of key values.
     * </p>
     * 
     * @param values
     *        A list of key values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectFilter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObjectFilter == false)
            return false;
        ObjectFilter other = (ObjectFilter) obj;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public ObjectFilter clone() {
        try {
            return (ObjectFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.ObjectFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
