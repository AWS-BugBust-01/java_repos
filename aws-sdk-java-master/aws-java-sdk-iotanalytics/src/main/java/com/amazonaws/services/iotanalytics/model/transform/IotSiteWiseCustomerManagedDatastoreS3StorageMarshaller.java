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
package com.amazonaws.services.iotanalytics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iotanalytics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IotSiteWiseCustomerManagedDatastoreS3StorageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IotSiteWiseCustomerManagedDatastoreS3StorageMarshaller {

    private static final MarshallingInfo<String> BUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("bucket").build();
    private static final MarshallingInfo<String> KEYPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("keyPrefix").build();

    private static final IotSiteWiseCustomerManagedDatastoreS3StorageMarshaller instance = new IotSiteWiseCustomerManagedDatastoreS3StorageMarshaller();

    public static IotSiteWiseCustomerManagedDatastoreS3StorageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IotSiteWiseCustomerManagedDatastoreS3Storage iotSiteWiseCustomerManagedDatastoreS3Storage, ProtocolMarshaller protocolMarshaller) {

        if (iotSiteWiseCustomerManagedDatastoreS3Storage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(iotSiteWiseCustomerManagedDatastoreS3Storage.getBucket(), BUCKET_BINDING);
            protocolMarshaller.marshall(iotSiteWiseCustomerManagedDatastoreS3Storage.getKeyPrefix(), KEYPREFIX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
