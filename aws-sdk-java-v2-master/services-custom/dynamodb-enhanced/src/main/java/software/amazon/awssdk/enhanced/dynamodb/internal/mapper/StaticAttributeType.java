/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package software.amazon.awssdk.enhanced.dynamodb.internal.mapper;

import software.amazon.awssdk.annotations.SdkInternalApi;
import software.amazon.awssdk.enhanced.dynamodb.AttributeConverter;
import software.amazon.awssdk.enhanced.dynamodb.AttributeValueType;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

@SdkInternalApi
public final class StaticAttributeType<T> implements AttributeType<T> {
    private final AttributeConverter<T> attributeConverter;
    private final AttributeValueType attributeValueType;

    private StaticAttributeType(AttributeConverter<T> attributeConverter) {
        this.attributeConverter = attributeConverter;
        this.attributeValueType = attributeConverter.attributeValueType();
    }

    public static <T> AttributeType<T> create(
        AttributeConverter<T> attributeConverter) {

        return new StaticAttributeType<>(attributeConverter);
    }

    @Override
    public AttributeValue objectToAttributeValue(T object) {
        return this.attributeConverter.transformFrom(object);
    }

    @Override
    public T attributeValueToObject(AttributeValue attributeValue) {
        return this.attributeConverter.transformTo(attributeValue);
    }

    @Override
    public AttributeValueType attributeValueType() {
        return attributeValueType;
    }
}
