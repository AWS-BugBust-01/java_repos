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
package com.amazonaws.services.transcribe.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transcribe.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CallAnalyticsJobSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CallAnalyticsJobSettingsMarshaller {

    private static final MarshallingInfo<String> VOCABULARYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VocabularyName").build();
    private static final MarshallingInfo<String> VOCABULARYFILTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VocabularyFilterName").build();
    private static final MarshallingInfo<String> VOCABULARYFILTERMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VocabularyFilterMethod").build();
    private static final MarshallingInfo<String> LANGUAGEMODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageModelName").build();
    private static final MarshallingInfo<StructuredPojo> CONTENTREDACTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContentRedaction").build();
    private static final MarshallingInfo<List> LANGUAGEOPTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageOptions").build();
    private static final MarshallingInfo<Map> LANGUAGEIDSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageIdSettings").build();

    private static final CallAnalyticsJobSettingsMarshaller instance = new CallAnalyticsJobSettingsMarshaller();

    public static CallAnalyticsJobSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CallAnalyticsJobSettings callAnalyticsJobSettings, ProtocolMarshaller protocolMarshaller) {

        if (callAnalyticsJobSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(callAnalyticsJobSettings.getVocabularyName(), VOCABULARYNAME_BINDING);
            protocolMarshaller.marshall(callAnalyticsJobSettings.getVocabularyFilterName(), VOCABULARYFILTERNAME_BINDING);
            protocolMarshaller.marshall(callAnalyticsJobSettings.getVocabularyFilterMethod(), VOCABULARYFILTERMETHOD_BINDING);
            protocolMarshaller.marshall(callAnalyticsJobSettings.getLanguageModelName(), LANGUAGEMODELNAME_BINDING);
            protocolMarshaller.marshall(callAnalyticsJobSettings.getContentRedaction(), CONTENTREDACTION_BINDING);
            protocolMarshaller.marshall(callAnalyticsJobSettings.getLanguageOptions(), LANGUAGEOPTIONS_BINDING);
            protocolMarshaller.marshall(callAnalyticsJobSettings.getLanguageIdSettings(), LANGUAGEIDSETTINGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
