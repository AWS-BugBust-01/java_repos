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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a key pair.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/KeyPairInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyPairInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the key pair.
     * </p>
     */
    private String keyPairId;
    /**
     * <p>
     * If you used <a>CreateKeyPair</a> to create the key pair:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For RSA key pairs, the key fingerprint is the SHA-1 digest of the DER encoded private key.
     * </p>
     * </li>
     * <li>
     * <p>
     * For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the default for
     * OpenSSH, starting with <a href="http://www.openssh.com/txt/release-6.8">OpenSSH 6.8</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you used <a>ImportKeyPair</a> to provide Amazon Web Services the public key:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For RSA key pairs, the key fingerprint is the MD5 public key fingerprint as specified in section 4 of RFC4716.
     * </p>
     * </li>
     * <li>
     * <p>
     * For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the default for
     * OpenSSH, starting with <a href="http://www.openssh.com/txt/release-6.8">OpenSSH 6.8</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String keyFingerprint;
    /**
     * <p>
     * The name of the key pair.
     * </p>
     */
    private String keyName;
    /**
     * <p>
     * The type of key pair.
     * </p>
     */
    private String keyType;
    /**
     * <p>
     * Any tags applied to the key pair.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the key pair.
     * </p>
     * 
     * @param keyPairId
     *        The ID of the key pair.
     */

    public void setKeyPairId(String keyPairId) {
        this.keyPairId = keyPairId;
    }

    /**
     * <p>
     * The ID of the key pair.
     * </p>
     * 
     * @return The ID of the key pair.
     */

    public String getKeyPairId() {
        return this.keyPairId;
    }

    /**
     * <p>
     * The ID of the key pair.
     * </p>
     * 
     * @param keyPairId
     *        The ID of the key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyPairInfo withKeyPairId(String keyPairId) {
        setKeyPairId(keyPairId);
        return this;
    }

    /**
     * <p>
     * If you used <a>CreateKeyPair</a> to create the key pair:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For RSA key pairs, the key fingerprint is the SHA-1 digest of the DER encoded private key.
     * </p>
     * </li>
     * <li>
     * <p>
     * For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the default for
     * OpenSSH, starting with <a href="http://www.openssh.com/txt/release-6.8">OpenSSH 6.8</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you used <a>ImportKeyPair</a> to provide Amazon Web Services the public key:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For RSA key pairs, the key fingerprint is the MD5 public key fingerprint as specified in section 4 of RFC4716.
     * </p>
     * </li>
     * <li>
     * <p>
     * For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the default for
     * OpenSSH, starting with <a href="http://www.openssh.com/txt/release-6.8">OpenSSH 6.8</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyFingerprint
     *        If you used <a>CreateKeyPair</a> to create the key pair:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For RSA key pairs, the key fingerprint is the SHA-1 digest of the DER encoded private key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the default for
     *        OpenSSH, starting with <a href="http://www.openssh.com/txt/release-6.8">OpenSSH 6.8</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you used <a>ImportKeyPair</a> to provide Amazon Web Services the public key:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For RSA key pairs, the key fingerprint is the MD5 public key fingerprint as specified in section 4 of
     *        RFC4716.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the default for
     *        OpenSSH, starting with <a href="http://www.openssh.com/txt/release-6.8">OpenSSH 6.8</a>.
     *        </p>
     *        </li>
     */

    public void setKeyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
    }

    /**
     * <p>
     * If you used <a>CreateKeyPair</a> to create the key pair:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For RSA key pairs, the key fingerprint is the SHA-1 digest of the DER encoded private key.
     * </p>
     * </li>
     * <li>
     * <p>
     * For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the default for
     * OpenSSH, starting with <a href="http://www.openssh.com/txt/release-6.8">OpenSSH 6.8</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you used <a>ImportKeyPair</a> to provide Amazon Web Services the public key:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For RSA key pairs, the key fingerprint is the MD5 public key fingerprint as specified in section 4 of RFC4716.
     * </p>
     * </li>
     * <li>
     * <p>
     * For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the default for
     * OpenSSH, starting with <a href="http://www.openssh.com/txt/release-6.8">OpenSSH 6.8</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return If you used <a>CreateKeyPair</a> to create the key pair:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For RSA key pairs, the key fingerprint is the SHA-1 digest of the DER encoded private key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the default for
     *         OpenSSH, starting with <a href="http://www.openssh.com/txt/release-6.8">OpenSSH 6.8</a>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you used <a>ImportKeyPair</a> to provide Amazon Web Services the public key:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For RSA key pairs, the key fingerprint is the MD5 public key fingerprint as specified in section 4 of
     *         RFC4716.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the default for
     *         OpenSSH, starting with <a href="http://www.openssh.com/txt/release-6.8">OpenSSH 6.8</a>.
     *         </p>
     *         </li>
     */

    public String getKeyFingerprint() {
        return this.keyFingerprint;
    }

    /**
     * <p>
     * If you used <a>CreateKeyPair</a> to create the key pair:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For RSA key pairs, the key fingerprint is the SHA-1 digest of the DER encoded private key.
     * </p>
     * </li>
     * <li>
     * <p>
     * For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the default for
     * OpenSSH, starting with <a href="http://www.openssh.com/txt/release-6.8">OpenSSH 6.8</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you used <a>ImportKeyPair</a> to provide Amazon Web Services the public key:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For RSA key pairs, the key fingerprint is the MD5 public key fingerprint as specified in section 4 of RFC4716.
     * </p>
     * </li>
     * <li>
     * <p>
     * For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the default for
     * OpenSSH, starting with <a href="http://www.openssh.com/txt/release-6.8">OpenSSH 6.8</a>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param keyFingerprint
     *        If you used <a>CreateKeyPair</a> to create the key pair:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For RSA key pairs, the key fingerprint is the SHA-1 digest of the DER encoded private key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the default for
     *        OpenSSH, starting with <a href="http://www.openssh.com/txt/release-6.8">OpenSSH 6.8</a>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you used <a>ImportKeyPair</a> to provide Amazon Web Services the public key:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For RSA key pairs, the key fingerprint is the MD5 public key fingerprint as specified in section 4 of
     *        RFC4716.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the default for
     *        OpenSSH, starting with <a href="http://www.openssh.com/txt/release-6.8">OpenSSH 6.8</a>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyPairInfo withKeyFingerprint(String keyFingerprint) {
        setKeyFingerprint(keyFingerprint);
        return this;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * 
     * @return The name of the key pair.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyPairInfo withKeyName(String keyName) {
        setKeyName(keyName);
        return this;
    }

    /**
     * <p>
     * The type of key pair.
     * </p>
     * 
     * @param keyType
     *        The type of key pair.
     * @see KeyType
     */

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    /**
     * <p>
     * The type of key pair.
     * </p>
     * 
     * @return The type of key pair.
     * @see KeyType
     */

    public String getKeyType() {
        return this.keyType;
    }

    /**
     * <p>
     * The type of key pair.
     * </p>
     * 
     * @param keyType
     *        The type of key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyType
     */

    public KeyPairInfo withKeyType(String keyType) {
        setKeyType(keyType);
        return this;
    }

    /**
     * <p>
     * The type of key pair.
     * </p>
     * 
     * @param keyType
     *        The type of key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyType
     */

    public KeyPairInfo withKeyType(KeyType keyType) {
        this.keyType = keyType.toString();
        return this;
    }

    /**
     * <p>
     * Any tags applied to the key pair.
     * </p>
     * 
     * @return Any tags applied to the key pair.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags applied to the key pair.
     * </p>
     * 
     * @param tags
     *        Any tags applied to the key pair.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags applied to the key pair.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags applied to the key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyPairInfo withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any tags applied to the key pair.
     * </p>
     * 
     * @param tags
     *        Any tags applied to the key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyPairInfo withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getKeyPairId() != null)
            sb.append("KeyPairId: ").append(getKeyPairId()).append(",");
        if (getKeyFingerprint() != null)
            sb.append("KeyFingerprint: ").append(getKeyFingerprint()).append(",");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName()).append(",");
        if (getKeyType() != null)
            sb.append("KeyType: ").append(getKeyType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyPairInfo == false)
            return false;
        KeyPairInfo other = (KeyPairInfo) obj;
        if (other.getKeyPairId() == null ^ this.getKeyPairId() == null)
            return false;
        if (other.getKeyPairId() != null && other.getKeyPairId().equals(this.getKeyPairId()) == false)
            return false;
        if (other.getKeyFingerprint() == null ^ this.getKeyFingerprint() == null)
            return false;
        if (other.getKeyFingerprint() != null && other.getKeyFingerprint().equals(this.getKeyFingerprint()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        if (other.getKeyType() == null ^ this.getKeyType() == null)
            return false;
        if (other.getKeyType() != null && other.getKeyType().equals(this.getKeyType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyPairId() == null) ? 0 : getKeyPairId().hashCode());
        hashCode = prime * hashCode + ((getKeyFingerprint() == null) ? 0 : getKeyFingerprint().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        hashCode = prime * hashCode + ((getKeyType() == null) ? 0 : getKeyType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public KeyPairInfo clone() {
        try {
            return (KeyPairInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
