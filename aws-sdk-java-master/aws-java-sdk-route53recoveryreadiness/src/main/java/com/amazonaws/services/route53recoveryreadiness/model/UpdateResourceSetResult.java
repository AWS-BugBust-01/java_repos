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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateResourceSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResourceSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /** The arn for the ResourceSet */
    private String resourceSetArn;
    /** The name of the ResourceSet */
    private String resourceSetName;
    /** AWS Resource Type of the resources in the ResourceSet */
    private String resourceSetType;
    /** A list of Resource objects */
    private java.util.List<Resource> resources;

    private java.util.Map<String, String> tags;

    /**
     * The arn for the ResourceSet
     * 
     * @param resourceSetArn
     *        The arn for the ResourceSet
     */

    public void setResourceSetArn(String resourceSetArn) {
        this.resourceSetArn = resourceSetArn;
    }

    /**
     * The arn for the ResourceSet
     * 
     * @return The arn for the ResourceSet
     */

    public String getResourceSetArn() {
        return this.resourceSetArn;
    }

    /**
     * The arn for the ResourceSet
     * 
     * @param resourceSetArn
     *        The arn for the ResourceSet
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceSetResult withResourceSetArn(String resourceSetArn) {
        setResourceSetArn(resourceSetArn);
        return this;
    }

    /**
     * The name of the ResourceSet
     * 
     * @param resourceSetName
     *        The name of the ResourceSet
     */

    public void setResourceSetName(String resourceSetName) {
        this.resourceSetName = resourceSetName;
    }

    /**
     * The name of the ResourceSet
     * 
     * @return The name of the ResourceSet
     */

    public String getResourceSetName() {
        return this.resourceSetName;
    }

    /**
     * The name of the ResourceSet
     * 
     * @param resourceSetName
     *        The name of the ResourceSet
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceSetResult withResourceSetName(String resourceSetName) {
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

    public UpdateResourceSetResult withResourceSetType(String resourceSetType) {
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

    public UpdateResourceSetResult withResources(Resource... resources) {
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

    public UpdateResourceSetResult withResources(java.util.Collection<Resource> resources) {
        setResources(resources);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceSetResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see UpdateResourceSetResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceSetResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceSetResult clearTagsEntries() {
        this.tags = null;
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
        if (getResourceSetArn() != null)
            sb.append("ResourceSetArn: ").append(getResourceSetArn()).append(",");
        if (getResourceSetName() != null)
            sb.append("ResourceSetName: ").append(getResourceSetName()).append(",");
        if (getResourceSetType() != null)
            sb.append("ResourceSetType: ").append(getResourceSetType()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateResourceSetResult == false)
            return false;
        UpdateResourceSetResult other = (UpdateResourceSetResult) obj;
        if (other.getResourceSetArn() == null ^ this.getResourceSetArn() == null)
            return false;
        if (other.getResourceSetArn() != null && other.getResourceSetArn().equals(this.getResourceSetArn()) == false)
            return false;
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceSetArn() == null) ? 0 : getResourceSetArn().hashCode());
        hashCode = prime * hashCode + ((getResourceSetName() == null) ? 0 : getResourceSetName().hashCode());
        hashCode = prime * hashCode + ((getResourceSetType() == null) ? 0 : getResourceSetType().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResourceSetResult clone() {
        try {
            return (UpdateResourceSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
