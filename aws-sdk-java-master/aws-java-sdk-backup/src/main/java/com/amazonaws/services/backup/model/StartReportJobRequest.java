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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/StartReportJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartReportJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of a report plan.
     * </p>
     */
    private String reportPlanName;
    /**
     * <p>
     * A customer-chosen string that you can use to distinguish between otherwise identical calls to
     * <code>StartReportJobInput</code>. Retrying a successful request with the same idempotency token results in a
     * success message with no action taken.
     * </p>
     */
    private String idempotencyToken;

    /**
     * <p>
     * The unique name of a report plan.
     * </p>
     * 
     * @param reportPlanName
     *        The unique name of a report plan.
     */

    public void setReportPlanName(String reportPlanName) {
        this.reportPlanName = reportPlanName;
    }

    /**
     * <p>
     * The unique name of a report plan.
     * </p>
     * 
     * @return The unique name of a report plan.
     */

    public String getReportPlanName() {
        return this.reportPlanName;
    }

    /**
     * <p>
     * The unique name of a report plan.
     * </p>
     * 
     * @param reportPlanName
     *        The unique name of a report plan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReportJobRequest withReportPlanName(String reportPlanName) {
        setReportPlanName(reportPlanName);
        return this;
    }

    /**
     * <p>
     * A customer-chosen string that you can use to distinguish between otherwise identical calls to
     * <code>StartReportJobInput</code>. Retrying a successful request with the same idempotency token results in a
     * success message with no action taken.
     * </p>
     * 
     * @param idempotencyToken
     *        A customer-chosen string that you can use to distinguish between otherwise identical calls to
     *        <code>StartReportJobInput</code>. Retrying a successful request with the same idempotency token results in
     *        a success message with no action taken.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * A customer-chosen string that you can use to distinguish between otherwise identical calls to
     * <code>StartReportJobInput</code>. Retrying a successful request with the same idempotency token results in a
     * success message with no action taken.
     * </p>
     * 
     * @return A customer-chosen string that you can use to distinguish between otherwise identical calls to
     *         <code>StartReportJobInput</code>. Retrying a successful request with the same idempotency token results
     *         in a success message with no action taken.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * A customer-chosen string that you can use to distinguish between otherwise identical calls to
     * <code>StartReportJobInput</code>. Retrying a successful request with the same idempotency token results in a
     * success message with no action taken.
     * </p>
     * 
     * @param idempotencyToken
     *        A customer-chosen string that you can use to distinguish between otherwise identical calls to
     *        <code>StartReportJobInput</code>. Retrying a successful request with the same idempotency token results in
     *        a success message with no action taken.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartReportJobRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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
        if (getReportPlanName() != null)
            sb.append("ReportPlanName: ").append(getReportPlanName()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartReportJobRequest == false)
            return false;
        StartReportJobRequest other = (StartReportJobRequest) obj;
        if (other.getReportPlanName() == null ^ this.getReportPlanName() == null)
            return false;
        if (other.getReportPlanName() != null && other.getReportPlanName().equals(this.getReportPlanName()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportPlanName() == null) ? 0 : getReportPlanName().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        return hashCode;
    }

    @Override
    public StartReportJobRequest clone() {
        return (StartReportJobRequest) super.clone();
    }

}
