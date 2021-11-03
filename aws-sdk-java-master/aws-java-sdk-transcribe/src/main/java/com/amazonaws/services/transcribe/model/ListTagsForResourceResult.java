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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ListTagsForResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Lists all tags associated with the given Amazon Resource Name (ARN).
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * Lists all tags associated with the given transcription job, vocabulary, or resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Lists all tags associated with the given Amazon Resource Name (ARN).
     * </p>
     * 
     * @param resourceArn
     *        Lists all tags associated with the given Amazon Resource Name (ARN).
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * Lists all tags associated with the given Amazon Resource Name (ARN).
     * </p>
     * 
     * @return Lists all tags associated with the given Amazon Resource Name (ARN).
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * Lists all tags associated with the given Amazon Resource Name (ARN).
     * </p>
     * 
     * @param resourceArn
     *        Lists all tags associated with the given Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * Lists all tags associated with the given transcription job, vocabulary, or resource.
     * </p>
     * 
     * @return Lists all tags associated with the given transcription job, vocabulary, or resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Lists all tags associated with the given transcription job, vocabulary, or resource.
     * </p>
     * 
     * @param tags
     *        Lists all tags associated with the given transcription job, vocabulary, or resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Lists all tags associated with the given transcription job, vocabulary, or resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Lists all tags associated with the given transcription job, vocabulary, or resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceResult withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists all tags associated with the given transcription job, vocabulary, or resource.
     * </p>
     * 
     * @param tags
     *        Lists all tags associated with the given transcription job, vocabulary, or resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceResult withTags(java.util.Collection<Tag> tags) {
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
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

        if (obj instanceof ListTagsForResourceResult == false)
            return false;
        ListTagsForResourceResult other = (ListTagsForResourceResult) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
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

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceResult clone() {
        try {
            return (ListTagsForResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
