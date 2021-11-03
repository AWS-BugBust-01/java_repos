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
package com.amazonaws.services.networkmanager.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.networkmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RouteAnalysisCompletionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RouteAnalysisCompletionMarshaller {

    private static final MarshallingInfo<String> RESULTCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResultCode").build();
    private static final MarshallingInfo<String> REASONCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReasonCode").build();
    private static final MarshallingInfo<Map> REASONCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ReasonContext").build();

    private static final RouteAnalysisCompletionMarshaller instance = new RouteAnalysisCompletionMarshaller();

    public static RouteAnalysisCompletionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RouteAnalysisCompletion routeAnalysisCompletion, ProtocolMarshaller protocolMarshaller) {

        if (routeAnalysisCompletion == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(routeAnalysisCompletion.getResultCode(), RESULTCODE_BINDING);
            protocolMarshaller.marshall(routeAnalysisCompletion.getReasonCode(), REASONCODE_BINDING);
            protocolMarshaller.marshall(routeAnalysisCompletion.getReasonContext(), REASONCONTEXT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
