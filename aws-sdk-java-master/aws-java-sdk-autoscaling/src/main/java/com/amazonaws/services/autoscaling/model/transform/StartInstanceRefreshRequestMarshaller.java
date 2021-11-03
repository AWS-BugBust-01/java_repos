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
package com.amazonaws.services.autoscaling.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StartInstanceRefreshRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartInstanceRefreshRequestMarshaller implements Marshaller<Request<StartInstanceRefreshRequest>, StartInstanceRefreshRequest> {

    public Request<StartInstanceRefreshRequest> marshall(StartInstanceRefreshRequest startInstanceRefreshRequest) {

        if (startInstanceRefreshRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<StartInstanceRefreshRequest> request = new DefaultRequest<StartInstanceRefreshRequest>(startInstanceRefreshRequest, "AmazonAutoScaling");
        request.addParameter("Action", "StartInstanceRefresh");
        request.addParameter("Version", "2011-01-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (startInstanceRefreshRequest.getAutoScalingGroupName() != null) {
            request.addParameter("AutoScalingGroupName", StringUtils.fromString(startInstanceRefreshRequest.getAutoScalingGroupName()));
        }

        if (startInstanceRefreshRequest.getStrategy() != null) {
            request.addParameter("Strategy", StringUtils.fromString(startInstanceRefreshRequest.getStrategy()));
        }

        {
            DesiredConfiguration desiredConfiguration = startInstanceRefreshRequest.getDesiredConfiguration();
            if (desiredConfiguration != null) {

                {
                    LaunchTemplateSpecification launchTemplate = desiredConfiguration.getLaunchTemplate();
                    if (launchTemplate != null) {

                        if (launchTemplate.getLaunchTemplateId() != null) {
                            request.addParameter("DesiredConfiguration.LaunchTemplate.LaunchTemplateId",
                                    StringUtils.fromString(launchTemplate.getLaunchTemplateId()));
                        }

                        if (launchTemplate.getLaunchTemplateName() != null) {
                            request.addParameter("DesiredConfiguration.LaunchTemplate.LaunchTemplateName",
                                    StringUtils.fromString(launchTemplate.getLaunchTemplateName()));
                        }

                        if (launchTemplate.getVersion() != null) {
                            request.addParameter("DesiredConfiguration.LaunchTemplate.Version", StringUtils.fromString(launchTemplate.getVersion()));
                        }
                    }
                }

                {
                    MixedInstancesPolicy mixedInstancesPolicy = desiredConfiguration.getMixedInstancesPolicy();
                    if (mixedInstancesPolicy != null) {

                        {
                            LaunchTemplate launchTemplate = mixedInstancesPolicy.getLaunchTemplate();
                            if (launchTemplate != null) {

                                {
                                    LaunchTemplateSpecification launchTemplateSpecification = launchTemplate.getLaunchTemplateSpecification();
                                    if (launchTemplateSpecification != null) {

                                        if (launchTemplateSpecification.getLaunchTemplateId() != null) {
                                            request.addParameter(
                                                    "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.LaunchTemplateSpecification.LaunchTemplateId",
                                                    StringUtils.fromString(launchTemplateSpecification.getLaunchTemplateId()));
                                        }

                                        if (launchTemplateSpecification.getLaunchTemplateName() != null) {
                                            request.addParameter(
                                                    "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.LaunchTemplateSpecification.LaunchTemplateName",
                                                    StringUtils.fromString(launchTemplateSpecification.getLaunchTemplateName()));
                                        }

                                        if (launchTemplateSpecification.getVersion() != null) {
                                            request.addParameter(
                                                    "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.LaunchTemplateSpecification.Version",
                                                    StringUtils.fromString(launchTemplateSpecification.getVersion()));
                                        }
                                    }
                                }

                                if (!launchTemplate.getOverrides().isEmpty()
                                        || !((com.amazonaws.internal.SdkInternalList<LaunchTemplateOverrides>) launchTemplate.getOverrides()).isAutoConstruct()) {
                                    com.amazonaws.internal.SdkInternalList<LaunchTemplateOverrides> overridesList = (com.amazonaws.internal.SdkInternalList<LaunchTemplateOverrides>) launchTemplate
                                            .getOverrides();
                                    int overridesListIndex = 1;

                                    for (LaunchTemplateOverrides overridesListValue : overridesList) {
                                        if (overridesListValue != null) {

                                            if (overridesListValue.getInstanceType() != null) {
                                                request.addParameter("DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                        + overridesListIndex + ".InstanceType", StringUtils.fromString(overridesListValue.getInstanceType()));
                                            }

                                            if (overridesListValue.getWeightedCapacity() != null) {
                                                request.addParameter("DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                        + overridesListIndex + ".WeightedCapacity",
                                                        StringUtils.fromString(overridesListValue.getWeightedCapacity()));
                                            }

                                            {
                                                LaunchTemplateSpecification launchTemplateSpecification = overridesListValue.getLaunchTemplateSpecification();
                                                if (launchTemplateSpecification != null) {

                                                    if (launchTemplateSpecification.getLaunchTemplateId() != null) {
                                                        request.addParameter("DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                + overridesListIndex + ".LaunchTemplateSpecification.LaunchTemplateId",
                                                                StringUtils.fromString(launchTemplateSpecification.getLaunchTemplateId()));
                                                    }

                                                    if (launchTemplateSpecification.getLaunchTemplateName() != null) {
                                                        request.addParameter("DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                + overridesListIndex + ".LaunchTemplateSpecification.LaunchTemplateName",
                                                                StringUtils.fromString(launchTemplateSpecification.getLaunchTemplateName()));
                                                    }

                                                    if (launchTemplateSpecification.getVersion() != null) {
                                                        request.addParameter("DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                + overridesListIndex + ".LaunchTemplateSpecification.Version",
                                                                StringUtils.fromString(launchTemplateSpecification.getVersion()));
                                                    }
                                                }
                                            }

                                            {
                                                InstanceRequirements instanceRequirements = overridesListValue.getInstanceRequirements();
                                                if (instanceRequirements != null) {

                                                    {
                                                        VCpuCountRequest vCpuCount = instanceRequirements.getVCpuCount();
                                                        if (vCpuCount != null) {

                                                            if (vCpuCount.getMin() != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.VCpuCount.Min",
                                                                        StringUtils.fromInteger(vCpuCount.getMin()));
                                                            }

                                                            if (vCpuCount.getMax() != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.VCpuCount.Max",
                                                                        StringUtils.fromInteger(vCpuCount.getMax()));
                                                            }
                                                        }
                                                    }

                                                    {
                                                        MemoryMiBRequest memoryMiB = instanceRequirements.getMemoryMiB();
                                                        if (memoryMiB != null) {

                                                            if (memoryMiB.getMin() != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.MemoryMiB.Min",
                                                                        StringUtils.fromInteger(memoryMiB.getMin()));
                                                            }

                                                            if (memoryMiB.getMax() != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.MemoryMiB.Max",
                                                                        StringUtils.fromInteger(memoryMiB.getMax()));
                                                            }
                                                        }
                                                    }

                                                    if (!instanceRequirements.getCpuManufacturers().isEmpty()
                                                            || !((com.amazonaws.internal.SdkInternalList<String>) instanceRequirements.getCpuManufacturers())
                                                                    .isAutoConstruct()) {
                                                        com.amazonaws.internal.SdkInternalList<String> cpuManufacturersList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                                                .getCpuManufacturers();
                                                        int cpuManufacturersListIndex = 1;

                                                        for (String cpuManufacturersListValue : cpuManufacturersList) {
                                                            if (cpuManufacturersListValue != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.CpuManufacturers.member."
                                                                                + cpuManufacturersListIndex, StringUtils.fromString(cpuManufacturersListValue));
                                                            }
                                                            cpuManufacturersListIndex++;
                                                        }
                                                    }

                                                    {
                                                        MemoryGiBPerVCpuRequest memoryGiBPerVCpu = instanceRequirements.getMemoryGiBPerVCpu();
                                                        if (memoryGiBPerVCpu != null) {

                                                            if (memoryGiBPerVCpu.getMin() != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.MemoryGiBPerVCpu.Min",
                                                                        StringUtils.fromDouble(memoryGiBPerVCpu.getMin()));
                                                            }

                                                            if (memoryGiBPerVCpu.getMax() != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.MemoryGiBPerVCpu.Max",
                                                                        StringUtils.fromDouble(memoryGiBPerVCpu.getMax()));
                                                            }
                                                        }
                                                    }

                                                    if (!instanceRequirements.getExcludedInstanceTypes().isEmpty()
                                                            || !((com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                                                    .getExcludedInstanceTypes()).isAutoConstruct()) {
                                                        com.amazonaws.internal.SdkInternalList<String> excludedInstanceTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                                                .getExcludedInstanceTypes();
                                                        int excludedInstanceTypesListIndex = 1;

                                                        for (String excludedInstanceTypesListValue : excludedInstanceTypesList) {
                                                            if (excludedInstanceTypesListValue != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.ExcludedInstanceTypes.member."
                                                                                + excludedInstanceTypesListIndex,
                                                                        StringUtils.fromString(excludedInstanceTypesListValue));
                                                            }
                                                            excludedInstanceTypesListIndex++;
                                                        }
                                                    }

                                                    if (!instanceRequirements.getInstanceGenerations().isEmpty()
                                                            || !((com.amazonaws.internal.SdkInternalList<String>) instanceRequirements.getInstanceGenerations())
                                                                    .isAutoConstruct()) {
                                                        com.amazonaws.internal.SdkInternalList<String> instanceGenerationsList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                                                .getInstanceGenerations();
                                                        int instanceGenerationsListIndex = 1;

                                                        for (String instanceGenerationsListValue : instanceGenerationsList) {
                                                            if (instanceGenerationsListValue != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.InstanceGenerations.member."
                                                                                + instanceGenerationsListIndex,
                                                                        StringUtils.fromString(instanceGenerationsListValue));
                                                            }
                                                            instanceGenerationsListIndex++;
                                                        }
                                                    }

                                                    if (instanceRequirements.getSpotMaxPricePercentageOverLowestPrice() != null) {
                                                        request.addParameter("DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                + overridesListIndex + ".InstanceRequirements.SpotMaxPricePercentageOverLowestPrice",
                                                                StringUtils.fromInteger(instanceRequirements.getSpotMaxPricePercentageOverLowestPrice()));
                                                    }

                                                    if (instanceRequirements.getOnDemandMaxPricePercentageOverLowestPrice() != null) {
                                                        request.addParameter("DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                + overridesListIndex + ".InstanceRequirements.OnDemandMaxPricePercentageOverLowestPrice",
                                                                StringUtils.fromInteger(instanceRequirements.getOnDemandMaxPricePercentageOverLowestPrice()));
                                                    }

                                                    if (instanceRequirements.getBareMetal() != null) {
                                                        request.addParameter("DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                + overridesListIndex + ".InstanceRequirements.BareMetal",
                                                                StringUtils.fromString(instanceRequirements.getBareMetal()));
                                                    }

                                                    if (instanceRequirements.getBurstablePerformance() != null) {
                                                        request.addParameter("DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                + overridesListIndex + ".InstanceRequirements.BurstablePerformance",
                                                                StringUtils.fromString(instanceRequirements.getBurstablePerformance()));
                                                    }

                                                    if (instanceRequirements.getRequireHibernateSupport() != null) {
                                                        request.addParameter("DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                + overridesListIndex + ".InstanceRequirements.RequireHibernateSupport",
                                                                StringUtils.fromBoolean(instanceRequirements.getRequireHibernateSupport()));
                                                    }

                                                    {
                                                        NetworkInterfaceCountRequest networkInterfaceCount = instanceRequirements.getNetworkInterfaceCount();
                                                        if (networkInterfaceCount != null) {

                                                            if (networkInterfaceCount.getMin() != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.NetworkInterfaceCount.Min",
                                                                        StringUtils.fromInteger(networkInterfaceCount.getMin()));
                                                            }

                                                            if (networkInterfaceCount.getMax() != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.NetworkInterfaceCount.Max",
                                                                        StringUtils.fromInteger(networkInterfaceCount.getMax()));
                                                            }
                                                        }
                                                    }

                                                    if (instanceRequirements.getLocalStorage() != null) {
                                                        request.addParameter("DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                + overridesListIndex + ".InstanceRequirements.LocalStorage",
                                                                StringUtils.fromString(instanceRequirements.getLocalStorage()));
                                                    }

                                                    if (!instanceRequirements.getLocalStorageTypes().isEmpty()
                                                            || !((com.amazonaws.internal.SdkInternalList<String>) instanceRequirements.getLocalStorageTypes())
                                                                    .isAutoConstruct()) {
                                                        com.amazonaws.internal.SdkInternalList<String> localStorageTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                                                .getLocalStorageTypes();
                                                        int localStorageTypesListIndex = 1;

                                                        for (String localStorageTypesListValue : localStorageTypesList) {
                                                            if (localStorageTypesListValue != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.LocalStorageTypes.member."
                                                                                + localStorageTypesListIndex,
                                                                        StringUtils.fromString(localStorageTypesListValue));
                                                            }
                                                            localStorageTypesListIndex++;
                                                        }
                                                    }

                                                    {
                                                        TotalLocalStorageGBRequest totalLocalStorageGB = instanceRequirements.getTotalLocalStorageGB();
                                                        if (totalLocalStorageGB != null) {

                                                            if (totalLocalStorageGB.getMin() != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.TotalLocalStorageGB.Min",
                                                                        StringUtils.fromDouble(totalLocalStorageGB.getMin()));
                                                            }

                                                            if (totalLocalStorageGB.getMax() != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.TotalLocalStorageGB.Max",
                                                                        StringUtils.fromDouble(totalLocalStorageGB.getMax()));
                                                            }
                                                        }
                                                    }

                                                    {
                                                        BaselineEbsBandwidthMbpsRequest baselineEbsBandwidthMbps = instanceRequirements
                                                                .getBaselineEbsBandwidthMbps();
                                                        if (baselineEbsBandwidthMbps != null) {

                                                            if (baselineEbsBandwidthMbps.getMin() != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.BaselineEbsBandwidthMbps.Min",
                                                                        StringUtils.fromInteger(baselineEbsBandwidthMbps.getMin()));
                                                            }

                                                            if (baselineEbsBandwidthMbps.getMax() != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.BaselineEbsBandwidthMbps.Max",
                                                                        StringUtils.fromInteger(baselineEbsBandwidthMbps.getMax()));
                                                            }
                                                        }
                                                    }

                                                    if (!instanceRequirements.getAcceleratorTypes().isEmpty()
                                                            || !((com.amazonaws.internal.SdkInternalList<String>) instanceRequirements.getAcceleratorTypes())
                                                                    .isAutoConstruct()) {
                                                        com.amazonaws.internal.SdkInternalList<String> acceleratorTypesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                                                .getAcceleratorTypes();
                                                        int acceleratorTypesListIndex = 1;

                                                        for (String acceleratorTypesListValue : acceleratorTypesList) {
                                                            if (acceleratorTypesListValue != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.AcceleratorTypes.member."
                                                                                + acceleratorTypesListIndex, StringUtils.fromString(acceleratorTypesListValue));
                                                            }
                                                            acceleratorTypesListIndex++;
                                                        }
                                                    }

                                                    {
                                                        AcceleratorCountRequest acceleratorCount = instanceRequirements.getAcceleratorCount();
                                                        if (acceleratorCount != null) {

                                                            if (acceleratorCount.getMin() != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.AcceleratorCount.Min",
                                                                        StringUtils.fromInteger(acceleratorCount.getMin()));
                                                            }

                                                            if (acceleratorCount.getMax() != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.AcceleratorCount.Max",
                                                                        StringUtils.fromInteger(acceleratorCount.getMax()));
                                                            }
                                                        }
                                                    }

                                                    if (!instanceRequirements.getAcceleratorManufacturers().isEmpty()
                                                            || !((com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                                                    .getAcceleratorManufacturers()).isAutoConstruct()) {
                                                        com.amazonaws.internal.SdkInternalList<String> acceleratorManufacturersList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                                                .getAcceleratorManufacturers();
                                                        int acceleratorManufacturersListIndex = 1;

                                                        for (String acceleratorManufacturersListValue : acceleratorManufacturersList) {
                                                            if (acceleratorManufacturersListValue != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.AcceleratorManufacturers.member."
                                                                                + acceleratorManufacturersListIndex,
                                                                        StringUtils.fromString(acceleratorManufacturersListValue));
                                                            }
                                                            acceleratorManufacturersListIndex++;
                                                        }
                                                    }

                                                    if (!instanceRequirements.getAcceleratorNames().isEmpty()
                                                            || !((com.amazonaws.internal.SdkInternalList<String>) instanceRequirements.getAcceleratorNames())
                                                                    .isAutoConstruct()) {
                                                        com.amazonaws.internal.SdkInternalList<String> acceleratorNamesList = (com.amazonaws.internal.SdkInternalList<String>) instanceRequirements
                                                                .getAcceleratorNames();
                                                        int acceleratorNamesListIndex = 1;

                                                        for (String acceleratorNamesListValue : acceleratorNamesList) {
                                                            if (acceleratorNamesListValue != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.AcceleratorNames.member."
                                                                                + acceleratorNamesListIndex, StringUtils.fromString(acceleratorNamesListValue));
                                                            }
                                                            acceleratorNamesListIndex++;
                                                        }
                                                    }

                                                    {
                                                        AcceleratorTotalMemoryMiBRequest acceleratorTotalMemoryMiB = instanceRequirements
                                                                .getAcceleratorTotalMemoryMiB();
                                                        if (acceleratorTotalMemoryMiB != null) {

                                                            if (acceleratorTotalMemoryMiB.getMin() != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.AcceleratorTotalMemoryMiB.Min",
                                                                        StringUtils.fromInteger(acceleratorTotalMemoryMiB.getMin()));
                                                            }

                                                            if (acceleratorTotalMemoryMiB.getMax() != null) {
                                                                request.addParameter(
                                                                        "DesiredConfiguration.MixedInstancesPolicy.LaunchTemplate.Overrides.member."
                                                                                + overridesListIndex + ".InstanceRequirements.AcceleratorTotalMemoryMiB.Max",
                                                                        StringUtils.fromInteger(acceleratorTotalMemoryMiB.getMax()));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        overridesListIndex++;
                                    }
                                }
                            }
                        }

                        {
                            InstancesDistribution instancesDistribution = mixedInstancesPolicy.getInstancesDistribution();
                            if (instancesDistribution != null) {

                                if (instancesDistribution.getOnDemandAllocationStrategy() != null) {
                                    request.addParameter("DesiredConfiguration.MixedInstancesPolicy.InstancesDistribution.OnDemandAllocationStrategy",
                                            StringUtils.fromString(instancesDistribution.getOnDemandAllocationStrategy()));
                                }

                                if (instancesDistribution.getOnDemandBaseCapacity() != null) {
                                    request.addParameter("DesiredConfiguration.MixedInstancesPolicy.InstancesDistribution.OnDemandBaseCapacity",
                                            StringUtils.fromInteger(instancesDistribution.getOnDemandBaseCapacity()));
                                }

                                if (instancesDistribution.getOnDemandPercentageAboveBaseCapacity() != null) {
                                    request.addParameter("DesiredConfiguration.MixedInstancesPolicy.InstancesDistribution.OnDemandPercentageAboveBaseCapacity",
                                            StringUtils.fromInteger(instancesDistribution.getOnDemandPercentageAboveBaseCapacity()));
                                }

                                if (instancesDistribution.getSpotAllocationStrategy() != null) {
                                    request.addParameter("DesiredConfiguration.MixedInstancesPolicy.InstancesDistribution.SpotAllocationStrategy",
                                            StringUtils.fromString(instancesDistribution.getSpotAllocationStrategy()));
                                }

                                if (instancesDistribution.getSpotInstancePools() != null) {
                                    request.addParameter("DesiredConfiguration.MixedInstancesPolicy.InstancesDistribution.SpotInstancePools",
                                            StringUtils.fromInteger(instancesDistribution.getSpotInstancePools()));
                                }

                                if (instancesDistribution.getSpotMaxPrice() != null) {
                                    request.addParameter("DesiredConfiguration.MixedInstancesPolicy.InstancesDistribution.SpotMaxPrice",
                                            StringUtils.fromString(instancesDistribution.getSpotMaxPrice()));
                                }
                            }
                        }
                    }
                }
            }
        }

        {
            RefreshPreferences preferences = startInstanceRefreshRequest.getPreferences();
            if (preferences != null) {

                if (preferences.getMinHealthyPercentage() != null) {
                    request.addParameter("Preferences.MinHealthyPercentage", StringUtils.fromInteger(preferences.getMinHealthyPercentage()));
                }

                if (preferences.getInstanceWarmup() != null) {
                    request.addParameter("Preferences.InstanceWarmup", StringUtils.fromInteger(preferences.getInstanceWarmup()));
                }

                if (!preferences.getCheckpointPercentages().isEmpty()
                        || !((com.amazonaws.internal.SdkInternalList<Integer>) preferences.getCheckpointPercentages()).isAutoConstruct()) {
                    com.amazonaws.internal.SdkInternalList<Integer> checkpointPercentagesList = (com.amazonaws.internal.SdkInternalList<Integer>) preferences
                            .getCheckpointPercentages();
                    int checkpointPercentagesListIndex = 1;

                    for (Integer checkpointPercentagesListValue : checkpointPercentagesList) {
                        if (checkpointPercentagesListValue != null) {
                            request.addParameter("Preferences.CheckpointPercentages.member." + checkpointPercentagesListIndex,
                                    StringUtils.fromInteger(checkpointPercentagesListValue));
                        }
                        checkpointPercentagesListIndex++;
                    }
                }

                if (preferences.getCheckpointDelay() != null) {
                    request.addParameter("Preferences.CheckpointDelay", StringUtils.fromInteger(preferences.getCheckpointDelay()));
                }

                if (preferences.getSkipMatching() != null) {
                    request.addParameter("Preferences.SkipMatching", StringUtils.fromBoolean(preferences.getSkipMatching()));
                }
            }
        }

        return request;
    }

}
