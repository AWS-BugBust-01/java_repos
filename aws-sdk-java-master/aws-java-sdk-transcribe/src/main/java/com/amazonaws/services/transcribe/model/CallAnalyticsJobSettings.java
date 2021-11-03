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
 * Provides optional settings for the <code>CallAnalyticsJob</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/CallAnalyticsJobSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CallAnalyticsJobSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a vocabulary to use when processing the call analytics job.
     * </p>
     */
    private String vocabularyName;
    /**
     * <p>
     * The name of the vocabulary filter to use when running a call analytics job. The filter that you specify must have
     * the same language code as the analytics job.
     * </p>
     */
    private String vocabularyFilterName;
    /**
     * <p>
     * Set to mask to remove filtered text from the transcript and replace it with three asterisks ("***") as
     * placeholder text. Set to <code>remove</code> to remove filtered text from the transcript without using
     * placeholder text. Set to <code>tag</code> to mark the word in the transcription output that matches the
     * vocabulary filter. When you set the filter method to <code>tag</code>, the words matching your vocabulary filter
     * are not masked or removed.
     * </p>
     */
    private String vocabularyFilterMethod;
    /**
     * <p>
     * The structure used to describe a custom language model.
     * </p>
     */
    private String languageModelName;

    private ContentRedaction contentRedaction;
    /**
     * <p>
     * When you run a call analytics job, you can specify the language spoken in the audio, or you can have Amazon
     * Transcribe identify the language for you.
     * </p>
     * <p>
     * To specify a language, specify an array with one language code. If you don't know the language, you can leave
     * this field blank and Amazon Transcribe will use machine learning to identify the language for you. To improve the
     * ability of Amazon Transcribe to correctly identify the language, you can provide an array of the languages that
     * can be present in the audio. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html">Supported languages and
     * language-specific features</a> for additional information.
     * </p>
     */
    private java.util.List<String> languageOptions;
    /**
     * <p>
     * The language identification settings associated with your call analytics job. These settings include
     * <code>VocabularyName</code>, <code>VocabularyFilterName</code>, and <code>LanguageModelName</code>.
     * </p>
     */
    private java.util.Map<String, LanguageIdSettings> languageIdSettings;

    /**
     * <p>
     * The name of a vocabulary to use when processing the call analytics job.
     * </p>
     * 
     * @param vocabularyName
     *        The name of a vocabulary to use when processing the call analytics job.
     */

    public void setVocabularyName(String vocabularyName) {
        this.vocabularyName = vocabularyName;
    }

    /**
     * <p>
     * The name of a vocabulary to use when processing the call analytics job.
     * </p>
     * 
     * @return The name of a vocabulary to use when processing the call analytics job.
     */

    public String getVocabularyName() {
        return this.vocabularyName;
    }

    /**
     * <p>
     * The name of a vocabulary to use when processing the call analytics job.
     * </p>
     * 
     * @param vocabularyName
     *        The name of a vocabulary to use when processing the call analytics job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJobSettings withVocabularyName(String vocabularyName) {
        setVocabularyName(vocabularyName);
        return this;
    }

    /**
     * <p>
     * The name of the vocabulary filter to use when running a call analytics job. The filter that you specify must have
     * the same language code as the analytics job.
     * </p>
     * 
     * @param vocabularyFilterName
     *        The name of the vocabulary filter to use when running a call analytics job. The filter that you specify
     *        must have the same language code as the analytics job.
     */

    public void setVocabularyFilterName(String vocabularyFilterName) {
        this.vocabularyFilterName = vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter to use when running a call analytics job. The filter that you specify must have
     * the same language code as the analytics job.
     * </p>
     * 
     * @return The name of the vocabulary filter to use when running a call analytics job. The filter that you specify
     *         must have the same language code as the analytics job.
     */

    public String getVocabularyFilterName() {
        return this.vocabularyFilterName;
    }

    /**
     * <p>
     * The name of the vocabulary filter to use when running a call analytics job. The filter that you specify must have
     * the same language code as the analytics job.
     * </p>
     * 
     * @param vocabularyFilterName
     *        The name of the vocabulary filter to use when running a call analytics job. The filter that you specify
     *        must have the same language code as the analytics job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJobSettings withVocabularyFilterName(String vocabularyFilterName) {
        setVocabularyFilterName(vocabularyFilterName);
        return this;
    }

    /**
     * <p>
     * Set to mask to remove filtered text from the transcript and replace it with three asterisks ("***") as
     * placeholder text. Set to <code>remove</code> to remove filtered text from the transcript without using
     * placeholder text. Set to <code>tag</code> to mark the word in the transcription output that matches the
     * vocabulary filter. When you set the filter method to <code>tag</code>, the words matching your vocabulary filter
     * are not masked or removed.
     * </p>
     * 
     * @param vocabularyFilterMethod
     *        Set to mask to remove filtered text from the transcript and replace it with three asterisks ("***") as
     *        placeholder text. Set to <code>remove</code> to remove filtered text from the transcript without using
     *        placeholder text. Set to <code>tag</code> to mark the word in the transcription output that matches the
     *        vocabulary filter. When you set the filter method to <code>tag</code>, the words matching your vocabulary
     *        filter are not masked or removed.
     * @see VocabularyFilterMethod
     */

    public void setVocabularyFilterMethod(String vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod;
    }

    /**
     * <p>
     * Set to mask to remove filtered text from the transcript and replace it with three asterisks ("***") as
     * placeholder text. Set to <code>remove</code> to remove filtered text from the transcript without using
     * placeholder text. Set to <code>tag</code> to mark the word in the transcription output that matches the
     * vocabulary filter. When you set the filter method to <code>tag</code>, the words matching your vocabulary filter
     * are not masked or removed.
     * </p>
     * 
     * @return Set to mask to remove filtered text from the transcript and replace it with three asterisks ("***") as
     *         placeholder text. Set to <code>remove</code> to remove filtered text from the transcript without using
     *         placeholder text. Set to <code>tag</code> to mark the word in the transcription output that matches the
     *         vocabulary filter. When you set the filter method to <code>tag</code>, the words matching your vocabulary
     *         filter are not masked or removed.
     * @see VocabularyFilterMethod
     */

    public String getVocabularyFilterMethod() {
        return this.vocabularyFilterMethod;
    }

    /**
     * <p>
     * Set to mask to remove filtered text from the transcript and replace it with three asterisks ("***") as
     * placeholder text. Set to <code>remove</code> to remove filtered text from the transcript without using
     * placeholder text. Set to <code>tag</code> to mark the word in the transcription output that matches the
     * vocabulary filter. When you set the filter method to <code>tag</code>, the words matching your vocabulary filter
     * are not masked or removed.
     * </p>
     * 
     * @param vocabularyFilterMethod
     *        Set to mask to remove filtered text from the transcript and replace it with three asterisks ("***") as
     *        placeholder text. Set to <code>remove</code> to remove filtered text from the transcript without using
     *        placeholder text. Set to <code>tag</code> to mark the word in the transcription output that matches the
     *        vocabulary filter. When you set the filter method to <code>tag</code>, the words matching your vocabulary
     *        filter are not masked or removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyFilterMethod
     */

    public CallAnalyticsJobSettings withVocabularyFilterMethod(String vocabularyFilterMethod) {
        setVocabularyFilterMethod(vocabularyFilterMethod);
        return this;
    }

    /**
     * <p>
     * Set to mask to remove filtered text from the transcript and replace it with three asterisks ("***") as
     * placeholder text. Set to <code>remove</code> to remove filtered text from the transcript without using
     * placeholder text. Set to <code>tag</code> to mark the word in the transcription output that matches the
     * vocabulary filter. When you set the filter method to <code>tag</code>, the words matching your vocabulary filter
     * are not masked or removed.
     * </p>
     * 
     * @param vocabularyFilterMethod
     *        Set to mask to remove filtered text from the transcript and replace it with three asterisks ("***") as
     *        placeholder text. Set to <code>remove</code> to remove filtered text from the transcript without using
     *        placeholder text. Set to <code>tag</code> to mark the word in the transcription output that matches the
     *        vocabulary filter. When you set the filter method to <code>tag</code>, the words matching your vocabulary
     *        filter are not masked or removed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VocabularyFilterMethod
     */

    public CallAnalyticsJobSettings withVocabularyFilterMethod(VocabularyFilterMethod vocabularyFilterMethod) {
        this.vocabularyFilterMethod = vocabularyFilterMethod.toString();
        return this;
    }

    /**
     * <p>
     * The structure used to describe a custom language model.
     * </p>
     * 
     * @param languageModelName
     *        The structure used to describe a custom language model.
     */

    public void setLanguageModelName(String languageModelName) {
        this.languageModelName = languageModelName;
    }

    /**
     * <p>
     * The structure used to describe a custom language model.
     * </p>
     * 
     * @return The structure used to describe a custom language model.
     */

    public String getLanguageModelName() {
        return this.languageModelName;
    }

    /**
     * <p>
     * The structure used to describe a custom language model.
     * </p>
     * 
     * @param languageModelName
     *        The structure used to describe a custom language model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJobSettings withLanguageModelName(String languageModelName) {
        setLanguageModelName(languageModelName);
        return this;
    }

    /**
     * @param contentRedaction
     */

    public void setContentRedaction(ContentRedaction contentRedaction) {
        this.contentRedaction = contentRedaction;
    }

    /**
     * @return
     */

    public ContentRedaction getContentRedaction() {
        return this.contentRedaction;
    }

    /**
     * @param contentRedaction
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJobSettings withContentRedaction(ContentRedaction contentRedaction) {
        setContentRedaction(contentRedaction);
        return this;
    }

    /**
     * <p>
     * When you run a call analytics job, you can specify the language spoken in the audio, or you can have Amazon
     * Transcribe identify the language for you.
     * </p>
     * <p>
     * To specify a language, specify an array with one language code. If you don't know the language, you can leave
     * this field blank and Amazon Transcribe will use machine learning to identify the language for you. To improve the
     * ability of Amazon Transcribe to correctly identify the language, you can provide an array of the languages that
     * can be present in the audio. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html">Supported languages and
     * language-specific features</a> for additional information.
     * </p>
     * 
     * @return When you run a call analytics job, you can specify the language spoken in the audio, or you can have
     *         Amazon Transcribe identify the language for you.</p>
     *         <p>
     *         To specify a language, specify an array with one language code. If you don't know the language, you can
     *         leave this field blank and Amazon Transcribe will use machine learning to identify the language for you.
     *         To improve the ability of Amazon Transcribe to correctly identify the language, you can provide an array
     *         of the languages that can be present in the audio. Refer to <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html">Supported languages and
     *         language-specific features</a> for additional information.
     * @see LanguageCode
     */

    public java.util.List<String> getLanguageOptions() {
        return languageOptions;
    }

    /**
     * <p>
     * When you run a call analytics job, you can specify the language spoken in the audio, or you can have Amazon
     * Transcribe identify the language for you.
     * </p>
     * <p>
     * To specify a language, specify an array with one language code. If you don't know the language, you can leave
     * this field blank and Amazon Transcribe will use machine learning to identify the language for you. To improve the
     * ability of Amazon Transcribe to correctly identify the language, you can provide an array of the languages that
     * can be present in the audio. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html">Supported languages and
     * language-specific features</a> for additional information.
     * </p>
     * 
     * @param languageOptions
     *        When you run a call analytics job, you can specify the language spoken in the audio, or you can have
     *        Amazon Transcribe identify the language for you.</p>
     *        <p>
     *        To specify a language, specify an array with one language code. If you don't know the language, you can
     *        leave this field blank and Amazon Transcribe will use machine learning to identify the language for you.
     *        To improve the ability of Amazon Transcribe to correctly identify the language, you can provide an array
     *        of the languages that can be present in the audio. Refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html">Supported languages and
     *        language-specific features</a> for additional information.
     * @see LanguageCode
     */

    public void setLanguageOptions(java.util.Collection<String> languageOptions) {
        if (languageOptions == null) {
            this.languageOptions = null;
            return;
        }

        this.languageOptions = new java.util.ArrayList<String>(languageOptions);
    }

    /**
     * <p>
     * When you run a call analytics job, you can specify the language spoken in the audio, or you can have Amazon
     * Transcribe identify the language for you.
     * </p>
     * <p>
     * To specify a language, specify an array with one language code. If you don't know the language, you can leave
     * this field blank and Amazon Transcribe will use machine learning to identify the language for you. To improve the
     * ability of Amazon Transcribe to correctly identify the language, you can provide an array of the languages that
     * can be present in the audio. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html">Supported languages and
     * language-specific features</a> for additional information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLanguageOptions(java.util.Collection)} or {@link #withLanguageOptions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param languageOptions
     *        When you run a call analytics job, you can specify the language spoken in the audio, or you can have
     *        Amazon Transcribe identify the language for you.</p>
     *        <p>
     *        To specify a language, specify an array with one language code. If you don't know the language, you can
     *        leave this field blank and Amazon Transcribe will use machine learning to identify the language for you.
     *        To improve the ability of Amazon Transcribe to correctly identify the language, you can provide an array
     *        of the languages that can be present in the audio. Refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html">Supported languages and
     *        language-specific features</a> for additional information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CallAnalyticsJobSettings withLanguageOptions(String... languageOptions) {
        if (this.languageOptions == null) {
            setLanguageOptions(new java.util.ArrayList<String>(languageOptions.length));
        }
        for (String ele : languageOptions) {
            this.languageOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * When you run a call analytics job, you can specify the language spoken in the audio, or you can have Amazon
     * Transcribe identify the language for you.
     * </p>
     * <p>
     * To specify a language, specify an array with one language code. If you don't know the language, you can leave
     * this field blank and Amazon Transcribe will use machine learning to identify the language for you. To improve the
     * ability of Amazon Transcribe to correctly identify the language, you can provide an array of the languages that
     * can be present in the audio. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html">Supported languages and
     * language-specific features</a> for additional information.
     * </p>
     * 
     * @param languageOptions
     *        When you run a call analytics job, you can specify the language spoken in the audio, or you can have
     *        Amazon Transcribe identify the language for you.</p>
     *        <p>
     *        To specify a language, specify an array with one language code. If you don't know the language, you can
     *        leave this field blank and Amazon Transcribe will use machine learning to identify the language for you.
     *        To improve the ability of Amazon Transcribe to correctly identify the language, you can provide an array
     *        of the languages that can be present in the audio. Refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html">Supported languages and
     *        language-specific features</a> for additional information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CallAnalyticsJobSettings withLanguageOptions(java.util.Collection<String> languageOptions) {
        setLanguageOptions(languageOptions);
        return this;
    }

    /**
     * <p>
     * When you run a call analytics job, you can specify the language spoken in the audio, or you can have Amazon
     * Transcribe identify the language for you.
     * </p>
     * <p>
     * To specify a language, specify an array with one language code. If you don't know the language, you can leave
     * this field blank and Amazon Transcribe will use machine learning to identify the language for you. To improve the
     * ability of Amazon Transcribe to correctly identify the language, you can provide an array of the languages that
     * can be present in the audio. Refer to <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html">Supported languages and
     * language-specific features</a> for additional information.
     * </p>
     * 
     * @param languageOptions
     *        When you run a call analytics job, you can specify the language spoken in the audio, or you can have
     *        Amazon Transcribe identify the language for you.</p>
     *        <p>
     *        To specify a language, specify an array with one language code. If you don't know the language, you can
     *        leave this field blank and Amazon Transcribe will use machine learning to identify the language for you.
     *        To improve the ability of Amazon Transcribe to correctly identify the language, you can provide an array
     *        of the languages that can be present in the audio. Refer to <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/how-it-works.html">Supported languages and
     *        language-specific features</a> for additional information.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public CallAnalyticsJobSettings withLanguageOptions(LanguageCode... languageOptions) {
        java.util.ArrayList<String> languageOptionsCopy = new java.util.ArrayList<String>(languageOptions.length);
        for (LanguageCode value : languageOptions) {
            languageOptionsCopy.add(value.toString());
        }
        if (getLanguageOptions() == null) {
            setLanguageOptions(languageOptionsCopy);
        } else {
            getLanguageOptions().addAll(languageOptionsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The language identification settings associated with your call analytics job. These settings include
     * <code>VocabularyName</code>, <code>VocabularyFilterName</code>, and <code>LanguageModelName</code>.
     * </p>
     * 
     * @return The language identification settings associated with your call analytics job. These settings include
     *         <code>VocabularyName</code>, <code>VocabularyFilterName</code>, and <code>LanguageModelName</code>.
     */

    public java.util.Map<String, LanguageIdSettings> getLanguageIdSettings() {
        return languageIdSettings;
    }

    /**
     * <p>
     * The language identification settings associated with your call analytics job. These settings include
     * <code>VocabularyName</code>, <code>VocabularyFilterName</code>, and <code>LanguageModelName</code>.
     * </p>
     * 
     * @param languageIdSettings
     *        The language identification settings associated with your call analytics job. These settings include
     *        <code>VocabularyName</code>, <code>VocabularyFilterName</code>, and <code>LanguageModelName</code>.
     */

    public void setLanguageIdSettings(java.util.Map<String, LanguageIdSettings> languageIdSettings) {
        this.languageIdSettings = languageIdSettings;
    }

    /**
     * <p>
     * The language identification settings associated with your call analytics job. These settings include
     * <code>VocabularyName</code>, <code>VocabularyFilterName</code>, and <code>LanguageModelName</code>.
     * </p>
     * 
     * @param languageIdSettings
     *        The language identification settings associated with your call analytics job. These settings include
     *        <code>VocabularyName</code>, <code>VocabularyFilterName</code>, and <code>LanguageModelName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJobSettings withLanguageIdSettings(java.util.Map<String, LanguageIdSettings> languageIdSettings) {
        setLanguageIdSettings(languageIdSettings);
        return this;
    }

    /**
     * Add a single LanguageIdSettings entry
     *
     * @see CallAnalyticsJobSettings#withLanguageIdSettings
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJobSettings addLanguageIdSettingsEntry(String key, LanguageIdSettings value) {
        if (null == this.languageIdSettings) {
            this.languageIdSettings = new java.util.HashMap<String, LanguageIdSettings>();
        }
        if (this.languageIdSettings.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.languageIdSettings.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LanguageIdSettings.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CallAnalyticsJobSettings clearLanguageIdSettingsEntries() {
        this.languageIdSettings = null;
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
        if (getVocabularyFilterMethod() != null)
            sb.append("VocabularyFilterMethod: ").append(getVocabularyFilterMethod()).append(",");
        if (getLanguageModelName() != null)
            sb.append("LanguageModelName: ").append(getLanguageModelName()).append(",");
        if (getContentRedaction() != null)
            sb.append("ContentRedaction: ").append(getContentRedaction()).append(",");
        if (getLanguageOptions() != null)
            sb.append("LanguageOptions: ").append(getLanguageOptions()).append(",");
        if (getLanguageIdSettings() != null)
            sb.append("LanguageIdSettings: ").append(getLanguageIdSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CallAnalyticsJobSettings == false)
            return false;
        CallAnalyticsJobSettings other = (CallAnalyticsJobSettings) obj;
        if (other.getVocabularyName() == null ^ this.getVocabularyName() == null)
            return false;
        if (other.getVocabularyName() != null && other.getVocabularyName().equals(this.getVocabularyName()) == false)
            return false;
        if (other.getVocabularyFilterName() == null ^ this.getVocabularyFilterName() == null)
            return false;
        if (other.getVocabularyFilterName() != null && other.getVocabularyFilterName().equals(this.getVocabularyFilterName()) == false)
            return false;
        if (other.getVocabularyFilterMethod() == null ^ this.getVocabularyFilterMethod() == null)
            return false;
        if (other.getVocabularyFilterMethod() != null && other.getVocabularyFilterMethod().equals(this.getVocabularyFilterMethod()) == false)
            return false;
        if (other.getLanguageModelName() == null ^ this.getLanguageModelName() == null)
            return false;
        if (other.getLanguageModelName() != null && other.getLanguageModelName().equals(this.getLanguageModelName()) == false)
            return false;
        if (other.getContentRedaction() == null ^ this.getContentRedaction() == null)
            return false;
        if (other.getContentRedaction() != null && other.getContentRedaction().equals(this.getContentRedaction()) == false)
            return false;
        if (other.getLanguageOptions() == null ^ this.getLanguageOptions() == null)
            return false;
        if (other.getLanguageOptions() != null && other.getLanguageOptions().equals(this.getLanguageOptions()) == false)
            return false;
        if (other.getLanguageIdSettings() == null ^ this.getLanguageIdSettings() == null)
            return false;
        if (other.getLanguageIdSettings() != null && other.getLanguageIdSettings().equals(this.getLanguageIdSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVocabularyName() == null) ? 0 : getVocabularyName().hashCode());
        hashCode = prime * hashCode + ((getVocabularyFilterName() == null) ? 0 : getVocabularyFilterName().hashCode());
        hashCode = prime * hashCode + ((getVocabularyFilterMethod() == null) ? 0 : getVocabularyFilterMethod().hashCode());
        hashCode = prime * hashCode + ((getLanguageModelName() == null) ? 0 : getLanguageModelName().hashCode());
        hashCode = prime * hashCode + ((getContentRedaction() == null) ? 0 : getContentRedaction().hashCode());
        hashCode = prime * hashCode + ((getLanguageOptions() == null) ? 0 : getLanguageOptions().hashCode());
        hashCode = prime * hashCode + ((getLanguageIdSettings() == null) ? 0 : getLanguageIdSettings().hashCode());
        return hashCode;
    }

    @Override
    public CallAnalyticsJobSettings clone() {
        try {
            return (CallAnalyticsJobSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.CallAnalyticsJobSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
