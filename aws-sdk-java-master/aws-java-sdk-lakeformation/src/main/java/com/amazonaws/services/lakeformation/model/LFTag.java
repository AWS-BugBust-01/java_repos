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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that allows an admin to grant user permissions on certain conditions. For example, granting a role access
 * to all columns not tagged 'PII' of tables tagged 'Prod'.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/LFTag" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LFTag implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key-name for the tag.
     * </p>
     */
    private String tagKey;
    /**
     * <p>
     * A list of possible values an attribute can take.
     * </p>
     */
    private java.util.List<String> tagValues;

    /**
     * <p>
     * The key-name for the tag.
     * </p>
     * 
     * @param tagKey
     *        The key-name for the tag.
     */

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    /**
     * <p>
     * The key-name for the tag.
     * </p>
     * 
     * @return The key-name for the tag.
     */

    public String getTagKey() {
        return this.tagKey;
    }

    /**
     * <p>
     * The key-name for the tag.
     * </p>
     * 
     * @param tagKey
     *        The key-name for the tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LFTag withTagKey(String tagKey) {
        setTagKey(tagKey);
        return this;
    }

    /**
     * <p>
     * A list of possible values an attribute can take.
     * </p>
     * 
     * @return A list of possible values an attribute can take.
     */

    public java.util.List<String> getTagValues() {
        return tagValues;
    }

    /**
     * <p>
     * A list of possible values an attribute can take.
     * </p>
     * 
     * @param tagValues
     *        A list of possible values an attribute can take.
     */

    public void setTagValues(java.util.Collection<String> tagValues) {
        if (tagValues == null) {
            this.tagValues = null;
            return;
        }

        this.tagValues = new java.util.ArrayList<String>(tagValues);
    }

    /**
     * <p>
     * A list of possible values an attribute can take.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagValues(java.util.Collection)} or {@link #withTagValues(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagValues
     *        A list of possible values an attribute can take.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LFTag withTagValues(String... tagValues) {
        if (this.tagValues == null) {
            setTagValues(new java.util.ArrayList<String>(tagValues.length));
        }
        for (String ele : tagValues) {
            this.tagValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of possible values an attribute can take.
     * </p>
     * 
     * @param tagValues
     *        A list of possible values an attribute can take.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LFTag withTagValues(java.util.Collection<String> tagValues) {
        setTagValues(tagValues);
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
        if (getTagKey() != null)
            sb.append("TagKey: ").append(getTagKey()).append(",");
        if (getTagValues() != null)
            sb.append("TagValues: ").append(getTagValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LFTag == false)
            return false;
        LFTag other = (LFTag) obj;
        if (other.getTagKey() == null ^ this.getTagKey() == null)
            return false;
        if (other.getTagKey() != null && other.getTagKey().equals(this.getTagKey()) == false)
            return false;
        if (other.getTagValues() == null ^ this.getTagValues() == null)
            return false;
        if (other.getTagValues() != null && other.getTagValues().equals(this.getTagValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagKey() == null) ? 0 : getTagKey().hashCode());
        hashCode = prime * hashCode + ((getTagValues() == null) ? 0 : getTagValues().hashCode());
        return hashCode;
    }

    @Override
    public LFTag clone() {
        try {
            return (LFTag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lakeformation.model.transform.LFTagMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
