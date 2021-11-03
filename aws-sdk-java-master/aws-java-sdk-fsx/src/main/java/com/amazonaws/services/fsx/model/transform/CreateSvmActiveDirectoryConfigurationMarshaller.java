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
package com.amazonaws.services.fsx.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fsx.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateSvmActiveDirectoryConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateSvmActiveDirectoryConfigurationMarshaller {

    private static final MarshallingInfo<String> NETBIOSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetBiosName").build();
    private static final MarshallingInfo<StructuredPojo> SELFMANAGEDACTIVEDIRECTORYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelfManagedActiveDirectoryConfiguration").build();

    private static final CreateSvmActiveDirectoryConfigurationMarshaller instance = new CreateSvmActiveDirectoryConfigurationMarshaller();

    public static CreateSvmActiveDirectoryConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateSvmActiveDirectoryConfiguration createSvmActiveDirectoryConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (createSvmActiveDirectoryConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createSvmActiveDirectoryConfiguration.getNetBiosName(), NETBIOSNAME_BINDING);
            protocolMarshaller.marshall(createSvmActiveDirectoryConfiguration.getSelfManagedActiveDirectoryConfiguration(),
                    SELFMANAGEDACTIVEDIRECTORYCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
