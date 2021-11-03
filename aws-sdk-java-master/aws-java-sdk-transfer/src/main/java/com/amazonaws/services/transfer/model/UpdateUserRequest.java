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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/UpdateUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The landing directory (folder) for a user when they log in to the server using the client.
     * </p>
     * <p>
     * A <code>HomeDirectory</code> example is <code>/bucket_name/home/mydirectory</code>.
     * </p>
     */
    private String homeDirectory;
    /**
     * <p>
     * The type of landing directory (folder) you want your users' home directory to be when they log into the server.
     * If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket or EFS paths as is in their
     * file transfer protocol clients. If you set it <code>LOGICAL</code>, you need to provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 or EFS paths visible to your users.
     * </p>
     */
    private String homeDirectoryType;
    /**
     * <p>
     * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be visible to your
     * user and how you want to make them visible. You must specify the <code>Entry</code> and <code>Target</code> pair,
     * where <code>Entry</code> shows how the path is made visible and <code>Target</code> is the actual Amazon S3 or
     * Amazon EFS path. If you only specify a target, it is displayed as is. You also must ensure that your Amazon Web
     * Services Identity and Access Management (IAM) role provides access to paths in <code>Target</code>. This value
     * can only be set when <code>HomeDirectoryType</code> is set to <i>LOGICAL</i>.
     * </p>
     * <p>
     * The following is an <code>Entry</code> and <code>Target</code> pair example.
     * </p>
     * <p>
     * <code>[ { "Entry": "/directory1", "Target": "/bucket_name/home/mydirectory" } ]</code>
     * </p>
     * <p>
     * In most cases, you can use this value instead of the session policy to lock down your user to the designated home
     * directory ("<code>chroot</code>"). To do this, you can set <code>Entry</code> to '/' and set <code>Target</code>
     * to the HomeDirectory parameter value.
     * </p>
     * <p>
     * The following is an <code>Entry</code> and <code>Target</code> pair example for <code>chroot</code>.
     * </p>
     * <p>
     * <code>[ { "Entry:": "/", "Target": "/bucket_name/home/mydirectory" } ]</code>
     * </p>
     * <note>
     * <p>
     * If the target of a logical directory entry does not exist in Amazon S3 or EFS, the entry is ignored. As a
     * workaround, you can use the Amazon S3 API or EFS API to create 0 byte objects as place holders for your
     * directory. If using the CLI, use the <code>s3api</code> or <code>efsapi</code> call instead of <code>s3</code> or
     * <code>efs</code> so you can use the put-object operation. For example, you use the following:
     * <code>aws s3api put-object --bucket bucketname --key path/to/folder/</code>. Make sure that the end of the key
     * name ends in a <code>/</code> for it to be considered a folder.
     * </p>
     * </note>
     */
    private java.util.List<HomeDirectoryMapEntry> homeDirectoryMappings;
    /**
     * <p>
     * A session policy for your user so that you can use the same IAM role across multiple users. This policy scopes
     * down user access to portions of their Amazon S3 bucket. Variables that you can use inside this policy include
     * <code>${Transfer:UserName}</code>, <code>${Transfer:HomeDirectory}</code>, and
     * <code>${Transfer:HomeBucket}</code>.
     * </p>
     * <note>
     * <p>
     * This only applies when the domain of <code>ServerId</code> is S3. EFS does not use session policies.
     * </p>
     * <p>
     * For session policies, Amazon Web Services Transfer Family stores the policy as a JSON blob, instead of the Amazon
     * Resource Name (ARN) of the policy. You save the policy as a JSON blob and pass it in the <code>Policy</code>
     * argument.
     * </p>
     * <p>
     * For an example of a session policy, see <a
     * href="https://docs.aws.amazon.com/transfer/latest/userguide/session-policy">Creating a session policy</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html">AssumeRole</a> in the <i>Amazon
     * Web Services Security Token Service API Reference</i>.
     * </p>
     * </note>
     */
    private String policy;
    /**
     * <p>
     * Specifies the full POSIX identity, including user ID (<code>Uid</code>), group ID (<code>Gid</code>), and any
     * secondary groups IDs (<code>SecondaryGids</code>), that controls your users' access to your Amazon Elastic File
     * Systems (Amazon EFS). The POSIX permissions that are set on files and directories in your file system determines
     * the level of access your users get when transferring files into and out of your Amazon EFS file systems.
     * </p>
     */
    private PosixProfile posixProfile;
    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the IAM role that controls your users' access to your Amazon S3
     * bucket or EFS file system. The policies attached to this role determine the level of access that you want to
     * provide your users when transferring files into and out of your Amazon S3 bucket or EFS file system. The IAM role
     * should also contain a trust relationship that allows the server to access your resources when servicing your
     * users' transfer requests.
     * </p>
     */
    private String role;
    /**
     * <p>
     * A system-assigned unique identifier for a server instance that the user account is assigned to.
     * </p>
     */
    private String serverId;
    /**
     * <p>
     * A unique string that identifies a user and is associated with a server as specified by the <code>ServerId</code>.
     * This user name must be a minimum of 3 and a maximum of 100 characters long. The following are valid characters:
     * a-z, A-Z, 0-9, underscore '_', hyphen '-', period '.', and at sign '@'. The user name can't start with a hyphen,
     * period, or at sign.
     * </p>
     */
    private String userName;

    /**
     * <p>
     * The landing directory (folder) for a user when they log in to the server using the client.
     * </p>
     * <p>
     * A <code>HomeDirectory</code> example is <code>/bucket_name/home/mydirectory</code>.
     * </p>
     * 
     * @param homeDirectory
     *        The landing directory (folder) for a user when they log in to the server using the client.</p>
     *        <p>
     *        A <code>HomeDirectory</code> example is <code>/bucket_name/home/mydirectory</code>.
     */

    public void setHomeDirectory(String homeDirectory) {
        this.homeDirectory = homeDirectory;
    }

    /**
     * <p>
     * The landing directory (folder) for a user when they log in to the server using the client.
     * </p>
     * <p>
     * A <code>HomeDirectory</code> example is <code>/bucket_name/home/mydirectory</code>.
     * </p>
     * 
     * @return The landing directory (folder) for a user when they log in to the server using the client.</p>
     *         <p>
     *         A <code>HomeDirectory</code> example is <code>/bucket_name/home/mydirectory</code>.
     */

    public String getHomeDirectory() {
        return this.homeDirectory;
    }

    /**
     * <p>
     * The landing directory (folder) for a user when they log in to the server using the client.
     * </p>
     * <p>
     * A <code>HomeDirectory</code> example is <code>/bucket_name/home/mydirectory</code>.
     * </p>
     * 
     * @param homeDirectory
     *        The landing directory (folder) for a user when they log in to the server using the client.</p>
     *        <p>
     *        A <code>HomeDirectory</code> example is <code>/bucket_name/home/mydirectory</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withHomeDirectory(String homeDirectory) {
        setHomeDirectory(homeDirectory);
        return this;
    }

    /**
     * <p>
     * The type of landing directory (folder) you want your users' home directory to be when they log into the server.
     * If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket or EFS paths as is in their
     * file transfer protocol clients. If you set it <code>LOGICAL</code>, you need to provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 or EFS paths visible to your users.
     * </p>
     * 
     * @param homeDirectoryType
     *        The type of landing directory (folder) you want your users' home directory to be when they log into the
     *        server. If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket or EFS paths
     *        as is in their file transfer protocol clients. If you set it <code>LOGICAL</code>, you need to provide
     *        mappings in the <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 or EFS paths visible
     *        to your users.
     * @see HomeDirectoryType
     */

    public void setHomeDirectoryType(String homeDirectoryType) {
        this.homeDirectoryType = homeDirectoryType;
    }

    /**
     * <p>
     * The type of landing directory (folder) you want your users' home directory to be when they log into the server.
     * If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket or EFS paths as is in their
     * file transfer protocol clients. If you set it <code>LOGICAL</code>, you need to provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 or EFS paths visible to your users.
     * </p>
     * 
     * @return The type of landing directory (folder) you want your users' home directory to be when they log into the
     *         server. If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket or EFS paths
     *         as is in their file transfer protocol clients. If you set it <code>LOGICAL</code>, you need to provide
     *         mappings in the <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 or EFS paths
     *         visible to your users.
     * @see HomeDirectoryType
     */

    public String getHomeDirectoryType() {
        return this.homeDirectoryType;
    }

    /**
     * <p>
     * The type of landing directory (folder) you want your users' home directory to be when they log into the server.
     * If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket or EFS paths as is in their
     * file transfer protocol clients. If you set it <code>LOGICAL</code>, you need to provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 or EFS paths visible to your users.
     * </p>
     * 
     * @param homeDirectoryType
     *        The type of landing directory (folder) you want your users' home directory to be when they log into the
     *        server. If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket or EFS paths
     *        as is in their file transfer protocol clients. If you set it <code>LOGICAL</code>, you need to provide
     *        mappings in the <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 or EFS paths visible
     *        to your users.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HomeDirectoryType
     */

    public UpdateUserRequest withHomeDirectoryType(String homeDirectoryType) {
        setHomeDirectoryType(homeDirectoryType);
        return this;
    }

    /**
     * <p>
     * The type of landing directory (folder) you want your users' home directory to be when they log into the server.
     * If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket or EFS paths as is in their
     * file transfer protocol clients. If you set it <code>LOGICAL</code>, you need to provide mappings in the
     * <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 or EFS paths visible to your users.
     * </p>
     * 
     * @param homeDirectoryType
     *        The type of landing directory (folder) you want your users' home directory to be when they log into the
     *        server. If you set it to <code>PATH</code>, the user will see the absolute Amazon S3 bucket or EFS paths
     *        as is in their file transfer protocol clients. If you set it <code>LOGICAL</code>, you need to provide
     *        mappings in the <code>HomeDirectoryMappings</code> for how you want to make Amazon S3 or EFS paths visible
     *        to your users.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HomeDirectoryType
     */

    public UpdateUserRequest withHomeDirectoryType(HomeDirectoryType homeDirectoryType) {
        this.homeDirectoryType = homeDirectoryType.toString();
        return this;
    }

    /**
     * <p>
     * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be visible to your
     * user and how you want to make them visible. You must specify the <code>Entry</code> and <code>Target</code> pair,
     * where <code>Entry</code> shows how the path is made visible and <code>Target</code> is the actual Amazon S3 or
     * Amazon EFS path. If you only specify a target, it is displayed as is. You also must ensure that your Amazon Web
     * Services Identity and Access Management (IAM) role provides access to paths in <code>Target</code>. This value
     * can only be set when <code>HomeDirectoryType</code> is set to <i>LOGICAL</i>.
     * </p>
     * <p>
     * The following is an <code>Entry</code> and <code>Target</code> pair example.
     * </p>
     * <p>
     * <code>[ { "Entry": "/directory1", "Target": "/bucket_name/home/mydirectory" } ]</code>
     * </p>
     * <p>
     * In most cases, you can use this value instead of the session policy to lock down your user to the designated home
     * directory ("<code>chroot</code>"). To do this, you can set <code>Entry</code> to '/' and set <code>Target</code>
     * to the HomeDirectory parameter value.
     * </p>
     * <p>
     * The following is an <code>Entry</code> and <code>Target</code> pair example for <code>chroot</code>.
     * </p>
     * <p>
     * <code>[ { "Entry:": "/", "Target": "/bucket_name/home/mydirectory" } ]</code>
     * </p>
     * <note>
     * <p>
     * If the target of a logical directory entry does not exist in Amazon S3 or EFS, the entry is ignored. As a
     * workaround, you can use the Amazon S3 API or EFS API to create 0 byte objects as place holders for your
     * directory. If using the CLI, use the <code>s3api</code> or <code>efsapi</code> call instead of <code>s3</code> or
     * <code>efs</code> so you can use the put-object operation. For example, you use the following:
     * <code>aws s3api put-object --bucket bucketname --key path/to/folder/</code>. Make sure that the end of the key
     * name ends in a <code>/</code> for it to be considered a folder.
     * </p>
     * </note>
     * 
     * @return Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be visible to
     *         your user and how you want to make them visible. You must specify the <code>Entry</code> and
     *         <code>Target</code> pair, where <code>Entry</code> shows how the path is made visible and
     *         <code>Target</code> is the actual Amazon S3 or Amazon EFS path. If you only specify a target, it is
     *         displayed as is. You also must ensure that your Amazon Web Services Identity and Access Management (IAM)
     *         role provides access to paths in <code>Target</code>. This value can only be set when
     *         <code>HomeDirectoryType</code> is set to <i>LOGICAL</i>.</p>
     *         <p>
     *         The following is an <code>Entry</code> and <code>Target</code> pair example.
     *         </p>
     *         <p>
     *         <code>[ { "Entry": "/directory1", "Target": "/bucket_name/home/mydirectory" } ]</code>
     *         </p>
     *         <p>
     *         In most cases, you can use this value instead of the session policy to lock down your user to the
     *         designated home directory ("<code>chroot</code>"). To do this, you can set <code>Entry</code> to '/' and
     *         set <code>Target</code> to the HomeDirectory parameter value.
     *         </p>
     *         <p>
     *         The following is an <code>Entry</code> and <code>Target</code> pair example for <code>chroot</code>.
     *         </p>
     *         <p>
     *         <code>[ { "Entry:": "/", "Target": "/bucket_name/home/mydirectory" } ]</code>
     *         </p>
     *         <note>
     *         <p>
     *         If the target of a logical directory entry does not exist in Amazon S3 or EFS, the entry is ignored. As a
     *         workaround, you can use the Amazon S3 API or EFS API to create 0 byte objects as place holders for your
     *         directory. If using the CLI, use the <code>s3api</code> or <code>efsapi</code> call instead of
     *         <code>s3</code> or <code>efs</code> so you can use the put-object operation. For example, you use the
     *         following: <code>aws s3api put-object --bucket bucketname --key path/to/folder/</code>. Make sure that
     *         the end of the key name ends in a <code>/</code> for it to be considered a folder.
     *         </p>
     */

    public java.util.List<HomeDirectoryMapEntry> getHomeDirectoryMappings() {
        return homeDirectoryMappings;
    }

    /**
     * <p>
     * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be visible to your
     * user and how you want to make them visible. You must specify the <code>Entry</code> and <code>Target</code> pair,
     * where <code>Entry</code> shows how the path is made visible and <code>Target</code> is the actual Amazon S3 or
     * Amazon EFS path. If you only specify a target, it is displayed as is. You also must ensure that your Amazon Web
     * Services Identity and Access Management (IAM) role provides access to paths in <code>Target</code>. This value
     * can only be set when <code>HomeDirectoryType</code> is set to <i>LOGICAL</i>.
     * </p>
     * <p>
     * The following is an <code>Entry</code> and <code>Target</code> pair example.
     * </p>
     * <p>
     * <code>[ { "Entry": "/directory1", "Target": "/bucket_name/home/mydirectory" } ]</code>
     * </p>
     * <p>
     * In most cases, you can use this value instead of the session policy to lock down your user to the designated home
     * directory ("<code>chroot</code>"). To do this, you can set <code>Entry</code> to '/' and set <code>Target</code>
     * to the HomeDirectory parameter value.
     * </p>
     * <p>
     * The following is an <code>Entry</code> and <code>Target</code> pair example for <code>chroot</code>.
     * </p>
     * <p>
     * <code>[ { "Entry:": "/", "Target": "/bucket_name/home/mydirectory" } ]</code>
     * </p>
     * <note>
     * <p>
     * If the target of a logical directory entry does not exist in Amazon S3 or EFS, the entry is ignored. As a
     * workaround, you can use the Amazon S3 API or EFS API to create 0 byte objects as place holders for your
     * directory. If using the CLI, use the <code>s3api</code> or <code>efsapi</code> call instead of <code>s3</code> or
     * <code>efs</code> so you can use the put-object operation. For example, you use the following:
     * <code>aws s3api put-object --bucket bucketname --key path/to/folder/</code>. Make sure that the end of the key
     * name ends in a <code>/</code> for it to be considered a folder.
     * </p>
     * </note>
     * 
     * @param homeDirectoryMappings
     *        Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be visible to
     *        your user and how you want to make them visible. You must specify the <code>Entry</code> and
     *        <code>Target</code> pair, where <code>Entry</code> shows how the path is made visible and
     *        <code>Target</code> is the actual Amazon S3 or Amazon EFS path. If you only specify a target, it is
     *        displayed as is. You also must ensure that your Amazon Web Services Identity and Access Management (IAM)
     *        role provides access to paths in <code>Target</code>. This value can only be set when
     *        <code>HomeDirectoryType</code> is set to <i>LOGICAL</i>.</p>
     *        <p>
     *        The following is an <code>Entry</code> and <code>Target</code> pair example.
     *        </p>
     *        <p>
     *        <code>[ { "Entry": "/directory1", "Target": "/bucket_name/home/mydirectory" } ]</code>
     *        </p>
     *        <p>
     *        In most cases, you can use this value instead of the session policy to lock down your user to the
     *        designated home directory ("<code>chroot</code>"). To do this, you can set <code>Entry</code> to '/' and
     *        set <code>Target</code> to the HomeDirectory parameter value.
     *        </p>
     *        <p>
     *        The following is an <code>Entry</code> and <code>Target</code> pair example for <code>chroot</code>.
     *        </p>
     *        <p>
     *        <code>[ { "Entry:": "/", "Target": "/bucket_name/home/mydirectory" } ]</code>
     *        </p>
     *        <note>
     *        <p>
     *        If the target of a logical directory entry does not exist in Amazon S3 or EFS, the entry is ignored. As a
     *        workaround, you can use the Amazon S3 API or EFS API to create 0 byte objects as place holders for your
     *        directory. If using the CLI, use the <code>s3api</code> or <code>efsapi</code> call instead of
     *        <code>s3</code> or <code>efs</code> so you can use the put-object operation. For example, you use the
     *        following: <code>aws s3api put-object --bucket bucketname --key path/to/folder/</code>. Make sure that the
     *        end of the key name ends in a <code>/</code> for it to be considered a folder.
     *        </p>
     */

    public void setHomeDirectoryMappings(java.util.Collection<HomeDirectoryMapEntry> homeDirectoryMappings) {
        if (homeDirectoryMappings == null) {
            this.homeDirectoryMappings = null;
            return;
        }

        this.homeDirectoryMappings = new java.util.ArrayList<HomeDirectoryMapEntry>(homeDirectoryMappings);
    }

    /**
     * <p>
     * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be visible to your
     * user and how you want to make them visible. You must specify the <code>Entry</code> and <code>Target</code> pair,
     * where <code>Entry</code> shows how the path is made visible and <code>Target</code> is the actual Amazon S3 or
     * Amazon EFS path. If you only specify a target, it is displayed as is. You also must ensure that your Amazon Web
     * Services Identity and Access Management (IAM) role provides access to paths in <code>Target</code>. This value
     * can only be set when <code>HomeDirectoryType</code> is set to <i>LOGICAL</i>.
     * </p>
     * <p>
     * The following is an <code>Entry</code> and <code>Target</code> pair example.
     * </p>
     * <p>
     * <code>[ { "Entry": "/directory1", "Target": "/bucket_name/home/mydirectory" } ]</code>
     * </p>
     * <p>
     * In most cases, you can use this value instead of the session policy to lock down your user to the designated home
     * directory ("<code>chroot</code>"). To do this, you can set <code>Entry</code> to '/' and set <code>Target</code>
     * to the HomeDirectory parameter value.
     * </p>
     * <p>
     * The following is an <code>Entry</code> and <code>Target</code> pair example for <code>chroot</code>.
     * </p>
     * <p>
     * <code>[ { "Entry:": "/", "Target": "/bucket_name/home/mydirectory" } ]</code>
     * </p>
     * <note>
     * <p>
     * If the target of a logical directory entry does not exist in Amazon S3 or EFS, the entry is ignored. As a
     * workaround, you can use the Amazon S3 API or EFS API to create 0 byte objects as place holders for your
     * directory. If using the CLI, use the <code>s3api</code> or <code>efsapi</code> call instead of <code>s3</code> or
     * <code>efs</code> so you can use the put-object operation. For example, you use the following:
     * <code>aws s3api put-object --bucket bucketname --key path/to/folder/</code>. Make sure that the end of the key
     * name ends in a <code>/</code> for it to be considered a folder.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHomeDirectoryMappings(java.util.Collection)} or
     * {@link #withHomeDirectoryMappings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param homeDirectoryMappings
     *        Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be visible to
     *        your user and how you want to make them visible. You must specify the <code>Entry</code> and
     *        <code>Target</code> pair, where <code>Entry</code> shows how the path is made visible and
     *        <code>Target</code> is the actual Amazon S3 or Amazon EFS path. If you only specify a target, it is
     *        displayed as is. You also must ensure that your Amazon Web Services Identity and Access Management (IAM)
     *        role provides access to paths in <code>Target</code>. This value can only be set when
     *        <code>HomeDirectoryType</code> is set to <i>LOGICAL</i>.</p>
     *        <p>
     *        The following is an <code>Entry</code> and <code>Target</code> pair example.
     *        </p>
     *        <p>
     *        <code>[ { "Entry": "/directory1", "Target": "/bucket_name/home/mydirectory" } ]</code>
     *        </p>
     *        <p>
     *        In most cases, you can use this value instead of the session policy to lock down your user to the
     *        designated home directory ("<code>chroot</code>"). To do this, you can set <code>Entry</code> to '/' and
     *        set <code>Target</code> to the HomeDirectory parameter value.
     *        </p>
     *        <p>
     *        The following is an <code>Entry</code> and <code>Target</code> pair example for <code>chroot</code>.
     *        </p>
     *        <p>
     *        <code>[ { "Entry:": "/", "Target": "/bucket_name/home/mydirectory" } ]</code>
     *        </p>
     *        <note>
     *        <p>
     *        If the target of a logical directory entry does not exist in Amazon S3 or EFS, the entry is ignored. As a
     *        workaround, you can use the Amazon S3 API or EFS API to create 0 byte objects as place holders for your
     *        directory. If using the CLI, use the <code>s3api</code> or <code>efsapi</code> call instead of
     *        <code>s3</code> or <code>efs</code> so you can use the put-object operation. For example, you use the
     *        following: <code>aws s3api put-object --bucket bucketname --key path/to/folder/</code>. Make sure that the
     *        end of the key name ends in a <code>/</code> for it to be considered a folder.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withHomeDirectoryMappings(HomeDirectoryMapEntry... homeDirectoryMappings) {
        if (this.homeDirectoryMappings == null) {
            setHomeDirectoryMappings(new java.util.ArrayList<HomeDirectoryMapEntry>(homeDirectoryMappings.length));
        }
        for (HomeDirectoryMapEntry ele : homeDirectoryMappings) {
            this.homeDirectoryMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be visible to your
     * user and how you want to make them visible. You must specify the <code>Entry</code> and <code>Target</code> pair,
     * where <code>Entry</code> shows how the path is made visible and <code>Target</code> is the actual Amazon S3 or
     * Amazon EFS path. If you only specify a target, it is displayed as is. You also must ensure that your Amazon Web
     * Services Identity and Access Management (IAM) role provides access to paths in <code>Target</code>. This value
     * can only be set when <code>HomeDirectoryType</code> is set to <i>LOGICAL</i>.
     * </p>
     * <p>
     * The following is an <code>Entry</code> and <code>Target</code> pair example.
     * </p>
     * <p>
     * <code>[ { "Entry": "/directory1", "Target": "/bucket_name/home/mydirectory" } ]</code>
     * </p>
     * <p>
     * In most cases, you can use this value instead of the session policy to lock down your user to the designated home
     * directory ("<code>chroot</code>"). To do this, you can set <code>Entry</code> to '/' and set <code>Target</code>
     * to the HomeDirectory parameter value.
     * </p>
     * <p>
     * The following is an <code>Entry</code> and <code>Target</code> pair example for <code>chroot</code>.
     * </p>
     * <p>
     * <code>[ { "Entry:": "/", "Target": "/bucket_name/home/mydirectory" } ]</code>
     * </p>
     * <note>
     * <p>
     * If the target of a logical directory entry does not exist in Amazon S3 or EFS, the entry is ignored. As a
     * workaround, you can use the Amazon S3 API or EFS API to create 0 byte objects as place holders for your
     * directory. If using the CLI, use the <code>s3api</code> or <code>efsapi</code> call instead of <code>s3</code> or
     * <code>efs</code> so you can use the put-object operation. For example, you use the following:
     * <code>aws s3api put-object --bucket bucketname --key path/to/folder/</code>. Make sure that the end of the key
     * name ends in a <code>/</code> for it to be considered a folder.
     * </p>
     * </note>
     * 
     * @param homeDirectoryMappings
     *        Logical directory mappings that specify what Amazon S3 or Amazon EFS paths and keys should be visible to
     *        your user and how you want to make them visible. You must specify the <code>Entry</code> and
     *        <code>Target</code> pair, where <code>Entry</code> shows how the path is made visible and
     *        <code>Target</code> is the actual Amazon S3 or Amazon EFS path. If you only specify a target, it is
     *        displayed as is. You also must ensure that your Amazon Web Services Identity and Access Management (IAM)
     *        role provides access to paths in <code>Target</code>. This value can only be set when
     *        <code>HomeDirectoryType</code> is set to <i>LOGICAL</i>.</p>
     *        <p>
     *        The following is an <code>Entry</code> and <code>Target</code> pair example.
     *        </p>
     *        <p>
     *        <code>[ { "Entry": "/directory1", "Target": "/bucket_name/home/mydirectory" } ]</code>
     *        </p>
     *        <p>
     *        In most cases, you can use this value instead of the session policy to lock down your user to the
     *        designated home directory ("<code>chroot</code>"). To do this, you can set <code>Entry</code> to '/' and
     *        set <code>Target</code> to the HomeDirectory parameter value.
     *        </p>
     *        <p>
     *        The following is an <code>Entry</code> and <code>Target</code> pair example for <code>chroot</code>.
     *        </p>
     *        <p>
     *        <code>[ { "Entry:": "/", "Target": "/bucket_name/home/mydirectory" } ]</code>
     *        </p>
     *        <note>
     *        <p>
     *        If the target of a logical directory entry does not exist in Amazon S3 or EFS, the entry is ignored. As a
     *        workaround, you can use the Amazon S3 API or EFS API to create 0 byte objects as place holders for your
     *        directory. If using the CLI, use the <code>s3api</code> or <code>efsapi</code> call instead of
     *        <code>s3</code> or <code>efs</code> so you can use the put-object operation. For example, you use the
     *        following: <code>aws s3api put-object --bucket bucketname --key path/to/folder/</code>. Make sure that the
     *        end of the key name ends in a <code>/</code> for it to be considered a folder.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withHomeDirectoryMappings(java.util.Collection<HomeDirectoryMapEntry> homeDirectoryMappings) {
        setHomeDirectoryMappings(homeDirectoryMappings);
        return this;
    }

    /**
     * <p>
     * A session policy for your user so that you can use the same IAM role across multiple users. This policy scopes
     * down user access to portions of their Amazon S3 bucket. Variables that you can use inside this policy include
     * <code>${Transfer:UserName}</code>, <code>${Transfer:HomeDirectory}</code>, and
     * <code>${Transfer:HomeBucket}</code>.
     * </p>
     * <note>
     * <p>
     * This only applies when the domain of <code>ServerId</code> is S3. EFS does not use session policies.
     * </p>
     * <p>
     * For session policies, Amazon Web Services Transfer Family stores the policy as a JSON blob, instead of the Amazon
     * Resource Name (ARN) of the policy. You save the policy as a JSON blob and pass it in the <code>Policy</code>
     * argument.
     * </p>
     * <p>
     * For an example of a session policy, see <a
     * href="https://docs.aws.amazon.com/transfer/latest/userguide/session-policy">Creating a session policy</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html">AssumeRole</a> in the <i>Amazon
     * Web Services Security Token Service API Reference</i>.
     * </p>
     * </note>
     * 
     * @param policy
     *        A session policy for your user so that you can use the same IAM role across multiple users. This policy
     *        scopes down user access to portions of their Amazon S3 bucket. Variables that you can use inside this
     *        policy include <code>${Transfer:UserName}</code>, <code>${Transfer:HomeDirectory}</code>, and
     *        <code>${Transfer:HomeBucket}</code>.</p> <note>
     *        <p>
     *        This only applies when the domain of <code>ServerId</code> is S3. EFS does not use session policies.
     *        </p>
     *        <p>
     *        For session policies, Amazon Web Services Transfer Family stores the policy as a JSON blob, instead of the
     *        Amazon Resource Name (ARN) of the policy. You save the policy as a JSON blob and pass it in the
     *        <code>Policy</code> argument.
     *        </p>
     *        <p>
     *        For an example of a session policy, see <a
     *        href="https://docs.aws.amazon.com/transfer/latest/userguide/session-policy">Creating a session policy</a>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html">AssumeRole</a> in the
     *        <i>Amazon Web Services Security Token Service API Reference</i>.
     *        </p>
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * A session policy for your user so that you can use the same IAM role across multiple users. This policy scopes
     * down user access to portions of their Amazon S3 bucket. Variables that you can use inside this policy include
     * <code>${Transfer:UserName}</code>, <code>${Transfer:HomeDirectory}</code>, and
     * <code>${Transfer:HomeBucket}</code>.
     * </p>
     * <note>
     * <p>
     * This only applies when the domain of <code>ServerId</code> is S3. EFS does not use session policies.
     * </p>
     * <p>
     * For session policies, Amazon Web Services Transfer Family stores the policy as a JSON blob, instead of the Amazon
     * Resource Name (ARN) of the policy. You save the policy as a JSON blob and pass it in the <code>Policy</code>
     * argument.
     * </p>
     * <p>
     * For an example of a session policy, see <a
     * href="https://docs.aws.amazon.com/transfer/latest/userguide/session-policy">Creating a session policy</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html">AssumeRole</a> in the <i>Amazon
     * Web Services Security Token Service API Reference</i>.
     * </p>
     * </note>
     * 
     * @return A session policy for your user so that you can use the same IAM role across multiple users. This policy
     *         scopes down user access to portions of their Amazon S3 bucket. Variables that you can use inside this
     *         policy include <code>${Transfer:UserName}</code>, <code>${Transfer:HomeDirectory}</code>, and
     *         <code>${Transfer:HomeBucket}</code>.</p> <note>
     *         <p>
     *         This only applies when the domain of <code>ServerId</code> is S3. EFS does not use session policies.
     *         </p>
     *         <p>
     *         For session policies, Amazon Web Services Transfer Family stores the policy as a JSON blob, instead of
     *         the Amazon Resource Name (ARN) of the policy. You save the policy as a JSON blob and pass it in the
     *         <code>Policy</code> argument.
     *         </p>
     *         <p>
     *         For an example of a session policy, see <a
     *         href="https://docs.aws.amazon.com/transfer/latest/userguide/session-policy">Creating a session
     *         policy</a>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html">AssumeRole</a> in the
     *         <i>Amazon Web Services Security Token Service API Reference</i>.
     *         </p>
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * A session policy for your user so that you can use the same IAM role across multiple users. This policy scopes
     * down user access to portions of their Amazon S3 bucket. Variables that you can use inside this policy include
     * <code>${Transfer:UserName}</code>, <code>${Transfer:HomeDirectory}</code>, and
     * <code>${Transfer:HomeBucket}</code>.
     * </p>
     * <note>
     * <p>
     * This only applies when the domain of <code>ServerId</code> is S3. EFS does not use session policies.
     * </p>
     * <p>
     * For session policies, Amazon Web Services Transfer Family stores the policy as a JSON blob, instead of the Amazon
     * Resource Name (ARN) of the policy. You save the policy as a JSON blob and pass it in the <code>Policy</code>
     * argument.
     * </p>
     * <p>
     * For an example of a session policy, see <a
     * href="https://docs.aws.amazon.com/transfer/latest/userguide/session-policy">Creating a session policy</a>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html">AssumeRole</a> in the <i>Amazon
     * Web Services Security Token Service API Reference</i>.
     * </p>
     * </note>
     * 
     * @param policy
     *        A session policy for your user so that you can use the same IAM role across multiple users. This policy
     *        scopes down user access to portions of their Amazon S3 bucket. Variables that you can use inside this
     *        policy include <code>${Transfer:UserName}</code>, <code>${Transfer:HomeDirectory}</code>, and
     *        <code>${Transfer:HomeBucket}</code>.</p> <note>
     *        <p>
     *        This only applies when the domain of <code>ServerId</code> is S3. EFS does not use session policies.
     *        </p>
     *        <p>
     *        For session policies, Amazon Web Services Transfer Family stores the policy as a JSON blob, instead of the
     *        Amazon Resource Name (ARN) of the policy. You save the policy as a JSON blob and pass it in the
     *        <code>Policy</code> argument.
     *        </p>
     *        <p>
     *        For an example of a session policy, see <a
     *        href="https://docs.aws.amazon.com/transfer/latest/userguide/session-policy">Creating a session policy</a>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/STS/latest/APIReference/API_AssumeRole.html">AssumeRole</a> in the
     *        <i>Amazon Web Services Security Token Service API Reference</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * Specifies the full POSIX identity, including user ID (<code>Uid</code>), group ID (<code>Gid</code>), and any
     * secondary groups IDs (<code>SecondaryGids</code>), that controls your users' access to your Amazon Elastic File
     * Systems (Amazon EFS). The POSIX permissions that are set on files and directories in your file system determines
     * the level of access your users get when transferring files into and out of your Amazon EFS file systems.
     * </p>
     * 
     * @param posixProfile
     *        Specifies the full POSIX identity, including user ID (<code>Uid</code>), group ID (<code>Gid</code>), and
     *        any secondary groups IDs (<code>SecondaryGids</code>), that controls your users' access to your Amazon
     *        Elastic File Systems (Amazon EFS). The POSIX permissions that are set on files and directories in your
     *        file system determines the level of access your users get when transferring files into and out of your
     *        Amazon EFS file systems.
     */

    public void setPosixProfile(PosixProfile posixProfile) {
        this.posixProfile = posixProfile;
    }

    /**
     * <p>
     * Specifies the full POSIX identity, including user ID (<code>Uid</code>), group ID (<code>Gid</code>), and any
     * secondary groups IDs (<code>SecondaryGids</code>), that controls your users' access to your Amazon Elastic File
     * Systems (Amazon EFS). The POSIX permissions that are set on files and directories in your file system determines
     * the level of access your users get when transferring files into and out of your Amazon EFS file systems.
     * </p>
     * 
     * @return Specifies the full POSIX identity, including user ID (<code>Uid</code>), group ID (<code>Gid</code>), and
     *         any secondary groups IDs (<code>SecondaryGids</code>), that controls your users' access to your Amazon
     *         Elastic File Systems (Amazon EFS). The POSIX permissions that are set on files and directories in your
     *         file system determines the level of access your users get when transferring files into and out of your
     *         Amazon EFS file systems.
     */

    public PosixProfile getPosixProfile() {
        return this.posixProfile;
    }

    /**
     * <p>
     * Specifies the full POSIX identity, including user ID (<code>Uid</code>), group ID (<code>Gid</code>), and any
     * secondary groups IDs (<code>SecondaryGids</code>), that controls your users' access to your Amazon Elastic File
     * Systems (Amazon EFS). The POSIX permissions that are set on files and directories in your file system determines
     * the level of access your users get when transferring files into and out of your Amazon EFS file systems.
     * </p>
     * 
     * @param posixProfile
     *        Specifies the full POSIX identity, including user ID (<code>Uid</code>), group ID (<code>Gid</code>), and
     *        any secondary groups IDs (<code>SecondaryGids</code>), that controls your users' access to your Amazon
     *        Elastic File Systems (Amazon EFS). The POSIX permissions that are set on files and directories in your
     *        file system determines the level of access your users get when transferring files into and out of your
     *        Amazon EFS file systems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withPosixProfile(PosixProfile posixProfile) {
        setPosixProfile(posixProfile);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the IAM role that controls your users' access to your Amazon S3
     * bucket or EFS file system. The policies attached to this role determine the level of access that you want to
     * provide your users when transferring files into and out of your Amazon S3 bucket or EFS file system. The IAM role
     * should also contain a trust relationship that allows the server to access your resources when servicing your
     * users' transfer requests.
     * </p>
     * 
     * @param role
     *        Specifies the Amazon Resource Name (ARN) of the IAM role that controls your users' access to your Amazon
     *        S3 bucket or EFS file system. The policies attached to this role determine the level of access that you
     *        want to provide your users when transferring files into and out of your Amazon S3 bucket or EFS file
     *        system. The IAM role should also contain a trust relationship that allows the server to access your
     *        resources when servicing your users' transfer requests.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the IAM role that controls your users' access to your Amazon S3
     * bucket or EFS file system. The policies attached to this role determine the level of access that you want to
     * provide your users when transferring files into and out of your Amazon S3 bucket or EFS file system. The IAM role
     * should also contain a trust relationship that allows the server to access your resources when servicing your
     * users' transfer requests.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the IAM role that controls your users' access to your Amazon
     *         S3 bucket or EFS file system. The policies attached to this role determine the level of access that you
     *         want to provide your users when transferring files into and out of your Amazon S3 bucket or EFS file
     *         system. The IAM role should also contain a trust relationship that allows the server to access your
     *         resources when servicing your users' transfer requests.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the IAM role that controls your users' access to your Amazon S3
     * bucket or EFS file system. The policies attached to this role determine the level of access that you want to
     * provide your users when transferring files into and out of your Amazon S3 bucket or EFS file system. The IAM role
     * should also contain a trust relationship that allows the server to access your resources when servicing your
     * users' transfer requests.
     * </p>
     * 
     * @param role
     *        Specifies the Amazon Resource Name (ARN) of the IAM role that controls your users' access to your Amazon
     *        S3 bucket or EFS file system. The policies attached to this role determine the level of access that you
     *        want to provide your users when transferring files into and out of your Amazon S3 bucket or EFS file
     *        system. The IAM role should also contain a trust relationship that allows the server to access your
     *        resources when servicing your users' transfer requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a server instance that the user account is assigned to.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for a server instance that the user account is assigned to.
     */

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a server instance that the user account is assigned to.
     * </p>
     * 
     * @return A system-assigned unique identifier for a server instance that the user account is assigned to.
     */

    public String getServerId() {
        return this.serverId;
    }

    /**
     * <p>
     * A system-assigned unique identifier for a server instance that the user account is assigned to.
     * </p>
     * 
     * @param serverId
     *        A system-assigned unique identifier for a server instance that the user account is assigned to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withServerId(String serverId) {
        setServerId(serverId);
        return this;
    }

    /**
     * <p>
     * A unique string that identifies a user and is associated with a server as specified by the <code>ServerId</code>.
     * This user name must be a minimum of 3 and a maximum of 100 characters long. The following are valid characters:
     * a-z, A-Z, 0-9, underscore '_', hyphen '-', period '.', and at sign '@'. The user name can't start with a hyphen,
     * period, or at sign.
     * </p>
     * 
     * @param userName
     *        A unique string that identifies a user and is associated with a server as specified by the
     *        <code>ServerId</code>. This user name must be a minimum of 3 and a maximum of 100 characters long. The
     *        following are valid characters: a-z, A-Z, 0-9, underscore '_', hyphen '-', period '.', and at sign '@'.
     *        The user name can't start with a hyphen, period, or at sign.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * A unique string that identifies a user and is associated with a server as specified by the <code>ServerId</code>.
     * This user name must be a minimum of 3 and a maximum of 100 characters long. The following are valid characters:
     * a-z, A-Z, 0-9, underscore '_', hyphen '-', period '.', and at sign '@'. The user name can't start with a hyphen,
     * period, or at sign.
     * </p>
     * 
     * @return A unique string that identifies a user and is associated with a server as specified by the
     *         <code>ServerId</code>. This user name must be a minimum of 3 and a maximum of 100 characters long. The
     *         following are valid characters: a-z, A-Z, 0-9, underscore '_', hyphen '-', period '.', and at sign '@'.
     *         The user name can't start with a hyphen, period, or at sign.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * A unique string that identifies a user and is associated with a server as specified by the <code>ServerId</code>.
     * This user name must be a minimum of 3 and a maximum of 100 characters long. The following are valid characters:
     * a-z, A-Z, 0-9, underscore '_', hyphen '-', period '.', and at sign '@'. The user name can't start with a hyphen,
     * period, or at sign.
     * </p>
     * 
     * @param userName
     *        A unique string that identifies a user and is associated with a server as specified by the
     *        <code>ServerId</code>. This user name must be a minimum of 3 and a maximum of 100 characters long. The
     *        following are valid characters: a-z, A-Z, 0-9, underscore '_', hyphen '-', period '.', and at sign '@'.
     *        The user name can't start with a hyphen, period, or at sign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateUserRequest withUserName(String userName) {
        setUserName(userName);
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
        if (getHomeDirectory() != null)
            sb.append("HomeDirectory: ").append(getHomeDirectory()).append(",");
        if (getHomeDirectoryType() != null)
            sb.append("HomeDirectoryType: ").append(getHomeDirectoryType()).append(",");
        if (getHomeDirectoryMappings() != null)
            sb.append("HomeDirectoryMappings: ").append(getHomeDirectoryMappings()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getPosixProfile() != null)
            sb.append("PosixProfile: ").append(getPosixProfile()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getServerId() != null)
            sb.append("ServerId: ").append(getServerId()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserRequest == false)
            return false;
        UpdateUserRequest other = (UpdateUserRequest) obj;
        if (other.getHomeDirectory() == null ^ this.getHomeDirectory() == null)
            return false;
        if (other.getHomeDirectory() != null && other.getHomeDirectory().equals(this.getHomeDirectory()) == false)
            return false;
        if (other.getHomeDirectoryType() == null ^ this.getHomeDirectoryType() == null)
            return false;
        if (other.getHomeDirectoryType() != null && other.getHomeDirectoryType().equals(this.getHomeDirectoryType()) == false)
            return false;
        if (other.getHomeDirectoryMappings() == null ^ this.getHomeDirectoryMappings() == null)
            return false;
        if (other.getHomeDirectoryMappings() != null && other.getHomeDirectoryMappings().equals(this.getHomeDirectoryMappings()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getPosixProfile() == null ^ this.getPosixProfile() == null)
            return false;
        if (other.getPosixProfile() != null && other.getPosixProfile().equals(this.getPosixProfile()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHomeDirectory() == null) ? 0 : getHomeDirectory().hashCode());
        hashCode = prime * hashCode + ((getHomeDirectoryType() == null) ? 0 : getHomeDirectoryType().hashCode());
        hashCode = prime * hashCode + ((getHomeDirectoryMappings() == null) ? 0 : getHomeDirectoryMappings().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getPosixProfile() == null) ? 0 : getPosixProfile().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserRequest clone() {
        return (UpdateUserRequest) super.clone();
    }

}
