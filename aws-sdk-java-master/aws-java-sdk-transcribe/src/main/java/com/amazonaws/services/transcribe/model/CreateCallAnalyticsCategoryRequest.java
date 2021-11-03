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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CreateCallAnalyticsCategory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCallAnalyticsCategoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name that you choose for your category when you create it.
     * </p>
     */
    private String categoryName;
    /**
     * <p>
     * To create a category, you must specify between 1 and 20 rules. For each rule, you specify a filter to be applied
     * to the attributes of the call. For example, you can specify a sentiment filter to detect if the customer's
     * sentiment was negative or neutral.
     * </p>
     */
    private java.util.List<Rule> rules;

    /**
     * <p>
     * The name that you choose for your category when you create it.
     * </p>
     * 
     * @param categoryName
     *        The name that you choose for your category when you create it.
     */

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * <p>
     * The name that you choose for your category when you create it.
     * </p>
     * 
     * @return The name that you choose for your category when you create it.
     */

    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * <p>
     * The name that you choose for your category when you create it.
     * </p>
     * 
     * @param categoryName
     *        The name that you choose for your category when you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCallAnalyticsCategoryRequest withCategoryName(String categoryName) {
        setCategoryName(categoryName);
        return this;
    }

    /**
     * <p>
     * To create a category, you must specify between 1 and 20 rules. For each rule, you specify a filter to be applied
     * to the attributes of the call. For example, you can specify a sentiment filter to detect if the customer's
     * sentiment was negative or neutral.
     * </p>
     * 
     * @return To create a category, you must specify between 1 and 20 rules. For each rule, you specify a filter to be
     *         applied to the attributes of the call. For example, you can specify a sentiment filter to detect if the
     *         customer's sentiment was negative or neutral.
     */

    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * <p>
     * To create a category, you must specify between 1 and 20 rules. For each rule, you specify a filter to be applied
     * to the attributes of the call. For example, you can specify a sentiment filter to detect if the customer's
     * sentiment was negative or neutral.
     * </p>
     * 
     * @param rules
     *        To create a category, you must specify between 1 and 20 rules. For each rule, you specify a filter to be
     *        applied to the attributes of the call. For example, you can specify a sentiment filter to detect if the
     *        customer's sentiment was negative or neutral.
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
     * To create a category, you must specify between 1 and 20 rules. For each rule, you specify a filter to be applied
     * to the attributes of the call. For example, you can specify a sentiment filter to detect if the customer's
     * sentiment was negative or neutral.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRules(java.util.Collection)} or {@link #withRules(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param rules
     *        To create a category, you must specify between 1 and 20 rules. For each rule, you specify a filter to be
     *        applied to the attributes of the call. For example, you can specify a sentiment filter to detect if the
     *        customer's sentiment was negative or neutral.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCallAnalyticsCategoryRequest withRules(Rule... rules) {
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
     * To create a category, you must specify between 1 and 20 rules. For each rule, you specify a filter to be applied
     * to the attributes of the call. For example, you can specify a sentiment filter to detect if the customer's
     * sentiment was negative or neutral.
     * </p>
     * 
     * @param rules
     *        To create a category, you must specify between 1 and 20 rules. For each rule, you specify a filter to be
     *        applied to the attributes of the call. For example, you can specify a sentiment filter to detect if the
     *        customer's sentiment was negative or neutral.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCallAnalyticsCategoryRequest withRules(java.util.Collection<Rule> rules) {
        setRules(rules);
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
            sb.append("Rules: ").append(getRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCallAnalyticsCategoryRequest == false)
            return false;
        CreateCallAnalyticsCategoryRequest other = (CreateCallAnalyticsCategoryRequest) obj;
        if (other.getCategoryName() == null ^ this.getCategoryName() == null)
            return false;
        if (other.getCategoryName() != null && other.getCategoryName().equals(this.getCategoryName()) == false)
            return false;
        if (other.getRules() == null ^ this.getRules() == null)
            return false;
        if (other.getRules() != null && other.getRules().equals(this.getRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategoryName() == null) ? 0 : getCategoryName().hashCode());
        hashCode = prime * hashCode + ((getRules() == null) ? 0 : getRules().hashCode());
        return hashCode;
    }

    @Override
    public CreateCallAnalyticsCategoryRequest clone() {
        return (CreateCallAnalyticsCategoryRequest) super.clone();
    }

}
