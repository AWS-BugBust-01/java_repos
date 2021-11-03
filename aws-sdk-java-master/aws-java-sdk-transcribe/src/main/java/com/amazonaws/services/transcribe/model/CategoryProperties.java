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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains the rules and additional information about a call analytics category.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CategoryProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CategoryProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the call analytics category.
     * </p>
     */
    private String categoryName;
    /**
     * <p>
     * The rules used to create a call analytics category.
     * </p>
     */
    private java.util.List<Rule> rules;
    /**
     * <p>
     * A timestamp that shows when the call analytics category was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * A timestamp that shows when the call analytics category was most recently updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;

    /**
     * <p>
     * The name of the call analytics category.
     * </p>
     * 
     * @param categoryName
     *        The name of the call analytics category.
     */

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * <p>
     * The name of the call analytics category.
     * </p>
     * 
     * @return The name of the call analytics category.
     */

    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * <p>
     * The name of the call analytics category.
     * </p>
     * 
     * @param categoryName
     *        The name of the call analytics category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryProperties withCategoryName(String categoryName) {
        setCategoryName(categoryName);
        return this;
    }

    /**
     * <p>
     * The rules used to create a call analytics category.
     * </p>
     * 
     * @return The rules used to create a call analytics category.
     */

    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * The rules used to create a call analytics category.
     * </p>
     * 
     * @param rules
     *        The rules used to create a call analytics category.
     */

    public void setRules(java.util.Collection<Rule> rules) {
        if (rules == null) {
            this.rules = null;
            return;
        }

        this.rules = new java.util.ArrayList<Rule>(rules);
    }

    /**
     * <p>
     * The rules used to create a call analytics category.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        The rules used to create a call analytics category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryProperties withRules(Rule... rules) {
        if (this.rules == null) {
            setRules(new java.util.ArrayList<Rule>(rules.length));
        }
        for (Rule ele : rules) {
            this.rules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rules used to create a call analytics category.
     * </p>
     * 
     * @param rules
     *        The rules used to create a call analytics category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryProperties withRules(java.util.Collection<Rule> rules) {
        setRules(rules);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the call analytics category was created.
     * </p>
     * 
     * @param createTime
     *        A timestamp that shows when the call analytics category was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * A timestamp that shows when the call analytics category was created.
     * </p>
     * 
     * @return A timestamp that shows when the call analytics category was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * A timestamp that shows when the call analytics category was created.
     * </p>
     * 
     * @param createTime
     *        A timestamp that shows when the call analytics category was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryProperties withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that shows when the call analytics category was most recently updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        A timestamp that shows when the call analytics category was most recently updated.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * A timestamp that shows when the call analytics category was most recently updated.
     * </p>
     * 
     * @return A timestamp that shows when the call analytics category was most recently updated.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * A timestamp that shows when the call analytics category was most recently updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        A timestamp that shows when the call analytics category was most recently updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryProperties withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
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
        if (getCategoryName() != null)
            sb.append("CategoryName: ").append(getCategoryName()).append(",");
        if (getRules() != null)
            sb.append("Rules: ").append(getRules()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CategoryProperties == false)
            return false;
        CategoryProperties other = (CategoryProperties) obj;
        if (other.getCategoryName() == null ^ this.getCategoryName() == null)
            return false;
        if (other.getCategoryName() != null && other.getCategoryName().equals(this.getCategoryName()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategoryName() == null) ? 0 : getCategoryName().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public CategoryProperties clone() {
        try {
            return (CategoryProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.CategoryPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
