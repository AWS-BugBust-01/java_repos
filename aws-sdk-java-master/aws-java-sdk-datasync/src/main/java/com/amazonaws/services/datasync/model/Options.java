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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the options that are available to control the behavior of a <a
 * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html">StartTaskExecution</a>
 * operation. Behavior includes preserving metadata such as user ID (UID), group ID (GID), and file permissions, and
 * also overwriting files in the destination, data integrity verification, and so on.
 * </p>
 * <p>
 * A task has a set of default options associated with it. If you don't specify an option in <a
 * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html">StartTaskExecution</a>, the
 * default value is used. You can override the defaults options on each task execution by specifying an overriding
 * <code>Options</code> value to <a
 * href="https://docs.aws.amazon.com/datasync/latest/userguide/API_StartTaskExecution.html">StartTaskExecution</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/Options" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Options implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A value that determines whether a data integrity verification should be performed at the end of a task execution
     * after all data and metadata have been transferred. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html">Configure task settings</a>.
     * </p>
     * <p>
     * Default value: POINT_IN_TIME_CONSISTENT.
     * </p>
     * <p>
     * ONLY_FILES_TRANSFERRED (recommended): Perform verification only on files that were transferred.
     * </p>
     * <p>
     * POINT_IN_TIME_CONSISTENT: Scan the entire source and entire destination at the end of the transfer to verify that
     * source and destination are fully synchronized. This option isn't supported when transferring to S3 Glacier or S3
     * Glacier Deep Archive storage classes.
     * </p>
     * <p>
     * NONE: No additional verification is done at the end of the transfer, but all data transmissions are
     * integrity-checked with checksum verification during the transfer.
     * </p>
     */
    private String verifyMode;
    /**
     * <p>
     * A value that determines whether files at the destination should be overwritten or preserved when copying files.
     * If set to <code>NEVER</code> a destination file will not be replaced by a source file, even if the destination
     * file differs from the source file. If you modify files in the destination and you sync the files, you can use
     * this value to protect against overwriting those changes.
     * </p>
     * <p>
     * Some storage classes have specific behaviors that can affect your S3 storage cost. For detailed information, see
     * <a href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes">
     * Considerations when working with Amazon S3 storage classes in DataSync </a> in the <i>DataSync User Guide</i>.
     * </p>
     */
    private String overwriteMode;
    /**
     * <p>
     * A file metadata value that shows the last time a file was accessed (that is, when the file was read or written
     * to). If you set <code>Atime</code> to BEST_EFFORT, DataSync attempts to preserve the original <code>Atime</code>
     * attribute on all source files (that is, the version before the PREPARING phase). However, <code>Atime</code>'s
     * behavior is not fully standard across platforms, so DataSync can only do this on a best-effort basis.
     * </p>
     * <p>
     * Default value: BEST_EFFORT.
     * </p>
     * <p>
     * BEST_EFFORT: Attempt to preserve the per-file <code>Atime</code> value (recommended).
     * </p>
     * <p>
     * NONE: Ignore <code>Atime</code>.
     * </p>
     * <note>
     * <p>
     * If <code>Atime</code> is set to BEST_EFFORT, <code>Mtime</code> must be set to PRESERVE.
     * </p>
     * <p>
     * If <code>Atime</code> is set to NONE, <code>Mtime</code> must also be NONE.
     * </p>
     * </note>
     */
    private String atime;
    /**
     * <p>
     * A value that indicates the last time that a file was modified (that is, a file was written to) before the
     * PREPARING phase. This option is required for cases when you need to run the same task more than one time.
     * </p>
     * <p>
     * Default value: PRESERVE.
     * </p>
     * <p>
     * PRESERVE: Preserve original <code>Mtime</code> (recommended)
     * </p>
     * <p>
     * NONE: Ignore <code>Mtime</code>.
     * </p>
     * <note>
     * <p>
     * If <code>Mtime</code> is set to PRESERVE, <code>Atime</code> must be set to BEST_EFFORT.
     * </p>
     * <p>
     * If <code>Mtime</code> is set to NONE, <code>Atime</code> must also be set to NONE.
     * </p>
     * </note>
     */
    private String mtime;
    /**
     * <p>
     * The POSIX user ID (UID) of the file's owner. This option should only be set for NFS, EFS, and S3 locations. To
     * learn more about what metadata is copied by DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata Copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: INT_VALUE. This preserves the integer value of the ID.
     * </p>
     * <p>
     * INT_VALUE: Preserve the integer value of UID and group ID (GID) (recommended).
     * </p>
     * <p>
     * NONE: Ignore UID and GID.
     * </p>
     */
    private String uid;
    /**
     * <p>
     * The POSIX group ID (GID) of the file's owners. This option should only be set for NFS, EFS, and S3 locations. For
     * more information about what metadata is copied by DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata Copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: INT_VALUE. This preserves the integer value of the ID.
     * </p>
     * <p>
     * INT_VALUE: Preserve the integer value of user ID (UID) and GID (recommended).
     * </p>
     * <p>
     * NONE: Ignore UID and GID.
     * </p>
     */
    private String gid;
    /**
     * <p>
     * A value that specifies whether files in the destination that don't exist in the source file system should be
     * preserved. This option can affect your storage cost. If your task deletes objects, you might incur minimum
     * storage duration charges for certain storage classes. For detailed information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Considerations when working with Amazon S3 storage classes in DataSync </a> in the <i>DataSync User Guide</i>.
     * </p>
     * <p>
     * Default value: PRESERVE.
     * </p>
     * <p>
     * PRESERVE: Ignore such destination files (recommended).
     * </p>
     * <p>
     * REMOVE: Delete destination files that aren’t present in the source.
     * </p>
     */
    private String preserveDeletedFiles;
    /**
     * <p>
     * A value that determines whether DataSync should preserve the metadata of block and character devices in the
     * source file system, and re-create the files with that device name and metadata on the destination. DataSync does
     * not copy the contents of such devices, only the name and metadata.
     * </p>
     * <note>
     * <p>
     * DataSync can't sync the actual contents of such devices, because they are nonterminal and don't return an
     * end-of-file (EOF) marker.
     * </p>
     * </note>
     * <p>
     * Default value: NONE.
     * </p>
     * <p>
     * NONE: Ignore special devices (recommended).
     * </p>
     * <p>
     * PRESERVE: Preserve character and block device metadata. This option isn't currently supported for Amazon EFS.
     * </p>
     */
    private String preserveDevices;
    /**
     * <p>
     * A value that determines which users or groups can access a file for a specific purpose such as reading, writing,
     * or execution of the file. This option should only be set for NFS, EFS, and S3 locations. For more information
     * about what metadata is copied by DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata Copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: PRESERVE.
     * </p>
     * <p>
     * PRESERVE: Preserve POSIX-style permissions (recommended).
     * </p>
     * <p>
     * NONE: Ignore permissions.
     * </p>
     * <note>
     * <p>
     * DataSync can preserve extant permissions of a source location.
     * </p>
     * </note>
     */
    private String posixPermissions;
    /**
     * <p>
     * A value that limits the bandwidth used by DataSync. For example, if you want DataSync to use a maximum of 1 MB,
     * set this value to <code>1048576</code> (<code>=1024*1024</code>).
     * </p>
     */
    private Long bytesPerSecond;
    /**
     * <p>
     * A value that determines whether tasks should be queued before executing the tasks. If set to <code>ENABLED</code>
     * , the tasks will be queued. The default is <code>ENABLED</code>.
     * </p>
     * <p>
     * If you use the same agent to run multiple tasks, you can enable the tasks to run in series. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#queue-task-execution">Queueing
     * task executions</a>.
     * </p>
     */
    private String taskQueueing;
    /**
     * <p>
     * A value that determines the type of logs that DataSync publishes to a log stream in the Amazon CloudWatch log
     * group that you provide. For more information about providing a log group for DataSync, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     * >CloudWatchLogGroupArn</a>. If set to <code>OFF</code>, no logs are published. <code>BASIC</code> publishes logs
     * on errors for individual files transferred, and <code>TRANSFER</code> publishes logs for every file or object
     * that is transferred and integrity checked.
     * </p>
     */
    private String logLevel;
    /**
     * <p>
     * A value that determines whether DataSync transfers only the data and metadata that differ between the source and
     * the destination location, or whether DataSync transfers all the content from the source, without comparing to the
     * destination location.
     * </p>
     * <p>
     * CHANGED: DataSync copies only data or metadata that is new or different content from the source location to the
     * destination location.
     * </p>
     * <p>
     * ALL: DataSync copies all source location content to the destination, without comparing to existing content on the
     * destination.
     * </p>
     */
    private String transferMode;
    /**
     * <p>
     * A value that determines which components of the SMB security descriptor are copied from source to destination
     * objects.
     * </p>
     * <p>
     * This value is only used for transfers between SMB and Amazon FSx for Windows File Server locations, or between
     * two Amazon FSx for Windows File Server locations. For more information about how DataSync handles metadata, see
     * <a href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html">How DataSync Handles Metadata
     * and Special Files</a>.
     * </p>
     * <p>
     * Default value: OWNER_DACL.
     * </p>
     * <p>
     * <b>OWNER_DACL</b>: For each copied object, DataSync copies the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Object owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When choosing this option, DataSync does NOT copy the NTFS system access control lists (SACLs), which are used by
     * administrators to log attempts to access a secured object.
     * </p>
     * <p>
     * <b>OWNER_DACL_SACL</b>: For each copied object, DataSync copies the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Object owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS system access control lists (SACLs), which are used by administrators to log attempts to access a secured
     * object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Copying SACLs requires granting additional permissions to the Windows user that DataSync uses to access your SMB
     * location. For information about choosing a user that ensures sufficient permissions to files, folders, and
     * metadata, see <a href="create-smb-location.html#SMBuser">user</a>.
     * </p>
     * <p>
     * <b>NONE</b>: None of the SMB security descriptor components are copied. Destination objects are owned by the user
     * that was provided for accessing the destination location. DACLs and SACLs are set based on the destination
     * server’s configuration.
     * </p>
     */
    private String securityDescriptorCopyFlags;

    /**
     * <p>
     * A value that determines whether a data integrity verification should be performed at the end of a task execution
     * after all data and metadata have been transferred. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html">Configure task settings</a>.
     * </p>
     * <p>
     * Default value: POINT_IN_TIME_CONSISTENT.
     * </p>
     * <p>
     * ONLY_FILES_TRANSFERRED (recommended): Perform verification only on files that were transferred.
     * </p>
     * <p>
     * POINT_IN_TIME_CONSISTENT: Scan the entire source and entire destination at the end of the transfer to verify that
     * source and destination are fully synchronized. This option isn't supported when transferring to S3 Glacier or S3
     * Glacier Deep Archive storage classes.
     * </p>
     * <p>
     * NONE: No additional verification is done at the end of the transfer, but all data transmissions are
     * integrity-checked with checksum verification during the transfer.
     * </p>
     * 
     * @param verifyMode
     *        A value that determines whether a data integrity verification should be performed at the end of a task
     *        execution after all data and metadata have been transferred. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html">Configure task settings</a>.
     *        </p>
     *        <p>
     *        Default value: POINT_IN_TIME_CONSISTENT.
     *        </p>
     *        <p>
     *        ONLY_FILES_TRANSFERRED (recommended): Perform verification only on files that were transferred.
     *        </p>
     *        <p>
     *        POINT_IN_TIME_CONSISTENT: Scan the entire source and entire destination at the end of the transfer to
     *        verify that source and destination are fully synchronized. This option isn't supported when transferring
     *        to S3 Glacier or S3 Glacier Deep Archive storage classes.
     *        </p>
     *        <p>
     *        NONE: No additional verification is done at the end of the transfer, but all data transmissions are
     *        integrity-checked with checksum verification during the transfer.
     * @see VerifyMode
     */

    public void setVerifyMode(String verifyMode) {
        this.verifyMode = verifyMode;
    }

    /**
     * <p>
     * A value that determines whether a data integrity verification should be performed at the end of a task execution
     * after all data and metadata have been transferred. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html">Configure task settings</a>.
     * </p>
     * <p>
     * Default value: POINT_IN_TIME_CONSISTENT.
     * </p>
     * <p>
     * ONLY_FILES_TRANSFERRED (recommended): Perform verification only on files that were transferred.
     * </p>
     * <p>
     * POINT_IN_TIME_CONSISTENT: Scan the entire source and entire destination at the end of the transfer to verify that
     * source and destination are fully synchronized. This option isn't supported when transferring to S3 Glacier or S3
     * Glacier Deep Archive storage classes.
     * </p>
     * <p>
     * NONE: No additional verification is done at the end of the transfer, but all data transmissions are
     * integrity-checked with checksum verification during the transfer.
     * </p>
     * 
     * @return A value that determines whether a data integrity verification should be performed at the end of a task
     *         execution after all data and metadata have been transferred. For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html">Configure task
     *         settings</a>. </p>
     *         <p>
     *         Default value: POINT_IN_TIME_CONSISTENT.
     *         </p>
     *         <p>
     *         ONLY_FILES_TRANSFERRED (recommended): Perform verification only on files that were transferred.
     *         </p>
     *         <p>
     *         POINT_IN_TIME_CONSISTENT: Scan the entire source and entire destination at the end of the transfer to
     *         verify that source and destination are fully synchronized. This option isn't supported when transferring
     *         to S3 Glacier or S3 Glacier Deep Archive storage classes.
     *         </p>
     *         <p>
     *         NONE: No additional verification is done at the end of the transfer, but all data transmissions are
     *         integrity-checked with checksum verification during the transfer.
     * @see VerifyMode
     */

    public String getVerifyMode() {
        return this.verifyMode;
    }

    /**
     * <p>
     * A value that determines whether a data integrity verification should be performed at the end of a task execution
     * after all data and metadata have been transferred. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html">Configure task settings</a>.
     * </p>
     * <p>
     * Default value: POINT_IN_TIME_CONSISTENT.
     * </p>
     * <p>
     * ONLY_FILES_TRANSFERRED (recommended): Perform verification only on files that were transferred.
     * </p>
     * <p>
     * POINT_IN_TIME_CONSISTENT: Scan the entire source and entire destination at the end of the transfer to verify that
     * source and destination are fully synchronized. This option isn't supported when transferring to S3 Glacier or S3
     * Glacier Deep Archive storage classes.
     * </p>
     * <p>
     * NONE: No additional verification is done at the end of the transfer, but all data transmissions are
     * integrity-checked with checksum verification during the transfer.
     * </p>
     * 
     * @param verifyMode
     *        A value that determines whether a data integrity verification should be performed at the end of a task
     *        execution after all data and metadata have been transferred. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html">Configure task settings</a>.
     *        </p>
     *        <p>
     *        Default value: POINT_IN_TIME_CONSISTENT.
     *        </p>
     *        <p>
     *        ONLY_FILES_TRANSFERRED (recommended): Perform verification only on files that were transferred.
     *        </p>
     *        <p>
     *        POINT_IN_TIME_CONSISTENT: Scan the entire source and entire destination at the end of the transfer to
     *        verify that source and destination are fully synchronized. This option isn't supported when transferring
     *        to S3 Glacier or S3 Glacier Deep Archive storage classes.
     *        </p>
     *        <p>
     *        NONE: No additional verification is done at the end of the transfer, but all data transmissions are
     *        integrity-checked with checksum verification during the transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifyMode
     */

    public Options withVerifyMode(String verifyMode) {
        setVerifyMode(verifyMode);
        return this;
    }

    /**
     * <p>
     * A value that determines whether a data integrity verification should be performed at the end of a task execution
     * after all data and metadata have been transferred. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html">Configure task settings</a>.
     * </p>
     * <p>
     * Default value: POINT_IN_TIME_CONSISTENT.
     * </p>
     * <p>
     * ONLY_FILES_TRANSFERRED (recommended): Perform verification only on files that were transferred.
     * </p>
     * <p>
     * POINT_IN_TIME_CONSISTENT: Scan the entire source and entire destination at the end of the transfer to verify that
     * source and destination are fully synchronized. This option isn't supported when transferring to S3 Glacier or S3
     * Glacier Deep Archive storage classes.
     * </p>
     * <p>
     * NONE: No additional verification is done at the end of the transfer, but all data transmissions are
     * integrity-checked with checksum verification during the transfer.
     * </p>
     * 
     * @param verifyMode
     *        A value that determines whether a data integrity verification should be performed at the end of a task
     *        execution after all data and metadata have been transferred. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/create-task.html">Configure task settings</a>.
     *        </p>
     *        <p>
     *        Default value: POINT_IN_TIME_CONSISTENT.
     *        </p>
     *        <p>
     *        ONLY_FILES_TRANSFERRED (recommended): Perform verification only on files that were transferred.
     *        </p>
     *        <p>
     *        POINT_IN_TIME_CONSISTENT: Scan the entire source and entire destination at the end of the transfer to
     *        verify that source and destination are fully synchronized. This option isn't supported when transferring
     *        to S3 Glacier or S3 Glacier Deep Archive storage classes.
     *        </p>
     *        <p>
     *        NONE: No additional verification is done at the end of the transfer, but all data transmissions are
     *        integrity-checked with checksum verification during the transfer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerifyMode
     */

    public Options withVerifyMode(VerifyMode verifyMode) {
        this.verifyMode = verifyMode.toString();
        return this;
    }

    /**
     * <p>
     * A value that determines whether files at the destination should be overwritten or preserved when copying files.
     * If set to <code>NEVER</code> a destination file will not be replaced by a source file, even if the destination
     * file differs from the source file. If you modify files in the destination and you sync the files, you can use
     * this value to protect against overwriting those changes.
     * </p>
     * <p>
     * Some storage classes have specific behaviors that can affect your S3 storage cost. For detailed information, see
     * <a href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes">
     * Considerations when working with Amazon S3 storage classes in DataSync </a> in the <i>DataSync User Guide</i>.
     * </p>
     * 
     * @param overwriteMode
     *        A value that determines whether files at the destination should be overwritten or preserved when copying
     *        files. If set to <code>NEVER</code> a destination file will not be replaced by a source file, even if the
     *        destination file differs from the source file. If you modify files in the destination and you sync the
     *        files, you can use this value to protect against overwriting those changes. </p>
     *        <p>
     *        Some storage classes have specific behaviors that can affect your S3 storage cost. For detailed
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Considerations when working with Amazon S3 storage classes in DataSync </a> in the <i>DataSync User
     *        Guide</i>.
     * @see OverwriteMode
     */

    public void setOverwriteMode(String overwriteMode) {
        this.overwriteMode = overwriteMode;
    }

    /**
     * <p>
     * A value that determines whether files at the destination should be overwritten or preserved when copying files.
     * If set to <code>NEVER</code> a destination file will not be replaced by a source file, even if the destination
     * file differs from the source file. If you modify files in the destination and you sync the files, you can use
     * this value to protect against overwriting those changes.
     * </p>
     * <p>
     * Some storage classes have specific behaviors that can affect your S3 storage cost. For detailed information, see
     * <a href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes">
     * Considerations when working with Amazon S3 storage classes in DataSync </a> in the <i>DataSync User Guide</i>.
     * </p>
     * 
     * @return A value that determines whether files at the destination should be overwritten or preserved when copying
     *         files. If set to <code>NEVER</code> a destination file will not be replaced by a source file, even if the
     *         destination file differs from the source file. If you modify files in the destination and you sync the
     *         files, you can use this value to protect against overwriting those changes. </p>
     *         <p>
     *         Some storage classes have specific behaviors that can affect your S3 storage cost. For detailed
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *         >Considerations when working with Amazon S3 storage classes in DataSync </a> in the <i>DataSync User
     *         Guide</i>.
     * @see OverwriteMode
     */

    public String getOverwriteMode() {
        return this.overwriteMode;
    }

    /**
     * <p>
     * A value that determines whether files at the destination should be overwritten or preserved when copying files.
     * If set to <code>NEVER</code> a destination file will not be replaced by a source file, even if the destination
     * file differs from the source file. If you modify files in the destination and you sync the files, you can use
     * this value to protect against overwriting those changes.
     * </p>
     * <p>
     * Some storage classes have specific behaviors that can affect your S3 storage cost. For detailed information, see
     * <a href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes">
     * Considerations when working with Amazon S3 storage classes in DataSync </a> in the <i>DataSync User Guide</i>.
     * </p>
     * 
     * @param overwriteMode
     *        A value that determines whether files at the destination should be overwritten or preserved when copying
     *        files. If set to <code>NEVER</code> a destination file will not be replaced by a source file, even if the
     *        destination file differs from the source file. If you modify files in the destination and you sync the
     *        files, you can use this value to protect against overwriting those changes. </p>
     *        <p>
     *        Some storage classes have specific behaviors that can affect your S3 storage cost. For detailed
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Considerations when working with Amazon S3 storage classes in DataSync </a> in the <i>DataSync User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OverwriteMode
     */

    public Options withOverwriteMode(String overwriteMode) {
        setOverwriteMode(overwriteMode);
        return this;
    }

    /**
     * <p>
     * A value that determines whether files at the destination should be overwritten or preserved when copying files.
     * If set to <code>NEVER</code> a destination file will not be replaced by a source file, even if the destination
     * file differs from the source file. If you modify files in the destination and you sync the files, you can use
     * this value to protect against overwriting those changes.
     * </p>
     * <p>
     * Some storage classes have specific behaviors that can affect your S3 storage cost. For detailed information, see
     * <a href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes">
     * Considerations when working with Amazon S3 storage classes in DataSync </a> in the <i>DataSync User Guide</i>.
     * </p>
     * 
     * @param overwriteMode
     *        A value that determines whether files at the destination should be overwritten or preserved when copying
     *        files. If set to <code>NEVER</code> a destination file will not be replaced by a source file, even if the
     *        destination file differs from the source file. If you modify files in the destination and you sync the
     *        files, you can use this value to protect against overwriting those changes. </p>
     *        <p>
     *        Some storage classes have specific behaviors that can affect your S3 storage cost. For detailed
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Considerations when working with Amazon S3 storage classes in DataSync </a> in the <i>DataSync User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OverwriteMode
     */

    public Options withOverwriteMode(OverwriteMode overwriteMode) {
        this.overwriteMode = overwriteMode.toString();
        return this;
    }

    /**
     * <p>
     * A file metadata value that shows the last time a file was accessed (that is, when the file was read or written
     * to). If you set <code>Atime</code> to BEST_EFFORT, DataSync attempts to preserve the original <code>Atime</code>
     * attribute on all source files (that is, the version before the PREPARING phase). However, <code>Atime</code>'s
     * behavior is not fully standard across platforms, so DataSync can only do this on a best-effort basis.
     * </p>
     * <p>
     * Default value: BEST_EFFORT.
     * </p>
     * <p>
     * BEST_EFFORT: Attempt to preserve the per-file <code>Atime</code> value (recommended).
     * </p>
     * <p>
     * NONE: Ignore <code>Atime</code>.
     * </p>
     * <note>
     * <p>
     * If <code>Atime</code> is set to BEST_EFFORT, <code>Mtime</code> must be set to PRESERVE.
     * </p>
     * <p>
     * If <code>Atime</code> is set to NONE, <code>Mtime</code> must also be NONE.
     * </p>
     * </note>
     * 
     * @param atime
     *        A file metadata value that shows the last time a file was accessed (that is, when the file was read or
     *        written to). If you set <code>Atime</code> to BEST_EFFORT, DataSync attempts to preserve the original
     *        <code>Atime</code> attribute on all source files (that is, the version before the PREPARING phase).
     *        However, <code>Atime</code>'s behavior is not fully standard across platforms, so DataSync can only do
     *        this on a best-effort basis. </p>
     *        <p>
     *        Default value: BEST_EFFORT.
     *        </p>
     *        <p>
     *        BEST_EFFORT: Attempt to preserve the per-file <code>Atime</code> value (recommended).
     *        </p>
     *        <p>
     *        NONE: Ignore <code>Atime</code>.
     *        </p>
     *        <note>
     *        <p>
     *        If <code>Atime</code> is set to BEST_EFFORT, <code>Mtime</code> must be set to PRESERVE.
     *        </p>
     *        <p>
     *        If <code>Atime</code> is set to NONE, <code>Mtime</code> must also be NONE.
     *        </p>
     * @see Atime
     */

    public void setAtime(String atime) {
        this.atime = atime;
    }

    /**
     * <p>
     * A file metadata value that shows the last time a file was accessed (that is, when the file was read or written
     * to). If you set <code>Atime</code> to BEST_EFFORT, DataSync attempts to preserve the original <code>Atime</code>
     * attribute on all source files (that is, the version before the PREPARING phase). However, <code>Atime</code>'s
     * behavior is not fully standard across platforms, so DataSync can only do this on a best-effort basis.
     * </p>
     * <p>
     * Default value: BEST_EFFORT.
     * </p>
     * <p>
     * BEST_EFFORT: Attempt to preserve the per-file <code>Atime</code> value (recommended).
     * </p>
     * <p>
     * NONE: Ignore <code>Atime</code>.
     * </p>
     * <note>
     * <p>
     * If <code>Atime</code> is set to BEST_EFFORT, <code>Mtime</code> must be set to PRESERVE.
     * </p>
     * <p>
     * If <code>Atime</code> is set to NONE, <code>Mtime</code> must also be NONE.
     * </p>
     * </note>
     * 
     * @return A file metadata value that shows the last time a file was accessed (that is, when the file was read or
     *         written to). If you set <code>Atime</code> to BEST_EFFORT, DataSync attempts to preserve the original
     *         <code>Atime</code> attribute on all source files (that is, the version before the PREPARING phase).
     *         However, <code>Atime</code>'s behavior is not fully standard across platforms, so DataSync can only do
     *         this on a best-effort basis. </p>
     *         <p>
     *         Default value: BEST_EFFORT.
     *         </p>
     *         <p>
     *         BEST_EFFORT: Attempt to preserve the per-file <code>Atime</code> value (recommended).
     *         </p>
     *         <p>
     *         NONE: Ignore <code>Atime</code>.
     *         </p>
     *         <note>
     *         <p>
     *         If <code>Atime</code> is set to BEST_EFFORT, <code>Mtime</code> must be set to PRESERVE.
     *         </p>
     *         <p>
     *         If <code>Atime</code> is set to NONE, <code>Mtime</code> must also be NONE.
     *         </p>
     * @see Atime
     */

    public String getAtime() {
        return this.atime;
    }

    /**
     * <p>
     * A file metadata value that shows the last time a file was accessed (that is, when the file was read or written
     * to). If you set <code>Atime</code> to BEST_EFFORT, DataSync attempts to preserve the original <code>Atime</code>
     * attribute on all source files (that is, the version before the PREPARING phase). However, <code>Atime</code>'s
     * behavior is not fully standard across platforms, so DataSync can only do this on a best-effort basis.
     * </p>
     * <p>
     * Default value: BEST_EFFORT.
     * </p>
     * <p>
     * BEST_EFFORT: Attempt to preserve the per-file <code>Atime</code> value (recommended).
     * </p>
     * <p>
     * NONE: Ignore <code>Atime</code>.
     * </p>
     * <note>
     * <p>
     * If <code>Atime</code> is set to BEST_EFFORT, <code>Mtime</code> must be set to PRESERVE.
     * </p>
     * <p>
     * If <code>Atime</code> is set to NONE, <code>Mtime</code> must also be NONE.
     * </p>
     * </note>
     * 
     * @param atime
     *        A file metadata value that shows the last time a file was accessed (that is, when the file was read or
     *        written to). If you set <code>Atime</code> to BEST_EFFORT, DataSync attempts to preserve the original
     *        <code>Atime</code> attribute on all source files (that is, the version before the PREPARING phase).
     *        However, <code>Atime</code>'s behavior is not fully standard across platforms, so DataSync can only do
     *        this on a best-effort basis. </p>
     *        <p>
     *        Default value: BEST_EFFORT.
     *        </p>
     *        <p>
     *        BEST_EFFORT: Attempt to preserve the per-file <code>Atime</code> value (recommended).
     *        </p>
     *        <p>
     *        NONE: Ignore <code>Atime</code>.
     *        </p>
     *        <note>
     *        <p>
     *        If <code>Atime</code> is set to BEST_EFFORT, <code>Mtime</code> must be set to PRESERVE.
     *        </p>
     *        <p>
     *        If <code>Atime</code> is set to NONE, <code>Mtime</code> must also be NONE.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Atime
     */

    public Options withAtime(String atime) {
        setAtime(atime);
        return this;
    }

    /**
     * <p>
     * A file metadata value that shows the last time a file was accessed (that is, when the file was read or written
     * to). If you set <code>Atime</code> to BEST_EFFORT, DataSync attempts to preserve the original <code>Atime</code>
     * attribute on all source files (that is, the version before the PREPARING phase). However, <code>Atime</code>'s
     * behavior is not fully standard across platforms, so DataSync can only do this on a best-effort basis.
     * </p>
     * <p>
     * Default value: BEST_EFFORT.
     * </p>
     * <p>
     * BEST_EFFORT: Attempt to preserve the per-file <code>Atime</code> value (recommended).
     * </p>
     * <p>
     * NONE: Ignore <code>Atime</code>.
     * </p>
     * <note>
     * <p>
     * If <code>Atime</code> is set to BEST_EFFORT, <code>Mtime</code> must be set to PRESERVE.
     * </p>
     * <p>
     * If <code>Atime</code> is set to NONE, <code>Mtime</code> must also be NONE.
     * </p>
     * </note>
     * 
     * @param atime
     *        A file metadata value that shows the last time a file was accessed (that is, when the file was read or
     *        written to). If you set <code>Atime</code> to BEST_EFFORT, DataSync attempts to preserve the original
     *        <code>Atime</code> attribute on all source files (that is, the version before the PREPARING phase).
     *        However, <code>Atime</code>'s behavior is not fully standard across platforms, so DataSync can only do
     *        this on a best-effort basis. </p>
     *        <p>
     *        Default value: BEST_EFFORT.
     *        </p>
     *        <p>
     *        BEST_EFFORT: Attempt to preserve the per-file <code>Atime</code> value (recommended).
     *        </p>
     *        <p>
     *        NONE: Ignore <code>Atime</code>.
     *        </p>
     *        <note>
     *        <p>
     *        If <code>Atime</code> is set to BEST_EFFORT, <code>Mtime</code> must be set to PRESERVE.
     *        </p>
     *        <p>
     *        If <code>Atime</code> is set to NONE, <code>Mtime</code> must also be NONE.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Atime
     */

    public Options withAtime(Atime atime) {
        this.atime = atime.toString();
        return this;
    }

    /**
     * <p>
     * A value that indicates the last time that a file was modified (that is, a file was written to) before the
     * PREPARING phase. This option is required for cases when you need to run the same task more than one time.
     * </p>
     * <p>
     * Default value: PRESERVE.
     * </p>
     * <p>
     * PRESERVE: Preserve original <code>Mtime</code> (recommended)
     * </p>
     * <p>
     * NONE: Ignore <code>Mtime</code>.
     * </p>
     * <note>
     * <p>
     * If <code>Mtime</code> is set to PRESERVE, <code>Atime</code> must be set to BEST_EFFORT.
     * </p>
     * <p>
     * If <code>Mtime</code> is set to NONE, <code>Atime</code> must also be set to NONE.
     * </p>
     * </note>
     * 
     * @param mtime
     *        A value that indicates the last time that a file was modified (that is, a file was written to) before the
     *        PREPARING phase. This option is required for cases when you need to run the same task more than one time.
     *        </p>
     *        <p>
     *        Default value: PRESERVE.
     *        </p>
     *        <p>
     *        PRESERVE: Preserve original <code>Mtime</code> (recommended)
     *        </p>
     *        <p>
     *        NONE: Ignore <code>Mtime</code>.
     *        </p>
     *        <note>
     *        <p>
     *        If <code>Mtime</code> is set to PRESERVE, <code>Atime</code> must be set to BEST_EFFORT.
     *        </p>
     *        <p>
     *        If <code>Mtime</code> is set to NONE, <code>Atime</code> must also be set to NONE.
     *        </p>
     * @see Mtime
     */

    public void setMtime(String mtime) {
        this.mtime = mtime;
    }

    /**
     * <p>
     * A value that indicates the last time that a file was modified (that is, a file was written to) before the
     * PREPARING phase. This option is required for cases when you need to run the same task more than one time.
     * </p>
     * <p>
     * Default value: PRESERVE.
     * </p>
     * <p>
     * PRESERVE: Preserve original <code>Mtime</code> (recommended)
     * </p>
     * <p>
     * NONE: Ignore <code>Mtime</code>.
     * </p>
     * <note>
     * <p>
     * If <code>Mtime</code> is set to PRESERVE, <code>Atime</code> must be set to BEST_EFFORT.
     * </p>
     * <p>
     * If <code>Mtime</code> is set to NONE, <code>Atime</code> must also be set to NONE.
     * </p>
     * </note>
     * 
     * @return A value that indicates the last time that a file was modified (that is, a file was written to) before the
     *         PREPARING phase. This option is required for cases when you need to run the same task more than one time.
     *         </p>
     *         <p>
     *         Default value: PRESERVE.
     *         </p>
     *         <p>
     *         PRESERVE: Preserve original <code>Mtime</code> (recommended)
     *         </p>
     *         <p>
     *         NONE: Ignore <code>Mtime</code>.
     *         </p>
     *         <note>
     *         <p>
     *         If <code>Mtime</code> is set to PRESERVE, <code>Atime</code> must be set to BEST_EFFORT.
     *         </p>
     *         <p>
     *         If <code>Mtime</code> is set to NONE, <code>Atime</code> must also be set to NONE.
     *         </p>
     * @see Mtime
     */

    public String getMtime() {
        return this.mtime;
    }

    /**
     * <p>
     * A value that indicates the last time that a file was modified (that is, a file was written to) before the
     * PREPARING phase. This option is required for cases when you need to run the same task more than one time.
     * </p>
     * <p>
     * Default value: PRESERVE.
     * </p>
     * <p>
     * PRESERVE: Preserve original <code>Mtime</code> (recommended)
     * </p>
     * <p>
     * NONE: Ignore <code>Mtime</code>.
     * </p>
     * <note>
     * <p>
     * If <code>Mtime</code> is set to PRESERVE, <code>Atime</code> must be set to BEST_EFFORT.
     * </p>
     * <p>
     * If <code>Mtime</code> is set to NONE, <code>Atime</code> must also be set to NONE.
     * </p>
     * </note>
     * 
     * @param mtime
     *        A value that indicates the last time that a file was modified (that is, a file was written to) before the
     *        PREPARING phase. This option is required for cases when you need to run the same task more than one time.
     *        </p>
     *        <p>
     *        Default value: PRESERVE.
     *        </p>
     *        <p>
     *        PRESERVE: Preserve original <code>Mtime</code> (recommended)
     *        </p>
     *        <p>
     *        NONE: Ignore <code>Mtime</code>.
     *        </p>
     *        <note>
     *        <p>
     *        If <code>Mtime</code> is set to PRESERVE, <code>Atime</code> must be set to BEST_EFFORT.
     *        </p>
     *        <p>
     *        If <code>Mtime</code> is set to NONE, <code>Atime</code> must also be set to NONE.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mtime
     */

    public Options withMtime(String mtime) {
        setMtime(mtime);
        return this;
    }

    /**
     * <p>
     * A value that indicates the last time that a file was modified (that is, a file was written to) before the
     * PREPARING phase. This option is required for cases when you need to run the same task more than one time.
     * </p>
     * <p>
     * Default value: PRESERVE.
     * </p>
     * <p>
     * PRESERVE: Preserve original <code>Mtime</code> (recommended)
     * </p>
     * <p>
     * NONE: Ignore <code>Mtime</code>.
     * </p>
     * <note>
     * <p>
     * If <code>Mtime</code> is set to PRESERVE, <code>Atime</code> must be set to BEST_EFFORT.
     * </p>
     * <p>
     * If <code>Mtime</code> is set to NONE, <code>Atime</code> must also be set to NONE.
     * </p>
     * </note>
     * 
     * @param mtime
     *        A value that indicates the last time that a file was modified (that is, a file was written to) before the
     *        PREPARING phase. This option is required for cases when you need to run the same task more than one time.
     *        </p>
     *        <p>
     *        Default value: PRESERVE.
     *        </p>
     *        <p>
     *        PRESERVE: Preserve original <code>Mtime</code> (recommended)
     *        </p>
     *        <p>
     *        NONE: Ignore <code>Mtime</code>.
     *        </p>
     *        <note>
     *        <p>
     *        If <code>Mtime</code> is set to PRESERVE, <code>Atime</code> must be set to BEST_EFFORT.
     *        </p>
     *        <p>
     *        If <code>Mtime</code> is set to NONE, <code>Atime</code> must also be set to NONE.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Mtime
     */

    public Options withMtime(Mtime mtime) {
        this.mtime = mtime.toString();
        return this;
    }

    /**
     * <p>
     * The POSIX user ID (UID) of the file's owner. This option should only be set for NFS, EFS, and S3 locations. To
     * learn more about what metadata is copied by DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata Copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: INT_VALUE. This preserves the integer value of the ID.
     * </p>
     * <p>
     * INT_VALUE: Preserve the integer value of UID and group ID (GID) (recommended).
     * </p>
     * <p>
     * NONE: Ignore UID and GID.
     * </p>
     * 
     * @param uid
     *        The POSIX user ID (UID) of the file's owner. This option should only be set for NFS, EFS, and S3
     *        locations. To learn more about what metadata is copied by DataSync, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        Copied by DataSync</a>.</p>
     *        <p>
     *        Default value: INT_VALUE. This preserves the integer value of the ID.
     *        </p>
     *        <p>
     *        INT_VALUE: Preserve the integer value of UID and group ID (GID) (recommended).
     *        </p>
     *        <p>
     *        NONE: Ignore UID and GID.
     * @see Uid
     */

    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * <p>
     * The POSIX user ID (UID) of the file's owner. This option should only be set for NFS, EFS, and S3 locations. To
     * learn more about what metadata is copied by DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata Copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: INT_VALUE. This preserves the integer value of the ID.
     * </p>
     * <p>
     * INT_VALUE: Preserve the integer value of UID and group ID (GID) (recommended).
     * </p>
     * <p>
     * NONE: Ignore UID and GID.
     * </p>
     * 
     * @return The POSIX user ID (UID) of the file's owner. This option should only be set for NFS, EFS, and S3
     *         locations. To learn more about what metadata is copied by DataSync, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *         Copied by DataSync</a>.</p>
     *         <p>
     *         Default value: INT_VALUE. This preserves the integer value of the ID.
     *         </p>
     *         <p>
     *         INT_VALUE: Preserve the integer value of UID and group ID (GID) (recommended).
     *         </p>
     *         <p>
     *         NONE: Ignore UID and GID.
     * @see Uid
     */

    public String getUid() {
        return this.uid;
    }

    /**
     * <p>
     * The POSIX user ID (UID) of the file's owner. This option should only be set for NFS, EFS, and S3 locations. To
     * learn more about what metadata is copied by DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata Copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: INT_VALUE. This preserves the integer value of the ID.
     * </p>
     * <p>
     * INT_VALUE: Preserve the integer value of UID and group ID (GID) (recommended).
     * </p>
     * <p>
     * NONE: Ignore UID and GID.
     * </p>
     * 
     * @param uid
     *        The POSIX user ID (UID) of the file's owner. This option should only be set for NFS, EFS, and S3
     *        locations. To learn more about what metadata is copied by DataSync, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        Copied by DataSync</a>.</p>
     *        <p>
     *        Default value: INT_VALUE. This preserves the integer value of the ID.
     *        </p>
     *        <p>
     *        INT_VALUE: Preserve the integer value of UID and group ID (GID) (recommended).
     *        </p>
     *        <p>
     *        NONE: Ignore UID and GID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Uid
     */

    public Options withUid(String uid) {
        setUid(uid);
        return this;
    }

    /**
     * <p>
     * The POSIX user ID (UID) of the file's owner. This option should only be set for NFS, EFS, and S3 locations. To
     * learn more about what metadata is copied by DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata Copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: INT_VALUE. This preserves the integer value of the ID.
     * </p>
     * <p>
     * INT_VALUE: Preserve the integer value of UID and group ID (GID) (recommended).
     * </p>
     * <p>
     * NONE: Ignore UID and GID.
     * </p>
     * 
     * @param uid
     *        The POSIX user ID (UID) of the file's owner. This option should only be set for NFS, EFS, and S3
     *        locations. To learn more about what metadata is copied by DataSync, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        Copied by DataSync</a>.</p>
     *        <p>
     *        Default value: INT_VALUE. This preserves the integer value of the ID.
     *        </p>
     *        <p>
     *        INT_VALUE: Preserve the integer value of UID and group ID (GID) (recommended).
     *        </p>
     *        <p>
     *        NONE: Ignore UID and GID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Uid
     */

    public Options withUid(Uid uid) {
        this.uid = uid.toString();
        return this;
    }

    /**
     * <p>
     * The POSIX group ID (GID) of the file's owners. This option should only be set for NFS, EFS, and S3 locations. For
     * more information about what metadata is copied by DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata Copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: INT_VALUE. This preserves the integer value of the ID.
     * </p>
     * <p>
     * INT_VALUE: Preserve the integer value of user ID (UID) and GID (recommended).
     * </p>
     * <p>
     * NONE: Ignore UID and GID.
     * </p>
     * 
     * @param gid
     *        The POSIX group ID (GID) of the file's owners. This option should only be set for NFS, EFS, and S3
     *        locations. For more information about what metadata is copied by DataSync, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        Copied by DataSync</a>. </p>
     *        <p>
     *        Default value: INT_VALUE. This preserves the integer value of the ID.
     *        </p>
     *        <p>
     *        INT_VALUE: Preserve the integer value of user ID (UID) and GID (recommended).
     *        </p>
     *        <p>
     *        NONE: Ignore UID and GID.
     * @see Gid
     */

    public void setGid(String gid) {
        this.gid = gid;
    }

    /**
     * <p>
     * The POSIX group ID (GID) of the file's owners. This option should only be set for NFS, EFS, and S3 locations. For
     * more information about what metadata is copied by DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata Copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: INT_VALUE. This preserves the integer value of the ID.
     * </p>
     * <p>
     * INT_VALUE: Preserve the integer value of user ID (UID) and GID (recommended).
     * </p>
     * <p>
     * NONE: Ignore UID and GID.
     * </p>
     * 
     * @return The POSIX group ID (GID) of the file's owners. This option should only be set for NFS, EFS, and S3
     *         locations. For more information about what metadata is copied by DataSync, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *         Copied by DataSync</a>. </p>
     *         <p>
     *         Default value: INT_VALUE. This preserves the integer value of the ID.
     *         </p>
     *         <p>
     *         INT_VALUE: Preserve the integer value of user ID (UID) and GID (recommended).
     *         </p>
     *         <p>
     *         NONE: Ignore UID and GID.
     * @see Gid
     */

    public String getGid() {
        return this.gid;
    }

    /**
     * <p>
     * The POSIX group ID (GID) of the file's owners. This option should only be set for NFS, EFS, and S3 locations. For
     * more information about what metadata is copied by DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata Copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: INT_VALUE. This preserves the integer value of the ID.
     * </p>
     * <p>
     * INT_VALUE: Preserve the integer value of user ID (UID) and GID (recommended).
     * </p>
     * <p>
     * NONE: Ignore UID and GID.
     * </p>
     * 
     * @param gid
     *        The POSIX group ID (GID) of the file's owners. This option should only be set for NFS, EFS, and S3
     *        locations. For more information about what metadata is copied by DataSync, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        Copied by DataSync</a>. </p>
     *        <p>
     *        Default value: INT_VALUE. This preserves the integer value of the ID.
     *        </p>
     *        <p>
     *        INT_VALUE: Preserve the integer value of user ID (UID) and GID (recommended).
     *        </p>
     *        <p>
     *        NONE: Ignore UID and GID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Gid
     */

    public Options withGid(String gid) {
        setGid(gid);
        return this;
    }

    /**
     * <p>
     * The POSIX group ID (GID) of the file's owners. This option should only be set for NFS, EFS, and S3 locations. For
     * more information about what metadata is copied by DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata Copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: INT_VALUE. This preserves the integer value of the ID.
     * </p>
     * <p>
     * INT_VALUE: Preserve the integer value of user ID (UID) and GID (recommended).
     * </p>
     * <p>
     * NONE: Ignore UID and GID.
     * </p>
     * 
     * @param gid
     *        The POSIX group ID (GID) of the file's owners. This option should only be set for NFS, EFS, and S3
     *        locations. For more information about what metadata is copied by DataSync, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        Copied by DataSync</a>. </p>
     *        <p>
     *        Default value: INT_VALUE. This preserves the integer value of the ID.
     *        </p>
     *        <p>
     *        INT_VALUE: Preserve the integer value of user ID (UID) and GID (recommended).
     *        </p>
     *        <p>
     *        NONE: Ignore UID and GID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Gid
     */

    public Options withGid(Gid gid) {
        this.gid = gid.toString();
        return this;
    }

    /**
     * <p>
     * A value that specifies whether files in the destination that don't exist in the source file system should be
     * preserved. This option can affect your storage cost. If your task deletes objects, you might incur minimum
     * storage duration charges for certain storage classes. For detailed information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Considerations when working with Amazon S3 storage classes in DataSync </a> in the <i>DataSync User Guide</i>.
     * </p>
     * <p>
     * Default value: PRESERVE.
     * </p>
     * <p>
     * PRESERVE: Ignore such destination files (recommended).
     * </p>
     * <p>
     * REMOVE: Delete destination files that aren’t present in the source.
     * </p>
     * 
     * @param preserveDeletedFiles
     *        A value that specifies whether files in the destination that don't exist in the source file system should
     *        be preserved. This option can affect your storage cost. If your task deletes objects, you might incur
     *        minimum storage duration charges for certain storage classes. For detailed information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Considerations when working with Amazon S3 storage classes in DataSync </a> in the <i>DataSync User
     *        Guide</i>.</p>
     *        <p>
     *        Default value: PRESERVE.
     *        </p>
     *        <p>
     *        PRESERVE: Ignore such destination files (recommended).
     *        </p>
     *        <p>
     *        REMOVE: Delete destination files that aren’t present in the source.
     * @see PreserveDeletedFiles
     */

    public void setPreserveDeletedFiles(String preserveDeletedFiles) {
        this.preserveDeletedFiles = preserveDeletedFiles;
    }

    /**
     * <p>
     * A value that specifies whether files in the destination that don't exist in the source file system should be
     * preserved. This option can affect your storage cost. If your task deletes objects, you might incur minimum
     * storage duration charges for certain storage classes. For detailed information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Considerations when working with Amazon S3 storage classes in DataSync </a> in the <i>DataSync User Guide</i>.
     * </p>
     * <p>
     * Default value: PRESERVE.
     * </p>
     * <p>
     * PRESERVE: Ignore such destination files (recommended).
     * </p>
     * <p>
     * REMOVE: Delete destination files that aren’t present in the source.
     * </p>
     * 
     * @return A value that specifies whether files in the destination that don't exist in the source file system should
     *         be preserved. This option can affect your storage cost. If your task deletes objects, you might incur
     *         minimum storage duration charges for certain storage classes. For detailed information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *         >Considerations when working with Amazon S3 storage classes in DataSync </a> in the <i>DataSync User
     *         Guide</i>.</p>
     *         <p>
     *         Default value: PRESERVE.
     *         </p>
     *         <p>
     *         PRESERVE: Ignore such destination files (recommended).
     *         </p>
     *         <p>
     *         REMOVE: Delete destination files that aren’t present in the source.
     * @see PreserveDeletedFiles
     */

    public String getPreserveDeletedFiles() {
        return this.preserveDeletedFiles;
    }

    /**
     * <p>
     * A value that specifies whether files in the destination that don't exist in the source file system should be
     * preserved. This option can affect your storage cost. If your task deletes objects, you might incur minimum
     * storage duration charges for certain storage classes. For detailed information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Considerations when working with Amazon S3 storage classes in DataSync </a> in the <i>DataSync User Guide</i>.
     * </p>
     * <p>
     * Default value: PRESERVE.
     * </p>
     * <p>
     * PRESERVE: Ignore such destination files (recommended).
     * </p>
     * <p>
     * REMOVE: Delete destination files that aren’t present in the source.
     * </p>
     * 
     * @param preserveDeletedFiles
     *        A value that specifies whether files in the destination that don't exist in the source file system should
     *        be preserved. This option can affect your storage cost. If your task deletes objects, you might incur
     *        minimum storage duration charges for certain storage classes. For detailed information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Considerations when working with Amazon S3 storage classes in DataSync </a> in the <i>DataSync User
     *        Guide</i>.</p>
     *        <p>
     *        Default value: PRESERVE.
     *        </p>
     *        <p>
     *        PRESERVE: Ignore such destination files (recommended).
     *        </p>
     *        <p>
     *        REMOVE: Delete destination files that aren’t present in the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PreserveDeletedFiles
     */

    public Options withPreserveDeletedFiles(String preserveDeletedFiles) {
        setPreserveDeletedFiles(preserveDeletedFiles);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether files in the destination that don't exist in the source file system should be
     * preserved. This option can affect your storage cost. If your task deletes objects, you might incur minimum
     * storage duration charges for certain storage classes. For detailed information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     * >Considerations when working with Amazon S3 storage classes in DataSync </a> in the <i>DataSync User Guide</i>.
     * </p>
     * <p>
     * Default value: PRESERVE.
     * </p>
     * <p>
     * PRESERVE: Ignore such destination files (recommended).
     * </p>
     * <p>
     * REMOVE: Delete destination files that aren’t present in the source.
     * </p>
     * 
     * @param preserveDeletedFiles
     *        A value that specifies whether files in the destination that don't exist in the source file system should
     *        be preserved. This option can affect your storage cost. If your task deletes objects, you might incur
     *        minimum storage duration charges for certain storage classes. For detailed information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes"
     *        >Considerations when working with Amazon S3 storage classes in DataSync </a> in the <i>DataSync User
     *        Guide</i>.</p>
     *        <p>
     *        Default value: PRESERVE.
     *        </p>
     *        <p>
     *        PRESERVE: Ignore such destination files (recommended).
     *        </p>
     *        <p>
     *        REMOVE: Delete destination files that aren’t present in the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PreserveDeletedFiles
     */

    public Options withPreserveDeletedFiles(PreserveDeletedFiles preserveDeletedFiles) {
        this.preserveDeletedFiles = preserveDeletedFiles.toString();
        return this;
    }

    /**
     * <p>
     * A value that determines whether DataSync should preserve the metadata of block and character devices in the
     * source file system, and re-create the files with that device name and metadata on the destination. DataSync does
     * not copy the contents of such devices, only the name and metadata.
     * </p>
     * <note>
     * <p>
     * DataSync can't sync the actual contents of such devices, because they are nonterminal and don't return an
     * end-of-file (EOF) marker.
     * </p>
     * </note>
     * <p>
     * Default value: NONE.
     * </p>
     * <p>
     * NONE: Ignore special devices (recommended).
     * </p>
     * <p>
     * PRESERVE: Preserve character and block device metadata. This option isn't currently supported for Amazon EFS.
     * </p>
     * 
     * @param preserveDevices
     *        A value that determines whether DataSync should preserve the metadata of block and character devices in
     *        the source file system, and re-create the files with that device name and metadata on the destination.
     *        DataSync does not copy the contents of such devices, only the name and metadata. </p> <note>
     *        <p>
     *        DataSync can't sync the actual contents of such devices, because they are nonterminal and don't return an
     *        end-of-file (EOF) marker.
     *        </p>
     *        </note>
     *        <p>
     *        Default value: NONE.
     *        </p>
     *        <p>
     *        NONE: Ignore special devices (recommended).
     *        </p>
     *        <p>
     *        PRESERVE: Preserve character and block device metadata. This option isn't currently supported for Amazon
     *        EFS.
     * @see PreserveDevices
     */

    public void setPreserveDevices(String preserveDevices) {
        this.preserveDevices = preserveDevices;
    }

    /**
     * <p>
     * A value that determines whether DataSync should preserve the metadata of block and character devices in the
     * source file system, and re-create the files with that device name and metadata on the destination. DataSync does
     * not copy the contents of such devices, only the name and metadata.
     * </p>
     * <note>
     * <p>
     * DataSync can't sync the actual contents of such devices, because they are nonterminal and don't return an
     * end-of-file (EOF) marker.
     * </p>
     * </note>
     * <p>
     * Default value: NONE.
     * </p>
     * <p>
     * NONE: Ignore special devices (recommended).
     * </p>
     * <p>
     * PRESERVE: Preserve character and block device metadata. This option isn't currently supported for Amazon EFS.
     * </p>
     * 
     * @return A value that determines whether DataSync should preserve the metadata of block and character devices in
     *         the source file system, and re-create the files with that device name and metadata on the destination.
     *         DataSync does not copy the contents of such devices, only the name and metadata. </p> <note>
     *         <p>
     *         DataSync can't sync the actual contents of such devices, because they are nonterminal and don't return an
     *         end-of-file (EOF) marker.
     *         </p>
     *         </note>
     *         <p>
     *         Default value: NONE.
     *         </p>
     *         <p>
     *         NONE: Ignore special devices (recommended).
     *         </p>
     *         <p>
     *         PRESERVE: Preserve character and block device metadata. This option isn't currently supported for Amazon
     *         EFS.
     * @see PreserveDevices
     */

    public String getPreserveDevices() {
        return this.preserveDevices;
    }

    /**
     * <p>
     * A value that determines whether DataSync should preserve the metadata of block and character devices in the
     * source file system, and re-create the files with that device name and metadata on the destination. DataSync does
     * not copy the contents of such devices, only the name and metadata.
     * </p>
     * <note>
     * <p>
     * DataSync can't sync the actual contents of such devices, because they are nonterminal and don't return an
     * end-of-file (EOF) marker.
     * </p>
     * </note>
     * <p>
     * Default value: NONE.
     * </p>
     * <p>
     * NONE: Ignore special devices (recommended).
     * </p>
     * <p>
     * PRESERVE: Preserve character and block device metadata. This option isn't currently supported for Amazon EFS.
     * </p>
     * 
     * @param preserveDevices
     *        A value that determines whether DataSync should preserve the metadata of block and character devices in
     *        the source file system, and re-create the files with that device name and metadata on the destination.
     *        DataSync does not copy the contents of such devices, only the name and metadata. </p> <note>
     *        <p>
     *        DataSync can't sync the actual contents of such devices, because they are nonterminal and don't return an
     *        end-of-file (EOF) marker.
     *        </p>
     *        </note>
     *        <p>
     *        Default value: NONE.
     *        </p>
     *        <p>
     *        NONE: Ignore special devices (recommended).
     *        </p>
     *        <p>
     *        PRESERVE: Preserve character and block device metadata. This option isn't currently supported for Amazon
     *        EFS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PreserveDevices
     */

    public Options withPreserveDevices(String preserveDevices) {
        setPreserveDevices(preserveDevices);
        return this;
    }

    /**
     * <p>
     * A value that determines whether DataSync should preserve the metadata of block and character devices in the
     * source file system, and re-create the files with that device name and metadata on the destination. DataSync does
     * not copy the contents of such devices, only the name and metadata.
     * </p>
     * <note>
     * <p>
     * DataSync can't sync the actual contents of such devices, because they are nonterminal and don't return an
     * end-of-file (EOF) marker.
     * </p>
     * </note>
     * <p>
     * Default value: NONE.
     * </p>
     * <p>
     * NONE: Ignore special devices (recommended).
     * </p>
     * <p>
     * PRESERVE: Preserve character and block device metadata. This option isn't currently supported for Amazon EFS.
     * </p>
     * 
     * @param preserveDevices
     *        A value that determines whether DataSync should preserve the metadata of block and character devices in
     *        the source file system, and re-create the files with that device name and metadata on the destination.
     *        DataSync does not copy the contents of such devices, only the name and metadata. </p> <note>
     *        <p>
     *        DataSync can't sync the actual contents of such devices, because they are nonterminal and don't return an
     *        end-of-file (EOF) marker.
     *        </p>
     *        </note>
     *        <p>
     *        Default value: NONE.
     *        </p>
     *        <p>
     *        NONE: Ignore special devices (recommended).
     *        </p>
     *        <p>
     *        PRESERVE: Preserve character and block device metadata. This option isn't currently supported for Amazon
     *        EFS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PreserveDevices
     */

    public Options withPreserveDevices(PreserveDevices preserveDevices) {
        this.preserveDevices = preserveDevices.toString();
        return this;
    }

    /**
     * <p>
     * A value that determines which users or groups can access a file for a specific purpose such as reading, writing,
     * or execution of the file. This option should only be set for NFS, EFS, and S3 locations. For more information
     * about what metadata is copied by DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata Copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: PRESERVE.
     * </p>
     * <p>
     * PRESERVE: Preserve POSIX-style permissions (recommended).
     * </p>
     * <p>
     * NONE: Ignore permissions.
     * </p>
     * <note>
     * <p>
     * DataSync can preserve extant permissions of a source location.
     * </p>
     * </note>
     * 
     * @param posixPermissions
     *        A value that determines which users or groups can access a file for a specific purpose such as reading,
     *        writing, or execution of the file. This option should only be set for NFS, EFS, and S3 locations. For more
     *        information about what metadata is copied by DataSync, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        Copied by DataSync</a>. </p>
     *        <p>
     *        Default value: PRESERVE.
     *        </p>
     *        <p>
     *        PRESERVE: Preserve POSIX-style permissions (recommended).
     *        </p>
     *        <p>
     *        NONE: Ignore permissions.
     *        </p>
     *        <note>
     *        <p>
     *        DataSync can preserve extant permissions of a source location.
     *        </p>
     * @see PosixPermissions
     */

    public void setPosixPermissions(String posixPermissions) {
        this.posixPermissions = posixPermissions;
    }

    /**
     * <p>
     * A value that determines which users or groups can access a file for a specific purpose such as reading, writing,
     * or execution of the file. This option should only be set for NFS, EFS, and S3 locations. For more information
     * about what metadata is copied by DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata Copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: PRESERVE.
     * </p>
     * <p>
     * PRESERVE: Preserve POSIX-style permissions (recommended).
     * </p>
     * <p>
     * NONE: Ignore permissions.
     * </p>
     * <note>
     * <p>
     * DataSync can preserve extant permissions of a source location.
     * </p>
     * </note>
     * 
     * @return A value that determines which users or groups can access a file for a specific purpose such as reading,
     *         writing, or execution of the file. This option should only be set for NFS, EFS, and S3 locations. For
     *         more information about what metadata is copied by DataSync, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *         Copied by DataSync</a>. </p>
     *         <p>
     *         Default value: PRESERVE.
     *         </p>
     *         <p>
     *         PRESERVE: Preserve POSIX-style permissions (recommended).
     *         </p>
     *         <p>
     *         NONE: Ignore permissions.
     *         </p>
     *         <note>
     *         <p>
     *         DataSync can preserve extant permissions of a source location.
     *         </p>
     * @see PosixPermissions
     */

    public String getPosixPermissions() {
        return this.posixPermissions;
    }

    /**
     * <p>
     * A value that determines which users or groups can access a file for a specific purpose such as reading, writing,
     * or execution of the file. This option should only be set for NFS, EFS, and S3 locations. For more information
     * about what metadata is copied by DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata Copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: PRESERVE.
     * </p>
     * <p>
     * PRESERVE: Preserve POSIX-style permissions (recommended).
     * </p>
     * <p>
     * NONE: Ignore permissions.
     * </p>
     * <note>
     * <p>
     * DataSync can preserve extant permissions of a source location.
     * </p>
     * </note>
     * 
     * @param posixPermissions
     *        A value that determines which users or groups can access a file for a specific purpose such as reading,
     *        writing, or execution of the file. This option should only be set for NFS, EFS, and S3 locations. For more
     *        information about what metadata is copied by DataSync, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        Copied by DataSync</a>. </p>
     *        <p>
     *        Default value: PRESERVE.
     *        </p>
     *        <p>
     *        PRESERVE: Preserve POSIX-style permissions (recommended).
     *        </p>
     *        <p>
     *        NONE: Ignore permissions.
     *        </p>
     *        <note>
     *        <p>
     *        DataSync can preserve extant permissions of a source location.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PosixPermissions
     */

    public Options withPosixPermissions(String posixPermissions) {
        setPosixPermissions(posixPermissions);
        return this;
    }

    /**
     * <p>
     * A value that determines which users or groups can access a file for a specific purpose such as reading, writing,
     * or execution of the file. This option should only be set for NFS, EFS, and S3 locations. For more information
     * about what metadata is copied by DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata Copied
     * by DataSync</a>.
     * </p>
     * <p>
     * Default value: PRESERVE.
     * </p>
     * <p>
     * PRESERVE: Preserve POSIX-style permissions (recommended).
     * </p>
     * <p>
     * NONE: Ignore permissions.
     * </p>
     * <note>
     * <p>
     * DataSync can preserve extant permissions of a source location.
     * </p>
     * </note>
     * 
     * @param posixPermissions
     *        A value that determines which users or groups can access a file for a specific purpose such as reading,
     *        writing, or execution of the file. This option should only be set for NFS, EFS, and S3 locations. For more
     *        information about what metadata is copied by DataSync, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html#metadata-copied">Metadata
     *        Copied by DataSync</a>. </p>
     *        <p>
     *        Default value: PRESERVE.
     *        </p>
     *        <p>
     *        PRESERVE: Preserve POSIX-style permissions (recommended).
     *        </p>
     *        <p>
     *        NONE: Ignore permissions.
     *        </p>
     *        <note>
     *        <p>
     *        DataSync can preserve extant permissions of a source location.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PosixPermissions
     */

    public Options withPosixPermissions(PosixPermissions posixPermissions) {
        this.posixPermissions = posixPermissions.toString();
        return this;
    }

    /**
     * <p>
     * A value that limits the bandwidth used by DataSync. For example, if you want DataSync to use a maximum of 1 MB,
     * set this value to <code>1048576</code> (<code>=1024*1024</code>).
     * </p>
     * 
     * @param bytesPerSecond
     *        A value that limits the bandwidth used by DataSync. For example, if you want DataSync to use a maximum of
     *        1 MB, set this value to <code>1048576</code> (<code>=1024*1024</code>).
     */

    public void setBytesPerSecond(Long bytesPerSecond) {
        this.bytesPerSecond = bytesPerSecond;
    }

    /**
     * <p>
     * A value that limits the bandwidth used by DataSync. For example, if you want DataSync to use a maximum of 1 MB,
     * set this value to <code>1048576</code> (<code>=1024*1024</code>).
     * </p>
     * 
     * @return A value that limits the bandwidth used by DataSync. For example, if you want DataSync to use a maximum of
     *         1 MB, set this value to <code>1048576</code> (<code>=1024*1024</code>).
     */

    public Long getBytesPerSecond() {
        return this.bytesPerSecond;
    }

    /**
     * <p>
     * A value that limits the bandwidth used by DataSync. For example, if you want DataSync to use a maximum of 1 MB,
     * set this value to <code>1048576</code> (<code>=1024*1024</code>).
     * </p>
     * 
     * @param bytesPerSecond
     *        A value that limits the bandwidth used by DataSync. For example, if you want DataSync to use a maximum of
     *        1 MB, set this value to <code>1048576</code> (<code>=1024*1024</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Options withBytesPerSecond(Long bytesPerSecond) {
        setBytesPerSecond(bytesPerSecond);
        return this;
    }

    /**
     * <p>
     * A value that determines whether tasks should be queued before executing the tasks. If set to <code>ENABLED</code>
     * , the tasks will be queued. The default is <code>ENABLED</code>.
     * </p>
     * <p>
     * If you use the same agent to run multiple tasks, you can enable the tasks to run in series. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#queue-task-execution">Queueing
     * task executions</a>.
     * </p>
     * 
     * @param taskQueueing
     *        A value that determines whether tasks should be queued before executing the tasks. If set to
     *        <code>ENABLED</code>, the tasks will be queued. The default is <code>ENABLED</code>.</p>
     *        <p>
     *        If you use the same agent to run multiple tasks, you can enable the tasks to run in series. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#queue-task-execution">Queueing
     *        task executions</a>.
     * @see TaskQueueing
     */

    public void setTaskQueueing(String taskQueueing) {
        this.taskQueueing = taskQueueing;
    }

    /**
     * <p>
     * A value that determines whether tasks should be queued before executing the tasks. If set to <code>ENABLED</code>
     * , the tasks will be queued. The default is <code>ENABLED</code>.
     * </p>
     * <p>
     * If you use the same agent to run multiple tasks, you can enable the tasks to run in series. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#queue-task-execution">Queueing
     * task executions</a>.
     * </p>
     * 
     * @return A value that determines whether tasks should be queued before executing the tasks. If set to
     *         <code>ENABLED</code>, the tasks will be queued. The default is <code>ENABLED</code>.</p>
     *         <p>
     *         If you use the same agent to run multiple tasks, you can enable the tasks to run in series. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#queue-task-execution">Queueing
     *         task executions</a>.
     * @see TaskQueueing
     */

    public String getTaskQueueing() {
        return this.taskQueueing;
    }

    /**
     * <p>
     * A value that determines whether tasks should be queued before executing the tasks. If set to <code>ENABLED</code>
     * , the tasks will be queued. The default is <code>ENABLED</code>.
     * </p>
     * <p>
     * If you use the same agent to run multiple tasks, you can enable the tasks to run in series. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#queue-task-execution">Queueing
     * task executions</a>.
     * </p>
     * 
     * @param taskQueueing
     *        A value that determines whether tasks should be queued before executing the tasks. If set to
     *        <code>ENABLED</code>, the tasks will be queued. The default is <code>ENABLED</code>.</p>
     *        <p>
     *        If you use the same agent to run multiple tasks, you can enable the tasks to run in series. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#queue-task-execution">Queueing
     *        task executions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskQueueing
     */

    public Options withTaskQueueing(String taskQueueing) {
        setTaskQueueing(taskQueueing);
        return this;
    }

    /**
     * <p>
     * A value that determines whether tasks should be queued before executing the tasks. If set to <code>ENABLED</code>
     * , the tasks will be queued. The default is <code>ENABLED</code>.
     * </p>
     * <p>
     * If you use the same agent to run multiple tasks, you can enable the tasks to run in series. For more information,
     * see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#queue-task-execution">Queueing
     * task executions</a>.
     * </p>
     * 
     * @param taskQueueing
     *        A value that determines whether tasks should be queued before executing the tasks. If set to
     *        <code>ENABLED</code>, the tasks will be queued. The default is <code>ENABLED</code>.</p>
     *        <p>
     *        If you use the same agent to run multiple tasks, you can enable the tasks to run in series. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/run-task.html#queue-task-execution">Queueing
     *        task executions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskQueueing
     */

    public Options withTaskQueueing(TaskQueueing taskQueueing) {
        this.taskQueueing = taskQueueing.toString();
        return this;
    }

    /**
     * <p>
     * A value that determines the type of logs that DataSync publishes to a log stream in the Amazon CloudWatch log
     * group that you provide. For more information about providing a log group for DataSync, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     * >CloudWatchLogGroupArn</a>. If set to <code>OFF</code>, no logs are published. <code>BASIC</code> publishes logs
     * on errors for individual files transferred, and <code>TRANSFER</code> publishes logs for every file or object
     * that is transferred and integrity checked.
     * </p>
     * 
     * @param logLevel
     *        A value that determines the type of logs that DataSync publishes to a log stream in the Amazon CloudWatch
     *        log group that you provide. For more information about providing a log group for DataSync, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     *        >CloudWatchLogGroupArn</a>. If set to <code>OFF</code>, no logs are published. <code>BASIC</code>
     *        publishes logs on errors for individual files transferred, and <code>TRANSFER</code> publishes logs for
     *        every file or object that is transferred and integrity checked.
     * @see LogLevel
     */

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * <p>
     * A value that determines the type of logs that DataSync publishes to a log stream in the Amazon CloudWatch log
     * group that you provide. For more information about providing a log group for DataSync, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     * >CloudWatchLogGroupArn</a>. If set to <code>OFF</code>, no logs are published. <code>BASIC</code> publishes logs
     * on errors for individual files transferred, and <code>TRANSFER</code> publishes logs for every file or object
     * that is transferred and integrity checked.
     * </p>
     * 
     * @return A value that determines the type of logs that DataSync publishes to a log stream in the Amazon CloudWatch
     *         log group that you provide. For more information about providing a log group for DataSync, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     *         >CloudWatchLogGroupArn</a>. If set to <code>OFF</code>, no logs are published. <code>BASIC</code>
     *         publishes logs on errors for individual files transferred, and <code>TRANSFER</code> publishes logs for
     *         every file or object that is transferred and integrity checked.
     * @see LogLevel
     */

    public String getLogLevel() {
        return this.logLevel;
    }

    /**
     * <p>
     * A value that determines the type of logs that DataSync publishes to a log stream in the Amazon CloudWatch log
     * group that you provide. For more information about providing a log group for DataSync, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     * >CloudWatchLogGroupArn</a>. If set to <code>OFF</code>, no logs are published. <code>BASIC</code> publishes logs
     * on errors for individual files transferred, and <code>TRANSFER</code> publishes logs for every file or object
     * that is transferred and integrity checked.
     * </p>
     * 
     * @param logLevel
     *        A value that determines the type of logs that DataSync publishes to a log stream in the Amazon CloudWatch
     *        log group that you provide. For more information about providing a log group for DataSync, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     *        >CloudWatchLogGroupArn</a>. If set to <code>OFF</code>, no logs are published. <code>BASIC</code>
     *        publishes logs on errors for individual files transferred, and <code>TRANSFER</code> publishes logs for
     *        every file or object that is transferred and integrity checked.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public Options withLogLevel(String logLevel) {
        setLogLevel(logLevel);
        return this;
    }

    /**
     * <p>
     * A value that determines the type of logs that DataSync publishes to a log stream in the Amazon CloudWatch log
     * group that you provide. For more information about providing a log group for DataSync, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     * >CloudWatchLogGroupArn</a>. If set to <code>OFF</code>, no logs are published. <code>BASIC</code> publishes logs
     * on errors for individual files transferred, and <code>TRANSFER</code> publishes logs for every file or object
     * that is transferred and integrity checked.
     * </p>
     * 
     * @param logLevel
     *        A value that determines the type of logs that DataSync publishes to a log stream in the Amazon CloudWatch
     *        log group that you provide. For more information about providing a log group for DataSync, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/API_CreateTask.html#DataSync-CreateTask-request-CloudWatchLogGroupArn"
     *        >CloudWatchLogGroupArn</a>. If set to <code>OFF</code>, no logs are published. <code>BASIC</code>
     *        publishes logs on errors for individual files transferred, and <code>TRANSFER</code> publishes logs for
     *        every file or object that is transferred and integrity checked.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public Options withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
        return this;
    }

    /**
     * <p>
     * A value that determines whether DataSync transfers only the data and metadata that differ between the source and
     * the destination location, or whether DataSync transfers all the content from the source, without comparing to the
     * destination location.
     * </p>
     * <p>
     * CHANGED: DataSync copies only data or metadata that is new or different content from the source location to the
     * destination location.
     * </p>
     * <p>
     * ALL: DataSync copies all source location content to the destination, without comparing to existing content on the
     * destination.
     * </p>
     * 
     * @param transferMode
     *        A value that determines whether DataSync transfers only the data and metadata that differ between the
     *        source and the destination location, or whether DataSync transfers all the content from the source,
     *        without comparing to the destination location. </p>
     *        <p>
     *        CHANGED: DataSync copies only data or metadata that is new or different content from the source location
     *        to the destination location.
     *        </p>
     *        <p>
     *        ALL: DataSync copies all source location content to the destination, without comparing to existing content
     *        on the destination.
     * @see TransferMode
     */

    public void setTransferMode(String transferMode) {
        this.transferMode = transferMode;
    }

    /**
     * <p>
     * A value that determines whether DataSync transfers only the data and metadata that differ between the source and
     * the destination location, or whether DataSync transfers all the content from the source, without comparing to the
     * destination location.
     * </p>
     * <p>
     * CHANGED: DataSync copies only data or metadata that is new or different content from the source location to the
     * destination location.
     * </p>
     * <p>
     * ALL: DataSync copies all source location content to the destination, without comparing to existing content on the
     * destination.
     * </p>
     * 
     * @return A value that determines whether DataSync transfers only the data and metadata that differ between the
     *         source and the destination location, or whether DataSync transfers all the content from the source,
     *         without comparing to the destination location. </p>
     *         <p>
     *         CHANGED: DataSync copies only data or metadata that is new or different content from the source location
     *         to the destination location.
     *         </p>
     *         <p>
     *         ALL: DataSync copies all source location content to the destination, without comparing to existing
     *         content on the destination.
     * @see TransferMode
     */

    public String getTransferMode() {
        return this.transferMode;
    }

    /**
     * <p>
     * A value that determines whether DataSync transfers only the data and metadata that differ between the source and
     * the destination location, or whether DataSync transfers all the content from the source, without comparing to the
     * destination location.
     * </p>
     * <p>
     * CHANGED: DataSync copies only data or metadata that is new or different content from the source location to the
     * destination location.
     * </p>
     * <p>
     * ALL: DataSync copies all source location content to the destination, without comparing to existing content on the
     * destination.
     * </p>
     * 
     * @param transferMode
     *        A value that determines whether DataSync transfers only the data and metadata that differ between the
     *        source and the destination location, or whether DataSync transfers all the content from the source,
     *        without comparing to the destination location. </p>
     *        <p>
     *        CHANGED: DataSync copies only data or metadata that is new or different content from the source location
     *        to the destination location.
     *        </p>
     *        <p>
     *        ALL: DataSync copies all source location content to the destination, without comparing to existing content
     *        on the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransferMode
     */

    public Options withTransferMode(String transferMode) {
        setTransferMode(transferMode);
        return this;
    }

    /**
     * <p>
     * A value that determines whether DataSync transfers only the data and metadata that differ between the source and
     * the destination location, or whether DataSync transfers all the content from the source, without comparing to the
     * destination location.
     * </p>
     * <p>
     * CHANGED: DataSync copies only data or metadata that is new or different content from the source location to the
     * destination location.
     * </p>
     * <p>
     * ALL: DataSync copies all source location content to the destination, without comparing to existing content on the
     * destination.
     * </p>
     * 
     * @param transferMode
     *        A value that determines whether DataSync transfers only the data and metadata that differ between the
     *        source and the destination location, or whether DataSync transfers all the content from the source,
     *        without comparing to the destination location. </p>
     *        <p>
     *        CHANGED: DataSync copies only data or metadata that is new or different content from the source location
     *        to the destination location.
     *        </p>
     *        <p>
     *        ALL: DataSync copies all source location content to the destination, without comparing to existing content
     *        on the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransferMode
     */

    public Options withTransferMode(TransferMode transferMode) {
        this.transferMode = transferMode.toString();
        return this;
    }

    /**
     * <p>
     * A value that determines which components of the SMB security descriptor are copied from source to destination
     * objects.
     * </p>
     * <p>
     * This value is only used for transfers between SMB and Amazon FSx for Windows File Server locations, or between
     * two Amazon FSx for Windows File Server locations. For more information about how DataSync handles metadata, see
     * <a href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html">How DataSync Handles Metadata
     * and Special Files</a>.
     * </p>
     * <p>
     * Default value: OWNER_DACL.
     * </p>
     * <p>
     * <b>OWNER_DACL</b>: For each copied object, DataSync copies the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Object owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When choosing this option, DataSync does NOT copy the NTFS system access control lists (SACLs), which are used by
     * administrators to log attempts to access a secured object.
     * </p>
     * <p>
     * <b>OWNER_DACL_SACL</b>: For each copied object, DataSync copies the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Object owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS system access control lists (SACLs), which are used by administrators to log attempts to access a secured
     * object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Copying SACLs requires granting additional permissions to the Windows user that DataSync uses to access your SMB
     * location. For information about choosing a user that ensures sufficient permissions to files, folders, and
     * metadata, see <a href="create-smb-location.html#SMBuser">user</a>.
     * </p>
     * <p>
     * <b>NONE</b>: None of the SMB security descriptor components are copied. Destination objects are owned by the user
     * that was provided for accessing the destination location. DACLs and SACLs are set based on the destination
     * server’s configuration.
     * </p>
     * 
     * @param securityDescriptorCopyFlags
     *        A value that determines which components of the SMB security descriptor are copied from source to
     *        destination objects. </p>
     *        <p>
     *        This value is only used for transfers between SMB and Amazon FSx for Windows File Server locations, or
     *        between two Amazon FSx for Windows File Server locations. For more information about how DataSync handles
     *        metadata, see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html">How
     *        DataSync Handles Metadata and Special Files</a>.
     *        </p>
     *        <p>
     *        Default value: OWNER_DACL.
     *        </p>
     *        <p>
     *        <b>OWNER_DACL</b>: For each copied object, DataSync copies the following metadata:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Object owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When choosing this option, DataSync does NOT copy the NTFS system access control lists (SACLs), which are
     *        used by administrators to log attempts to access a secured object.
     *        </p>
     *        <p>
     *        <b>OWNER_DACL_SACL</b>: For each copied object, DataSync copies the following metadata:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Object owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NTFS system access control lists (SACLs), which are used by administrators to log attempts to access a
     *        secured object.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Copying SACLs requires granting additional permissions to the Windows user that DataSync uses to access
     *        your SMB location. For information about choosing a user that ensures sufficient permissions to files,
     *        folders, and metadata, see <a href="create-smb-location.html#SMBuser">user</a>.
     *        </p>
     *        <p>
     *        <b>NONE</b>: None of the SMB security descriptor components are copied. Destination objects are owned by
     *        the user that was provided for accessing the destination location. DACLs and SACLs are set based on the
     *        destination server’s configuration.
     * @see SmbSecurityDescriptorCopyFlags
     */

    public void setSecurityDescriptorCopyFlags(String securityDescriptorCopyFlags) {
        this.securityDescriptorCopyFlags = securityDescriptorCopyFlags;
    }

    /**
     * <p>
     * A value that determines which components of the SMB security descriptor are copied from source to destination
     * objects.
     * </p>
     * <p>
     * This value is only used for transfers between SMB and Amazon FSx for Windows File Server locations, or between
     * two Amazon FSx for Windows File Server locations. For more information about how DataSync handles metadata, see
     * <a href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html">How DataSync Handles Metadata
     * and Special Files</a>.
     * </p>
     * <p>
     * Default value: OWNER_DACL.
     * </p>
     * <p>
     * <b>OWNER_DACL</b>: For each copied object, DataSync copies the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Object owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When choosing this option, DataSync does NOT copy the NTFS system access control lists (SACLs), which are used by
     * administrators to log attempts to access a secured object.
     * </p>
     * <p>
     * <b>OWNER_DACL_SACL</b>: For each copied object, DataSync copies the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Object owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS system access control lists (SACLs), which are used by administrators to log attempts to access a secured
     * object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Copying SACLs requires granting additional permissions to the Windows user that DataSync uses to access your SMB
     * location. For information about choosing a user that ensures sufficient permissions to files, folders, and
     * metadata, see <a href="create-smb-location.html#SMBuser">user</a>.
     * </p>
     * <p>
     * <b>NONE</b>: None of the SMB security descriptor components are copied. Destination objects are owned by the user
     * that was provided for accessing the destination location. DACLs and SACLs are set based on the destination
     * server’s configuration.
     * </p>
     * 
     * @return A value that determines which components of the SMB security descriptor are copied from source to
     *         destination objects. </p>
     *         <p>
     *         This value is only used for transfers between SMB and Amazon FSx for Windows File Server locations, or
     *         between two Amazon FSx for Windows File Server locations. For more information about how DataSync handles
     *         metadata, see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html">How
     *         DataSync Handles Metadata and Special Files</a>.
     *         </p>
     *         <p>
     *         Default value: OWNER_DACL.
     *         </p>
     *         <p>
     *         <b>OWNER_DACL</b>: For each copied object, DataSync copies the following metadata:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Object owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When choosing this option, DataSync does NOT copy the NTFS system access control lists (SACLs), which are
     *         used by administrators to log attempts to access a secured object.
     *         </p>
     *         <p>
     *         <b>OWNER_DACL_SACL</b>: For each copied object, DataSync copies the following metadata:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Object owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NTFS system access control lists (SACLs), which are used by administrators to log attempts to access a
     *         secured object.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Copying SACLs requires granting additional permissions to the Windows user that DataSync uses to access
     *         your SMB location. For information about choosing a user that ensures sufficient permissions to files,
     *         folders, and metadata, see <a href="create-smb-location.html#SMBuser">user</a>.
     *         </p>
     *         <p>
     *         <b>NONE</b>: None of the SMB security descriptor components are copied. Destination objects are owned by
     *         the user that was provided for accessing the destination location. DACLs and SACLs are set based on the
     *         destination server’s configuration.
     * @see SmbSecurityDescriptorCopyFlags
     */

    public String getSecurityDescriptorCopyFlags() {
        return this.securityDescriptorCopyFlags;
    }

    /**
     * <p>
     * A value that determines which components of the SMB security descriptor are copied from source to destination
     * objects.
     * </p>
     * <p>
     * This value is only used for transfers between SMB and Amazon FSx for Windows File Server locations, or between
     * two Amazon FSx for Windows File Server locations. For more information about how DataSync handles metadata, see
     * <a href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html">How DataSync Handles Metadata
     * and Special Files</a>.
     * </p>
     * <p>
     * Default value: OWNER_DACL.
     * </p>
     * <p>
     * <b>OWNER_DACL</b>: For each copied object, DataSync copies the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Object owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When choosing this option, DataSync does NOT copy the NTFS system access control lists (SACLs), which are used by
     * administrators to log attempts to access a secured object.
     * </p>
     * <p>
     * <b>OWNER_DACL_SACL</b>: For each copied object, DataSync copies the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Object owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS system access control lists (SACLs), which are used by administrators to log attempts to access a secured
     * object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Copying SACLs requires granting additional permissions to the Windows user that DataSync uses to access your SMB
     * location. For information about choosing a user that ensures sufficient permissions to files, folders, and
     * metadata, see <a href="create-smb-location.html#SMBuser">user</a>.
     * </p>
     * <p>
     * <b>NONE</b>: None of the SMB security descriptor components are copied. Destination objects are owned by the user
     * that was provided for accessing the destination location. DACLs and SACLs are set based on the destination
     * server’s configuration.
     * </p>
     * 
     * @param securityDescriptorCopyFlags
     *        A value that determines which components of the SMB security descriptor are copied from source to
     *        destination objects. </p>
     *        <p>
     *        This value is only used for transfers between SMB and Amazon FSx for Windows File Server locations, or
     *        between two Amazon FSx for Windows File Server locations. For more information about how DataSync handles
     *        metadata, see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html">How
     *        DataSync Handles Metadata and Special Files</a>.
     *        </p>
     *        <p>
     *        Default value: OWNER_DACL.
     *        </p>
     *        <p>
     *        <b>OWNER_DACL</b>: For each copied object, DataSync copies the following metadata:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Object owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When choosing this option, DataSync does NOT copy the NTFS system access control lists (SACLs), which are
     *        used by administrators to log attempts to access a secured object.
     *        </p>
     *        <p>
     *        <b>OWNER_DACL_SACL</b>: For each copied object, DataSync copies the following metadata:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Object owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NTFS system access control lists (SACLs), which are used by administrators to log attempts to access a
     *        secured object.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Copying SACLs requires granting additional permissions to the Windows user that DataSync uses to access
     *        your SMB location. For information about choosing a user that ensures sufficient permissions to files,
     *        folders, and metadata, see <a href="create-smb-location.html#SMBuser">user</a>.
     *        </p>
     *        <p>
     *        <b>NONE</b>: None of the SMB security descriptor components are copied. Destination objects are owned by
     *        the user that was provided for accessing the destination location. DACLs and SACLs are set based on the
     *        destination server’s configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmbSecurityDescriptorCopyFlags
     */

    public Options withSecurityDescriptorCopyFlags(String securityDescriptorCopyFlags) {
        setSecurityDescriptorCopyFlags(securityDescriptorCopyFlags);
        return this;
    }

    /**
     * <p>
     * A value that determines which components of the SMB security descriptor are copied from source to destination
     * objects.
     * </p>
     * <p>
     * This value is only used for transfers between SMB and Amazon FSx for Windows File Server locations, or between
     * two Amazon FSx for Windows File Server locations. For more information about how DataSync handles metadata, see
     * <a href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html">How DataSync Handles Metadata
     * and Special Files</a>.
     * </p>
     * <p>
     * Default value: OWNER_DACL.
     * </p>
     * <p>
     * <b>OWNER_DACL</b>: For each copied object, DataSync copies the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Object owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When choosing this option, DataSync does NOT copy the NTFS system access control lists (SACLs), which are used by
     * administrators to log attempts to access a secured object.
     * </p>
     * <p>
     * <b>OWNER_DACL_SACL</b>: For each copied object, DataSync copies the following metadata:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Object owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     * </p>
     * </li>
     * <li>
     * <p>
     * NTFS system access control lists (SACLs), which are used by administrators to log attempts to access a secured
     * object.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Copying SACLs requires granting additional permissions to the Windows user that DataSync uses to access your SMB
     * location. For information about choosing a user that ensures sufficient permissions to files, folders, and
     * metadata, see <a href="create-smb-location.html#SMBuser">user</a>.
     * </p>
     * <p>
     * <b>NONE</b>: None of the SMB security descriptor components are copied. Destination objects are owned by the user
     * that was provided for accessing the destination location. DACLs and SACLs are set based on the destination
     * server’s configuration.
     * </p>
     * 
     * @param securityDescriptorCopyFlags
     *        A value that determines which components of the SMB security descriptor are copied from source to
     *        destination objects. </p>
     *        <p>
     *        This value is only used for transfers between SMB and Amazon FSx for Windows File Server locations, or
     *        between two Amazon FSx for Windows File Server locations. For more information about how DataSync handles
     *        metadata, see <a href="https://docs.aws.amazon.com/datasync/latest/userguide/special-files.html">How
     *        DataSync Handles Metadata and Special Files</a>.
     *        </p>
     *        <p>
     *        Default value: OWNER_DACL.
     *        </p>
     *        <p>
     *        <b>OWNER_DACL</b>: For each copied object, DataSync copies the following metadata:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Object owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When choosing this option, DataSync does NOT copy the NTFS system access control lists (SACLs), which are
     *        used by administrators to log attempts to access a secured object.
     *        </p>
     *        <p>
     *        <b>OWNER_DACL_SACL</b>: For each copied object, DataSync copies the following metadata:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Object owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NTFS discretionary access control lists (DACLs), which determine whether to grant access to an object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NTFS system access control lists (SACLs), which are used by administrators to log attempts to access a
     *        secured object.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Copying SACLs requires granting additional permissions to the Windows user that DataSync uses to access
     *        your SMB location. For information about choosing a user that ensures sufficient permissions to files,
     *        folders, and metadata, see <a href="create-smb-location.html#SMBuser">user</a>.
     *        </p>
     *        <p>
     *        <b>NONE</b>: None of the SMB security descriptor components are copied. Destination objects are owned by
     *        the user that was provided for accessing the destination location. DACLs and SACLs are set based on the
     *        destination server’s configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SmbSecurityDescriptorCopyFlags
     */

    public Options withSecurityDescriptorCopyFlags(SmbSecurityDescriptorCopyFlags securityDescriptorCopyFlags) {
        this.securityDescriptorCopyFlags = securityDescriptorCopyFlags.toString();
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
        if (getVerifyMode() != null)
            sb.append("VerifyMode: ").append(getVerifyMode()).append(",");
        if (getOverwriteMode() != null)
            sb.append("OverwriteMode: ").append(getOverwriteMode()).append(",");
        if (getAtime() != null)
            sb.append("Atime: ").append(getAtime()).append(",");
        if (getMtime() != null)
            sb.append("Mtime: ").append(getMtime()).append(",");
        if (getUid() != null)
            sb.append("Uid: ").append(getUid()).append(",");
        if (getGid() != null)
            sb.append("Gid: ").append(getGid()).append(",");
        if (getPreserveDeletedFiles() != null)
            sb.append("PreserveDeletedFiles: ").append(getPreserveDeletedFiles()).append(",");
        if (getPreserveDevices() != null)
            sb.append("PreserveDevices: ").append(getPreserveDevices()).append(",");
        if (getPosixPermissions() != null)
            sb.append("PosixPermissions: ").append(getPosixPermissions()).append(",");
        if (getBytesPerSecond() != null)
            sb.append("BytesPerSecond: ").append(getBytesPerSecond()).append(",");
        if (getTaskQueueing() != null)
            sb.append("TaskQueueing: ").append(getTaskQueueing()).append(",");
        if (getLogLevel() != null)
            sb.append("LogLevel: ").append(getLogLevel()).append(",");
        if (getTransferMode() != null)
            sb.append("TransferMode: ").append(getTransferMode()).append(",");
        if (getSecurityDescriptorCopyFlags() != null)
            sb.append("SecurityDescriptorCopyFlags: ").append(getSecurityDescriptorCopyFlags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Options == false)
            return false;
        Options other = (Options) obj;
        if (other.getVerifyMode() == null ^ this.getVerifyMode() == null)
            return false;
        if (other.getVerifyMode() != null && other.getVerifyMode().equals(this.getVerifyMode()) == false)
            return false;
        if (other.getOverwriteMode() == null ^ this.getOverwriteMode() == null)
            return false;
        if (other.getOverwriteMode() != null && other.getOverwriteMode().equals(this.getOverwriteMode()) == false)
            return false;
        if (other.getAtime() == null ^ this.getAtime() == null)
            return false;
        if (other.getAtime() != null && other.getAtime().equals(this.getAtime()) == false)
            return false;
        if (other.getMtime() == null ^ this.getMtime() == null)
            return false;
        if (other.getMtime() != null && other.getMtime().equals(this.getMtime()) == false)
            return false;
        if (other.getUid() == null ^ this.getUid() == null)
            return false;
        if (other.getUid() != null && other.getUid().equals(this.getUid()) == false)
            return false;
        if (other.getGid() == null ^ this.getGid() == null)
            return false;
        if (other.getGid() != null && other.getGid().equals(this.getGid()) == false)
            return false;
        if (other.getPreserveDeletedFiles() == null ^ this.getPreserveDeletedFiles() == null)
            return false;
        if (other.getPreserveDeletedFiles() != null && other.getPreserveDeletedFiles().equals(this.getPreserveDeletedFiles()) == false)
            return false;
        if (other.getPreserveDevices() == null ^ this.getPreserveDevices() == null)
            return false;
        if (other.getPreserveDevices() != null && other.getPreserveDevices().equals(this.getPreserveDevices()) == false)
            return false;
        if (other.getPosixPermissions() == null ^ this.getPosixPermissions() == null)
            return false;
        if (other.getPosixPermissions() != null && other.getPosixPermissions().equals(this.getPosixPermissions()) == false)
            return false;
        if (other.getBytesPerSecond() == null ^ this.getBytesPerSecond() == null)
            return false;
        if (other.getBytesPerSecond() != null && other.getBytesPerSecond().equals(this.getBytesPerSecond()) == false)
            return false;
        if (other.getTaskQueueing() == null ^ this.getTaskQueueing() == null)
            return false;
        if (other.getTaskQueueing() != null && other.getTaskQueueing().equals(this.getTaskQueueing()) == false)
            return false;
        if (other.getLogLevel() == null ^ this.getLogLevel() == null)
            return false;
        if (other.getLogLevel() != null && other.getLogLevel().equals(this.getLogLevel()) == false)
            return false;
        if (other.getTransferMode() == null ^ this.getTransferMode() == null)
            return false;
        if (other.getTransferMode() != null && other.getTransferMode().equals(this.getTransferMode()) == false)
            return false;
        if (other.getSecurityDescriptorCopyFlags() == null ^ this.getSecurityDescriptorCopyFlags() == null)
            return false;
        if (other.getSecurityDescriptorCopyFlags() != null && other.getSecurityDescriptorCopyFlags().equals(this.getSecurityDescriptorCopyFlags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVerifyMode() == null) ? 0 : getVerifyMode().hashCode());
        hashCode = prime * hashCode + ((getOverwriteMode() == null) ? 0 : getOverwriteMode().hashCode());
        hashCode = prime * hashCode + ((getAtime() == null) ? 0 : getAtime().hashCode());
        hashCode = prime * hashCode + ((getMtime() == null) ? 0 : getMtime().hashCode());
        hashCode = prime * hashCode + ((getUid() == null) ? 0 : getUid().hashCode());
        hashCode = prime * hashCode + ((getGid() == null) ? 0 : getGid().hashCode());
        hashCode = prime * hashCode + ((getPreserveDeletedFiles() == null) ? 0 : getPreserveDeletedFiles().hashCode());
        hashCode = prime * hashCode + ((getPreserveDevices() == null) ? 0 : getPreserveDevices().hashCode());
        hashCode = prime * hashCode + ((getPosixPermissions() == null) ? 0 : getPosixPermissions().hashCode());
        hashCode = prime * hashCode + ((getBytesPerSecond() == null) ? 0 : getBytesPerSecond().hashCode());
        hashCode = prime * hashCode + ((getTaskQueueing() == null) ? 0 : getTaskQueueing().hashCode());
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        hashCode = prime * hashCode + ((getTransferMode() == null) ? 0 : getTransferMode().hashCode());
        hashCode = prime * hashCode + ((getSecurityDescriptorCopyFlags() == null) ? 0 : getSecurityDescriptorCopyFlags().hashCode());
        return hashCode;
    }

    @Override
    public Options clone() {
        try {
            return (Options) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.OptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
