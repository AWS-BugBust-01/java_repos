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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/GetRecoveryGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecoveryGroupResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** A list of Cell arns */
    private java.util.List<String> cells;
    /** The arn for the RecoveryGroup */
    private String recoveryGroupArn;
    /** The name of the RecoveryGroup */
    private String recoveryGroupName;

    private java.util.Map<String, String> tags;

    /**
     * A list of Cell arns
     * 
     * @return A list of Cell arns
     */

    public java.util.List<String> getCells() {
        return cells;
    }

    /**
     * A list of Cell arns
     * 
     * @param cells
     *        A list of Cell arns
     */

    public void setCells(java.util.Collection<String> cells) {
        if (cells == null) {
            this.cells = null;
            return;
        }

        this.cells = new java.util.ArrayList<String>(cells);
    }

    /**
     * A list of Cell arns
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCells(java.util.Collection)} or {@link #withCells(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cells
     *        A list of Cell arns
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecoveryGroupResult withCells(String... cells) {
        if (this.cells == null) {
            setCells(new java.util.ArrayList<String>(cells.length));
        }
        for (String ele : cells) {
            this.cells.add(ele);
        }
        return this;
    }

    /**
     * A list of Cell arns
     * 
     * @param cells
     *        A list of Cell arns
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecoveryGroupResult withCells(java.util.Collection<String> cells) {
        setCells(cells);
        return this;
    }

    /**
     * The arn for the RecoveryGroup
     * 
     * @param recoveryGroupArn
     *        The arn for the RecoveryGroup
     */

    public void setRecoveryGroupArn(String recoveryGroupArn) {
        this.recoveryGroupArn = recoveryGroupArn;
    }

    /**
     * The arn for the RecoveryGroup
     * 
     * @return The arn for the RecoveryGroup
     */

    public String getRecoveryGroupArn() {
        return this.recoveryGroupArn;
    }

    /**
     * The arn for the RecoveryGroup
     * 
     * @param recoveryGroupArn
     *        The arn for the RecoveryGroup
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecoveryGroupResult withRecoveryGroupArn(String recoveryGroupArn) {
        setRecoveryGroupArn(recoveryGroupArn);
        return this;
    }

    /**
     * The name of the RecoveryGroup
     * 
     * @param recoveryGroupName
     *        The name of the RecoveryGroup
     */

    public void setRecoveryGroupName(String recoveryGroupName) {
        this.recoveryGroupName = recoveryGroupName;
    }

    /**
     * The name of the RecoveryGroup
     * 
     * @return The name of the RecoveryGroup
     */

    public String getRecoveryGroupName() {
        return this.recoveryGroupName;
    }

    /**
     * The name of the RecoveryGroup
     * 
     * @param recoveryGroupName
     *        The name of the RecoveryGroup
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecoveryGroupResult withRecoveryGroupName(String recoveryGroupName) {
        setRecoveryGroupName(recoveryGroupName);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecoveryGroupResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetRecoveryGroupResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetRecoveryGroupResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecoveryGroupResult clearTagsEntries() {
        this.tags = null;
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
        if (getCells() != null)
            sb.append("Cells: ").append(getCells()).append(",");
        if (getRecoveryGroupArn() != null)
            sb.append("RecoveryGroupArn: ").append(getRecoveryGroupArn()).append(",");
        if (getRecoveryGroupName() != null)
            sb.append("RecoveryGroupName: ").append(getRecoveryGroupName()).append(",");
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

        if (obj instanceof GetRecoveryGroupResult == false)
            return false;
        GetRecoveryGroupResult other = (GetRecoveryGroupResult) obj;
        if (other.getCells() == null ^ this.getCells() == null)
            return false;
        if (other.getCells() != null && other.getCells().equals(this.getCells()) == false)
            return false;
        if (other.getRecoveryGroupArn() == null ^ this.getRecoveryGroupArn() == null)
            return false;
        if (other.getRecoveryGroupArn() != null && other.getRecoveryGroupArn().equals(this.getRecoveryGroupArn()) == false)
            return false;
        if (other.getRecoveryGroupName() == null ^ this.getRecoveryGroupName() == null)
            return false;
        if (other.getRecoveryGroupName() != null && other.getRecoveryGroupName().equals(this.getRecoveryGroupName()) == false)
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

        hashCode = prime * hashCode + ((getCells() == null) ? 0 : getCells().hashCode());
        hashCode = prime * hashCode + ((getRecoveryGroupArn() == null) ? 0 : getRecoveryGroupArn().hashCode());
        hashCode = prime * hashCode + ((getRecoveryGroupName() == null) ? 0 : getRecoveryGroupName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetRecoveryGroupResult clone() {
        try {
            return (GetRecoveryGroupResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
