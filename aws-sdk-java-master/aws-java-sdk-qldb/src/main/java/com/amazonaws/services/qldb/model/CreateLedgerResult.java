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
package com.amazonaws.services.qldb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/CreateLedger" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLedgerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the ledger.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ledger.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The current status of the ledger.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The date and time, in epoch time format, when the ledger was created. (Epoch time format is the number of seconds
     * elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The permissions mode of the ledger that you created.
     * </p>
     */
    private String permissionsMode;
    /**
     * <p>
     * The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this feature
     * is enabled (<code>true</code>) by default.
     * </p>
     * <p>
     * If deletion protection is enabled, you must first disable it before you can delete the ledger. You can disable it
     * by calling the <code>UpdateLedger</code> operation to set the flag to <code>false</code>.
     * </p>
     */
    private Boolean deletionProtection;
    /**
     * <p>
     * The ARN of the customer managed KMS key that the ledger uses for encryption at rest. If this parameter is
     * undefined, the ledger uses an Amazon Web Services owned KMS key for encryption.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param name
     *        The name of the ledger.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @return The name of the ledger.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param name
     *        The name of the ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLedgerResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ledger.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the ledger.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ledger.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the ledger.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the ledger.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) for the ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLedgerResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The current status of the ledger.
     * </p>
     * 
     * @param state
     *        The current status of the ledger.
     * @see LedgerState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current status of the ledger.
     * </p>
     * 
     * @return The current status of the ledger.
     * @see LedgerState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current status of the ledger.
     * </p>
     * 
     * @param state
     *        The current status of the ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LedgerState
     */

    public CreateLedgerResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current status of the ledger.
     * </p>
     * 
     * @param state
     *        The current status of the ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LedgerState
     */

    public CreateLedgerResult withState(LedgerState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the ledger was created. (Epoch time format is the number of seconds
     * elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     * 
     * @param creationDateTime
     *        The date and time, in epoch time format, when the ledger was created. (Epoch time format is the number of
     *        seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the ledger was created. (Epoch time format is the number of seconds
     * elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     * 
     * @return The date and time, in epoch time format, when the ledger was created. (Epoch time format is the number of
     *         seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the ledger was created. (Epoch time format is the number of seconds
     * elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     * 
     * @param creationDateTime
     *        The date and time, in epoch time format, when the ledger was created. (Epoch time format is the number of
     *        seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLedgerResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The permissions mode of the ledger that you created.
     * </p>
     * 
     * @param permissionsMode
     *        The permissions mode of the ledger that you created.
     * @see PermissionsMode
     */

    public void setPermissionsMode(String permissionsMode) {
        this.permissionsMode = permissionsMode;
    }

    /**
     * <p>
     * The permissions mode of the ledger that you created.
     * </p>
     * 
     * @return The permissions mode of the ledger that you created.
     * @see PermissionsMode
     */

    public String getPermissionsMode() {
        return this.permissionsMode;
    }

    /**
     * <p>
     * The permissions mode of the ledger that you created.
     * </p>
     * 
     * @param permissionsMode
     *        The permissions mode of the ledger that you created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionsMode
     */

    public CreateLedgerResult withPermissionsMode(String permissionsMode) {
        setPermissionsMode(permissionsMode);
        return this;
    }

    /**
     * <p>
     * The permissions mode of the ledger that you created.
     * </p>
     * 
     * @param permissionsMode
     *        The permissions mode of the ledger that you created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionsMode
     */

    public CreateLedgerResult withPermissionsMode(PermissionsMode permissionsMode) {
        this.permissionsMode = permissionsMode.toString();
        return this;
    }

    /**
     * <p>
     * The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this feature
     * is enabled (<code>true</code>) by default.
     * </p>
     * <p>
     * If deletion protection is enabled, you must first disable it before you can delete the ledger. You can disable it
     * by calling the <code>UpdateLedger</code> operation to set the flag to <code>false</code>.
     * </p>
     * 
     * @param deletionProtection
     *        The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this
     *        feature is enabled (<code>true</code>) by default.</p>
     *        <p>
     *        If deletion protection is enabled, you must first disable it before you can delete the ledger. You can
     *        disable it by calling the <code>UpdateLedger</code> operation to set the flag to <code>false</code>.
     */

    public void setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
    }

    /**
     * <p>
     * The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this feature
     * is enabled (<code>true</code>) by default.
     * </p>
     * <p>
     * If deletion protection is enabled, you must first disable it before you can delete the ledger. You can disable it
     * by calling the <code>UpdateLedger</code> operation to set the flag to <code>false</code>.
     * </p>
     * 
     * @return The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this
     *         feature is enabled (<code>true</code>) by default.</p>
     *         <p>
     *         If deletion protection is enabled, you must first disable it before you can delete the ledger. You can
     *         disable it by calling the <code>UpdateLedger</code> operation to set the flag to <code>false</code>.
     */

    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this feature
     * is enabled (<code>true</code>) by default.
     * </p>
     * <p>
     * If deletion protection is enabled, you must first disable it before you can delete the ledger. You can disable it
     * by calling the <code>UpdateLedger</code> operation to set the flag to <code>false</code>.
     * </p>
     * 
     * @param deletionProtection
     *        The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this
     *        feature is enabled (<code>true</code>) by default.</p>
     *        <p>
     *        If deletion protection is enabled, you must first disable it before you can delete the ledger. You can
     *        disable it by calling the <code>UpdateLedger</code> operation to set the flag to <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLedgerResult withDeletionProtection(Boolean deletionProtection) {
        setDeletionProtection(deletionProtection);
        return this;
    }

    /**
     * <p>
     * The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this feature
     * is enabled (<code>true</code>) by default.
     * </p>
     * <p>
     * If deletion protection is enabled, you must first disable it before you can delete the ledger. You can disable it
     * by calling the <code>UpdateLedger</code> operation to set the flag to <code>false</code>.
     * </p>
     * 
     * @return The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this
     *         feature is enabled (<code>true</code>) by default.</p>
     *         <p>
     *         If deletion protection is enabled, you must first disable it before you can delete the ledger. You can
     *         disable it by calling the <code>UpdateLedger</code> operation to set the flag to <code>false</code>.
     */

    public Boolean isDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * <p>
     * The ARN of the customer managed KMS key that the ledger uses for encryption at rest. If this parameter is
     * undefined, the ledger uses an Amazon Web Services owned KMS key for encryption.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of the customer managed KMS key that the ledger uses for encryption at rest. If this parameter is
     *        undefined, the ledger uses an Amazon Web Services owned KMS key for encryption.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the customer managed KMS key that the ledger uses for encryption at rest. If this parameter is
     * undefined, the ledger uses an Amazon Web Services owned KMS key for encryption.
     * </p>
     * 
     * @return The ARN of the customer managed KMS key that the ledger uses for encryption at rest. If this parameter is
     *         undefined, the ledger uses an Amazon Web Services owned KMS key for encryption.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the customer managed KMS key that the ledger uses for encryption at rest. If this parameter is
     * undefined, the ledger uses an Amazon Web Services owned KMS key for encryption.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of the customer managed KMS key that the ledger uses for encryption at rest. If this parameter is
     *        undefined, the ledger uses an Amazon Web Services owned KMS key for encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLedgerResult withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getPermissionsMode() != null)
            sb.append("PermissionsMode: ").append(getPermissionsMode()).append(",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLedgerResult == false)
            return false;
        CreateLedgerResult other = (CreateLedgerResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getPermissionsMode() == null ^ this.getPermissionsMode() == null)
            return false;
        if (other.getPermissionsMode() != null && other.getPermissionsMode().equals(this.getPermissionsMode()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getPermissionsMode() == null) ? 0 : getPermissionsMode().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateLedgerResult clone() {
        try {
            return (CreateLedgerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
