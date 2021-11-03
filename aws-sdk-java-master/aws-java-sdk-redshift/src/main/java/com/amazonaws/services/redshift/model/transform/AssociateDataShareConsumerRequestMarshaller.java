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
package com.amazonaws.services.redshift.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * AssociateDataShareConsumerRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateDataShareConsumerRequestMarshaller implements Marshaller<Request<AssociateDataShareConsumerRequest>, AssociateDataShareConsumerRequest> {

    public Request<AssociateDataShareConsumerRequest> marshall(AssociateDataShareConsumerRequest associateDataShareConsumerRequest) {

        if (associateDataShareConsumerRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<AssociateDataShareConsumerRequest> request = new DefaultRequest<AssociateDataShareConsumerRequest>(associateDataShareConsumerRequest,
                "AmazonRedshift");
        request.addParameter("Action", "AssociateDataShareConsumer");
        request.addParameter("Version", "2012-12-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (associateDataShareConsumerRequest.getDataShareArn() != null) {
            request.addParameter("DataShareArn", StringUtils.fromString(associateDataShareConsumerRequest.getDataShareArn()));
        }

        if (associateDataShareConsumerRequest.getAssociateEntireAccount() != null) {
            request.addParameter("AssociateEntireAccount", StringUtils.fromBoolean(associateDataShareConsumerRequest.getAssociateEntireAccount()));
        }

        if (associateDataShareConsumerRequest.getConsumerArn() != null) {
            request.addParameter("ConsumerArn", StringUtils.fromString(associateDataShareConsumerRequest.getConsumerArn()));
        }

        return request;
    }

}
