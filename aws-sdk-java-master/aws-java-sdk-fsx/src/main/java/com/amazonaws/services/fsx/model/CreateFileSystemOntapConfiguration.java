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
 * The ONTAP configuration properties of the FSx for NetApp ONTAP file system that you are creating.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystemOntapConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFileSystemOntapConfiguration implements Serializable, Cloneable, StructuredPojo {

    private Integer automaticBackupRetentionDays;

    private String dailyAutomaticBackupStartTime;
    /**
     * <p>
     * Specifies the ONTAP file system deployment type to use in creating the file system.
     * </p>
     */
    private String deploymentType;
    /**
     * <p>
     * Specifies the IP address range in which the endpoints to access your file system will be created. By default,
     * Amazon FSx selects an unused IP address range for you from the 198.19.* range.
     * </p>
     */
    private String endpointIpAddressRange;
    /**
     * <p>
     * The ONTAP administrative password for the <code>fsxadmin</code> user that you can use to administer your file
     * system using the ONTAP CLI and REST API.
     * </p>
     */
    private String fsxAdminPassword;
    /**
     * <p>
     * The SSD IOPS configuration for the Amazon FSx for NetApp ONTAP file system.
     * </p>
     */
    private DiskIopsConfiguration diskIopsConfiguration;

    private String preferredSubnetId;
    /**
     * <p>
     * Specifies the VPC route tables in which your file system's endpoints will be created. You should specify all VPC
     * route tables associated with the subnets in which your clients are located. By default, Amazon FSx selects your
     * VPC's default route table.
     * </p>
     */
    private java.util.List<String> routeTableIds;

    private Integer throughputCapacity;

    private String weeklyMaintenanceStartTime;

    /**
     * @param automaticBackupRetentionDays
     */

    public void setAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        this.automaticBackupRetentionDays = automaticBackupRetentionDays;
    }

    /**
     * @return
     */

    public Integer getAutomaticBackupRetentionDays() {
        return this.automaticBackupRetentionDays;
    }

    /**
     * @param automaticBackupRetentionDays
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOntapConfiguration withAutomaticBackupRetentionDays(Integer automaticBackupRetentionDays) {
        setAutomaticBackupRetentionDays(automaticBackupRetentionDays);
        return this;
    }

    /**
     * @param dailyAutomaticBackupStartTime
     */

    public void setDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        this.dailyAutomaticBackupStartTime = dailyAutomaticBackupStartTime;
    }

    /**
     * @return
     */

    public String getDailyAutomaticBackupStartTime() {
        return this.dailyAutomaticBackupStartTime;
    }

    /**
     * @param dailyAutomaticBackupStartTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOntapConfiguration withDailyAutomaticBackupStartTime(String dailyAutomaticBackupStartTime) {
        setDailyAutomaticBackupStartTime(dailyAutomaticBackupStartTime);
        return this;
    }

    /**
     * <p>
     * Specifies the ONTAP file system deployment type to use in creating the file system.
     * </p>
     * 
     * @param deploymentType
     *        Specifies the ONTAP file system deployment type to use in creating the file system.
     * @see OntapDeploymentType
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * Specifies the ONTAP file system deployment type to use in creating the file system.
     * </p>
     * 
     * @return Specifies the ONTAP file system deployment type to use in creating the file system.
     * @see OntapDeploymentType
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * Specifies the ONTAP file system deployment type to use in creating the file system.
     * </p>
     * 
     * @param deploymentType
     *        Specifies the ONTAP file system deployment type to use in creating the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OntapDeploymentType
     */

    public CreateFileSystemOntapConfiguration withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * Specifies the ONTAP file system deployment type to use in creating the file system.
     * </p>
     * 
     * @param deploymentType
     *        Specifies the ONTAP file system deployment type to use in creating the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OntapDeploymentType
     */

    public CreateFileSystemOntapConfiguration withDeploymentType(OntapDeploymentType deploymentType) {
        this.deploymentType = deploymentType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the IP address range in which the endpoints to access your file system will be created. By default,
     * Amazon FSx selects an unused IP address range for you from the 198.19.* range.
     * </p>
     * 
     * @param endpointIpAddressRange
     *        Specifies the IP address range in which the endpoints to access your file system will be created. By
     *        default, Amazon FSx selects an unused IP address range for you from the 198.19.* range.
     */

    public void setEndpointIpAddressRange(String endpointIpAddressRange) {
        this.endpointIpAddressRange = endpointIpAddressRange;
    }

    /**
     * <p>
     * Specifies the IP address range in which the endpoints to access your file system will be created. By default,
     * Amazon FSx selects an unused IP address range for you from the 198.19.* range.
     * </p>
     * 
     * @return Specifies the IP address range in which the endpoints to access your file system will be created. By
     *         default, Amazon FSx selects an unused IP address range for you from the 198.19.* range.
     */

    public String getEndpointIpAddressRange() {
        return this.endpointIpAddressRange;
    }

    /**
     * <p>
     * Specifies the IP address range in which the endpoints to access your file system will be created. By default,
     * Amazon FSx selects an unused IP address range for you from the 198.19.* range.
     * </p>
     * 
     * @param endpointIpAddressRange
     *        Specifies the IP address range in which the endpoints to access your file system will be created. By
     *        default, Amazon FSx selects an unused IP address range for you from the 198.19.* range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOntapConfiguration withEndpointIpAddressRange(String endpointIpAddressRange) {
        setEndpointIpAddressRange(endpointIpAddressRange);
        return this;
    }

    /**
     * <p>
     * The ONTAP administrative password for the <code>fsxadmin</code> user that you can use to administer your file
     * system using the ONTAP CLI and REST API.
     * </p>
     * 
     * @param fsxAdminPassword
     *        The ONTAP administrative password for the <code>fsxadmin</code> user that you can use to administer your
     *        file system using the ONTAP CLI and REST API.
     */

    public void setFsxAdminPassword(String fsxAdminPassword) {
        this.fsxAdminPassword = fsxAdminPassword;
    }

    /**
     * <p>
     * The ONTAP administrative password for the <code>fsxadmin</code> user that you can use to administer your file
     * system using the ONTAP CLI and REST API.
     * </p>
     * 
     * @return The ONTAP administrative password for the <code>fsxadmin</code> user that you can use to administer your
     *         file system using the ONTAP CLI and REST API.
     */

    public String getFsxAdminPassword() {
        return this.fsxAdminPassword;
    }

    /**
     * <p>
     * The ONTAP administrative password for the <code>fsxadmin</code> user that you can use to administer your file
     * system using the ONTAP CLI and REST API.
     * </p>
     * 
     * @param fsxAdminPassword
     *        The ONTAP administrative password for the <code>fsxadmin</code> user that you can use to administer your
     *        file system using the ONTAP CLI and REST API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOntapConfiguration withFsxAdminPassword(String fsxAdminPassword) {
        setFsxAdminPassword(fsxAdminPassword);
        return this;
    }

    /**
     * <p>
     * The SSD IOPS configuration for the Amazon FSx for NetApp ONTAP file system.
     * </p>
     * 
     * @param diskIopsConfiguration
     *        The SSD IOPS configuration for the Amazon FSx for NetApp ONTAP file system.
     */

    public void setDiskIopsConfiguration(DiskIopsConfiguration diskIopsConfiguration) {
        this.diskIopsConfiguration = diskIopsConfiguration;
    }

    /**
     * <p>
     * The SSD IOPS configuration for the Amazon FSx for NetApp ONTAP file system.
     * </p>
     * 
     * @return The SSD IOPS configuration for the Amazon FSx for NetApp ONTAP file system.
     */

    public DiskIopsConfiguration getDiskIopsConfiguration() {
        return this.diskIopsConfiguration;
    }

    /**
     * <p>
     * The SSD IOPS configuration for the Amazon FSx for NetApp ONTAP file system.
     * </p>
     * 
     * @param diskIopsConfiguration
     *        The SSD IOPS configuration for the Amazon FSx for NetApp ONTAP file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOntapConfiguration withDiskIopsConfiguration(DiskIopsConfiguration diskIopsConfiguration) {
        setDiskIopsConfiguration(diskIopsConfiguration);
        return this;
    }

    /**
     * @param preferredSubnetId
     */

    public void setPreferredSubnetId(String preferredSubnetId) {
        this.preferredSubnetId = preferredSubnetId;
    }

    /**
     * @return
     */

    public String getPreferredSubnetId() {
        return this.preferredSubnetId;
    }

    /**
     * @param preferredSubnetId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOntapConfiguration withPreferredSubnetId(String preferredSubnetId) {
        setPreferredSubnetId(preferredSubnetId);
        return this;
    }

    /**
     * <p>
     * Specifies the VPC route tables in which your file system's endpoints will be created. You should specify all VPC
     * route tables associated with the subnets in which your clients are located. By default, Amazon FSx selects your
     * VPC's default route table.
     * </p>
     * 
     * @return Specifies the VPC route tables in which your file system's endpoints will be created. You should specify
     *         all VPC route tables associated with the subnets in which your clients are located. By default, Amazon
     *         FSx selects your VPC's default route table.
     */

    public java.util.List<String> getRouteTableIds() {
        return routeTableIds;
    }

    /**
     * <p>
     * Specifies the VPC route tables in which your file system's endpoints will be created. You should specify all VPC
     * route tables associated with the subnets in which your clients are located. By default, Amazon FSx selects your
     * VPC's default route table.
     * </p>
     * 
     * @param routeTableIds
     *        Specifies the VPC route tables in which your file system's endpoints will be created. You should specify
     *        all VPC route tables associated with the subnets in which your clients are located. By default, Amazon FSx
     *        selects your VPC's default route table.
     */

    public void setRouteTableIds(java.util.Collection<String> routeTableIds) {
        if (routeTableIds == null) {
            this.routeTableIds = null;
            return;
        }

        this.routeTableIds = new java.util.ArrayList<String>(routeTableIds);
    }

    /**
     * <p>
     * Specifies the VPC route tables in which your file system's endpoints will be created. You should specify all VPC
     * route tables associated with the subnets in which your clients are located. By default, Amazon FSx selects your
     * VPC's default route table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRouteTableIds(java.util.Collection)} or {@link #withRouteTableIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param routeTableIds
     *        Specifies the VPC route tables in which your file system's endpoints will be created. You should specify
     *        all VPC route tables associated with the subnets in which your clients are located. By default, Amazon FSx
     *        selects your VPC's default route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOntapConfiguration withRouteTableIds(String... routeTableIds) {
        if (this.routeTableIds == null) {
            setRouteTableIds(new java.util.ArrayList<String>(routeTableIds.length));
        }
        for (String ele : routeTableIds) {
            this.routeTableIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the VPC route tables in which your file system's endpoints will be created. You should specify all VPC
     * route tables associated with the subnets in which your clients are located. By default, Amazon FSx selects your
     * VPC's default route table.
     * </p>
     * 
     * @param routeTableIds
     *        Specifies the VPC route tables in which your file system's endpoints will be created. You should specify
     *        all VPC route tables associated with the subnets in which your clients are located. By default, Amazon FSx
     *        selects your VPC's default route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOntapConfiguration withRouteTableIds(java.util.Collection<String> routeTableIds) {
        setRouteTableIds(routeTableIds);
        return this;
    }

    /**
     * @param throughputCapacity
     */

    public void setThroughputCapacity(Integer throughputCapacity) {
        this.throughputCapacity = throughputCapacity;
    }

    /**
     * @return
     */

    public Integer getThroughputCapacity() {
        return this.throughputCapacity;
    }

    /**
     * @param throughputCapacity
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOntapConfiguration withThroughputCapacity(Integer throughputCapacity) {
        setThroughputCapacity(throughputCapacity);
        return this;
    }

    /**
     * @param weeklyMaintenanceStartTime
     */

    public void setWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    /**
     * @return
     */

    public String getWeeklyMaintenanceStartTime() {
        return this.weeklyMaintenanceStartTime;
    }

    /**
     * @param weeklyMaintenanceStartTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemOntapConfiguration withWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        setWeeklyMaintenanceStartTime(weeklyMaintenanceStartTime);
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
        if (getAutomaticBackupRetentionDays() != null)
            sb.append("AutomaticBackupRetentionDays: ").append(getAutomaticBackupRetentionDays()).append(",");
        if (getDailyAutomaticBackupStartTime() != null)
            sb.append("DailyAutomaticBackupStartTime: ").append(getDailyAutomaticBackupStartTime()).append(",");
        if (getDeploymentType() != null)
            sb.append("DeploymentType: ").append(getDeploymentType()).append(",");
        if (getEndpointIpAddressRange() != null)
            sb.append("EndpointIpAddressRange: ").append(getEndpointIpAddressRange()).append(",");
        if (getFsxAdminPassword() != null)
            sb.append("FsxAdminPassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getDiskIopsConfiguration() != null)
            sb.append("DiskIopsConfiguration: ").append(getDiskIopsConfiguration()).append(",");
        if (getPreferredSubnetId() != null)
            sb.append("PreferredSubnetId: ").append(getPreferredSubnetId()).append(",");
        if (getRouteTableIds() != null)
            sb.append("RouteTableIds: ").append(getRouteTableIds()).append(",");
        if (getThroughputCapacity() != null)
            sb.append("ThroughputCapacity: ").append(getThroughputCapacity()).append(",");
        if (getWeeklyMaintenanceStartTime() != null)
            sb.append("WeeklyMaintenanceStartTime: ").append(getWeeklyMaintenanceStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFileSystemOntapConfiguration == false)
            return false;
        CreateFileSystemOntapConfiguration other = (CreateFileSystemOntapConfiguration) obj;
        if (other.getAutomaticBackupRetentionDays() == null ^ this.getAutomaticBackupRetentionDays() == null)
            return false;
        if (other.getAutomaticBackupRetentionDays() != null && other.getAutomaticBackupRetentionDays().equals(this.getAutomaticBackupRetentionDays()) == false)
            return false;
        if (other.getDailyAutomaticBackupStartTime() == null ^ this.getDailyAutomaticBackupStartTime() == null)
            return false;
        if (other.getDailyAutomaticBackupStartTime() != null
                && other.getDailyAutomaticBackupStartTime().equals(this.getDailyAutomaticBackupStartTime()) == false)
            return false;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getEndpointIpAddressRange() == null ^ this.getEndpointIpAddressRange() == null)
            return false;
        if (other.getEndpointIpAddressRange() != null && other.getEndpointIpAddressRange().equals(this.getEndpointIpAddressRange()) == false)
            return false;
        if (other.getFsxAdminPassword() == null ^ this.getFsxAdminPassword() == null)
            return false;
        if (other.getFsxAdminPassword() != null && other.getFsxAdminPassword().equals(this.getFsxAdminPassword()) == false)
            return false;
        if (other.getDiskIopsConfiguration() == null ^ this.getDiskIopsConfiguration() == null)
            return false;
        if (other.getDiskIopsConfiguration() != null && other.getDiskIopsConfiguration().equals(this.getDiskIopsConfiguration()) == false)
            return false;
        if (other.getPreferredSubnetId() == null ^ this.getPreferredSubnetId() == null)
            return false;
        if (other.getPreferredSubnetId() != null && other.getPreferredSubnetId().equals(this.getPreferredSubnetId()) == false)
            return false;
        if (other.getRouteTableIds() == null ^ this.getRouteTableIds() == null)
            return false;
        if (other.getRouteTableIds() != null && other.getRouteTableIds().equals(this.getRouteTableIds()) == false)
            return false;
        if (other.getThroughputCapacity() == null ^ this.getThroughputCapacity() == null)
            return false;
        if (other.getThroughputCapacity() != null && other.getThroughputCapacity().equals(this.getThroughputCapacity()) == false)
            return false;
        if (other.getWeeklyMaintenanceStartTime() == null ^ this.getWeeklyMaintenanceStartTime() == null)
            return false;
        if (other.getWeeklyMaintenanceStartTime() != null && other.getWeeklyMaintenanceStartTime().equals(this.getWeeklyMaintenanceStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomaticBackupRetentionDays() == null) ? 0 : getAutomaticBackupRetentionDays().hashCode());
        hashCode = prime * hashCode + ((getDailyAutomaticBackupStartTime() == null) ? 0 : getDailyAutomaticBackupStartTime().hashCode());
        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getEndpointIpAddressRange() == null) ? 0 : getEndpointIpAddressRange().hashCode());
        hashCode = prime * hashCode + ((getFsxAdminPassword() == null) ? 0 : getFsxAdminPassword().hashCode());
        hashCode = prime * hashCode + ((getDiskIopsConfiguration() == null) ? 0 : getDiskIopsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPreferredSubnetId() == null) ? 0 : getPreferredSubnetId().hashCode());
        hashCode = prime * hashCode + ((getRouteTableIds() == null) ? 0 : getRouteTableIds().hashCode());
        hashCode = prime * hashCode + ((getThroughputCapacity() == null) ? 0 : getThroughputCapacity().hashCode());
        hashCode = prime * hashCode + ((getWeeklyMaintenanceStartTime() == null) ? 0 : getWeeklyMaintenanceStartTime().hashCode());
        return hashCode;
    }

    @Override
    public CreateFileSystemOntapConfiguration clone() {
        try {
            return (CreateFileSystemOntapConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.CreateFileSystemOntapConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
