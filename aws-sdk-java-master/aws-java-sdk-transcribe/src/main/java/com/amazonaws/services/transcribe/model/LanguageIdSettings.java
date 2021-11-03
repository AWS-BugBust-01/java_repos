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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Language-specific settings that can be specified when language identification is enabled.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/LanguageIdSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LanguageIdSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the vocabulary you want to use when processing your transcription job. The vocabulary you specify
     * must have the same language code as the transcription job; if the languages don't match, the vocabulary won't be
     * applied.
     * </p>
     */
    private String vocabularyName;
    /**
     * <p>
     * The name of the vocabulary filter you want to use when transcribing your audio. The filter you specify must have
     * the same language code as the transcription job; if the languages don't match, the vocabulary filter won't be
     * applied.
     * </p>
     */
    private String vocabularyFilterName;
    /**
     * <p>
     * The name of the language model you want to use when transcribing your audio. The model you specify must have the
     * same language code as the transcription job; if the languages don't match, the language model won't be applied.
     * </p>
     */
    private String languageModelName;

    /**
     * <p>
     * The name of the vocabulary you want to use when processing your transcription job. The vocabulary you specify
     * must have the same language code as the transcription job; if the languages don't match, the vocabulary won't be
     * applied.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary you want to use when processing your transcription job. The vocabulary you
     *        specify must have the same language code as the transcription job; if the languages don't match, the
     *        vocabulary won't be applied.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary you want to use when processing your transcription job. The vocabulary you specify
     * must have the same language code as the transcription job; if the languages don't match, the vocabulary won't be
     * applied.
     * </p>
     * 
     * @return The name of the vocabulary you want to use when processing your transcription job. The vocabulary you
     *         specify must have the same language code as the transcription job; if the languages don't match, the
     *         vocabulary won't be applied.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * The name of the vocabulary you want to use when processing your transcription job. The vocabulary you specify
     * must have the same language code as the transcription job; if the languages don't match, the vocabulary won't be
     * applied.
     * </p>
     * 
     * @param vocabularyName
     *        The name of the vocabulary you want to use when processing your transcription job. The vocabulary you
     *        specify must have the same language code as the transcription job; if the languages don't match, the
     *        vocabulary won't be applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LanguageIdSettings withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
        return this;
    }

    /**
     * <p>
     * The name of the vocabulary filter you want to use when transcribing your audio. The filter you specify must have
     * the same language code as the transcription job; if the languages don't match, the vocabulary filter won't be
     * applied.
     * </p>
     * 
     * @param vocabularyFilterName
     *        The name of the vocabulary filter you want to use when transcribing your audio. The filter you specify
     *        must have the same language code as the transcription job; if the languages don't match, the vocabulary
     *        filter won't be applied.
     */

    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter you want to use when transcribing your audio. The filter you specify must have
     * the same language code as the transcription job; if the languages don't match, the vocabulary filter won't be
     * applied.
     * </p>
     * 
     * @return The name of the vocabulary filter you want to use when transcribing your audio. The filter you specify
     *         must have the same language code as the transcription job; if the languages don't match, the vocabulary
     *         filter won't be applied.
     */

    public String getVocabularyFilterName() {
        return this.vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter you want to use when transcribing your audio. The filter you specify must have
     * the same language code as the transcription job; if the languages don't match, the vocabulary filter won't be
     * applied.
     * </p>
     * 
     * @param vocabularyFilterName
     *        The name of the vocabulary filter you want to use when transcribing your audio. The filter you specify
     *        must have the same language code as the transcription job; if the languages don't match, the vocabulary
     *        filter won't be applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LanguageIdSettings withVocabularyFilterName(String vocabularyFilterName) {
        setVocabularyFilterName(vocabularyFilterName);
        return this;
    }

    /**
     * <p>
     * The name of the language model you want to use when transcribing your audio. The model you specify must have the
     * same language code as the transcription job; if the languages don't match, the language model won't be applied.
     * </p>
     * 
     * @param languageModelName
     *        The name of the language model you want to use when transcribing your audio. The model you specify must
     *        have the same language code as the transcription job; if the languages don't match, the language model
     *        won't be applied.
     */

    public void setLanguageModelName(String languageModelName) {
        this.languageModelName = languageModelName;
    }

    /**
     * <p>
     * The name of the language model you want to use when transcribing your audio. The model you specify must have the
     * same language code as the transcription job; if the languages don't match, the language model won't be applied.
     * </p>
     * 
     * @return The name of the language model you want to use when transcribing your audio. The model you specify must
     *         have the same language code as the transcription job; if the languages don't match, the language model
     *         won't be applied.
     */

    public String getLanguageModelName() {
        return this.languageModelName;
    }

    /**
     * <p>
     * The name of the language model you want to use when transcribing your audio. The model you specify must have the
     * same language code as the transcription job; if the languages don't match, the language model won't be applied.
     * </p>
     * 
     * @param languageModelName
     *        The name of the language model you want to use when transcribing your audio. The model you specify must
     *        have the same language code as the transcription job; if the languages don't match, the language model
     *        won't be applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LanguageIdSettings withLanguageModelName(String languageModelName) {
        setLanguageModelName(languageModelName);
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
        if (getVocabularyName() != null)
            sb.append("VocabularyName: ").append(getVocabularyName()).append(",");
        if (getVocabularyFilterName() != null)
            sb.append("VocabularyFilterName: ").append(getVocabularyFilterName()).append(",");
        if (getLanguageModelName() != null)
            sb.append("LanguageModelName: ").append(getLanguageModelName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LanguageIdSettings == false)
            return false;
        LanguageIdSettings other = (LanguageIdSettings) obj;
        if (other.getVocabularyName() == null ^ this.getVocabularyName() == null)
            return false;
        if (other.getVocabularyName() != null && other.getVocabularyName().equals(this.getVocabularyName()) == false)
            return false;
        if (other.getVocabularyFilterName() == null ^ this.getVocabularyFilterName() == null)
            return false;
        if (other.getVocabularyFilterName() != null && other.getVocabularyFilterName().equals(this.getVocabularyFilterName()) == false)
            return false;
        if (other.getLanguageModelName() == null ^ this.getLanguageModelName() == null)
            return false;
        if (other.getLanguageModelName() != null && other.getLanguageModelName().equals(this.getLanguageModelName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        hashCode = prime * hashCode + ((getVocabularyFilterName() == null) ? 0 : getVocabularyFilterName().hashCode());
        hashCode = prime * hashCode + ((getLanguageModelName() == null) ? 0 : getLanguageModelName().hashCode());
        return hashCode;
    }

    @Override
    public LanguageIdSettings clone() {
        try {
            return (LanguageIdSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.LanguageIdSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
