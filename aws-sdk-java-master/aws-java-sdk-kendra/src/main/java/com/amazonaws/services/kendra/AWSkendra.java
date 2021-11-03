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
package com.amazonaws.services.kendra;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.kendra.model.*;

/**
 * Interface for accessing kendra.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.kendra.AbstractAWSkendra} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Kendra is a service for indexing large document sets.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSkendra {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "kendra";

    /**
     * <p>
     * Removes one or more documents from an index. The documents must have been added with the
     * <code>BatchPutDocument</code> operation.
     * </p>
     * <p>
     * The documents are deleted asynchronously. You can see the progress of the deletion by using Amazon Web Services
     * CloudWatch. Any error messages related to the processing of the batch are sent to you CloudWatch log.
     * </p>
     * 
     * @param batchDeleteDocumentRequest
     * @return Result of the BatchDeleteDocument operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.BatchDeleteDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BatchDeleteDocument" target="_top">AWS API
     *      Documentation</a>
     */
    BatchDeleteDocumentResult batchDeleteDocument(BatchDeleteDocumentRequest batchDeleteDocumentRequest);

    /**
     * <p>
     * Returns the indexing status for one or more documents submitted with the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchPutDocument.html"> BatchPutDocument</a> operation.
     * </p>
     * <p>
     * When you use the <code>BatchPutDocument</code> operation, documents are indexed asynchronously. You can use the
     * <code>BatchGetDocumentStatus</code> operation to get the current status of a list of documents so that you can
     * determine if they have been successfully indexed.
     * </p>
     * <p>
     * You can also use the <code>BatchGetDocumentStatus</code> operation to check the status of the <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/API_BatchDeleteDocument.html"> BatchDeleteDocument</a>
     * operation. When a document is deleted from the index, Amazon Kendra returns <code>NOT_FOUND</code> as the status.
     * </p>
     * 
     * @param batchGetDocumentStatusRequest
     * @return Result of the BatchGetDocumentStatus operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.BatchGetDocumentStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BatchGetDocumentStatus" target="_top">AWS
     *      API Documentation</a>
     */
    BatchGetDocumentStatusResult batchGetDocumentStatus(BatchGetDocumentStatusRequest batchGetDocumentStatusRequest);

    /**
     * <p>
     * Adds one or more documents to an index.
     * </p>
     * <p>
     * The <code>BatchPutDocument</code> operation enables you to ingest inline documents or a set of documents stored
     * in an Amazon S3 bucket. Use this operation to ingest your text and unstructured text into an index, add custom
     * attributes to the documents, and to attach an access control list to the documents added to the index.
     * </p>
     * <p>
     * The documents are indexed asynchronously. You can see the progress of the batch using Amazon Web Services
     * CloudWatch. Any error messages related to processing the batch are sent to your Amazon Web Services CloudWatch
     * log.
     * </p>
     * 
     * @param batchPutDocumentRequest
     * @return Result of the BatchPutDocument operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws InternalServerException
     * @sample AWSkendra.BatchPutDocument
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/BatchPutDocument" target="_top">AWS API
     *      Documentation</a>
     */
    BatchPutDocumentResult batchPutDocument(BatchPutDocumentRequest batchPutDocumentRequest);

    /**
     * <p>
     * Clears existing query suggestions from an index.
     * </p>
     * <p>
     * This deletes existing suggestions only, not the queries in the query log. After you clear suggestions, Amazon
     * Kendra learns new suggestions based on new queries added to the query log from the time you cleared suggestions.
     * If you do not see any new suggestions, then please allow Amazon Kendra to collect enough queries to learn new
     * suggestions.
     * </p>
     * 
     * @param clearQuerySuggestionsRequest
     * @return Result of the ClearQuerySuggestions operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ConflictException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.ClearQuerySuggestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ClearQuerySuggestions" target="_top">AWS
     *      API Documentation</a>
     */
    ClearQuerySuggestionsResult clearQuerySuggestions(ClearQuerySuggestionsRequest clearQuerySuggestionsRequest);

    /**
     * <p>
     * Creates a data source that you want to use with an Amazon Kendra index.
     * </p>
     * <p>
     * You specify a name, data source connector type and description for your data source. You also specify
     * configuration information for the data source connector.
     * </p>
     * <p>
     * <code>CreateDataSource</code> is a synchronous operation. The operation returns 200 if the data source was
     * successfully created. Otherwise, an exception is raised.
     * </p>
     * 
     * @param createDataSourceRequest
     * @return Result of the CreateDataSource operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ResourceAlreadyExistException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.CreateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    CreateDataSourceResult createDataSource(CreateDataSourceRequest createDataSourceRequest);

    /**
     * <p>
     * Creates an new set of frequently asked question (FAQ) questions and answers.
     * </p>
     * 
     * @param createFaqRequest
     * @return Result of the CreateFaq operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.CreateFaq
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateFaq" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFaqResult createFaq(CreateFaqRequest createFaqRequest);

    /**
     * <p>
     * Creates a new Amazon Kendra index. Index creation is an asynchronous operation. To determine if index creation
     * has completed, check the <code>Status</code> field returned from a call to <code>DescribeIndex</code>. The
     * <code>Status</code> field is set to <code>ACTIVE</code> when the index is ready to use.
     * </p>
     * <p>
     * Once the index is active you can index your documents using the <code>BatchPutDocument</code> operation or using
     * one of the supported data sources.
     * </p>
     * 
     * @param createIndexRequest
     * @return Result of the CreateIndex operation returned by the service.
     * @throws ValidationException
     * @throws ResourceAlreadyExistException
     * @throws ServiceQuotaExceededException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AWSkendra.CreateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateIndex" target="_top">AWS API
     *      Documentation</a>
     */
    CreateIndexResult createIndex(CreateIndexRequest createIndexRequest);

    /**
     * <p>
     * Creates a block list to exlcude certain queries from suggestions.
     * </p>
     * <p>
     * Any query that contains words or phrases specified in the block list is blocked or filtered out from being shown
     * as a suggestion.
     * </p>
     * <p>
     * You need to provide the file location of your block list text file in your S3 bucket. In your text file, enter
     * each block word or phrase on a separate line.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     * 
     * @param createQuerySuggestionsBlockListRequest
     * @return Result of the CreateQuerySuggestionsBlockList operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AWSkendra.CreateQuerySuggestionsBlockList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateQuerySuggestionsBlockList"
     *      target="_top">AWS API Documentation</a>
     */
    CreateQuerySuggestionsBlockListResult createQuerySuggestionsBlockList(CreateQuerySuggestionsBlockListRequest createQuerySuggestionsBlockListRequest);

    /**
     * <p>
     * Creates a thesaurus for an index. The thesaurus contains a list of synonyms in Solr format.
     * </p>
     * 
     * @param createThesaurusRequest
     * @return Result of the CreateThesaurus operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws ServiceQuotaExceededException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.CreateThesaurus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/CreateThesaurus" target="_top">AWS API
     *      Documentation</a>
     */
    CreateThesaurusResult createThesaurus(CreateThesaurusRequest createThesaurusRequest);

    /**
     * <p>
     * Deletes an Amazon Kendra data source. An exception is not thrown if the data source is already being deleted.
     * While the data source is being deleted, the <code>Status</code> field returned by a call to the
     * <code>DescribeDataSource</code> operation is set to <code>DELETING</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/delete-data-source.html">Deleting Data Sources</a>.
     * </p>
     * 
     * @param deleteDataSourceRequest
     * @return Result of the DeleteDataSource operation returned by the service.
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws InternalServerException
     * @sample AWSkendra.DeleteDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteDataSourceResult deleteDataSource(DeleteDataSourceRequest deleteDataSourceRequest);

    /**
     * <p>
     * Removes an FAQ from an index.
     * </p>
     * 
     * @param deleteFaqRequest
     * @return Result of the DeleteFaq operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.DeleteFaq
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteFaq" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFaqResult deleteFaq(DeleteFaqRequest deleteFaqRequest);

    /**
     * <p>
     * Deletes an existing Amazon Kendra index. An exception is not thrown if the index is already being deleted. While
     * the index is being deleted, the <code>Status</code> field returned by a call to the <code>DescribeIndex</code>
     * operation is set to <code>DELETING</code>.
     * </p>
     * 
     * @param deleteIndexRequest
     * @return Result of the DeleteIndex operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.DeleteIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteIndex" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteIndexResult deleteIndex(DeleteIndexRequest deleteIndexRequest);

    /**
     * <p>
     * Deletes a group so that all users and sub groups that belong to the group can no longer access documents only
     * available to that group.
     * </p>
     * <p>
     * For example, after deleting the group "Summer Interns", all interns who belonged to that group no longer see
     * intern-only documents in their search results.
     * </p>
     * <p>
     * If you want to delete or replace users or sub groups of a group, you need to use the
     * <code>PutPrincipalMapping</code> operation. For example, if a user in the group "Engineering" leaves the
     * engineering team and another user takes their place, you provide an updated list of users or sub groups that
     * belong to the "Engineering" group when calling <code>PutPrincipalMapping</code>. You can update your internal
     * list of users or sub groups and input this list when calling <code>PutPrincipalMapping</code>.
     * </p>
     * 
     * @param deletePrincipalMappingRequest
     * @return Result of the DeletePrincipalMapping operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.DeletePrincipalMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeletePrincipalMapping" target="_top">AWS
     *      API Documentation</a>
     */
    DeletePrincipalMappingResult deletePrincipalMapping(DeletePrincipalMappingRequest deletePrincipalMappingRequest);

    /**
     * <p>
     * Deletes a block list used for query suggestions for an index.
     * </p>
     * <p>
     * A deleted block list might not take effect right away. Amazon Kendra needs to refresh the entire suggestions list
     * to add back the queries that were previously blocked.
     * </p>
     * 
     * @param deleteQuerySuggestionsBlockListRequest
     * @return Result of the DeleteQuerySuggestionsBlockList operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AWSkendra.DeleteQuerySuggestionsBlockList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteQuerySuggestionsBlockList"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteQuerySuggestionsBlockListResult deleteQuerySuggestionsBlockList(DeleteQuerySuggestionsBlockListRequest deleteQuerySuggestionsBlockListRequest);

    /**
     * <p>
     * Deletes an existing Amazon Kendra thesaurus.
     * </p>
     * 
     * @param deleteThesaurusRequest
     * @return Result of the DeleteThesaurus operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.DeleteThesaurus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DeleteThesaurus" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteThesaurusResult deleteThesaurus(DeleteThesaurusRequest deleteThesaurusRequest);

    /**
     * <p>
     * Gets information about a Amazon Kendra data source.
     * </p>
     * 
     * @param describeDataSourceRequest
     * @return Result of the DescribeDataSource operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.DescribeDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDataSourceResult describeDataSource(DescribeDataSourceRequest describeDataSourceRequest);

    /**
     * <p>
     * Gets information about an FAQ list.
     * </p>
     * 
     * @param describeFaqRequest
     * @return Result of the DescribeFaq operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.DescribeFaq
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeFaq" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeFaqResult describeFaq(DescribeFaqRequest describeFaqRequest);

    /**
     * <p>
     * Describes an existing Amazon Kendra index
     * </p>
     * 
     * @param describeIndexRequest
     * @return Result of the DescribeIndex operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.DescribeIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeIndex" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeIndexResult describeIndex(DescribeIndexRequest describeIndexRequest);

    /**
     * <p>
     * Describes the processing of <code>PUT</code> and <code>DELETE</code> actions for mapping users to their groups.
     * This includes information on the status of actions currently processing or yet to be processed, when actions were
     * last updated, when actions were received by Amazon Kendra, the latest action that should process and apply after
     * other actions, and useful error messages if an action could not be processed.
     * </p>
     * 
     * @param describePrincipalMappingRequest
     * @return Result of the DescribePrincipalMapping operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.DescribePrincipalMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribePrincipalMapping"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePrincipalMappingResult describePrincipalMapping(DescribePrincipalMappingRequest describePrincipalMappingRequest);

    /**
     * <p>
     * Describes a block list used for query suggestions for an index.
     * </p>
     * <p>
     * This is used to check the current settings that are applied to a block list.
     * </p>
     * 
     * @param describeQuerySuggestionsBlockListRequest
     * @return Result of the DescribeQuerySuggestionsBlockList operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.DescribeQuerySuggestionsBlockList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeQuerySuggestionsBlockList"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeQuerySuggestionsBlockListResult describeQuerySuggestionsBlockList(DescribeQuerySuggestionsBlockListRequest describeQuerySuggestionsBlockListRequest);

    /**
     * <p>
     * Describes the settings of query suggestions for an index.
     * </p>
     * <p>
     * This is used to check the current settings applied to query suggestions.
     * </p>
     * 
     * @param describeQuerySuggestionsConfigRequest
     * @return Result of the DescribeQuerySuggestionsConfig operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.DescribeQuerySuggestionsConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeQuerySuggestionsConfig"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeQuerySuggestionsConfigResult describeQuerySuggestionsConfig(DescribeQuerySuggestionsConfigRequest describeQuerySuggestionsConfigRequest);

    /**
     * <p>
     * Describes an existing Amazon Kendra thesaurus.
     * </p>
     * 
     * @param describeThesaurusRequest
     * @return Result of the DescribeThesaurus operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.DescribeThesaurus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/DescribeThesaurus" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeThesaurusResult describeThesaurus(DescribeThesaurusRequest describeThesaurusRequest);

    /**
     * <p>
     * Fetches the queries that are suggested to your users.
     * </p>
     * 
     * @param getQuerySuggestionsRequest
     * @return Result of the GetQuerySuggestions operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AWSkendra.GetQuerySuggestions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/GetQuerySuggestions" target="_top">AWS API
     *      Documentation</a>
     */
    GetQuerySuggestionsResult getQuerySuggestions(GetQuerySuggestionsRequest getQuerySuggestionsRequest);

    /**
     * <p>
     * Gets statistics about synchronizing Amazon Kendra with a data source.
     * </p>
     * 
     * @param listDataSourceSyncJobsRequest
     * @return Result of the ListDataSourceSyncJobs operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AWSkendra.ListDataSourceSyncJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListDataSourceSyncJobs" target="_top">AWS
     *      API Documentation</a>
     */
    ListDataSourceSyncJobsResult listDataSourceSyncJobs(ListDataSourceSyncJobsRequest listDataSourceSyncJobsRequest);

    /**
     * <p>
     * Lists the data sources that you have created.
     * </p>
     * 
     * @param listDataSourcesRequest
     * @return Result of the ListDataSources operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws InternalServerException
     * @sample AWSkendra.ListDataSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListDataSources" target="_top">AWS API
     *      Documentation</a>
     */
    ListDataSourcesResult listDataSources(ListDataSourcesRequest listDataSourcesRequest);

    /**
     * <p>
     * Gets a list of FAQ lists associated with an index.
     * </p>
     * 
     * @param listFaqsRequest
     * @return Result of the ListFaqs operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.ListFaqs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListFaqs" target="_top">AWS API
     *      Documentation</a>
     */
    ListFaqsResult listFaqs(ListFaqsRequest listFaqsRequest);

    /**
     * <p>
     * Provides a list of groups that are mapped to users before a given ordering or timestamp identifier.
     * </p>
     * 
     * @param listGroupsOlderThanOrderingIdRequest
     * @return Result of the ListGroupsOlderThanOrderingId operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws AccessDeniedException
     * @throws ThrottlingException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AWSkendra.ListGroupsOlderThanOrderingId
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListGroupsOlderThanOrderingId"
     *      target="_top">AWS API Documentation</a>
     */
    ListGroupsOlderThanOrderingIdResult listGroupsOlderThanOrderingId(ListGroupsOlderThanOrderingIdRequest listGroupsOlderThanOrderingIdRequest);

    /**
     * <p>
     * Lists the Amazon Kendra indexes that you have created.
     * </p>
     * 
     * @param listIndicesRequest
     * @return Result of the ListIndices operation returned by the service.
     * @throws ValidationException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.ListIndices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListIndices" target="_top">AWS API
     *      Documentation</a>
     */
    ListIndicesResult listIndices(ListIndicesRequest listIndicesRequest);

    /**
     * <p>
     * Lists the block lists used for query suggestions for an index.
     * </p>
     * <p>
     * For information on the current quota limits for block lists, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/quotas.html">Quotas for Amazon Kendra</a>.
     * </p>
     * 
     * @param listQuerySuggestionsBlockListsRequest
     * @return Result of the ListQuerySuggestionsBlockLists operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.ListQuerySuggestionsBlockLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListQuerySuggestionsBlockLists"
     *      target="_top">AWS API Documentation</a>
     */
    ListQuerySuggestionsBlockListsResult listQuerySuggestionsBlockLists(ListQuerySuggestionsBlockListsRequest listQuerySuggestionsBlockListsRequest);

    /**
     * <p>
     * Gets a list of tags associated with a specified resource. Indexes, FAQs, and data sources can have tags
     * associated with them.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     * @throws ResourceUnavailableException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the Amazon Kendra thesauri associated with an index.
     * </p>
     * 
     * @param listThesauriRequest
     * @return Result of the ListThesauri operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.ListThesauri
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/ListThesauri" target="_top">AWS API
     *      Documentation</a>
     */
    ListThesauriResult listThesauri(ListThesauriRequest listThesauriRequest);

    /**
     * <p>
     * Maps users to their groups so that you only need to provide the user ID when you issue the query.
     * </p>
     * <p>
     * You can also map sub groups to groups. For example, the group "Company Intellectual Property Teams" includes sub
     * groups "Research" and "Engineering". These sub groups include their own list of users or people who work in these
     * teams. Only users who work in research and engineering, and therefore belong in the intellectual property group,
     * can see top-secret company documents in their search results.
     * </p>
     * <p>
     * You map users to their groups when you want to filter search results for different users based on their group’s
     * access to documents. For more information on filtering search results for different users, see <a
     * href="https://docs.aws.amazon.com/kendra/latest/dg/user-context-filter.html">Filtering on user context</a>.
     * </p>
     * <p>
     * If more than five <code>PUT</code> actions for a group are currently processing, a validation exception is
     * thrown.
     * </p>
     * 
     * @param putPrincipalMappingRequest
     * @return Result of the PutPrincipalMapping operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws InternalServerException
     * @sample AWSkendra.PutPrincipalMapping
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/PutPrincipalMapping" target="_top">AWS API
     *      Documentation</a>
     */
    PutPrincipalMappingResult putPrincipalMapping(PutPrincipalMappingRequest putPrincipalMappingRequest);

    /**
     * <p>
     * Searches an active index. Use this API to search your documents using query. The <code>Query</code> operation
     * enables to do faceted search and to filter results based on document attributes.
     * </p>
     * <p>
     * It also enables you to provide user context that Amazon Kendra uses to enforce document access control in the
     * search results.
     * </p>
     * <p>
     * Amazon Kendra searches your index for text content and question and answer (FAQ) content. By default the response
     * contains three types of results.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Relevant passages
     * </p>
     * </li>
     * <li>
     * <p>
     * Matching FAQs
     * </p>
     * </li>
     * <li>
     * <p>
     * Relevant documents
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can specify that the query return only one type of result using the <code>QueryResultTypeConfig</code>
     * parameter.
     * </p>
     * <p>
     * Each query returns the 100 most relevant results.
     * </p>
     * 
     * @param queryRequest
     * @return Result of the Query operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws InternalServerException
     * @sample AWSkendra.Query
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/Query" target="_top">AWS API
     *      Documentation</a>
     */
    QueryResult query(QueryRequest queryRequest);

    /**
     * <p>
     * Starts a synchronization job for a data source. If a synchronization job is already in progress, Amazon Kendra
     * returns a <code>ResourceInUseException</code> exception.
     * </p>
     * 
     * @param startDataSourceSyncJobRequest
     * @return Result of the StartDataSourceSyncJob operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ResourceInUseException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AWSkendra.StartDataSourceSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/StartDataSourceSyncJob" target="_top">AWS
     *      API Documentation</a>
     */
    StartDataSourceSyncJobResult startDataSourceSyncJob(StartDataSourceSyncJobRequest startDataSourceSyncJobRequest);

    /**
     * <p>
     * Stops a running synchronization job. You can't stop a scheduled synchronization job.
     * </p>
     * 
     * @param stopDataSourceSyncJobRequest
     * @return Result of the StopDataSourceSyncJob operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.StopDataSourceSyncJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/StopDataSourceSyncJob" target="_top">AWS
     *      API Documentation</a>
     */
    StopDataSourceSyncJobResult stopDataSourceSyncJob(StopDataSourceSyncJobRequest stopDataSourceSyncJobRequest);

    /**
     * <p>
     * Enables you to provide feedback to Amazon Kendra to improve the performance of your index.
     * </p>
     * 
     * @param submitFeedbackRequest
     * @return Result of the SubmitFeedback operation returned by the service.
     * @throws ValidationException
     * @throws ResourceUnavailableException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.SubmitFeedback
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/SubmitFeedback" target="_top">AWS API
     *      Documentation</a>
     */
    SubmitFeedbackResult submitFeedback(SubmitFeedbackRequest submitFeedbackRequest);

    /**
     * <p>
     * Adds the specified tag to the specified index, FAQ, or data source resource. If the tag already exists, the
     * existing value is replaced with the new value.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     * @throws ResourceUnavailableException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag from an index, FAQ, or a data source.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     * @throws ResourceUnavailableException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an existing Amazon Kendra data source.
     * </p>
     * 
     * @param updateDataSourceRequest
     * @return Result of the UpdateDataSource operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.UpdateDataSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateDataSource" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateDataSourceResult updateDataSource(UpdateDataSourceRequest updateDataSourceRequest);

    /**
     * <p>
     * Updates an existing Amazon Kendra index.
     * </p>
     * 
     * @param updateIndexRequest
     * @return Result of the UpdateIndex operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ServiceQuotaExceededException
     * @throws InternalServerException
     * @sample AWSkendra.UpdateIndex
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateIndex" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateIndexResult updateIndex(UpdateIndexRequest updateIndexRequest);

    /**
     * <p>
     * Updates a block list used for query suggestions for an index.
     * </p>
     * <p>
     * Updates to a block list might not take effect right away. Amazon Kendra needs to refresh the entire suggestions
     * list to apply any updates to the block list. Other changes not related to the block list apply immediately.
     * </p>
     * <p>
     * If a block list is updating, then you need to wait for the first update to finish before submitting another
     * update.
     * </p>
     * <p>
     * Amazon Kendra supports partial updates, so you only need to provide the fields you want to update.
     * </p>
     * 
     * @param updateQuerySuggestionsBlockListRequest
     * @return Result of the UpdateQuerySuggestionsBlockList operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AWSkendra.UpdateQuerySuggestionsBlockList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateQuerySuggestionsBlockList"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateQuerySuggestionsBlockListResult updateQuerySuggestionsBlockList(UpdateQuerySuggestionsBlockListRequest updateQuerySuggestionsBlockListRequest);

    /**
     * <p>
     * Updates the settings of query suggestions for an index.
     * </p>
     * <p>
     * Amazon Kendra supports partial updates, so you only need to provide the fields you want to update.
     * </p>
     * <p>
     * If an update is currently processing (i.e. 'happening'), you need to wait for the update to finish before making
     * another update.
     * </p>
     * <p>
     * Updates to query suggestions settings might not take effect right away. The time for your updated settings to
     * take effect depends on the updates made and the number of search queries in your index.
     * </p>
     * <p>
     * You can still enable/disable query suggestions at any time.
     * </p>
     * 
     * @param updateQuerySuggestionsConfigRequest
     * @return Result of the UpdateQuerySuggestionsConfig operation returned by the service.
     * @throws ValidationException
     * @throws ConflictException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws InternalServerException
     * @sample AWSkendra.UpdateQuerySuggestionsConfig
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateQuerySuggestionsConfig"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateQuerySuggestionsConfigResult updateQuerySuggestionsConfig(UpdateQuerySuggestionsConfigRequest updateQuerySuggestionsConfigRequest);

    /**
     * <p>
     * Updates a thesaurus file associated with an index.
     * </p>
     * 
     * @param updateThesaurusRequest
     * @return Result of the UpdateThesaurus operation returned by the service.
     * @throws ValidationException
     * @throws ResourceNotFoundException
     * @throws ThrottlingException
     * @throws AccessDeniedException
     * @throws ConflictException
     * @throws InternalServerException
     * @sample AWSkendra.UpdateThesaurus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateThesaurus" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateThesaurusResult updateThesaurus(UpdateThesaurusRequest updateThesaurusRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
