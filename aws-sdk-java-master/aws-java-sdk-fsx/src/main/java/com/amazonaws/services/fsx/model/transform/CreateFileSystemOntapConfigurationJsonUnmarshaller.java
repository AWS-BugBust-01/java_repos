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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateFileSystemOntapConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFileSystemOntapConfigurationJsonUnmarshaller implements Unmarshaller<CreateFileSystemOntapConfiguration, JsonUnmarshallerContext> {

    public CreateFileSystemOntapConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateFileSystemOntapConfiguration createFileSystemOntapConfiguration = new CreateFileSystemOntapConfiguration();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AutomaticBackupRetentionDays", targetDepth)) {
                    context.nextToken();
                    createFileSystemOntapConfiguration.setAutomaticBackupRetentionDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DailyAutomaticBackupStartTime", targetDepth)) {
                    context.nextToken();
                    createFileSystemOntapConfiguration.setDailyAutomaticBackupStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeploymentType", targetDepth)) {
                    context.nextToken();
                    createFileSystemOntapConfiguration.setDeploymentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointIpAddressRange", targetDepth)) {
                    context.nextToken();
                    createFileSystemOntapConfiguration.setEndpointIpAddressRange(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FsxAdminPassword", targetDepth)) {
                    context.nextToken();
                    createFileSystemOntapConfiguration.setFsxAdminPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DiskIopsConfiguration", targetDepth)) {
                    context.nextToken();
                    createFileSystemOntapConfiguration.setDiskIopsConfiguration(DiskIopsConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PreferredSubnetId", targetDepth)) {
                    context.nextToken();
                    createFileSystemOntapConfiguration.setPreferredSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RouteTableIds", targetDepth)) {
                    context.nextToken();
                    createFileSystemOntapConfiguration.setRouteTableIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ThroughputCapacity", targetDepth)) {
                    context.nextToken();
                    createFileSystemOntapConfiguration.setThroughputCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("WeeklyMaintenanceStartTime", targetDepth)) {
                    context.nextToken();
                    createFileSystemOntapConfiguration.setWeeklyMaintenanceStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createFileSystemOntapConfiguration;
    }

    private static CreateFileSystemOntapConfigurationJsonUnmarshaller instance;

    public static CreateFileSystemOntapConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateFileSystemOntapConfigurationJsonUnmarshaller();
        return instance;
    }
}
