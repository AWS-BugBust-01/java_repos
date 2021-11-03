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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Each step type has its own <code>StepDetails</code> structure.
 * </p>
 * <p>
 * The key/value pairs used to tag a file during the execution of a workflow step.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/TagStepDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagStepDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the step, used as an identifier.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Array that contains from 1 to 10 key/value pairs.
     * </p>
     */
    private java.util.List<S3Tag> tags;

    /**
     * <p>
     * The name of the step, used as an identifier.
     * </p>
     * 
     * @param name
     *        The name of the step, used as an identifier.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the step, used as an identifier.
     * </p>
     * 
     * @return The name of the step, used as an identifier.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the step, used as an identifier.
     * </p>
     * 
     * @param name
     *        The name of the step, used as an identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagStepDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Array that contains from 1 to 10 key/value pairs.
     * </p>
     * 
     * @return Array that contains from 1 to 10 key/value pairs.
     */

    public java.util.List<S3Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Array that contains from 1 to 10 key/value pairs.
     * </p>
     * 
     * @param tags
     *        Array that contains from 1 to 10 key/value pairs.
     */

    public void setTags(java.util.Collection<S3Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<S3Tag>(tags);
    }

    /**
     * <p>
     * Array that contains from 1 to 10 key/value pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Array that contains from 1 to 10 key/value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagStepDetails withTags(S3Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<S3Tag>(tags.length));
        }
        for (S3Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Array that contains from 1 to 10 key/value pairs.
     * </p>
     * 
     * @param tags
     *        Array that contains from 1 to 10 key/value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TagStepDetails withTags(java.util.Collection<S3Tag> tags) {
        setTags(tags);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TagStepDetails == false)
            return false;
        TagStepDetails other = (TagStepDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TagStepDetails clone() {
        try {
            return (TagStepDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transfer.model.transform.TagStepDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
