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
 * A condition in the call between the customer and the agent that you want to filter for.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/Rule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Rule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A condition for a time period when neither the customer nor the agent was talking.
     * </p>
     */
    private NonTalkTimeFilter nonTalkTimeFilter;
    /**
     * <p>
     * A condition for a time period when either the customer or agent was interrupting the other person.
     * </p>
     */
    private InterruptionFilter interruptionFilter;
    /**
     * <p>
     * A condition that catches particular words or phrases based on a exact match. For example, if you set the phrase
     * "I want to speak to the manager", only that exact phrase will be returned.
     * </p>
     */
    private TranscriptFilter transcriptFilter;
    /**
     * <p>
     * A condition that is applied to a particular customer sentiment.
     * </p>
     */
    private SentimentFilter sentimentFilter;

    /**
     * <p>
     * A condition for a time period when neither the customer nor the agent was talking.
     * </p>
     * 
     * @param nonTalkTimeFilter
     *        A condition for a time period when neither the customer nor the agent was talking.
     */

    public void setNonTalkTimeFilter(NonTalkTimeFilter nonTalkTimeFilter) {
        this.nonTalkTimeFilter = nonTalkTimeFilter;
    }

    /**
     * <p>
     * A condition for a time period when neither the customer nor the agent was talking.
     * </p>
     * 
     * @return A condition for a time period when neither the customer nor the agent was talking.
     */

    public NonTalkTimeFilter getNonTalkTimeFilter() {
        return this.nonTalkTimeFilter;
    }

    /**
     * <p>
     * A condition for a time period when neither the customer nor the agent was talking.
     * </p>
     * 
     * @param nonTalkTimeFilter
     *        A condition for a time period when neither the customer nor the agent was talking.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withNonTalkTimeFilter(NonTalkTimeFilter nonTalkTimeFilter) {
        setNonTalkTimeFilter(nonTalkTimeFilter);
        return this;
    }

    /**
     * <p>
     * A condition for a time period when either the customer or agent was interrupting the other person.
     * </p>
     * 
     * @param interruptionFilter
     *        A condition for a time period when either the customer or agent was interrupting the other person.
     */

    public void setInterruptionFilter(InterruptionFilter interruptionFilter) {
        this.interruptionFilter = interruptionFilter;
    }

    /**
     * <p>
     * A condition for a time period when either the customer or agent was interrupting the other person.
     * </p>
     * 
     * @return A condition for a time period when either the customer or agent was interrupting the other person.
     */

    public InterruptionFilter getInterruptionFilter() {
        return this.interruptionFilter;
    }

    /**
     * <p>
     * A condition for a time period when either the customer or agent was interrupting the other person.
     * </p>
     * 
     * @param interruptionFilter
     *        A condition for a time period when either the customer or agent was interrupting the other person.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withInterruptionFilter(InterruptionFilter interruptionFilter) {
        setInterruptionFilter(interruptionFilter);
        return this;
    }

    /**
     * <p>
     * A condition that catches particular words or phrases based on a exact match. For example, if you set the phrase
     * "I want to speak to the manager", only that exact phrase will be returned.
     * </p>
     * 
     * @param transcriptFilter
     *        A condition that catches particular words or phrases based on a exact match. For example, if you set the
     *        phrase "I want to speak to the manager", only that exact phrase will be returned.
     */

    public void setTranscriptFilter(TranscriptFilter transcriptFilter) {
        this.transcriptFilter = transcriptFilter;
    }

    /**
     * <p>
     * A condition that catches particular words or phrases based on a exact match. For example, if you set the phrase
     * "I want to speak to the manager", only that exact phrase will be returned.
     * </p>
     * 
     * @return A condition that catches particular words or phrases based on a exact match. For example, if you set the
     *         phrase "I want to speak to the manager", only that exact phrase will be returned.
     */

    public TranscriptFilter getTranscriptFilter() {
        return this.transcriptFilter;
    }

    /**
     * <p>
     * A condition that catches particular words or phrases based on a exact match. For example, if you set the phrase
     * "I want to speak to the manager", only that exact phrase will be returned.
     * </p>
     * 
     * @param transcriptFilter
     *        A condition that catches particular words or phrases based on a exact match. For example, if you set the
     *        phrase "I want to speak to the manager", only that exact phrase will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withTranscriptFilter(TranscriptFilter transcriptFilter) {
        setTranscriptFilter(transcriptFilter);
        return this;
    }

    /**
     * <p>
     * A condition that is applied to a particular customer sentiment.
     * </p>
     * 
     * @param sentimentFilter
     *        A condition that is applied to a particular customer sentiment.
     */

    public void setSentimentFilter(SentimentFilter sentimentFilter) {
        this.sentimentFilter = sentimentFilter;
    }

    /**
     * <p>
     * A condition that is applied to a particular customer sentiment.
     * </p>
     * 
     * @return A condition that is applied to a particular customer sentiment.
     */

    public SentimentFilter getSentimentFilter() {
        return this.sentimentFilter;
    }

    /**
     * <p>
     * A condition that is applied to a particular customer sentiment.
     * </p>
     * 
     * @param sentimentFilter
     *        A condition that is applied to a particular customer sentiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Rule withSentimentFilter(SentimentFilter sentimentFilter) {
        setSentimentFilter(sentimentFilter);
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
        if (getNonTalkTimeFilter() != null)
            sb.append("NonTalkTimeFilter: ").append(getNonTalkTimeFilter()).append(",");
        if (getInterruptionFilter() != null)
            sb.append("InterruptionFilter: ").append(getInterruptionFilter()).append(",");
        if (getTranscriptFilter() != null)
            sb.append("TranscriptFilter: ").append(getTranscriptFilter()).append(",");
        if (getSentimentFilter() != null)
            sb.append("SentimentFilter: ").append(getSentimentFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Rule == false)
            return false;
        Rule other = (Rule) obj;
        if (other.getNonTalkTimeFilter() == null ^ this.getNonTalkTimeFilter() == null)
            return false;
        if (other.getNonTalkTimeFilter() != null && other.getNonTalkTimeFilter().equals(this.getNonTalkTimeFilter()) == false)
            return false;
        if (other.getInterruptionFilter() == null ^ this.getInterruptionFilter() == null)
            return false;
        if (other.getInterruptionFilter() != null && other.getInterruptionFilter().equals(this.getInterruptionFilter()) == false)
            return false;
        if (other.getTranscriptFilter() == null ^ this.getTranscriptFilter() == null)
            return false;
        if (other.getTranscriptFilter() != null && other.getTranscriptFilter().equals(this.getTranscriptFilter()) == false)
            return false;
        if (other.getSentimentFilter() == null ^ this.getSentimentFilter() == null)
            return false;
        if (other.getSentimentFilter() != null && other.getSentimentFilter().equals(this.getSentimentFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNonTalkTimeFilter() == null) ? 0 : getNonTalkTimeFilter().hashCode());
        hashCode = prime * hashCode + ((getInterruptionFilter() == null) ? 0 : getInterruptionFilter().hashCode());
        hashCode = prime * hashCode + ((getTranscriptFilter() == null) ? 0 : getTranscriptFilter().hashCode());
        hashCode = prime * hashCode + ((getSentimentFilter() == null) ? 0 : getSentimentFilter().hashCode());
        return hashCode;
    }

    @Override
    public Rule clone() {
        try {
            return (Rule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.RuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
