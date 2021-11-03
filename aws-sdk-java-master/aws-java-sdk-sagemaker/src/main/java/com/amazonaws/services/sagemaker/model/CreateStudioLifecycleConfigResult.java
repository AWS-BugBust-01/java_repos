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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateStudioLifecycleConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStudioLifecycleConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of your created Lifecycle Configuration.
     * </p>
     */
    private String studioLifecycleConfigArn;

    /**
     * <p>
     * The ARN of your created Lifecycle Configuration.
     * </p>
     * 
     * @param studioLifecycleConfigArn
     *        The ARN of your created Lifecycle Configuration.
     */

    public void setStudioLifecycleConfigArn(String studioLifecycleConfigArn) {
        this.studioLifecycleConfigArn = studioLifecycleConfigArn;
    }

    /**
     * <p>
     * The ARN of your created Lifecycle Configuration.
     * </p>
     * 
     * @return The ARN of your created Lifecycle Configuration.
     */

    public String getStudioLifecycleConfigArn() {
        return this.studioLifecycleConfigArn;
    }

    /**
     * <p>
     * The ARN of your created Lifecycle Configuration.
     * </p>
     * 
     * @param studioLifecycleConfigArn
     *        The ARN of your created Lifecycle Configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStudioLifecycleConfigResult withStudioLifecycleConfigArn(String studioLifecycleConfigArn) {
        setStudioLifecycleConfigArn(studioLifecycleConfigArn);
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
        if (getStudioLifecycleConfigArn() != null)
            sb.append("StudioLifecycleConfigArn: ").append(getStudioLifecycleConfigArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStudioLifecycleConfigResult == false)
            return false;
        CreateStudioLifecycleConfigResult other = (CreateStudioLifecycleConfigResult) obj;
        if (other.getStudioLifecycleConfigArn() == null ^ this.getStudioLifecycleConfigArn() == null)
            return false;
        if (other.getStudioLifecycleConfigArn() != null && other.getStudioLifecycleConfigArn().equals(this.getStudioLifecycleConfigArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStudioLifecycleConfigArn() == null) ? 0 : getStudioLifecycleConfigArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateStudioLifecycleConfigResult clone() {
        try {
            return (CreateStudioLifecycleConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
