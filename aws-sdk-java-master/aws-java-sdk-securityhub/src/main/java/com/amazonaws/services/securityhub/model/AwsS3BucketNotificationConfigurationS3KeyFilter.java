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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details for an Amazon S3 filter.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsS3BucketNotificationConfigurationS3KeyFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsS3BucketNotificationConfigurationS3KeyFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The filter rules for the filter.
     * </p>
     */
    private java.util.List<AwsS3BucketNotificationConfigurationS3KeyFilterRule> filterRules;

    /**
     * <p>
     * The filter rules for the filter.
     * </p>
     * 
     * @return The filter rules for the filter.
     */

    public java.util.List<AwsS3BucketNotificationConfigurationS3KeyFilterRule> getFilterRules() {
        return filterRules;
    }

    /**
     * <p>
     * The filter rules for the filter.
     * </p>
     * 
     * @param filterRules
     *        The filter rules for the filter.
     */

    public void setFilterRules(java.util.Collection<AwsS3BucketNotificationConfigurationS3KeyFilterRule> filterRules) {
        if (filterRules == null) {
            this.filterRules = null;
            return;
        }

        this.filterRules = new java.util.ArrayList<AwsS3BucketNotificationConfigurationS3KeyFilterRule>(filterRules);
    }

    /**
     * <p>
     * The filter rules for the filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterRules(java.util.Collection)} or {@link #withFilterRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filterRules
     *        The filter rules for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketNotificationConfigurationS3KeyFilter withFilterRules(AwsS3BucketNotificationConfigurationS3KeyFilterRule... filterRules) {
        if (this.filterRules == null) {
            setFilterRules(new java.util.ArrayList<AwsS3BucketNotificationConfigurationS3KeyFilterRule>(filterRules.length));
        }
        for (AwsS3BucketNotificationConfigurationS3KeyFilterRule ele : filterRules) {
            this.filterRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filter rules for the filter.
     * </p>
     * 
     * @param filterRules
     *        The filter rules for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsS3BucketNotificationConfigurationS3KeyFilter withFilterRules(java.util.Collection<AwsS3BucketNotificationConfigurationS3KeyFilterRule> filterRules) {
        setFilterRules(filterRules);
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
        if (getFilterRules() != null)
            sb.append("FilterRules: ").append(getFilterRules());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsS3BucketNotificationConfigurationS3KeyFilter == false)
            return false;
        AwsS3BucketNotificationConfigurationS3KeyFilter other = (AwsS3BucketNotificationConfigurationS3KeyFilter) obj;
        if (other.getFilterRules() == null ^ this.getFilterRules() == null)
            return false;
        if (other.getFilterRules() != null && other.getFilterRules().equals(this.getFilterRules()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterRules() == null) ? 0 : getFilterRules().hashCode());
        return hashCode;
    }

    @Override
    public AwsS3BucketNotificationConfigurationS3KeyFilter clone() {
        try {
            return (AwsS3BucketNotificationConfigurationS3KeyFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsS3BucketNotificationConfigurationS3KeyFilterMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
