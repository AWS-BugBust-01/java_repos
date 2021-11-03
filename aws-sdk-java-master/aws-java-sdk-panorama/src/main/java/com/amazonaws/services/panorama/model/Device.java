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
package com.amazonaws.services.panorama.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/Device" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Device implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The device's ID.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * The device's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * When the device was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The device's provisioning status.
     * </p>
     */
    private String provisioningStatus;
    /**
     * <p>
     * When the device was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The device's lease expiration time.
     * </p>
     */
    private java.util.Date leaseExpirationTime;

    /**
     * <p>
     * The device's ID.
     * </p>
     * 
     * @param deviceId
     *        The device's ID.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The device's ID.
     * </p>
     * 
     * @return The device's ID.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The device's ID.
     * </p>
     * 
     * @param deviceId
     *        The device's ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * The device's name.
     * </p>
     * 
     * @param name
     *        The device's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The device's name.
     * </p>
     * 
     * @return The device's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The device's name.
     * </p>
     * 
     * @param name
     *        The device's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * When the device was created.
     * </p>
     * 
     * @param createdTime
     *        When the device was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * When the device was created.
     * </p>
     * 
     * @return When the device was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * When the device was created.
     * </p>
     * 
     * @param createdTime
     *        When the device was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The device's provisioning status.
     * </p>
     * 
     * @param provisioningStatus
     *        The device's provisioning status.
     * @see DeviceStatus
     */

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    /**
     * <p>
     * The device's provisioning status.
     * </p>
     * 
     * @return The device's provisioning status.
     * @see DeviceStatus
     */

    public String getProvisioningStatus() {
        return this.provisioningStatus;
    }

    /**
     * <p>
     * The device's provisioning status.
     * </p>
     * 
     * @param provisioningStatus
     *        The device's provisioning status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceStatus
     */

    public Device withProvisioningStatus(String provisioningStatus) {
        setProvisioningStatus(provisioningStatus);
        return this;
    }

    /**
     * <p>
     * The device's provisioning status.
     * </p>
     * 
     * @param provisioningStatus
     *        The device's provisioning status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceStatus
     */

    public Device withProvisioningStatus(DeviceStatus provisioningStatus) {
        this.provisioningStatus = provisioningStatus.toString();
        return this;
    }

    /**
     * <p>
     * When the device was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        When the device was updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * When the device was updated.
     * </p>
     * 
     * @return When the device was updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * When the device was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        When the device was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The device's lease expiration time.
     * </p>
     * 
     * @param leaseExpirationTime
     *        The device's lease expiration time.
     */

    public void setLeaseExpirationTime(java.util.Date leaseExpirationTime) {
        this.leaseExpirationTime = leaseExpirationTime;
    }

    /**
     * <p>
     * The device's lease expiration time.
     * </p>
     * 
     * @return The device's lease expiration time.
     */

    public java.util.Date getLeaseExpirationTime() {
        return this.leaseExpirationTime;
    }

    /**
     * <p>
     * The device's lease expiration time.
     * </p>
     * 
     * @param leaseExpirationTime
     *        The device's lease expiration time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Device withLeaseExpirationTime(java.util.Date leaseExpirationTime) {
        setLeaseExpirationTime(leaseExpirationTime);
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
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getProvisioningStatus() != null)
            sb.append("ProvisioningStatus: ").append(getProvisioningStatus()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getLeaseExpirationTime() != null)
            sb.append("LeaseExpirationTime: ").append(getLeaseExpirationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Device == false)
            return false;
        Device other = (Device) obj;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getProvisioningStatus() == null ^ this.getProvisioningStatus() == null)
            return false;
        if (other.getProvisioningStatus() != null && other.getProvisioningStatus().equals(this.getProvisioningStatus()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getLeaseExpirationTime() == null ^ this.getLeaseExpirationTime() == null)
            return false;
        if (other.getLeaseExpirationTime() != null && other.getLeaseExpirationTime().equals(this.getLeaseExpirationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getProvisioningStatus() == null) ? 0 : getProvisioningStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getLeaseExpirationTime() == null) ? 0 : getLeaseExpirationTime().hashCode());
        return hashCode;
    }

    @Override
    public Device clone() {
        try {
            return (Device) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.DeviceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
