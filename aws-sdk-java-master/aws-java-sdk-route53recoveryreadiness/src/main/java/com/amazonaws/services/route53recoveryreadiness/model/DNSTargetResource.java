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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A component for DNS/Routing Control Readiness Checks
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/DNSTargetResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DNSTargetResource implements Serializable, Cloneable, StructuredPojo {

    /** The DNS Name that acts as ingress point to a portion of application */
    private String domainName;
    /** The Hosted Zone ARN that contains the DNS record with the provided name of target resource. */
    private String hostedZoneArn;
    /** The R53 Set Id to uniquely identify a record given a Name and a Type */
    private String recordSetId;
    /** The Type of DNS Record of target resource */
    private String recordType;

    private TargetResource targetResource;

    /**
     * The DNS Name that acts as ingress point to a portion of application
     * 
     * @param domainName
     *        The DNS Name that acts as ingress point to a portion of application
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * The DNS Name that acts as ingress point to a portion of application
     * 
     * @return The DNS Name that acts as ingress point to a portion of application
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * The DNS Name that acts as ingress point to a portion of application
     * 
     * @param domainName
     *        The DNS Name that acts as ingress point to a portion of application
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DNSTargetResource withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * The Hosted Zone ARN that contains the DNS record with the provided name of target resource.
     * 
     * @param hostedZoneArn
     *        The Hosted Zone ARN that contains the DNS record with the provided name of target resource.
     */

    public void setHostedZoneArn(String hostedZoneArn) {
        this.hostedZoneArn = hostedZoneArn;
    }

    /**
     * The Hosted Zone ARN that contains the DNS record with the provided name of target resource.
     * 
     * @return The Hosted Zone ARN that contains the DNS record with the provided name of target resource.
     */

    public String getHostedZoneArn() {
        return this.hostedZoneArn;
    }

    /**
     * The Hosted Zone ARN that contains the DNS record with the provided name of target resource.
     * 
     * @param hostedZoneArn
     *        The Hosted Zone ARN that contains the DNS record with the provided name of target resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DNSTargetResource withHostedZoneArn(String hostedZoneArn) {
        setHostedZoneArn(hostedZoneArn);
        return this;
    }

    /**
     * The R53 Set Id to uniquely identify a record given a Name and a Type
     * 
     * @param recordSetId
     *        The R53 Set Id to uniquely identify a record given a Name and a Type
     */

    public void setRecordSetId(String recordSetId) {
        this.recordSetId = recordSetId;
    }

    /**
     * The R53 Set Id to uniquely identify a record given a Name and a Type
     * 
     * @return The R53 Set Id to uniquely identify a record given a Name and a Type
     */

    public String getRecordSetId() {
        return this.recordSetId;
    }

    /**
     * The R53 Set Id to uniquely identify a record given a Name and a Type
     * 
     * @param recordSetId
     *        The R53 Set Id to uniquely identify a record given a Name and a Type
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DNSTargetResource withRecordSetId(String recordSetId) {
        setRecordSetId(recordSetId);
        return this;
    }

    /**
     * The Type of DNS Record of target resource
     * 
     * @param recordType
     *        The Type of DNS Record of target resource
     */

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    /**
     * The Type of DNS Record of target resource
     * 
     * @return The Type of DNS Record of target resource
     */

    public String getRecordType() {
        return this.recordType;
    }

    /**
     * The Type of DNS Record of target resource
     * 
     * @param recordType
     *        The Type of DNS Record of target resource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DNSTargetResource withRecordType(String recordType) {
        setRecordType(recordType);
        return this;
    }

    /**
     * @param targetResource
     */

    public void setTargetResource(TargetResource targetResource) {
        this.targetResource = targetResource;
    }

    /**
     * @return
     */

    public TargetResource getTargetResource() {
        return this.targetResource;
    }

    /**
     * @param targetResource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DNSTargetResource withTargetResource(TargetResource targetResource) {
        setTargetResource(targetResource);
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getHostedZoneArn() != null)
            sb.append("HostedZoneArn: ").append(getHostedZoneArn()).append(",");
        if (getRecordSetId() != null)
            sb.append("RecordSetId: ").append(getRecordSetId()).append(",");
        if (getRecordType() != null)
            sb.append("RecordType: ").append(getRecordType()).append(",");
        if (getTargetResource() != null)
            sb.append("TargetResource: ").append(getTargetResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DNSTargetResource == false)
            return false;
        DNSTargetResource other = (DNSTargetResource) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getHostedZoneArn() == null ^ this.getHostedZoneArn() == null)
            return false;
        if (other.getHostedZoneArn() != null && other.getHostedZoneArn().equals(this.getHostedZoneArn()) == false)
            return false;
        if (other.getRecordSetId() == null ^ this.getRecordSetId() == null)
            return false;
        if (other.getRecordSetId() != null && other.getRecordSetId().equals(this.getRecordSetId()) == false)
            return false;
        if (other.getRecordType() == null ^ this.getRecordType() == null)
            return false;
        if (other.getRecordType() != null && other.getRecordType().equals(this.getRecordType()) == false)
            return false;
        if (other.getTargetResource() == null ^ this.getTargetResource() == null)
            return false;
        if (other.getTargetResource() != null && other.getTargetResource().equals(this.getTargetResource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getHostedZoneArn() == null) ? 0 : getHostedZoneArn().hashCode());
        hashCode = prime * hashCode + ((getRecordSetId() == null) ? 0 : getRecordSetId().hashCode());
        hashCode = prime * hashCode + ((getRecordType() == null) ? 0 : getRecordType().hashCode());
        hashCode = prime * hashCode + ((getTargetResource() == null) ? 0 : getTargetResource().hashCode());
        return hashCode;
    }

    @Override
    public DNSTargetResource clone() {
        try {
            return (DNSTargetResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoveryreadiness.model.transform.DNSTargetResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
