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
package com.amazonaws.services.cloudcontrolapi;

import javax.annotation.Generated;

import com.amazonaws.services.cloudcontrolapi.model.*;
import com.amazonaws.*;
import com.amazonaws.services.cloudcontrolapi.waiters.AWSCloudControlApiWaiters;

/**
 * Abstract implementation of {@code AWSCloudControlApi}. Convenient method forms pass through to the corresponding
 * overload that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCloudControlApi implements AWSCloudControlApi {

    protected AbstractAWSCloudControlApi() {
    }

    @Override
    public CancelResourceRequestResult cancelResourceRequest(CancelResourceRequestRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateResourceResult createResource(CreateResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteResourceResult deleteResource(DeleteResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetResourceResult getResource(GetResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetResourceRequestStatusResult getResourceRequestStatus(GetResourceRequestStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListResourceRequestsResult listResourceRequests(ListResourceRequestsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListResourcesResult listResources(ListResourcesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateResourceResult updateResource(UpdateResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AWSCloudControlApiWaiters waiters() {
        throw new java.lang.UnsupportedOperationException();
    }

}
