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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateRecipeJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRecipeJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job.
     * </p>
     */
    private String encryptionKeyArn;
    /**
     * <p>
     * The encryption mode for the job, which can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SSE-KMS</code> - Server-side encryption with keys managed by KMS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSE-S3</code> - Server-side encryption with keys managed by Amazon S3.
     * </p>
     * </li>
     * </ul>
     */
    private String encryptionMode;
    /**
     * <p>
     * The name of the job to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Enables or disables Amazon CloudWatch logging for the job. If logging is enabled, CloudWatch writes one log
     * stream for each job run.
     * </p>
     */
    private String logSubscription;
    /**
     * <p>
     * The maximum number of nodes that DataBrew can consume when the job processes data.
     * </p>
     */
    private Integer maxCapacity;
    /**
     * <p>
     * The maximum number of times to retry the job after a job run fails.
     * </p>
     */
    private Integer maxRetries;
    /**
     * <p>
     * One or more artifacts that represent the output from running the job.
     * </p>
     */
    private java.util.List<Output> outputs;
    /**
     * <p>
     * One or more artifacts that represent the Glue Data Catalog output from running the job.
     * </p>
     */
    private java.util.List<DataCatalogOutput> dataCatalogOutputs;
    /**
     * <p>
     * Represents a list of JDBC database output objects which defines the output destination for a DataBrew recipe job
     * to write into.
     * </p>
     */
    private java.util.List<DatabaseOutput> databaseOutputs;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be assumed when DataBrew runs
     * the job.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a status of
     * <code>TIMEOUT</code>.
     * </p>
     */
    private Integer timeout;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The Amazon Resource Name (ARN) of an encryption key that is used to protect the job.
     */

    public void setEncryptionKeyArn(String encryptionKeyArn) {
        this.encryptionKeyArn = encryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an encryption key that is used to protect the job.
     */

    public String getEncryptionKeyArn() {
        return this.encryptionKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an encryption key that is used to protect the job.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The Amazon Resource Name (ARN) of an encryption key that is used to protect the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecipeJobRequest withEncryptionKeyArn(String encryptionKeyArn) {
        setEncryptionKeyArn(encryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * The encryption mode for the job, which can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SSE-KMS</code> - Server-side encryption with keys managed by KMS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSE-S3</code> - Server-side encryption with keys managed by Amazon S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionMode
     *        The encryption mode for the job, which can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SSE-KMS</code> - Server-side encryption with keys managed by KMS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SSE-S3</code> - Server-side encryption with keys managed by Amazon S3.
     *        </p>
     *        </li>
     * @see EncryptionMode
     */

    public void setEncryptionMode(String encryptionMode) {
        this.encryptionMode = encryptionMode;
    }

    /**
     * <p>
     * The encryption mode for the job, which can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SSE-KMS</code> - Server-side encryption with keys managed by KMS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSE-S3</code> - Server-side encryption with keys managed by Amazon S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The encryption mode for the job, which can be one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SSE-KMS</code> - Server-side encryption with keys managed by KMS.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SSE-S3</code> - Server-side encryption with keys managed by Amazon S3.
     *         </p>
     *         </li>
     * @see EncryptionMode
     */

    public String getEncryptionMode() {
        return this.encryptionMode;
    }

    /**
     * <p>
     * The encryption mode for the job, which can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SSE-KMS</code> - Server-side encryption with keys managed by KMS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSE-S3</code> - Server-side encryption with keys managed by Amazon S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionMode
     *        The encryption mode for the job, which can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SSE-KMS</code> - Server-side encryption with keys managed by KMS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SSE-S3</code> - Server-side encryption with keys managed by Amazon S3.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionMode
     */

    public UpdateRecipeJobRequest withEncryptionMode(String encryptionMode) {
        setEncryptionMode(encryptionMode);
        return this;
    }

    /**
     * <p>
     * The encryption mode for the job, which can be one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SSE-KMS</code> - Server-side encryption with keys managed by KMS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SSE-S3</code> - Server-side encryption with keys managed by Amazon S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionMode
     *        The encryption mode for the job, which can be one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SSE-KMS</code> - Server-side encryption with keys managed by KMS.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SSE-S3</code> - Server-side encryption with keys managed by Amazon S3.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionMode
     */

    public UpdateRecipeJobRequest withEncryptionMode(EncryptionMode encryptionMode) {
        this.encryptionMode = encryptionMode.toString();
        return this;
    }

    /**
     * <p>
     * The name of the job to update.
     * </p>
     * 
     * @param name
     *        The name of the job to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the job to update.
     * </p>
     * 
     * @return The name of the job to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the job to update.
     * </p>
     * 
     * @param name
     *        The name of the job to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecipeJobRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Enables or disables Amazon CloudWatch logging for the job. If logging is enabled, CloudWatch writes one log
     * stream for each job run.
     * </p>
     * 
     * @param logSubscription
     *        Enables or disables Amazon CloudWatch logging for the job. If logging is enabled, CloudWatch writes one
     *        log stream for each job run.
     * @see LogSubscription
     */

    public void setLogSubscription(String logSubscription) {
        this.logSubscription = logSubscription;
    }

    /**
     * <p>
     * Enables or disables Amazon CloudWatch logging for the job. If logging is enabled, CloudWatch writes one log
     * stream for each job run.
     * </p>
     * 
     * @return Enables or disables Amazon CloudWatch logging for the job. If logging is enabled, CloudWatch writes one
     *         log stream for each job run.
     * @see LogSubscription
     */

    public String getLogSubscription() {
        return this.logSubscription;
    }

    /**
     * <p>
     * Enables or disables Amazon CloudWatch logging for the job. If logging is enabled, CloudWatch writes one log
     * stream for each job run.
     * </p>
     * 
     * @param logSubscription
     *        Enables or disables Amazon CloudWatch logging for the job. If logging is enabled, CloudWatch writes one
     *        log stream for each job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogSubscription
     */

    public UpdateRecipeJobRequest withLogSubscription(String logSubscription) {
        setLogSubscription(logSubscription);
        return this;
    }

    /**
     * <p>
     * Enables or disables Amazon CloudWatch logging for the job. If logging is enabled, CloudWatch writes one log
     * stream for each job run.
     * </p>
     * 
     * @param logSubscription
     *        Enables or disables Amazon CloudWatch logging for the job. If logging is enabled, CloudWatch writes one
     *        log stream for each job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogSubscription
     */

    public UpdateRecipeJobRequest withLogSubscription(LogSubscription logSubscription) {
        this.logSubscription = logSubscription.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of nodes that DataBrew can consume when the job processes data.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum number of nodes that DataBrew can consume when the job processes data.
     */

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    /**
     * <p>
     * The maximum number of nodes that DataBrew can consume when the job processes data.
     * </p>
     * 
     * @return The maximum number of nodes that DataBrew can consume when the job processes data.
     */

    public Integer getMaxCapacity() {
        return this.maxCapacity;
    }

    /**
     * <p>
     * The maximum number of nodes that DataBrew can consume when the job processes data.
     * </p>
     * 
     * @param maxCapacity
     *        The maximum number of nodes that DataBrew can consume when the job processes data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecipeJobRequest withMaxCapacity(Integer maxCapacity) {
        setMaxCapacity(maxCapacity);
        return this;
    }

    /**
     * <p>
     * The maximum number of times to retry the job after a job run fails.
     * </p>
     * 
     * @param maxRetries
     *        The maximum number of times to retry the job after a job run fails.
     */

    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry the job after a job run fails.
     * </p>
     * 
     * @return The maximum number of times to retry the job after a job run fails.
     */

    public Integer getMaxRetries() {
        return this.maxRetries;
    }

    /**
     * <p>
     * The maximum number of times to retry the job after a job run fails.
     * </p>
     * 
     * @param maxRetries
     *        The maximum number of times to retry the job after a job run fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecipeJobRequest withMaxRetries(Integer maxRetries) {
        setMaxRetries(maxRetries);
        return this;
    }

    /**
     * <p>
     * One or more artifacts that represent the output from running the job.
     * </p>
     * 
     * @return One or more artifacts that represent the output from running the job.
     */

    public java.util.List<Output> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * One or more artifacts that represent the output from running the job.
     * </p>
     * 
     * @param outputs
     *        One or more artifacts that represent the output from running the job.
     */

    public void setOutputs(java.util.Collection<Output> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<Output>(outputs);
    }

    /**
     * <p>
     * One or more artifacts that represent the output from running the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        One or more artifacts that represent the output from running the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecipeJobRequest withOutputs(Output... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<Output>(outputs.length));
        }
        for (Output ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more artifacts that represent the output from running the job.
     * </p>
     * 
     * @param outputs
     *        One or more artifacts that represent the output from running the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecipeJobRequest withOutputs(java.util.Collection<Output> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * One or more artifacts that represent the Glue Data Catalog output from running the job.
     * </p>
     * 
     * @return One or more artifacts that represent the Glue Data Catalog output from running the job.
     */

    public java.util.List<DataCatalogOutput> getDataCatalogOutputs() {
        return dataCatalogOutputs;
    }

    /**
     * <p>
     * One or more artifacts that represent the Glue Data Catalog output from running the job.
     * </p>
     * 
     * @param dataCatalogOutputs
     *        One or more artifacts that represent the Glue Data Catalog output from running the job.
     */

    public void setDataCatalogOutputs(java.util.Collection<DataCatalogOutput> dataCatalogOutputs) {
        if (dataCatalogOutputs == null) {
            this.dataCatalogOutputs = null;
            return;
        }

        this.dataCatalogOutputs = new java.util.ArrayList<DataCatalogOutput>(dataCatalogOutputs);
    }

    /**
     * <p>
     * One or more artifacts that represent the Glue Data Catalog output from running the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataCatalogOutputs(java.util.Collection)} or {@link #withDataCatalogOutputs(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param dataCatalogOutputs
     *        One or more artifacts that represent the Glue Data Catalog output from running the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecipeJobRequest withDataCatalogOutputs(DataCatalogOutput... dataCatalogOutputs) {
        if (this.dataCatalogOutputs == null) {
            setDataCatalogOutputs(new java.util.ArrayList<DataCatalogOutput>(dataCatalogOutputs.length));
        }
        for (DataCatalogOutput ele : dataCatalogOutputs) {
            this.dataCatalogOutputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more artifacts that represent the Glue Data Catalog output from running the job.
     * </p>
     * 
     * @param dataCatalogOutputs
     *        One or more artifacts that represent the Glue Data Catalog output from running the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecipeJobRequest withDataCatalogOutputs(java.util.Collection<DataCatalogOutput> dataCatalogOutputs) {
        setDataCatalogOutputs(dataCatalogOutputs);
        return this;
    }

    /**
     * <p>
     * Represents a list of JDBC database output objects which defines the output destination for a DataBrew recipe job
     * to write into.
     * </p>
     * 
     * @return Represents a list of JDBC database output objects which defines the output destination for a DataBrew
     *         recipe job to write into.
     */

    public java.util.List<DatabaseOutput> getDatabaseOutputs() {
        return databaseOutputs;
    }

    /**
     * <p>
     * Represents a list of JDBC database output objects which defines the output destination for a DataBrew recipe job
     * to write into.
     * </p>
     * 
     * @param databaseOutputs
     *        Represents a list of JDBC database output objects which defines the output destination for a DataBrew
     *        recipe job to write into.
     */

    public void setDatabaseOutputs(java.util.Collection<DatabaseOutput> databaseOutputs) {
        if (databaseOutputs == null) {
            this.databaseOutputs = null;
            return;
        }

        this.databaseOutputs = new java.util.ArrayList<DatabaseOutput>(databaseOutputs);
    }

    /**
     * <p>
     * Represents a list of JDBC database output objects which defines the output destination for a DataBrew recipe job
     * to write into.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDatabaseOutputs(java.util.Collection)} or {@link #withDatabaseOutputs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param databaseOutputs
     *        Represents a list of JDBC database output objects which defines the output destination for a DataBrew
     *        recipe job to write into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecipeJobRequest withDatabaseOutputs(DatabaseOutput... databaseOutputs) {
        if (this.databaseOutputs == null) {
            setDatabaseOutputs(new java.util.ArrayList<DatabaseOutput>(databaseOutputs.length));
        }
        for (DatabaseOutput ele : databaseOutputs) {
            this.databaseOutputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents a list of JDBC database output objects which defines the output destination for a DataBrew recipe job
     * to write into.
     * </p>
     * 
     * @param databaseOutputs
     *        Represents a list of JDBC database output objects which defines the output destination for a DataBrew
     *        recipe job to write into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecipeJobRequest withDatabaseOutputs(java.util.Collection<DatabaseOutput> databaseOutputs) {
        setDatabaseOutputs(databaseOutputs);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be assumed when DataBrew runs
     * the job.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be assumed when
     *        DataBrew runs the job.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be assumed when DataBrew runs
     * the job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be assumed when
     *         DataBrew runs the job.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be assumed when DataBrew runs
     * the job.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role to be assumed when
     *        DataBrew runs the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecipeJobRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a status of
     * <code>TIMEOUT</code>.
     * </p>
     * 
     * @param timeout
     *        The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a
     *        status of <code>TIMEOUT</code>.
     */

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a status of
     * <code>TIMEOUT</code>.
     * </p>
     * 
     * @return The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a
     *         status of <code>TIMEOUT</code>.
     */

    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * <p>
     * The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a status of
     * <code>TIMEOUT</code>.
     * </p>
     * 
     * @param timeout
     *        The job's timeout in minutes. A job that attempts to run longer than this timeout period ends with a
     *        status of <code>TIMEOUT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecipeJobRequest withTimeout(Integer timeout) {
        setTimeout(timeout);
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
        if (getEncryptionKeyArn() != null)
            sb.append("EncryptionKeyArn: ").append(getEncryptionKeyArn()).append(",");
        if (getEncryptionMode() != null)
            sb.append("EncryptionMode: ").append(getEncryptionMode()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getLogSubscription() != null)
            sb.append("LogSubscription: ").append(getLogSubscription()).append(",");
        if (getMaxCapacity() != null)
            sb.append("MaxCapacity: ").append(getMaxCapacity()).append(",");
        if (getMaxRetries() != null)
            sb.append("MaxRetries: ").append(getMaxRetries()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getDataCatalogOutputs() != null)
            sb.append("DataCatalogOutputs: ").append(getDataCatalogOutputs()).append(",");
        if (getDatabaseOutputs() != null)
            sb.append("DatabaseOutputs: ").append(getDatabaseOutputs()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTimeout() != null)
            sb.append("Timeout: ").append(getTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRecipeJobRequest == false)
            return false;
        UpdateRecipeJobRequest other = (UpdateRecipeJobRequest) obj;
        if (other.getEncryptionKeyArn() == null ^ this.getEncryptionKeyArn() == null)
            return false;
        if (other.getEncryptionKeyArn() != null && other.getEncryptionKeyArn().equals(this.getEncryptionKeyArn()) == false)
            return false;
        if (other.getEncryptionMode() == null ^ this.getEncryptionMode() == null)
            return false;
        if (other.getEncryptionMode() != null && other.getEncryptionMode().equals(this.getEncryptionMode()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getLogSubscription() == null ^ this.getLogSubscription() == null)
            return false;
        if (other.getLogSubscription() != null && other.getLogSubscription().equals(this.getLogSubscription()) == false)
            return false;
        if (other.getMaxCapacity() == null ^ this.getMaxCapacity() == null)
            return false;
        if (other.getMaxCapacity() != null && other.getMaxCapacity().equals(this.getMaxCapacity()) == false)
            return false;
        if (other.getMaxRetries() == null ^ this.getMaxRetries() == null)
            return false;
        if (other.getMaxRetries() != null && other.getMaxRetries().equals(this.getMaxRetries()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getDataCatalogOutputs() == null ^ this.getDataCatalogOutputs() == null)
            return false;
        if (other.getDataCatalogOutputs() != null && other.getDataCatalogOutputs().equals(this.getDataCatalogOutputs()) == false)
            return false;
        if (other.getDatabaseOutputs() == null ^ this.getDatabaseOutputs() == null)
            return false;
        if (other.getDatabaseOutputs() != null && other.getDatabaseOutputs().equals(this.getDatabaseOutputs()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionKeyArn() == null) ? 0 : getEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getEncryptionMode() == null) ? 0 : getEncryptionMode().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getLogSubscription() == null) ? 0 : getLogSubscription().hashCode());
        hashCode = prime * hashCode + ((getMaxCapacity() == null) ? 0 : getMaxCapacity().hashCode());
        hashCode = prime * hashCode + ((getMaxRetries() == null) ? 0 : getMaxRetries().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getDataCatalogOutputs() == null) ? 0 : getDataCatalogOutputs().hashCode());
        hashCode = prime * hashCode + ((getDatabaseOutputs() == null) ? 0 : getDatabaseOutputs().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRecipeJobRequest clone() {
        return (UpdateRecipeJobRequest) super.clone();
    }

}
