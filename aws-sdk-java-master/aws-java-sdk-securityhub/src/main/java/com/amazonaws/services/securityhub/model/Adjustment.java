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
 * An adjustment to the CVSS metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/Adjustment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Adjustment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metric to adjust.
     * </p>
     */
    private String metric;
    /**
     * <p>
     * The reason for the adjustment.
     * </p>
     */
    private String reason;

    /**
     * <p>
     * The metric to adjust.
     * </p>
     * 
     * @param metric
     *        The metric to adjust.
     */

    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * The metric to adjust.
     * </p>
     * 
     * @return The metric to adjust.
     */

    public String getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * The metric to adjust.
     * </p>
     * 
     * @param metric
     *        The metric to adjust.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Adjustment withMetric(String metric) {
        setMetric(metric);
        return this;
    }

    /**
     * <p>
     * The reason for the adjustment.
     * </p>
     * 
     * @param reason
     *        The reason for the adjustment.
     */

    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the adjustment.
     * </p>
     * 
     * @return The reason for the adjustment.
     */

    public String getReason() {
        return this.reason;
    }

    /**
     * <p>
     * The reason for the adjustment.
     * </p>
     * 
     * @param reason
     *        The reason for the adjustment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Adjustment withReason(String reason) {
        setReason(reason);
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
        if (getMetric() != null)
            sb.append("Metric: ").append(getMetric()).append(",");
        if (getReason() != null)
            sb.append("Reason: ").append(getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Adjustment == false)
            return false;
        Adjustment other = (Adjustment) obj;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public Adjustment clone() {
        try {
            return (Adjustment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AdjustmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
