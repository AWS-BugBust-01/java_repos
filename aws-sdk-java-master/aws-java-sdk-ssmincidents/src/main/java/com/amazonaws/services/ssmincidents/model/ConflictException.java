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
package com.amazonaws.services.ssmincidents.model;

import javax.annotation.Generated;

/**
 * <p>
 * Updating or deleting a resource causes an inconsistent state.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictException extends com.amazonaws.services.ssmincidents.model.AWSSSMIncidentsException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The identifier of the requested resource
     * </p>
     */
    private String resourceIdentifier;
    /**
     * <p>
     * The resource type
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * If present in the output, the operation can be retried after this time
     * </p>
     */
    private java.util.Date retryAfter;

    /**
     * Constructs a new ConflictException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public ConflictException(String message) {
        super(message);
    }

    /**
     * <p>
     * The identifier of the requested resource
     * </p>
     * 
     * @param resourceIdentifier
     *        The identifier of the requested resource
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceIdentifier")
    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * The identifier of the requested resource
     * </p>
     * 
     * @return The identifier of the requested resource
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceIdentifier")
    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * The identifier of the requested resource
     * </p>
     * 
     * @param resourceIdentifier
     *        The identifier of the requested resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * <p>
     * The resource type
     * </p>
     * 
     * @param resourceType
     *        The resource type
     * @see ResourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type
     * </p>
     * 
     * @return The resource type
     * @see ResourceType
     */

    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type
     * </p>
     * 
     * @param resourceType
     *        The resource type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ConflictException withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type
     * </p>
     * 
     * @param resourceType
     *        The resource type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ConflictException withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * If present in the output, the operation can be retried after this time
     * </p>
     * 
     * @param retryAfter
     *        If present in the output, the operation can be retried after this time
     */

    @com.fasterxml.jackson.annotation.JsonProperty("retryAfter")
    public void setRetryAfter(java.util.Date retryAfter) {
        this.retryAfter = retryAfter;
    }

    /**
     * <p>
     * If present in the output, the operation can be retried after this time
     * </p>
     * 
     * @return If present in the output, the operation can be retried after this time
     */

    @com.fasterxml.jackson.annotation.JsonProperty("retryAfter")
    public java.util.Date getRetryAfter() {
        return this.retryAfter;
    }

    /**
     * <p>
     * If present in the output, the operation can be retried after this time
     * </p>
     * 
     * @param retryAfter
     *        If present in the output, the operation can be retried after this time
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictException withRetryAfter(java.util.Date retryAfter) {
        setRetryAfter(retryAfter);
        return this;
    }

}
