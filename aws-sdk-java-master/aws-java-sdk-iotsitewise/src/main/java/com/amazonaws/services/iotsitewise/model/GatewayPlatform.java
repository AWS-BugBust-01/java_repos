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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a gateway's platform information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/GatewayPlatform" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatewayPlatform implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A gateway that runs on IoT Greengrass.
     * </p>
     */
    private Greengrass greengrass;
    /**
     * <p>
     * A gateway that runs on IoT Greengrass V2.
     * </p>
     */
    private GreengrassV2 greengrassV2;

    /**
     * <p>
     * A gateway that runs on IoT Greengrass.
     * </p>
     * 
     * @param greengrass
     *        A gateway that runs on IoT Greengrass.
     */

    public void setGreengrass(Greengrass greengrass) {
        this.greengrass = greengrass;
    }

    /**
     * <p>
     * A gateway that runs on IoT Greengrass.
     * </p>
     * 
     * @return A gateway that runs on IoT Greengrass.
     */

    public Greengrass getGreengrass() {
        return this.greengrass;
    }

    /**
     * <p>
     * A gateway that runs on IoT Greengrass.
     * </p>
     * 
     * @param greengrass
     *        A gateway that runs on IoT Greengrass.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayPlatform withGreengrass(Greengrass greengrass) {
        setGreengrass(greengrass);
        return this;
    }

    /**
     * <p>
     * A gateway that runs on IoT Greengrass V2.
     * </p>
     * 
     * @param greengrassV2
     *        A gateway that runs on IoT Greengrass V2.
     */

    public void setGreengrassV2(GreengrassV2 greengrassV2) {
        this.greengrassV2 = greengrassV2;
    }

    /**
     * <p>
     * A gateway that runs on IoT Greengrass V2.
     * </p>
     * 
     * @return A gateway that runs on IoT Greengrass V2.
     */

    public GreengrassV2 getGreengrassV2() {
        return this.greengrassV2;
    }

    /**
     * <p>
     * A gateway that runs on IoT Greengrass V2.
     * </p>
     * 
     * @param greengrassV2
     *        A gateway that runs on IoT Greengrass V2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GatewayPlatform withGreengrassV2(GreengrassV2 greengrassV2) {
        setGreengrassV2(greengrassV2);
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
        if (getGreengrass() != null)
            sb.append("Greengrass: ").append(getGreengrass()).append(",");
        if (getGreengrassV2() != null)
            sb.append("GreengrassV2: ").append(getGreengrassV2());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GatewayPlatform == false)
            return false;
        GatewayPlatform other = (GatewayPlatform) obj;
        if (other.getGreengrass() == null ^ this.getGreengrass() == null)
            return false;
        if (other.getGreengrass() != null && other.getGreengrass().equals(this.getGreengrass()) == false)
            return false;
        if (other.getGreengrassV2() == null ^ this.getGreengrassV2() == null)
            return false;
        if (other.getGreengrassV2() != null && other.getGreengrassV2().equals(this.getGreengrassV2()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGreengrass() == null) ? 0 : getGreengrass().hashCode());
        hashCode = prime * hashCode + ((getGreengrassV2() == null) ? 0 : getGreengrassV2().hashCode());
        return hashCode;
    }

    @Override
    public GatewayPlatform clone() {
        try {
            return (GatewayPlatform) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.GatewayPlatformMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
