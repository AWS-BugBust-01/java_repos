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
 * Options to configure the endpoint for the domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainEndpointOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether only HTTPS endpoint should be enabled for the domain.
     * </p>
     */
    private Boolean enforceHTTPS;
    /**
     * <p>
     * Specify the TLS security policy to apply to the HTTPS endpoint of the domain. <br/>
     * Can be one of the following values:
     * <ul>
     * <li><b>Policy-Min-TLS-1-0-2019-07:</b> TLS security policy which supports TLSv1.0 and higher.</li>
     * <li><b>Policy-Min-TLS-1-2-2019-07:</b> TLS security policy which supports only TLSv1.2</li>
     * </ul>
     * </p>
     */
    private String tLSSecurityPolicy;
    /**
     * <p>
     * Whether to enable a custom endpoint for the domain.
     * </p>
     */
    private Boolean customEndpointEnabled;
    /**
     * <p>
     * The fully qualified domain for your custom endpoint.
     * </p>
     */
    private String customEndpoint;
    /**
     * <p>
     * The ACM certificate ARN for your custom endpoint.
     * </p>
     */
    private String customEndpointCertificateArn;

    /**
     * <p>
     * Whether only HTTPS endpoint should be enabled for the domain.
     * </p>
     * 
     * @param enforceHTTPS
     *        Whether only HTTPS endpoint should be enabled for the domain.
     */

    public void setEnforceHTTPS(Boolean enforceHTTPS) {
        this.enforceHTTPS = enforceHTTPS;
    }

    /**
     * <p>
     * Whether only HTTPS endpoint should be enabled for the domain.
     * </p>
     * 
     * @return Whether only HTTPS endpoint should be enabled for the domain.
     */

    public Boolean getEnforceHTTPS() {
        return this.enforceHTTPS;
    }

    /**
     * <p>
     * Whether only HTTPS endpoint should be enabled for the domain.
     * </p>
     * 
     * @param enforceHTTPS
     *        Whether only HTTPS endpoint should be enabled for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainEndpointOptions withEnforceHTTPS(Boolean enforceHTTPS) {
        setEnforceHTTPS(enforceHTTPS);
        return this;
    }

    /**
     * <p>
     * Whether only HTTPS endpoint should be enabled for the domain.
     * </p>
     * 
     * @return Whether only HTTPS endpoint should be enabled for the domain.
     */

    public Boolean isEnforceHTTPS() {
        return this.enforceHTTPS;
    }

    /**
     * <p>
     * Specify the TLS security policy to apply to the HTTPS endpoint of the domain. <br/>
     * Can be one of the following values:
     * <ul>
     * <li><b>Policy-Min-TLS-1-0-2019-07:</b> TLS security policy which supports TLSv1.0 and higher.</li>
     * <li><b>Policy-Min-TLS-1-2-2019-07:</b> TLS security policy which supports only TLSv1.2</li>
     * </ul>
     * </p>
     * 
     * @param tLSSecurityPolicy
     *        Specify the TLS security policy to apply to the HTTPS endpoint of the domain. <br/>
     *        Can be one of the following values:
     *        <ul>
     *        <li><b>Policy-Min-TLS-1-0-2019-07:</b> TLS security policy which supports TLSv1.0 and higher.</li>
     *        <li><b>Policy-Min-TLS-1-2-2019-07:</b> TLS security policy which supports only TLSv1.2</li>
     *        </ul>
     * @see TLSSecurityPolicy
     */

    public void setTLSSecurityPolicy(String tLSSecurityPolicy) {
        this.tLSSecurityPolicy = tLSSecurityPolicy;
    }

    /**
     * <p>
     * Specify the TLS security policy to apply to the HTTPS endpoint of the domain. <br/>
     * Can be one of the following values:
     * <ul>
     * <li><b>Policy-Min-TLS-1-0-2019-07:</b> TLS security policy which supports TLSv1.0 and higher.</li>
     * <li><b>Policy-Min-TLS-1-2-2019-07:</b> TLS security policy which supports only TLSv1.2</li>
     * </ul>
     * </p>
     * 
     * @return Specify the TLS security policy to apply to the HTTPS endpoint of the domain. <br/>
     *         Can be one of the following values:
     *         <ul>
     *         <li><b>Policy-Min-TLS-1-0-2019-07:</b> TLS security policy which supports TLSv1.0 and higher.</li>
     *         <li><b>Policy-Min-TLS-1-2-2019-07:</b> TLS security policy which supports only TLSv1.2</li>
     *         </ul>
     * @see TLSSecurityPolicy
     */

    public String getTLSSecurityPolicy() {
        return this.tLSSecurityPolicy;
    }

    /**
     * <p>
     * Specify the TLS security policy to apply to the HTTPS endpoint of the domain. <br/>
     * Can be one of the following values:
     * <ul>
     * <li><b>Policy-Min-TLS-1-0-2019-07:</b> TLS security policy which supports TLSv1.0 and higher.</li>
     * <li><b>Policy-Min-TLS-1-2-2019-07:</b> TLS security policy which supports only TLSv1.2</li>
     * </ul>
     * </p>
     * 
     * @param tLSSecurityPolicy
     *        Specify the TLS security policy to apply to the HTTPS endpoint of the domain. <br/>
     *        Can be one of the following values:
     *        <ul>
     *        <li><b>Policy-Min-TLS-1-0-2019-07:</b> TLS security policy which supports TLSv1.0 and higher.</li>
     *        <li><b>Policy-Min-TLS-1-2-2019-07:</b> TLS security policy which supports only TLSv1.2</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TLSSecurityPolicy
     */

    public DomainEndpointOptions withTLSSecurityPolicy(String tLSSecurityPolicy) {
        setTLSSecurityPolicy(tLSSecurityPolicy);
        return this;
    }

    /**
     * <p>
     * Specify the TLS security policy to apply to the HTTPS endpoint of the domain. <br/>
     * Can be one of the following values:
     * <ul>
     * <li><b>Policy-Min-TLS-1-0-2019-07:</b> TLS security policy which supports TLSv1.0 and higher.</li>
     * <li><b>Policy-Min-TLS-1-2-2019-07:</b> TLS security policy which supports only TLSv1.2</li>
     * </ul>
     * </p>
     * 
     * @param tLSSecurityPolicy
     *        Specify the TLS security policy to apply to the HTTPS endpoint of the domain. <br/>
     *        Can be one of the following values:
     *        <ul>
     *        <li><b>Policy-Min-TLS-1-0-2019-07:</b> TLS security policy which supports TLSv1.0 and higher.</li>
     *        <li><b>Policy-Min-TLS-1-2-2019-07:</b> TLS security policy which supports only TLSv1.2</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TLSSecurityPolicy
     */

    public DomainEndpointOptions withTLSSecurityPolicy(TLSSecurityPolicy tLSSecurityPolicy) {
        this.tLSSecurityPolicy = tLSSecurityPolicy.toString();
        return this;
    }

    /**
     * <p>
     * Whether to enable a custom endpoint for the domain.
     * </p>
     * 
     * @param customEndpointEnabled
     *        Whether to enable a custom endpoint for the domain.
     */

    public void setCustomEndpointEnabled(Boolean customEndpointEnabled) {
        this.customEndpointEnabled = customEndpointEnabled;
    }

    /**
     * <p>
     * Whether to enable a custom endpoint for the domain.
     * </p>
     * 
     * @return Whether to enable a custom endpoint for the domain.
     */

    public Boolean getCustomEndpointEnabled() {
        return this.customEndpointEnabled;
    }

    /**
     * <p>
     * Whether to enable a custom endpoint for the domain.
     * </p>
     * 
     * @param customEndpointEnabled
     *        Whether to enable a custom endpoint for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainEndpointOptions withCustomEndpointEnabled(Boolean customEndpointEnabled) {
        setCustomEndpointEnabled(customEndpointEnabled);
        return this;
    }

    /**
     * <p>
     * Whether to enable a custom endpoint for the domain.
     * </p>
     * 
     * @return Whether to enable a custom endpoint for the domain.
     */

    public Boolean isCustomEndpointEnabled() {
        return this.customEndpointEnabled;
    }

    /**
     * <p>
     * The fully qualified domain for your custom endpoint.
     * </p>
     * 
     * @param customEndpoint
     *        The fully qualified domain for your custom endpoint.
     */

    public void setCustomEndpoint(String customEndpoint) {
        this.customEndpoint = customEndpoint;
    }

    /**
     * <p>
     * The fully qualified domain for your custom endpoint.
     * </p>
     * 
     * @return The fully qualified domain for your custom endpoint.
     */

    public String getCustomEndpoint() {
        return this.customEndpoint;
    }

    /**
     * <p>
     * The fully qualified domain for your custom endpoint.
     * </p>
     * 
     * @param customEndpoint
     *        The fully qualified domain for your custom endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainEndpointOptions withCustomEndpoint(String customEndpoint) {
        setCustomEndpoint(customEndpoint);
        return this;
    }

    /**
     * <p>
     * The ACM certificate ARN for your custom endpoint.
     * </p>
     * 
     * @param customEndpointCertificateArn
     *        The ACM certificate ARN for your custom endpoint.
     */

    public void setCustomEndpointCertificateArn(String customEndpointCertificateArn) {
        this.customEndpointCertificateArn = customEndpointCertificateArn;
    }

    /**
     * <p>
     * The ACM certificate ARN for your custom endpoint.
     * </p>
     * 
     * @return The ACM certificate ARN for your custom endpoint.
     */

    public String getCustomEndpointCertificateArn() {
        return this.customEndpointCertificateArn;
    }

    /**
     * <p>
     * The ACM certificate ARN for your custom endpoint.
     * </p>
     * 
     * @param customEndpointCertificateArn
     *        The ACM certificate ARN for your custom endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainEndpointOptions withCustomEndpointCertificateArn(String customEndpointCertificateArn) {
        setCustomEndpointCertificateArn(customEndpointCertificateArn);
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
        if (getEnforceHTTPS() != null)
            sb.append("EnforceHTTPS: ").append(getEnforceHTTPS()).append(",");
        if (getTLSSecurityPolicy() != null)
            sb.append("TLSSecurityPolicy: ").append(getTLSSecurityPolicy()).append(",");
        if (getCustomEndpointEnabled() != null)
            sb.append("CustomEndpointEnabled: ").append(getCustomEndpointEnabled()).append(",");
        if (getCustomEndpoint() != null)
            sb.append("CustomEndpoint: ").append(getCustomEndpoint()).append(",");
        if (getCustomEndpointCertificateArn() != null)
            sb.append("CustomEndpointCertificateArn: ").append(getCustomEndpointCertificateArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainEndpointOptions == false)
            return false;
        DomainEndpointOptions other = (DomainEndpointOptions) obj;
        if (other.getEnforceHTTPS() == null ^ this.getEnforceHTTPS() == null)
            return false;
        if (other.getEnforceHTTPS() != null && other.getEnforceHTTPS().equals(this.getEnforceHTTPS()) == false)
            return false;
        if (other.getTLSSecurityPolicy() == null ^ this.getTLSSecurityPolicy() == null)
            return false;
        if (other.getTLSSecurityPolicy() != null && other.getTLSSecurityPolicy().equals(this.getTLSSecurityPolicy()) == false)
            return false;
        if (other.getCustomEndpointEnabled() == null ^ this.getCustomEndpointEnabled() == null)
            return false;
        if (other.getCustomEndpointEnabled() != null && other.getCustomEndpointEnabled().equals(this.getCustomEndpointEnabled()) == false)
            return false;
        if (other.getCustomEndpoint() == null ^ this.getCustomEndpoint() == null)
            return false;
        if (other.getCustomEndpoint() != null && other.getCustomEndpoint().equals(this.getCustomEndpoint()) == false)
            return false;
        if (other.getCustomEndpointCertificateArn() == null ^ this.getCustomEndpointCertificateArn() == null)
            return false;
        if (other.getCustomEndpointCertificateArn() != null && other.getCustomEndpointCertificateArn().equals(this.getCustomEndpointCertificateArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnforceHTTPS() == null) ? 0 : getEnforceHTTPS().hashCode());
        hashCode = prime * hashCode + ((getTLSSecurityPolicy() == null) ? 0 : getTLSSecurityPolicy().hashCode());
        hashCode = prime * hashCode + ((getCustomEndpointEnabled() == null) ? 0 : getCustomEndpointEnabled().hashCode());
        hashCode = prime * hashCode + ((getCustomEndpoint() == null) ? 0 : getCustomEndpoint().hashCode());
        hashCode = prime * hashCode + ((getCustomEndpointCertificateArn() == null) ? 0 : getCustomEndpointCertificateArn().hashCode());
        return hashCode;
    }

    @Override
    public DomainEndpointOptions clone() {
        try {
            return (DomainEndpointOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.DomainEndpointOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
