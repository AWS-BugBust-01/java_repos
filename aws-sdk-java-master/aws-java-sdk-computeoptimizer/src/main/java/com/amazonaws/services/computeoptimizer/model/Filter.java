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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a filter that returns a more specific list of recommendations. Use this filter with the
 * <a>GetAutoScalingGroupRecommendations</a> and <a>GetEC2InstanceRecommendations</a> actions.
 * </p>
 * <p>
 * You can use <code>EBSFilter</code> with the <a>GetEBSVolumeRecommendations</a> action,
 * <code>LambdaFunctionRecommendationFilter</code> with the <a>GetLambdaFunctionRecommendations</a> action, and
 * <code>JobFilter</code> with the <a>DescribeRecommendationExportJobs</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/Filter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Specify <code>Finding</code> to return recommendations with a specific finding classification (for example,
     * <code>Underprovisioned</code>).
     * </p>
     * <p>
     * Specify <code>RecommendationSourceType</code> to return recommendations of a specific resource type (for example,
     * <code>Ec2Instance</code>).
     * </p>
     * <p>
     * Specify <code>FindingReasonCodes</code> to return recommendations with a specific finding reason code (for
     * example, <code>CPUUnderprovisioned</code>).
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the filter.
     * </p>
     * <p>
     * The valid values for this parameter are as follows, depending on what you specify for the <code>name</code>
     * parameter and the resource type that you wish to filter results for:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify <code>Optimized</code> or <code>NotOptimized</code> if you specify the <code>name</code> parameter as
     * <code>Finding</code> and you want to filter results for Auto Scaling groups.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>Underprovisioned</code>, <code>Overprovisioned</code>, or <code>Optimized</code> if you specify the
     * <code>name</code> parameter as <code>Finding</code> and you want to filter results for EC2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>Ec2Instance</code> or <code>AutoScalingGroup</code> if you specify the <code>name</code> parameter
     * as <code>RecommendationSourceType</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify one of the following options if you specify the <code>name</code> parameter as
     * <code>FindingReasonCodes</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUOverprovisioned</code> </b> — The instance’s CPU configuration can be sized down while still meeting
     * the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>CPUUnderprovisioned</code> </b> — The instance’s CPU configuration doesn't meet the performance
     * requirements of your workload and there is an alternative instance type that provides better CPU performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryOverprovisioned</code> </b> — The instance’s memory configuration can be sized down while still
     * meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryUnderprovisioned</code> </b> — The instance’s memory configuration doesn't meet the performance
     * requirements of your workload and there is an alternative instance type that provides better memory performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EBSThroughputOverprovisioned</code> </b> — The instance’s EBS throughput configuration can be sized
     * down while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EBSThroughputUnderprovisioned</code> </b> — The instance’s EBS throughput configuration doesn't meet
     * the performance requirements of your workload and there is an alternative instance type that provides better EBS
     * throughput performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EBSIOPSOverprovisioned</code> </b> — The instance’s EBS IOPS configuration can be sized down while
     * still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EBSIOPSUnderprovisioned</code> </b> — The instance’s EBS IOPS configuration doesn't meet the
     * performance requirements of your workload and there is an alternative instance type that provides better EBS IOPS
     * performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkBandwidthOverprovisioned</code> </b> — The instance’s network bandwidth configuration can be
     * sized down while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkBandwidthUnderprovisioned</code> </b> — The instance’s network bandwidth configuration doesn't
     * meet the performance requirements of your workload and there is an alternative instance type that provides better
     * network bandwidth performance. This finding reason happens when the <code>NetworkIn</code> or
     * <code>NetworkOut</code> performance of an instance is impacted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkPPSOverprovisioned</code> </b> — The instance’s network PPS (packets per second) configuration
     * can be sized down while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkPPSUnderprovisioned</code> </b> — The instance’s network PPS (packets per second) configuration
     * doesn't meet the performance requirements of your workload and there is an alternative instance type that
     * provides better network PPS performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskIOPSOverprovisioned</code> </b> — The instance’s disk IOPS configuration can be sized down while
     * still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskIOPSUnderprovisioned</code> </b> — The instance’s disk IOPS configuration doesn't meet the
     * performance requirements of your workload and there is an alternative instance type that provides better disk
     * IOPS performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskThroughputOverprovisioned</code> </b> — The instance’s disk throughput configuration can be sized
     * down while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskThroughputUnderprovisioned</code> </b> — The instance’s disk throughput configuration doesn't meet
     * the performance requirements of your workload and there is an alternative instance type that provides better disk
     * throughput performance.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Specify <code>Finding</code> to return recommendations with a specific finding classification (for example,
     * <code>Underprovisioned</code>).
     * </p>
     * <p>
     * Specify <code>RecommendationSourceType</code> to return recommendations of a specific resource type (for example,
     * <code>Ec2Instance</code>).
     * </p>
     * <p>
     * Specify <code>FindingReasonCodes</code> to return recommendations with a specific finding reason code (for
     * example, <code>CPUUnderprovisioned</code>).
     * </p>
     * 
     * @param name
     *        The name of the filter.</p>
     *        <p>
     *        Specify <code>Finding</code> to return recommendations with a specific finding classification (for
     *        example, <code>Underprovisioned</code>).
     *        </p>
     *        <p>
     *        Specify <code>RecommendationSourceType</code> to return recommendations of a specific resource type (for
     *        example, <code>Ec2Instance</code>).
     *        </p>
     *        <p>
     *        Specify <code>FindingReasonCodes</code> to return recommendations with a specific finding reason code (for
     *        example, <code>CPUUnderprovisioned</code>).
     * @see FilterName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Specify <code>Finding</code> to return recommendations with a specific finding classification (for example,
     * <code>Underprovisioned</code>).
     * </p>
     * <p>
     * Specify <code>RecommendationSourceType</code> to return recommendations of a specific resource type (for example,
     * <code>Ec2Instance</code>).
     * </p>
     * <p>
     * Specify <code>FindingReasonCodes</code> to return recommendations with a specific finding reason code (for
     * example, <code>CPUUnderprovisioned</code>).
     * </p>
     * 
     * @return The name of the filter.</p>
     *         <p>
     *         Specify <code>Finding</code> to return recommendations with a specific finding classification (for
     *         example, <code>Underprovisioned</code>).
     *         </p>
     *         <p>
     *         Specify <code>RecommendationSourceType</code> to return recommendations of a specific resource type (for
     *         example, <code>Ec2Instance</code>).
     *         </p>
     *         <p>
     *         Specify <code>FindingReasonCodes</code> to return recommendations with a specific finding reason code
     *         (for example, <code>CPUUnderprovisioned</code>).
     * @see FilterName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Specify <code>Finding</code> to return recommendations with a specific finding classification (for example,
     * <code>Underprovisioned</code>).
     * </p>
     * <p>
     * Specify <code>RecommendationSourceType</code> to return recommendations of a specific resource type (for example,
     * <code>Ec2Instance</code>).
     * </p>
     * <p>
     * Specify <code>FindingReasonCodes</code> to return recommendations with a specific finding reason code (for
     * example, <code>CPUUnderprovisioned</code>).
     * </p>
     * 
     * @param name
     *        The name of the filter.</p>
     *        <p>
     *        Specify <code>Finding</code> to return recommendations with a specific finding classification (for
     *        example, <code>Underprovisioned</code>).
     *        </p>
     *        <p>
     *        Specify <code>RecommendationSourceType</code> to return recommendations of a specific resource type (for
     *        example, <code>Ec2Instance</code>).
     *        </p>
     *        <p>
     *        Specify <code>FindingReasonCodes</code> to return recommendations with a specific finding reason code (for
     *        example, <code>CPUUnderprovisioned</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterName
     */

    public Filter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * <p>
     * Specify <code>Finding</code> to return recommendations with a specific finding classification (for example,
     * <code>Underprovisioned</code>).
     * </p>
     * <p>
     * Specify <code>RecommendationSourceType</code> to return recommendations of a specific resource type (for example,
     * <code>Ec2Instance</code>).
     * </p>
     * <p>
     * Specify <code>FindingReasonCodes</code> to return recommendations with a specific finding reason code (for
     * example, <code>CPUUnderprovisioned</code>).
     * </p>
     * 
     * @param name
     *        The name of the filter.</p>
     *        <p>
     *        Specify <code>Finding</code> to return recommendations with a specific finding classification (for
     *        example, <code>Underprovisioned</code>).
     *        </p>
     *        <p>
     *        Specify <code>RecommendationSourceType</code> to return recommendations of a specific resource type (for
     *        example, <code>Ec2Instance</code>).
     *        </p>
     *        <p>
     *        Specify <code>FindingReasonCodes</code> to return recommendations with a specific finding reason code (for
     *        example, <code>CPUUnderprovisioned</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterName
     */

    public Filter withName(FilterName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The value of the filter.
     * </p>
     * <p>
     * The valid values for this parameter are as follows, depending on what you specify for the <code>name</code>
     * parameter and the resource type that you wish to filter results for:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify <code>Optimized</code> or <code>NotOptimized</code> if you specify the <code>name</code> parameter as
     * <code>Finding</code> and you want to filter results for Auto Scaling groups.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>Underprovisioned</code>, <code>Overprovisioned</code>, or <code>Optimized</code> if you specify the
     * <code>name</code> parameter as <code>Finding</code> and you want to filter results for EC2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>Ec2Instance</code> or <code>AutoScalingGroup</code> if you specify the <code>name</code> parameter
     * as <code>RecommendationSourceType</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify one of the following options if you specify the <code>name</code> parameter as
     * <code>FindingReasonCodes</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUOverprovisioned</code> </b> — The instance’s CPU configuration can be sized down while still meeting
     * the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>CPUUnderprovisioned</code> </b> — The instance’s CPU configuration doesn't meet the performance
     * requirements of your workload and there is an alternative instance type that provides better CPU performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryOverprovisioned</code> </b> — The instance’s memory configuration can be sized down while still
     * meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryUnderprovisioned</code> </b> — The instance’s memory configuration doesn't meet the performance
     * requirements of your workload and there is an alternative instance type that provides better memory performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EBSThroughputOverprovisioned</code> </b> — The instance’s EBS throughput configuration can be sized
     * down while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EBSThroughputUnderprovisioned</code> </b> — The instance’s EBS throughput configuration doesn't meet
     * the performance requirements of your workload and there is an alternative instance type that provides better EBS
     * throughput performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EBSIOPSOverprovisioned</code> </b> — The instance’s EBS IOPS configuration can be sized down while
     * still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EBSIOPSUnderprovisioned</code> </b> — The instance’s EBS IOPS configuration doesn't meet the
     * performance requirements of your workload and there is an alternative instance type that provides better EBS IOPS
     * performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkBandwidthOverprovisioned</code> </b> — The instance’s network bandwidth configuration can be
     * sized down while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkBandwidthUnderprovisioned</code> </b> — The instance’s network bandwidth configuration doesn't
     * meet the performance requirements of your workload and there is an alternative instance type that provides better
     * network bandwidth performance. This finding reason happens when the <code>NetworkIn</code> or
     * <code>NetworkOut</code> performance of an instance is impacted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkPPSOverprovisioned</code> </b> — The instance’s network PPS (packets per second) configuration
     * can be sized down while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkPPSUnderprovisioned</code> </b> — The instance’s network PPS (packets per second) configuration
     * doesn't meet the performance requirements of your workload and there is an alternative instance type that
     * provides better network PPS performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskIOPSOverprovisioned</code> </b> — The instance’s disk IOPS configuration can be sized down while
     * still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskIOPSUnderprovisioned</code> </b> — The instance’s disk IOPS configuration doesn't meet the
     * performance requirements of your workload and there is an alternative instance type that provides better disk
     * IOPS performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskThroughputOverprovisioned</code> </b> — The instance’s disk throughput configuration can be sized
     * down while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskThroughputUnderprovisioned</code> </b> — The instance’s disk throughput configuration doesn't meet
     * the performance requirements of your workload and there is an alternative instance type that provides better disk
     * throughput performance.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The value of the filter.</p>
     *         <p>
     *         The valid values for this parameter are as follows, depending on what you specify for the
     *         <code>name</code> parameter and the resource type that you wish to filter results for:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specify <code>Optimized</code> or <code>NotOptimized</code> if you specify the <code>name</code>
     *         parameter as <code>Finding</code> and you want to filter results for Auto Scaling groups.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify <code>Underprovisioned</code>, <code>Overprovisioned</code>, or <code>Optimized</code> if you
     *         specify the <code>name</code> parameter as <code>Finding</code> and you want to filter results for EC2
     *         instances.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify <code>Ec2Instance</code> or <code>AutoScalingGroup</code> if you specify the <code>name</code>
     *         parameter as <code>RecommendationSourceType</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specify one of the following options if you specify the <code>name</code> parameter as
     *         <code>FindingReasonCodes</code>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>CPUOverprovisioned</code> </b> — The instance’s CPU configuration can be sized down while still
     *         meeting the performance requirements of your workload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>CPUUnderprovisioned</code> </b> — The instance’s CPU configuration doesn't meet the performance
     *         requirements of your workload and there is an alternative instance type that provides better CPU
     *         performance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>MemoryOverprovisioned</code> </b> — The instance’s memory configuration can be sized down while
     *         still meeting the performance requirements of your workload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>MemoryUnderprovisioned</code> </b> — The instance’s memory configuration doesn't meet the
     *         performance requirements of your workload and there is an alternative instance type that provides better
     *         memory performance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>EBSThroughputOverprovisioned</code> </b> — The instance’s EBS throughput configuration can be
     *         sized down while still meeting the performance requirements of your workload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>EBSThroughputUnderprovisioned</code> </b> — The instance’s EBS throughput configuration doesn't
     *         meet the performance requirements of your workload and there is an alternative instance type that
     *         provides better EBS throughput performance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>EBSIOPSOverprovisioned</code> </b> — The instance’s EBS IOPS configuration can be sized down
     *         while still meeting the performance requirements of your workload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>EBSIOPSUnderprovisioned</code> </b> — The instance’s EBS IOPS configuration doesn't meet the
     *         performance requirements of your workload and there is an alternative instance type that provides better
     *         EBS IOPS performance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>NetworkBandwidthOverprovisioned</code> </b> — The instance’s network bandwidth configuration
     *         can be sized down while still meeting the performance requirements of your workload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>NetworkBandwidthUnderprovisioned</code> </b> — The instance’s network bandwidth configuration
     *         doesn't meet the performance requirements of your workload and there is an alternative instance type that
     *         provides better network bandwidth performance. This finding reason happens when the
     *         <code>NetworkIn</code> or <code>NetworkOut</code> performance of an instance is impacted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>NetworkPPSOverprovisioned</code> </b> — The instance’s network PPS (packets per second)
     *         configuration can be sized down while still meeting the performance requirements of your workload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>NetworkPPSUnderprovisioned</code> </b> — The instance’s network PPS (packets per second)
     *         configuration doesn't meet the performance requirements of your workload and there is an alternative
     *         instance type that provides better network PPS performance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>DiskIOPSOverprovisioned</code> </b> — The instance’s disk IOPS configuration can be sized down
     *         while still meeting the performance requirements of your workload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>DiskIOPSUnderprovisioned</code> </b> — The instance’s disk IOPS configuration doesn't meet the
     *         performance requirements of your workload and there is an alternative instance type that provides better
     *         disk IOPS performance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>DiskThroughputOverprovisioned</code> </b> — The instance’s disk throughput configuration can be
     *         sized down while still meeting the performance requirements of your workload.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>DiskThroughputUnderprovisioned</code> </b> — The instance’s disk throughput configuration
     *         doesn't meet the performance requirements of your workload and there is an alternative instance type that
     *         provides better disk throughput performance.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The value of the filter.
     * </p>
     * <p>
     * The valid values for this parameter are as follows, depending on what you specify for the <code>name</code>
     * parameter and the resource type that you wish to filter results for:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify <code>Optimized</code> or <code>NotOptimized</code> if you specify the <code>name</code> parameter as
     * <code>Finding</code> and you want to filter results for Auto Scaling groups.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>Underprovisioned</code>, <code>Overprovisioned</code>, or <code>Optimized</code> if you specify the
     * <code>name</code> parameter as <code>Finding</code> and you want to filter results for EC2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>Ec2Instance</code> or <code>AutoScalingGroup</code> if you specify the <code>name</code> parameter
     * as <code>RecommendationSourceType</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify one of the following options if you specify the <code>name</code> parameter as
     * <code>FindingReasonCodes</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUOverprovisioned</code> </b> — The instance’s CPU configuration can be sized down while still meeting
     * the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>CPUUnderprovisioned</code> </b> — The instance’s CPU configuration doesn't meet the performance
     * requirements of your workload and there is an alternative instance type that provides better CPU performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryOverprovisioned</code> </b> — The instance’s memory configuration can be sized down while still
     * meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryUnderprovisioned</code> </b> — The instance’s memory configuration doesn't meet the performance
     * requirements of your workload and there is an alternative instance type that provides better memory performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EBSThroughputOverprovisioned</code> </b> — The instance’s EBS throughput configuration can be sized
     * down while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EBSThroughputUnderprovisioned</code> </b> — The instance’s EBS throughput configuration doesn't meet
     * the performance requirements of your workload and there is an alternative instance type that provides better EBS
     * throughput performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EBSIOPSOverprovisioned</code> </b> — The instance’s EBS IOPS configuration can be sized down while
     * still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EBSIOPSUnderprovisioned</code> </b> — The instance’s EBS IOPS configuration doesn't meet the
     * performance requirements of your workload and there is an alternative instance type that provides better EBS IOPS
     * performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkBandwidthOverprovisioned</code> </b> — The instance’s network bandwidth configuration can be
     * sized down while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkBandwidthUnderprovisioned</code> </b> — The instance’s network bandwidth configuration doesn't
     * meet the performance requirements of your workload and there is an alternative instance type that provides better
     * network bandwidth performance. This finding reason happens when the <code>NetworkIn</code> or
     * <code>NetworkOut</code> performance of an instance is impacted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkPPSOverprovisioned</code> </b> — The instance’s network PPS (packets per second) configuration
     * can be sized down while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkPPSUnderprovisioned</code> </b> — The instance’s network PPS (packets per second) configuration
     * doesn't meet the performance requirements of your workload and there is an alternative instance type that
     * provides better network PPS performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskIOPSOverprovisioned</code> </b> — The instance’s disk IOPS configuration can be sized down while
     * still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskIOPSUnderprovisioned</code> </b> — The instance’s disk IOPS configuration doesn't meet the
     * performance requirements of your workload and there is an alternative instance type that provides better disk
     * IOPS performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskThroughputOverprovisioned</code> </b> — The instance’s disk throughput configuration can be sized
     * down while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskThroughputUnderprovisioned</code> </b> — The instance’s disk throughput configuration doesn't meet
     * the performance requirements of your workload and there is an alternative instance type that provides better disk
     * throughput performance.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param values
     *        The value of the filter.</p>
     *        <p>
     *        The valid values for this parameter are as follows, depending on what you specify for the
     *        <code>name</code> parameter and the resource type that you wish to filter results for:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify <code>Optimized</code> or <code>NotOptimized</code> if you specify the <code>name</code> parameter
     *        as <code>Finding</code> and you want to filter results for Auto Scaling groups.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>Underprovisioned</code>, <code>Overprovisioned</code>, or <code>Optimized</code> if you
     *        specify the <code>name</code> parameter as <code>Finding</code> and you want to filter results for EC2
     *        instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>Ec2Instance</code> or <code>AutoScalingGroup</code> if you specify the <code>name</code>
     *        parameter as <code>RecommendationSourceType</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify one of the following options if you specify the <code>name</code> parameter as
     *        <code>FindingReasonCodes</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>CPUOverprovisioned</code> </b> — The instance’s CPU configuration can be sized down while still
     *        meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>CPUUnderprovisioned</code> </b> — The instance’s CPU configuration doesn't meet the performance
     *        requirements of your workload and there is an alternative instance type that provides better CPU
     *        performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>MemoryOverprovisioned</code> </b> — The instance’s memory configuration can be sized down while
     *        still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>MemoryUnderprovisioned</code> </b> — The instance’s memory configuration doesn't meet the
     *        performance requirements of your workload and there is an alternative instance type that provides better
     *        memory performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>EBSThroughputOverprovisioned</code> </b> — The instance’s EBS throughput configuration can be
     *        sized down while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>EBSThroughputUnderprovisioned</code> </b> — The instance’s EBS throughput configuration doesn't
     *        meet the performance requirements of your workload and there is an alternative instance type that provides
     *        better EBS throughput performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>EBSIOPSOverprovisioned</code> </b> — The instance’s EBS IOPS configuration can be sized down
     *        while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>EBSIOPSUnderprovisioned</code> </b> — The instance’s EBS IOPS configuration doesn't meet the
     *        performance requirements of your workload and there is an alternative instance type that provides better
     *        EBS IOPS performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkBandwidthOverprovisioned</code> </b> — The instance’s network bandwidth configuration can
     *        be sized down while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkBandwidthUnderprovisioned</code> </b> — The instance’s network bandwidth configuration
     *        doesn't meet the performance requirements of your workload and there is an alternative instance type that
     *        provides better network bandwidth performance. This finding reason happens when the <code>NetworkIn</code>
     *        or <code>NetworkOut</code> performance of an instance is impacted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkPPSOverprovisioned</code> </b> — The instance’s network PPS (packets per second)
     *        configuration can be sized down while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkPPSUnderprovisioned</code> </b> — The instance’s network PPS (packets per second)
     *        configuration doesn't meet the performance requirements of your workload and there is an alternative
     *        instance type that provides better network PPS performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>DiskIOPSOverprovisioned</code> </b> — The instance’s disk IOPS configuration can be sized down
     *        while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>DiskIOPSUnderprovisioned</code> </b> — The instance’s disk IOPS configuration doesn't meet the
     *        performance requirements of your workload and there is an alternative instance type that provides better
     *        disk IOPS performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>DiskThroughputOverprovisioned</code> </b> — The instance’s disk throughput configuration can be
     *        sized down while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>DiskThroughputUnderprovisioned</code> </b> — The instance’s disk throughput configuration
     *        doesn't meet the performance requirements of your workload and there is an alternative instance type that
     *        provides better disk throughput performance.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The value of the filter.
     * </p>
     * <p>
     * The valid values for this parameter are as follows, depending on what you specify for the <code>name</code>
     * parameter and the resource type that you wish to filter results for:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify <code>Optimized</code> or <code>NotOptimized</code> if you specify the <code>name</code> parameter as
     * <code>Finding</code> and you want to filter results for Auto Scaling groups.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>Underprovisioned</code>, <code>Overprovisioned</code>, or <code>Optimized</code> if you specify the
     * <code>name</code> parameter as <code>Finding</code> and you want to filter results for EC2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>Ec2Instance</code> or <code>AutoScalingGroup</code> if you specify the <code>name</code> parameter
     * as <code>RecommendationSourceType</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify one of the following options if you specify the <code>name</code> parameter as
     * <code>FindingReasonCodes</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUOverprovisioned</code> </b> — The instance’s CPU configuration can be sized down while still meeting
     * the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>CPUUnderprovisioned</code> </b> — The instance’s CPU configuration doesn't meet the performance
     * requirements of your workload and there is an alternative instance type that provides better CPU performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryOverprovisioned</code> </b> — The instance’s memory configuration can be sized down while still
     * meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryUnderprovisioned</code> </b> — The instance’s memory configuration doesn't meet the performance
     * requirements of your workload and there is an alternative instance type that provides better memory performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EBSThroughputOverprovisioned</code> </b> — The instance’s EBS throughput configuration can be sized
     * down while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EBSThroughputUnderprovisioned</code> </b> — The instance’s EBS throughput configuration doesn't meet
     * the performance requirements of your workload and there is an alternative instance type that provides better EBS
     * throughput performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EBSIOPSOverprovisioned</code> </b> — The instance’s EBS IOPS configuration can be sized down while
     * still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EBSIOPSUnderprovisioned</code> </b> — The instance’s EBS IOPS configuration doesn't meet the
     * performance requirements of your workload and there is an alternative instance type that provides better EBS IOPS
     * performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkBandwidthOverprovisioned</code> </b> — The instance’s network bandwidth configuration can be
     * sized down while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkBandwidthUnderprovisioned</code> </b> — The instance’s network bandwidth configuration doesn't
     * meet the performance requirements of your workload and there is an alternative instance type that provides better
     * network bandwidth performance. This finding reason happens when the <code>NetworkIn</code> or
     * <code>NetworkOut</code> performance of an instance is impacted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkPPSOverprovisioned</code> </b> — The instance’s network PPS (packets per second) configuration
     * can be sized down while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkPPSUnderprovisioned</code> </b> — The instance’s network PPS (packets per second) configuration
     * doesn't meet the performance requirements of your workload and there is an alternative instance type that
     * provides better network PPS performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskIOPSOverprovisioned</code> </b> — The instance’s disk IOPS configuration can be sized down while
     * still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskIOPSUnderprovisioned</code> </b> — The instance’s disk IOPS configuration doesn't meet the
     * performance requirements of your workload and there is an alternative instance type that provides better disk
     * IOPS performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskThroughputOverprovisioned</code> </b> — The instance’s disk throughput configuration can be sized
     * down while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskThroughputUnderprovisioned</code> </b> — The instance’s disk throughput configuration doesn't meet
     * the performance requirements of your workload and there is an alternative instance type that provides better disk
     * throughput performance.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The value of the filter.</p>
     *        <p>
     *        The valid values for this parameter are as follows, depending on what you specify for the
     *        <code>name</code> parameter and the resource type that you wish to filter results for:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify <code>Optimized</code> or <code>NotOptimized</code> if you specify the <code>name</code> parameter
     *        as <code>Finding</code> and you want to filter results for Auto Scaling groups.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>Underprovisioned</code>, <code>Overprovisioned</code>, or <code>Optimized</code> if you
     *        specify the <code>name</code> parameter as <code>Finding</code> and you want to filter results for EC2
     *        instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>Ec2Instance</code> or <code>AutoScalingGroup</code> if you specify the <code>name</code>
     *        parameter as <code>RecommendationSourceType</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify one of the following options if you specify the <code>name</code> parameter as
     *        <code>FindingReasonCodes</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>CPUOverprovisioned</code> </b> — The instance’s CPU configuration can be sized down while still
     *        meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>CPUUnderprovisioned</code> </b> — The instance’s CPU configuration doesn't meet the performance
     *        requirements of your workload and there is an alternative instance type that provides better CPU
     *        performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>MemoryOverprovisioned</code> </b> — The instance’s memory configuration can be sized down while
     *        still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>MemoryUnderprovisioned</code> </b> — The instance’s memory configuration doesn't meet the
     *        performance requirements of your workload and there is an alternative instance type that provides better
     *        memory performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>EBSThroughputOverprovisioned</code> </b> — The instance’s EBS throughput configuration can be
     *        sized down while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>EBSThroughputUnderprovisioned</code> </b> — The instance’s EBS throughput configuration doesn't
     *        meet the performance requirements of your workload and there is an alternative instance type that provides
     *        better EBS throughput performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>EBSIOPSOverprovisioned</code> </b> — The instance’s EBS IOPS configuration can be sized down
     *        while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>EBSIOPSUnderprovisioned</code> </b> — The instance’s EBS IOPS configuration doesn't meet the
     *        performance requirements of your workload and there is an alternative instance type that provides better
     *        EBS IOPS performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkBandwidthOverprovisioned</code> </b> — The instance’s network bandwidth configuration can
     *        be sized down while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkBandwidthUnderprovisioned</code> </b> — The instance’s network bandwidth configuration
     *        doesn't meet the performance requirements of your workload and there is an alternative instance type that
     *        provides better network bandwidth performance. This finding reason happens when the <code>NetworkIn</code>
     *        or <code>NetworkOut</code> performance of an instance is impacted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkPPSOverprovisioned</code> </b> — The instance’s network PPS (packets per second)
     *        configuration can be sized down while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkPPSUnderprovisioned</code> </b> — The instance’s network PPS (packets per second)
     *        configuration doesn't meet the performance requirements of your workload and there is an alternative
     *        instance type that provides better network PPS performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>DiskIOPSOverprovisioned</code> </b> — The instance’s disk IOPS configuration can be sized down
     *        while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>DiskIOPSUnderprovisioned</code> </b> — The instance’s disk IOPS configuration doesn't meet the
     *        performance requirements of your workload and there is an alternative instance type that provides better
     *        disk IOPS performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>DiskThroughputOverprovisioned</code> </b> — The instance’s disk throughput configuration can be
     *        sized down while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>DiskThroughputUnderprovisioned</code> </b> — The instance’s disk throughput configuration
     *        doesn't meet the performance requirements of your workload and there is an alternative instance type that
     *        provides better disk throughput performance.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The value of the filter.
     * </p>
     * <p>
     * The valid values for this parameter are as follows, depending on what you specify for the <code>name</code>
     * parameter and the resource type that you wish to filter results for:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specify <code>Optimized</code> or <code>NotOptimized</code> if you specify the <code>name</code> parameter as
     * <code>Finding</code> and you want to filter results for Auto Scaling groups.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>Underprovisioned</code>, <code>Overprovisioned</code>, or <code>Optimized</code> if you specify the
     * <code>name</code> parameter as <code>Finding</code> and you want to filter results for EC2 instances.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify <code>Ec2Instance</code> or <code>AutoScalingGroup</code> if you specify the <code>name</code> parameter
     * as <code>RecommendationSourceType</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specify one of the following options if you specify the <code>name</code> parameter as
     * <code>FindingReasonCodes</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUOverprovisioned</code> </b> — The instance’s CPU configuration can be sized down while still meeting
     * the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>CPUUnderprovisioned</code> </b> — The instance’s CPU configuration doesn't meet the performance
     * requirements of your workload and there is an alternative instance type that provides better CPU performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryOverprovisioned</code> </b> — The instance’s memory configuration can be sized down while still
     * meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>MemoryUnderprovisioned</code> </b> — The instance’s memory configuration doesn't meet the performance
     * requirements of your workload and there is an alternative instance type that provides better memory performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EBSThroughputOverprovisioned</code> </b> — The instance’s EBS throughput configuration can be sized
     * down while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EBSThroughputUnderprovisioned</code> </b> — The instance’s EBS throughput configuration doesn't meet
     * the performance requirements of your workload and there is an alternative instance type that provides better EBS
     * throughput performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EBSIOPSOverprovisioned</code> </b> — The instance’s EBS IOPS configuration can be sized down while
     * still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>EBSIOPSUnderprovisioned</code> </b> — The instance’s EBS IOPS configuration doesn't meet the
     * performance requirements of your workload and there is an alternative instance type that provides better EBS IOPS
     * performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkBandwidthOverprovisioned</code> </b> — The instance’s network bandwidth configuration can be
     * sized down while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkBandwidthUnderprovisioned</code> </b> — The instance’s network bandwidth configuration doesn't
     * meet the performance requirements of your workload and there is an alternative instance type that provides better
     * network bandwidth performance. This finding reason happens when the <code>NetworkIn</code> or
     * <code>NetworkOut</code> performance of an instance is impacted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkPPSOverprovisioned</code> </b> — The instance’s network PPS (packets per second) configuration
     * can be sized down while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkPPSUnderprovisioned</code> </b> — The instance’s network PPS (packets per second) configuration
     * doesn't meet the performance requirements of your workload and there is an alternative instance type that
     * provides better network PPS performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskIOPSOverprovisioned</code> </b> — The instance’s disk IOPS configuration can be sized down while
     * still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskIOPSUnderprovisioned</code> </b> — The instance’s disk IOPS configuration doesn't meet the
     * performance requirements of your workload and there is an alternative instance type that provides better disk
     * IOPS performance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskThroughputOverprovisioned</code> </b> — The instance’s disk throughput configuration can be sized
     * down while still meeting the performance requirements of your workload.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>DiskThroughputUnderprovisioned</code> </b> — The instance’s disk throughput configuration doesn't meet
     * the performance requirements of your workload and there is an alternative instance type that provides better disk
     * throughput performance.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param values
     *        The value of the filter.</p>
     *        <p>
     *        The valid values for this parameter are as follows, depending on what you specify for the
     *        <code>name</code> parameter and the resource type that you wish to filter results for:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specify <code>Optimized</code> or <code>NotOptimized</code> if you specify the <code>name</code> parameter
     *        as <code>Finding</code> and you want to filter results for Auto Scaling groups.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>Underprovisioned</code>, <code>Overprovisioned</code>, or <code>Optimized</code> if you
     *        specify the <code>name</code> parameter as <code>Finding</code> and you want to filter results for EC2
     *        instances.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify <code>Ec2Instance</code> or <code>AutoScalingGroup</code> if you specify the <code>name</code>
     *        parameter as <code>RecommendationSourceType</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specify one of the following options if you specify the <code>name</code> parameter as
     *        <code>FindingReasonCodes</code>:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>CPUOverprovisioned</code> </b> — The instance’s CPU configuration can be sized down while still
     *        meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>CPUUnderprovisioned</code> </b> — The instance’s CPU configuration doesn't meet the performance
     *        requirements of your workload and there is an alternative instance type that provides better CPU
     *        performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>MemoryOverprovisioned</code> </b> — The instance’s memory configuration can be sized down while
     *        still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>MemoryUnderprovisioned</code> </b> — The instance’s memory configuration doesn't meet the
     *        performance requirements of your workload and there is an alternative instance type that provides better
     *        memory performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>EBSThroughputOverprovisioned</code> </b> — The instance’s EBS throughput configuration can be
     *        sized down while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>EBSThroughputUnderprovisioned</code> </b> — The instance’s EBS throughput configuration doesn't
     *        meet the performance requirements of your workload and there is an alternative instance type that provides
     *        better EBS throughput performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>EBSIOPSOverprovisioned</code> </b> — The instance’s EBS IOPS configuration can be sized down
     *        while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>EBSIOPSUnderprovisioned</code> </b> — The instance’s EBS IOPS configuration doesn't meet the
     *        performance requirements of your workload and there is an alternative instance type that provides better
     *        EBS IOPS performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkBandwidthOverprovisioned</code> </b> — The instance’s network bandwidth configuration can
     *        be sized down while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkBandwidthUnderprovisioned</code> </b> — The instance’s network bandwidth configuration
     *        doesn't meet the performance requirements of your workload and there is an alternative instance type that
     *        provides better network bandwidth performance. This finding reason happens when the <code>NetworkIn</code>
     *        or <code>NetworkOut</code> performance of an instance is impacted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkPPSOverprovisioned</code> </b> — The instance’s network PPS (packets per second)
     *        configuration can be sized down while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkPPSUnderprovisioned</code> </b> — The instance’s network PPS (packets per second)
     *        configuration doesn't meet the performance requirements of your workload and there is an alternative
     *        instance type that provides better network PPS performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>DiskIOPSOverprovisioned</code> </b> — The instance’s disk IOPS configuration can be sized down
     *        while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>DiskIOPSUnderprovisioned</code> </b> — The instance’s disk IOPS configuration doesn't meet the
     *        performance requirements of your workload and there is an alternative instance type that provides better
     *        disk IOPS performance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>DiskThroughputOverprovisioned</code> </b> — The instance’s disk throughput configuration can be
     *        sized down while still meeting the performance requirements of your workload.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>DiskThroughputUnderprovisioned</code> </b> — The instance’s disk throughput configuration
     *        doesn't meet the performance requirements of your workload and there is an alternative instance type that
     *        provides better disk throughput performance.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
