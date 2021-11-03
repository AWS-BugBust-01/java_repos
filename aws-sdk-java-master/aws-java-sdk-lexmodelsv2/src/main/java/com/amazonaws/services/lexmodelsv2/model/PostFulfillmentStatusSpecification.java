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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a setting that determines whether the post-fulfillment response is sent to the user. For more information,
 * see <a href="https://docs.aws.amazon.com/lexv2/latest/dg/streaming-progress.html#progress-complete">https://docs.aws.
 * amazon.com/lexv2/latest/dg/streaming-progress.html#progress-complete</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/PostFulfillmentStatusSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostFulfillmentStatusSpecification implements Serializable, Cloneable, StructuredPojo {

    private ResponseSpecification successResponse;

    private ResponseSpecification failureResponse;

    private ResponseSpecification timeoutResponse;

    /**
     * @param successResponse
     */

    public void setSuccessResponse(ResponseSpecification successResponse) {
        this.successResponse = successResponse;
    }

    /**
     * @return
     */

    public ResponseSpecification getSuccessResponse() {
        return this.successResponse;
    }

    /**
     * @param successResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostFulfillmentStatusSpecification withSuccessResponse(ResponseSpecification successResponse) {
        setSuccessResponse(successResponse);
        return this;
    }

    /**
     * @param failureResponse
     */

    public void setFailureResponse(ResponseSpecification failureResponse) {
        this.failureResponse = failureResponse;
    }

    /**
     * @return
     */

    public ResponseSpecification getFailureResponse() {
        return this.failureResponse;
    }

    /**
     * @param failureResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostFulfillmentStatusSpecification withFailureResponse(ResponseSpecification failureResponse) {
        setFailureResponse(failureResponse);
        return this;
    }

    /**
     * @param timeoutResponse
     */

    public void setTimeoutResponse(ResponseSpecification timeoutResponse) {
        this.timeoutResponse = timeoutResponse;
    }

    /**
     * @return
     */

    public ResponseSpecification getTimeoutResponse() {
        return this.timeoutResponse;
    }

    /**
     * @param timeoutResponse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostFulfillmentStatusSpecification withTimeoutResponse(ResponseSpecification timeoutResponse) {
        setTimeoutResponse(timeoutResponse);
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
        if (getSuccessResponse() != null)
            sb.append("SuccessResponse: ").append(getSuccessResponse()).append(",");
        if (getFailureResponse() != null)
            sb.append("FailureResponse: ").append(getFailureResponse()).append(",");
        if (getTimeoutResponse() != null)
            sb.append("TimeoutResponse: ").append(getTimeoutResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PostFulfillmentStatusSpecification == false)
            return false;
        PostFulfillmentStatusSpecification other = (PostFulfillmentStatusSpecification) obj;
        if (other.getSuccessResponse() == null ^ this.getSuccessResponse() == null)
            return false;
        if (other.getSuccessResponse() != null && other.getSuccessResponse().equals(this.getSuccessResponse()) == false)
            return false;
        if (other.getFailureResponse() == null ^ this.getFailureResponse() == null)
            return false;
        if (other.getFailureResponse() != null && other.getFailureResponse().equals(this.getFailureResponse()) == false)
            return false;
        if (other.getTimeoutResponse() == null ^ this.getTimeoutResponse() == null)
            return false;
        if (other.getTimeoutResponse() != null && other.getTimeoutResponse().equals(this.getTimeoutResponse()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessResponse() == null) ? 0 : getSuccessResponse().hashCode());
        hashCode = prime * hashCode + ((getFailureResponse() == null) ? 0 : getFailureResponse().hashCode());
        hashCode = prime * hashCode + ((getTimeoutResponse() == null) ? 0 : getTimeoutResponse().hashCode());
        return hashCode;
    }

    @Override
    public PostFulfillmentStatusSpecification clone() {
        try {
            return (PostFulfillmentStatusSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.PostFulfillmentStatusSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
