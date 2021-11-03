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
 * The network status of a device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/panorama-2019-07-24/NetworkStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of Ethernet port 0.
     * </p>
     */
    private EthernetStatus ethernet0Status;
    /**
     * <p>
     * The status of Ethernet port 1.
     * </p>
     */
    private EthernetStatus ethernet1Status;

    /**
     * <p>
     * The status of Ethernet port 0.
     * </p>
     * 
     * @param ethernet0Status
     *        The status of Ethernet port 0.
     */

    public void setEthernet0Status(EthernetStatus ethernet0Status) {
        this.ethernet0Status = ethernet0Status;
    }

    /**
     * <p>
     * The status of Ethernet port 0.
     * </p>
     * 
     * @return The status of Ethernet port 0.
     */

    public EthernetStatus getEthernet0Status() {
        return this.ethernet0Status;
    }

    /**
     * <p>
     * The status of Ethernet port 0.
     * </p>
     * 
     * @param ethernet0Status
     *        The status of Ethernet port 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkStatus withEthernet0Status(EthernetStatus ethernet0Status) {
        setEthernet0Status(ethernet0Status);
        return this;
    }

    /**
     * <p>
     * The status of Ethernet port 1.
     * </p>
     * 
     * @param ethernet1Status
     *        The status of Ethernet port 1.
     */

    public void setEthernet1Status(EthernetStatus ethernet1Status) {
        this.ethernet1Status = ethernet1Status;
    }

    /**
     * <p>
     * The status of Ethernet port 1.
     * </p>
     * 
     * @return The status of Ethernet port 1.
     */

    public EthernetStatus getEthernet1Status() {
        return this.ethernet1Status;
    }

    /**
     * <p>
     * The status of Ethernet port 1.
     * </p>
     * 
     * @param ethernet1Status
     *        The status of Ethernet port 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkStatus withEthernet1Status(EthernetStatus ethernet1Status) {
        setEthernet1Status(ethernet1Status);
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
        if (getEthernet0Status() != null)
            sb.append("Ethernet0Status: ").append(getEthernet0Status()).append(",");
        if (getEthernet1Status() != null)
            sb.append("Ethernet1Status: ").append(getEthernet1Status());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkStatus == false)
            return false;
        NetworkStatus other = (NetworkStatus) obj;
        if (other.getEthernet0Status() == null ^ this.getEthernet0Status() == null)
            return false;
        if (other.getEthernet0Status() != null && other.getEthernet0Status().equals(this.getEthernet0Status()) == false)
            return false;
        if (other.getEthernet1Status() == null ^ this.getEthernet1Status() == null)
            return false;
        if (other.getEthernet1Status() != null && other.getEthernet1Status().equals(this.getEthernet1Status()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEthernet0Status() == null) ? 0 : getEthernet0Status().hashCode());
        hashCode = prime * hashCode + ((getEthernet1Status() == null) ? 0 : getEthernet1Status().hashCode());
        return hashCode;
    }

    @Override
    public NetworkStatus clone() {
        try {
            return (NetworkStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.panorama.model.transform.NetworkStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
