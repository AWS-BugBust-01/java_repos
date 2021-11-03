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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RStudioServerProDomainSettingsForUpdateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RStudioServerProDomainSettingsForUpdateMarshaller {

    private static final MarshallingInfo<String> DOMAINEXECUTIONROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainExecutionRoleArn").build();
    private static final MarshallingInfo<StructuredPojo> DEFAULTRESOURCESPEC_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DefaultResourceSpec").build();

    private static final RStudioServerProDomainSettingsForUpdateMarshaller instance = new RStudioServerProDomainSettingsForUpdateMarshaller();

    public static RStudioServerProDomainSettingsForUpdateMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RStudioServerProDomainSettingsForUpdate rStudioServerProDomainSettingsForUpdate, ProtocolMarshaller protocolMarshaller) {

        if (rStudioServerProDomainSettingsForUpdate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(rStudioServerProDomainSettingsForUpdate.getDomainExecutionRoleArn(), DOMAINEXECUTIONROLEARN_BINDING);
            protocolMarshaller.marshall(rStudioServerProDomainSettingsForUpdate.getDefaultResourceSpec(), DEFAULTRESOURCESPEC_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
