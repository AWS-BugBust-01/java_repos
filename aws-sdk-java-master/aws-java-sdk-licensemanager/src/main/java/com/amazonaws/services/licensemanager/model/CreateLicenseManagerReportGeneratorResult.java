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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/CreateLicenseManagerReportGenerator"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLicenseManagerReportGeneratorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new report generator.
     * </p>
     */
    private String licenseManagerReportGeneratorArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new report generator.
     * </p>
     * 
     * @param licenseManagerReportGeneratorArn
     *        The Amazon Resource Name (ARN) of the new report generator.
     */

    public void setLicenseManagerReportGeneratorArn(String licenseManagerReportGeneratorArn) {
        this.licenseManagerReportGeneratorArn = licenseManagerReportGeneratorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new report generator.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the new report generator.
     */

    public String getLicenseManagerReportGeneratorArn() {
        return this.licenseManagerReportGeneratorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the new report generator.
     * </p>
     * 
     * @param licenseManagerReportGeneratorArn
     *        The Amazon Resource Name (ARN) of the new report generator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLicenseManagerReportGeneratorResult withLicenseManagerReportGeneratorArn(String licenseManagerReportGeneratorArn) {
        setLicenseManagerReportGeneratorArn(licenseManagerReportGeneratorArn);
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
        if (getLicenseManagerReportGeneratorArn() != null)
            sb.append("LicenseManagerReportGeneratorArn: ").append(getLicenseManagerReportGeneratorArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLicenseManagerReportGeneratorResult == false)
            return false;
        CreateLicenseManagerReportGeneratorResult other = (CreateLicenseManagerReportGeneratorResult) obj;
        if (other.getLicenseManagerReportGeneratorArn() == null ^ this.getLicenseManagerReportGeneratorArn() == null)
            return false;
        if (other.getLicenseManagerReportGeneratorArn() != null
                && other.getLicenseManagerReportGeneratorArn().equals(this.getLicenseManagerReportGeneratorArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicenseManagerReportGeneratorArn() == null) ? 0 : getLicenseManagerReportGeneratorArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateLicenseManagerReportGeneratorResult clone() {
        try {
            return (CreateLicenseManagerReportGeneratorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
