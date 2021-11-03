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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>DomainName</code>.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Specifies the <code>EngineType</code> of the domain.
     * </p>
     */
    private String engineType;

    /**
     * <p>
     * The <code>DomainName</code>.
     * </p>
     * 
     * @param domainName
     *        The <code>DomainName</code>.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The <code>DomainName</code>.
     * </p>
     * 
     * @return The <code>DomainName</code>.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The <code>DomainName</code>.
     * </p>
     * 
     * @param domainName
     *        The <code>DomainName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainInfo withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Specifies the <code>EngineType</code> of the domain.
     * </p>
     * 
     * @param engineType
     *        Specifies the <code>EngineType</code> of the domain.
     * @see EngineType
     */

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    /**
     * <p>
     * Specifies the <code>EngineType</code> of the domain.
     * </p>
     * 
     * @return Specifies the <code>EngineType</code> of the domain.
     * @see EngineType
     */

    public String getEngineType() {
        return this.engineType;
    }

    /**
     * <p>
     * Specifies the <code>EngineType</code> of the domain.
     * </p>
     * 
     * @param engineType
     *        Specifies the <code>EngineType</code> of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public DomainInfo withEngineType(String engineType) {
        setEngineType(engineType);
        return this;
    }

    /**
     * <p>
     * Specifies the <code>EngineType</code> of the domain.
     * </p>
     * 
     * @param engineType
     *        Specifies the <code>EngineType</code> of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngineType
     */

    public DomainInfo withEngineType(EngineType engineType) {
        this.engineType = engineType.toString();
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
        if (getEngineType() != null)
            sb.append("EngineType: ").append(getEngineType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainInfo == false)
            return false;
        DomainInfo other = (DomainInfo) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getEngineType() == null ^ this.getEngineType() == null)
            return false;
        if (other.getEngineType() != null && other.getEngineType().equals(this.getEngineType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getEngineType() == null) ? 0 : getEngineType().hashCode());
        return hashCode;
    }

    @Override
    public DomainInfo clone() {
        try {
            return (DomainInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.DomainInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
