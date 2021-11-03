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
package com.amazonaws.services.account.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/GetAlternateContact" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAlternateContactResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure that contains the details for the specified alternate contact.
     * </p>
     */
    private AlternateContact alternateContact;

    /**
     * <p>
     * A structure that contains the details for the specified alternate contact.
     * </p>
     * 
     * @param alternateContact
     *        A structure that contains the details for the specified alternate contact.
     */

    public void setAlternateContact(AlternateContact alternateContact) {
        this.alternateContact = alternateContact;
    }

    /**
     * <p>
     * A structure that contains the details for the specified alternate contact.
     * </p>
     * 
     * @return A structure that contains the details for the specified alternate contact.
     */

    public AlternateContact getAlternateContact() {
        return this.alternateContact;
    }

    /**
     * <p>
     * A structure that contains the details for the specified alternate contact.
     * </p>
     * 
     * @param alternateContact
     *        A structure that contains the details for the specified alternate contact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAlternateContactResult withAlternateContact(AlternateContact alternateContact) {
        setAlternateContact(alternateContact);
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
        if (getAlternateContact() != null)
            sb.append("AlternateContact: ").append(getAlternateContact());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAlternateContactResult == false)
            return false;
        GetAlternateContactResult other = (GetAlternateContactResult) obj;
        if (other.getAlternateContact() == null ^ this.getAlternateContact() == null)
            return false;
        if (other.getAlternateContact() != null && other.getAlternateContact().equals(this.getAlternateContact()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlternateContact() == null) ? 0 : getAlternateContact().hashCode());
        return hashCode;
    }

    @Override
    public GetAlternateContactResult clone() {
        try {
            return (GetAlternateContactResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
