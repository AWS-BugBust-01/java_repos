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

/**
 * <p>
 * Container for response returned by <code> <a>UpgradeDomain</a> </code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpgradeDomainResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String upgradeId;

    private String domainName;
    /**
     * <p>
     * The version of OpenSearch that you intend to upgrade the domain to.
     * </p>
     */
    private String targetVersion;
    /**
     * <p>
     * When true, indicates that an upgrade eligibility check needs to be performed. Does not actually perform the
     * upgrade.
     * </p>
     */
    private Boolean performCheckOnly;

    private java.util.Map<String, String> advancedOptions;

    /**
     * @param upgradeId
     */

    public void setUpgradeId(String upgradeId) {
        this.upgradeId = upgradeId;
    }

    /**
     * @return
     */

    public String getUpgradeId() {
        return this.upgradeId;
    }

    /**
     * @param upgradeId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeDomainResult withUpgradeId(String upgradeId) {
        setUpgradeId(upgradeId);
        return this;
    }

    /**
     * @param domainName
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * @return
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @param domainName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeDomainResult withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The version of OpenSearch that you intend to upgrade the domain to.
     * </p>
     * 
     * @param targetVersion
     *        The version of OpenSearch that you intend to upgrade the domain to.
     */

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    /**
     * <p>
     * The version of OpenSearch that you intend to upgrade the domain to.
     * </p>
     * 
     * @return The version of OpenSearch that you intend to upgrade the domain to.
     */

    public String getTargetVersion() {
        return this.targetVersion;
    }

    /**
     * <p>
     * The version of OpenSearch that you intend to upgrade the domain to.
     * </p>
     * 
     * @param targetVersion
     *        The version of OpenSearch that you intend to upgrade the domain to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeDomainResult withTargetVersion(String targetVersion) {
        setTargetVersion(targetVersion);
        return this;
    }

    /**
     * <p>
     * When true, indicates that an upgrade eligibility check needs to be performed. Does not actually perform the
     * upgrade.
     * </p>
     * 
     * @param performCheckOnly
     *        When true, indicates that an upgrade eligibility check needs to be performed. Does not actually perform
     *        the upgrade.
     */

    public void setPerformCheckOnly(Boolean performCheckOnly) {
        this.performCheckOnly = performCheckOnly;
    }

    /**
     * <p>
     * When true, indicates that an upgrade eligibility check needs to be performed. Does not actually perform the
     * upgrade.
     * </p>
     * 
     * @return When true, indicates that an upgrade eligibility check needs to be performed. Does not actually perform
     *         the upgrade.
     */

    public Boolean getPerformCheckOnly() {
        return this.performCheckOnly;
    }

    /**
     * <p>
     * When true, indicates that an upgrade eligibility check needs to be performed. Does not actually perform the
     * upgrade.
     * </p>
     * 
     * @param performCheckOnly
     *        When true, indicates that an upgrade eligibility check needs to be performed. Does not actually perform
     *        the upgrade.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeDomainResult withPerformCheckOnly(Boolean performCheckOnly) {
        setPerformCheckOnly(performCheckOnly);
        return this;
    }

    /**
     * <p>
     * When true, indicates that an upgrade eligibility check needs to be performed. Does not actually perform the
     * upgrade.
     * </p>
     * 
     * @return When true, indicates that an upgrade eligibility check needs to be performed. Does not actually perform
     *         the upgrade.
     */

    public Boolean isPerformCheckOnly() {
        return this.performCheckOnly;
    }

    /**
     * @return
     */

    public java.util.Map<String, String> getAdvancedOptions() {
        return advancedOptions;
    }

    /**
     * @param advancedOptions
     */

    public void setAdvancedOptions(java.util.Map<String, String> advancedOptions) {
        this.advancedOptions = advancedOptions;
    }

    /**
     * @param advancedOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeDomainResult withAdvancedOptions(java.util.Map<String, String> advancedOptions) {
        setAdvancedOptions(advancedOptions);
        return this;
    }

    /**
     * Add a single AdvancedOptions entry
     *
     * @see UpgradeDomainResult#withAdvancedOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeDomainResult addAdvancedOptionsEntry(String key, String value) {
        if (null == this.advancedOptions) {
            this.advancedOptions = new java.util.HashMap<String, String>();
        }
        if (this.advancedOptions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.advancedOptions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdvancedOptions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpgradeDomainResult clearAdvancedOptionsEntries() {
        this.advancedOptions = null;
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
        if (getUpgradeId() != null)
            sb.append("UpgradeId: ").append(getUpgradeId()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getTargetVersion() != null)
            sb.append("TargetVersion: ").append(getTargetVersion()).append(",");
        if (getPerformCheckOnly() != null)
            sb.append("PerformCheckOnly: ").append(getPerformCheckOnly()).append(",");
        if (getAdvancedOptions() != null)
            sb.append("AdvancedOptions: ").append(getAdvancedOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpgradeDomainResult == false)
            return false;
        UpgradeDomainResult other = (UpgradeDomainResult) obj;
        if (other.getUpgradeId() == null ^ this.getUpgradeId() == null)
            return false;
        if (other.getUpgradeId() != null && other.getUpgradeId().equals(this.getUpgradeId()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getTargetVersion() == null ^ this.getTargetVersion() == null)
            return false;
        if (other.getTargetVersion() != null && other.getTargetVersion().equals(this.getTargetVersion()) == false)
            return false;
        if (other.getPerformCheckOnly() == null ^ this.getPerformCheckOnly() == null)
            return false;
        if (other.getPerformCheckOnly() != null && other.getPerformCheckOnly().equals(this.getPerformCheckOnly()) == false)
            return false;
        if (other.getAdvancedOptions() == null ^ this.getAdvancedOptions() == null)
            return false;
        if (other.getAdvancedOptions() != null && other.getAdvancedOptions().equals(this.getAdvancedOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUpgradeId() == null) ? 0 : getUpgradeId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getTargetVersion() == null) ? 0 : getTargetVersion().hashCode());
        hashCode = prime * hashCode + ((getPerformCheckOnly() == null) ? 0 : getPerformCheckOnly().hashCode());
        hashCode = prime * hashCode + ((getAdvancedOptions() == null) ? 0 : getAdvancedOptions().hashCode());
        return hashCode;
    }

    @Override
    public UpgradeDomainResult clone() {
        try {
            return (UpgradeDomainResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
