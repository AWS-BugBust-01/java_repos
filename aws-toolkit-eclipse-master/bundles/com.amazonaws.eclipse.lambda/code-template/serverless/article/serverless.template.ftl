{
  "Description": "Simple article service.",
  "Parameters" : {
    "ArticleBucketName" : {
        "Type" : "String",
        "Description" : "Name of S3 bucket used to store the article content. If left blank, AWS CloudFormation would manage this resource.",
        "MinLength" : "0"
    },
    "ArticleTableName" : {
        "Type" : "String",
        "Description" : "Name of DynamoDB table used to store the article metadata. If left blank, AWS CloudFormation would manage this resource.",
        "MinLength" : "0"
      },
    "ReadCapacity" : {
        "Type" : "Number",
        "Description" : "Read capacity for the DynamoDB blog table.",
        "Default" : "3",
        "MinValue" : 1
    },
    "WriteCapacity" : {
        "Type" : "Number",
        "Description" : "Write capacity for the DynamoDB blog table.",
        "Default" : "3",
        "MinValue" : 1
    }
  },
  "Conditions" : {
    "CreateArticleBucket" : {"Fn::Equals" : [{"Ref" : "ArticleBucketName"}, ""]},
    "CreateArticleTable" : {"Fn::Equals" : [{"Ref" : "ArticleTableName"}, ""]}
  },
  "Resources": {
    "GetArticle": {
      "Type": "AWS::Serverless::Function",
      "Properties": {
        "Handler": "${packageName}.GetArticle",
        "Runtime" : "java8",
        "CodeUri" : "./target/${artifactId}-${version}.jar",
        "Policies": [
          "AmazonDynamoDBReadOnlyAccess",
          "AmazonS3ReadOnlyAccess"
        ],
        "Environment" : {
          "Variables" : {
            "ARTICLE_TABLE_NAME" : { "Fn::If" : ["CreateArticleTable", {"Ref":"ArticleTable"}, { "Ref" : "ArticleTableName" } ] },
            "ARTICLE_BUCKET_NAME" : { "Fn::If" : ["CreateArticleBucket", {"Ref":"ArticleBucket"}, { "Ref" : "ArticleBucketName" } ] }
          }
        },
        "Events": {
          "GetResource": {
            "Type": "Api",
            "Properties": {
              "Path": "/",
              "Method": "get"
            }
          }
        }
      }
    },
    "PutArticle": {
      "Type": "AWS::Serverless::Function",
      "Properties": {
        "Handler": "${packageName}.PutArticle",
        "Runtime" : "java8",
        "CodeUri" : "./target/${artifactId}-${version}.jar",
        "Policies": [
          "AmazonDynamoDBFullAccess",
          "AmazonS3FullAccess"
        ],
        "Environment" : {
          "Variables" : {
            "ARTICLE_TABLE_NAME" : { "Fn::If" : ["CreateArticleTable", {"Ref":"ArticleTable"}, { "Ref" : "ArticleTableName" } ] },
            "ARTICLE_BUCKET_NAME" : { "Fn::If" : ["CreateArticleBucket", {"Ref":"ArticleBucket"}, { "Ref" : "ArticleBucketName" } ] }
          }
        },
        "Events": {
          "PutResource": {
            "Type": "Api",
            "Properties": {
              "Path": "/",
              "Method": "post"
            }
          }
        }
      }
    },
    "ArticleTable": {
      "Type": "AWS::DynamoDB::Table",
      "Condition" : "CreateArticleTable",
      "Properties": {
        "AttributeDefinitions": [
          {
            "AttributeName": "id",
            "AttributeType": "S"
          }
        ],
        "KeySchema": [
          {
            "AttributeName": "id",
            "KeyType": "HASH"
          }
        ],
        "ProvisionedThroughput": {
          "ReadCapacityUnits": {"Ref" : "ReadCapacity"},
          "WriteCapacityUnits": {"Ref" : "WriteCapacity"}
        }
      }
    },
    "ArticleBucket": {
      "Type": "AWS::S3::Bucket",
      "Condition" : "CreateArticleBucket",
      "Properties": {
      }
    }
  },
  "Outputs" : {
    "ArticleTable" : {
      "Value" : { "Fn::If" : ["CreateArticleTable", {"Ref":"ArticleTable"}, { "Ref" : "ArticleTableName" } ] }
    },
    "ArticleBucket" : {
      "Value" : { "Fn::If" : ["CreateArticleBucket", {"Ref":"ArticleBucket"}, { "Ref" : "ArticleTableName" } ] }
    }
  }
}
