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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * The Cell to create
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/CreateCell"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCellRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The name of the Cell to create */
    private String cellName;
    /** A list of Cell arns contained within this Cell (for use in nested Cells, e.g. regions within which AZs) */
    private java.util.List<String> cells;

    private java.util.Map<String, String> tags;

    /**
     * The name of the Cell to create
     * 
     * @param cellName
     *        The name of the Cell to create
     */

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    /**
     * The name of the Cell to create
     * 
     * @return The name of the Cell to create
     */

    public String getCellName() {
        return this.cellName;
    }

    /**
     * The name of the Cell to create
     * 
     * @param cellName
     *        The name of the Cell to create
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCellRequest withCellName(String cellName) {
        setCellName(cellName);
        return this;
    }

    /**
     * A list of Cell arns contained within this Cell (for use in nested Cells, e.g. regions within which AZs)
     * 
     * @return A list of Cell arns contained within this Cell (for use in nested Cells, e.g. regions within which AZs)
     */

    public java.util.List<String> getCells() {
        return cells;
    }

    /**
     * A list of Cell arns contained within this Cell (for use in nested Cells, e.g. regions within which AZs)
     * 
     * @param cells
     *        A list of Cell arns contained within this Cell (for use in nested Cells, e.g. regions within which AZs)
     */

    public void setCells(java.util.Collection<String> cells) {
        if (cells == null) {
            this.cells = null;
            return;
        }

        this.cells = new java.util.ArrayList<String>(cells);
    }

    /**
     * A list of Cell arns contained within this Cell (for use in nested Cells, e.g. regions within which AZs)
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCells(java.util.Collection)} or {@link #withCells(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param cells
     *        A list of Cell arns contained within this Cell (for use in nested Cells, e.g. regions within which AZs)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCellRequest withCells(String... cells) {
        if (this.cells == null) {
            setCells(new java.util.ArrayList<String>(cells.length));
        }
        for (String ele : cells) {
            this.cells.add(ele);
        }
        return this;
    }

    /**
     * A list of Cell arns contained within this Cell (for use in nested Cells, e.g. regions within which AZs)
     * 
     * @param cells
     *        A list of Cell arns contained within this Cell (for use in nested Cells, e.g. regions within which AZs)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCellRequest withCells(java.util.Collection<String> cells) {
        setCells(cells);
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

    public CreateCellRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateCellRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateCellRequest addTagsEntry(String key, String value) {
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

    public CreateCellRequest clearTagsEntries() {
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
        if (getCellName() != null)
            sb.append("CellName: ").append(getCellName()).append(",");
        if (getCells() != null)
            sb.append("Cells: ").append(getCells()).append(",");
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

        if (obj instanceof CreateCellRequest == false)
            return false;
        CreateCellRequest other = (CreateCellRequest) obj;
        if (other.getCellName() == null ^ this.getCellName() == null)
            return false;
        if (other.getCellName() != null && other.getCellName().equals(this.getCellName()) == false)
            return false;
        if (other.getCells() == null ^ this.getCells() == null)
            return false;
        if (other.getCells() != null && other.getCells().equals(this.getCells()) == false)
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

        hashCode = prime * hashCode + ((getCellName() == null) ? 0 : getCellName().hashCode());
        hashCode = prime * hashCode + ((getCells() == null) ? 0 : getCells().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateCellRequest clone() {
        return (CreateCellRequest) super.clone();
    }

}
