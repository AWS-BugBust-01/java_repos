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
 * The configuration of a domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the OpenSearch or
     * Elasticsearch domain.
     * </p>
     */
    private VersionStatus engineVersion;
    /**
     * <p>
     * The <code>ClusterConfig</code> for the domain.
     * </p>
     */
    private ClusterConfigStatus clusterConfig;
    /**
     * <p>
     * The <code>EBSOptions</code> for the domain.
     * </p>
     */
    private EBSOptionsStatus eBSOptions;
    /**
     * <p>
     * IAM access policy as a JSON-formatted string.
     * </p>
     */
    private AccessPoliciesStatus accessPolicies;
    /**
     * <p>
     * The <code>SnapshotOptions</code> for the domain.
     * </p>
     */
    private SnapshotOptionsStatus snapshotOptions;
    /**
     * <p>
     * The <code>VPCOptions</code> for the specified domain. For more information, see <a
     * href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html" target="_blank"> Launching
     * your Amazon OpenSearch Service domains using a VPC</a>.
     * </p>
     */
    private VPCDerivedInfoStatus vPCOptions;
    /**
     * <p>
     * The <code>CognitoOptions</code> for the specified domain. For more information, see <a
     * href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html"
     * target="_blank">Configuring Amazon Cognito authentication for OpenSearch Dashboards</a>.
     * </p>
     */
    private CognitoOptionsStatus cognitoOptions;
    /**
     * <p>
     * The <code>EncryptionAtRestOptions</code> for the domain.
     * </p>
     */
    private EncryptionAtRestOptionsStatus encryptionAtRestOptions;
    /**
     * <p>
     * The <code>NodeToNodeEncryptionOptions</code> for the domain.
     * </p>
     */
    private NodeToNodeEncryptionOptionsStatus nodeToNodeEncryptionOptions;
    /**
     * <p>
     * The <code>AdvancedOptions</code> for the domain. See <a href=
     * "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     * target="_blank">Advanced options </a> for more information.
     * </p>
     */
    private AdvancedOptionsStatus advancedOptions;
    /**
     * <p>
     * Log publishing options for the given domain.
     * </p>
     */
    private LogPublishingOptionsStatus logPublishingOptions;
    /**
     * <p>
     * The <code>DomainEndpointOptions</code> for the domain.
     * </p>
     */
    private DomainEndpointOptionsStatus domainEndpointOptions;
    /**
     * <p>
     * Specifies <code>AdvancedSecurityOptions</code> for the domain.
     * </p>
     */
    private AdvancedSecurityOptionsStatus advancedSecurityOptions;
    /**
     * <p>
     * Specifies <code>AutoTuneOptions</code> for the domain.
     * </p>
     */
    private AutoTuneOptionsStatus autoTuneOptions;

    /**
     * <p>
     * String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the OpenSearch or
     * Elasticsearch domain.
     * </p>
     * 
     * @param engineVersion
     *        String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the OpenSearch or
     *        Elasticsearch domain.
     */

    public void setEngineVersion(VersionStatus engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the OpenSearch or
     * Elasticsearch domain.
     * </p>
     * 
     * @return String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the OpenSearch or
     *         Elasticsearch domain.
     */

    public VersionStatus getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the OpenSearch or
     * Elasticsearch domain.
     * </p>
     * 
     * @param engineVersion
     *        String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the OpenSearch or
     *        Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withEngineVersion(VersionStatus engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The <code>ClusterConfig</code> for the domain.
     * </p>
     * 
     * @param clusterConfig
     *        The <code>ClusterConfig</code> for the domain.
     */

    public void setClusterConfig(ClusterConfigStatus clusterConfig) {
        this.clusterConfig = clusterConfig;
    }

    /**
     * <p>
     * The <code>ClusterConfig</code> for the domain.
     * </p>
     * 
     * @return The <code>ClusterConfig</code> for the domain.
     */

    public ClusterConfigStatus getClusterConfig() {
        return this.clusterConfig;
    }

    /**
     * <p>
     * The <code>ClusterConfig</code> for the domain.
     * </p>
     * 
     * @param clusterConfig
     *        The <code>ClusterConfig</code> for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withClusterConfig(ClusterConfigStatus clusterConfig) {
        setClusterConfig(clusterConfig);
        return this;
    }

    /**
     * <p>
     * The <code>EBSOptions</code> for the domain.
     * </p>
     * 
     * @param eBSOptions
     *        The <code>EBSOptions</code> for the domain.
     */

    public void setEBSOptions(EBSOptionsStatus eBSOptions) {
        this.eBSOptions = eBSOptions;
    }

    /**
     * <p>
     * The <code>EBSOptions</code> for the domain.
     * </p>
     * 
     * @return The <code>EBSOptions</code> for the domain.
     */

    public EBSOptionsStatus getEBSOptions() {
        return this.eBSOptions;
    }

    /**
     * <p>
     * The <code>EBSOptions</code> for the domain.
     * </p>
     * 
     * @param eBSOptions
     *        The <code>EBSOptions</code> for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withEBSOptions(EBSOptionsStatus eBSOptions) {
        setEBSOptions(eBSOptions);
        return this;
    }

    /**
     * <p>
     * IAM access policy as a JSON-formatted string.
     * </p>
     * 
     * @param accessPolicies
     *        IAM access policy as a JSON-formatted string.
     */

    public void setAccessPolicies(AccessPoliciesStatus accessPolicies) {
        this.accessPolicies = accessPolicies;
    }

    /**
     * <p>
     * IAM access policy as a JSON-formatted string.
     * </p>
     * 
     * @return IAM access policy as a JSON-formatted string.
     */

    public AccessPoliciesStatus getAccessPolicies() {
        return this.accessPolicies;
    }

    /**
     * <p>
     * IAM access policy as a JSON-formatted string.
     * </p>
     * 
     * @param accessPolicies
     *        IAM access policy as a JSON-formatted string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withAccessPolicies(AccessPoliciesStatus accessPolicies) {
        setAccessPolicies(accessPolicies);
        return this;
    }

    /**
     * <p>
     * The <code>SnapshotOptions</code> for the domain.
     * </p>
     * 
     * @param snapshotOptions
     *        The <code>SnapshotOptions</code> for the domain.
     */

    public void setSnapshotOptions(SnapshotOptionsStatus snapshotOptions) {
        this.snapshotOptions = snapshotOptions;
    }

    /**
     * <p>
     * The <code>SnapshotOptions</code> for the domain.
     * </p>
     * 
     * @return The <code>SnapshotOptions</code> for the domain.
     */

    public SnapshotOptionsStatus getSnapshotOptions() {
        return this.snapshotOptions;
    }

    /**
     * <p>
     * The <code>SnapshotOptions</code> for the domain.
     * </p>
     * 
     * @param snapshotOptions
     *        The <code>SnapshotOptions</code> for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withSnapshotOptions(SnapshotOptionsStatus snapshotOptions) {
        setSnapshotOptions(snapshotOptions);
        return this;
    }

    /**
     * <p>
     * The <code>VPCOptions</code> for the specified domain. For more information, see <a
     * href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html" target="_blank"> Launching
     * your Amazon OpenSearch Service domains using a VPC</a>.
     * </p>
     * 
     * @param vPCOptions
     *        The <code>VPCOptions</code> for the specified domain. For more information, see <a
     *        href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html" target="_blank">
     *        Launching your Amazon OpenSearch Service domains using a VPC</a>.
     */

    public void setVPCOptions(VPCDerivedInfoStatus vPCOptions) {
        this.vPCOptions = vPCOptions;
    }

    /**
     * <p>
     * The <code>VPCOptions</code> for the specified domain. For more information, see <a
     * href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html" target="_blank"> Launching
     * your Amazon OpenSearch Service domains using a VPC</a>.
     * </p>
     * 
     * @return The <code>VPCOptions</code> for the specified domain. For more information, see <a
     *         href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html" target="_blank">
     *         Launching your Amazon OpenSearch Service domains using a VPC</a>.
     */

    public VPCDerivedInfoStatus getVPCOptions() {
        return this.vPCOptions;
    }

    /**
     * <p>
     * The <code>VPCOptions</code> for the specified domain. For more information, see <a
     * href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html" target="_blank"> Launching
     * your Amazon OpenSearch Service domains using a VPC</a>.
     * </p>
     * 
     * @param vPCOptions
     *        The <code>VPCOptions</code> for the specified domain. For more information, see <a
     *        href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html" target="_blank">
     *        Launching your Amazon OpenSearch Service domains using a VPC</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withVPCOptions(VPCDerivedInfoStatus vPCOptions) {
        setVPCOptions(vPCOptions);
        return this;
    }

    /**
     * <p>
     * The <code>CognitoOptions</code> for the specified domain. For more information, see <a
     * href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html"
     * target="_blank">Configuring Amazon Cognito authentication for OpenSearch Dashboards</a>.
     * </p>
     * 
     * @param cognitoOptions
     *        The <code>CognitoOptions</code> for the specified domain. For more information, see <a
     *        href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html"
     *        target="_blank">Configuring Amazon Cognito authentication for OpenSearch Dashboards</a>.
     */

    public void setCognitoOptions(CognitoOptionsStatus cognitoOptions) {
        this.cognitoOptions = cognitoOptions;
    }

    /**
     * <p>
     * The <code>CognitoOptions</code> for the specified domain. For more information, see <a
     * href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html"
     * target="_blank">Configuring Amazon Cognito authentication for OpenSearch Dashboards</a>.
     * </p>
     * 
     * @return The <code>CognitoOptions</code> for the specified domain. For more information, see <a
     *         href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html"
     *         target="_blank">Configuring Amazon Cognito authentication for OpenSearch Dashboards</a>.
     */

    public CognitoOptionsStatus getCognitoOptions() {
        return this.cognitoOptions;
    }

    /**
     * <p>
     * The <code>CognitoOptions</code> for the specified domain. For more information, see <a
     * href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html"
     * target="_blank">Configuring Amazon Cognito authentication for OpenSearch Dashboards</a>.
     * </p>
     * 
     * @param cognitoOptions
     *        The <code>CognitoOptions</code> for the specified domain. For more information, see <a
     *        href="http://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html"
     *        target="_blank">Configuring Amazon Cognito authentication for OpenSearch Dashboards</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withCognitoOptions(CognitoOptionsStatus cognitoOptions) {
        setCognitoOptions(cognitoOptions);
        return this;
    }

    /**
     * <p>
     * The <code>EncryptionAtRestOptions</code> for the domain.
     * </p>
     * 
     * @param encryptionAtRestOptions
     *        The <code>EncryptionAtRestOptions</code> for the domain.
     */

    public void setEncryptionAtRestOptions(EncryptionAtRestOptionsStatus encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
    }

    /**
     * <p>
     * The <code>EncryptionAtRestOptions</code> for the domain.
     * </p>
     * 
     * @return The <code>EncryptionAtRestOptions</code> for the domain.
     */

    public EncryptionAtRestOptionsStatus getEncryptionAtRestOptions() {
        return this.encryptionAtRestOptions;
    }

    /**
     * <p>
     * The <code>EncryptionAtRestOptions</code> for the domain.
     * </p>
     * 
     * @param encryptionAtRestOptions
     *        The <code>EncryptionAtRestOptions</code> for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withEncryptionAtRestOptions(EncryptionAtRestOptionsStatus encryptionAtRestOptions) {
        setEncryptionAtRestOptions(encryptionAtRestOptions);
        return this;
    }

    /**
     * <p>
     * The <code>NodeToNodeEncryptionOptions</code> for the domain.
     * </p>
     * 
     * @param nodeToNodeEncryptionOptions
     *        The <code>NodeToNodeEncryptionOptions</code> for the domain.
     */

    public void setNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsStatus nodeToNodeEncryptionOptions) {
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * The <code>NodeToNodeEncryptionOptions</code> for the domain.
     * </p>
     * 
     * @return The <code>NodeToNodeEncryptionOptions</code> for the domain.
     */

    public NodeToNodeEncryptionOptionsStatus getNodeToNodeEncryptionOptions() {
        return this.nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * The <code>NodeToNodeEncryptionOptions</code> for the domain.
     * </p>
     * 
     * @param nodeToNodeEncryptionOptions
     *        The <code>NodeToNodeEncryptionOptions</code> for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsStatus nodeToNodeEncryptionOptions) {
        setNodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions);
        return this;
    }

    /**
     * <p>
     * The <code>AdvancedOptions</code> for the domain. See <a href=
     * "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     * target="_blank">Advanced options </a> for more information.
     * </p>
     * 
     * @param advancedOptions
     *        The <code>AdvancedOptions</code> for the domain. See <a href=
     *        "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     *        target="_blank">Advanced options </a> for more information.
     */

    public void setAdvancedOptions(AdvancedOptionsStatus advancedOptions) {
        this.advancedOptions = advancedOptions;
    }

    /**
     * <p>
     * The <code>AdvancedOptions</code> for the domain. See <a href=
     * "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     * target="_blank">Advanced options </a> for more information.
     * </p>
     * 
     * @return The <code>AdvancedOptions</code> for the domain. See <a href=
     *         "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     *         target="_blank">Advanced options </a> for more information.
     */

    public AdvancedOptionsStatus getAdvancedOptions() {
        return this.advancedOptions;
    }

    /**
     * <p>
     * The <code>AdvancedOptions</code> for the domain. See <a href=
     * "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     * target="_blank">Advanced options </a> for more information.
     * </p>
     * 
     * @param advancedOptions
     *        The <code>AdvancedOptions</code> for the domain. See <a href=
     *        "http://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     *        target="_blank">Advanced options </a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withAdvancedOptions(AdvancedOptionsStatus advancedOptions) {
        setAdvancedOptions(advancedOptions);
        return this;
    }

    /**
     * <p>
     * Log publishing options for the given domain.
     * </p>
     * 
     * @param logPublishingOptions
     *        Log publishing options for the given domain.
     */

    public void setLogPublishingOptions(LogPublishingOptionsStatus logPublishingOptions) {
        this.logPublishingOptions = logPublishingOptions;
    }

    /**
     * <p>
     * Log publishing options for the given domain.
     * </p>
     * 
     * @return Log publishing options for the given domain.
     */

    public LogPublishingOptionsStatus getLogPublishingOptions() {
        return this.logPublishingOptions;
    }

    /**
     * <p>
     * Log publishing options for the given domain.
     * </p>
     * 
     * @param logPublishingOptions
     *        Log publishing options for the given domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withLogPublishingOptions(LogPublishingOptionsStatus logPublishingOptions) {
        setLogPublishingOptions(logPublishingOptions);
        return this;
    }

    /**
     * <p>
     * The <code>DomainEndpointOptions</code> for the domain.
     * </p>
     * 
     * @param domainEndpointOptions
     *        The <code>DomainEndpointOptions</code> for the domain.
     */

    public void setDomainEndpointOptions(DomainEndpointOptionsStatus domainEndpointOptions) {
        this.domainEndpointOptions = domainEndpointOptions;
    }

    /**
     * <p>
     * The <code>DomainEndpointOptions</code> for the domain.
     * </p>
     * 
     * @return The <code>DomainEndpointOptions</code> for the domain.
     */

    public DomainEndpointOptionsStatus getDomainEndpointOptions() {
        return this.domainEndpointOptions;
    }

    /**
     * <p>
     * The <code>DomainEndpointOptions</code> for the domain.
     * </p>
     * 
     * @param domainEndpointOptions
     *        The <code>DomainEndpointOptions</code> for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withDomainEndpointOptions(DomainEndpointOptionsStatus domainEndpointOptions) {
        setDomainEndpointOptions(domainEndpointOptions);
        return this;
    }

    /**
     * <p>
     * Specifies <code>AdvancedSecurityOptions</code> for the domain.
     * </p>
     * 
     * @param advancedSecurityOptions
     *        Specifies <code>AdvancedSecurityOptions</code> for the domain.
     */

    public void setAdvancedSecurityOptions(AdvancedSecurityOptionsStatus advancedSecurityOptions) {
        this.advancedSecurityOptions = advancedSecurityOptions;
    }

    /**
     * <p>
     * Specifies <code>AdvancedSecurityOptions</code> for the domain.
     * </p>
     * 
     * @return Specifies <code>AdvancedSecurityOptions</code> for the domain.
     */

    public AdvancedSecurityOptionsStatus getAdvancedSecurityOptions() {
        return this.advancedSecurityOptions;
    }

    /**
     * <p>
     * Specifies <code>AdvancedSecurityOptions</code> for the domain.
     * </p>
     * 
     * @param advancedSecurityOptions
     *        Specifies <code>AdvancedSecurityOptions</code> for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withAdvancedSecurityOptions(AdvancedSecurityOptionsStatus advancedSecurityOptions) {
        setAdvancedSecurityOptions(advancedSecurityOptions);
        return this;
    }

    /**
     * <p>
     * Specifies <code>AutoTuneOptions</code> for the domain.
     * </p>
     * 
     * @param autoTuneOptions
     *        Specifies <code>AutoTuneOptions</code> for the domain.
     */

    public void setAutoTuneOptions(AutoTuneOptionsStatus autoTuneOptions) {
        this.autoTuneOptions = autoTuneOptions;
    }

    /**
     * <p>
     * Specifies <code>AutoTuneOptions</code> for the domain.
     * </p>
     * 
     * @return Specifies <code>AutoTuneOptions</code> for the domain.
     */

    public AutoTuneOptionsStatus getAutoTuneOptions() {
        return this.autoTuneOptions;
    }

    /**
     * <p>
     * Specifies <code>AutoTuneOptions</code> for the domain.
     * </p>
     * 
     * @param autoTuneOptions
     *        Specifies <code>AutoTuneOptions</code> for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withAutoTuneOptions(AutoTuneOptionsStatus autoTuneOptions) {
        setAutoTuneOptions(autoTuneOptions);
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
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getClusterConfig() != null)
            sb.append("ClusterConfig: ").append(getClusterConfig()).append(",");
        if (getEBSOptions() != null)
            sb.append("EBSOptions: ").append(getEBSOptions()).append(",");
        if (getAccessPolicies() != null)
            sb.append("AccessPolicies: ").append(getAccessPolicies()).append(",");
        if (getSnapshotOptions() != null)
            sb.append("SnapshotOptions: ").append(getSnapshotOptions()).append(",");
        if (getVPCOptions() != null)
            sb.append("VPCOptions: ").append(getVPCOptions()).append(",");
        if (getCognitoOptions() != null)
            sb.append("CognitoOptions: ").append(getCognitoOptions()).append(",");
        if (getEncryptionAtRestOptions() != null)
            sb.append("EncryptionAtRestOptions: ").append(getEncryptionAtRestOptions()).append(",");
        if (getNodeToNodeEncryptionOptions() != null)
            sb.append("NodeToNodeEncryptionOptions: ").append(getNodeToNodeEncryptionOptions()).append(",");
        if (getAdvancedOptions() != null)
            sb.append("AdvancedOptions: ").append(getAdvancedOptions()).append(",");
        if (getLogPublishingOptions() != null)
            sb.append("LogPublishingOptions: ").append(getLogPublishingOptions()).append(",");
        if (getDomainEndpointOptions() != null)
            sb.append("DomainEndpointOptions: ").append(getDomainEndpointOptions()).append(",");
        if (getAdvancedSecurityOptions() != null)
            sb.append("AdvancedSecurityOptions: ").append(getAdvancedSecurityOptions()).append(",");
        if (getAutoTuneOptions() != null)
            sb.append("AutoTuneOptions: ").append(getAutoTuneOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainConfig == false)
            return false;
        DomainConfig other = (DomainConfig) obj;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getClusterConfig() == null ^ this.getClusterConfig() == null)
            return false;
        if (other.getClusterConfig() != null && other.getClusterConfig().equals(this.getClusterConfig()) == false)
            return false;
        if (other.getEBSOptions() == null ^ this.getEBSOptions() == null)
            return false;
        if (other.getEBSOptions() != null && other.getEBSOptions().equals(this.getEBSOptions()) == false)
            return false;
        if (other.getAccessPolicies() == null ^ this.getAccessPolicies() == null)
            return false;
        if (other.getAccessPolicies() != null && other.getAccessPolicies().equals(this.getAccessPolicies()) == false)
            return false;
        if (other.getSnapshotOptions() == null ^ this.getSnapshotOptions() == null)
            return false;
        if (other.getSnapshotOptions() != null && other.getSnapshotOptions().equals(this.getSnapshotOptions()) == false)
            return false;
        if (other.getVPCOptions() == null ^ this.getVPCOptions() == null)
            return false;
        if (other.getVPCOptions() != null && other.getVPCOptions().equals(this.getVPCOptions()) == false)
            return false;
        if (other.getCognitoOptions() == null ^ this.getCognitoOptions() == null)
            return false;
        if (other.getCognitoOptions() != null && other.getCognitoOptions().equals(this.getCognitoOptions()) == false)
            return false;
        if (other.getEncryptionAtRestOptions() == null ^ this.getEncryptionAtRestOptions() == null)
            return false;
        if (other.getEncryptionAtRestOptions() != null && other.getEncryptionAtRestOptions().equals(this.getEncryptionAtRestOptions()) == false)
            return false;
        if (other.getNodeToNodeEncryptionOptions() == null ^ this.getNodeToNodeEncryptionOptions() == null)
            return false;
        if (other.getNodeToNodeEncryptionOptions() != null && other.getNodeToNodeEncryptionOptions().equals(this.getNodeToNodeEncryptionOptions()) == false)
            return false;
        if (other.getAdvancedOptions() == null ^ this.getAdvancedOptions() == null)
            return false;
        if (other.getAdvancedOptions() != null && other.getAdvancedOptions().equals(this.getAdvancedOptions()) == false)
            return false;
        if (other.getLogPublishingOptions() == null ^ this.getLogPublishingOptions() == null)
            return false;
        if (other.getLogPublishingOptions() != null && other.getLogPublishingOptions().equals(this.getLogPublishingOptions()) == false)
            return false;
        if (other.getDomainEndpointOptions() == null ^ this.getDomainEndpointOptions() == null)
            return false;
        if (other.getDomainEndpointOptions() != null && other.getDomainEndpointOptions().equals(this.getDomainEndpointOptions()) == false)
            return false;
        if (other.getAdvancedSecurityOptions() == null ^ this.getAdvancedSecurityOptions() == null)
            return false;
        if (other.getAdvancedSecurityOptions() != null && other.getAdvancedSecurityOptions().equals(this.getAdvancedSecurityOptions()) == false)
            return false;
        if (other.getAutoTuneOptions() == null ^ this.getAutoTuneOptions() == null)
            return false;
        if (other.getAutoTuneOptions() != null && other.getAutoTuneOptions().equals(this.getAutoTuneOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getClusterConfig() == null) ? 0 : getClusterConfig().hashCode());
        hashCode = prime * hashCode + ((getEBSOptions() == null) ? 0 : getEBSOptions().hashCode());
        hashCode = prime * hashCode + ((getAccessPolicies() == null) ? 0 : getAccessPolicies().hashCode());
        hashCode = prime * hashCode + ((getSnapshotOptions() == null) ? 0 : getSnapshotOptions().hashCode());
        hashCode = prime * hashCode + ((getVPCOptions() == null) ? 0 : getVPCOptions().hashCode());
        hashCode = prime * hashCode + ((getCognitoOptions() == null) ? 0 : getCognitoOptions().hashCode());
        hashCode = prime * hashCode + ((getEncryptionAtRestOptions() == null) ? 0 : getEncryptionAtRestOptions().hashCode());
        hashCode = prime * hashCode + ((getNodeToNodeEncryptionOptions() == null) ? 0 : getNodeToNodeEncryptionOptions().hashCode());
        hashCode = prime * hashCode + ((getAdvancedOptions() == null) ? 0 : getAdvancedOptions().hashCode());
        hashCode = prime * hashCode + ((getLogPublishingOptions() == null) ? 0 : getLogPublishingOptions().hashCode());
        hashCode = prime * hashCode + ((getDomainEndpointOptions() == null) ? 0 : getDomainEndpointOptions().hashCode());
        hashCode = prime * hashCode + ((getAdvancedSecurityOptions() == null) ? 0 : getAdvancedSecurityOptions().hashCode());
        hashCode = prime * hashCode + ((getAutoTuneOptions() == null) ? 0 : getAutoTuneOptions().hashCode());
        return hashCode;
    }

    @Override
    public DomainConfig clone() {
        try {
            return (DomainConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.DomainConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
