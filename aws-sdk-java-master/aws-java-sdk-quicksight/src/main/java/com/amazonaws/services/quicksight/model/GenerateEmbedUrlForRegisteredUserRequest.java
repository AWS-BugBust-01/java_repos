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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GenerateEmbedUrlForRegisteredUser"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateEmbedUrlForRegisteredUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the Amazon Web Services account that contains the dashboard that you're embedding.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be in [15-600] minutes range.
     * </p>
     */
    private Long sessionLifetimeInMinutes;
    /**
     * <p>
     * The Amazon Resource Name for the registered user.
     * </p>
     */
    private String userArn;
    /**
     * <p>
     * The experience you are embedding. For registered users, you can embed Amazon QuickSight dashboards, the entire
     * Amazon QuickSight console, or the Amazon QuickSight Q search bar.
     * </p>
     */
    private RegisteredUserEmbeddingExperienceConfiguration experienceConfiguration;

    /**
     * <p>
     * The ID for the Amazon Web Services account that contains the dashboard that you're embedding.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the Amazon Web Services account that contains the dashboard that you're embedding.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the Amazon Web Services account that contains the dashboard that you're embedding.
     * </p>
     * 
     * @return The ID for the Amazon Web Services account that contains the dashboard that you're embedding.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID for the Amazon Web Services account that contains the dashboard that you're embedding.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the Amazon Web Services account that contains the dashboard that you're embedding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateEmbedUrlForRegisteredUserRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be in [15-600] minutes range.
     * </p>
     * 
     * @param sessionLifetimeInMinutes
     *        How many minutes the session is valid. The session lifetime must be in [15-600] minutes range.
     */

    public void setSessionLifetimeInMinutes(Long sessionLifetimeInMinutes) {
        this.sessionLifetimeInMinutes = sessionLifetimeInMinutes;
    }

    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be in [15-600] minutes range.
     * </p>
     * 
     * @return How many minutes the session is valid. The session lifetime must be in [15-600] minutes range.
     */

    public Long getSessionLifetimeInMinutes() {
        return this.sessionLifetimeInMinutes;
    }

    /**
     * <p>
     * How many minutes the session is valid. The session lifetime must be in [15-600] minutes range.
     * </p>
     * 
     * @param sessionLifetimeInMinutes
     *        How many minutes the session is valid. The session lifetime must be in [15-600] minutes range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateEmbedUrlForRegisteredUserRequest withSessionLifetimeInMinutes(Long sessionLifetimeInMinutes) {
        setSessionLifetimeInMinutes(sessionLifetimeInMinutes);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name for the registered user.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name for the registered user.
     */

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name for the registered user.
     * </p>
     * 
     * @return The Amazon Resource Name for the registered user.
     */

    public String getUserArn() {
        return this.userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name for the registered user.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name for the registered user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateEmbedUrlForRegisteredUserRequest withUserArn(String userArn) {
        setUserArn(userArn);
        return this;
    }

    /**
     * <p>
     * The experience you are embedding. For registered users, you can embed Amazon QuickSight dashboards, the entire
     * Amazon QuickSight console, or the Amazon QuickSight Q search bar.
     * </p>
     * 
     * @param experienceConfiguration
     *        The experience you are embedding. For registered users, you can embed Amazon QuickSight dashboards, the
     *        entire Amazon QuickSight console, or the Amazon QuickSight Q search bar.
     */

    public void setExperienceConfiguration(RegisteredUserEmbeddingExperienceConfiguration experienceConfiguration) {
        this.experienceConfiguration = experienceConfiguration;
    }

    /**
     * <p>
     * The experience you are embedding. For registered users, you can embed Amazon QuickSight dashboards, the entire
     * Amazon QuickSight console, or the Amazon QuickSight Q search bar.
     * </p>
     * 
     * @return The experience you are embedding. For registered users, you can embed Amazon QuickSight dashboards, the
     *         entire Amazon QuickSight console, or the Amazon QuickSight Q search bar.
     */

    public RegisteredUserEmbeddingExperienceConfiguration getExperienceConfiguration() {
        return this.experienceConfiguration;
    }

    /**
     * <p>
     * The experience you are embedding. For registered users, you can embed Amazon QuickSight dashboards, the entire
     * Amazon QuickSight console, or the Amazon QuickSight Q search bar.
     * </p>
     * 
     * @param experienceConfiguration
     *        The experience you are embedding. For registered users, you can embed Amazon QuickSight dashboards, the
     *        entire Amazon QuickSight console, or the Amazon QuickSight Q search bar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateEmbedUrlForRegisteredUserRequest withExperienceConfiguration(RegisteredUserEmbeddingExperienceConfiguration experienceConfiguration) {
        setExperienceConfiguration(experienceConfiguration);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getSessionLifetimeInMinutes() != null)
            sb.append("SessionLifetimeInMinutes: ").append(getSessionLifetimeInMinutes()).append(",");
        if (getUserArn() != null)
            sb.append("UserArn: ").append(getUserArn()).append(",");
        if (getExperienceConfiguration() != null)
            sb.append("ExperienceConfiguration: ").append(getExperienceConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateEmbedUrlForRegisteredUserRequest == false)
            return false;
        GenerateEmbedUrlForRegisteredUserRequest other = (GenerateEmbedUrlForRegisteredUserRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getSessionLifetimeInMinutes() == null ^ this.getSessionLifetimeInMinutes() == null)
            return false;
        if (other.getSessionLifetimeInMinutes() != null && other.getSessionLifetimeInMinutes().equals(this.getSessionLifetimeInMinutes()) == false)
            return false;
        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
            return false;
        if (other.getExperienceConfiguration() == null ^ this.getExperienceConfiguration() == null)
            return false;
        if (other.getExperienceConfiguration() != null && other.getExperienceConfiguration().equals(this.getExperienceConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getSessionLifetimeInMinutes() == null) ? 0 : getSessionLifetimeInMinutes().hashCode());
        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
        hashCode = prime * hashCode + ((getExperienceConfiguration() == null) ? 0 : getExperienceConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public GenerateEmbedUrlForRegisteredUserRequest clone() {
        return (GenerateEmbedUrlForRegisteredUserRequest) super.clone();
    }

}
