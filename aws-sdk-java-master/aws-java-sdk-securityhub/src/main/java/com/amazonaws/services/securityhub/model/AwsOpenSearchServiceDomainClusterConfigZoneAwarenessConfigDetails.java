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
 * Configuration options for zone awareness.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of Availability Zones that the domain uses. Valid values are 2 and 3. The default is 2.
     * </p>
     */
    private Integer availabilityZoneCount;

    /**
     * <p>
     * The number of Availability Zones that the domain uses. Valid values are 2 and 3. The default is 2.
     * </p>
     * 
     * @param availabilityZoneCount
     *        The number of Availability Zones that the domain uses. Valid values are 2 and 3. The default is 2.
     */

    public void setAvailabilityZoneCount(Integer availabilityZoneCount) {
        this.availabilityZoneCount = availabilityZoneCount;
    }

    /**
     * <p>
     * The number of Availability Zones that the domain uses. Valid values are 2 and 3. The default is 2.
     * </p>
     * 
     * @return The number of Availability Zones that the domain uses. Valid values are 2 and 3. The default is 2.
     */

    public Integer getAvailabilityZoneCount() {
        return this.availabilityZoneCount;
    }

    /**
     * <p>
     * The number of Availability Zones that the domain uses. Valid values are 2 and 3. The default is 2.
     * </p>
     * 
     * @param availabilityZoneCount
     *        The number of Availability Zones that the domain uses. Valid values are 2 and 3. The default is 2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails withAvailabilityZoneCount(Integer availabilityZoneCount) {
        setAvailabilityZoneCount(availabilityZoneCount);
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
        if (getAvailabilityZoneCount() != null)
            sb.append("AvailabilityZoneCount: ").append(getAvailabilityZoneCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails == false)
            return false;
        AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails other = (AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails) obj;
        if (other.getAvailabilityZoneCount() == null ^ this.getAvailabilityZoneCount() == null)
            return false;
        if (other.getAvailabilityZoneCount() != null && other.getAvailabilityZoneCount().equals(this.getAvailabilityZoneCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailabilityZoneCount() == null) ? 0 : getAvailabilityZoneCount().hashCode());
        return hashCode;
    }

    @Override
    public AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails clone() {
        try {
            return (AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetailsMarshaller.getInstance().marshall(
                this, protocolMarshaller);
    }
}
