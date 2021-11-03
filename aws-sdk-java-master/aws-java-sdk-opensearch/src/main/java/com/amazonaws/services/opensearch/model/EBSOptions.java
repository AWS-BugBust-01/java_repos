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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Options to enable, disable, and specify the properties of EBS storage volumes.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EBSOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether EBS-based storage is enabled.
     * </p>
     */
    private Boolean eBSEnabled;
    /**
     * <p>
     * The volume type for EBS-based storage.
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * Integer to specify the size of an EBS volume.
     * </p>
     */
    private Integer volumeSize;
    /**
     * <p>
     * The IOPD for a Provisioned IOPS EBS volume (SSD).
     * </p>
     */
    private Integer iops;

    /**
     * <p>
     * Whether EBS-based storage is enabled.
     * </p>
     * 
     * @param eBSEnabled
     *        Whether EBS-based storage is enabled.
     */

    public void setEBSEnabled(Boolean eBSEnabled) {
        this.eBSEnabled = eBSEnabled;
    }

    /**
     * <p>
     * Whether EBS-based storage is enabled.
     * </p>
     * 
     * @return Whether EBS-based storage is enabled.
     */

    public Boolean getEBSEnabled() {
        return this.eBSEnabled;
    }

    /**
     * <p>
     * Whether EBS-based storage is enabled.
     * </p>
     * 
     * @param eBSEnabled
     *        Whether EBS-based storage is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EBSOptions withEBSEnabled(Boolean eBSEnabled) {
        setEBSEnabled(eBSEnabled);
        return this;
    }

    /**
     * <p>
     * Whether EBS-based storage is enabled.
     * </p>
     * 
     * @return Whether EBS-based storage is enabled.
     */

    public Boolean isEBSEnabled() {
        return this.eBSEnabled;
    }

    /**
     * <p>
     * The volume type for EBS-based storage.
     * </p>
     * 
     * @param volumeType
     *        The volume type for EBS-based storage.
     * @see VolumeType
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The volume type for EBS-based storage.
     * </p>
     * 
     * @return The volume type for EBS-based storage.
     * @see VolumeType
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The volume type for EBS-based storage.
     * </p>
     * 
     * @param volumeType
     *        The volume type for EBS-based storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public EBSOptions withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The volume type for EBS-based storage.
     * </p>
     * 
     * @param volumeType
     *        The volume type for EBS-based storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public EBSOptions withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }

    /**
     * <p>
     * Integer to specify the size of an EBS volume.
     * </p>
     * 
     * @param volumeSize
     *        Integer to specify the size of an EBS volume.
     */

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    /**
     * <p>
     * Integer to specify the size of an EBS volume.
     * </p>
     * 
     * @return Integer to specify the size of an EBS volume.
     */

    public Integer getVolumeSize() {
        return this.volumeSize;
    }

    /**
     * <p>
     * Integer to specify the size of an EBS volume.
     * </p>
     * 
     * @param volumeSize
     *        Integer to specify the size of an EBS volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EBSOptions withVolumeSize(Integer volumeSize) {
        setVolumeSize(volumeSize);
        return this;
    }

    /**
     * <p>
     * The IOPD for a Provisioned IOPS EBS volume (SSD).
     * </p>
     * 
     * @param iops
     *        The IOPD for a Provisioned IOPS EBS volume (SSD).
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The IOPD for a Provisioned IOPS EBS volume (SSD).
     * </p>
     * 
     * @return The IOPD for a Provisioned IOPS EBS volume (SSD).
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The IOPD for a Provisioned IOPS EBS volume (SSD).
     * </p>
     * 
     * @param iops
     *        The IOPD for a Provisioned IOPS EBS volume (SSD).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EBSOptions withIops(Integer iops) {
        setIops(iops);
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
        if (getEBSEnabled() != null)
            sb.append("EBSEnabled: ").append(getEBSEnabled()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getVolumeSize() != null)
            sb.append("VolumeSize: ").append(getVolumeSize()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EBSOptions == false)
            return false;
        EBSOptions other = (EBSOptions) obj;
        if (other.getEBSEnabled() == null ^ this.getEBSEnabled() == null)
            return false;
        if (other.getEBSEnabled() != null && other.getEBSEnabled().equals(this.getEBSEnabled()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getVolumeSize() == null ^ this.getVolumeSize() == null)
            return false;
        if (other.getVolumeSize() != null && other.getVolumeSize().equals(this.getVolumeSize()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEBSEnabled() == null) ? 0 : getEBSEnabled().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getVolumeSize() == null) ? 0 : getVolumeSize().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        return hashCode;
    }

    @Override
    public EBSOptions clone() {
        try {
            return (EBSOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.EBSOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
