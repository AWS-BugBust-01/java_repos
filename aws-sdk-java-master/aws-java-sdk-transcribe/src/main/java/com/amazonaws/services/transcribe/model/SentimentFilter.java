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
 * An object that enables you to specify a particular customer or agent sentiment. If at least 50 percent of the
 * conversation turns (the back-and-forth between two speakers) in a specified time period match the specified
 * sentiment, Amazon Transcribe will consider the sentiment a match.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/SentimentFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SentimentFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array that enables you to specify sentiments for the customer or agent. You can specify one or more values.
     * </p>
     */
    private java.util.List<String> sentiments;
    /**
     * <p>
     * The time range, measured in seconds, of the sentiment.
     * </p>
     */
    private AbsoluteTimeRange absoluteTimeRange;
    /**
     * <p>
     * The time range, set in percentages, that correspond to proportion of the call.
     * </p>
     */
    private RelativeTimeRange relativeTimeRange;
    /**
     * <p>
     * A value that determines whether the sentiment belongs to the customer or the agent.
     * </p>
     */
    private String participantRole;
    /**
     * <p>
     * Set to <code>TRUE</code> to look for sentiments that weren't specified in the request.
     * </p>
     */
    private Boolean negate;

    /**
     * <p>
     * An array that enables you to specify sentiments for the customer or agent. You can specify one or more values.
     * </p>
     * 
     * @return An array that enables you to specify sentiments for the customer or agent. You can specify one or more
     *         values.
     * @see SentimentValue
     */

    public java.util.List<String> getSentiments() {
        return sentiments;
    }

    /**
     * <p>
     * An array that enables you to specify sentiments for the customer or agent. You can specify one or more values.
     * </p>
     * 
     * @param sentiments
     *        An array that enables you to specify sentiments for the customer or agent. You can specify one or more
     *        values.
     * @see SentimentValue
     */

    public void setSentiments(java.util.Collection<String> sentiments) {
        if (sentiments == null) {
            this.sentiments = null;
            return;
        }

        this.sentiments = new java.util.ArrayList<String>(sentiments);
    }

    /**
     * <p>
     * An array that enables you to specify sentiments for the customer or agent. You can specify one or more values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSentiments(java.util.Collection)} or {@link #withSentiments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sentiments
     *        An array that enables you to specify sentiments for the customer or agent. You can specify one or more
     *        values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SentimentValue
     */

    public SentimentFilter withSentiments(String... sentiments) {
        if (this.sentiments == null) {
            setSentiments(new java.util.ArrayList<String>(sentiments.length));
        }
        for (String ele : sentiments) {
            this.sentiments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that enables you to specify sentiments for the customer or agent. You can specify one or more values.
     * </p>
     * 
     * @param sentiments
     *        An array that enables you to specify sentiments for the customer or agent. You can specify one or more
     *        values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SentimentValue
     */

    public SentimentFilter withSentiments(java.util.Collection<String> sentiments) {
        setSentiments(sentiments);
        return this;
    }

    /**
     * <p>
     * An array that enables you to specify sentiments for the customer or agent. You can specify one or more values.
     * </p>
     * 
     * @param sentiments
     *        An array that enables you to specify sentiments for the customer or agent. You can specify one or more
     *        values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SentimentValue
     */

    public SentimentFilter withSentiments(SentimentValue... sentiments) {
        java.util.ArrayList<String> sentimentsCopy = new java.util.ArrayList<String>(sentiments.length);
        for (SentimentValue value : sentiments) {
            sentimentsCopy.add(value.toString());
        }
        if (getSentiments() == null) {
            setSentiments(sentimentsCopy);
        } else {
            getSentiments().addAll(sentimentsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The time range, measured in seconds, of the sentiment.
     * </p>
     * 
     * @param absoluteTimeRange
     *        The time range, measured in seconds, of the sentiment.
     */

    public void setAbsoluteTimeRange(AbsoluteTimeRange absoluteTimeRange) {
        this.absoluteTimeRange = absoluteTimeRange;
    }

    /**
     * <p>
     * The time range, measured in seconds, of the sentiment.
     * </p>
     * 
     * @return The time range, measured in seconds, of the sentiment.
     */

    public AbsoluteTimeRange getAbsoluteTimeRange() {
        return this.absoluteTimeRange;
    }

    /**
     * <p>
     * The time range, measured in seconds, of the sentiment.
     * </p>
     * 
     * @param absoluteTimeRange
     *        The time range, measured in seconds, of the sentiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SentimentFilter withAbsoluteTimeRange(AbsoluteTimeRange absoluteTimeRange) {
        setAbsoluteTimeRange(absoluteTimeRange);
        return this;
    }

    /**
     * <p>
     * The time range, set in percentages, that correspond to proportion of the call.
     * </p>
     * 
     * @param relativeTimeRange
     *        The time range, set in percentages, that correspond to proportion of the call.
     */

    public void setRelativeTimeRange(RelativeTimeRange relativeTimeRange) {
        this.relativeTimeRange = relativeTimeRange;
    }

    /**
     * <p>
     * The time range, set in percentages, that correspond to proportion of the call.
     * </p>
     * 
     * @return The time range, set in percentages, that correspond to proportion of the call.
     */

    public RelativeTimeRange getRelativeTimeRange() {
        return this.relativeTimeRange;
    }

    /**
     * <p>
     * The time range, set in percentages, that correspond to proportion of the call.
     * </p>
     * 
     * @param relativeTimeRange
     *        The time range, set in percentages, that correspond to proportion of the call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SentimentFilter withRelativeTimeRange(RelativeTimeRange relativeTimeRange) {
        setRelativeTimeRange(relativeTimeRange);
        return this;
    }

    /**
     * <p>
     * A value that determines whether the sentiment belongs to the customer or the agent.
     * </p>
     * 
     * @param participantRole
     *        A value that determines whether the sentiment belongs to the customer or the agent.
     * @see ParticipantRole
     */

    public void setParticipantRole(String participantRole) {
        this.participantRole = participantRole;
    }

    /**
     * <p>
     * A value that determines whether the sentiment belongs to the customer or the agent.
     * </p>
     * 
     * @return A value that determines whether the sentiment belongs to the customer or the agent.
     * @see ParticipantRole
     */

    public String getParticipantRole() {
        return this.participantRole;
    }

    /**
     * <p>
     * A value that determines whether the sentiment belongs to the customer or the agent.
     * </p>
     * 
     * @param participantRole
     *        A value that determines whether the sentiment belongs to the customer or the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantRole
     */

    public SentimentFilter withParticipantRole(String participantRole) {
        setParticipantRole(participantRole);
        return this;
    }

    /**
     * <p>
     * A value that determines whether the sentiment belongs to the customer or the agent.
     * </p>
     * 
     * @param participantRole
     *        A value that determines whether the sentiment belongs to the customer or the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParticipantRole
     */

    public SentimentFilter withParticipantRole(ParticipantRole participantRole) {
        this.participantRole = participantRole.toString();
        return this;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to look for sentiments that weren't specified in the request.
     * </p>
     * 
     * @param negate
     *        Set to <code>TRUE</code> to look for sentiments that weren't specified in the request.
     */

    public void setNegate(Boolean negate) {
        this.negate = negate;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to look for sentiments that weren't specified in the request.
     * </p>
     * 
     * @return Set to <code>TRUE</code> to look for sentiments that weren't specified in the request.
     */

    public Boolean getNegate() {
        return this.negate;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to look for sentiments that weren't specified in the request.
     * </p>
     * 
     * @param negate
     *        Set to <code>TRUE</code> to look for sentiments that weren't specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SentimentFilter withNegate(Boolean negate) {
        setNegate(negate);
        return this;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> to look for sentiments that weren't specified in the request.
     * </p>
     * 
     * @return Set to <code>TRUE</code> to look for sentiments that weren't specified in the request.
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
        if (getSentiments() != null)
            sb.append("Sentiments: ").append(getSentiments()).append(",");
        if (getAbsoluteTimeRange() != null)
            sb.append("AbsoluteTimeRange: ").append(getAbsoluteTimeRange()).append(",");
        if (getRelativeTimeRange() != null)
            sb.append("RelativeTimeRange: ").append(getRelativeTimeRange()).append(",");
        if (getParticipantRole() != null)
            sb.append("ParticipantRole: ").append(getParticipantRole()).append(",");
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

        if (obj instanceof SentimentFilter == false)
            return false;
        SentimentFilter other = (SentimentFilter) obj;
        if (other.getSentiments() == null ^ this.getSentiments() == null)
            return false;
        if (other.getSentiments() != null && other.getSentiments().equals(this.getSentiments()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSentiments() == null) ? 0 : getSentiments().hashCode());
        hashCode = prime * hashCode + ((getAbsoluteTimeRange() == null) ? 0 : getAbsoluteTimeRange().hashCode());
        hashCode = prime * hashCode + ((getRelativeTimeRange() == null) ? 0 : getRelativeTimeRange().hashCode());
        hashCode = prime * hashCode + ((getParticipantRole() == null) ? 0 : getParticipantRole().hashCode());
        hashCode = prime * hashCode + ((getNegate() == null) ? 0 : getNegate().hashCode());
        return hashCode;
    }

    @Override
    public SentimentFilter clone() {
        try {
            return (SentimentFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.SentimentFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
