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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * The new Readiness Check values
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateReadinessCheck"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateReadinessCheckRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ReadinessCheck to update */
    private String readinessCheckName;
    /** The name of the ResourceSet to check */
    private String resourceSetName;

    /**
     * The ReadinessCheck to update
     * 
     * @param readinessCheckName
     *        The ReadinessCheck to update
     */

    public void setReadinessCheckName(String readinessCheckName) {
        this.readinessCheckName = readinessCheckName;
    }

    /**
     * The ReadinessCheck to update
     * 
     * @return The ReadinessCheck to update
     */

    public String getReadinessCheckName() {
        return this.readinessCheckName;
    }

    /**
     * The ReadinessCheck to update
     * 
     * @param readinessCheckName
     *        The ReadinessCheck to update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReadinessCheckRequest withReadinessCheckName(String readinessCheckName) {
        setReadinessCheckName(readinessCheckName);
        return this;
    }

    /**
     * The name of the ResourceSet to check
     * 
     * @param resourceSetName
     *        The name of the ResourceSet to check
     */

    public void setResourceSetName(String resourceSetName) {
        this.resourceSetName = resourceSetName;
    }

    /**
     * The name of the ResourceSet to check
     * 
     * @return The name of the ResourceSet to check
     */

    public String getResourceSetName() {
        return this.resourceSetName;
    }

    /**
     * The name of the ResourceSet to check
     * 
     * @param resourceSetName
     *        The name of the ResourceSet to check
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateReadinessCheckRequest withResourceSetName(String resourceSetName) {
        setResourceSetName(resourceSetName);
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
        if (getReadinessCheckName() != null)
            sb.append("ReadinessCheckName: ").append(getReadinessCheckName()).append(",");
        if (getResourceSetName() != null)
            sb.append("ResourceSetName: ").append(getResourceSetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateReadinessCheckRequest == false)
            return false;
        UpdateReadinessCheckRequest other = (UpdateReadinessCheckRequest) obj;
        if (other.getReadinessCheckName() == null ^ this.getReadinessCheckName() == null)
            return false;
        if (other.getReadinessCheckName() != null && other.getReadinessCheckName().equals(this.getReadinessCheckName()) == false)
            return false;
        if (other.getResourceSetName() == null ^ this.getResourceSetName() == null)
            return false;
        if (other.getResourceSetName() != null && other.getResourceSetName().equals(this.getResourceSetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReadinessCheckName() == null) ? 0 : getReadinessCheckName().hashCode());
        hashCode = prime * hashCode + ((getResourceSetName() == null) ? 0 : getResourceSetName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateReadinessCheckRequest clone() {
        return (UpdateReadinessCheckRequest) super.clone();
    }

}
