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
 * Matches the output of the transcription to either the specific phrases that you specify, or the intent of the phrases
 * that you specify.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/TranscriptFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TranscriptFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Matches the phrase to the transcription output in a word for word fashion. For example, if you specify the phrase
     * "I want to speak to the manager." Amazon Transcribe attempts to match that specific phrase to the transcription.
     * </p>
     */
    private String transcriptFilterType;
    /**
     * <p>
     * A time range, set in seconds, between two points in the call.
     * </p>
     */
    private AbsoluteTimeRange absoluteTimeRange;
    /**
     * <p>
     * An object that allows percentages to specify the proportion of the call where you would like to apply a filter.
     * For example, you can specify the first half of the call. You can also specify the period of time between halfway
     * through to three-quarters of the way through the call. Because the length of conversation can vary between calls,
     * you can apply relative time ranges across all calls.
     * </p>
     */
    private RelativeTimeRange relativeTimeRange;
    /**
     * <p>
     * Determines whether the customer or the agent is speaking the phrases that you've specified.
     * </p>
     */
    private String participantRole;
    /**
     * <p>
     * If <code>TRUE</code>, the rule that you specify is applied to everything except for the phrases that you specify.
     * </p>
     */
    private Boolean negate;
    /**
     * <p>
     * The phrases that you're specifying for the transcript filter to match.
     * </p>
     */
    private java.util.List<String> targets;

    /**
     * <p>
     * Matches the phrase to the transcription output in a word for word fashion. For example, if you specify the phrase
     * "I want to speak to the manager." Amazon Transcribe attempts to match that specific phrase to the transcription.
     * </p>
     * 
     * @param transcriptFilterType
     *        Matches the phrase to the transcription output in a word for word fashion. For example, if you specify the
     *        phrase "I want to speak to the manager." Amazon Transcribe attempts to match that specific phrase to the
     *        transcription.
     * @see TranscriptFilterType
     */

    public void setTranscriptFilterType(String transcriptFilterType) {
        this.transcriptFilterType = transcriptFilterType;
    }

    /**
     * <p>
     * Matches the phrase to the transcription output in a word for word fashion. For example, if you specify the phrase
     * "I want to speak to the manager." Amazon Transcribe attempts to match that specific phrase to the transcription.
     * </p>
     * 
     * @return Matches the phrase to the transcription output in a word for word fashion. For example, if you specify
     *         the phrase "I want to speak to the manager." Amazon Transcribe attempts to match that specific phrase to
     *         the transcription.
     * @see TranscriptFilterType
     */

    public String getTranscriptFilterType() {
        return this.transcriptFilterType;
    }

    /**
     * <p>
     * Matches the phrase to the transcription output in a word for word fashion. For example, if you specify the phrase
     * "I want to speak to the manager." Amazon Transcribe attempts to match that specific phrase to the transcription.
     * </p>
     * 
     * @param transcriptFilterType
     *        Matches the phrase to the transcription output in a word for word fashion. For example, if you specify the
     *        phrase "I want to speak to the manager." Amazon Transcribe attempts to match that specific phrase to the
     *        transcription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptFilterType
     */

    public TranscriptFilter withTranscriptFilterType(String transcriptFilterType) {
        setTranscriptFilterType(transcriptFilterType);
        return this;
    }

    /**
     * <p>
     * Matches the phrase to the transcription output in a word for word fashion. For example, if you specify the phrase
     * "I want to speak to the manager." Amazon Transcribe attempts to match that specific phrase to the transcription.
     * </p>
     * 
     * @param transcriptFilterType
     *        Matches the phrase to the transcription output in a word for word fashion. For example, if you specify the
     *        phrase "I want to speak to the manager." Amazon Transcribe attempts to match that specific phrase to the
     *        transcription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TranscriptFilterType
     */

    public TranscriptFilter withTranscriptFilterType(TranscriptFilterType transcriptFilterType) {
        this.transcriptFilterType = transcriptFilterType.toString();
        return this;
    }

    /**
     * <p>
     * A time range, set in seconds, between two points in the call.
     * </p>
     * 
     * @param absoluteTimeRange
     *        A time range, set in seconds, between two points in the call.
     */

    public void setAbsoluteTimeRange(AbsoluteTimeRange absoluteTimeRange) {
        this.absoluteTimeRange = absoluteTimeRange;
    }

    /**
     * <p>
     * A time range, set in seconds, between two points in the call.
     * </p>
     * 
     * @return A time range, set in seconds, between two points in the call.
     */

    public AbsoluteTimeRange getAbsoluteTimeRange() {
        return this.absoluteTimeRange;
    }

    /**
     * <p>
     * A time range, set in seconds, between two points in the call.
     * </p>
     * 
     * @param absoluteTimeRange
     *        A time range, set in seconds, between two points in the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptFilter withAbsoluteTimeRange(AbsoluteTimeRange absoluteTimeRange) {
        setAbsoluteTimeRange(absoluteTimeRange);
        return this;
    }

    /**
     * <p>
     * An object that allows percentages to specify the proportion of the call where you would like to apply a filter.
     * For example, you can specify the first half of the call. You can also specify the period of time between halfway
     * through to three-quarters of the way through the call. Because the length of conversation can vary between calls,
     * you can apply relative time ranges across all calls.
     * </p>
     * 
     * @param relativeTimeRange
     *        An object that allows percentages to specify the proportion of the call where you would like to apply a
     *        filter. For example, you can specify the first half of the call. You can also specify the period of time
     *        between halfway through to three-quarters of the way through the call. Because the length of conversation
     *        can vary between calls, you can apply relative time ranges across all calls.
     */

    public void setRelativeTimeRange(RelativeTimeRange relativeTimeRange) {
        this.relativeTimeRange = relativeTimeRange;
    }

    /**
     * <p>
     * An object that allows percentages to specify the proportion of the call where you would like to apply a filter.
     * For example, you can specify the first half of the call. You can also specify the period of time between halfway
     * through to three-quarters of the way through the call. Because the length of conversation can vary between calls,
     * you can apply relative time ranges across all calls.
     * </p>
     * 
     * @return An object that allows percentages to specify the proportion of the call where you would like to apply a
     *         filter. For example, you can specify the first half of the call. You can also specify the period of time
     *         between halfway through to three-quarters of the way through the call. Because the length of conversation
     *         can vary between calls, you can apply relative time ranges across all calls.
     */

    public RelativeTimeRange getRelativeTimeRange() {
        return this.relativeTimeRange;
    }

    /**
     * <p>
     * An object that allows percentages to specify the proportion of the call where you would like to apply a filter.
     * For example, you can specify the first half of the call. You can also specify the period of time between halfway
     * through to three-quarters of the way through the call. Because the length of conversation can vary between calls,
     * you can apply relative time ranges across all calls.
     * </p>
     * 
     * @param relativeTimeRange
     *        An object that allows percentages to specify the proportion of the call where you would like to apply a
     *        filter. For example, you can specify the first half of the call. You can also specify the period of time
     *        between halfway through to three-quarters of the way through the call. Because the length of conversation
     *        can vary between calls, you can apply relative time ranges across all calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptFilter withRelativeTimeRange(RelativeTimeRange relativeTimeRange) {
        setRelativeTimeRange(relativeTimeRange);
        return this;
    }

    /**
     * <p>
     * Determines whether the customer or the agent is speaking the phrases that you've specified.
     * </p>
     * 
     * @param participantRole
     *        Determines whether the customer or the agent is speaking the phrases that you've specified.
     * @see ParticipantRole
     */

    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * <p>
     * Determines whether the customer or the agent is speaking the phrases that you've specified.
     * </p>
     * 
     * @return Determines whether the customer or the agent is speaking the phrases that you've specified.
     * @see ParticipantRole
     */

    public String getParticipantRole() {
        return this.participantRole;
    }

    /**
     * <p>
     * Determines whether the customer or the agent is speaking the phrases that you've specified.
     * </p>
     * 
     * @param participantRole
     *        Determines whether the customer or the agent is speaking the phrases that you've specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantRole
     */

    public TranscriptFilter withParticipantRole(String participantRole) {
        setParticipantRole(participantRole);
        return this;
    }

    /**
     * <p>
     * Determines whether the customer or the agent is speaking the phrases that you've specified.
     * </p>
     * 
     * @param participantRole
     *        Determines whether the customer or the agent is speaking the phrases that you've specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantRole
     */

    public TranscriptFilter withParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
        return this;
    }

    /**
     * <p>
     * If <code>TRUE</code>, the rule that you specify is applied to everything except for the phrases that you specify.
     * </p>
     * 
     * @param negate
     *        If <code>TRUE</code>, the rule that you specify is applied to everything except for the phrases that you
     *        specify.
     */

    public void setNegate(Boolean negate) {
        this.negate = negate;
    }

    /**
     * <p>
     * If <code>TRUE</code>, the rule that you specify is applied to everything except for the phrases that you specify.
     * </p>
     * 
     * @return If <code>TRUE</code>, the rule that you specify is applied to everything except for the phrases that you
     *         specify.
     */

    public Boolean getNegate() {
        return this.negate;
    }

    /**
     * <p>
     * If <code>TRUE</code>, the rule that you specify is applied to everything except for the phrases that you specify.
     * </p>
     * 
     * @param negate
     *        If <code>TRUE</code>, the rule that you specify is applied to everything except for the phrases that you
     *        specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptFilter withNegate(Boolean negate) {
        setNegate(negate);
        return this;
    }

    /**
     * <p>
     * If <code>TRUE</code>, the rule that you specify is applied to everything except for the phrases that you specify.
     * </p>
     * 
     * @return If <code>TRUE</code>, the rule that you specify is applied to everything except for the phrases that you
     *         specify.
     */

    public Boolean isNegate() {
        return this.negate;
    }

    /**
     * <p>
     * The phrases that you're specifying for the transcript filter to match.
     * </p>
     * 
     * @return The phrases that you're specifying for the transcript filter to match.
     */

    public java.util.List<String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The phrases that you're specifying for the transcript filter to match.
     * </p>
     * 
     * @param targets
     *        The phrases that you're specifying for the transcript filter to match.
     */

    public void setTargets(java.util.Collection<String> targets) {
        if (targets == null) {
            this.targets = null;
            return;
        }

        this.targets = new java.util.ArrayList<String>(targets);
    }

    /**
     * <p>
     * The phrases that you're specifying for the transcript filter to match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargets(java.util.Collection)} or {@link #withTargets(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param targets
     *        The phrases that you're specifying for the transcript filter to match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptFilter withTargets(String... targets) {
        if (this.targets == null) {
            setTargets(new java.util.ArrayList<String>(targets.length));
        }
        for (String ele : targets) {
            this.targets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The phrases that you're specifying for the transcript filter to match.
     * </p>
     * 
     * @param targets
     *        The phrases that you're specifying for the transcript filter to match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptFilter withTargets(java.util.Collection<String> targets) {
        setTargets(targets);
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
        if (getTranscriptFilterType() != null)
            sb.append("TranscriptFilterType: ").append(getTranscriptFilterType()).append(",");
        if (getAbsoluteTimeRange() != null)
            sb.append("AbsoluteTimeRange: ").append(getAbsoluteTimeRange()).append(",");
        if (getRelativeTimeRange() != null)
            sb.append("RelativeTimeRange: ").append(getRelativeTimeRange()).append(",");
        if (getParticipantRole() != null)
            sb.append("ParticipantRole: ").append(getParticipantRole()).append(",");
        if (getNegate() != null)
            sb.append("Negate: ").append(getNegate()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranscriptFilter == false)
            return false;
        TranscriptFilter other = (TranscriptFilter) obj;
        if (other.getTranscriptFilterType() == null ^ this.getTranscriptFilterType() == null)
            return false;
        if (other.getTranscriptFilterType() != null && other.getTranscriptFilterType().equals(this.getTranscriptFilterType()) == false)
            return false;
        if (other.getAbsoluteTimeRange() == null ^ this.getAbsoluteTimeRange() == null)
            return false;
        if (other.getAbsoluteTimeRange() != null && other.getAbsoluteTimeRange().equals(this.getAbsoluteTimeRange()) == false)
            return false;
        if (other.getRelativeTimeRange() == null ^ this.getRelativeTimeRange() == null)
            return false;
        if (other.getRelativeTimeRange() != null && other.getRelativeTimeRange().equals(this.getRelativeTimeRange()) == false)
            return false;
        if (other.getParticipantRole() == null ^ this.getParticipantRole() == null)
            return false;
        if (other.getParticipantRole() != null && other.getParticipantRole().equals(this.getParticipantRole()) == false)
            return false;
        if (other.getNegate() == null ^ this.getNegate() == null)
            return false;
        if (other.getNegate() != null && other.getNegate().equals(this.getNegate()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTranscriptFilterType() == null) ? 0 : getTranscriptFilterType().hashCode());
        hashCode = prime * hashCode + ((getAbsoluteTimeRange() == null) ? 0 : getAbsoluteTimeRange().hashCode());
        hashCode = prime * hashCode + ((getRelativeTimeRange() == null) ? 0 : getRelativeTimeRange().hashCode());
        hashCode = prime * hashCode + ((getParticipantRole() == null) ? 0 : getParticipantRole().hashCode());
        hashCode = prime * hashCode + ((getNegate() == null) ? 0 : getNegate().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        return hashCode;
    }

    @Override
    public TranscriptFilter clone() {
        try {
            return (TranscriptFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.TranscriptFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
