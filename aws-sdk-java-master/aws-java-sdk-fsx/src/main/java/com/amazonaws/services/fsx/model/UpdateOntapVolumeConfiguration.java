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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used to specify changes to the ONTAP configuration for the volume you are updating.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/UpdateOntapVolumeConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateOntapVolumeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the location in the SVM's namespace where the volume is mounted. The <code>JunctionPath</code> must
     * have a leading forward slash, such as <code>/vol3</code>.
     * </p>
     */
    private String junctionPath;
    /**
     * <p>
     * The security style for the volume, which can be <code>UNIX</code>. <code>NTFS</code>, or <code>MIXED</code>.
     * </p>
     */
    private String securityStyle;
    /**
     * <p>
     * Specifies the size of the volume in megabytes.
     * </p>
     */
    private Integer sizeInMegabytes;
    /**
     * <p>
     * Default is <code>false</code>. Set to true to enable the deduplication, compression, and compaction storage
     * efficiency features on the volume.
     * </p>
     */
    private Boolean storageEfficiencyEnabled;
    /**
     * <p>
     * Update the volume's data tiering policy.
     * </p>
     */
    private TieringPolicy tieringPolicy;

    /**
     * <p>
     * Specifies the location in the SVM's namespace where the volume is mounted. The <code>JunctionPath</code> must
     * have a leading forward slash, such as <code>/vol3</code>.
     * </p>
     * 
     * @param junctionPath
     *        Specifies the location in the SVM's namespace where the volume is mounted. The <code>JunctionPath</code>
     *        must have a leading forward slash, such as <code>/vol3</code>.
     */

    public void setJunctionPath(String junctionPath) {
        this.junctionPath = junctionPath;
    }

    /**
     * <p>
     * Specifies the location in the SVM's namespace where the volume is mounted. The <code>JunctionPath</code> must
     * have a leading forward slash, such as <code>/vol3</code>.
     * </p>
     * 
     * @return Specifies the location in the SVM's namespace where the volume is mounted. The <code>JunctionPath</code>
     *         must have a leading forward slash, such as <code>/vol3</code>.
     */

    public String getJunctionPath() {
        return this.junctionPath;
    }

    /**
     * <p>
     * Specifies the location in the SVM's namespace where the volume is mounted. The <code>JunctionPath</code> must
     * have a leading forward slash, such as <code>/vol3</code>.
     * </p>
     * 
     * @param junctionPath
     *        Specifies the location in the SVM's namespace where the volume is mounted. The <code>JunctionPath</code>
     *        must have a leading forward slash, such as <code>/vol3</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOntapVolumeConfiguration withJunctionPath(String junctionPath) {
        setJunctionPath(junctionPath);
        return this;
    }

    /**
     * <p>
     * The security style for the volume, which can be <code>UNIX</code>. <code>NTFS</code>, or <code>MIXED</code>.
     * </p>
     * 
     * @param securityStyle
     *        The security style for the volume, which can be <code>UNIX</code>. <code>NTFS</code>, or
     *        <code>MIXED</code>.
     * @see SecurityStyle
     */

    public void setSecurityStyle(String securityStyle) {
        this.securityStyle = securityStyle;
    }

    /**
     * <p>
     * The security style for the volume, which can be <code>UNIX</code>. <code>NTFS</code>, or <code>MIXED</code>.
     * </p>
     * 
     * @return The security style for the volume, which can be <code>UNIX</code>. <code>NTFS</code>, or
     *         <code>MIXED</code>.
     * @see SecurityStyle
     */

    public String getSecurityStyle() {
        return this.securityStyle;
    }

    /**
     * <p>
     * The security style for the volume, which can be <code>UNIX</code>. <code>NTFS</code>, or <code>MIXED</code>.
     * </p>
     * 
     * @param securityStyle
     *        The security style for the volume, which can be <code>UNIX</code>. <code>NTFS</code>, or
     *        <code>MIXED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityStyle
     */

    public UpdateOntapVolumeConfiguration withSecurityStyle(String securityStyle) {
        setSecurityStyle(securityStyle);
        return this;
    }

    /**
     * <p>
     * The security style for the volume, which can be <code>UNIX</code>. <code>NTFS</code>, or <code>MIXED</code>.
     * </p>
     * 
     * @param securityStyle
     *        The security style for the volume, which can be <code>UNIX</code>. <code>NTFS</code>, or
     *        <code>MIXED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SecurityStyle
     */

    public UpdateOntapVolumeConfiguration withSecurityStyle(SecurityStyle securityStyle) {
        this.securityStyle = securityStyle.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the size of the volume in megabytes.
     * </p>
     * 
     * @param sizeInMegabytes
     *        Specifies the size of the volume in megabytes.
     */

    public void setSizeInMegabytes(Integer sizeInMegabytes) {
        this.sizeInMegabytes = sizeInMegabytes;
    }

    /**
     * <p>
     * Specifies the size of the volume in megabytes.
     * </p>
     * 
     * @return Specifies the size of the volume in megabytes.
     */

    public Integer getSizeInMegabytes() {
        return this.sizeInMegabytes;
    }

    /**
     * <p>
     * Specifies the size of the volume in megabytes.
     * </p>
     * 
     * @param sizeInMegabytes
     *        Specifies the size of the volume in megabytes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOntapVolumeConfiguration withSizeInMegabytes(Integer sizeInMegabytes) {
        setSizeInMegabytes(sizeInMegabytes);
        return this;
    }

    /**
     * <p>
     * Default is <code>false</code>. Set to true to enable the deduplication, compression, and compaction storage
     * efficiency features on the volume.
     * </p>
     * 
     * @param storageEfficiencyEnabled
     *        Default is <code>false</code>. Set to true to enable the deduplication, compression, and compaction
     *        storage efficiency features on the volume.
     */

    public void setStorageEfficiencyEnabled(Boolean storageEfficiencyEnabled) {
        this.storageEfficiencyEnabled = storageEfficiencyEnabled;
    }

    /**
     * <p>
     * Default is <code>false</code>. Set to true to enable the deduplication, compression, and compaction storage
     * efficiency features on the volume.
     * </p>
     * 
     * @return Default is <code>false</code>. Set to true to enable the deduplication, compression, and compaction
     *         storage efficiency features on the volume.
     */

    public Boolean getStorageEfficiencyEnabled() {
        return this.storageEfficiencyEnabled;
    }

    /**
     * <p>
     * Default is <code>false</code>. Set to true to enable the deduplication, compression, and compaction storage
     * efficiency features on the volume.
     * </p>
     * 
     * @param storageEfficiencyEnabled
     *        Default is <code>false</code>. Set to true to enable the deduplication, compression, and compaction
     *        storage efficiency features on the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOntapVolumeConfiguration withStorageEfficiencyEnabled(Boolean storageEfficiencyEnabled) {
        setStorageEfficiencyEnabled(storageEfficiencyEnabled);
        return this;
    }

    /**
     * <p>
     * Default is <code>false</code>. Set to true to enable the deduplication, compression, and compaction storage
     * efficiency features on the volume.
     * </p>
     * 
     * @return Default is <code>false</code>. Set to true to enable the deduplication, compression, and compaction
     *         storage efficiency features on the volume.
     */

    public Boolean isStorageEfficiencyEnabled() {
        return this.storageEfficiencyEnabled;
    }

    /**
     * <p>
     * Update the volume's data tiering policy.
     * </p>
     * 
     * @param tieringPolicy
     *        Update the volume's data tiering policy.
     */

    public void setTieringPolicy(TieringPolicy tieringPolicy) {
        this.tieringPolicy = tieringPolicy;
    }

    /**
     * <p>
     * Update the volume's data tiering policy.
     * </p>
     * 
     * @return Update the volume's data tiering policy.
     */

    public TieringPolicy getTieringPolicy() {
        return this.tieringPolicy;
    }

    /**
     * <p>
     * Update the volume's data tiering policy.
     * </p>
     * 
     * @param tieringPolicy
     *        Update the volume's data tiering policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOntapVolumeConfiguration withTieringPolicy(TieringPolicy tieringPolicy) {
        setTieringPolicy(tieringPolicy);
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
        if (getJunctionPath() != null)
            sb.append("JunctionPath: ").append(getJunctionPath()).append(",");
        if (getSecurityStyle() != null)
            sb.append("SecurityStyle: ").append(getSecurityStyle()).append(",");
        if (getSizeInMegabytes() != null)
            sb.append("SizeInMegabytes: ").append(getSizeInMegabytes()).append(",");
        if (getStorageEfficiencyEnabled() != null)
            sb.append("StorageEfficiencyEnabled: ").append(getStorageEfficiencyEnabled()).append(",");
        if (getTieringPolicy() != null)
            sb.append("TieringPolicy: ").append(getTieringPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateOntapVolumeConfiguration == false)
            return false;
        UpdateOntapVolumeConfiguration other = (UpdateOntapVolumeConfiguration) obj;
        if (other.getJunctionPath() == null ^ this.getJunctionPath() == null)
            return false;
        if (other.getJunctionPath() != null && other.getJunctionPath().equals(this.getJunctionPath()) == false)
            return false;
        if (other.getSecurityStyle() == null ^ this.getSecurityStyle() == null)
            return false;
        if (other.getSecurityStyle() != null && other.getSecurityStyle().equals(this.getSecurityStyle()) == false)
            return false;
        if (other.getSizeInMegabytes() == null ^ this.getSizeInMegabytes() == null)
            return false;
        if (other.getSizeInMegabytes() != null && other.getSizeInMegabytes().equals(this.getSizeInMegabytes()) == false)
            return false;
        if (other.getStorageEfficiencyEnabled() == null ^ this.getStorageEfficiencyEnabled() == null)
            return false;
        if (other.getStorageEfficiencyEnabled() != null && other.getStorageEfficiencyEnabled().equals(this.getStorageEfficiencyEnabled()) == false)
            return false;
        if (other.getTieringPolicy() == null ^ this.getTieringPolicy() == null)
            return false;
        if (other.getTieringPolicy() != null && other.getTieringPolicy().equals(this.getTieringPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJunctionPath() == null) ? 0 : getJunctionPath().hashCode());
        hashCode = prime * hashCode + ((getSecurityStyle() == null) ? 0 : getSecurityStyle().hashCode());
        hashCode = prime * hashCode + ((getSizeInMegabytes() == null) ? 0 : getSizeInMegabytes().hashCode());
        hashCode = prime * hashCode + ((getStorageEfficiencyEnabled() == null) ? 0 : getStorageEfficiencyEnabled().hashCode());
        hashCode = prime * hashCode + ((getTieringPolicy() == null) ? 0 : getTieringPolicy().hashCode());
        return hashCode;
    }

    @Override
    public UpdateOntapVolumeConfiguration clone() {
        try {
            return (UpdateOntapVolumeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.UpdateOntapVolumeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
