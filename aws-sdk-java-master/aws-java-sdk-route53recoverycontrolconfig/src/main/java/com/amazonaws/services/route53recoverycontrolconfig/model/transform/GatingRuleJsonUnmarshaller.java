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
package com.amazonaws.services.route53recoverycontrolconfig.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.route53recoverycontrolconfig.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GatingRule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatingRuleJsonUnmarshaller implements Unmarshaller<GatingRule, JsonUnmarshallerContext> {

    public GatingRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        GatingRule gatingRule = new GatingRule();

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
                if (context.testExpression("ControlPanelArn", targetDepth)) {
                    context.nextToken();
                    gatingRule.setControlPanelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GatingControls", targetDepth)) {
                    context.nextToken();
                    gatingRule.setGatingControls(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    gatingRule.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RuleConfig", targetDepth)) {
                    context.nextToken();
                    gatingRule.setRuleConfig(RuleConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SafetyRuleArn", targetDepth)) {
                    context.nextToken();
                    gatingRule.setSafetyRuleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    gatingRule.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetControls", targetDepth)) {
                    context.nextToken();
                    gatingRule.setTargetControls(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("WaitPeriodMs", targetDepth)) {
                    context.nextToken();
                    gatingRule.setWaitPeriodMs(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return gatingRule;
    }

    private static GatingRuleJsonUnmarshaller instance;

    public static GatingRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GatingRuleJsonUnmarshaller();
        return instance;
    }
}
