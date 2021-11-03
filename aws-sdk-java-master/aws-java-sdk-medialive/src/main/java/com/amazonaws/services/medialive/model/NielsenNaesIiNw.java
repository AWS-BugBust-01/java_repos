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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Nielsen Naes Ii Nw
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/NielsenNaesIiNw" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NielsenNaesIiNw implements Serializable, Cloneable, StructuredPojo {

    /** Enter the check digit string for the watermark */
    private String checkDigitString;
    /** Enter the Nielsen Source ID (SID) to include in the watermark */
    private Double sid;

    /**
     * Enter the check digit string for the watermark
     * 
     * @param checkDigitString
     *        Enter the check digit string for the watermark
     */

    public void setCheckDigitString(String checkDigitString) {
        this.checkDigitString = checkDigitString;
    }

    /**
     * Enter the check digit string for the watermark
     * 
     * @return Enter the check digit string for the watermark
     */

    public String getCheckDigitString() {
        return this.checkDigitString;
    }

    /**
     * Enter the check digit string for the watermark
     * 
     * @param checkDigitString
     *        Enter the check digit string for the watermark
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NielsenNaesIiNw withCheckDigitString(String checkDigitString) {
        setCheckDigitString(checkDigitString);
        return this;
    }

    /**
     * Enter the Nielsen Source ID (SID) to include in the watermark
     * 
     * @param sid
     *        Enter the Nielsen Source ID (SID) to include in the watermark
     */

    public void setSid(Double sid) {
        this.sid = sid;
    }

    /**
     * Enter the Nielsen Source ID (SID) to include in the watermark
     * 
     * @return Enter the Nielsen Source ID (SID) to include in the watermark
     */

    public Double getSid() {
        return this.sid;
    }

    /**
     * Enter the Nielsen Source ID (SID) to include in the watermark
     * 
     * @param sid
     *        Enter the Nielsen Source ID (SID) to include in the watermark
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NielsenNaesIiNw withSid(Double sid) {
        setSid(sid);
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
        if (getCheckDigitString() != null)
            sb.append("CheckDigitString: ").append(getCheckDigitString()).append(",");
        if (getSid() != null)
            sb.append("Sid: ").append(getSid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NielsenNaesIiNw == false)
            return false;
        NielsenNaesIiNw other = (NielsenNaesIiNw) obj;
        if (other.getCheckDigitString() == null ^ this.getCheckDigitString() == null)
            return false;
        if (other.getCheckDigitString() != null && other.getCheckDigitString().equals(this.getCheckDigitString()) == false)
            return false;
        if (other.getSid() == null ^ this.getSid() == null)
            return false;
        if (other.getSid() != null && other.getSid().equals(this.getSid()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckDigitString() == null) ? 0 : getCheckDigitString().hashCode());
        hashCode = prime * hashCode + ((getSid() == null) ? 0 : getSid().hashCode());
        return hashCode;
    }

    @Override
    public NielsenNaesIiNw clone() {
        try {
            return (NielsenNaesIiNw) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.NielsenNaesIiNwMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
