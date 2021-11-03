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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/UpdateCallAnalyticsCategory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCallAnalyticsCategoryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The attributes describing the analytics category. You can see information such as the rules that you've used to
     * update the category and when the category was originally created.
     * </p>
     */
    private CategoryProperties categoryProperties;

    /**
     * <p>
     * The attributes describing the analytics category. You can see information such as the rules that you've used to
     * update the category and when the category was originally created.
     * </p>
     * 
     * @param categoryProperties
     *        The attributes describing the analytics category. You can see information such as the rules that you've
     *        used to update the category and when the category was originally created.
     */

    public void setCategoryProperties(CategoryProperties categoryProperties) {
        this.categoryProperties = categoryProperties;
    }

    /**
     * <p>
     * The attributes describing the analytics category. You can see information such as the rules that you've used to
     * update the category and when the category was originally created.
     * </p>
     * 
     * @return The attributes describing the analytics category. You can see information such as the rules that you've
     *         used to update the category and when the category was originally created.
     */

    public CategoryProperties getCategoryProperties() {
        return this.categoryProperties;
    }

    /**
     * <p>
     * The attributes describing the analytics category. You can see information such as the rules that you've used to
     * update the category and when the category was originally created.
     * </p>
     * 
     * @param categoryProperties
     *        The attributes describing the analytics category. You can see information such as the rules that you've
     *        used to update the category and when the category was originally created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCallAnalyticsCategoryResult withCategoryProperties(CategoryProperties categoryProperties) {
        setCategoryProperties(categoryProperties);
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
        if (getCategoryProperties() != null)
            sb.append("CategoryProperties: ").append(getCategoryProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCallAnalyticsCategoryResult == false)
            return false;
        UpdateCallAnalyticsCategoryResult other = (UpdateCallAnalyticsCategoryResult) obj;
        if (other.getCategoryProperties() == null ^ this.getCategoryProperties() == null)
            return false;
        if (other.getCategoryProperties() != null && other.getCategoryProperties().equals(this.getCategoryProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategoryProperties() == null) ? 0 : getCategoryProperties().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCallAnalyticsCategoryResult clone() {
        try {
            return (UpdateCallAnalyticsCategoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
