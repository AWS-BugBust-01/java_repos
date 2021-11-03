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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the last time an access key was used.
 * </p>
 * <note>
 * <p>
 * This object does not include data in the response of a <a>CreateBucketAccessKey</a> action.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/AccessKeyLastUsed" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessKeyLastUsed implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time when the access key was most recently used.
     * </p>
     * <p>
     * This value is null if the access key has not been used.
     * </p>
     */
    private java.util.Date lastUsedDate;
    /**
     * <p>
     * The AWS Region where this access key was most recently used.
     * </p>
     * <p>
     * This value is <code>N/A</code> if the access key has not been used.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The name of the AWS service with which this access key was most recently used.
     * </p>
     * <p>
     * This value is <code>N/A</code> if the access key has not been used.
     * </p>
     */
    private String serviceName;

    /**
     * <p>
     * The date and time when the access key was most recently used.
     * </p>
     * <p>
     * This value is null if the access key has not been used.
     * </p>
     * 
     * @param lastUsedDate
     *        The date and time when the access key was most recently used.</p>
     *        <p>
     *        This value is null if the access key has not been used.
     */

    public void setLastUsedDate(java.util.Date lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }

    /**
     * <p>
     * The date and time when the access key was most recently used.
     * </p>
     * <p>
     * This value is null if the access key has not been used.
     * </p>
     * 
     * @return The date and time when the access key was most recently used.</p>
     *         <p>
     *         This value is null if the access key has not been used.
     */

    public java.util.Date getLastUsedDate() {
        return this.lastUsedDate;
    }

    /**
     * <p>
     * The date and time when the access key was most recently used.
     * </p>
     * <p>
     * This value is null if the access key has not been used.
     * </p>
     * 
     * @param lastUsedDate
     *        The date and time when the access key was most recently used.</p>
     *        <p>
     *        This value is null if the access key has not been used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessKeyLastUsed withLastUsedDate(java.util.Date lastUsedDate) {
        setLastUsedDate(lastUsedDate);
        return this;
    }

    /**
     * <p>
     * The AWS Region where this access key was most recently used.
     * </p>
     * <p>
     * This value is <code>N/A</code> if the access key has not been used.
     * </p>
     * 
     * @param region
     *        The AWS Region where this access key was most recently used.</p>
     *        <p>
     *        This value is <code>N/A</code> if the access key has not been used.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region where this access key was most recently used.
     * </p>
     * <p>
     * This value is <code>N/A</code> if the access key has not been used.
     * </p>
     * 
     * @return The AWS Region where this access key was most recently used.</p>
     *         <p>
     *         This value is <code>N/A</code> if the access key has not been used.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS Region where this access key was most recently used.
     * </p>
     * <p>
     * This value is <code>N/A</code> if the access key has not been used.
     * </p>
     * 
     * @param region
     *        The AWS Region where this access key was most recently used.</p>
     *        <p>
     *        This value is <code>N/A</code> if the access key has not been used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessKeyLastUsed withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The name of the AWS service with which this access key was most recently used.
     * </p>
     * <p>
     * This value is <code>N/A</code> if the access key has not been used.
     * </p>
     * 
     * @param serviceName
     *        The name of the AWS service with which this access key was most recently used.</p>
     *        <p>
     *        This value is <code>N/A</code> if the access key has not been used.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the AWS service with which this access key was most recently used.
     * </p>
     * <p>
     * This value is <code>N/A</code> if the access key has not been used.
     * </p>
     * 
     * @return The name of the AWS service with which this access key was most recently used.</p>
     *         <p>
     *         This value is <code>N/A</code> if the access key has not been used.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the AWS service with which this access key was most recently used.
     * </p>
     * <p>
     * This value is <code>N/A</code> if the access key has not been used.
     * </p>
     * 
     * @param serviceName
     *        The name of the AWS service with which this access key was most recently used.</p>
     *        <p>
     *        This value is <code>N/A</code> if the access key has not been used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessKeyLastUsed withServiceName(String serviceName) {
        setServiceName(serviceName);
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
        if (getLastUsedDate() != null)
            sb.append("LastUsedDate: ").append(getLastUsedDate()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessKeyLastUsed == false)
            return false;
        AccessKeyLastUsed other = (AccessKeyLastUsed) obj;
        if (other.getLastUsedDate() == null ^ this.getLastUsedDate() == null)
            return false;
        if (other.getLastUsedDate() != null && other.getLastUsedDate().equals(this.getLastUsedDate()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastUsedDate() == null) ? 0 : getLastUsedDate().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        return hashCode;
    }

    @Override
    public AccessKeyLastUsed clone() {
        try {
            return (AccessKeyLastUsed) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.AccessKeyLastUsedMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
