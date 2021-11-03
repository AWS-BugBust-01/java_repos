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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A Cell and its properties
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CellOutput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CellOutput implements Serializable, Cloneable, StructuredPojo {

    /** The arn for the Cell */
    private String cellArn;
    /** The name of the Cell */
    private String cellName;
    /** A list of Cell arns */
    private java.util.List<String> cells;
    /** A list of Cell ARNs and/or RecoveryGroup ARNs */
    private java.util.List<String> parentReadinessScopes;

    private java.util.Map<String, String> tags;

    /**
     * The arn for the Cell
     * 
     * @param cellArn
     *        The arn for the Cell
     */

    public void setCellArn(String cellArn) {
        this.cellArn = cellArn;
    }

    /**
     * The arn for the Cell
     * 
     * @return The arn for the Cell
     */

    public String getCellArn() {
        return this.cellArn;
    }

    /**
     * The arn for the Cell
     * 
     * @param cellArn
     *        The arn for the Cell
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CellOutput withCellArn(String cellArn) {
        setCellArn(cellArn);
        return this;
    }

    /**
     * The name of the Cell
     * 
     * @param cellName
     *        The name of the Cell
     */

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    /**
     * The name of the Cell
     * 
     * @return The name of the Cell
     */

    public String getCellName() {
        return this.cellName;
    }

    /**
     * The name of the Cell
     * 
     * @param cellName
     *        The name of the Cell
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CellOutput withCellName(String cellName) {
        setCellName(cellName);
        return this;
    }

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

    public CellOutput withCells(String... cells) {
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

    public CellOutput withCells(java.util.Collection<String> cells) {
        setCells(cells);
        return this;
    }

    /**
     * A list of Cell ARNs and/or RecoveryGroup ARNs
     * 
     * @return A list of Cell ARNs and/or RecoveryGroup ARNs
     */

    public java.util.List<String> getParentReadinessScopes() {
        return parentReadinessScopes;
    }

    /**
     * A list of Cell ARNs and/or RecoveryGroup ARNs
     * 
     * @param parentReadinessScopes
     *        A list of Cell ARNs and/or RecoveryGroup ARNs
     */

    public void setParentReadinessScopes(java.util.Collection<String> parentReadinessScopes) {
        if (parentReadinessScopes == null) {
            this.parentReadinessScopes = null;
            return;
        }

        this.parentReadinessScopes = new java.util.ArrayList<String>(parentReadinessScopes);
    }

    /**
     * A list of Cell ARNs and/or RecoveryGroup ARNs
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParentReadinessScopes(java.util.Collection)} or
     * {@link #withParentReadinessScopes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param parentReadinessScopes
     *        A list of Cell ARNs and/or RecoveryGroup ARNs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CellOutput withParentReadinessScopes(String... parentReadinessScopes) {
        if (this.parentReadinessScopes == null) {
            setParentReadinessScopes(new java.util.ArrayList<String>(parentReadinessScopes.length));
        }
        for (String ele : parentReadinessScopes) {
            this.parentReadinessScopes.add(ele);
        }
        return this;
    }

    /**
     * A list of Cell ARNs and/or RecoveryGroup ARNs
     * 
     * @param parentReadinessScopes
     *        A list of Cell ARNs and/or RecoveryGroup ARNs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CellOutput withParentReadinessScopes(java.util.Collection<String> parentReadinessScopes) {
        setParentReadinessScopes(parentReadinessScopes);
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

    public CellOutput withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CellOutput#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CellOutput addTagsEntry(String key, String value) {
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

    public CellOutput clearTagsEntries() {
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
        if (getCellArn() != null)
            sb.append("CellArn: ").append(getCellArn()).append(",");
        if (getCellName() != null)
            sb.append("CellName: ").append(getCellName()).append(",");
        if (getCells() != null)
            sb.append("Cells: ").append(getCells()).append(",");
        if (getParentReadinessScopes() != null)
            sb.append("ParentReadinessScopes: ").append(getParentReadinessScopes()).append(",");
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

        if (obj instanceof CellOutput == false)
            return false;
        CellOutput other = (CellOutput) obj;
        if (other.getCellArn() == null ^ this.getCellArn() == null)
            return false;
        if (other.getCellArn() != null && other.getCellArn().equals(this.getCellArn()) == false)
            return false;
        if (other.getCellName() == null ^ this.getCellName() == null)
            return false;
        if (other.getCellName() != null && other.getCellName().equals(this.getCellName()) == false)
            return false;
        if (other.getCells() == null ^ this.getCells() == null)
            return false;
        if (other.getCells() != null && other.getCells().equals(this.getCells()) == false)
            return false;
        if (other.getParentReadinessScopes() == null ^ this.getParentReadinessScopes() == null)
            return false;
        if (other.getParentReadinessScopes() != null && other.getParentReadinessScopes().equals(this.getParentReadinessScopes()) == false)
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

        hashCode = prime * hashCode + ((getCellArn() == null) ? 0 : getCellArn().hashCode());
        hashCode = prime * hashCode + ((getCellName() == null) ? 0 : getCellName().hashCode());
        hashCode = prime * hashCode + ((getCells() == null) ? 0 : getCells().hashCode());
        hashCode = prime * hashCode + ((getParentReadinessScopes() == null) ? 0 : getParentReadinessScopes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CellOutput clone() {
        try {
            return (CellOutput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoveryreadiness.model.transform.CellOutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
