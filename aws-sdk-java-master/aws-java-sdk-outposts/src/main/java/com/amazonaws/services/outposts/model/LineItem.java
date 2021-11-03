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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a line item.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/LineItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LineItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the catalog item.
     * </p>
     */
    private String catalogItemId;
    /**
     * <p>
     * The ID of the line item.
     * </p>
     */
    private String lineItemId;
    /**
     * <p>
     * The quantity of the line item.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * The status of the line item.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The ID of the catalog item.
     * </p>
     * 
     * @param catalogItemId
     *        The ID of the catalog item.
     */

    public void setCatalogItemId(String catalogItemId) {
        this.catalogItemId = catalogItemId;
    }

    /**
     * <p>
     * The ID of the catalog item.
     * </p>
     * 
     * @return The ID of the catalog item.
     */

    public String getCatalogItemId() {
        return this.catalogItemId;
    }

    /**
     * <p>
     * The ID of the catalog item.
     * </p>
     * 
     * @param catalogItemId
     *        The ID of the catalog item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineItem withCatalogItemId(String catalogItemId) {
        setCatalogItemId(catalogItemId);
        return this;
    }

    /**
     * <p>
     * The ID of the line item.
     * </p>
     * 
     * @param lineItemId
     *        The ID of the line item.
     */

    public void setLineItemId(String lineItemId) {
        this.lineItemId = lineItemId;
    }

    /**
     * <p>
     * The ID of the line item.
     * </p>
     * 
     * @return The ID of the line item.
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     * <p>
     * The ID of the line item.
     * </p>
     * 
     * @param lineItemId
     *        The ID of the line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineItem withLineItemId(String lineItemId) {
        setLineItemId(lineItemId);
        return this;
    }

    /**
     * <p>
     * The quantity of the line item.
     * </p>
     * 
     * @param quantity
     *        The quantity of the line item.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The quantity of the line item.
     * </p>
     * 
     * @return The quantity of the line item.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The quantity of the line item.
     * </p>
     * 
     * @param quantity
     *        The quantity of the line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineItem withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * The status of the line item.
     * </p>
     * 
     * @param status
     *        The status of the line item.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the line item.
     * </p>
     * 
     * @return The status of the line item.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the line item.
     * </p>
     * 
     * @param status
     *        The status of the line item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineItem withStatus(String status) {
        setStatus(status);
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
        if (getCatalogItemId() != null)
            sb.append("CatalogItemId: ").append(getCatalogItemId()).append(",");
        if (getLineItemId() != null)
            sb.append("LineItemId: ").append(getLineItemId()).append(",");
        if (getQuantity() != null)
            sb.append("Quantity: ").append(getQuantity()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LineItem == false)
            return false;
        LineItem other = (LineItem) obj;
        if (other.getCatalogItemId() == null ^ this.getCatalogItemId() == null)
            return false;
        if (other.getCatalogItemId() != null && other.getCatalogItemId().equals(this.getCatalogItemId()) == false)
            return false;
        if (other.getLineItemId() == null ^ this.getLineItemId() == null)
            return false;
        if (other.getLineItemId() != null && other.getLineItemId().equals(this.getLineItemId()) == false)
            return false;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogItemId() == null) ? 0 : getCatalogItemId().hashCode());
        hashCode = prime * hashCode + ((getLineItemId() == null) ? 0 : getLineItemId().hashCode());
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public LineItem clone() {
        try {
            return (LineItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.outposts.model.transform.LineItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
