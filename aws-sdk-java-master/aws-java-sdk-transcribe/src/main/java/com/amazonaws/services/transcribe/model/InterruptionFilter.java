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
 * An object that enables you to configure your category to be applied to call analytics jobs where either the customer
 * or agent was interrupted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/InterruptionFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InterruptionFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The duration of the interruption.
     * </p>
     */
    private Long threshold;
    /**
     * <p>
     * Indicates whether the caller or customer was interrupting.
     * </p>
     */
    private String participantRole;
    /**
     * <p>
     * An object you can use to specify a time range (in milliseconds) for when you'd want to find the interruption. For
     * example, you could search for an interruption between the 30,000 millisecond mark and the 45,000 millisecond
     * mark. You could also specify the time period as the first 15,000 milliseconds or the last 15,000 milliseconds.
     * </p>
     */
    private AbsoluteTimeRange absoluteTimeRange;
    /**
     * <p>
     * An object that allows percentages to specify the proportion of the call where there was a interruption. For
     * example, you can specify the first half of the call. You can also specify the period of time between halfway
     * through to three-quarters of the way through the call. Because the length of conversation can vary between calls,
     * you can apply relative time ranges across all calls.
     * </p>
     */
    private RelativeTimeRange relativeTimeRange;
    /**
     * <p>
     * Set to <code>TRUE</code> to look for a time period where there was no interruption.
     * </p>
     */
    private Boolean negate;

    /**
     * <p>
     * The duration of the interruption.
     * </p>
     * 
     * @param threshold
     *        The duration of the interruption.
     */

    public void setThreshold(Long threshold) {
        this.threshold = threshold;
    }

    /**
     * <p>
     * The duration of the interruption.
     * </p>
     * 
     * @return The duration of the interruption.
     */

    public Long getThreshold() {
        return this.threshold;
    }

    /**
     * <p>
     * The duration of the interruption.
     * </p>
     * 
     * @param threshold
     *        The duration of the interruption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InterruptionFilter withThreshold(Long threshold) {
        setThreshold(threshold);
        return this;
    }

    /**
     * <p>
     * Indicates whether the caller or customer was interrupting.
     * </p>
     * 
     * @param participantRole
     *        Indicates whether the caller or customer was interrupting.
     * @see ParticipantRole
     */

    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * <p>
     * Indicates whether the caller or customer was interrupting.
     * </p>
     * 
     * @return Indicates whether the caller or customer was interrupting.
     * @see ParticipantRole
     */

    public String getParticipantRole() {
        return this.participantRole;
    }

    /**
     * <p>
     * Indicates whether the caller or customer was interrupting.
     * </p>
     * 
     * @param participantRole
     *        Indicates whether the caller or customer was interrupting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantRole
     */

    public InterruptionFilter withParticipantRole(String participantRole) {
        setParticipantRole(participantRole);
        return this;
    }

    /**
     * <p>
     * Indicates whether the caller or customer was interrupting.
     * </p>
     * 
     * @param participantRole
     *        Indicates whether the caller or customer was interrupting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantRole
     */

    public InterruptionFilter withParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
        return this;
    }

    /**
     * <p>
     * An object you can use to specify a time range (in milliseconds) for when you'd want to find the interruption. For
     * example, you could search for an interruption between the 30,000 millisecond mark and the 45,000 millisecond
     * mark. You could also specify the time period as the first 15,000 milliseconds or the last 15,000 milliseconds.
     * </p>
     * 
     * @param absoluteTimeRange
     *        An object you can use to specify a time range (in milliseconds) for when you'd want to find the
     *        interruption. For example, you could search for an interruption between the 30,000 millisecond mark and
     *        the 45,000 millisecond mark. You could also specify the time period as the first 15,000 milliseconds or
     *        the last 15,000 milliseconds.
     */

    public void setAbsoluteTimeRange(AbsoluteTimeRange absoluteTimeRange) {
        this.absoluteTimeRange = absoluteTimeRange;
    }

    /**
     * <p>
     * An object you can use to specify a time range (in milliseconds) for when you'd want to find the interruption. For
     * example, you could search for an interruption between the 30,000 millisecond mark and the 45,000 millisecond
     * mark. You could also specify the time period as the first 15,000 milliseconds or the last 15,000 milliseconds.
     * </p>
     * 
     * @return An object you can use to specify a time range (in milliseconds) for when you'd want to find the
     *         interruption. For example, you could search for an interruption between the 30,000 millisecond mark and
     *         the 45,000 millisecond mark. You could also specify the time period as the first 15,000 milliseconds or
     *         the last 15,000 milliseconds.
     */

    public AbsoluteTimeRange getAbsoluteTimeRange() {
        return this.absoluteTimeRange;
    }

    /**
     * <p>
     * An object you can use to specify a time range (in milliseconds) for when you'd want to find the interruption. For
     * example, you could search for an interruption between the 30,000 millisecond mark and the 45,000 millisecond
     * mark. You could also specify the time period as the first 15,000 milliseconds or the last 15,000 milliseconds.
     * </p>
     * 
     * @param absoluteTimeRange
     *        An object you can use to specify a time range (in milliseconds) for when you'd want to find the
     *        interruption. For example, you could search for an interruption between the 30,000 millisecond mark and
     *        the 45,000 millisecond mark. You could also specify the time period as the first 15,000 milliseconds or
     *        the last 15,000 milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InterruptionFilter withAbsoluteTimeRange(AbsoluteTimeRange absoluteTimeRange) {
        setAbsoluteTimeRange(absoluteTimeRange);
        return this;
    }

    /**
     * <p>
     * An object that allows percentages to specify the proportion of the call where there was a interruption. For
     * example, you can specify the first half of the call. You can also specify the period of time between halfway
     * through to three-quarters of the way through the call. Because the length of conversation can vary between calls,
     * you can apply relative time ranges across all calls.
     * </p>
     * 
     * @param relativeTimeRange
     *        An object that allows percentages to specify the proportion of the call where there was a interruption.
     *        For example, you can specify the first half of the call. You can also specify the period of time between
     *        halfway through to three-quarters of the way through the call. Because the length of conversation can vary
     *        between calls, you can apply relative time ranges across all calls.
     */

    public void setRelativeTimeRange(RelativeTimeRange relativeTimeRange) {
        this.relativeTimeRange = relativeTimeRange;
    }

    /**
     * <p>
     * An object that allows percentages to specify the proportion of the call where there was a interruption. For
     * example, you can specify the first half of the call. You can also specify the period of time between halfway
     * through to three-quarters of the way through the call. Because the length of conversation can vary between calls,
     * you can apply relative time ranges across all calls.
     * </p>
     * 
     * @return An object that allows percentages to specify the proportion of the call where there was a interruption.
     *         For example, you can specify the first half of the call. You can also specify the period of time between
     *         halfway through to three-quarters of the way through the call. Because the length of conversation can
     *         vary between calls, you can apply relative time ranges across all calls.
     */

    public RelativeTimeRange getRelativeTimeRange() {
        return this.relativeTimeRange;
    }

    /**
     * <p>
     * An object that allows percentages to specify the proportion of the call where there was a interruption. For
     * example, you can specify the first half of the call. You can also specify the period of time between halfway
     * through to three-quarters of the way through the call. Because the length of conversation can vary between calls,
     * you can apply relative time ranges across all calls.
     * </p>
     * 
     * @param relativeTimeRange
     *        An object that allows percentages to specify the proportion of the call where there was a interruption.
     *        For example, you can specify the first half of the call. You can also specify the period of time between
     *        halfway through to three-quarters of the way through the call. Because the length of conversation can vary
     *        between calls, you can apply relative time ranges across all calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InterruptionFilter withRelativeTimeRange(RelativeTimeRange relativeTimeRange) {
        setRelativeTimeRange(relativeTimeRange);
        return this;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to look for a time period where there was no interruption.
     * </p>
     * 
     * @param negate
     *        Set to <code>TRUE</code> to look for a time period where there was no interruption.
     */

    public void setNegate(Boolean negate) {
        this.negate = negate;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to look for a time period where there was no interruption.
     * </p>
     * 
     * @return Set to <code>TRUE</code> to look for a time period where there was no interruption.
     */

    public Boolean getNegate() {
        return this.negate;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to look for a time period where there was no interruption.
     * </p>
     * 
     * @param negate
     *        Set to <code>TRUE</code> to look for a time period where there was no interruption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InterruptionFilter withNegate(Boolean negate) {
        setNegate(negate);
        return this;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to look for a time period where there was no interruption.
     * </p>
     * 
     * @return Set to <code>TRUE</code> to look for a time period where there was no interruption.
     */

    public Boolean isNegate() {
        return this.negate;
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
        if (getThreshold() != null)
            sb.append("Threshold: ").append(getThreshold()).append(",");
        if (getParticipantRole() != null)
            sb.append("ParticipantRole: ").append(getParticipantRole()).append(",");
        if (getAbsoluteTimeRange() != null)
            sb.append("AbsoluteTimeRange: ").append(getAbsoluteTimeRange()).append(",");
        if (getRelativeTimeRange() != null)
            sb.append("RelativeTimeRange: ").append(getRelativeTimeRange()).append(",");
        if (getNegate() != null)
            sb.append("Negate: ").append(getNegate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InterruptionFilter == false)
            return false;
        InterruptionFilter other = (InterruptionFilter) obj;
        if (other.getThreshold() == null ^ this.getThreshold() == null)
            return false;
        if (other.getThreshold() != null && other.getThreshold().equals(this.getThreshold()) == false)
            return false;
        if (other.getParticipantRole() == null ^ this.getParticipantRole() == null)
            return false;
        if (other.getParticipantRole() != null && other.getParticipantRole().equals(this.getParticipantRole()) == false)
            return false;
        if (other.getAbsoluteTimeRange() == null ^ this.getAbsoluteTimeRange() == null)
            return false;
        if (other.getAbsoluteTimeRange() != null && other.getAbsoluteTimeRange().equals(this.getAbsoluteTimeRange()) == false)
            return false;
        if (other.getRelativeTimeRange() == null ^ this.getRelativeTimeRange() == null)
            return false;
        if (other.getRelativeTimeRange() != null && other.getRelativeTimeRange().equals(this.getRelativeTimeRange()) == false)
            return false;
        if (other.getNegate() == null ^ this.getNegate() == null)
            return false;
        if (other.getNegate() != null && other.getNegate().equals(this.getNegate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThreshold() == null) ? 0 : getThreshold().hashCode());
        hashCode = prime * hashCode + ((getParticipantRole() == null) ? 0 : getParticipantRole().hashCode());
        hashCode = prime * hashCode + ((getAbsoluteTimeRange() == null) ? 0 : getAbsoluteTimeRange().hashCode());
        hashCode = prime * hashCode + ((getRelativeTimeRange() == null) ? 0 : getRelativeTimeRange().hashCode());
        hashCode = prime * hashCode + ((getNegate() == null) ? 0 : getNegate().hashCode());
        return hashCode;
    }

    @Override
    public InterruptionFilter clone() {
        try {
            return (InterruptionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.InterruptionFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
