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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * When you specify multiple parameters, you get instance types that satisfy all of the specified parameters. If you
 * specify multiple values for a parameter, you get instance types that satisfy any of the specified values.
 * </p>
 * <p>
 * Represents requirements for the types of instances that can be launched. You must specify <code>VCpuCount</code> and
 * <code>MemoryMiB</code>, but all other parameters are optional. For more information, see <a
 * href="https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-instance-type-requirements.html">Creating an
 * Auto Scaling group using attribute-based instance type selection</a> in the <i>Amazon EC2 Auto Scaling User
 * Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/InstanceRequirements" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceRequirements implements Serializable, Cloneable {

    /**
     * <p>
     * The minimum and maximum number of vCPUs for an instance type.
     * </p>
     */
    private VCpuCountRequest vCpuCount;
    /**
     * <p>
     * The minimum and maximum instance memory size for an instance type, in MiB.
     * </p>
     */
    private MemoryMiBRequest memoryMiB;
    /**
     * <p>
     * Lists which specific CPU manufacturers to include.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with Intel CPUs, specify <code>intel</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD CPUs, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Don't confuse the CPU hardware manufacturer with the CPU hardware architecture. Instances will be launched with a
     * compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in your launch template.
     * </p>
     * </note>
     * <p>
     * Default: Any manufacturer
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> cpuManufacturers;
    /**
     * <p>
     * The minimum and maximum amount of memory per vCPU for an instance type, in GiB.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     */
    private MemoryGiBPerVCpuRequest memoryGiBPerVCpu;
    /**
     * <p>
     * Lists which instance types to exclude. You can use strings with one or more wild cards, represented by an
     * asterisk (<code>*</code>). The following are examples: <code>c5*</code>, <code>m5a.*</code>, <code>r*</code>,
     * <code>*3*</code>.
     * </p>
     * <p>
     * For example, if you specify <code>c5*</code>, you are excluding the entire C5 instance family, which includes all
     * C5a and C5n instance types. If you specify <code>m5a.*</code>, you are excluding all the M5a instance types, but
     * not the M5n instance types.
     * </p>
     * <p>
     * Default: No excluded instance types
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> excludedInstanceTypes;
    /**
     * <p>
     * Indicates whether current or previous generation instance types are included.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For current generation instance types, specify <code>current</code>. The current generation includes EC2 instance
     * types currently recommended for use. This typically includes the latest two to three generations in each instance
     * family. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For previous generation instance types, specify <code>previous</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any current or previous generation
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceGenerations;
    /**
     * <p>
     * The price protection threshold for Spot Instances. This is the maximum you’ll pay for a Spot Instance, expressed
     * as a percentage higher than the cheapest M, C, or R instance type with your specified attributes. When Amazon EC2
     * Auto Scaling selects instance types with your attributes, we will exclude instance types whose price is higher
     * than your threshold. The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage.
     * To turn off price protection, specify a high value, such as <code>999999</code>.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     */
    private Integer spotMaxPricePercentageOverLowestPrice;
    /**
     * <p>
     * The price protection threshold for On-Demand Instances. This is the maximum you’ll pay for an On-Demand Instance,
     * expressed as a percentage higher than the cheapest M, C, or R instance type with your specified attributes. When
     * Amazon EC2 Auto Scaling selects instance types with your attributes, we will exclude instance types whose price
     * is higher than your threshold. The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a
     * percentage. To turn off price protection, specify a high value, such as <code>999999</code>.
     * </p>
     * <p>
     * Default: <code>20</code>
     * </p>
     */
    private Integer onDemandMaxPricePercentageOverLowestPrice;
    /**
     * <p>
     * Indicates whether bare metal instance types are included, excluded, or required.
     * </p>
     * <p>
     * Default: <code>excluded</code>
     * </p>
     */
    private String bareMetal;
    /**
     * <p>
     * Indicates whether burstable performance instance types are included, excluded, or required. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * performance instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>excluded</code>
     * </p>
     */
    private String burstablePerformance;
    /**
     * <p>
     * Indicates whether instance types must provide On-Demand Instance hibernation support.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean requireHibernateSupport;
    /**
     * <p>
     * The minimum and maximum number of network interfaces for an instance type.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     */
    private NetworkInterfaceCountRequest networkInterfaceCount;
    /**
     * <p>
     * Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2
     * instance store</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>included</code>
     * </p>
     */
    private String localStorage;
    /**
     * <p>
     * Indicates the type of local storage that is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with solid state drive (SSD) storage, specify <code>sdd</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any local storage type
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> localStorageTypes;
    /**
     * <p>
     * The minimum and maximum total local storage size for an instance type, in GB.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     */
    private TotalLocalStorageGBRequest totalLocalStorageGB;
    /**
     * <p>
     * The minimum and maximum baseline bandwidth performance for an instance type, in Mbps. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon EBS–optimized
     * instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     */
    private BaselineEbsBandwidthMbpsRequest baselineEbsBandwidthMbps;
    /**
     * <p>
     * Lists the accelerator types that must be on an instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with GPU accelerators, specify <code>gpu</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with FPGA accelerators, specify <code>fpga</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with inference accelerators, specify <code>inference</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator type
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> acceleratorTypes;
    /**
     * <p>
     * The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) for an
     * instance type.
     * </p>
     * <p>
     * To exclude accelerator-enabled instance types, set <code>Max</code> to <code>0</code>.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     */
    private AcceleratorCountRequest acceleratorCount;
    /**
     * <p>
     * Indicates whether instance types must have accelerators by specific manufacturers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA devices, specify <code>nvidia</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD devices, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx devices, specify <code>xilinx</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any manufacturer
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> acceleratorManufacturers;
    /**
     * <p>
     * Lists the accelerators that must be on an instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> acceleratorNames;
    /**
     * <p>
     * The minimum and maximum total memory size for the accelerators on an instance type, in MiB.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     */
    private AcceleratorTotalMemoryMiBRequest acceleratorTotalMemoryMiB;

    /**
     * <p>
     * The minimum and maximum number of vCPUs for an instance type.
     * </p>
     * 
     * @param vCpuCount
     *        The minimum and maximum number of vCPUs for an instance type.
     */

    public void setVCpuCount(VCpuCountRequest vCpuCount) {
        this.vCpuCount = vCpuCount;
    }

    /**
     * <p>
     * The minimum and maximum number of vCPUs for an instance type.
     * </p>
     * 
     * @return The minimum and maximum number of vCPUs for an instance type.
     */

    public VCpuCountRequest getVCpuCount() {
        return this.vCpuCount;
    }

    /**
     * <p>
     * The minimum and maximum number of vCPUs for an instance type.
     * </p>
     * 
     * @param vCpuCount
     *        The minimum and maximum number of vCPUs for an instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withVCpuCount(VCpuCountRequest vCpuCount) {
        setVCpuCount(vCpuCount);
        return this;
    }

    /**
     * <p>
     * The minimum and maximum instance memory size for an instance type, in MiB.
     * </p>
     * 
     * @param memoryMiB
     *        The minimum and maximum instance memory size for an instance type, in MiB.
     */

    public void setMemoryMiB(MemoryMiBRequest memoryMiB) {
        this.memoryMiB = memoryMiB;
    }

    /**
     * <p>
     * The minimum and maximum instance memory size for an instance type, in MiB.
     * </p>
     * 
     * @return The minimum and maximum instance memory size for an instance type, in MiB.
     */

    public MemoryMiBRequest getMemoryMiB() {
        return this.memoryMiB;
    }

    /**
     * <p>
     * The minimum and maximum instance memory size for an instance type, in MiB.
     * </p>
     * 
     * @param memoryMiB
     *        The minimum and maximum instance memory size for an instance type, in MiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withMemoryMiB(MemoryMiBRequest memoryMiB) {
        setMemoryMiB(memoryMiB);
        return this;
    }

    /**
     * <p>
     * Lists which specific CPU manufacturers to include.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with Intel CPUs, specify <code>intel</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD CPUs, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Don't confuse the CPU hardware manufacturer with the CPU hardware architecture. Instances will be launched with a
     * compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in your launch template.
     * </p>
     * </note>
     * <p>
     * Default: Any manufacturer
     * </p>
     * 
     * @return Lists which specific CPU manufacturers to include.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For instance types with Intel CPUs, specify <code>intel</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with AMD CPUs, specify <code>amd</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         Don't confuse the CPU hardware manufacturer with the CPU hardware architecture. Instances will be
     *         launched with a compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in
     *         your launch template.
     *         </p>
     *         </note>
     *         <p>
     *         Default: Any manufacturer
     * @see CpuManufacturer
     */

    public java.util.List<String> getCpuManufacturers() {
        if (cpuManufacturers == null) {
            cpuManufacturers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return cpuManufacturers;
    }

    /**
     * <p>
     * Lists which specific CPU manufacturers to include.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with Intel CPUs, specify <code>intel</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD CPUs, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Don't confuse the CPU hardware manufacturer with the CPU hardware architecture. Instances will be launched with a
     * compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in your launch template.
     * </p>
     * </note>
     * <p>
     * Default: Any manufacturer
     * </p>
     * 
     * @param cpuManufacturers
     *        Lists which specific CPU manufacturers to include.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with Intel CPUs, specify <code>intel</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD CPUs, specify <code>amd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Don't confuse the CPU hardware manufacturer with the CPU hardware architecture. Instances will be launched
     *        with a compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in your launch
     *        template.
     *        </p>
     *        </note>
     *        <p>
     *        Default: Any manufacturer
     * @see CpuManufacturer
     */

    public void setCpuManufacturers(java.util.Collection<String> cpuManufacturers) {
        if (cpuManufacturers == null) {
            this.cpuManufacturers = null;
            return;
        }

        this.cpuManufacturers = new com.amazonaws.internal.SdkInternalList<String>(cpuManufacturers);
    }

    /**
     * <p>
     * Lists which specific CPU manufacturers to include.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with Intel CPUs, specify <code>intel</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD CPUs, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Don't confuse the CPU hardware manufacturer with the CPU hardware architecture. Instances will be launched with a
     * compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in your launch template.
     * </p>
     * </note>
     * <p>
     * Default: Any manufacturer
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCpuManufacturers(java.util.Collection)} or {@link #withCpuManufacturers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param cpuManufacturers
     *        Lists which specific CPU manufacturers to include.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with Intel CPUs, specify <code>intel</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD CPUs, specify <code>amd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Don't confuse the CPU hardware manufacturer with the CPU hardware architecture. Instances will be launched
     *        with a compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in your launch
     *        template.
     *        </p>
     *        </note>
     *        <p>
     *        Default: Any manufacturer
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CpuManufacturer
     */

    public InstanceRequirements withCpuManufacturers(String... cpuManufacturers) {
        if (this.cpuManufacturers == null) {
            setCpuManufacturers(new com.amazonaws.internal.SdkInternalList<String>(cpuManufacturers.length));
        }
        for (String ele : cpuManufacturers) {
            this.cpuManufacturers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists which specific CPU manufacturers to include.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with Intel CPUs, specify <code>intel</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD CPUs, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Don't confuse the CPU hardware manufacturer with the CPU hardware architecture. Instances will be launched with a
     * compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in your launch template.
     * </p>
     * </note>
     * <p>
     * Default: Any manufacturer
     * </p>
     * 
     * @param cpuManufacturers
     *        Lists which specific CPU manufacturers to include.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with Intel CPUs, specify <code>intel</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD CPUs, specify <code>amd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Don't confuse the CPU hardware manufacturer with the CPU hardware architecture. Instances will be launched
     *        with a compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in your launch
     *        template.
     *        </p>
     *        </note>
     *        <p>
     *        Default: Any manufacturer
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CpuManufacturer
     */

    public InstanceRequirements withCpuManufacturers(java.util.Collection<String> cpuManufacturers) {
        setCpuManufacturers(cpuManufacturers);
        return this;
    }

    /**
     * <p>
     * Lists which specific CPU manufacturers to include.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with Intel CPUs, specify <code>intel</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD CPUs, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Don't confuse the CPU hardware manufacturer with the CPU hardware architecture. Instances will be launched with a
     * compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in your launch template.
     * </p>
     * </note>
     * <p>
     * Default: Any manufacturer
     * </p>
     * 
     * @param cpuManufacturers
     *        Lists which specific CPU manufacturers to include.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with Intel CPUs, specify <code>intel</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD CPUs, specify <code>amd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Amazon Web Services CPUs, specify <code>amazon-web-services</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        Don't confuse the CPU hardware manufacturer with the CPU hardware architecture. Instances will be launched
     *        with a compatible CPU architecture based on the Amazon Machine Image (AMI) that you specify in your launch
     *        template.
     *        </p>
     *        </note>
     *        <p>
     *        Default: Any manufacturer
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CpuManufacturer
     */

    public InstanceRequirements withCpuManufacturers(CpuManufacturer... cpuManufacturers) {
        com.amazonaws.internal.SdkInternalList<String> cpuManufacturersCopy = new com.amazonaws.internal.SdkInternalList<String>(cpuManufacturers.length);
        for (CpuManufacturer value : cpuManufacturers) {
            cpuManufacturersCopy.add(value.toString());
        }
        if (getCpuManufacturers() == null) {
            setCpuManufacturers(cpuManufacturersCopy);
        } else {
            getCpuManufacturers().addAll(cpuManufacturersCopy);
        }
        return this;
    }

    /**
     * <p>
     * The minimum and maximum amount of memory per vCPU for an instance type, in GiB.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     * 
     * @param memoryGiBPerVCpu
     *        The minimum and maximum amount of memory per vCPU for an instance type, in GiB.</p>
     *        <p>
     *        Default: No minimum or maximum
     */

    public void setMemoryGiBPerVCpu(MemoryGiBPerVCpuRequest memoryGiBPerVCpu) {
        this.memoryGiBPerVCpu = memoryGiBPerVCpu;
    }

    /**
     * <p>
     * The minimum and maximum amount of memory per vCPU for an instance type, in GiB.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     * 
     * @return The minimum and maximum amount of memory per vCPU for an instance type, in GiB.</p>
     *         <p>
     *         Default: No minimum or maximum
     */

    public MemoryGiBPerVCpuRequest getMemoryGiBPerVCpu() {
        return this.memoryGiBPerVCpu;
    }

    /**
     * <p>
     * The minimum and maximum amount of memory per vCPU for an instance type, in GiB.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     * 
     * @param memoryGiBPerVCpu
     *        The minimum and maximum amount of memory per vCPU for an instance type, in GiB.</p>
     *        <p>
     *        Default: No minimum or maximum
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withMemoryGiBPerVCpu(MemoryGiBPerVCpuRequest memoryGiBPerVCpu) {
        setMemoryGiBPerVCpu(memoryGiBPerVCpu);
        return this;
    }

    /**
     * <p>
     * Lists which instance types to exclude. You can use strings with one or more wild cards, represented by an
     * asterisk (<code>*</code>). The following are examples: <code>c5*</code>, <code>m5a.*</code>, <code>r*</code>,
     * <code>*3*</code>.
     * </p>
     * <p>
     * For example, if you specify <code>c5*</code>, you are excluding the entire C5 instance family, which includes all
     * C5a and C5n instance types. If you specify <code>m5a.*</code>, you are excluding all the M5a instance types, but
     * not the M5n instance types.
     * </p>
     * <p>
     * Default: No excluded instance types
     * </p>
     * 
     * @return Lists which instance types to exclude. You can use strings with one or more wild cards, represented by an
     *         asterisk (<code>*</code>). The following are examples: <code>c5*</code>, <code>m5a.*</code>,
     *         <code>r*</code>, <code>*3*</code>. </p>
     *         <p>
     *         For example, if you specify <code>c5*</code>, you are excluding the entire C5 instance family, which
     *         includes all C5a and C5n instance types. If you specify <code>m5a.*</code>, you are excluding all the M5a
     *         instance types, but not the M5n instance types.
     *         </p>
     *         <p>
     *         Default: No excluded instance types
     */

    public java.util.List<String> getExcludedInstanceTypes() {
        if (excludedInstanceTypes == null) {
            excludedInstanceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return excludedInstanceTypes;
    }

    /**
     * <p>
     * Lists which instance types to exclude. You can use strings with one or more wild cards, represented by an
     * asterisk (<code>*</code>). The following are examples: <code>c5*</code>, <code>m5a.*</code>, <code>r*</code>,
     * <code>*3*</code>.
     * </p>
     * <p>
     * For example, if you specify <code>c5*</code>, you are excluding the entire C5 instance family, which includes all
     * C5a and C5n instance types. If you specify <code>m5a.*</code>, you are excluding all the M5a instance types, but
     * not the M5n instance types.
     * </p>
     * <p>
     * Default: No excluded instance types
     * </p>
     * 
     * @param excludedInstanceTypes
     *        Lists which instance types to exclude. You can use strings with one or more wild cards, represented by an
     *        asterisk (<code>*</code>). The following are examples: <code>c5*</code>, <code>m5a.*</code>,
     *        <code>r*</code>, <code>*3*</code>. </p>
     *        <p>
     *        For example, if you specify <code>c5*</code>, you are excluding the entire C5 instance family, which
     *        includes all C5a and C5n instance types. If you specify <code>m5a.*</code>, you are excluding all the M5a
     *        instance types, but not the M5n instance types.
     *        </p>
     *        <p>
     *        Default: No excluded instance types
     */

    public void setExcludedInstanceTypes(java.util.Collection<String> excludedInstanceTypes) {
        if (excludedInstanceTypes == null) {
            this.excludedInstanceTypes = null;
            return;
        }

        this.excludedInstanceTypes = new com.amazonaws.internal.SdkInternalList<String>(excludedInstanceTypes);
    }

    /**
     * <p>
     * Lists which instance types to exclude. You can use strings with one or more wild cards, represented by an
     * asterisk (<code>*</code>). The following are examples: <code>c5*</code>, <code>m5a.*</code>, <code>r*</code>,
     * <code>*3*</code>.
     * </p>
     * <p>
     * For example, if you specify <code>c5*</code>, you are excluding the entire C5 instance family, which includes all
     * C5a and C5n instance types. If you specify <code>m5a.*</code>, you are excluding all the M5a instance types, but
     * not the M5n instance types.
     * </p>
     * <p>
     * Default: No excluded instance types
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludedInstanceTypes(java.util.Collection)} or
     * {@link #withExcludedInstanceTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param excludedInstanceTypes
     *        Lists which instance types to exclude. You can use strings with one or more wild cards, represented by an
     *        asterisk (<code>*</code>). The following are examples: <code>c5*</code>, <code>m5a.*</code>,
     *        <code>r*</code>, <code>*3*</code>. </p>
     *        <p>
     *        For example, if you specify <code>c5*</code>, you are excluding the entire C5 instance family, which
     *        includes all C5a and C5n instance types. If you specify <code>m5a.*</code>, you are excluding all the M5a
     *        instance types, but not the M5n instance types.
     *        </p>
     *        <p>
     *        Default: No excluded instance types
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withExcludedInstanceTypes(String... excludedInstanceTypes) {
        if (this.excludedInstanceTypes == null) {
            setExcludedInstanceTypes(new com.amazonaws.internal.SdkInternalList<String>(excludedInstanceTypes.length));
        }
        for (String ele : excludedInstanceTypes) {
            this.excludedInstanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists which instance types to exclude. You can use strings with one or more wild cards, represented by an
     * asterisk (<code>*</code>). The following are examples: <code>c5*</code>, <code>m5a.*</code>, <code>r*</code>,
     * <code>*3*</code>.
     * </p>
     * <p>
     * For example, if you specify <code>c5*</code>, you are excluding the entire C5 instance family, which includes all
     * C5a and C5n instance types. If you specify <code>m5a.*</code>, you are excluding all the M5a instance types, but
     * not the M5n instance types.
     * </p>
     * <p>
     * Default: No excluded instance types
     * </p>
     * 
     * @param excludedInstanceTypes
     *        Lists which instance types to exclude. You can use strings with one or more wild cards, represented by an
     *        asterisk (<code>*</code>). The following are examples: <code>c5*</code>, <code>m5a.*</code>,
     *        <code>r*</code>, <code>*3*</code>. </p>
     *        <p>
     *        For example, if you specify <code>c5*</code>, you are excluding the entire C5 instance family, which
     *        includes all C5a and C5n instance types. If you specify <code>m5a.*</code>, you are excluding all the M5a
     *        instance types, but not the M5n instance types.
     *        </p>
     *        <p>
     *        Default: No excluded instance types
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withExcludedInstanceTypes(java.util.Collection<String> excludedInstanceTypes) {
        setExcludedInstanceTypes(excludedInstanceTypes);
        return this;
    }

    /**
     * <p>
     * Indicates whether current or previous generation instance types are included.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For current generation instance types, specify <code>current</code>. The current generation includes EC2 instance
     * types currently recommended for use. This typically includes the latest two to three generations in each instance
     * family. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For previous generation instance types, specify <code>previous</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any current or previous generation
     * </p>
     * 
     * @return Indicates whether current or previous generation instance types are included.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For current generation instance types, specify <code>current</code>. The current generation includes EC2
     *         instance types currently recommended for use. This typically includes the latest two to three generations
     *         in each instance family. For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     *         <i>Amazon EC2 User Guide for Linux Instances</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For previous generation instance types, specify <code>previous</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: Any current or previous generation
     * @see InstanceGeneration
     */

    public java.util.List<String> getInstanceGenerations() {
        if (instanceGenerations == null) {
            instanceGenerations = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceGenerations;
    }

    /**
     * <p>
     * Indicates whether current or previous generation instance types are included.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For current generation instance types, specify <code>current</code>. The current generation includes EC2 instance
     * types currently recommended for use. This typically includes the latest two to three generations in each instance
     * family. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For previous generation instance types, specify <code>previous</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any current or previous generation
     * </p>
     * 
     * @param instanceGenerations
     *        Indicates whether current or previous generation instance types are included.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For current generation instance types, specify <code>current</code>. The current generation includes EC2
     *        instance types currently recommended for use. This typically includes the latest two to three generations
     *        in each instance family. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     *        <i>Amazon EC2 User Guide for Linux Instances</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For previous generation instance types, specify <code>previous</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any current or previous generation
     * @see InstanceGeneration
     */

    public void setInstanceGenerations(java.util.Collection<String> instanceGenerations) {
        if (instanceGenerations == null) {
            this.instanceGenerations = null;
            return;
        }

        this.instanceGenerations = new com.amazonaws.internal.SdkInternalList<String>(instanceGenerations);
    }

    /**
     * <p>
     * Indicates whether current or previous generation instance types are included.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For current generation instance types, specify <code>current</code>. The current generation includes EC2 instance
     * types currently recommended for use. This typically includes the latest two to three generations in each instance
     * family. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For previous generation instance types, specify <code>previous</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any current or previous generation
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceGenerations(java.util.Collection)} or {@link #withInstanceGenerations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param instanceGenerations
     *        Indicates whether current or previous generation instance types are included.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For current generation instance types, specify <code>current</code>. The current generation includes EC2
     *        instance types currently recommended for use. This typically includes the latest two to three generations
     *        in each instance family. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     *        <i>Amazon EC2 User Guide for Linux Instances</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For previous generation instance types, specify <code>previous</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any current or previous generation
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceGeneration
     */

    public InstanceRequirements withInstanceGenerations(String... instanceGenerations) {
        if (this.instanceGenerations == null) {
            setInstanceGenerations(new com.amazonaws.internal.SdkInternalList<String>(instanceGenerations.length));
        }
        for (String ele : instanceGenerations) {
            this.instanceGenerations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates whether current or previous generation instance types are included.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For current generation instance types, specify <code>current</code>. The current generation includes EC2 instance
     * types currently recommended for use. This typically includes the latest two to three generations in each instance
     * family. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For previous generation instance types, specify <code>previous</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any current or previous generation
     * </p>
     * 
     * @param instanceGenerations
     *        Indicates whether current or previous generation instance types are included.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For current generation instance types, specify <code>current</code>. The current generation includes EC2
     *        instance types currently recommended for use. This typically includes the latest two to three generations
     *        in each instance family. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     *        <i>Amazon EC2 User Guide for Linux Instances</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For previous generation instance types, specify <code>previous</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any current or previous generation
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceGeneration
     */

    public InstanceRequirements withInstanceGenerations(java.util.Collection<String> instanceGenerations) {
        setInstanceGenerations(instanceGenerations);
        return this;
    }

    /**
     * <p>
     * Indicates whether current or previous generation instance types are included.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For current generation instance types, specify <code>current</code>. The current generation includes EC2 instance
     * types currently recommended for use. This typically includes the latest two to three generations in each instance
     * family. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     * <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For previous generation instance types, specify <code>previous</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any current or previous generation
     * </p>
     * 
     * @param instanceGenerations
     *        Indicates whether current or previous generation instance types are included.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For current generation instance types, specify <code>current</code>. The current generation includes EC2
     *        instance types currently recommended for use. This typically includes the latest two to three generations
     *        in each instance family. For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types</a> in the
     *        <i>Amazon EC2 User Guide for Linux Instances</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For previous generation instance types, specify <code>previous</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any current or previous generation
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceGeneration
     */

    public InstanceRequirements withInstanceGenerations(InstanceGeneration... instanceGenerations) {
        com.amazonaws.internal.SdkInternalList<String> instanceGenerationsCopy = new com.amazonaws.internal.SdkInternalList<String>(instanceGenerations.length);
        for (InstanceGeneration value : instanceGenerations) {
            instanceGenerationsCopy.add(value.toString());
        }
        if (getInstanceGenerations() == null) {
            setInstanceGenerations(instanceGenerationsCopy);
        } else {
            getInstanceGenerations().addAll(instanceGenerationsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The price protection threshold for Spot Instances. This is the maximum you’ll pay for a Spot Instance, expressed
     * as a percentage higher than the cheapest M, C, or R instance type with your specified attributes. When Amazon EC2
     * Auto Scaling selects instance types with your attributes, we will exclude instance types whose price is higher
     * than your threshold. The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage.
     * To turn off price protection, specify a high value, such as <code>999999</code>.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * 
     * @param spotMaxPricePercentageOverLowestPrice
     *        The price protection threshold for Spot Instances. This is the maximum you’ll pay for a Spot Instance,
     *        expressed as a percentage higher than the cheapest M, C, or R instance type with your specified
     *        attributes. When Amazon EC2 Auto Scaling selects instance types with your attributes, we will exclude
     *        instance types whose price is higher than your threshold. The parameter accepts an integer, which Amazon
     *        EC2 Auto Scaling interprets as a percentage. To turn off price protection, specify a high value, such as
     *        <code>999999</code>. </p>
     *        <p>
     *        Default: <code>100</code>
     */

    public void setSpotMaxPricePercentageOverLowestPrice(Integer spotMaxPricePercentageOverLowestPrice) {
        this.spotMaxPricePercentageOverLowestPrice = spotMaxPricePercentageOverLowestPrice;
    }

    /**
     * <p>
     * The price protection threshold for Spot Instances. This is the maximum you’ll pay for a Spot Instance, expressed
     * as a percentage higher than the cheapest M, C, or R instance type with your specified attributes. When Amazon EC2
     * Auto Scaling selects instance types with your attributes, we will exclude instance types whose price is higher
     * than your threshold. The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage.
     * To turn off price protection, specify a high value, such as <code>999999</code>.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * 
     * @return The price protection threshold for Spot Instances. This is the maximum you’ll pay for a Spot Instance,
     *         expressed as a percentage higher than the cheapest M, C, or R instance type with your specified
     *         attributes. When Amazon EC2 Auto Scaling selects instance types with your attributes, we will exclude
     *         instance types whose price is higher than your threshold. The parameter accepts an integer, which Amazon
     *         EC2 Auto Scaling interprets as a percentage. To turn off price protection, specify a high value, such as
     *         <code>999999</code>. </p>
     *         <p>
     *         Default: <code>100</code>
     */

    public Integer getSpotMaxPricePercentageOverLowestPrice() {
        return this.spotMaxPricePercentageOverLowestPrice;
    }

    /**
     * <p>
     * The price protection threshold for Spot Instances. This is the maximum you’ll pay for a Spot Instance, expressed
     * as a percentage higher than the cheapest M, C, or R instance type with your specified attributes. When Amazon EC2
     * Auto Scaling selects instance types with your attributes, we will exclude instance types whose price is higher
     * than your threshold. The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a percentage.
     * To turn off price protection, specify a high value, such as <code>999999</code>.
     * </p>
     * <p>
     * Default: <code>100</code>
     * </p>
     * 
     * @param spotMaxPricePercentageOverLowestPrice
     *        The price protection threshold for Spot Instances. This is the maximum you’ll pay for a Spot Instance,
     *        expressed as a percentage higher than the cheapest M, C, or R instance type with your specified
     *        attributes. When Amazon EC2 Auto Scaling selects instance types with your attributes, we will exclude
     *        instance types whose price is higher than your threshold. The parameter accepts an integer, which Amazon
     *        EC2 Auto Scaling interprets as a percentage. To turn off price protection, specify a high value, such as
     *        <code>999999</code>. </p>
     *        <p>
     *        Default: <code>100</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withSpotMaxPricePercentageOverLowestPrice(Integer spotMaxPricePercentageOverLowestPrice) {
        setSpotMaxPricePercentageOverLowestPrice(spotMaxPricePercentageOverLowestPrice);
        return this;
    }

    /**
     * <p>
     * The price protection threshold for On-Demand Instances. This is the maximum you’ll pay for an On-Demand Instance,
     * expressed as a percentage higher than the cheapest M, C, or R instance type with your specified attributes. When
     * Amazon EC2 Auto Scaling selects instance types with your attributes, we will exclude instance types whose price
     * is higher than your threshold. The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a
     * percentage. To turn off price protection, specify a high value, such as <code>999999</code>.
     * </p>
     * <p>
     * Default: <code>20</code>
     * </p>
     * 
     * @param onDemandMaxPricePercentageOverLowestPrice
     *        The price protection threshold for On-Demand Instances. This is the maximum you’ll pay for an On-Demand
     *        Instance, expressed as a percentage higher than the cheapest M, C, or R instance type with your specified
     *        attributes. When Amazon EC2 Auto Scaling selects instance types with your attributes, we will exclude
     *        instance types whose price is higher than your threshold. The parameter accepts an integer, which Amazon
     *        EC2 Auto Scaling interprets as a percentage. To turn off price protection, specify a high value, such as
     *        <code>999999</code>. </p>
     *        <p>
     *        Default: <code>20</code>
     */

    public void setOnDemandMaxPricePercentageOverLowestPrice(Integer onDemandMaxPricePercentageOverLowestPrice) {
        this.onDemandMaxPricePercentageOverLowestPrice = onDemandMaxPricePercentageOverLowestPrice;
    }

    /**
     * <p>
     * The price protection threshold for On-Demand Instances. This is the maximum you’ll pay for an On-Demand Instance,
     * expressed as a percentage higher than the cheapest M, C, or R instance type with your specified attributes. When
     * Amazon EC2 Auto Scaling selects instance types with your attributes, we will exclude instance types whose price
     * is higher than your threshold. The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a
     * percentage. To turn off price protection, specify a high value, such as <code>999999</code>.
     * </p>
     * <p>
     * Default: <code>20</code>
     * </p>
     * 
     * @return The price protection threshold for On-Demand Instances. This is the maximum you’ll pay for an On-Demand
     *         Instance, expressed as a percentage higher than the cheapest M, C, or R instance type with your specified
     *         attributes. When Amazon EC2 Auto Scaling selects instance types with your attributes, we will exclude
     *         instance types whose price is higher than your threshold. The parameter accepts an integer, which Amazon
     *         EC2 Auto Scaling interprets as a percentage. To turn off price protection, specify a high value, such as
     *         <code>999999</code>. </p>
     *         <p>
     *         Default: <code>20</code>
     */

    public Integer getOnDemandMaxPricePercentageOverLowestPrice() {
        return this.onDemandMaxPricePercentageOverLowestPrice;
    }

    /**
     * <p>
     * The price protection threshold for On-Demand Instances. This is the maximum you’ll pay for an On-Demand Instance,
     * expressed as a percentage higher than the cheapest M, C, or R instance type with your specified attributes. When
     * Amazon EC2 Auto Scaling selects instance types with your attributes, we will exclude instance types whose price
     * is higher than your threshold. The parameter accepts an integer, which Amazon EC2 Auto Scaling interprets as a
     * percentage. To turn off price protection, specify a high value, such as <code>999999</code>.
     * </p>
     * <p>
     * Default: <code>20</code>
     * </p>
     * 
     * @param onDemandMaxPricePercentageOverLowestPrice
     *        The price protection threshold for On-Demand Instances. This is the maximum you’ll pay for an On-Demand
     *        Instance, expressed as a percentage higher than the cheapest M, C, or R instance type with your specified
     *        attributes. When Amazon EC2 Auto Scaling selects instance types with your attributes, we will exclude
     *        instance types whose price is higher than your threshold. The parameter accepts an integer, which Amazon
     *        EC2 Auto Scaling interprets as a percentage. To turn off price protection, specify a high value, such as
     *        <code>999999</code>. </p>
     *        <p>
     *        Default: <code>20</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withOnDemandMaxPricePercentageOverLowestPrice(Integer onDemandMaxPricePercentageOverLowestPrice) {
        setOnDemandMaxPricePercentageOverLowestPrice(onDemandMaxPricePercentageOverLowestPrice);
        return this;
    }

    /**
     * <p>
     * Indicates whether bare metal instance types are included, excluded, or required.
     * </p>
     * <p>
     * Default: <code>excluded</code>
     * </p>
     * 
     * @param bareMetal
     *        Indicates whether bare metal instance types are included, excluded, or required.</p>
     *        <p>
     *        Default: <code>excluded</code>
     * @see BareMetal
     */

    public void setBareMetal(String bareMetal) {
        this.bareMetal = bareMetal;
    }

    /**
     * <p>
     * Indicates whether bare metal instance types are included, excluded, or required.
     * </p>
     * <p>
     * Default: <code>excluded</code>
     * </p>
     * 
     * @return Indicates whether bare metal instance types are included, excluded, or required.</p>
     *         <p>
     *         Default: <code>excluded</code>
     * @see BareMetal
     */

    public String getBareMetal() {
        return this.bareMetal;
    }

    /**
     * <p>
     * Indicates whether bare metal instance types are included, excluded, or required.
     * </p>
     * <p>
     * Default: <code>excluded</code>
     * </p>
     * 
     * @param bareMetal
     *        Indicates whether bare metal instance types are included, excluded, or required.</p>
     *        <p>
     *        Default: <code>excluded</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BareMetal
     */

    public InstanceRequirements withBareMetal(String bareMetal) {
        setBareMetal(bareMetal);
        return this;
    }

    /**
     * <p>
     * Indicates whether bare metal instance types are included, excluded, or required.
     * </p>
     * <p>
     * Default: <code>excluded</code>
     * </p>
     * 
     * @param bareMetal
     *        Indicates whether bare metal instance types are included, excluded, or required.</p>
     *        <p>
     *        Default: <code>excluded</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BareMetal
     */

    public InstanceRequirements withBareMetal(BareMetal bareMetal) {
        this.bareMetal = bareMetal.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether burstable performance instance types are included, excluded, or required. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * performance instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>excluded</code>
     * </p>
     * 
     * @param burstablePerformance
     *        Indicates whether burstable performance instance types are included, excluded, or required. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     *        performance instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *        <p>
     *        Default: <code>excluded</code>
     * @see BurstablePerformance
     */

    public void setBurstablePerformance(String burstablePerformance) {
        this.burstablePerformance = burstablePerformance;
    }

    /**
     * <p>
     * Indicates whether burstable performance instance types are included, excluded, or required. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * performance instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>excluded</code>
     * </p>
     * 
     * @return Indicates whether burstable performance instance types are included, excluded, or required. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     *         performance instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *         <p>
     *         Default: <code>excluded</code>
     * @see BurstablePerformance
     */

    public String getBurstablePerformance() {
        return this.burstablePerformance;
    }

    /**
     * <p>
     * Indicates whether burstable performance instance types are included, excluded, or required. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * performance instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>excluded</code>
     * </p>
     * 
     * @param burstablePerformance
     *        Indicates whether burstable performance instance types are included, excluded, or required. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     *        performance instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *        <p>
     *        Default: <code>excluded</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BurstablePerformance
     */

    public InstanceRequirements withBurstablePerformance(String burstablePerformance) {
        setBurstablePerformance(burstablePerformance);
        return this;
    }

    /**
     * <p>
     * Indicates whether burstable performance instance types are included, excluded, or required. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     * performance instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>excluded</code>
     * </p>
     * 
     * @param burstablePerformance
     *        Indicates whether burstable performance instance types are included, excluded, or required. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html">Burstable
     *        performance instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *        <p>
     *        Default: <code>excluded</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BurstablePerformance
     */

    public InstanceRequirements withBurstablePerformance(BurstablePerformance burstablePerformance) {
        this.burstablePerformance = burstablePerformance.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether instance types must provide On-Demand Instance hibernation support.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param requireHibernateSupport
     *        Indicates whether instance types must provide On-Demand Instance hibernation support.</p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setRequireHibernateSupport(Boolean requireHibernateSupport) {
        this.requireHibernateSupport = requireHibernateSupport;
    }

    /**
     * <p>
     * Indicates whether instance types must provide On-Demand Instance hibernation support.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Indicates whether instance types must provide On-Demand Instance hibernation support.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getRequireHibernateSupport() {
        return this.requireHibernateSupport;
    }

    /**
     * <p>
     * Indicates whether instance types must provide On-Demand Instance hibernation support.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param requireHibernateSupport
     *        Indicates whether instance types must provide On-Demand Instance hibernation support.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withRequireHibernateSupport(Boolean requireHibernateSupport) {
        setRequireHibernateSupport(requireHibernateSupport);
        return this;
    }

    /**
     * <p>
     * Indicates whether instance types must provide On-Demand Instance hibernation support.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Indicates whether instance types must provide On-Demand Instance hibernation support.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isRequireHibernateSupport() {
        return this.requireHibernateSupport;
    }

    /**
     * <p>
     * The minimum and maximum number of network interfaces for an instance type.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     * 
     * @param networkInterfaceCount
     *        The minimum and maximum number of network interfaces for an instance type.</p>
     *        <p>
     *        Default: No minimum or maximum
     */

    public void setNetworkInterfaceCount(NetworkInterfaceCountRequest networkInterfaceCount) {
        this.networkInterfaceCount = networkInterfaceCount;
    }

    /**
     * <p>
     * The minimum and maximum number of network interfaces for an instance type.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     * 
     * @return The minimum and maximum number of network interfaces for an instance type.</p>
     *         <p>
     *         Default: No minimum or maximum
     */

    public NetworkInterfaceCountRequest getNetworkInterfaceCount() {
        return this.networkInterfaceCount;
    }

    /**
     * <p>
     * The minimum and maximum number of network interfaces for an instance type.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     * 
     * @param networkInterfaceCount
     *        The minimum and maximum number of network interfaces for an instance type.</p>
     *        <p>
     *        Default: No minimum or maximum
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withNetworkInterfaceCount(NetworkInterfaceCountRequest networkInterfaceCount) {
        setNetworkInterfaceCount(networkInterfaceCount);
        return this;
    }

    /**
     * <p>
     * Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2
     * instance store</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>included</code>
     * </p>
     * 
     * @param localStorage
     *        Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     *        information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon
     *        EC2 instance store</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *        <p>
     *        Default: <code>included</code>
     * @see LocalStorage
     */

    public void setLocalStorage(String localStorage) {
        this.localStorage = localStorage;
    }

    /**
     * <p>
     * Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2
     * instance store</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>included</code>
     * </p>
     * 
     * @return Indicates whether instance types with instance store volumes are included, excluded, or required. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2 instance
     *         store</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *         <p>
     *         Default: <code>included</code>
     * @see LocalStorage
     */

    public String getLocalStorage() {
        return this.localStorage;
    }

    /**
     * <p>
     * Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2
     * instance store</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>included</code>
     * </p>
     * 
     * @param localStorage
     *        Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     *        information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon
     *        EC2 instance store</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *        <p>
     *        Default: <code>included</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocalStorage
     */

    public InstanceRequirements withLocalStorage(String localStorage) {
        setLocalStorage(localStorage);
        return this;
    }

    /**
     * <p>
     * Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     * information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon EC2
     * instance store</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: <code>included</code>
     * </p>
     * 
     * @param localStorage
     *        Indicates whether instance types with instance store volumes are included, excluded, or required. For more
     *        information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html">Amazon
     *        EC2 instance store</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *        <p>
     *        Default: <code>included</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocalStorage
     */

    public InstanceRequirements withLocalStorage(LocalStorage localStorage) {
        this.localStorage = localStorage.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the type of local storage that is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with solid state drive (SSD) storage, specify <code>sdd</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any local storage type
     * </p>
     * 
     * @return Indicates the type of local storage that is required.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with solid state drive (SSD) storage, specify <code>sdd</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: Any local storage type
     * @see LocalStorageType
     */

    public java.util.List<String> getLocalStorageTypes() {
        if (localStorageTypes == null) {
            localStorageTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return localStorageTypes;
    }

    /**
     * <p>
     * Indicates the type of local storage that is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with solid state drive (SSD) storage, specify <code>sdd</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any local storage type
     * </p>
     * 
     * @param localStorageTypes
     *        Indicates the type of local storage that is required.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with solid state drive (SSD) storage, specify <code>sdd</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any local storage type
     * @see LocalStorageType
     */

    public void setLocalStorageTypes(java.util.Collection<String> localStorageTypes) {
        if (localStorageTypes == null) {
            this.localStorageTypes = null;
            return;
        }

        this.localStorageTypes = new com.amazonaws.internal.SdkInternalList<String>(localStorageTypes);
    }

    /**
     * <p>
     * Indicates the type of local storage that is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with solid state drive (SSD) storage, specify <code>sdd</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any local storage type
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocalStorageTypes(java.util.Collection)} or {@link #withLocalStorageTypes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param localStorageTypes
     *        Indicates the type of local storage that is required.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with solid state drive (SSD) storage, specify <code>sdd</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any local storage type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocalStorageType
     */

    public InstanceRequirements withLocalStorageTypes(String... localStorageTypes) {
        if (this.localStorageTypes == null) {
            setLocalStorageTypes(new com.amazonaws.internal.SdkInternalList<String>(localStorageTypes.length));
        }
        for (String ele : localStorageTypes) {
            this.localStorageTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates the type of local storage that is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with solid state drive (SSD) storage, specify <code>sdd</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any local storage type
     * </p>
     * 
     * @param localStorageTypes
     *        Indicates the type of local storage that is required.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with solid state drive (SSD) storage, specify <code>sdd</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any local storage type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocalStorageType
     */

    public InstanceRequirements withLocalStorageTypes(java.util.Collection<String> localStorageTypes) {
        setLocalStorageTypes(localStorageTypes);
        return this;
    }

    /**
     * <p>
     * Indicates the type of local storage that is required.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with solid state drive (SSD) storage, specify <code>sdd</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any local storage type
     * </p>
     * 
     * @param localStorageTypes
     *        Indicates the type of local storage that is required.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with hard disk drive (HDD) storage, specify <code>hdd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with solid state drive (SSD) storage, specify <code>sdd</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any local storage type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LocalStorageType
     */

    public InstanceRequirements withLocalStorageTypes(LocalStorageType... localStorageTypes) {
        com.amazonaws.internal.SdkInternalList<String> localStorageTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(localStorageTypes.length);
        for (LocalStorageType value : localStorageTypes) {
            localStorageTypesCopy.add(value.toString());
        }
        if (getLocalStorageTypes() == null) {
            setLocalStorageTypes(localStorageTypesCopy);
        } else {
            getLocalStorageTypes().addAll(localStorageTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The minimum and maximum total local storage size for an instance type, in GB.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     * 
     * @param totalLocalStorageGB
     *        The minimum and maximum total local storage size for an instance type, in GB.</p>
     *        <p>
     *        Default: No minimum or maximum
     */

    public void setTotalLocalStorageGB(TotalLocalStorageGBRequest totalLocalStorageGB) {
        this.totalLocalStorageGB = totalLocalStorageGB;
    }

    /**
     * <p>
     * The minimum and maximum total local storage size for an instance type, in GB.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     * 
     * @return The minimum and maximum total local storage size for an instance type, in GB.</p>
     *         <p>
     *         Default: No minimum or maximum
     */

    public TotalLocalStorageGBRequest getTotalLocalStorageGB() {
        return this.totalLocalStorageGB;
    }

    /**
     * <p>
     * The minimum and maximum total local storage size for an instance type, in GB.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     * 
     * @param totalLocalStorageGB
     *        The minimum and maximum total local storage size for an instance type, in GB.</p>
     *        <p>
     *        Default: No minimum or maximum
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withTotalLocalStorageGB(TotalLocalStorageGBRequest totalLocalStorageGB) {
        setTotalLocalStorageGB(totalLocalStorageGB);
        return this;
    }

    /**
     * <p>
     * The minimum and maximum baseline bandwidth performance for an instance type, in Mbps. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon EBS–optimized
     * instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     * 
     * @param baselineEbsBandwidthMbps
     *        The minimum and maximum baseline bandwidth performance for an instance type, in Mbps. For more
     *        information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon
     *        EBS–optimized instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *        <p>
     *        Default: No minimum or maximum
     */

    public void setBaselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequest baselineEbsBandwidthMbps) {
        this.baselineEbsBandwidthMbps = baselineEbsBandwidthMbps;
    }

    /**
     * <p>
     * The minimum and maximum baseline bandwidth performance for an instance type, in Mbps. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon EBS–optimized
     * instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     * 
     * @return The minimum and maximum baseline bandwidth performance for an instance type, in Mbps. For more
     *         information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon
     *         EBS–optimized instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *         <p>
     *         Default: No minimum or maximum
     */

    public BaselineEbsBandwidthMbpsRequest getBaselineEbsBandwidthMbps() {
        return this.baselineEbsBandwidthMbps;
    }

    /**
     * <p>
     * The minimum and maximum baseline bandwidth performance for an instance type, in Mbps. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon EBS–optimized
     * instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     * 
     * @param baselineEbsBandwidthMbps
     *        The minimum and maximum baseline bandwidth performance for an instance type, in Mbps. For more
     *        information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon
     *        EBS–optimized instances</a> in the <i>Amazon EC2 User Guide for Linux Instances</i>.</p>
     *        <p>
     *        Default: No minimum or maximum
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withBaselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequest baselineEbsBandwidthMbps) {
        setBaselineEbsBandwidthMbps(baselineEbsBandwidthMbps);
        return this;
    }

    /**
     * <p>
     * Lists the accelerator types that must be on an instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with GPU accelerators, specify <code>gpu</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with FPGA accelerators, specify <code>fpga</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with inference accelerators, specify <code>inference</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator type
     * </p>
     * 
     * @return Lists the accelerator types that must be on an instance type.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For instance types with GPU accelerators, specify <code>gpu</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with FPGA accelerators, specify <code>fpga</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with inference accelerators, specify <code>inference</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: Any accelerator type
     * @see AcceleratorType
     */

    public java.util.List<String> getAcceleratorTypes() {
        if (acceleratorTypes == null) {
            acceleratorTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return acceleratorTypes;
    }

    /**
     * <p>
     * Lists the accelerator types that must be on an instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with GPU accelerators, specify <code>gpu</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with FPGA accelerators, specify <code>fpga</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with inference accelerators, specify <code>inference</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator type
     * </p>
     * 
     * @param acceleratorTypes
     *        Lists the accelerator types that must be on an instance type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with GPU accelerators, specify <code>gpu</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with FPGA accelerators, specify <code>fpga</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with inference accelerators, specify <code>inference</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any accelerator type
     * @see AcceleratorType
     */

    public void setAcceleratorTypes(java.util.Collection<String> acceleratorTypes) {
        if (acceleratorTypes == null) {
            this.acceleratorTypes = null;
            return;
        }

        this.acceleratorTypes = new com.amazonaws.internal.SdkInternalList<String>(acceleratorTypes);
    }

    /**
     * <p>
     * Lists the accelerator types that must be on an instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with GPU accelerators, specify <code>gpu</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with FPGA accelerators, specify <code>fpga</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with inference accelerators, specify <code>inference</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator type
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcceleratorTypes(java.util.Collection)} or {@link #withAcceleratorTypes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param acceleratorTypes
     *        Lists the accelerator types that must be on an instance type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with GPU accelerators, specify <code>gpu</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with FPGA accelerators, specify <code>fpga</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with inference accelerators, specify <code>inference</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any accelerator type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorType
     */

    public InstanceRequirements withAcceleratorTypes(String... acceleratorTypes) {
        if (this.acceleratorTypes == null) {
            setAcceleratorTypes(new com.amazonaws.internal.SdkInternalList<String>(acceleratorTypes.length));
        }
        for (String ele : acceleratorTypes) {
            this.acceleratorTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the accelerator types that must be on an instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with GPU accelerators, specify <code>gpu</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with FPGA accelerators, specify <code>fpga</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with inference accelerators, specify <code>inference</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator type
     * </p>
     * 
     * @param acceleratorTypes
     *        Lists the accelerator types that must be on an instance type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with GPU accelerators, specify <code>gpu</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with FPGA accelerators, specify <code>fpga</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with inference accelerators, specify <code>inference</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any accelerator type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorType
     */

    public InstanceRequirements withAcceleratorTypes(java.util.Collection<String> acceleratorTypes) {
        setAcceleratorTypes(acceleratorTypes);
        return this;
    }

    /**
     * <p>
     * Lists the accelerator types that must be on an instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with GPU accelerators, specify <code>gpu</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with FPGA accelerators, specify <code>fpga</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with inference accelerators, specify <code>inference</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator type
     * </p>
     * 
     * @param acceleratorTypes
     *        Lists the accelerator types that must be on an instance type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with GPU accelerators, specify <code>gpu</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with FPGA accelerators, specify <code>fpga</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with inference accelerators, specify <code>inference</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any accelerator type
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorType
     */

    public InstanceRequirements withAcceleratorTypes(AcceleratorType... acceleratorTypes) {
        com.amazonaws.internal.SdkInternalList<String> acceleratorTypesCopy = new com.amazonaws.internal.SdkInternalList<String>(acceleratorTypes.length);
        for (AcceleratorType value : acceleratorTypes) {
            acceleratorTypesCopy.add(value.toString());
        }
        if (getAcceleratorTypes() == null) {
            setAcceleratorTypes(acceleratorTypesCopy);
        } else {
            getAcceleratorTypes().addAll(acceleratorTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) for an
     * instance type.
     * </p>
     * <p>
     * To exclude accelerator-enabled instance types, set <code>Max</code> to <code>0</code>.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     * 
     * @param acceleratorCount
     *        The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) for
     *        an instance type.</p>
     *        <p>
     *        To exclude accelerator-enabled instance types, set <code>Max</code> to <code>0</code>.
     *        </p>
     *        <p>
     *        Default: No minimum or maximum
     */

    public void setAcceleratorCount(AcceleratorCountRequest acceleratorCount) {
        this.acceleratorCount = acceleratorCount;
    }

    /**
     * <p>
     * The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) for an
     * instance type.
     * </p>
     * <p>
     * To exclude accelerator-enabled instance types, set <code>Max</code> to <code>0</code>.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     * 
     * @return The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) for
     *         an instance type.</p>
     *         <p>
     *         To exclude accelerator-enabled instance types, set <code>Max</code> to <code>0</code>.
     *         </p>
     *         <p>
     *         Default: No minimum or maximum
     */

    public AcceleratorCountRequest getAcceleratorCount() {
        return this.acceleratorCount;
    }

    /**
     * <p>
     * The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) for an
     * instance type.
     * </p>
     * <p>
     * To exclude accelerator-enabled instance types, set <code>Max</code> to <code>0</code>.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     * 
     * @param acceleratorCount
     *        The minimum and maximum number of accelerators (GPUs, FPGAs, or Amazon Web Services Inferentia chips) for
     *        an instance type.</p>
     *        <p>
     *        To exclude accelerator-enabled instance types, set <code>Max</code> to <code>0</code>.
     *        </p>
     *        <p>
     *        Default: No minimum or maximum
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withAcceleratorCount(AcceleratorCountRequest acceleratorCount) {
        setAcceleratorCount(acceleratorCount);
        return this;
    }

    /**
     * <p>
     * Indicates whether instance types must have accelerators by specific manufacturers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA devices, specify <code>nvidia</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD devices, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx devices, specify <code>xilinx</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any manufacturer
     * </p>
     * 
     * @return Indicates whether instance types must have accelerators by specific manufacturers.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For instance types with NVIDIA devices, specify <code>nvidia</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with AMD devices, specify <code>amd</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with Xilinx devices, specify <code>xilinx</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: Any manufacturer
     * @see AcceleratorManufacturer
     */

    public java.util.List<String> getAcceleratorManufacturers() {
        if (acceleratorManufacturers == null) {
            acceleratorManufacturers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return acceleratorManufacturers;
    }

    /**
     * <p>
     * Indicates whether instance types must have accelerators by specific manufacturers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA devices, specify <code>nvidia</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD devices, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx devices, specify <code>xilinx</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any manufacturer
     * </p>
     * 
     * @param acceleratorManufacturers
     *        Indicates whether instance types must have accelerators by specific manufacturers.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA devices, specify <code>nvidia</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD devices, specify <code>amd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Xilinx devices, specify <code>xilinx</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any manufacturer
     * @see AcceleratorManufacturer
     */

    public void setAcceleratorManufacturers(java.util.Collection<String> acceleratorManufacturers) {
        if (acceleratorManufacturers == null) {
            this.acceleratorManufacturers = null;
            return;
        }

        this.acceleratorManufacturers = new com.amazonaws.internal.SdkInternalList<String>(acceleratorManufacturers);
    }

    /**
     * <p>
     * Indicates whether instance types must have accelerators by specific manufacturers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA devices, specify <code>nvidia</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD devices, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx devices, specify <code>xilinx</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any manufacturer
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcceleratorManufacturers(java.util.Collection)} or
     * {@link #withAcceleratorManufacturers(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param acceleratorManufacturers
     *        Indicates whether instance types must have accelerators by specific manufacturers.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA devices, specify <code>nvidia</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD devices, specify <code>amd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Xilinx devices, specify <code>xilinx</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any manufacturer
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorManufacturer
     */

    public InstanceRequirements withAcceleratorManufacturers(String... acceleratorManufacturers) {
        if (this.acceleratorManufacturers == null) {
            setAcceleratorManufacturers(new com.amazonaws.internal.SdkInternalList<String>(acceleratorManufacturers.length));
        }
        for (String ele : acceleratorManufacturers) {
            this.acceleratorManufacturers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates whether instance types must have accelerators by specific manufacturers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA devices, specify <code>nvidia</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD devices, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx devices, specify <code>xilinx</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any manufacturer
     * </p>
     * 
     * @param acceleratorManufacturers
     *        Indicates whether instance types must have accelerators by specific manufacturers.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA devices, specify <code>nvidia</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD devices, specify <code>amd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Xilinx devices, specify <code>xilinx</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any manufacturer
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorManufacturer
     */

    public InstanceRequirements withAcceleratorManufacturers(java.util.Collection<String> acceleratorManufacturers) {
        setAcceleratorManufacturers(acceleratorManufacturers);
        return this;
    }

    /**
     * <p>
     * Indicates whether instance types must have accelerators by specific manufacturers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA devices, specify <code>nvidia</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD devices, specify <code>amd</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx devices, specify <code>xilinx</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any manufacturer
     * </p>
     * 
     * @param acceleratorManufacturers
     *        Indicates whether instance types must have accelerators by specific manufacturers.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA devices, specify <code>nvidia</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD devices, specify <code>amd</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Amazon Web Services devices, specify <code>amazon-web-services</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Xilinx devices, specify <code>xilinx</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any manufacturer
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorManufacturer
     */

    public InstanceRequirements withAcceleratorManufacturers(AcceleratorManufacturer... acceleratorManufacturers) {
        com.amazonaws.internal.SdkInternalList<String> acceleratorManufacturersCopy = new com.amazonaws.internal.SdkInternalList<String>(
                acceleratorManufacturers.length);
        for (AcceleratorManufacturer value : acceleratorManufacturers) {
            acceleratorManufacturersCopy.add(value.toString());
        }
        if (getAcceleratorManufacturers() == null) {
            setAcceleratorManufacturers(acceleratorManufacturersCopy);
        } else {
            getAcceleratorManufacturers().addAll(acceleratorManufacturersCopy);
        }
        return this;
    }

    /**
     * <p>
     * Lists the accelerators that must be on an instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator
     * </p>
     * 
     * @return Lists the accelerators that must be on an instance type.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: Any accelerator
     * @see AcceleratorName
     */

    public java.util.List<String> getAcceleratorNames() {
        if (acceleratorNames == null) {
            acceleratorNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return acceleratorNames;
    }

    /**
     * <p>
     * Lists the accelerators that must be on an instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator
     * </p>
     * 
     * @param acceleratorNames
     *        Lists the accelerators that must be on an instance type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any accelerator
     * @see AcceleratorName
     */

    public void setAcceleratorNames(java.util.Collection<String> acceleratorNames) {
        if (acceleratorNames == null) {
            this.acceleratorNames = null;
            return;
        }

        this.acceleratorNames = new com.amazonaws.internal.SdkInternalList<String>(acceleratorNames);
    }

    /**
     * <p>
     * Lists the accelerators that must be on an instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAcceleratorNames(java.util.Collection)} or {@link #withAcceleratorNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param acceleratorNames
     *        Lists the accelerators that must be on an instance type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any accelerator
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorName
     */

    public InstanceRequirements withAcceleratorNames(String... acceleratorNames) {
        if (this.acceleratorNames == null) {
            setAcceleratorNames(new com.amazonaws.internal.SdkInternalList<String>(acceleratorNames.length));
        }
        for (String ele : acceleratorNames) {
            this.acceleratorNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Lists the accelerators that must be on an instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator
     * </p>
     * 
     * @param acceleratorNames
     *        Lists the accelerators that must be on an instance type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any accelerator
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorName
     */

    public InstanceRequirements withAcceleratorNames(java.util.Collection<String> acceleratorNames) {
        setAcceleratorNames(acceleratorNames);
        return this;
    }

    /**
     * <p>
     * Lists the accelerators that must be on an instance type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: Any accelerator
     * </p>
     * 
     * @param acceleratorNames
     *        Lists the accelerators that must be on an instance type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA A100 GPUs, specify <code>a100</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA V100 GPUs, specify <code>v100</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA K80 GPUs, specify <code>k80</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA T4 GPUs, specify <code>t4</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with NVIDIA M60 GPUs, specify <code>m60</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with AMD Radeon Pro V520 GPUs, specify <code>radeon-pro-v520</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For instance types with Xilinx VU9P FPGAs, specify <code>vu9p</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: Any accelerator
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceleratorName
     */

    public InstanceRequirements withAcceleratorNames(AcceleratorName... acceleratorNames) {
        com.amazonaws.internal.SdkInternalList<String> acceleratorNamesCopy = new com.amazonaws.internal.SdkInternalList<String>(acceleratorNames.length);
        for (AcceleratorName value : acceleratorNames) {
            acceleratorNamesCopy.add(value.toString());
        }
        if (getAcceleratorNames() == null) {
            setAcceleratorNames(acceleratorNamesCopy);
        } else {
            getAcceleratorNames().addAll(acceleratorNamesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The minimum and maximum total memory size for the accelerators on an instance type, in MiB.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     * 
     * @param acceleratorTotalMemoryMiB
     *        The minimum and maximum total memory size for the accelerators on an instance type, in MiB.</p>
     *        <p>
     *        Default: No minimum or maximum
     */

    public void setAcceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequest acceleratorTotalMemoryMiB) {
        this.acceleratorTotalMemoryMiB = acceleratorTotalMemoryMiB;
    }

    /**
     * <p>
     * The minimum and maximum total memory size for the accelerators on an instance type, in MiB.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     * 
     * @return The minimum and maximum total memory size for the accelerators on an instance type, in MiB.</p>
     *         <p>
     *         Default: No minimum or maximum
     */

    public AcceleratorTotalMemoryMiBRequest getAcceleratorTotalMemoryMiB() {
        return this.acceleratorTotalMemoryMiB;
    }

    /**
     * <p>
     * The minimum and maximum total memory size for the accelerators on an instance type, in MiB.
     * </p>
     * <p>
     * Default: No minimum or maximum
     * </p>
     * 
     * @param acceleratorTotalMemoryMiB
     *        The minimum and maximum total memory size for the accelerators on an instance type, in MiB.</p>
     *        <p>
     *        Default: No minimum or maximum
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceRequirements withAcceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequest acceleratorTotalMemoryMiB) {
        setAcceleratorTotalMemoryMiB(acceleratorTotalMemoryMiB);
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
        if (getVCpuCount() != null)
            sb.append("VCpuCount: ").append(getVCpuCount()).append(",");
        if (getMemoryMiB() != null)
            sb.append("MemoryMiB: ").append(getMemoryMiB()).append(",");
        if (getCpuManufacturers() != null)
            sb.append("CpuManufacturers: ").append(getCpuManufacturers()).append(",");
        if (getMemoryGiBPerVCpu() != null)
            sb.append("MemoryGiBPerVCpu: ").append(getMemoryGiBPerVCpu()).append(",");
        if (getExcludedInstanceTypes() != null)
            sb.append("ExcludedInstanceTypes: ").append(getExcludedInstanceTypes()).append(",");
        if (getInstanceGenerations() != null)
            sb.append("InstanceGenerations: ").append(getInstanceGenerations()).append(",");
        if (getSpotMaxPricePercentageOverLowestPrice() != null)
            sb.append("SpotMaxPricePercentageOverLowestPrice: ").append(getSpotMaxPricePercentageOverLowestPrice()).append(",");
        if (getOnDemandMaxPricePercentageOverLowestPrice() != null)
            sb.append("OnDemandMaxPricePercentageOverLowestPrice: ").append(getOnDemandMaxPricePercentageOverLowestPrice()).append(",");
        if (getBareMetal() != null)
            sb.append("BareMetal: ").append(getBareMetal()).append(",");
        if (getBurstablePerformance() != null)
            sb.append("BurstablePerformance: ").append(getBurstablePerformance()).append(",");
        if (getRequireHibernateSupport() != null)
            sb.append("RequireHibernateSupport: ").append(getRequireHibernateSupport()).append(",");
        if (getNetworkInterfaceCount() != null)
            sb.append("NetworkInterfaceCount: ").append(getNetworkInterfaceCount()).append(",");
        if (getLocalStorage() != null)
            sb.append("LocalStorage: ").append(getLocalStorage()).append(",");
        if (getLocalStorageTypes() != null)
            sb.append("LocalStorageTypes: ").append(getLocalStorageTypes()).append(",");
        if (getTotalLocalStorageGB() != null)
            sb.append("TotalLocalStorageGB: ").append(getTotalLocalStorageGB()).append(",");
        if (getBaselineEbsBandwidthMbps() != null)
            sb.append("BaselineEbsBandwidthMbps: ").append(getBaselineEbsBandwidthMbps()).append(",");
        if (getAcceleratorTypes() != null)
            sb.append("AcceleratorTypes: ").append(getAcceleratorTypes()).append(",");
        if (getAcceleratorCount() != null)
            sb.append("AcceleratorCount: ").append(getAcceleratorCount()).append(",");
        if (getAcceleratorManufacturers() != null)
            sb.append("AcceleratorManufacturers: ").append(getAcceleratorManufacturers()).append(",");
        if (getAcceleratorNames() != null)
            sb.append("AcceleratorNames: ").append(getAcceleratorNames()).append(",");
        if (getAcceleratorTotalMemoryMiB() != null)
            sb.append("AcceleratorTotalMemoryMiB: ").append(getAcceleratorTotalMemoryMiB());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceRequirements == false)
            return false;
        InstanceRequirements other = (InstanceRequirements) obj;
        if (other.getVCpuCount() == null ^ this.getVCpuCount() == null)
            return false;
        if (other.getVCpuCount() != null && other.getVCpuCount().equals(this.getVCpuCount()) == false)
            return false;
        if (other.getMemoryMiB() == null ^ this.getMemoryMiB() == null)
            return false;
        if (other.getMemoryMiB() != null && other.getMemoryMiB().equals(this.getMemoryMiB()) == false)
            return false;
        if (other.getCpuManufacturers() == null ^ this.getCpuManufacturers() == null)
            return false;
        if (other.getCpuManufacturers() != null && other.getCpuManufacturers().equals(this.getCpuManufacturers()) == false)
            return false;
        if (other.getMemoryGiBPerVCpu() == null ^ this.getMemoryGiBPerVCpu() == null)
            return false;
        if (other.getMemoryGiBPerVCpu() != null && other.getMemoryGiBPerVCpu().equals(this.getMemoryGiBPerVCpu()) == false)
            return false;
        if (other.getExcludedInstanceTypes() == null ^ this.getExcludedInstanceTypes() == null)
            return false;
        if (other.getExcludedInstanceTypes() != null && other.getExcludedInstanceTypes().equals(this.getExcludedInstanceTypes()) == false)
            return false;
        if (other.getInstanceGenerations() == null ^ this.getInstanceGenerations() == null)
            return false;
        if (other.getInstanceGenerations() != null && other.getInstanceGenerations().equals(this.getInstanceGenerations()) == false)
            return false;
        if (other.getSpotMaxPricePercentageOverLowestPrice() == null ^ this.getSpotMaxPricePercentageOverLowestPrice() == null)
            return false;
        if (other.getSpotMaxPricePercentageOverLowestPrice() != null
                && other.getSpotMaxPricePercentageOverLowestPrice().equals(this.getSpotMaxPricePercentageOverLowestPrice()) == false)
            return false;
        if (other.getOnDemandMaxPricePercentageOverLowestPrice() == null ^ this.getOnDemandMaxPricePercentageOverLowestPrice() == null)
            return false;
        if (other.getOnDemandMaxPricePercentageOverLowestPrice() != null
                && other.getOnDemandMaxPricePercentageOverLowestPrice().equals(this.getOnDemandMaxPricePercentageOverLowestPrice()) == false)
            return false;
        if (other.getBareMetal() == null ^ this.getBareMetal() == null)
            return false;
        if (other.getBareMetal() != null && other.getBareMetal().equals(this.getBareMetal()) == false)
            return false;
        if (other.getBurstablePerformance() == null ^ this.getBurstablePerformance() == null)
            return false;
        if (other.getBurstablePerformance() != null && other.getBurstablePerformance().equals(this.getBurstablePerformance()) == false)
            return false;
        if (other.getRequireHibernateSupport() == null ^ this.getRequireHibernateSupport() == null)
            return false;
        if (other.getRequireHibernateSupport() != null && other.getRequireHibernateSupport().equals(this.getRequireHibernateSupport()) == false)
            return false;
        if (other.getNetworkInterfaceCount() == null ^ this.getNetworkInterfaceCount() == null)
            return false;
        if (other.getNetworkInterfaceCount() != null && other.getNetworkInterfaceCount().equals(this.getNetworkInterfaceCount()) == false)
            return false;
        if (other.getLocalStorage() == null ^ this.getLocalStorage() == null)
            return false;
        if (other.getLocalStorage() != null && other.getLocalStorage().equals(this.getLocalStorage()) == false)
            return false;
        if (other.getLocalStorageTypes() == null ^ this.getLocalStorageTypes() == null)
            return false;
        if (other.getLocalStorageTypes() != null && other.getLocalStorageTypes().equals(this.getLocalStorageTypes()) == false)
            return false;
        if (other.getTotalLocalStorageGB() == null ^ this.getTotalLocalStorageGB() == null)
            return false;
        if (other.getTotalLocalStorageGB() != null && other.getTotalLocalStorageGB().equals(this.getTotalLocalStorageGB()) == false)
            return false;
        if (other.getBaselineEbsBandwidthMbps() == null ^ this.getBaselineEbsBandwidthMbps() == null)
            return false;
        if (other.getBaselineEbsBandwidthMbps() != null && other.getBaselineEbsBandwidthMbps().equals(this.getBaselineEbsBandwidthMbps()) == false)
            return false;
        if (other.getAcceleratorTypes() == null ^ this.getAcceleratorTypes() == null)
            return false;
        if (other.getAcceleratorTypes() != null && other.getAcceleratorTypes().equals(this.getAcceleratorTypes()) == false)
            return false;
        if (other.getAcceleratorCount() == null ^ this.getAcceleratorCount() == null)
            return false;
        if (other.getAcceleratorCount() != null && other.getAcceleratorCount().equals(this.getAcceleratorCount()) == false)
            return false;
        if (other.getAcceleratorManufacturers() == null ^ this.getAcceleratorManufacturers() == null)
            return false;
        if (other.getAcceleratorManufacturers() != null && other.getAcceleratorManufacturers().equals(this.getAcceleratorManufacturers()) == false)
            return false;
        if (other.getAcceleratorNames() == null ^ this.getAcceleratorNames() == null)
            return false;
        if (other.getAcceleratorNames() != null && other.getAcceleratorNames().equals(this.getAcceleratorNames()) == false)
            return false;
        if (other.getAcceleratorTotalMemoryMiB() == null ^ this.getAcceleratorTotalMemoryMiB() == null)
            return false;
        if (other.getAcceleratorTotalMemoryMiB() != null && other.getAcceleratorTotalMemoryMiB().equals(this.getAcceleratorTotalMemoryMiB()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVCpuCount() == null) ? 0 : getVCpuCount().hashCode());
        hashCode = prime * hashCode + ((getMemoryMiB() == null) ? 0 : getMemoryMiB().hashCode());
        hashCode = prime * hashCode + ((getCpuManufacturers() == null) ? 0 : getCpuManufacturers().hashCode());
        hashCode = prime * hashCode + ((getMemoryGiBPerVCpu() == null) ? 0 : getMemoryGiBPerVCpu().hashCode());
        hashCode = prime * hashCode + ((getExcludedInstanceTypes() == null) ? 0 : getExcludedInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getInstanceGenerations() == null) ? 0 : getInstanceGenerations().hashCode());
        hashCode = prime * hashCode + ((getSpotMaxPricePercentageOverLowestPrice() == null) ? 0 : getSpotMaxPricePercentageOverLowestPrice().hashCode());
        hashCode = prime * hashCode
                + ((getOnDemandMaxPricePercentageOverLowestPrice() == null) ? 0 : getOnDemandMaxPricePercentageOverLowestPrice().hashCode());
        hashCode = prime * hashCode + ((getBareMetal() == null) ? 0 : getBareMetal().hashCode());
        hashCode = prime * hashCode + ((getBurstablePerformance() == null) ? 0 : getBurstablePerformance().hashCode());
        hashCode = prime * hashCode + ((getRequireHibernateSupport() == null) ? 0 : getRequireHibernateSupport().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceCount() == null) ? 0 : getNetworkInterfaceCount().hashCode());
        hashCode = prime * hashCode + ((getLocalStorage() == null) ? 0 : getLocalStorage().hashCode());
        hashCode = prime * hashCode + ((getLocalStorageTypes() == null) ? 0 : getLocalStorageTypes().hashCode());
        hashCode = prime * hashCode + ((getTotalLocalStorageGB() == null) ? 0 : getTotalLocalStorageGB().hashCode());
        hashCode = prime * hashCode + ((getBaselineEbsBandwidthMbps() == null) ? 0 : getBaselineEbsBandwidthMbps().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorTypes() == null) ? 0 : getAcceleratorTypes().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorCount() == null) ? 0 : getAcceleratorCount().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorManufacturers() == null) ? 0 : getAcceleratorManufacturers().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorNames() == null) ? 0 : getAcceleratorNames().hashCode());
        hashCode = prime * hashCode + ((getAcceleratorTotalMemoryMiB() == null) ? 0 : getAcceleratorTotalMemoryMiB().hashCode());
        return hashCode;
    }

    @Override
    public InstanceRequirements clone() {
        try {
            return (InstanceRequirements) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
