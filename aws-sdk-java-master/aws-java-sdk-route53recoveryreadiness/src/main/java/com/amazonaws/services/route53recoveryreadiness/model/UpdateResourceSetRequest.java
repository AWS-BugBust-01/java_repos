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
 * configuration for the desired
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateResourceSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResourceSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ResourceSet to update */
    private String resourceSetName;
    /** AWS Resource Type of the resources in the ResourceSet */
    private String resourceSetType;
    /** A list of Resource objects */
    private java.util.List<Resource> resources;

    /**
     * The ResourceSet to update
     * 
     * @param resourceSetName
     *        The ResourceSet to update
     */

    public void setResourceSetName(String resourceSetName) {
        this.resourceSetName = resourceSetName;
    }

    /**
     * The ResourceSet to update
     * 
     * @return The ResourceSet to update
     */

    public String getResourceSetName() {
        return this.resourceSetName;
    }

    /**
     * The ResourceSet to update
     * 
     * @param resourceSetName
     *        The ResourceSet to update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceSetRequest withResourceSetName(String resourceSetName) {
        setResourceSetName(resourceSetName);
        return this;
    }

    /**
     * AWS Resource Type of the resources in the ResourceSet
     * 
     * @param resourceSetType
     *        AWS Resource Type of the resources in the ResourceSet
     */

    public void setResourceSetType(String resourceSetType) {
        this.resourceSetType = resourceSetType;
    }

    /**
     * AWS Resource Type of the resources in the ResourceSet
     * 
     * @return AWS Resource Type of the resources in the ResourceSet
     */

    public String getResourceSetType() {
        return this.resourceSetType;
    }

    /**
     * AWS Resource Type of the resources in the ResourceSet
     * 
     * @param resourceSetType
     *        AWS Resource Type of the resources in the ResourceSet
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceSetRequest withResourceSetType(String resourceSetType) {
        setResourceSetType(resourceSetType);
        return this;
    }

    /**
     * A list of Resource objects
     * 
     * @return A list of Resource objects
     */

    public java.util.List<Resource> getResources() {
        return resources;
    }

    /**
     * A list of Resource objects
     * 
     * @param resources
     *        A list of Resource objects
     */

    public void setResources(java.util.Collection<Resource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<Resource>(resources);
    }

    /**
     * A list of Resource objects
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        A list of Resource objects
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceSetRequest withResources(Resource... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<Resource>(resources.length));
        }
        for (Resource ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * A list of Resource objects
     * 
     * @param resources
     *        A list of Resource objects
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceSetRequest withResources(java.util.Collection<Resource> resources) {
        setResources(resources);
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
        if (getResourceSetName() != null)
            sb.append("ResourceSetName: ").append(getResourceSetName()).append(",");
        if (getResourceSetType() != null)
            sb.append("ResourceSetType: ").append(getResourceSetType()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateResourceSetRequest == false)
            return false;
        UpdateResourceSetRequest other = (UpdateResourceSetRequest) obj;
        if (other.getResourceSetName() == null ^ this.getResourceSetName() == null)
            return false;
        if (other.getResourceSetName() != null && other.getResourceSetName().equals(this.getResourceSetName()) == false)
            return false;
        if (other.getResourceSetType() == null ^ this.getResourceSetType() == null)
            return false;
        if (other.getResourceSetType() != null && other.getResourceSetType().equals(this.getResourceSetType()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceSetName() == null) ? 0 : getResourceSetName().hashCode());
        hashCode = prime * hashCode + ((getResourceSetType() == null) ? 0 : getResourceSetType().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResourceSetRequest clone() {
        return (UpdateResourceSetRequest) super.clone();
    }

}
