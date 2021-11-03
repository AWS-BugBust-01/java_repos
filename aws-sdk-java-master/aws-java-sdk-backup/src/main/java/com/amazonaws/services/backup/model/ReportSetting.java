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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains detailed information about a report setting.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/ReportSetting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportSetting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifies the report template for the report. Reports are built using a report template. The report templates
     * are:
     * </p>
     * <p>
     * <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     * </p>
     */
    private String reportTemplate;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the frameworks a report covers.
     * </p>
     */
    private java.util.List<String> frameworkArns;
    /**
     * <p>
     * The number of frameworks a report covers.
     * </p>
     */
    private Integer numberOfFrameworks;

    /**
     * <p>
     * Identifies the report template for the report. Reports are built using a report template. The report templates
     * are:
     * </p>
     * <p>
     * <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     * </p>
     * 
     * @param reportTemplate
     *        Identifies the report template for the report. Reports are built using a report template. The report
     *        templates are:</p>
     *        <p>
     *        <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     */

    public void setReportTemplate(String reportTemplate) {
        this.reportTemplate = reportTemplate;
    }

    /**
     * <p>
     * Identifies the report template for the report. Reports are built using a report template. The report templates
     * are:
     * </p>
     * <p>
     * <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     * </p>
     * 
     * @return Identifies the report template for the report. Reports are built using a report template. The report
     *         templates are:</p>
     *         <p>
     *         <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     */

    public String getReportTemplate() {
        return this.reportTemplate;
    }

    /**
     * <p>
     * Identifies the report template for the report. Reports are built using a report template. The report templates
     * are:
     * </p>
     * <p>
     * <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     * </p>
     * 
     * @param reportTemplate
     *        Identifies the report template for the report. Reports are built using a report template. The report
     *        templates are:</p>
     *        <p>
     *        <code>RESOURCE_COMPLIANCE_REPORT | CONTROL_COMPLIANCE_REPORT | BACKUP_JOB_REPORT | COPY_JOB_REPORT | RESTORE_JOB_REPORT</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportSetting withReportTemplate(String reportTemplate) {
        setReportTemplate(reportTemplate);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the frameworks a report covers.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the frameworks a report covers.
     */

    public java.util.List<String> getFrameworkArns() {
        return frameworkArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the frameworks a report covers.
     * </p>
     * 
     * @param frameworkArns
     *        The Amazon Resource Names (ARNs) of the frameworks a report covers.
     */

    public void setFrameworkArns(java.util.Collection<String> frameworkArns) {
        if (frameworkArns == null) {
            this.frameworkArns = null;
            return;
        }

        this.frameworkArns = new java.util.ArrayList<String>(frameworkArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the frameworks a report covers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFrameworkArns(java.util.Collection)} or {@link #withFrameworkArns(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param frameworkArns
     *        The Amazon Resource Names (ARNs) of the frameworks a report covers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportSetting withFrameworkArns(String... frameworkArns) {
        if (this.frameworkArns == null) {
            setFrameworkArns(new java.util.ArrayList<String>(frameworkArns.length));
        }
        for (String ele : frameworkArns) {
            this.frameworkArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the frameworks a report covers.
     * </p>
     * 
     * @param frameworkArns
     *        The Amazon Resource Names (ARNs) of the frameworks a report covers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportSetting withFrameworkArns(java.util.Collection<String> frameworkArns) {
        setFrameworkArns(frameworkArns);
        return this;
    }

    /**
     * <p>
     * The number of frameworks a report covers.
     * </p>
     * 
     * @param numberOfFrameworks
     *        The number of frameworks a report covers.
     */

    public void setNumberOfFrameworks(Integer numberOfFrameworks) {
        this.numberOfFrameworks = numberOfFrameworks;
    }

    /**
     * <p>
     * The number of frameworks a report covers.
     * </p>
     * 
     * @return The number of frameworks a report covers.
     */

    public Integer getNumberOfFrameworks() {
        return this.numberOfFrameworks;
    }

    /**
     * <p>
     * The number of frameworks a report covers.
     * </p>
     * 
     * @param numberOfFrameworks
     *        The number of frameworks a report covers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportSetting withNumberOfFrameworks(Integer numberOfFrameworks) {
        setNumberOfFrameworks(numberOfFrameworks);
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
        if (getReportTemplate() != null)
            sb.append("ReportTemplate: ").append(getReportTemplate()).append(",");
        if (getFrameworkArns() != null)
            sb.append("FrameworkArns: ").append(getFrameworkArns()).append(",");
        if (getNumberOfFrameworks() != null)
            sb.append("NumberOfFrameworks: ").append(getNumberOfFrameworks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportSetting == false)
            return false;
        ReportSetting other = (ReportSetting) obj;
        if (other.getReportTemplate() == null ^ this.getReportTemplate() == null)
            return false;
        if (other.getReportTemplate() != null && other.getReportTemplate().equals(this.getReportTemplate()) == false)
            return false;
        if (other.getFrameworkArns() == null ^ this.getFrameworkArns() == null)
            return false;
        if (other.getFrameworkArns() != null && other.getFrameworkArns().equals(this.getFrameworkArns()) == false)
            return false;
        if (other.getNumberOfFrameworks() == null ^ this.getNumberOfFrameworks() == null)
            return false;
        if (other.getNumberOfFrameworks() != null && other.getNumberOfFrameworks().equals(this.getNumberOfFrameworks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReportTemplate() == null) ? 0 : getReportTemplate().hashCode());
        hashCode = prime * hashCode + ((getFrameworkArns() == null) ? 0 : getFrameworkArns().hashCode());
        hashCode = prime * hashCode + ((getNumberOfFrameworks() == null) ? 0 : getNumberOfFrameworks().hashCode());
        return hashCode;
    }

    @Override
    public ReportSetting clone() {
        try {
            return (ReportSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.backup.model.transform.ReportSettingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
