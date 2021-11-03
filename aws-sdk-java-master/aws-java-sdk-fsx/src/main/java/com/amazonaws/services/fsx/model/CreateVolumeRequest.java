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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateVolume" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVolumeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String clientRequestToken;
    /**
     * <p>
     * Specifies the type of volume to create; <code>ONTAP</code> is the only valid volume type.
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * Specifies the name of the volume you're creating.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the <code>ONTAP</code> configuration to use in creating the volume.
     * </p>
     */
    private CreateOntapVolumeConfiguration ontapConfiguration;

    private java.util.List<Tag> tags;

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Specifies the type of volume to create; <code>ONTAP</code> is the only valid volume type.
     * </p>
     * 
     * @param volumeType
     *        Specifies the type of volume to create; <code>ONTAP</code> is the only valid volume type.
     * @see VolumeType
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * Specifies the type of volume to create; <code>ONTAP</code> is the only valid volume type.
     * </p>
     * 
     * @return Specifies the type of volume to create; <code>ONTAP</code> is the only valid volume type.
     * @see VolumeType
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * Specifies the type of volume to create; <code>ONTAP</code> is the only valid volume type.
     * </p>
     * 
     * @param volumeType
     *        Specifies the type of volume to create; <code>ONTAP</code> is the only valid volume type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public CreateVolumeRequest withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of volume to create; <code>ONTAP</code> is the only valid volume type.
     * </p>
     * 
     * @param volumeType
     *        Specifies the type of volume to create; <code>ONTAP</code> is the only valid volume type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public CreateVolumeRequest withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the name of the volume you're creating.
     * </p>
     * 
     * @param name
     *        Specifies the name of the volume you're creating.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the name of the volume you're creating.
     * </p>
     * 
     * @return Specifies the name of the volume you're creating.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the name of the volume you're creating.
     * </p>
     * 
     * @param name
     *        Specifies the name of the volume you're creating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the <code>ONTAP</code> configuration to use in creating the volume.
     * </p>
     * 
     * @param ontapConfiguration
     *        Specifies the <code>ONTAP</code> configuration to use in creating the volume.
     */

    public void setOntapConfiguration(CreateOntapVolumeConfiguration ontapConfiguration) {
        this.ontapConfiguration = ontapConfiguration;
    }

    /**
     * <p>
     * Specifies the <code>ONTAP</code> configuration to use in creating the volume.
     * </p>
     * 
     * @return Specifies the <code>ONTAP</code> configuration to use in creating the volume.
     */

    public CreateOntapVolumeConfiguration getOntapConfiguration() {
        return this.ontapConfiguration;
    }

    /**
     * <p>
     * Specifies the <code>ONTAP</code> configuration to use in creating the volume.
     * </p>
     * 
     * @param ontapConfiguration
     *        Specifies the <code>ONTAP</code> configuration to use in creating the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withOntapConfiguration(CreateOntapVolumeConfiguration ontapConfiguration) {
        setOntapConfiguration(ontapConfiguration);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVolumeRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOntapConfiguration() != null)
            sb.append("OntapConfiguration: ").append(getOntapConfiguration()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVolumeRequest == false)
            return false;
        CreateVolumeRequest other = (CreateVolumeRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOntapConfiguration() == null ^ this.getOntapConfiguration() == null)
            return false;
        if (other.getOntapConfiguration() != null && other.getOntapConfiguration().equals(this.getOntapConfiguration()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOntapConfiguration() == null) ? 0 : getOntapConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateVolumeRequest clone() {
        return (CreateVolumeRequest) super.clone();
    }

}
