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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Breakdown of detected information, seperated into the catagories Type, LableDetection, and ValueDetection
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/ExpenseField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExpenseField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The implied label of a detected element. Present alongside LabelDetection for explicit elements.
     * </p>
     */
    private ExpenseType type;
    /**
     * <p>
     * The explicitly stated label of a detected element.
     * </p>
     */
    private ExpenseDetection labelDetection;
    /**
     * <p>
     * The value of a detected element. Present in explicit and implicit elements.
     * </p>
     */
    private ExpenseDetection valueDetection;
    /**
     * <p>
     * The page number the value was detected on.
     * </p>
     */
    private Integer pageNumber;

    /**
     * <p>
     * The implied label of a detected element. Present alongside LabelDetection for explicit elements.
     * </p>
     * 
     * @param type
     *        The implied label of a detected element. Present alongside LabelDetection for explicit elements.
     */

    public void setType(ExpenseType type) {
        this.type = type;
    }

    /**
     * <p>
     * The implied label of a detected element. Present alongside LabelDetection for explicit elements.
     * </p>
     * 
     * @return The implied label of a detected element. Present alongside LabelDetection for explicit elements.
     */

    public ExpenseType getType() {
        return this.type;
    }

    /**
     * <p>
     * The implied label of a detected element. Present alongside LabelDetection for explicit elements.
     * </p>
     * 
     * @param type
     *        The implied label of a detected element. Present alongside LabelDetection for explicit elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpenseField withType(ExpenseType type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The explicitly stated label of a detected element.
     * </p>
     * 
     * @param labelDetection
     *        The explicitly stated label of a detected element.
     */

    public void setLabelDetection(ExpenseDetection labelDetection) {
        this.labelDetection = labelDetection;
    }

    /**
     * <p>
     * The explicitly stated label of a detected element.
     * </p>
     * 
     * @return The explicitly stated label of a detected element.
     */

    public ExpenseDetection getLabelDetection() {
        return this.labelDetection;
    }

    /**
     * <p>
     * The explicitly stated label of a detected element.
     * </p>
     * 
     * @param labelDetection
     *        The explicitly stated label of a detected element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpenseField withLabelDetection(ExpenseDetection labelDetection) {
        setLabelDetection(labelDetection);
        return this;
    }

    /**
     * <p>
     * The value of a detected element. Present in explicit and implicit elements.
     * </p>
     * 
     * @param valueDetection
     *        The value of a detected element. Present in explicit and implicit elements.
     */

    public void setValueDetection(ExpenseDetection valueDetection) {
        this.valueDetection = valueDetection;
    }

    /**
     * <p>
     * The value of a detected element. Present in explicit and implicit elements.
     * </p>
     * 
     * @return The value of a detected element. Present in explicit and implicit elements.
     */

    public ExpenseDetection getValueDetection() {
        return this.valueDetection;
    }

    /**
     * <p>
     * The value of a detected element. Present in explicit and implicit elements.
     * </p>
     * 
     * @param valueDetection
     *        The value of a detected element. Present in explicit and implicit elements.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpenseField withValueDetection(ExpenseDetection valueDetection) {
        setValueDetection(valueDetection);
        return this;
    }

    /**
     * <p>
     * The page number the value was detected on.
     * </p>
     * 
     * @param pageNumber
     *        The page number the value was detected on.
     */

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * <p>
     * The page number the value was detected on.
     * </p>
     * 
     * @return The page number the value was detected on.
     */

    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * <p>
     * The page number the value was detected on.
     * </p>
     * 
     * @param pageNumber
     *        The page number the value was detected on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExpenseField withPageNumber(Integer pageNumber) {
        setPageNumber(pageNumber);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getLabelDetection() != null)
            sb.append("LabelDetection: ").append(getLabelDetection()).append(",");
        if (getValueDetection() != null)
            sb.append("ValueDetection: ").append(getValueDetection()).append(",");
        if (getPageNumber() != null)
            sb.append("PageNumber: ").append(getPageNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExpenseField == false)
            return false;
        ExpenseField other = (ExpenseField) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getLabelDetection() == null ^ this.getLabelDetection() == null)
            return false;
        if (other.getLabelDetection() != null && other.getLabelDetection().equals(this.getLabelDetection()) == false)
            return false;
        if (other.getValueDetection() == null ^ this.getValueDetection() == null)
            return false;
        if (other.getValueDetection() != null && other.getValueDetection().equals(this.getValueDetection()) == false)
            return false;
        if (other.getPageNumber() == null ^ this.getPageNumber() == null)
            return false;
        if (other.getPageNumber() != null && other.getPageNumber().equals(this.getPageNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getLabelDetection() == null) ? 0 : getLabelDetection().hashCode());
        hashCode = prime * hashCode + ((getValueDetection() == null) ? 0 : getValueDetection().hashCode());
        hashCode = prime * hashCode + ((getPageNumber() == null) ? 0 : getPageNumber().hashCode());
        return hashCode;
    }

    @Override
    public ExpenseField clone() {
        try {
            return (ExpenseField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.ExpenseFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
