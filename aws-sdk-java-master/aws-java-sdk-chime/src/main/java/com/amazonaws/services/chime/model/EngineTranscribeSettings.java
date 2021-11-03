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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Settings specific to the Amazon Transcribe engine.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/EngineTranscribeSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EngineTranscribeSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The language code specified for the Amazon Transcribe engine.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The filtering method passed to Amazon Transcribe.
     * </p>
     */
    private String vocabularyFilterMethod;
    /**
     * <p>
     * The name of the vocabulary filter passed to Amazon Transcribe.
     * </p>
     */
    private String vocabularyFilterName;
    /**
     * <p>
     * The name of the vocabulary passed to Amazon Transcribe.
     * </p>
     */
    private String vocabularyName;
    /**
     * <p>
     * The AWS Region passed to Amazon Transcribe. If you don't specify a Region, Amazon Chime uses the meeting's
     * Region.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The language code specified for the Amazon Transcribe engine.
     * </p>
     * 
     * @param languageCode
     *        The language code specified for the Amazon Transcribe engine.
     * @see TranscribeLanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The language code specified for the Amazon Transcribe engine.
     * </p>
     * 
     * @return The language code specified for the Amazon Transcribe engine.
     * @see TranscribeLanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The language code specified for the Amazon Transcribe engine.
     * </p>
     * 
     * @param languageCode
     *        The language code specified for the Amazon Transcribe engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeLanguageCode
     */

    public EngineTranscribeSettings withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The language code specified for the Amazon Transcribe engine.
     * </p>
     * 
     * @param languageCode
     *        The language code specified for the Amazon Transcribe engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeLanguageCode
     */

    public EngineTranscribeSettings withLanguageCode(TranscribeLanguageCode languageCode) {
        this.languageCode = languageCode.toString();
        return this;
    }

    /**
     * <p>
     * The filtering method passed to Amazon Transcribe.
     * </p>
     * 
     * @param vocabularyFilterMethod
     *        The filtering method passed to Amazon Transcribe.
     * @see TranscribeVocabularyFilterMethod
     */

    public void setVocabularyFilterMethod(String vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod;
    }

    /**
     * <p>
     * The filtering method passed to Amazon Transcribe.
     * </p>
     * 
     * @return The filtering method passed to Amazon Transcribe.
     * @see TranscribeVocabularyFilterMethod
     */

    public String getVocabularyFilterMethod() {
        return this.vocabularyFilterMethod;
    }

    /**
     * <p>
     * The filtering method passed to Amazon Transcribe.
     * </p>
     * 
     * @param vocabularyFilterMethod
     *        The filtering method passed to Amazon Transcribe.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeVocabularyFilterMethod
     */

    public EngineTranscribeSettings withVocabularyFilterMethod(String vocabularyFilterMethod) {
        setVocabularyFilterMethod(vocabularyFilterMethod);
        return this;
    }

    /**
     * <p>
     * The filtering method passed to Amazon Transcribe.
     * </p>
     * 
     * @param vocabularyFilterMethod
     *        The filtering method passed to Amazon Transcribe.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeVocabularyFilterMethod
     */

    public EngineTranscribeSettings withVocabularyFilterMethod(TranscribeVocabularyFilterMethod vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod.toString();
        return this;
    }

    /**
     * <p>
     * The name of the vocabulary filter passed to Amazon Transcribe.
     * </p>
     * 
     * @param vocabularyFilterName
     *        The name of the vocabulary filter passed to Amazon Transcribe.
     */

    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter passed to Amazon Transcribe.
     * </p>
     * 
     * @return The name of the vocabulary filter passed to Amazon Transcribe.
     */

    public String getVocabularyFilterName() {
        return this.vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter passed to Amazon Transcribe.
     * </p>
     * 
     * @param vocabularyFilterName
     *        The name of the vocabulary filter passed to Amazon Transcribe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineTranscribeSettings withVocabularyFilterName(String vocabularyFilterName) {
        setVocabularyFilterName(vocabularyFilterName);
        return this;
    }

    /**
     * <p>
     * The name of the vocabulary passed to Amazon Transcribe.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary passed to Amazon Transcribe.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary passed to Amazon Transcribe.
     * </p>
     * 
     * @return The name of the vocabulary passed to Amazon Transcribe.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary passed to Amazon Transcribe.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary passed to Amazon Transcribe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EngineTranscribeSettings withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
        return this;
    }

    /**
     * <p>
     * The AWS Region passed to Amazon Transcribe. If you don't specify a Region, Amazon Chime uses the meeting's
     * Region.
     * </p>
     * 
     * @param region
     *        The AWS Region passed to Amazon Transcribe. If you don't specify a Region, Amazon Chime uses the meeting's
     *        Region.
     * @see TranscribeRegion
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region passed to Amazon Transcribe. If you don't specify a Region, Amazon Chime uses the meeting's
     * Region.
     * </p>
     * 
     * @return The AWS Region passed to Amazon Transcribe. If you don't specify a Region, Amazon Chime uses the
     *         meeting's Region.
     * @see TranscribeRegion
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS Region passed to Amazon Transcribe. If you don't specify a Region, Amazon Chime uses the meeting's
     * Region.
     * </p>
     * 
     * @param region
     *        The AWS Region passed to Amazon Transcribe. If you don't specify a Region, Amazon Chime uses the meeting's
     *        Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeRegion
     */

    public EngineTranscribeSettings withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The AWS Region passed to Amazon Transcribe. If you don't specify a Region, Amazon Chime uses the meeting's
     * Region.
     * </p>
     * 
     * @param region
     *        The AWS Region passed to Amazon Transcribe. If you don't specify a Region, Amazon Chime uses the meeting's
     *        Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscribeRegion
     */

    public EngineTranscribeSettings withRegion(TranscribeRegion region) {
        this.region = region.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getVocabularyFilterMethod() != null)
            sb.append("VocabularyFilterMethod: ").append(getVocabularyFilterMethod()).append(",");
        if (getVocabularyFilterName() != null)
            sb.append("VocabularyFilterName: ").append(getVocabularyFilterName()).append(",");
        if (getVocabularyName() != null)
            sb.append("VocabularyName: ").append(getVocabularyName()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EngineTranscribeSettings == false)
            return false;
        EngineTranscribeSettings other = (EngineTranscribeSettings) obj;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getVocabularyFilterMethod() == null ^ this.getVocabularyFilterMethod() == null)
            return false;
        if (other.getVocabularyFilterMethod() != null && other.getVocabularyFilterMethod().equals(this.getVocabularyFilterMethod()) == false)
            return false;
        if (other.getVocabularyFilterName() == null ^ this.getVocabularyFilterName() == null)
            return false;
        if (other.getVocabularyFilterName() != null && other.getVocabularyFilterName().equals(this.getVocabularyFilterName()) == false)
            return false;
        if (other.getVocabularyName() == null ^ this.getVocabularyName() == null)
            return false;
        if (other.getVocabularyName() != null && other.getVocabularyName().equals(this.getVocabularyName()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getVocabularyFilterMethod() == null) ? 0 : getVocabularyFilterMethod().hashCode());
        hashCode = prime * hashCode + ((getVocabularyFilterName() == null) ? 0 : getVocabularyFilterName().hashCode());
        hashCode = prime * hashCode + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public EngineTranscribeSettings clone() {
        try {
            return (EngineTranscribeSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.EngineTranscribeSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
