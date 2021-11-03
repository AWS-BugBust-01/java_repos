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
package com.amazonaws.services.lexmodelsv2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lexmodelsv2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PostFulfillmentStatusSpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PostFulfillmentStatusSpecificationMarshaller {

    private static final MarshallingInfo<StructuredPojo> SUCCESSRESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("successResponse").build();
    private static final MarshallingInfo<StructuredPojo> FAILURERESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("failureResponse").build();
    private static final MarshallingInfo<StructuredPojo> TIMEOUTRESPONSE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("timeoutResponse").build();

    private static final PostFulfillmentStatusSpecificationMarshaller instance = new PostFulfillmentStatusSpecificationMarshaller();

    public static PostFulfillmentStatusSpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PostFulfillmentStatusSpecification postFulfillmentStatusSpecification, ProtocolMarshaller protocolMarshaller) {

        if (postFulfillmentStatusSpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(postFulfillmentStatusSpecification.getSuccessResponse(), SUCCESSRESPONSE_BINDING);
            protocolMarshaller.marshall(postFulfillmentStatusSpecification.getFailureResponse(), FAILURERESPONSE_BINDING);
            protocolMarshaller.marshall(postFulfillmentStatusSpecification.getTimeoutResponse(), TIMEOUTRESPONSE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
