/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package software.amazon.awssdk.services.toolkittelemetry.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import software.amazon.awssdk.services.toolkittelemetry.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PostMetricsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PostMetricsRequestMarshaller {

    private static final MarshallingInfo<String> AWSPRODUCT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AWSProduct").build();
    private static final MarshallingInfo<String> AWSPRODUCTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AWSProductVersion").build();
    private static final MarshallingInfo<String> CLIENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ClientID").build();
    private static final MarshallingInfo<String> OS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OS").build();
    private static final MarshallingInfo<String> OSVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OSVersion").build();
    private static final MarshallingInfo<String> PARENTPRODUCT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParentProduct").build();
    private static final MarshallingInfo<String> PARENTPRODUCTVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParentProductVersion").build();
    private static final MarshallingInfo<List> METRICDATA_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("MetricData").build();

    private static final PostMetricsRequestMarshaller instance = new PostMetricsRequestMarshaller();

    public static PostMetricsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PostMetricsRequest postMetricsRequest, ProtocolMarshaller protocolMarshaller) {

        if (postMetricsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(postMetricsRequest.getAWSProduct(), AWSPRODUCT_BINDING);
            protocolMarshaller.marshall(postMetricsRequest.getAWSProductVersion(), AWSPRODUCTVERSION_BINDING);
            protocolMarshaller.marshall(postMetricsRequest.getClientID(), CLIENTID_BINDING);
            protocolMarshaller.marshall(postMetricsRequest.getOS(), OS_BINDING);
            protocolMarshaller.marshall(postMetricsRequest.getOSVersion(), OSVERSION_BINDING);
            protocolMarshaller.marshall(postMetricsRequest.getParentProduct(), PARENTPRODUCT_BINDING);
            protocolMarshaller.marshall(postMetricsRequest.getParentProductVersion(), PARENTPRODUCTVERSION_BINDING);
            protocolMarshaller.marshall(postMetricsRequest.getMetricData(), METRICDATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
