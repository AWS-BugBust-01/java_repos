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
package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-messaging-2021-05-15/PutChannelMembershipPreferences"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutChannelMembershipPreferencesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     */
    private String channelArn;

    private Identity member;
    /**
     * <p>
     * The ARN and metadata of the member being added.
     * </p>
     */
    private ChannelMembershipPreferences preferences;

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel.
     */

    public void setChannelArn(String channelArn) {
        this.channelArn = channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @return The ARN of the channel.
     */

    public String getChannelArn() {
        return this.channelArn;
    }

    /**
     * <p>
     * The ARN of the channel.
     * </p>
     * 
     * @param channelArn
     *        The ARN of the channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutChannelMembershipPreferencesResult withChannelArn(String channelArn) {
        setChannelArn(channelArn);
        return this;
    }

    /**
     * @param member
     */

    public void setMember(Identity member) {
        this.member = member;
    }

    /**
     * @return
     */

    public Identity getMember() {
        return this.member;
    }

    /**
     * @param member
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutChannelMembershipPreferencesResult withMember(Identity member) {
        setMember(member);
        return this;
    }

    /**
     * <p>
     * The ARN and metadata of the member being added.
     * </p>
     * 
     * @param preferences
     *        The ARN and metadata of the member being added.
     */

    public void setPreferences(ChannelMembershipPreferences preferences) {
        this.preferences = preferences;
    }

    /**
     * <p>
     * The ARN and metadata of the member being added.
     * </p>
     * 
     * @return The ARN and metadata of the member being added.
     */

    public ChannelMembershipPreferences getPreferences() {
        return this.preferences;
    }

    /**
     * <p>
     * The ARN and metadata of the member being added.
     * </p>
     * 
     * @param preferences
     *        The ARN and metadata of the member being added.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutChannelMembershipPreferencesResult withPreferences(ChannelMembershipPreferences preferences) {
        setPreferences(preferences);
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
        if (getChannelArn() != null)
            sb.append("ChannelArn: ").append(getChannelArn()).append(",");
        if (getMember() != null)
            sb.append("Member: ").append(getMember()).append(",");
        if (getPreferences() != null)
            sb.append("Preferences: ").append(getPreferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutChannelMembershipPreferencesResult == false)
            return false;
        PutChannelMembershipPreferencesResult other = (PutChannelMembershipPreferencesResult) obj;
        if (other.getChannelArn() == null ^ this.getChannelArn() == null)
            return false;
        if (other.getChannelArn() != null && other.getChannelArn().equals(this.getChannelArn()) == false)
            return false;
        if (other.getMember() == null ^ this.getMember() == null)
            return false;
        if (other.getMember() != null && other.getMember().equals(this.getMember()) == false)
            return false;
        if (other.getPreferences() == null ^ this.getPreferences() == null)
            return false;
        if (other.getPreferences() != null && other.getPreferences().equals(this.getPreferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelArn() == null) ? 0 : getChannelArn().hashCode());
        hashCode = prime * hashCode + ((getMember() == null) ? 0 : getMember().hashCode());
        hashCode = prime * hashCode + ((getPreferences() == null) ? 0 : getPreferences().hashCode());
        return hashCode;
    }

    @Override
    public PutChannelMembershipPreferencesResult clone() {
        try {
            return (PutChannelMembershipPreferencesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
