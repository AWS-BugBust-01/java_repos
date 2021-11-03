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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Summary of ReadinessCheck status, paginated in GetRecoveryGroupReadinessSummary and GetCellReadinessSummary
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/ReadinessCheckSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReadinessCheckSummary implements Serializable, Cloneable, StructuredPojo {

    /** The readiness of this ReadinessCheck */
    private String readiness;
    /** The name of a ReadinessCheck which is part of the given RecoveryGroup or Cell */
    private String readinessCheckName;

    /**
     * The readiness of this ReadinessCheck
     * 
     * @param readiness
     *        The readiness of this ReadinessCheck
     * @see Readiness
     */

    public void setReadiness(String readiness) {
        this.readiness = readiness;
    }

    /**
     * The readiness of this ReadinessCheck
     * 
     * @return The readiness of this ReadinessCheck
     * @see Readiness
     */

    public String getReadiness() {
        return this.readiness;
    }

    /**
     * The readiness of this ReadinessCheck
     * 
     * @param readiness
     *        The readiness of this ReadinessCheck
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Readiness
     */

    public ReadinessCheckSummary withReadiness(String readiness) {
        setReadiness(readiness);
        return this;
    }

    /**
     * The readiness of this ReadinessCheck
     * 
     * @param readiness
     *        The readiness of this ReadinessCheck
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Readiness
     */

    public ReadinessCheckSummary withReadiness(Readiness readiness) {
        this.readiness = readiness.toString();
        return this;
    }

    /**
     * The name of a ReadinessCheck which is part of the given RecoveryGroup or Cell
     * 
     * @param readinessCheckName
     *        The name of a ReadinessCheck which is part of the given RecoveryGroup or Cell
     */

    public void setReadinessCheckName(String readinessCheckName) {
        this.readinessCheckName = readinessCheckName;
    }

    /**
     * The name of a ReadinessCheck which is part of the given RecoveryGroup or Cell
     * 
     * @return The name of a ReadinessCheck which is part of the given RecoveryGroup or Cell
     */

    public String getReadinessCheckName() {
        return this.readinessCheckName;
    }

    /**
     * The name of a ReadinessCheck which is part of the given RecoveryGroup or Cell
     * 
     * @param readinessCheckName
     *        The name of a ReadinessCheck which is part of the given RecoveryGroup or Cell
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReadinessCheckSummary withReadinessCheckName(String readinessCheckName) {
        setReadinessCheckName(readinessCheckName);
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
        if (getReadiness() != null)
            sb.append("Readiness: ").append(getReadiness()).append(",");
        if (getReadinessCheckName() != null)
            sb.append("ReadinessCheckName: ").append(getReadinessCheckName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReadinessCheckSummary == false)
            return false;
        ReadinessCheckSummary other = (ReadinessCheckSummary) obj;
        if (other.getReadiness() == null ^ this.getReadiness() == null)
            return false;
        if (other.getReadiness() != null && other.getReadiness().equals(this.getReadiness()) == false)
            return false;
        if (other.getReadinessCheckName() == null ^ this.getReadinessCheckName() == null)
            return false;
        if (other.getReadinessCheckName() != null && other.getReadinessCheckName().equals(this.getReadinessCheckName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReadiness() == null) ? 0 : getReadiness().hashCode());
        hashCode = prime * hashCode + ((getReadinessCheckName() == null) ? 0 : getReadinessCheckName().hashCode());
        return hashCode;
    }

    @Override
    public ReadinessCheckSummary clone() {
        try {
            return (ReadinessCheckSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoveryreadiness.model.transform.ReadinessCheckSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
