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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeBackupVault" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBackupVaultResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     */
    private String backupVaultName;
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     */
    private String backupVaultArn;
    /**
     * <p>
     * The server-side encryption key that is used to protect your backups; for example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     */
    private String encryptionKeyArn;
    /**
     * <p>
     * The date and time that a backup vault is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * A unique string that identifies the request and allows failed requests to be retried without the risk of running
     * the operation twice.
     * </p>
     */
    private String creatorRequestId;
    /**
     * <p>
     * The number of recovery points that are stored in a backup vault.
     * </p>
     */
    private Long numberOfRecoveryPoints;
    /**
     * <p>
     * A Boolean that indicates whether Backup Vault Lock is currently protecting the backup vault. <code>True</code>
     * means that Vault Lock causes delete or update operations on the recovery points stored in the vault to fail.
     * </p>
     */
    private Boolean locked;
    /**
     * <p>
     * The Backup Vault Lock setting that specifies the minimum retention period that the vault retains its recovery
     * points. If this parameter is not specified, Vault Lock does not enforce a minimum retention period.
     * </p>
     * <p>
     * If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period equal to
     * or longer than the minimum retention period. If the job's retention period is shorter than that minimum retention
     * period, then the vault fails the backup or copy job, and you should either modify your lifecycle settings or use
     * a different vault. Recovery points already stored in the vault prior to Vault Lock are not affected.
     * </p>
     */
    private Long minRetentionDays;
    /**
     * <p>
     * The Backup Vault Lock setting that specifies the maximum retention period that the vault retains its recovery
     * points. If this parameter is not specified, Vault Lock does not enforce a maximum retention period on the
     * recovery points in the vault (allowing indefinite storage).
     * </p>
     * <p>
     * If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period equal to
     * or shorter than the maximum retention period. If the job's retention period is longer than that maximum retention
     * period, then the vault fails the backup or copy job, and you should either modify your lifecycle settings or use
     * a different vault. Recovery points already stored in the vault prior to Vault Lock are not affected.
     * </p>
     */
    private Long maxRetentionDays;
    /**
     * <p>
     * The date and time when Backup Vault Lock configuration cannot be changed or deleted.
     * </p>
     * <p>
     * If you applied Vault Lock to your vault without specifying a lock date, you can change any of your Vault Lock
     * settings, or delete Vault Lock from the vault entirely, at any time.
     * </p>
     * <p>
     * This value is in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date lockDate;

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     * 
     * @param backupVaultName
     *        The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *        unique to the account used to create them and the Region where they are created. They consist of lowercase
     *        letters, numbers, and hyphens.
     */

    public void setBackupVaultName(String backupVaultName) {
        this.backupVaultName = backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     * 
     * @return The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *         unique to the account used to create them and the Region where they are created. They consist of
     *         lowercase letters, numbers, and hyphens.
     */

    public String getBackupVaultName() {
        return this.backupVaultName;
    }

    /**
     * <p>
     * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique
     * to the account used to create them and the Region where they are created. They consist of lowercase letters,
     * numbers, and hyphens.
     * </p>
     * 
     * @param backupVaultName
     *        The name of a logical container where backups are stored. Backup vaults are identified by names that are
     *        unique to the account used to create them and the Region where they are created. They consist of lowercase
     *        letters, numbers, and hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupVaultResult withBackupVaultName(String backupVaultName) {
        setBackupVaultName(backupVaultName);
        return this;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * 
     * @param backupVaultArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     */

    public void setBackupVaultArn(String backupVaultArn) {
        this.backupVaultArn = backupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * 
     * @return An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     */

    public String getBackupVaultArn() {
        return this.backupVaultArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example,
     * <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * </p>
     * 
     * @param backupVaultArn
     *        An Amazon Resource Name (ARN) that uniquely identifies a backup vault; for example,
     *        <code>arn:aws:backup:us-east-1:123456789012:vault:aBackupVault</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupVaultResult withBackupVaultArn(String backupVaultArn) {
        setBackupVaultArn(backupVaultArn);
        return this;
    }

    /**
     * <p>
     * The server-side encryption key that is used to protect your backups; for example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The server-side encryption key that is used to protect your backups; for example,
     *        <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     */

    public void setEncryptionKeyArn(String encryptionKeyArn) {
        this.encryptionKeyArn = encryptionKeyArn;
    }

    /**
     * <p>
     * The server-side encryption key that is used to protect your backups; for example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * 
     * @return The server-side encryption key that is used to protect your backups; for example,
     *         <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     */

    public String getEncryptionKeyArn() {
        return this.encryptionKeyArn;
    }

    /**
     * <p>
     * The server-side encryption key that is used to protect your backups; for example,
     * <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * </p>
     * 
     * @param encryptionKeyArn
     *        The server-side encryption key that is used to protect your backups; for example,
     *        <code>arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupVaultResult withEncryptionKeyArn(String encryptionKeyArn) {
        setEncryptionKeyArn(encryptionKeyArn);
        return this;
    }

    /**
     * <p>
     * The date and time that a backup vault is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationDate
     *        The date and time that a backup vault is created, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time that a backup vault is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that a backup vault is created, in Unix format and Coordinated Universal Time (UTC).
     *         The value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *         represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time that a backup vault is created, in Unix format and Coordinated Universal Time (UTC). The value
     * of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087 represents
     * Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param creationDate
     *        The date and time that a backup vault is created, in Unix format and Coordinated Universal Time (UTC). The
     *        value of <code>CreationDate</code> is accurate to milliseconds. For example, the value 1516925490.087
     *        represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupVaultResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request and allows failed requests to be retried without the risk of running
     * the operation twice.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and allows failed requests to be retried without the risk of
     *        running the operation twice.
     */

    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and allows failed requests to be retried without the risk of running
     * the operation twice.
     * </p>
     * 
     * @return A unique string that identifies the request and allows failed requests to be retried without the risk of
     *         running the operation twice.
     */

    public String getCreatorRequestId() {
        return this.creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and allows failed requests to be retried without the risk of running
     * the operation twice.
     * </p>
     * 
     * @param creatorRequestId
     *        A unique string that identifies the request and allows failed requests to be retried without the risk of
     *        running the operation twice.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupVaultResult withCreatorRequestId(String creatorRequestId) {
        setCreatorRequestId(creatorRequestId);
        return this;
    }

    /**
     * <p>
     * The number of recovery points that are stored in a backup vault.
     * </p>
     * 
     * @param numberOfRecoveryPoints
     *        The number of recovery points that are stored in a backup vault.
     */

    public void setNumberOfRecoveryPoints(Long numberOfRecoveryPoints) {
        this.numberOfRecoveryPoints = numberOfRecoveryPoints;
    }

    /**
     * <p>
     * The number of recovery points that are stored in a backup vault.
     * </p>
     * 
     * @return The number of recovery points that are stored in a backup vault.
     */

    public Long getNumberOfRecoveryPoints() {
        return this.numberOfRecoveryPoints;
    }

    /**
     * <p>
     * The number of recovery points that are stored in a backup vault.
     * </p>
     * 
     * @param numberOfRecoveryPoints
     *        The number of recovery points that are stored in a backup vault.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupVaultResult withNumberOfRecoveryPoints(Long numberOfRecoveryPoints) {
        setNumberOfRecoveryPoints(numberOfRecoveryPoints);
        return this;
    }

    /**
     * <p>
     * A Boolean that indicates whether Backup Vault Lock is currently protecting the backup vault. <code>True</code>
     * means that Vault Lock causes delete or update operations on the recovery points stored in the vault to fail.
     * </p>
     * 
     * @param locked
     *        A Boolean that indicates whether Backup Vault Lock is currently protecting the backup vault.
     *        <code>True</code> means that Vault Lock causes delete or update operations on the recovery points stored
     *        in the vault to fail.
     */

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    /**
     * <p>
     * A Boolean that indicates whether Backup Vault Lock is currently protecting the backup vault. <code>True</code>
     * means that Vault Lock causes delete or update operations on the recovery points stored in the vault to fail.
     * </p>
     * 
     * @return A Boolean that indicates whether Backup Vault Lock is currently protecting the backup vault.
     *         <code>True</code> means that Vault Lock causes delete or update operations on the recovery points stored
     *         in the vault to fail.
     */

    public Boolean getLocked() {
        return this.locked;
    }

    /**
     * <p>
     * A Boolean that indicates whether Backup Vault Lock is currently protecting the backup vault. <code>True</code>
     * means that Vault Lock causes delete or update operations on the recovery points stored in the vault to fail.
     * </p>
     * 
     * @param locked
     *        A Boolean that indicates whether Backup Vault Lock is currently protecting the backup vault.
     *        <code>True</code> means that Vault Lock causes delete or update operations on the recovery points stored
     *        in the vault to fail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupVaultResult withLocked(Boolean locked) {
        setLocked(locked);
        return this;
    }

    /**
     * <p>
     * A Boolean that indicates whether Backup Vault Lock is currently protecting the backup vault. <code>True</code>
     * means that Vault Lock causes delete or update operations on the recovery points stored in the vault to fail.
     * </p>
     * 
     * @return A Boolean that indicates whether Backup Vault Lock is currently protecting the backup vault.
     *         <code>True</code> means that Vault Lock causes delete or update operations on the recovery points stored
     *         in the vault to fail.
     */

    public Boolean isLocked() {
        return this.locked;
    }

    /**
     * <p>
     * The Backup Vault Lock setting that specifies the minimum retention period that the vault retains its recovery
     * points. If this parameter is not specified, Vault Lock does not enforce a minimum retention period.
     * </p>
     * <p>
     * If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period equal to
     * or longer than the minimum retention period. If the job's retention period is shorter than that minimum retention
     * period, then the vault fails the backup or copy job, and you should either modify your lifecycle settings or use
     * a different vault. Recovery points already stored in the vault prior to Vault Lock are not affected.
     * </p>
     * 
     * @param minRetentionDays
     *        The Backup Vault Lock setting that specifies the minimum retention period that the vault retains its
     *        recovery points. If this parameter is not specified, Vault Lock does not enforce a minimum retention
     *        period.</p>
     *        <p>
     *        If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period
     *        equal to or longer than the minimum retention period. If the job's retention period is shorter than that
     *        minimum retention period, then the vault fails the backup or copy job, and you should either modify your
     *        lifecycle settings or use a different vault. Recovery points already stored in the vault prior to Vault
     *        Lock are not affected.
     */

    public void setMinRetentionDays(Long minRetentionDays) {
        this.minRetentionDays = minRetentionDays;
    }

    /**
     * <p>
     * The Backup Vault Lock setting that specifies the minimum retention period that the vault retains its recovery
     * points. If this parameter is not specified, Vault Lock does not enforce a minimum retention period.
     * </p>
     * <p>
     * If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period equal to
     * or longer than the minimum retention period. If the job's retention period is shorter than that minimum retention
     * period, then the vault fails the backup or copy job, and you should either modify your lifecycle settings or use
     * a different vault. Recovery points already stored in the vault prior to Vault Lock are not affected.
     * </p>
     * 
     * @return The Backup Vault Lock setting that specifies the minimum retention period that the vault retains its
     *         recovery points. If this parameter is not specified, Vault Lock does not enforce a minimum retention
     *         period.</p>
     *         <p>
     *         If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period
     *         equal to or longer than the minimum retention period. If the job's retention period is shorter than that
     *         minimum retention period, then the vault fails the backup or copy job, and you should either modify your
     *         lifecycle settings or use a different vault. Recovery points already stored in the vault prior to Vault
     *         Lock are not affected.
     */

    public Long getMinRetentionDays() {
        return this.minRetentionDays;
    }

    /**
     * <p>
     * The Backup Vault Lock setting that specifies the minimum retention period that the vault retains its recovery
     * points. If this parameter is not specified, Vault Lock does not enforce a minimum retention period.
     * </p>
     * <p>
     * If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period equal to
     * or longer than the minimum retention period. If the job's retention period is shorter than that minimum retention
     * period, then the vault fails the backup or copy job, and you should either modify your lifecycle settings or use
     * a different vault. Recovery points already stored in the vault prior to Vault Lock are not affected.
     * </p>
     * 
     * @param minRetentionDays
     *        The Backup Vault Lock setting that specifies the minimum retention period that the vault retains its
     *        recovery points. If this parameter is not specified, Vault Lock does not enforce a minimum retention
     *        period.</p>
     *        <p>
     *        If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period
     *        equal to or longer than the minimum retention period. If the job's retention period is shorter than that
     *        minimum retention period, then the vault fails the backup or copy job, and you should either modify your
     *        lifecycle settings or use a different vault. Recovery points already stored in the vault prior to Vault
     *        Lock are not affected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupVaultResult withMinRetentionDays(Long minRetentionDays) {
        setMinRetentionDays(minRetentionDays);
        return this;
    }

    /**
     * <p>
     * The Backup Vault Lock setting that specifies the maximum retention period that the vault retains its recovery
     * points. If this parameter is not specified, Vault Lock does not enforce a maximum retention period on the
     * recovery points in the vault (allowing indefinite storage).
     * </p>
     * <p>
     * If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period equal to
     * or shorter than the maximum retention period. If the job's retention period is longer than that maximum retention
     * period, then the vault fails the backup or copy job, and you should either modify your lifecycle settings or use
     * a different vault. Recovery points already stored in the vault prior to Vault Lock are not affected.
     * </p>
     * 
     * @param maxRetentionDays
     *        The Backup Vault Lock setting that specifies the maximum retention period that the vault retains its
     *        recovery points. If this parameter is not specified, Vault Lock does not enforce a maximum retention
     *        period on the recovery points in the vault (allowing indefinite storage).</p>
     *        <p>
     *        If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period
     *        equal to or shorter than the maximum retention period. If the job's retention period is longer than that
     *        maximum retention period, then the vault fails the backup or copy job, and you should either modify your
     *        lifecycle settings or use a different vault. Recovery points already stored in the vault prior to Vault
     *        Lock are not affected.
     */

    public void setMaxRetentionDays(Long maxRetentionDays) {
        this.maxRetentionDays = maxRetentionDays;
    }

    /**
     * <p>
     * The Backup Vault Lock setting that specifies the maximum retention period that the vault retains its recovery
     * points. If this parameter is not specified, Vault Lock does not enforce a maximum retention period on the
     * recovery points in the vault (allowing indefinite storage).
     * </p>
     * <p>
     * If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period equal to
     * or shorter than the maximum retention period. If the job's retention period is longer than that maximum retention
     * period, then the vault fails the backup or copy job, and you should either modify your lifecycle settings or use
     * a different vault. Recovery points already stored in the vault prior to Vault Lock are not affected.
     * </p>
     * 
     * @return The Backup Vault Lock setting that specifies the maximum retention period that the vault retains its
     *         recovery points. If this parameter is not specified, Vault Lock does not enforce a maximum retention
     *         period on the recovery points in the vault (allowing indefinite storage).</p>
     *         <p>
     *         If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period
     *         equal to or shorter than the maximum retention period. If the job's retention period is longer than that
     *         maximum retention period, then the vault fails the backup or copy job, and you should either modify your
     *         lifecycle settings or use a different vault. Recovery points already stored in the vault prior to Vault
     *         Lock are not affected.
     */

    public Long getMaxRetentionDays() {
        return this.maxRetentionDays;
    }

    /**
     * <p>
     * The Backup Vault Lock setting that specifies the maximum retention period that the vault retains its recovery
     * points. If this parameter is not specified, Vault Lock does not enforce a maximum retention period on the
     * recovery points in the vault (allowing indefinite storage).
     * </p>
     * <p>
     * If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period equal to
     * or shorter than the maximum retention period. If the job's retention period is longer than that maximum retention
     * period, then the vault fails the backup or copy job, and you should either modify your lifecycle settings or use
     * a different vault. Recovery points already stored in the vault prior to Vault Lock are not affected.
     * </p>
     * 
     * @param maxRetentionDays
     *        The Backup Vault Lock setting that specifies the maximum retention period that the vault retains its
     *        recovery points. If this parameter is not specified, Vault Lock does not enforce a maximum retention
     *        period on the recovery points in the vault (allowing indefinite storage).</p>
     *        <p>
     *        If specified, any backup or copy job to the vault must have a lifecycle policy with a retention period
     *        equal to or shorter than the maximum retention period. If the job's retention period is longer than that
     *        maximum retention period, then the vault fails the backup or copy job, and you should either modify your
     *        lifecycle settings or use a different vault. Recovery points already stored in the vault prior to Vault
     *        Lock are not affected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupVaultResult withMaxRetentionDays(Long maxRetentionDays) {
        setMaxRetentionDays(maxRetentionDays);
        return this;
    }

    /**
     * <p>
     * The date and time when Backup Vault Lock configuration cannot be changed or deleted.
     * </p>
     * <p>
     * If you applied Vault Lock to your vault without specifying a lock date, you can change any of your Vault Lock
     * settings, or delete Vault Lock from the vault entirely, at any time.
     * </p>
     * <p>
     * This value is in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lockDate
     *        The date and time when Backup Vault Lock configuration cannot be changed or deleted.</p>
     *        <p>
     *        If you applied Vault Lock to your vault without specifying a lock date, you can change any of your Vault
     *        Lock settings, or delete Vault Lock from the vault entirely, at any time.
     *        </p>
     *        <p>
     *        This value is in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds. For example,
     *        the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setLockDate(java.util.Date lockDate) {
        this.lockDate = lockDate;
    }

    /**
     * <p>
     * The date and time when Backup Vault Lock configuration cannot be changed or deleted.
     * </p>
     * <p>
     * If you applied Vault Lock to your vault without specifying a lock date, you can change any of your Vault Lock
     * settings, or delete Vault Lock from the vault entirely, at any time.
     * </p>
     * <p>
     * This value is in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time when Backup Vault Lock configuration cannot be changed or deleted.</p>
     *         <p>
     *         If you applied Vault Lock to your vault without specifying a lock date, you can change any of your Vault
     *         Lock settings, or delete Vault Lock from the vault entirely, at any time.
     *         </p>
     *         <p>
     *         This value is in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds. For
     *         example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getLockDate() {
        return this.lockDate;
    }

    /**
     * <p>
     * The date and time when Backup Vault Lock configuration cannot be changed or deleted.
     * </p>
     * <p>
     * If you applied Vault Lock to your vault without specifying a lock date, you can change any of your Vault Lock
     * settings, or delete Vault Lock from the vault entirely, at any time.
     * </p>
     * <p>
     * This value is in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lockDate
     *        The date and time when Backup Vault Lock configuration cannot be changed or deleted.</p>
     *        <p>
     *        If you applied Vault Lock to your vault without specifying a lock date, you can change any of your Vault
     *        Lock settings, or delete Vault Lock from the vault entirely, at any time.
     *        </p>
     *        <p>
     *        This value is in Unix format, Coordinated Universal Time (UTC), and accurate to milliseconds. For example,
     *        the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupVaultResult withLockDate(java.util.Date lockDate) {
        setLockDate(lockDate);
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
        if (getBackupVaultName() != null)
            sb.append("BackupVaultName: ").append(getBackupVaultName()).append(",");
        if (getBackupVaultArn() != null)
            sb.append("BackupVaultArn: ").append(getBackupVaultArn()).append(",");
        if (getEncryptionKeyArn() != null)
            sb.append("EncryptionKeyArn: ").append(getEncryptionKeyArn()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: ").append(getCreatorRequestId()).append(",");
        if (getNumberOfRecoveryPoints() != null)
            sb.append("NumberOfRecoveryPoints: ").append(getNumberOfRecoveryPoints()).append(",");
        if (getLocked() != null)
            sb.append("Locked: ").append(getLocked()).append(",");
        if (getMinRetentionDays() != null)
            sb.append("MinRetentionDays: ").append(getMinRetentionDays()).append(",");
        if (getMaxRetentionDays() != null)
            sb.append("MaxRetentionDays: ").append(getMaxRetentionDays()).append(",");
        if (getLockDate() != null)
            sb.append("LockDate: ").append(getLockDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBackupVaultResult == false)
            return false;
        DescribeBackupVaultResult other = (DescribeBackupVaultResult) obj;
        if (other.getBackupVaultName() == null ^ this.getBackupVaultName() == null)
            return false;
        if (other.getBackupVaultName() != null && other.getBackupVaultName().equals(this.getBackupVaultName()) == false)
            return false;
        if (other.getBackupVaultArn() == null ^ this.getBackupVaultArn() == null)
            return false;
        if (other.getBackupVaultArn() != null && other.getBackupVaultArn().equals(this.getBackupVaultArn()) == false)
            return false;
        if (other.getEncryptionKeyArn() == null ^ this.getEncryptionKeyArn() == null)
            return false;
        if (other.getEncryptionKeyArn() != null && other.getEncryptionKeyArn().equals(this.getEncryptionKeyArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getNumberOfRecoveryPoints() == null ^ this.getNumberOfRecoveryPoints() == null)
            return false;
        if (other.getNumberOfRecoveryPoints() != null && other.getNumberOfRecoveryPoints().equals(this.getNumberOfRecoveryPoints()) == false)
            return false;
        if (other.getLocked() == null ^ this.getLocked() == null)
            return false;
        if (other.getLocked() != null && other.getLocked().equals(this.getLocked()) == false)
            return false;
        if (other.getMinRetentionDays() == null ^ this.getMinRetentionDays() == null)
            return false;
        if (other.getMinRetentionDays() != null && other.getMinRetentionDays().equals(this.getMinRetentionDays()) == false)
            return false;
        if (other.getMaxRetentionDays() == null ^ this.getMaxRetentionDays() == null)
            return false;
        if (other.getMaxRetentionDays() != null && other.getMaxRetentionDays().equals(this.getMaxRetentionDays()) == false)
            return false;
        if (other.getLockDate() == null ^ this.getLockDate() == null)
            return false;
        if (other.getLockDate() != null && other.getLockDate().equals(this.getLockDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupVaultName() == null) ? 0 : getBackupVaultName().hashCode());
        hashCode = prime * hashCode + ((getBackupVaultArn() == null) ? 0 : getBackupVaultArn().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKeyArn() == null) ? 0 : getEncryptionKeyArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode + ((getNumberOfRecoveryPoints() == null) ? 0 : getNumberOfRecoveryPoints().hashCode());
        hashCode = prime * hashCode + ((getLocked() == null) ? 0 : getLocked().hashCode());
        hashCode = prime * hashCode + ((getMinRetentionDays() == null) ? 0 : getMinRetentionDays().hashCode());
        hashCode = prime * hashCode + ((getMaxRetentionDays() == null) ? 0 : getMaxRetentionDays().hashCode());
        hashCode = prime * hashCode + ((getLockDate() == null) ? 0 : getLockDate().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBackupVaultResult clone() {
        try {
            return (DescribeBackupVaultResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
