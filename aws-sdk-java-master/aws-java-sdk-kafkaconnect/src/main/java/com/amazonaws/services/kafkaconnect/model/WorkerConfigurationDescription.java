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
 * The description of the worker configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafkaconnect-2021-09-14/WorkerConfigurationDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkerConfigurationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The revision of the worker configuration.
     * </p>
     */
    private Long revision;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the worker configuration.
     * </p>
     */
    private String workerConfigurationArn;

    /**
     * <p>
     * The revision of the worker configuration.
     * </p>
     * 
     * @param revision
     *        The revision of the worker configuration.
     */

    public void setRevision(Long revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision of the worker configuration.
     * </p>
     * 
     * @return The revision of the worker configuration.
     */

    public Long getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The revision of the worker configuration.
     * </p>
     * 
     * @param revision
     *        The revision of the worker configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerConfigurationDescription withRevision(Long revision) {
        setRevision(revision);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the worker configuration.
     * </p>
     * 
     * @param workerConfigurationArn
     *        The Amazon Resource Name (ARN) of the worker configuration.
     */

    public void setWorkerConfigurationArn(String workerConfigurationArn) {
        this.workerConfigurationArn = workerConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the worker configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the worker configuration.
     */

    public String getWorkerConfigurationArn() {
        return this.workerConfigurationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the worker configuration.
     * </p>
     * 
     * @param workerConfigurationArn
     *        The Amazon Resource Name (ARN) of the worker configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerConfigurationDescription withWorkerConfigurationArn(String workerConfigurationArn) {
        setWorkerConfigurationArn(workerConfigurationArn);
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
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision()).append(",");
        if (getWorkerConfigurationArn() != null)
            sb.append("WorkerConfigurationArn: ").append(getWorkerConfigurationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkerConfigurationDescription == false)
            return false;
        WorkerConfigurationDescription other = (WorkerConfigurationDescription) obj;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getWorkerConfigurationArn() == null ^ this.getWorkerConfigurationArn() == null)
            return false;
        if (other.getWorkerConfigurationArn() != null && other.getWorkerConfigurationArn().equals(this.getWorkerConfigurationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode + ((getWorkerConfigurationArn() == null) ? 0 : getWorkerConfigurationArn().hashCode());
        return hashCode;
    }

    @Override
    public WorkerConfigurationDescription clone() {
        try {
            return (WorkerConfigurationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafkaconnect.model.transform.WorkerConfigurationDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
