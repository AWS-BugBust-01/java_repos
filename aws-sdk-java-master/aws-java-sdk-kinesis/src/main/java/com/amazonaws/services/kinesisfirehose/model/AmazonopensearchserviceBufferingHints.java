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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/AmazonopensearchserviceBufferingHints"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonopensearchserviceBufferingHints implements Serializable, Cloneable, StructuredPojo {

    private Integer intervalInSeconds;

    private Integer sizeInMBs;

    /**
     * @param intervalInSeconds
     */

    public void setIntervalInSeconds(Integer intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
    }

    /**
     * @return
     */

    public Integer getIntervalInSeconds() {
        return this.intervalInSeconds;
    }

    /**
     * @param intervalInSeconds
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceBufferingHints withIntervalInSeconds(Integer intervalInSeconds) {
        setIntervalInSeconds(intervalInSeconds);
        return this;
    }

    /**
     * @param sizeInMBs
     */

    public void setSizeInMBs(Integer sizeInMBs) {
        this.sizeInMBs = sizeInMBs;
    }

    /**
     * @return
     */

    public Integer getSizeInMBs() {
        return this.sizeInMBs;
    }

    /**
     * @param sizeInMBs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonopensearchserviceBufferingHints withSizeInMBs(Integer sizeInMBs) {
        setSizeInMBs(sizeInMBs);
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
        if (getIntervalInSeconds() != null)
            sb.append("IntervalInSeconds: ").append(getIntervalInSeconds()).append(",");
        if (getSizeInMBs() != null)
            sb.append("SizeInMBs: ").append(getSizeInMBs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AmazonopensearchserviceBufferingHints == false)
            return false;
        AmazonopensearchserviceBufferingHints other = (AmazonopensearchserviceBufferingHints) obj;
        if (other.getIntervalInSeconds() == null ^ this.getIntervalInSeconds() == null)
            return false;
        if (other.getIntervalInSeconds() != null && other.getIntervalInSeconds().equals(this.getIntervalInSeconds()) == false)
            return false;
        if (other.getSizeInMBs() == null ^ this.getSizeInMBs() == null)
            return false;
        if (other.getSizeInMBs() != null && other.getSizeInMBs().equals(this.getSizeInMBs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntervalInSeconds() == null) ? 0 : getIntervalInSeconds().hashCode());
        hashCode = prime * hashCode + ((getSizeInMBs() == null) ? 0 : getSizeInMBs().hashCode());
        return hashCode;
    }

    @Override
    public AmazonopensearchserviceBufferingHints clone() {
        try {
            return (AmazonopensearchserviceBufferingHints) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.AmazonopensearchserviceBufferingHintsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
