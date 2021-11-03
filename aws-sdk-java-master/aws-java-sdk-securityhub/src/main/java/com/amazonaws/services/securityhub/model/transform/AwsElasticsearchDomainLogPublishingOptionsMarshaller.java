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
package com.amazonaws.services.securityhub.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsElasticsearchDomainLogPublishingOptionsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsElasticsearchDomainLogPublishingOptionsMarshaller {

    private static final MarshallingInfo<StructuredPojo> INDEXSLOWLOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("IndexSlowLogs").build();
    private static final MarshallingInfo<StructuredPojo> SEARCHSLOWLOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SearchSlowLogs").build();
    private static final MarshallingInfo<StructuredPojo> AUDITLOGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AuditLogs").build();

    private static final AwsElasticsearchDomainLogPublishingOptionsMarshaller instance = new AwsElasticsearchDomainLogPublishingOptionsMarshaller();

    public static AwsElasticsearchDomainLogPublishingOptionsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsElasticsearchDomainLogPublishingOptions awsElasticsearchDomainLogPublishingOptions, ProtocolMarshaller protocolMarshaller) {

        if (awsElasticsearchDomainLogPublishingOptions == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsElasticsearchDomainLogPublishingOptions.getIndexSlowLogs(), INDEXSLOWLOGS_BINDING);
            protocolMarshaller.marshall(awsElasticsearchDomainLogPublishingOptions.getSearchSlowLogs(), SEARCHSLOWLOGS_BINDING);
            protocolMarshaller.marshall(awsElasticsearchDomainLogPublishingOptions.getAuditLogs(), AUDITLOGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
