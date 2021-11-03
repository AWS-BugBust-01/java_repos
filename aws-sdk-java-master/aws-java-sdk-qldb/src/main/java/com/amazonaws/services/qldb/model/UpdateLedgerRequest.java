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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/UpdateLedger" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLedgerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the ledger.
     * </p>
     */
    private String name;
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
     * The key in Key Management Service (KMS) to use for encryption of data at rest in the ledger. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/qldb/latest/developerguide/encryption-at-rest.html">Encryption at rest</a> in
     * the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * <p>
     * Use one of the following options to specify this parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_OWNED_KMS_KEY</code>: Use an KMS key that is owned and managed by Amazon Web Services on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Undefined</b>: Make no changes to the KMS key of the ledger.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A valid symmetric customer managed KMS key</b>: Use the specified KMS key in your account that you create,
     * own, and manage.
     * </p>
     * <p>
     * Amazon QLDB does not support asymmetric keys. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric and
     * asymmetric keys</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To specify a customer managed KMS key, you can use its key ID, Amazon Resource Name (ARN), alias name, or alias
     * ARN. When using an alias name, prefix it with <code>"alias/"</code>. To specify a key in a different account, you
     * must use the key ARN or alias ARN.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id">Key identifiers (KeyId)</a> in
     * the <i>Key Management Service Developer Guide</i>.
     * </p>
     */
    private String kmsKey;

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

    public UpdateLedgerRequest withName(String name) {
        setName(name);
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

    public UpdateLedgerRequest withDeletionProtection(Boolean deletionProtection) {
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
     * The key in Key Management Service (KMS) to use for encryption of data at rest in the ledger. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/qldb/latest/developerguide/encryption-at-rest.html">Encryption at rest</a> in
     * the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * <p>
     * Use one of the following options to specify this parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_OWNED_KMS_KEY</code>: Use an KMS key that is owned and managed by Amazon Web Services on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Undefined</b>: Make no changes to the KMS key of the ledger.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A valid symmetric customer managed KMS key</b>: Use the specified KMS key in your account that you create,
     * own, and manage.
     * </p>
     * <p>
     * Amazon QLDB does not support asymmetric keys. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric and
     * asymmetric keys</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To specify a customer managed KMS key, you can use its key ID, Amazon Resource Name (ARN), alias name, or alias
     * ARN. When using an alias name, prefix it with <code>"alias/"</code>. To specify a key in a different account, you
     * must use the key ARN or alias ARN.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id">Key identifiers (KeyId)</a> in
     * the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param kmsKey
     *        The key in Key Management Service (KMS) to use for encryption of data at rest in the ledger. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/qldb/latest/developerguide/encryption-at-rest.html">Encryption at
     *        rest</a> in the <i>Amazon QLDB Developer Guide</i>.</p>
     *        <p>
     *        Use one of the following options to specify this parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS_OWNED_KMS_KEY</code>: Use an KMS key that is owned and managed by Amazon Web Services on your
     *        behalf.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Undefined</b>: Make no changes to the KMS key of the ledger.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>A valid symmetric customer managed KMS key</b>: Use the specified KMS key in your account that you
     *        create, own, and manage.
     *        </p>
     *        <p>
     *        Amazon QLDB does not support asymmetric keys. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric and
     *        asymmetric keys</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To specify a customer managed KMS key, you can use its key ID, Amazon Resource Name (ARN), alias name, or
     *        alias ARN. When using an alias name, prefix it with <code>"alias/"</code>. To specify a key in a different
     *        account, you must use the key ARN or alias ARN.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name: <code>alias/ExampleAlias</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id">Key identifiers
     *        (KeyId)</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public void setKmsKey(String kmsKey) {
        this.kmsKey = kmsKey;
    }

    /**
     * <p>
     * The key in Key Management Service (KMS) to use for encryption of data at rest in the ledger. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/qldb/latest/developerguide/encryption-at-rest.html">Encryption at rest</a> in
     * the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * <p>
     * Use one of the following options to specify this parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_OWNED_KMS_KEY</code>: Use an KMS key that is owned and managed by Amazon Web Services on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Undefined</b>: Make no changes to the KMS key of the ledger.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A valid symmetric customer managed KMS key</b>: Use the specified KMS key in your account that you create,
     * own, and manage.
     * </p>
     * <p>
     * Amazon QLDB does not support asymmetric keys. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric and
     * asymmetric keys</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To specify a customer managed KMS key, you can use its key ID, Amazon Resource Name (ARN), alias name, or alias
     * ARN. When using an alias name, prefix it with <code>"alias/"</code>. To specify a key in a different account, you
     * must use the key ARN or alias ARN.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id">Key identifiers (KeyId)</a> in
     * the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return The key in Key Management Service (KMS) to use for encryption of data at rest in the ledger. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/qldb/latest/developerguide/encryption-at-rest.html">Encryption at
     *         rest</a> in the <i>Amazon QLDB Developer Guide</i>.</p>
     *         <p>
     *         Use one of the following options to specify this parameter:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AWS_OWNED_KMS_KEY</code>: Use an KMS key that is owned and managed by Amazon Web Services on your
     *         behalf.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Undefined</b>: Make no changes to the KMS key of the ledger.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>A valid symmetric customer managed KMS key</b>: Use the specified KMS key in your account that you
     *         create, own, and manage.
     *         </p>
     *         <p>
     *         Amazon QLDB does not support asymmetric keys. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric
     *         and asymmetric keys</a> in the <i>Key Management Service Developer Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To specify a customer managed KMS key, you can use its key ID, Amazon Resource Name (ARN), alias name, or
     *         alias ARN. When using an alias name, prefix it with <code>"alias/"</code>. To specify a key in a
     *         different account, you must use the key ARN or alias ARN.
     *         </p>
     *         <p>
     *         For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias name: <code>alias/ExampleAlias</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id">Key identifiers
     *         (KeyId)</a> in the <i>Key Management Service Developer Guide</i>.
     */

    public String getKmsKey() {
        return this.kmsKey;
    }

    /**
     * <p>
     * The key in Key Management Service (KMS) to use for encryption of data at rest in the ledger. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/qldb/latest/developerguide/encryption-at-rest.html">Encryption at rest</a> in
     * the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * <p>
     * Use one of the following options to specify this parameter:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS_OWNED_KMS_KEY</code>: Use an KMS key that is owned and managed by Amazon Web Services on your behalf.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Undefined</b>: Make no changes to the KMS key of the ledger.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>A valid symmetric customer managed KMS key</b>: Use the specified KMS key in your account that you create,
     * own, and manage.
     * </p>
     * <p>
     * Amazon QLDB does not support asymmetric keys. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric and
     * asymmetric keys</a> in the <i>Key Management Service Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To specify a customer managed KMS key, you can use its key ID, Amazon Resource Name (ARN), alias name, or alias
     * ARN. When using an alias name, prefix it with <code>"alias/"</code>. To specify a key in a different account, you
     * must use the key ARN or alias ARN.
     * </p>
     * <p>
     * For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias name: <code>alias/ExampleAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id">Key identifiers (KeyId)</a> in
     * the <i>Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param kmsKey
     *        The key in Key Management Service (KMS) to use for encryption of data at rest in the ledger. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/qldb/latest/developerguide/encryption-at-rest.html">Encryption at
     *        rest</a> in the <i>Amazon QLDB Developer Guide</i>.</p>
     *        <p>
     *        Use one of the following options to specify this parameter:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS_OWNED_KMS_KEY</code>: Use an KMS key that is owned and managed by Amazon Web Services on your
     *        behalf.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Undefined</b>: Make no changes to the KMS key of the ledger.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>A valid symmetric customer managed KMS key</b>: Use the specified KMS key in your account that you
     *        create, own, and manage.
     *        </p>
     *        <p>
     *        Amazon QLDB does not support asymmetric keys. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric and
     *        asymmetric keys</a> in the <i>Key Management Service Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To specify a customer managed KMS key, you can use its key ID, Amazon Resource Name (ARN), alias name, or
     *        alias ARN. When using an alias name, prefix it with <code>"alias/"</code>. To specify a key in a different
     *        account, you must use the key ARN or alias ARN.
     *        </p>
     *        <p>
     *        For example:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias name: <code>alias/ExampleAlias</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Alias ARN: <code>arn:aws:kms:us-east-2:111122223333:alias/ExampleAlias</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id">Key identifiers
     *        (KeyId)</a> in the <i>Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLedgerRequest withKmsKey(String kmsKey) {
        setKmsKey(kmsKey);
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
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: ").append(getDeletionProtection()).append(",");
        if (getKmsKey() != null)
            sb.append("KmsKey: ").append(getKmsKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLedgerRequest == false)
            return false;
        UpdateLedgerRequest other = (UpdateLedgerRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getKmsKey() == null ^ this.getKmsKey() == null)
            return false;
        if (other.getKmsKey() != null && other.getKmsKey().equals(this.getKmsKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode + ((getKmsKey() == null) ? 0 : getKmsKey().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLedgerRequest clone() {
        return (UpdateLedgerRequest) super.clone();
    }

}
