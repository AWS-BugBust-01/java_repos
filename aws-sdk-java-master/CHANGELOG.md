# __1.12.101__ __2021-11-02__
## __Amazon CloudFront__
  - ### Features
    - CloudFront now supports response headers policies to add HTTP headers to the responses that CloudFront sends to viewers. You can use these policies to add CORS headers, control browser caching, and more, without modifying your origin or writing any code.

## __Amazon Connect Service__
  - ### Features
    - Amazon Connect Chat now supports real-time message streaming.

## __AmazonNimbleStudio__
  - ### Features
    - Amazon Nimble Studio adds support for users to stop and start streaming sessions.

# __1.12.100__ __2021-11-01__
## __AWS Network Manager__
  - ### Features
    - This release adds API support to aggregate resources, routes, and telemetry data across a Global Network.

## __Amazon Lightsail__
  - ### Features
    - This release adds support to enable access logging for buckets in the Lightsail object storage service.

## __Amazon Neptune__
  - ### Features
    - Adds support for major version upgrades to ModifyDbCluster API

## __Amazon Rekognition__
  - ### Features
    - This Amazon Rekognition Custom Labels release introduces the management of datasets with  projects

# __1.12.99__ __2021-10-29__
## __Amazon CloudWatch Application Insights__
  - ### Features
    - Added Monitoring support for SQL Server Failover Cluster Instance. Additionally, added a new API to allow one-click monitoring of containers resources.

## __Amazon Connect Service__
  - ### Features
    - Amazon Connect Chat now supports real-time message streaming.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Support added for AMI sharing with organizations and organizational units in ModifyImageAttribute API

## __Amazon Rekognition__
  - ### Features
    - This release added new attributes to Rekognition Video GetCelebrityRecognition API operations.

## __Amazon Transcribe Service__
  - ### Features
    - Transcribe and Transcribe Call Analytics now support automatic language identification along with custom vocabulary, vocabulary filter, custom language model and PII redaction.

# __1.12.98__ __2021-10-28__
## __AWS Systems Manager Incident Manager__
  - ### Features
    - Updating documentation, adding new field to ConflictException to indicate earliest retry timestamp for some operations, increase maximum length of nextToken fields

## __Amazon Connect Participant Service__
  - ### Features
    - This release adds a new boolean attribute - Connect Participant - to the CreateParticipantConnection API, which can be used to mark the participant as connected.

## __Amazon EC2 Container Service__
  - ### Features
    - Amazon ECS now supports running Fargate tasks on Windows Operating Systems Families which includes Windows Server 2019 Core and Windows Server 2019 Full.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added new read-only DenyAllIGWTraffic network interface attribute. Added support for DL1 24xlarge instances powered by Habana Gaudi Accelerators for deep learning model training workloads

## __Amazon GameLift__
  - ### Features
    - Added support for Arm-based AWS Graviton2 instances, such as M6g, C6g, and R6g.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for RStudio on SageMaker.

# __1.12.97__ __2021-10-27__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds: attribute-based instance type selection for EC2 Fleet, Spot Fleet, a feature that lets customers express instance requirements as attributes like vCPU, memory, and storage; and Spot placement score, a feature that helps customers identify an optimal location to run Spot workloads.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - EKS managed node groups now support BOTTLEROCKET_x86_64 and BOTTLEROCKET_ARM_64 AMI types.

## __Amazon SageMaker Service__
  - ### Features
    - This release allows customers to describe one or more versioned model packages through BatchDescribeModelPackage, update project via UpdateProject, modify and read customer metadata properties using Create, Update and Describe ModelPackage and enables cross account registration of model packages.

## __Amazon Textract__
  - ### Features
    - This release adds support for asynchronously analyzing invoice and receipt documents through two new APIs: StartExpenseAnalysis and GetExpenseAnalysis

## __Auto Scaling__
  - ### Features
    - This release adds support for attribute-based instance type selection, a new EC2 Auto Scaling feature that lets customers express their instance requirements as a set of attributes, such as vCPU, memory, and storage.

# __1.12.96__ __2021-10-26__
## __Amazon Chime SDK Identity__
  - ### Features
    - The Amazon Chime SDK now supports push notifications through Amazon Pinpoint

## __Amazon Chime SDK Messaging__
  - ### Features
    - The Amazon Chime SDK now supports push notifications through Amazon Pinpoint

## __Amazon EMR Containers__
  - ### Features
    - This feature enables auto-generation of certificate  to secure the managed-endpoint and removes the need for customer provided certificate-arn during managed-endpoint setup.

# __1.12.95__ __2021-10-25__
## __AWS Audit Manager__
  - ### Features
    - This release introduces a new feature for Audit Manager: Custom framework sharing. You can now share your custom frameworks with another AWS account, or replicate them into another AWS Region under your own account.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support to create a VPN Connection that is not attached to a Gateway at the time of creation. Use this to create VPNs associated with Core Networks, or modify your VPN and attach a gateway using the modify API after creation.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for Amazon RDS Custom, which is a new RDS management type that gives you full access to your database and operating system. For more information, see https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-custom.html

## __Amazon Route 53 Resolver__
  - ### Features
    - New API for ResolverConfig, which allows autodefined rules for reverse DNS resolution to be disabled for a VPC

# __1.12.94__ __2021-10-22__
## __AWS Audit Manager__
  - ### Features
    - This release introduces character restrictions for ControlSet names. We updated regex patterns for the following attributes: ControlSet, CreateAssessmentFrameworkControlSet, and UpdateAssessmentFrameworkControlSet.

## __Amazon Chime__
  - ### Features
    - Chime VoiceConnector and VoiceConnectorGroup APIs will now return an ARN.

## __Amazon QuickSight__
  - ### Features
    - Added QSearchBar option for GenerateEmbedUrlForRegisteredUser ExperienceConfiguration to support Q search bar embedding

# __1.12.93__ __2021-10-21__
## __Amazon Connect Service__
  - ### Features
    - Released Amazon Connect hours of operation API for general availability (GA). This API also supports AWS CloudFormation. For more information, see Amazon Connect Resource Type Reference in the AWS CloudFormation User Guide.

# __1.12.92__ __2021-10-20__
## __AWS Direct Connect__
  - ### Features
    - This release adds 4 new APIS, which needs to be public able

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for specifying caption time delta in milliseconds and the ability to apply color range legalization to source content other than AVC video.

## __AWS Elemental MediaPackage__
  - ### Features
    - When enabled, MediaPackage passes through digital video broadcasting (DVB) subtitles into the output.

## __AWS Elemental MediaPackage VOD__
  - ### Features
    - MediaPackage passes through digital video broadcasting (DVB) subtitles into the output.

## __AWS Panorama__
  - ### Features
    - General availability for AWS Panorama. AWS SDK for Panorama includes APIs to manage your devices and nodes, and deploy computer vision applications to the edge. For more information, see the AWS Panorama documentation at http://docs.aws.amazon.com/panorama

## __AWS SecurityHub__
  - ### Features
    - Added support for cross-Region finding aggregation, which replicates findings from linked Regions to a single aggregation Region. Added operations to view, enable, update, and delete the finding aggregation.

## __Amazon Appflow__
  - ### Features
    - Feature to add support for  JSON-L format for S3 as a source.

## __Amazon Transcribe Streaming Service__
  - ### Features
    - This release adds custom language support for streaming transcription.

# __1.12.91__ __2021-10-19__
## __AWS Data Exchange__
  - ### Features
    - This release adds support for our public preview of AWS Data Exchange for Amazon Redshift. This enables data providers to list products including AWS Data Exchange datashares for Amazon Redshift, giving subscribers read-only access to provider data in Amazon Redshift.

## __Amazon Chime SDK Messaging__
  - ### Features
    - The Amazon Chime SDK now allows developers to execute business logic on in-flight messages before they are delivered to members of a messaging channel with channel flows.

# __1.12.90__ __2021-10-18__
## __Amazon Interactive Video Service__
  - ### Features
    - Bug fix: remove unsupported maxResults and nextToken pagination parameters from ListTagsForResource

## __Amazon QuickSight__
  - ### Features
    - AWS QuickSight Service  Features    - Add IP Restriction UI and public APIs support.

# __1.12.89__ __2021-10-15__
## __AWS Glue__
  - ### Features
    - Enable S3 event base crawler API.

## __Amazon Elastic File System__
  - ### Features
    - EFS adds documentation for a new exception for short identifiers to be thrown after its migration to long resource identifiers.

## __Amazon Simple Notification Service__
  - ### Bugfixes
    - Add additional validation to the SNS SigningCert

# __1.12.88__ __2021-10-14__
## __AWS RoboMaker__
  - ### Features
    - Adding support to GPU simulation jobs as well as non-ROS simulation jobs.

## __Amazon SageMaker Service__
  - ### Features
    - This release updates the provisioning artifact ID to an optional parameter in CreateProject API. The provisioning artifact ID defaults to the latest provisioning artifact ID of the product if you don't provide one.

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling now supports filtering describe Auto Scaling groups API using tags

## __Elastic Load Balancing__
  - ### Features
    - Adds new option to filter by availability on each type of load balancer when describing ssl policies.

# __1.12.87__ __2021-10-13__
## __AWS Config__
  - ### Features
    - Adding Config support for AWS::OpenSearch::Domain

## __AWS Storage Gateway__
  - ### Features
    - Adding support for Audit Logs on NFS shares and Force Closing Files on SMB shares.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for additional VPC Flow Logs delivery options to S3, such as Apache Parquet formatted files, Hourly partitions and Hive-compatible S3 prefixes

## __Amazon Kinesis Analytics__
  - ### Features
    - Support for Apache Flink 1.13 in Kinesis Data Analytics. Changed the required status of some Update properties to better fit the corresponding Create properties.

## __Amazon WorkMail__
  - ### Features
    - This release adds APIs for adding, removing and retrieving details of mail domains

# __1.12.86__ __2021-10-12__
## __AWS MediaTailor__
  - ### Features
    - MediaTailor now supports ad prefetching.

## __Amazon CloudSearch__
  - ### Features
    - Adds an additional validation exception for Amazon CloudSearch configuration APIs for better error handling.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation only update to address tickets.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EncryptionSupport for InstanceStorageInfo added to DescribeInstanceTypes API

# __1.12.85__ __2021-10-11__
## __AWS Elemental MediaLive__
  - ### Features
    - This release adds support for Transport Stream files as an input type to MediaLive encoders.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation update for Amazon EC2.

## __Amazon Fraud Detector__
  - ### Features
    - New model type: Transaction Fraud Insights, which is optimized for online transaction fraud. Stored Events, which allows customers to send and store data directly within Amazon Fraud Detector. Batch Import, which allows customers to upload a CSV file of historic event data for processing and storage

## __Elastic Load Balancing__
  - ### Features
    - Enable support for ALB IPv6 Target Groups (IP Address Type)

# __1.12.84__ __2021-10-08__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert has added the ability to set account policies which control access restrictions for HTTP, HTTPS, and S3 content sources.

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager

## __AWS SecurityHub__
  - ### Features
    - Added new resource details objects to ASFF, including resources for WAF rate-based rules, EC2 VPC endpoints, ECR repositories, EKS clusters, X-Ray encryption, and OpenSearch domains. Added additional details for CloudFront distributions, CodeBuild projects, ELB V2 load balancers, and S3 buckets.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release removes a requirement for filters on SearchLocalGatewayRoutes operations.

## __Amazon Lex Model Building V2__
  - ### Features
    - Added configuration support for an Amazon Lex bot to provide fulfillment progress updates to users while their requests are being processed. See documentation for more details: https://docs.aws.amazon.com/lexv2/latest/dg/streaming-progress.html

## __Amazon Lex Runtime V2__
  - ### Features
    - Added configuration support for an Amazon Lex bot to provide fulfillment progress updates to users while their requests are being processed. See documentation for more details: https://docs.aws.amazon.com/lexv2/latest/dg/streaming-progress.html

# __1.12.83__ __2021-10-07__
## __AWS Backup__
  - ### Features
    - Launch of AWS Backup Vault Lock, which protects your backups from malicious and accidental actions, works with existing backup policies, and helps you meet compliance requirements.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports indexing and querying documents in different languages.

## __Amazon Chime__
  - ### Features
    - This release enables customers to configure Chime MediaCapturePipeline via API.

## __Amazon Kinesis Firehose__
  - ### Features
    - Allow support for Amazon Opensearch Service(successor to Amazon Elasticsearch Service) as a Kinesis Data Firehose delivery destination.

## __Amazon Managed Grafana__
  - ### Features
    - Initial release of the SDK for Amazon Managed Grafana API.

## __Schemas__
  - ### Features
    - Removing unused request/response objects.

# __1.12.82__ __2021-10-06__
## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports integration with AWS SSO

## __Amazon FSx__
  - ### Features
    - This release adds support for Lustre 2.12 to FSx for Lustre.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds a new TrainingInputMode FastFile for SageMaker Training APIs.

## __AmplifyBackend__
  - ### Features
    - Adding a new field 'AmplifyFeatureFlags' to the response of the GetBackend operation. It will return a stringified version of the cli.json file for the given Amplify project.

# __1.12.81__ __2021-10-05__
## __AWS Backup__
  - ### Features
    - AWS Backup Audit Manager framework report.

## __AWS Glue__
  - ### Features
    - This release adds tag as an input of CreateConnection

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Released Capacity Reservation Fleet, a feature of Amazon EC2 Capacity Reservations, which provides a way to manage reserved capacity across instance types. For more information: https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cr-fleets.html

## __Amazon Location Service__
  - ### Features
    - Add support for PositionFiltering.

## __Amazon WorkMail__
  - ### Features
    - This release allows customers to change their inbound DMARC settings in Amazon WorkMail.

## __Application Auto Scaling__
  - ### Features
    - With this release, Application Auto Scaling adds support for Amazon Neptune. Customers can now automatically add or remove Read Replicas of their Neptune clusters to keep the average CPU Utilization at the target value specified by the customers.

# __1.12.80__ __2021-10-04__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild now allows you to select how batch build statuses are sent to the source provider for a project.

## __AWS Key Management Service__
  - ### Features
    - Added SDK examples for ConnectCustomKeyStore, CreateCustomKeyStore, CreateKey, DeleteCustomKeyStore, DescribeCustomKeyStores, DisconnectCustomKeyStore, GenerateDataKeyPair, GenerateDataKeyPairWithoutPlaintext, GetPublicKey, ReplicateKey, Sign, UpdateCustomKeyStore and Verify APIs

## __Amazon Elastic File System__
  - ### Features
    - EFS adds a new exception for short identifiers to be thrown after its migration to long resource identifiers.

# __1.12.79__ __2021-10-01__
## __AWS App Runner__
  - ### Features
    - This release contains several minor bug fixes.

## __AWS SDK for Java__
  - ### Features
    - Fall back to 'profile X' if the SDK is configured with profile 'X' and 'X' does not exist in the SDK configuration files. No longer log when a configuration file includes 'profile X'.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - When "AutoApprovable" is true for a Change Template, then specifying --auto-approve (boolean) in Start-Change-Request-Execution will create a change request that bypasses approver review. (except for change calendar restrictions)

## __Synthetics__
  - ### Features
    - CloudWatch Synthetics now enables customers to choose a customer managed AWS KMS key or an Amazon S3-managed key instead of an AWS managed key (default) for the encryption of artifacts that the canary stores in Amazon S3. CloudWatch Synthetics also supports artifact S3 location updation now.

# __1.12.78__ __2021-09-30__
## __AWS Account__
  - ### Features
    - This release of the Account Management API enables customers to manage the alternate contacts for their AWS accounts. For more information, see https://docs.aws.amazon.com/accounts/latest/reference/accounts-welcome.html

## __AWS Cloud Control API__
  - ### Features
    - Initial release of the SDK for AWS Cloud Control API

## __AWS Data Exchange__
  - ### Features
    - This release enables subscribers to set up automatic exports of newly published revisions using the new EventAction API.

## __AWS Network Firewall__
  - ### Features
    - This release adds support for strict ordering for stateful rule groups. Using strict ordering, stateful rules are evaluated in the exact order in which you provide them.

## __Amazon Macie 2__
  - ### Features
    - Amazon S3 bucket metadata now indicates whether an error or a bucket's permissions settings prevented Amazon Macie from retrieving data about the bucket or the bucket's objects.

## __Amazon WorkMail__
  - ### Features
    - This release adds support for mobile device access overrides management in Amazon WorkMail.

## __Amazon WorkSpaces__
  - ### Features
    - Added CreateUpdatedWorkspaceImage API to update WorkSpace images with latest software and drivers. Updated DescribeWorkspaceImages API to display if there are updates available for WorkSpace images.

# __1.12.77__ __2021-09-29__
## __AWS Lambda__
  - ### Features
    - Adds support for Lambda functions powered by AWS Graviton2 processors. Customers can now select the CPU architecture for their functions.

## __Amazon Prometheus Service__
  - ### Features
    - This release adds alert manager and rule group namespace APIs

## __Amazon Simple Email Service__
  - ### Features
    - This release includes the ability to use 2048 bits RSA key pairs for DKIM in SES, either with Easy DKIM or Bring Your Own DKIM.

# __1.12.76__ __2021-09-28__
## __AWS Transfer Family__
  - ### Features
    - Added changes for managed workflows feature APIs.

## __EC2 Image Builder__
  - ### Features
    - Fix description for AmiDistributionConfiguration Name property, which actually refers to the output AMI name. Also updated for consistent terminology to use "base" image, and another update to fix description text.

# __1.12.75__ __2021-09-27__
## __Amazon AppIntegrations Service__
  - ### Features
    - The Amazon AppIntegrations service enables you to configure and reuse connections to external applications.

## __Amazon Connect Service__
  - ### Features
    - This release updates a set of APIs: CreateIntegrationAssociation, ListIntegrationAssociations, CreateUseCase, and StartOutboundVoiceContact. You can use it to create integrations with Amazon Pinpoint for the Amazon Connect Campaigns use case, Amazon Connect Voice ID, and Amazon Connect Wisdom.

## __Amazon Connect Wisdom Service__
  - ### Features
    - Released Amazon Connect Wisdom, a feature of Amazon Connect, which provides real-time recommendations and search functionality in general availability (GA).  For more information, see https://docs.aws.amazon.com/wisdom/latest/APIReference/Welcome.html.

## __Amazon Pinpoint__
  - ### Features
    - Added support for journey with contact center activity

## __Amazon Voice ID__
  - ### Features
    - Released the Amazon Voice ID SDK, for usage with the Amazon Connect Voice ID feature released for Amazon Connect.

## __Elastic Load Balancing__
  - ### Features
    - Adds new ALB-type target group to facilitate forwarding traffic from NLB to ALB

# __1.12.74__ __2021-09-24__
## __AWS License Manager__
  - ### Features
    - AWS License Manager now allows customers to get the LicenseArn in the Checkout API Response.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - DescribeInstances now returns Platform Details, Usage Operation, and Usage Operation Update Time.

# __1.12.73__ __2021-09-23__
## __AWS AppSync__
  - ### Features
    - Documented the new OpenSearchServiceDataSourceConfig data type. Added deprecation notes to the ElasticsearchDataSourceConfig data type.

## __AWS Elemental MediaConvert__
  - ### Features
    - This release adds style and positioning support for caption or subtitle burn-in from rich text sources such as TTML. This release also introduces configurable image-based trick play track generation.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added cutoff behavior support for preventing new task invocations from starting when the maintenance window cutoff time is reached.

# __1.12.72__ __2021-09-22__
## __AWS Elemental MediaPackage VOD__
  - ### Features
    - MediaPackage VOD will now return the current processing statuses of an asset's endpoints. The status can be QUEUED, PROCESSING, PLAYABLE, or FAILED.

## __AWS Identity and Access Management__
  - ### Features
    - Added changes to OIDC API about not using port numbers in the URL.

## __AWS License Manager__
  - ### Features
    - AWS License Manager now allows customers to change their Windows Server or SQL license types from Bring-Your-Own-License (BYOL) to License Included or vice-versa (using the customer's media).

## __AWS MediaTailor__
  - ### Features
    - This release adds support to configure logs for playback configuration.

## __AWS WAFV2__
  - ### Features
    - Added the regex match rule statement, for matching web requests against a single regular expression.

## __Amazon Lex Model Building V2__
  - ### Features
    - This release adds support for utterances statistics for bots built using Lex V2 console and APIs. For details, see: https://docs.aws.amazon.com/lexv2/latest/dg/monitoring-utterances.html

## __EC2 Image Builder__
  - ### Features
    - This feature adds support for specifying GP3 volume throughput and configuring instance metadata options for instances launched by EC2 Image Builder.

# __1.12.71__ __2021-09-21__
## __AWS IoT__
  - ### Features
    - This release adds support for verifying, viewing and filtering AWS IoT Device Defender detect violations with four verification states.

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend now supports versioning of custom models, improved training with ONE_DOC_PER_FILE text documents for custom entity recognition, ability to provide specific test sets during training, and live migration to new model endpoints.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release adds additional support for repository replication

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This update adds support for downloading configuration templates using new APIs (GetVpnConnectionDeviceTypes and GetVpnConnectionDeviceSampleConfiguration) and Internet Key Exchange version 2 (IKEv2) parameters for many popular CGW devices.

## __Managed Streaming for Kafka__
  - ### Features
    - Added StateInfo to ClusterInfo

# __1.12.70__ __2021-09-17__
## __AWS Database Migration Service__
  - ### Features
    - Optional flag force-planned-failover added to reboot-replication-instance API call. This flag can be used to test a planned failover scenario used during some maintenance operations.

## __Amazon Elasticsearch Service__
  - ### Features
    - This release adds an optional parameter in the ListDomainNames API to filter domains based on the engine type (OpenSearch/Elasticsearch).

## __Amazon OpenSearch Service__
  - ### Features
    - This release adds an optional parameter in the ListDomainNames API to filter domains based on the engine type (OpenSearch/Elasticsearch).

# __1.12.69__ __2021-09-16__
## __AWS RoboMaker__
  - ### Features
    - Adding support to create container based Robot and Simulation applications by introducing an environment field

## __Amazon Macie 2__
  - ### Features
    - This release adds support for specifying which managed data identifiers are used by a classification job, and retrieving a list of managed data identifiers that are available.

## __Amazon Pinpoint__
  - ### Features
    - This SDK release adds a new feature for Pinpoint campaigns, in-app messaging.

## __Amazon SageMaker Service__
  - ### Features
    - Add API for users to retry a failed pipeline execution or resume a stopped one.

## __Amazon Simple Storage Service__
  - ### Features
    - Add support for access point arn filtering in S3 CW Request Metrics

## __Amazon Transcribe Service__
  - ### Features
    - This release adds support for subtitling with Amazon Transcribe batch jobs.

## __Managed Streaming for Kafka Connect__
  - ### Features
    - This is the initial SDK release for Amazon Managed Streaming for Apache Kafka Connect (MSK Connect).

# __1.12.68__ __2021-09-14__
## __AWS WAFV2__
  - ### Features
    - This release adds support for including rate based rules in a rule group.

## __Amazon Chime__
  - ### Features
    - Adds support for SipHeaders parameter for CreateSipMediaApplicationCall.

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend now allows you to train and run PDF and Word documents for custom entity recognition. With PDF and Word formats, you can extract information from documents containing headers, lists and tables.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for vt1 3xlarge, 6xlarge and 24xlarge instances powered by Xilinx Alveo U30 Media Accelerators for video transcoding workloads

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for "Project Search"

## __Amazon Transcribe Streaming Service__
  - ### Features
    - Amazon Transcribe now supports PII Identification and Redaction for streaming transcription.

# __1.12.67__ __2021-09-13__
## __AWS IoT__
  - ### Features
    - AWS IoT Rules Engine adds OpenSearch action. The OpenSearch rule action lets you stream data from IoT sensors and applications to Amazon OpenSearch Service which is a successor to Amazon Elasticsearch Service.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds support for T3 instances on Amazon EC2 Dedicated Hosts.

# __1.12.66__ __2021-09-10__
## __AWS CloudFormation__
  - ### Features
    - Doc only update for CloudFormation that fixes several customer-reported issues.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release updates terminology around KMS keys.

## __Amazon QuickSight__
  - ### Features
    - Add new data source type for Amazon OpenSearch (successor to Amazon ElasticSearch).

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for providing a custom timeout value for finding a scaling point during autoscaling in Aurora Serverless v1.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for "Lifecycle Configurations" to SageMaker Studio

## __Amazon Transcribe Service__
  - ### Features
    - This release adds an API option for startTranscriptionJob and startMedicalTranscriptionJob that allows the user to specify encryption context key value pairs for batch jobs.

# __1.12.65__ __2021-09-09__
## __Amazon CodeGuru Reviewer__
  - ### Features
    - The Amazon CodeGuru Reviewer API now includes the RuleMetadata data object and a Severity attribute on a RecommendationSummary object. A RuleMetadata object contains information about a rule that generates a recommendation. Severity indicates how severe the issue associated with a recommendation is.

## __Amazon EMR__
  - ### Features
    - This release enables customers to login to EMR Studio using AWS Identity and Access Management (IAM) identities or identities in their Identity Provider (IdP) via IAM.

## __Amazon Lookout for Equipment__
  - ### Features
    - Added OffCondition parameter to CreateModel API

# __1.12.64__ __2021-09-08__
## __AWS Resource Access Manager__
  - ### Features
    - A minor text-only update that fixes several customer issues.

## __Amazon OpenSearch Service__
  - ### Features
    - Updated Configuration APIs for Amazon OpenSearch Service (successor to Amazon Elasticsearch Service)

## __Managed Streaming for Kafka__
  - ### Features
    - Amazon MSK has added a new API that allows you to update the encrypting and authentication settings for an existing cluster.

# __1.12.63__ __2021-09-07__
## __AWS Elemental MediaPackage__
  - ### Features
    - SPEKE v2 support for live CMAF packaging type. SPEKE v2 is an upgrade to the existing SPEKE API to support multiple encryption keys, it supports live DASH currently.

## __AWS Systems Manager Incident Manager Contacts__
  - ### Features
    - Added SDK examples for SSM-Contacts.

## __AWS X-Ray__
  - ### Features
    - Updated references to AWS KMS keys and customer managed keys to reflect current terminology.

## __Amazon ElastiCache__
  - ### Features
    - Doc only update for ElastiCache

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding RegisterCluster and DeregisterCluster operations, to support connecting external clusters to EKS.

## __Amazon Forecast Service__
  - ### Features
    - Predictor creation now supports selecting an accuracy metric to optimize in AutoML and hyperparameter optimization. This release adds additional accuracy metrics for predictors - AverageWeightedQuantileLoss, MAPE and MASE.

## __Amazon Prometheus Service__
  - ### Features
    - This release adds tagging support for Amazon Managed Service for Prometheus workspace.

# __1.12.62__ __2021-09-03__
## __AWS Outposts__
  - ### Features
    - This release adds a new API CreateOrder.

## __Amazon Chime SDK Identity__
  - ### Features
    - Documentation updates for Chime

## __Amazon Chime SDK Messaging__
  - ### Features
    - Documentation updates for Chime

## __Amazon CodeGuru Reviewer__
  - ### Features
    - Added support for CodeInconsistencies detectors

## __Amazon Fraud Detector__
  - ### Features
    - Enhanced GetEventPrediction API response to include risk scores from imported SageMaker models

# __1.12.61__ __2021-09-02__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - Private Certificate Authority Service now allows customers to enable an online certificate status protocol (OCSP) responder service on their private certificate authorities. Customers can also optionally configure a custom CNAME for their OCSP responder.

## __AWS S3 Control__
  - ### Features
    - S3 Multi-Region Access Points provide a single global endpoint to access a data set that spans multiple S3 buckets in different AWS Regions.

## __AWS SecurityHub__
  - ### Features
    - New ASFF Resources: AwsAutoScalingLaunchConfiguration, AwsEc2VpnConnection, AwsEcrContainerImage. Added KeyRotationStatus to AwsKmsKey. Added AccessControlList, BucketLoggingConfiguration,BucketNotificationConfiguration and BucketNotificationConfiguration to AwsS3Bucket.

## __AWS Transfer Family__
  - ### Features
    - AWS Transfer Family introduces Managed Workflows for creating, executing, monitoring, and standardizing post file transfer processing

## __Access Analyzer__
  - ### Features
    - Updates service API, documentation, and paginators to support multi-region access points from Amazon S3.

## __Amazon Elastic Block Store__
  - ### Features
    - Documentation updates for Amazon EBS direct APIs.

## __Amazon Elastic File System__
  - ### Features
    - Adds support for EFS Intelligent-Tiering, which uses EFS Lifecycle Management to monitor file access patterns and is designed to automatically transition files to and from your corresponding Infrequent Access (IA) storage classes.

## __Amazon FSx__
  - ### Features
    - Announcing Amazon FSx for NetApp ONTAP, a new service that provides fully managed shared storage in the AWS Cloud with the data access and management capabilities of ONTAP.

## __Amazon Lex Model Building Service__
  - ### Features
    - Lex now supports Korean (ko-KR) locale.

## __Amazon QuickSight__
  - ### Features
    - This release adds support for referencing parent datasets as sources in a child dataset.

## __Amazon S3__
  - ### Features
    - Adds a warning message that multi-region access point ARNs are not supported for AWS Java SDK v1

## __Schemas__
  - ### Features
    - This update include the support for Schema Discoverer to discover the events sent to the bus from another account. The feature will be enabled by default when discoverer is created or updated but can also be opt-in or opt-out  by specifying the value for crossAccount.

# __1.12.60__ __2021-09-01__
## __AWS CloudTrail__
  - ### Features
    - Documentation updates for CloudTrail

## __AWS Config__
  - ### Features
    - Documentation updates for config

## __AWS MediaTailor__
  - ### Features
    - This release adds support for wall clock programs in LINEAR channels.

## __AWS Service Catalog App Registry__
  - ### Features
    - Introduction of GetAssociatedResource API and GetApplication response extension for Resource Groups support.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added LaunchTemplate support for the IMDS IPv6 endpoint

# __1.12.59__ __2021-08-31__
## __AWS Compute Optimizer__
  - ### Features
    - Documentation updates for Compute Optimizer

## __AWS DynamoDB Document__
  - ### Bugfixes
    - Switches filterexpression and projectionexpression arguments in two Index query() methods so that underlying implementation gets expected arguments

## __AWS IoT__
  - ### Features
    - Added Create/Update/Delete/Describe/List APIs for a new IoT resource named FleetMetric. Added a new Fleet Indexing query API named GetBucketsAggregation. Added a new field named DisconnectedReason in Fleet Indexing query response. Updated their related documentations.

## __Amazon MemoryDB__
  - ### Features
    - Documentation updates for MemoryDB

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new South African English voice - Ayanda. Ayanda is available as Neural voice only.

## __Amazon Simple Queue Service__
  - ### Features
    - Amazon SQS adds a new queue attribute, RedriveAllowPolicy, which includes the dead-letter queue redrive permission parameters. It defines which source queues can specify dead-letter queues as a JSON object.

# __1.12.58__ __2021-08-30__
## __AWS CloudFormation__
  - ### Features
    - AWS CloudFormation allows you to iteratively develop your applications when failures are encountered without rolling back successfully provisioned resources. By specifying stack failure options, you can troubleshoot resources in a CREATE_FAILED or UPDATE_FAILED status.

## __AWS CodeBuild__
  - ### Features
    - Documentation updates for CodeBuild

## __AWS Key Management Service__
  - ### Features
    - This release has changes to KMS nomenclature to remove the word master from both the "Customer master key" and "CMK" abbreviation and replace those naming conventions with "KMS key".

## __Amazon Kinesis Firehose__
  - ### Features
    - This release adds the Dynamic Partitioning feature to Kinesis Data Firehose service for S3 destinations.

# __1.12.57__ __2021-08-27__
## __Amazon EMR__
  - ### Features
    - Amazon EMR now supports auto-terminating idle EMR clusters. You can specify the idle timeout value when enabling auto-termination for both running and new clusters and Amazon EMR automatically terminates the cluster when idle timeout kicks in.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds the BootMode flag to the ImportImage API and showing the detected BootMode of an ImportImage task.

## __Amazon Simple Storage Service__
  - ### Features
    - Documentation updates for Amazon S3.

# __1.12.56__ __2021-08-26__
## __AWS Compute Optimizer__
  - ### Features
    - Adds support for 1) the AWS Graviton (AWS_ARM64) recommendation preference for Amazon EC2 instance and Auto Scaling group recommendations, and 2) the ability to get the enrollment statuses for all member accounts of an organization.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Support added for resizing VPC prefix lists

## __Amazon Rekognition__
  - ### Features
    - This release added new attributes to Rekognition RecognizeCelebities and GetCelebrityInfo API operations.

## __Amazon Transcribe Service__
  - ### Features
    - This release adds support for batch transcription in six new languages - Afrikaans, Danish, Mandarin Chinese (Taiwan), New Zealand English, South African English, and Thai.

# __1.12.55__ __2021-08-25__
## __AWS DataSync__
  - ### Features
    - Added include filters to CreateTask and UpdateTask, and added exclude filters to StartTaskExecution, giving customers more granular control over how DataSync transfers files, folders, and objects.

## __Amazon CloudWatch Events__
  - ### Features
    - AWS CWEvents adds an enum of EXTERNAL for EcsParameters LaunchType for PutTargets API

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Support added for IMDS IPv6 endpoint

## __Amazon EventBridge__
  - ### Features
    - AWS EventBridge adds an enum of EXTERNAL for EcsParameters LaunchType for PutTargets API

## __Firewall Management Service__
  - ### Features
    - AWS Firewall Manager now supports triggering resource cleanup workflow when account or resource goes out of policy scope for AWS WAF, Security group, AWS Network Firewall, and Amazon Route 53 Resolver DNS Firewall policies.

# __1.12.54__ __2021-08-24__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added MBAFF encoding support for AVC video and the ability to pass encryption context from the job settings to S3.

## __AWS IoT Data Plane__
  - ### Features
    - Updated Publish with support for new Retain flag and added two new API operations: GetRetainedMessage, ListRetainedMessages.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new New Zealand English voice - Aria. Aria is available as Neural voice only.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Updated Parameter Store property for logging improvements.

## __Amazon Transcribe Service__
  - ### Features
    - This release adds support for feature tagging with Amazon Transcribe batch jobs.

# __1.12.53__ __2021-08-23__
## __AWS Backup__
  - ### Features
    - AWS Backup - Features: Evaluate your backup activity and generate audit reports.

## __AWS Database Migration Service__
  - ### Features
    - Amazon AWS DMS service now support Redis target endpoint migration. Now S3 endpoint setting is capable to setup features which are used to be configurable only in extract connection attributes.

## __AWS Glue__
  - ### Features
    - Add support for Custom Blueprints

## __AWS IoT SiteWise__
  - ### Features
    - Documentation updates for AWS IoT SiteWise

## __Amazon API Gateway__
  - ### Features
    - Adding some of the pending releases (1) Adding WAF Filter to GatewayResponseType enum (2) Ensuring consistent error model for all operations (3) Add missing BRE to GetVpcLink operation

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Added AMI deprecation support for Amazon Data Lifecycle Manager EBS-backed AMI policies.

## __Amazon Fraud Detector__
  - ### Features
    - Updated an element of the DescribeModelVersion API response (LogitMetrics -> logOddsMetrics) for clarity. Added new exceptions to several APIs to protect against unlikely scenarios.

# __1.12.52__ __2021-08-20__
## __AWS RoboMaker__
  - ### Features
    - Documentation updates for RoboMaker

## __Amazon Comprehend__
  - ### Features
    - Add tagging support for Comprehend async inference job.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - encryptionInTransitSupported added to DescribeInstanceTypes API

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adds support for EKS add-ons "preserve" flag, which allows customers to maintain software on their EKS clusters after removing it from EKS add-ons management.

# __1.12.51__ __2021-08-19__
## __Amazon Appflow__
  - ### Features
    - This release adds support for SAPOData connector and extends Veeva connector for document extraction.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - The ImportImage API now supports the ability to create AMIs with AWS-managed licenses for Microsoft SQL Server for both Windows and Linux.

## __Amazon MemoryDB__
  - ### Features
    - AWS MemoryDB  SDK now supports all APIs for newly launched MemoryDB service.

## __Application Auto Scaling__
  - ### Features
    - This release extends Application Auto Scaling support for replication group of Amazon ElastiCache Redis clusters. Auto Scaling monitors and automatically expands node group count and number of replicas per node group when a critical usage threshold is met or according to customer-defined schedule.

# __1.12.50__ __2021-08-18__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild now allows you to make the build results for your build projects available to the public without requiring access to an AWS account.

## __Amazon Route 53__
  - ### Features
    - Documentation updates for route53

## __Amazon Route 53 Resolver__
  - ### Features
    - Documentation updates for Route 53 Resolver

## __Amazon SageMaker Runtime__
  - ### Features
    - Amazon SageMaker Runtime now supports InvokeEndpointAsync to asynchronously invoke endpoints that were created with the AsyncInferenceConfig object in the EndpointConfig. Asynchronous invocations support larger payload sizes in Amazon S3 and longer processing times.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker now supports Asynchronous Inference endpoints. Adds PlatformIdentifier field that allows Notebook Instance creation with different platform selections. Increases the maximum number of containers in multi-container endpoints to 15. Adds more instance types to InstanceType field.

# __1.12.49__ __2021-08-17__
## __AWS Cloud9__
  - ### Features
    - Added DryRun parameter to CreateEnvironmentEC2 API. Added ManagedCredentialsActions parameter to UpdateEnvironment API

## __AWS Cost Explorer Service__
  - ### Features
    - This release is a new feature for Cost Categories: Split charge rules. Split charge rules enable you to allocate shared costs between your cost category values.

## __Amazon CloudDirectory__
  - ### Features
    - Documentation updates for clouddirectory

## __Amazon CloudWatch Logs__
  - ### Features
    - Documentation-only update for CloudWatch Logs

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for EC2 ED25519 key pairs for authentication

# __1.12.48__ __2021-08-16__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild now allows you to select how batch build statuses are sent to the source provider for a project.

## __AWS Config__
  - ### Features
    - Update ResourceType enum with values for Backup Plan, Selection, Vault, RecoveryPoint; ECS Cluster, Service, TaskDefinition; EFS AccessPoint, FileSystem; EKS Cluster; ECR Repository resources

## __AWS Directory Service__
  - ### Features
    - This release adds support for describing client authentication settings.

## __AWS IoT SiteWise__
  - ### Features
    - AWS IoT SiteWise added query window for the interpolation interval. AWS IoT SiteWise computes each interpolated value by using data points from the timestamp of each interval minus the window to the timestamp of each interval plus the window.

## __AWS License Manager__
  - ### Features
    - AWS License Manager now allows end users to call CheckoutLicense API using new CheckoutType PERPETUAL. Perpetual checkouts allow sellers to check out a quantity of entitlements to be drawn down for consumption.

## __Amazon Simple Storage Service__
  - ### Features
    - Documentation updates for Amazon S3

# __1.12.47__ __2021-08-13__
## __Amazon Connect Customer Profiles__
  - ### Features
    - This release introduces Standard Profile Objects, namely Asset and Case which contain values populated by data from third party systems and belong to a specific profile. This release adds an optional parameter, ObjectFilter to the ListProfileObjects API in order to search for these Standard Objects.

## __Amazon EMR__
  - ### Features
    - Amazon EMR customers can now specify custom AMIs at the instance level in their clusters. This allows using custom AMIs in clusters that have instances with different instruction set architectures, e.g. m5.xlarge (x86) and m6g.xlarge (ARM).

## __Amazon ElastiCache__
  - ### Features
    - This release adds ReplicationGroupCreateTime field to ReplicationGroup which indicates the UTC time when ElastiCache ReplicationGroup is created

## __Amazon QuickSight__
  - ### Features
    - Documentation updates for QuickSight.

# __1.12.46__ __2021-08-12__
## __AWS Glue DataBrew__
  - ### Features
    - This SDK release adds support for the output of a recipe job results to Tableau Hyper format.

## __AWS Lambda__
  - ### Features
    - Lambda Python 3.9 runtime launch

## __Amazon API Gateway__
  - ### Features
    - Adding support for ACM imported or private CA certificates for mTLS enabled domain names

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Autopilot adds new metrics for all candidate models generated by Autopilot experiments.

## __AmazonApiGatewayV2__
  - ### Features
    - Adding support for ACM imported or private CA certificates for mTLS enabled domain names

# __1.12.45__ __2021-08-11__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild now allows you to make the build results for your build projects available to the public without requiring access to an AWS account.

## __AWS SDK for Java__
  - ### Bugfixes
    - Use full jitter and update base delay for STANDARD retry mode defaults

## __AWS Snow Device Management__
  - ### Features
    - AWS Snow Family customers can remotely monitor and operate their connected AWS Snowcone devices.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates for ECS.

## __Amazon Elastic Block Store__
  - ### Features
    - Documentation updates for Amazon EBS direct APIs.

## __Amazon Route 53__
  - ### Features
    - Documentation updates for route53

## __AmazonNimbleStudio__
  - ### Features
    - Add new attribute 'ownedBy' in Streaming Session APIs. 'ownedBy' represents the AWS SSO Identity Store User ID of the owner of the Streaming Session resource.

# __1.12.44__ __2021-08-10__
## __Amazon Chime__
  - ### Features
    - Add support for "auto" in Region field of StartMeetingTranscription API request.

# __1.12.43__ __2021-08-09__
## __AWS WAFV2__
  - ### Features
    - This release adds APIs to support versioning feature of AWS WAF Managed rule groups

## __Amazon Rekognition__
  - ### Features
    - This release adds support for four new types of segments (opening credits, content segments, slates, and studio logos), improved accuracy for credits and shot detection and new filters to control black frame detection.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Documentation updates for AWS Systems Manager.

# __1.12.42__ __2021-08-06__
## __Amazon Athena__
  - ### Features
    - Documentation updates for Athena.

## __Amazon Chime SDK Identity__
  - ### Features
    - The Amazon Chime SDK Identity APIs allow software developers to create and manage unique instances of their messaging applications.

## __Amazon Chime SDK Messaging__
  - ### Features
    - The Amazon Chime SDK Messaging APIs allow software developers to send and receive messages in custom messaging applications.

## __Amazon Connect Service__
  - ### Features
    - This release adds support for agent status and hours of operation. For details, see the Release Notes in the Amazon Connect Administrator Guide.

## __Amazon Lightsail__
  - ### Features
    - This release adds support to track when a bucket access key was last used.

## __Synthetics__
  - ### Features
    - Documentation updates for Visual Monitoring feature and other doc ticket fixes.

# __1.12.41__ __2021-08-05__
## __Amazon Lex Model Building V2__
  - ### Features
    - Customers can now toggle the active field on prompts and responses.

## __Auto Scaling__
  - ### Features
    - EC2 Auto Scaling adds configuration checks and Launch Template validation to Instance Refresh.

# __1.12.40__ __2021-08-04__
## __AWS SDK for Java__
  - ### Features
    - Moving 1.11.x changes to a separate changelog file.

## __AWS Systems Manager Incident Manager__
  - ### Features
    - Documentation updates for Incident Manager.

## __Amazon EventBridge__
  - ### Features
    - Documentation updates to add EC2 Image Builder as a target on PutTargets.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds AutomaticRestartTime to the DescribeDBInstances and DescribeDBClusters operations. AutomaticRestartTime indicates the time when a stopped DB instance or DB cluster is restarted automatically.

## __Amazon Transcribe Service__
  - ### Features
    - This release adds support for call analytics (batch) within Amazon Transcribe.

## __EC2 Image Builder__
  - ### Features
    - Updated list actions to include a list of valid filters that can be used in the request.

# __1.12.39__ __2021-08-03__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added control over the passthrough of XDS captions metadata to outputs.

## __AWS Glue__
  - ### Features
    - Add ConcurrentModificationException to create-table, delete-table, create-database, update-database, delete-database

## __AWS IoT SiteWise__
  - ### Features
    - My AWS Service (placeholder) - This release introduces custom Intervals and offset for tumbling window in metric for AWS IoT SiteWise.

## __AWS Proton__
  - ### Features
    - Docs only add idempotent create apis

## __AWS SDK for Java__
  - ### Features
    - Allow configuring the EC2 metadata connect/read timeout via the AWS_METADATA_SERVICE_TIMEOUT environment variable

  - ### Bugfixes
    - Prevent deadlock in Jackson-databind's PropertyNamingStrategy (only when Jackson-databind 2.12.x is on the classpath): https://github.com/FasterXML/jackson-databind/issues/2715

## __Amazon Redshift__
  - ### Features
    - API support for Redshift Data Sharing feature.

# __1.12.38__ __2021-08-02__
## __AWS IoT Greengrass V2__
  - ### Features
    - This release adds support for component system resource limits and idempotent Create operations. You can now specify the maximum amount of CPU and memory resources that each component can use.

## __AWS Systems Manager Incident Manager Contacts__
  - ### Features
    - Added new attribute in AcceptCode API. AcceptCodeValidation takes in two values - ENFORCE, IGNORE. ENFORCE forces validation of accept code and IGNORE ignores it which is also the default behavior; Corrected TagKeyList length from 200 to 50

# __1.12.37__ __2021-07-30__
## __AWS AppSync__
  - ### Features
    - AWS AppSync now supports a new authorization mode allowing you to define your own authorization logic using an AWS Lambda function.

## __AWS Secrets Manager__
  - ### Features
    - Add support for KmsKeyIds in the ListSecretVersionIds API response

## __Amazon SageMaker Service__
  - ### Features
    - API changes with respect to Lambda steps in model building pipelines. Adds several waiters to async Sagemaker Image APIs. Add more instance types to AppInstanceType field

## __Elastic Load Balancing__
  - ### Features
    - Client Port Preservation ALB Attribute Launch

# __1.12.36__ __2021-07-29__
## __AWS IoT__
  - ### Features
    - Increase maximum credential duration of role alias to 12 hours.

## __AWS IoT SiteWise__
  - ### Features
    - Added support for AWS IoT SiteWise Edge. You can now create an AWS IoT SiteWise gateway that runs on AWS IoT Greengrass V2. With the gateway,  you can collect local server and equipment data, process the data, and export the selected data from the edge to the AWS Cloud.

## __AWS Savings Plans__
  - ### Features
    - Documentation update for valid Savings Plans offering ID pattern

## __Amazon Chime__
  - ### Features
    - Adds support for live transcription of meetings with Amazon Transcribe and Amazon Transcribe Medical.  The new APIs, StartMeetingTranscription and StopMeetingTranscription, control the generation of user-attributed transcriptions sent to meeting clients via Amazon Chime SDK data messages.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for G4ad xlarge and 2xlarge instances powered by AMD Radeon Pro V520 GPUs and AMD 2nd Generation EPYC processors

# __1.12.35__ __2021-07-28__
## __AWS CloudFormation__
  - ### Features
    - SDK update to support Importing existing Stacks to new/existing Self Managed StackSet - Stack Import feature.

## __AWS Single Sign-On Admin__
  - ### Features
    - Documentation updates for arn:aws:trebuchet:::service:v1:03a2216d-1cda-4696-9ece-1387cb6f6952

# __1.12.34__ __2021-07-28__
## __AWS Batch__
  - ### Features
    - Add support for ListJob filters

## __AWS IoT Analytics__
  - ### Features
    - IoT Analytics now supports creating a dataset resource with IoT SiteWise MultiLayerStorage data stores, enabling customers to query industrial data within the service. This release includes adding JOIN functionality for customers to query multiple data sources in a dataset.

## __AWS IoT Wireless__
  - ### Features
    - Add SidewalkManufacturingSn as an identifier to allow Customer to query WirelessDevice, in the response, AmazonId is added in the case that Sidewalk device is return.

## __AWS Route53 Recovery Control Config__
  - ### Features
    - Amazon Route 53 Application Recovery Controller's routing control - Routing Control Configuration APIs help you create and delete clusters, control panels, routing controls and safety rules. State changes (On/Off) of routing controls are not part of configuration APIs.

## __AWS Route53 Recovery Readiness__
  - ### Features
    - Amazon Route 53 Application Recovery Controller's readiness check capability continually monitors resource quotas, capacity, and network routing policies to ensure that the recovery environment is scaled and configured to take over when needed.

## __AWS Shield__
  - ### Features
    - Change name of DDoS Response Team (DRT) to Shield Response Team (SRT)

## __Amazon Lex Model Building V2__
  - ### Features
    - Add waiters that automatically poll for resource status for asynchronous operations, such as building a bot

## __Amazon QuickSight__
  - ### Features
    - Add support to use row-level security with tags when embedding dashboards for users not provisioned in QuickSight

## __Amazon Route 53__
  - ### Features
    - This release adds support for the RECOVERY_CONTROL health check type to be used in conjunction with Route53 Application Recovery Controller.

## __Redshift Data API Service__
  - ### Features
    - Added structures to support new Data API operation BatchExecuteStatement, used to execute multiple SQL statements within a single transaction.

## __Route53 Recovery Cluster__
  - ### Features
    - Amazon Route 53 Application Recovery Controller's routing control - Routing Control Data Plane APIs help you update the state (On/Off) of the routing controls to reroute traffic across application replicas in a 100% available manner.

# __1.12.33__ __2021-07-27__
## __AWS Batch__
  - ### Features
    - Add support for ListJob filters

## __AWS IoT Analytics__
  - ### Features
    - IoT Analytics now supports creating a dataset resource with IoT SiteWise MultiLayerStorage data stores, enabling customers to query industrial data within the service. This release includes adding JOIN functionality for customers to query multiple data sources in a dataset.

## __AWS IoT Wireless__
  - ### Features
    - Add SidewalkManufacturingSn as an identifier to allow Customer to query WirelessDevice, in the response, AmazonId is added in the case that Sidewalk device is return.

## __AWS Route53 Recovery Control Config__
  - ### Features
    - Amazon Route 53 Application Recovery Controller's routing control - Routing Control Configuration APIs help you create and delete clusters, control panels, routing controls and safety rules. State changes (On/Off) of routing controls are not part of configuration APIs.

## __AWS Route53 Recovery Readiness__
  - ### Features
    - Amazon Route 53 Application Recovery Controller's readiness check capability continually monitors resource quotas, capacity, and network routing policies to ensure that the recovery environment is scaled and configured to take over when needed.

## __AWS Shield__
  - ### Features
    - Change name of DDoS Response Team (DRT) to Shield Response Team (SRT)

## __Amazon Lex Model Building V2__
  - ### Features
    - Add waiters that automatically poll for resource status for asynchronous operations, such as building a bot

## __Amazon QuickSight__
  - ### Features
    - Add support to use row-level security with tags when embedding dashboards for users not provisioned in QuickSight

## __Amazon Route 53__
  - ### Features
    - This release adds support for the RECOVERY_CONTROL health check type to be used in conjunction with Route53 Application Recovery Controller.

## __Redshift Data API Service__
  - ### Features
    - Added structures to support new Data API operation BatchExecuteStatement, used to execute multiple SQL statements within a single transaction.

## __Route53 Recovery Cluster__
  - ### Features
    - Amazon Route 53 Application Recovery Controller's routing control - Routing Control Data Plane APIs help you update the state (On/Off) of the routing controls to reroute traffic across application replicas in a 100% available manner.

# __1.12.32__ __2021-07-26__
## __AWS Proton__
  - ### Features
    - Documentation-only update links

## __AWS S3 Control__
  - ### Features
    - S3 Access Point aliases can be used anywhere you use S3 bucket names to access data in S3

## __AWS SSO Identity Store__
  - ### Features
    - Documentation updates for SSO API Ref.

## __Amazon CloudWatch__
  - ### Features
    - SDK update to support creation of Cross-Account Metric Alarms and update API documentation.

## __Amazon Textract__
  - ### Features
    - Adds support for AnalyzeExpense, a new API to extract relevant data such as contact information, items purchased, and vendor name, from almost any invoice or receipt without the need for any templates or configuration.

## __Synthetics__
  - ### Features
    - CloudWatch Synthetics now supports visual testing in its canaries.

# __1.12.31__ __2021-07-23__
## __AWS SecurityHub__
  - ### Features
    - Added product name, company name, and Region fields for security findings. Added details objects for RDS event subscriptions and AWS ECS services. Added fields to the details for AWS Elasticsearch domains.

## __Amazon S3 on Outposts__
  - ### Features
    - Add on-premise access type support for endpoints

## __EC2 Image Builder__
  - ### Features
    - Update to documentation to reapply missing change to SSM uninstall switch default value and improve description.

# __1.12.30__ __2021-07-22__
## __AWS Elemental MediaLive__
  - ### Features
    - MediaLive now supports passing through style data on WebVTT caption outputs.

## __AWS Glue DataBrew__
  - ### Features
    - This SDK release adds two new features: 1) Output to Native JDBC destinations and 2) Adding configurations to profile jobs

## __AWS S3 Control__
  - ### Features
    - Documentation updates for Amazon S3-control

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release allows customers to assign prefixes to their elastic network interface and to reserve IP blocks in their subnet CIDRs. These reserved blocks can be used to assign prefixes to elastic network interfaces or be excluded from auto-assignment.

## __Amazon QLDB__
  - ### Features
    - Amazon QLDB now supports ledgers encrypted with customer managed KMS keys. Changes in CreateLedger, UpdateLedger and DescribeLedger APIs to support the changes.

## __Elastic Load Balancing__
  - ### Features
    - Adds support for enabling TLS protocol version and cipher suite headers to be sent to backend targets for Application Load Balancers.

# __1.12.29__ __2021-07-21__
## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild now allows you to set the access permissions for build artifacts, project artifacts, and log files that are uploaded to an Amazon S3 bucket that is owned by another account.

## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

## __AWS Lambda__
  - ### Features
    - New ResourceConflictException error code for PutFunctionEventInvokeConfig, UpdateFunctionEventInvokeConfig, and DeleteFunctionEventInvokeConfig operations.

## __AWS Proton__
  - ### Features
    - Documentation updates for AWS Proton

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now provides a data source connector for Amazon WorkDocs. For more information, see https://docs.aws.amazon.com/kendra/latest/dg/data-source-workdocs.html

## __Amazon Elastic MapReduce__
  - ### Features
    - EMR now supports new DescribeReleaseLabel and ListReleaseLabel APIs. They can provide Amazon EMR release label details. You can programmatically list available releases and applications for a specific Amazon EMR release label.

## __Amazon Personalize__
  - ### Features
    - My AWS Service (placeholder) - Making minProvisionedTPS an optional parameter when creating a campaign. If not provided, it defaults to 1.

## __Amazon Relational Database Service__
  - ### Features
    - Adds the OriginalSnapshotCreateTime field to the DBSnapshot response object. This field timestamps the underlying data of a snapshot and doesn't change when the snapshot is copied.

## __Elastic Load Balancing__
  - ### Features
    - Adds support for enabling TLS protocol version and cipher suite headers to be sent to backend targets for Application Load Balancers.

# __1.12.28__ __2021-07-20__
## __AWS Compute Optimizer__
  - ### Features
    - Documentation updates for Compute Optimizer

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added idempotency to the CreateVolume API using the ClientToken request parameter

# __1.12.27__ __2021-07-19__
## __AWS Direct Connect__
  - ### Features
    - Documentation updates for directconnect

## __AWS Health APIs and Notifications__
  - ### Features
    - In the Health API, the maximum number of entities for the EventFilter and EntityFilter data types has changed from 100 to 99. This change is related to an internal optimization of the AWS Health service.

## __AWS RoboMaker__
  - ### Features
    - This release allows customers to create a new version of WorldTemplates with support for Doors.

## __Amazon EMR Containers__
  - ### Features
    - Updated DescribeManagedEndpoint and ListManagedEndpoints to return failureReason and stateDetails in API response.

## __Amazon Location Service__
  - ### Features
    - Add five new API operations: UpdateGeofenceCollection, UpdateMap, UpdatePlaceIndex, UpdateRouteCalculator, UpdateTracker.

## __EC2 Image Builder__
  - ### Features
    - Documentation updates for reversal of default value for additional instance configuration SSM switch, plus improved descriptions for semantic versioning.

# __1.12.26__ __2021-07-16__
## __AWS Audit Manager__
  - ### Features
    - This release relaxes the S3 URL character restrictions in AWS Audit Manager. Regex patterns have been updated for the following attributes: s3RelativePath, destination, and s3ResourcePath. 'AWS' terms have also been replaced with entities to align with China Rebrand documentation efforts.

## __Amazon AppIntegrations Service__
  - ### Features
    - Documentation update for AppIntegrations Service

## __Amazon Chime__
  - ### Features
    - This SDK release adds Account Status as one of the attributes in Account API response

# __1.12.25__ __2021-07-15__
## __AWS IoT SiteWise__
  - ### Features
    - Update the default endpoint for the APIs used to manage asset models, assets, gateways, tags, and account configurations. If you have firewalls with strict egress rules, configure the rules to grant you access to api.iotsitewise.[region].amazonaws.com or api.iotsitewise.[cn-region].amazonaws.com.cn.

## __AWS SDK for Java__
  - ### Features
    - Adaptive retry mode dynamically limits the rate of AWS requests to maximize success rate. This may be at the expense of
      request latency. Adaptive retry mode is not recommended when predictable latency is important. 

      Warning: Adaptive retry mode assumes that the client is working against a single resource (e.g. one DynamoDB Table or
      one S3 Bucket). If you use a single client for multiple resources, throttling or outages associated with one resource
      will result in increased latency and failures when accessing all other resources via the same client. When using
      adaptive retry mode, we recommend using a single client per resource.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Documentation updates for cognito-idp

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates for support of awsvpc mode on Windows.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This feature enables customers  to specify weekly recurring time window(s) for scheduled events that reboot, stop or terminate EC2 instances.

## __Amazon Lex Model Building Service__
  - ### Features
    - Lex now supports the en-IN locale

# __1.12.24__ __2021-07-14__
## __AWS Certificate Manager__
  - ### Features
    - Added support for RSA 3072 SSL certificate import

## __AWS Database Migration Service__
  - ### Features
    - Release of feature needed for ECA-Endpoint settings. This allows customer to delete a field in endpoint settings by using --exact-settings flag in modify-endpoint api. This also displays default values for certain required fields of endpoint settings in describe-endpoint-settings api.

## __AWS Glue__
  - ### Features
    - Add support for Event Driven Workflows

## __AWS Well-Architected Tool__
  - ### Features
    - This update provides support for Well-Architected API users to mark answer choices as not applicable.

## __Amazon HealthLake__
  - ### Features
    - General availability for Amazon HealthLake. StartFHIRImportJob and StartFHIRExportJob APIs now require AWS KMS parameter. For more information, see the Amazon HealthLake Documentation https://docs.aws.amazon.com/healthlake/index.html.

## __Amazon Lightsail__
  - ### Features
    - This release adds support for the Amazon Lightsail object storage service, which allows you to create buckets and store objects.

# __1.12.23__ __2021-07-13__
## __AWS Direct Connect__
  - ### Features
    - This release adds a new filed named awsLogicalDeviceId that it displays the AWS Direct Connect endpoint which terminates a physical connection's BGP Sessions.

## __AWS Price List Service__
  - ### Features
    - Documentation updates for api.pricing

## __Amazon DevOps Guru__
  - ### Features
    - Add paginator for GetCostEstimation

## __Amazon Lex Model Building Service__
  - ### Features
    - Customers can now migrate bots built with Lex V1 APIs to V2 APIs. This release adds APIs to initiate and manage the migration of a bot.

## __Amazon Redshift__
  - ### Features
    - Release new APIs to support new Redshift feature - Authentication Profile

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Changes to OpsCenter APIs to support a new feature, operational insights.

## __AmplifyBackend__
  - ### Features
    - Added Sign in with Apple OAuth provider.

# __1.12.22__ __2021-07-12__
## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports Principal Store

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Documentation updates for Wesley to support the parallel node upgrade feature.

# __1.12.21__ __2021-07-09__
## __AWS Elemental MediaConvert__
  - ### Features
    - MediaConvert now supports color, style and position information passthrough from 608 and Teletext to SRT and WebVTT subtitles. MediaConvert now also supports Automatic QVBR quality levels for QVBR RateControlMode.

## __Amazon Fraud Detector__
  - ### Features
    - This release adds support for ML Explainability to display model variable importance value in Amazon Fraud Detector.

## __Amazon SageMaker Service__
  - ### Features
    - Releasing new APIs related to Tuning steps in model building pipelines.

# __1.12.20__ __2021-07-08__
## __AWS MediaTailor__
  - ### Features
    - Add ListAlerts for Channel, Program, Source Location, and VOD Source to return alerts for resources.

## __AWS Outposts__
  - ### Features
    - Added property filters for listOutposts

## __AWS Systems Manager Incident Manager Contacts__
  - ### Features
    - Updated description for CreateContactChannel contactId.

## __Amazon DevOps Guru__
  - ### Features
    - Add AnomalyReportedTimeRange field to include open and close time of anomalies.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Added waiters for EKS FargateProfiles.

## __Firewall Management Service__
  - ### Features
    - AWS Firewall Manager now supports route table monitoring, and provides remediation action recommendations to security administrators for AWS Network Firewall policies with misconfigured routes.

# __1.12.19__ __2021-07-07__
## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

## __AWS IoT SiteWise__
  - ### Features
    - This release add storage configuration APIs for AWS IoT SiteWise.

## __AWS Security Token Service__
  - ### Features
    - Documentation updates for AWS Security Token Service.

## __AWS Storage Gateway__
  - ### Features
    - Adding support for oplocks for SMB file shares,  S3 Access Point and S3 Private Link for all file shares and IP address support for file system associations

## __Amazon Chime__
  - ### Features
    - Releasing new APIs for AWS Chime MediaCapturePipeline

## __Amazon CloudFront__
  - ### Features
    - Amazon CloudFront now provides two new APIs, ListConflictingAliases and AssociateAlias, that help locate and move Alternate Domain Names (CNAMEs) if you encounter the CNAMEAlreadyExists error code.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds resource ids and tagging support for VPC security group rules.

## __AmazonMQ__
  - ### Features
    - adds support for modifying the maintenance window for brokers.

# __1.12.18__ __2021-07-06__
## __AWS Lambda__
  - ### Features
    - Added support for AmazonMQRabbitMQ as an event source. Added support for VIRTUAL_HOST as SourceAccessType for streams event source mappings.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding new error code UnsupportedAddonModification for Addons in EKS

## __Amazon Macie 2__
  - ### Features
    - Sensitive data findings in Amazon Macie now include enhanced location data for JSON and JSON Lines files

## __Amazon Simple Notification Service__
  - ### Features
    - Documentation updates for Amazon SNS.

## __Application Migration Service__
  - ### Features
    - Bug fix: Remove not supported EBS encryption type "NONE"

## __EC2 Image Builder__
  - ### Features
    - Adds support for specifying parameters to customize components for recipes. Expands configuration of the Amazon EC2 instances that are used for building and testing images, including the ability to specify commands to run on launch, and more control over installation and removal of the SSM agent.

# __1.12.17__ __2021-07-02__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release removes network-insights-boundary

## __Elastic Load Balancing__
  - ### Features
    - Documentation updates for elasticloadbalancingv2

# __1.12.16__ __2021-07-01__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adding a new reserved field to support future infrastructure improvements for Amazon EC2 Fleet.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker model registry now supports up to 5 containers and associated environment variables.

## __Amazon Simple Queue Service__
  - ### Features
    - Documentation updates for Amazon SQS.

# __1.12.15__ __2021-06-30__
## __AWS Cloud Map__
  - ### Features
    - AWS Cloud Map now allows configuring the TTL of the SOA record for a hosted zone to control the negative caching for new services.

## __AWS Elemental MediaPackage VOD__
  - ### Features
    - Add support for Widevine DRM on CMAF packaging configurations. Both Widevine and FairPlay DRMs can now be used simultaneously, with CBCS encryption.

## __AWS Glue DataBrew__
  - ### Features
    - Adds support for the output of job results to the AWS Glue Data Catalog.

## __AWS Systems Manager Incident Manager Contacts__
  - ### Features
    - Fixes the tag key length range to 128 chars,  tag value length to 256 chars; Adds support for UTF-8 chars for contact and channel names, Allows users to unset name in UpdateContact API; Adds throttling exception to StopEngagement API, validation exception to APIs UntagResource, ListTagsForResource

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra Enterprise Edition now offered in smaller more granular units to enable customers with smaller workloads. Virtual Storage Capacity units now offer scaling in increments of 100,000 documents (up to 30GB) per unit and Virtual Query Units offer scaling increments of 8,000 queries per day.

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling infrastructure improvements and optimizations.

# __1.12.14__ __2021-06-28__
## __AWS Elemental MediaConvert__
  - ### Features
    - MediaConvert adds support for HDR10+, ProRes 4444,  and XAVC outputs, ADM/DAMF support for Dolby Atmos ingest, and alternative audio and WebVTT caption ingest via HLS inputs. MediaConvert also now supports creating trickplay outputs for Roku devices for HLS, CMAF, and DASH output groups.

## __AWS Glue__
  - ### Features
    - Add JSON Support for Glue Schema Registry

## __Amazon Redshift__
  - ### Features
    - Added InvalidClusterStateFault to the DisableLogging API, thrown when calling the API on a non available cluster.

## __Amazon SageMaker Service__
  - ### Features
    - Sagemaker Neo now supports running compilation jobs using customer's Amazon VPC

# __1.12.13__ __2021-06-25__
## __AWS Proton__
  - ### Features
    - Added waiters for template registration, service operations, and environment deployments.

## __Amazon Import/Export Snowball__
  - ### Features
    - AWS Snow Family customers can remotely monitor and operate their connected AWS Snowcone devices. AWS Snowball Edge Storage Optimized customers can now import and export their data using NFS.

## __AmplifyBackend__
  - ### Features
    - Imports an existing backend authentication resource.

# __1.12.12__ __2021-06-24__
## __AWS Cloud9__
  - ### Features
    - Minor update to AWS Cloud9 documentation to allow correct parsing of outputted text

## __AWS CodeBuild__
  - ### Features
    - BucketOwnerAccess is currently not supported

## __AWS SecurityHub__
  - ### Features
    - Added new resource details for ECS clusters and ECS task definitions. Added additional information for S3 buckets, Elasticsearch domains, and API Gateway V2 stages.

## __AWS Transfer Family__
  - ### Features
    - Customers can successfully use legacy clients with Transfer Family endpoints enabled for FTPS and FTP behind routers, firewalls, and load balancers by providing a Custom IP address used for data channel communication.

## __AWS WAFV2__
  - ### Features
    - Added support for 15 new text transformation.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports SharePoint 2013 and SharePoint 2016 when using a SharePoint data source.

## __Amazon Chime__
  - ### Features
    - Adds EventIngestionUrl field to MediaPlacement

## __Amazon Connect Service__
  - ### Features
    - Released Amazon Connect quick connects management API for general availability (GA). For more information, see https://docs.aws.amazon.com/connect/latest/APIReference/Welcome.html

## __Amazon DynamoDB Accelerator (DAX)__
  - ### Features
    - Add support for encryption in transit to DAX clusters.

# __1.12.11__ __2021-06-23__
## __AWS Cloud9__
  - ### Features
    - Updated documentation for CreateEnvironmentEC2 to explain that because Amazon Linux AMI has ended standard support as of December 31, 2020, we recommend you choose Amazon Linux 2--which includes long term support through 2023--for new AWS Cloud9 environments.

## __AWS License Manager__
  - ### Features
    - AWS License Manager now allows license administrators and end users to communicate to each other by setting custom status reasons when updating the status on a granted license.

## __AWS MediaTailor__
  - ### Features
    - Update GetChannelSchedule to return information on ad breaks.

## __Amazon CloudFront__
  - ### Features
    - Amazon CloudFront adds support for a new security policy, TLSv1.2_2021.

## __Amazon CloudSearch__
  - ### Features
    - This release replaces previous generation CloudSearch instances with equivalent new instances that provide better stability at the same price.

## __Amazon CloudWatch Events__
  - ### Features
    - Added the following parameters to ECS targets: CapacityProviderStrategy, EnableECSManagedTags, EnableExecuteCommand, PlacementConstraints, PlacementStrategy, PropagateTags, ReferenceId, and Tags

## __Amazon CodeGuru Reviewer__
  - ### Features
    - Adds support for S3 based full repository analysis and changed lines scan.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - DocumentDB documentation-only edits

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for provisioning your own IP (BYOIP) range in multiple regions. This feature is in limited Preview for this release. Contact your account manager if you are interested in this feature.

## __Amazon EventBridge__
  - ### Features
    - Added the following parameters to ECS targets: CapacityProviderStrategy, EnableECSManagedTags, EnableExecuteCommand, PlacementConstraints, PlacementStrategy, PropagateTags, ReferenceId, and Tags

## __Amazon QuickSight__
  - ### Features
    - Releasing new APIs for AWS QuickSight Folders

# __1.12.10__ __2021-06-21__
## __AWS CloudFormation__
  - ### Features
    - CloudFormation registry service now supports 3rd party public type sharing

# __1.12.9__ __2021-06-17__
## __AWS SDK for Java__
  - ### Bugfixes
    - Removed 'in-amazon-1' region.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports the indexing of web documents for search through the web crawler.

## __Amazon Chime__
  - ### Features
    - This release adds a new API UpdateSipMediaApplicationCall, to update an in-progress call for SipMediaApplication.

## __Amazon Relational Database Service__
  - ### Features
    - This release enables Database Activity Streams for RDS Oracle

## __Amazon SageMaker Service__
  - ### Features
    - Enable ml.g4dn instance types for SageMaker Batch Transform and SageMaker Processing

# __1.12.8__ __2021-06-16__
## __AWS Key Management Service__
  - ### Features
    - Adds support for multi-Region keys

## __AWS MediaTailor__
  - ### Features
    - Adds AWS Secrets Manager Access Token Authentication for Source Locations

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for VLAN-tagged network traffic over an Elastic Network Interface (ENI). This feature is in limited Preview for this release. Contact your account manager if you are interested in this feature.

## __Amazon Relational Database Service__
  - ### Features
    - This release enables fast cloning in Aurora Serverless. You can now clone between Aurora Serverless clusters and Aurora Provisioned clusters.

# __1.12.7__ __2021-06-15__
## __AWS SDK for Java__
  - ### Features
    - Launch new region in-amazon-1 in India (Begumpet)

## __Amazon Connect Service__
  - ### Features
    - This release adds new sets of APIs: AssociateBot, DisassociateBot, and ListBots. You can use it to programmatically add an Amazon Lex bot or Amazon Lex V2 bot on the specified Amazon Connect instance

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EC2 M5n, M5dn, R5n, R5dn metal instances with 100 Gbps network performance and Elastic Fabric Adapter (EFA) for ultra low latency

## __Amazon Lex Model Building V2__
  - ### Features
    - This release adds support for Multi Valued slots in Amazon Lex V2 APIs for model building

## __Amazon Lex Runtime V2__
  - ### Features
    - This release adds support for Multi Valued slots in Amazon Lex V2 APIs for runtime

## __Redshift Data API Service__
  - ### Features
    - Redshift Data API service now supports SQL parameterization.

# __1.12.6__ __2021-06-14__
## __AWS IoT Analytics__
  - ### Features
    - Adds support for data store partitions.

## __AWS IoT Greengrass V2__
  - ### Features
    - We have verified the APIs being released here and are ready to release

## __AWS SDK for Java__
  - ### Bugfixes
    - Added path normalization when creating a canonical request for signers. Supports pathnames with dots.

## __Amazon Lookout for Metrics__
  - ### Features
    - Added "LEARNING" status for anomaly detector and updated description for "Offset" parameter in MetricSet APIs.

# __1.12.5__ __2021-06-11__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS MediaLive now supports OCR-based conversion of DVB-Sub and SCTE-27 image-based source captions to WebVTT, and supports ingest of ad avail decorations in HLS input manifests.

## __AWS MediaConnect__
  - ### Features
    - When you enable source failover, you can now designate one of two sources as the primary source. You can choose between two failover modes to prevent any disruption to the video stream. Merge combines the sources into a single stream. Failover allows switching between a primary and a backup stream.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 adds new AMI property to flag outdated AMIs

# __1.12.4__ __2021-06-10__
## __AWS App Mesh__
  - ### Features
    - AppMesh now supports additional routing capabilities in match and rewrites for Gateway Routes and Routes. Additionally, App Mesh also supports specifying DNS Response Types in Virtual Nodes.

## __AWS Resource Access Manager__
  - ### Features
    - AWS Resource Access Manager (RAM) is releasing new field isResourceTypeDefault in ListPermissions and GetPermission response, and adding permissionArn parameter to GetResourceShare request to filter by permission attached

## __Amazon Appflow__
  - ### Features
    - Adding MAP_ALL task type support.

## __Amazon Chime__
  - ### Features
    - This SDK release adds support for UpdateAccount API to allow users to update their default license on Chime account.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Amazon Cognito now supports targeted sign out through refresh token revocation

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new optional parameter connectivityType (public, private) for the CreateNatGateway API. Private NatGateway does not require customers to attach an InternetGateway to the VPC and can be used for communication with other VPCs and on-premise networks.

## __Amazon Managed Blockchain__
  - ### Features
    - This release supports KMS customer-managed Customer Master Keys (CMKs) on member-specific Hyperledger Fabric resources.

## __Amazon Redshift__
  - ### Features
    - Added InvalidClusterStateFault to the ModifyAquaConfiguration API, thrown when calling the API on a non available cluster.

## __Amazon SageMaker Feature Store Runtime__
  - ### Features
    - Release BatchGetRecord API for AWS SageMaker Feature Store Runtime.

## __Amazon SageMaker Service__
  - ### Features
    - Using SageMaker Edge Manager with AWS IoT Greengrass v2 simplifies accessing, maintaining, and deploying models to your devices. You can now create deployable IoT Greengrass components during edge packaging jobs. You can choose to create a device fleet with or without creating an AWS IoT role alias.

# __1.12.3__ __2021-06-09__
## __AWS Proton__
  - ### Features
    - This is the initial SDK release for AWS Proton

## __AWS Transfer Family__
  - ### Features
    - Documentation updates for the AWS Transfer Family service.

## __AWSKendraFrontendService__
  - ### Features
    - AWS Kendra now supports checking document status.

## __Amazon Personalize Events__
  - ### Features
    - Support for unstructured text inputs in the items dataset to to automatically extract key information from product/content description as an input when creating solution versions.

# __1.12.2__ __2021-06-08__
## __AWS Service Catalog__
  - ### Features
    - increase max pagesize for List/Search apis

## __Amazon Cognito Identity Provider__
  - ### Features
    - Documentation updates for cognito-idp

## __Amazon FSx__
  - ### Features
    - This release adds support for auditing end-user access to files, folders, and file shares using Windows event logs, enabling customers to meet their security and compliance needs.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API introduces stricter validation of S3 object criteria for classification jobs.

# __1.12.1__ __2021-06-07__
## __AWS Glue__
  - ### Features
    - Add SampleSize variable to S3Target to enable s3-sampling feature through API.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Added updateConfig option that allows customers to control upgrade velocity in Managed Node Group.

## __Amazon Personalize__
  - ### Features
    - Update regex validation in kmsKeyArn and s3 path API parameters for AWS Personalize APIs

## __Amazon SageMaker Service__
  - ### Features
    - AWS SageMaker - Releasing new APIs related to Callback steps in model building pipelines. Adds experiment integration to model building pipelines.

