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
 * The content artifact object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/ContentArtifactsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContentArtifactsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether the content artifact is enabled or disabled.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The MUX type of the artifact configuration.
     * </p>
     */
    private String muxType;

    /**
     * <p>
     * Indicates whether the content artifact is enabled or disabled.
     * </p>
     * 
     * @param state
     *        Indicates whether the content artifact is enabled or disabled.
     * @see ArtifactsState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Indicates whether the content artifact is enabled or disabled.
     * </p>
     * 
     * @return Indicates whether the content artifact is enabled or disabled.
     * @see ArtifactsState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Indicates whether the content artifact is enabled or disabled.
     * </p>
     * 
     * @param state
     *        Indicates whether the content artifact is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactsState
     */

    public ContentArtifactsConfiguration withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Indicates whether the content artifact is enabled or disabled.
     * </p>
     * 
     * @param state
     *        Indicates whether the content artifact is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArtifactsState
     */

    public ContentArtifactsConfiguration withState(ArtifactsState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The MUX type of the artifact configuration.
     * </p>
     * 
     * @param muxType
     *        The MUX type of the artifact configuration.
     * @see ContentMuxType
     */

    public void setMuxType(String muxType) {
        this.muxType = muxType;
    }

    /**
     * <p>
     * The MUX type of the artifact configuration.
     * </p>
     * 
     * @return The MUX type of the artifact configuration.
     * @see ContentMuxType
     */

    public String getMuxType() {
        return this.muxType;
    }

    /**
     * <p>
     * The MUX type of the artifact configuration.
     * </p>
     * 
     * @param muxType
     *        The MUX type of the artifact configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentMuxType
     */

    public ContentArtifactsConfiguration withMuxType(String muxType) {
        setMuxType(muxType);
        return this;
    }

    /**
     * <p>
     * The MUX type of the artifact configuration.
     * </p>
     * 
     * @param muxType
     *        The MUX type of the artifact configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContentMuxType
     */

    public ContentArtifactsConfiguration withMuxType(ContentMuxType muxType) {
        this.muxType = muxType.toString();
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getMuxType() != null)
            sb.append("MuxType: ").append(getMuxType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContentArtifactsConfiguration == false)
            return false;
        ContentArtifactsConfiguration other = (ContentArtifactsConfiguration) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getMuxType() == null ^ this.getMuxType() == null)
            return false;
        if (other.getMuxType() != null && other.getMuxType().equals(this.getMuxType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getMuxType() == null) ? 0 : getMuxType().hashCode());
        return hashCode;
    }

    @Override
    public ContentArtifactsConfiguration clone() {
        try {
            return (ContentArtifactsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.ContentArtifactsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
