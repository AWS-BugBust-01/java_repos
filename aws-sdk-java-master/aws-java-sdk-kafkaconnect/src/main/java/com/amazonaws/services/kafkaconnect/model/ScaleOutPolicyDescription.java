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
package com.amazonaws.services.kafkaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The description of the scale-out policy for the connector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/ScaleOutPolicyDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScaleOutPolicyDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The CPU utilization percentage threshold at which you want connector scale out to be triggered.
     * </p>
     */
    private Integer cpuUtilizationPercentage;

    /**
     * <p>
     * The CPU utilization percentage threshold at which you want connector scale out to be triggered.
     * </p>
     * 
     * @param cpuUtilizationPercentage
     *        The CPU utilization percentage threshold at which you want connector scale out to be triggered.
     */

    public void setCpuUtilizationPercentage(Integer cpuUtilizationPercentage) {
        this.cpuUtilizationPercentage = cpuUtilizationPercentage;
    }

    /**
     * <p>
     * The CPU utilization percentage threshold at which you want connector scale out to be triggered.
     * </p>
     * 
     * @return The CPU utilization percentage threshold at which you want connector scale out to be triggered.
     */

    public Integer getCpuUtilizationPercentage() {
        return this.cpuUtilizationPercentage;
    }

    /**
     * <p>
     * The CPU utilization percentage threshold at which you want connector scale out to be triggered.
     * </p>
     * 
     * @param cpuUtilizationPercentage
     *        The CPU utilization percentage threshold at which you want connector scale out to be triggered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScaleOutPolicyDescription withCpuUtilizationPercentage(Integer cpuUtilizationPercentage) {
        setCpuUtilizationPercentage(cpuUtilizationPercentage);
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
        if (getCpuUtilizationPercentage() != null)
            sb.append("CpuUtilizationPercentage: ").append(getCpuUtilizationPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScaleOutPolicyDescription == false)
            return false;
        ScaleOutPolicyDescription other = (ScaleOutPolicyDescription) obj;
        if (other.getCpuUtilizationPercentage() == null ^ this.getCpuUtilizationPercentage() == null)
            return false;
        if (other.getCpuUtilizationPercentage() != null && other.getCpuUtilizationPercentage().equals(this.getCpuUtilizationPercentage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCpuUtilizationPercentage() == null) ? 0 : getCpuUtilizationPercentage().hashCode());
        return hashCode;
    }

    @Override
    public ScaleOutPolicyDescription clone() {
        try {
            return (ScaleOutPolicyDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafkaconnect.model.transform.ScaleOutPolicyDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
