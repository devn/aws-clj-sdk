(ns portkey.aws.apigateway.-2015-07-09 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "apigateway", :region "ap-northeast-1"},
    :ssl-common-name "apigateway.ap-northeast-1.amazonaws.com",
    :endpoint "https://apigateway.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "apigateway", :region "eu-west-1"},
    :ssl-common-name "apigateway.eu-west-1.amazonaws.com",
    :endpoint "https://apigateway.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "apigateway", :region "us-east-2"},
    :ssl-common-name "apigateway.us-east-2.amazonaws.com",
    :endpoint "https://apigateway.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "apigateway", :region "ap-southeast-2"},
    :ssl-common-name "apigateway.ap-southeast-2.amazonaws.com",
    :endpoint "https://apigateway.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "apigateway", :region "sa-east-1"},
    :ssl-common-name "apigateway.sa-east-1.amazonaws.com",
    :endpoint "https://apigateway.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "apigateway", :region "ap-southeast-1"},
    :ssl-common-name "apigateway.ap-southeast-1.amazonaws.com",
    :endpoint "https://apigateway.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "apigateway", :region "ap-northeast-2"},
    :ssl-common-name "apigateway.ap-northeast-2.amazonaws.com",
    :endpoint "https://apigateway.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "apigateway", :region "ca-central-1"},
    :ssl-common-name "apigateway.ca-central-1.amazonaws.com",
    :endpoint "https://apigateway.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "apigateway", :region "eu-central-1"},
    :ssl-common-name "apigateway.eu-central-1.amazonaws.com",
    :endpoint "https://apigateway.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "apigateway", :region "eu-west-2"},
    :ssl-common-name "apigateway.eu-west-2.amazonaws.com",
    :endpoint "https://apigateway.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "apigateway", :region "us-gov-west-1"},
    :ssl-common-name "apigateway.us-gov-west-1.amazonaws.com",
    :endpoint "https://apigateway.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "apigateway", :region "us-west-2"},
    :ssl-common-name "apigateway.us-west-2.amazonaws.com",
    :endpoint "https://apigateway.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "apigateway", :region "us-east-1"},
    :ssl-common-name "apigateway.us-east-1.amazonaws.com",
    :endpoint "https://apigateway.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "apigateway", :region "us-west-1"},
    :ssl-common-name "apigateway.us-west-1.amazonaws.com",
    :endpoint "https://apigateway.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "apigateway", :region "ap-south-1"},
    :ssl-common-name "apigateway.ap-south-1.amazonaws.com",
    :endpoint "https://apigateway.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-resource-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-resource-request/parent-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-resource-request/path-part (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/create-resource-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.create-resource-request/restApiId :portkey.aws.apigateway.-2015-07-09.create-resource-request/parentId :portkey.aws.apigateway.-2015-07-09.create-resource-request/pathPart] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/documentation-part-location-status-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"^([1-5]\d\d|\*|\s*)$" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-rest-api-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-rest-api-request/mode (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/put-mode))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-rest-api-request/fail-on-warnings (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-rest-api-request/parameters (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-rest-api-request/body (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/blob))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/put-rest-api-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.put-rest-api-request/restApiId :portkey.aws.apigateway.-2015-07-09.put-rest-api-request/body] :opt-un [:portkey.aws.apigateway.-2015-07-09.put-rest-api-request/mode :portkey.aws.apigateway.-2015-07-09.put-rest-api-request/failOnWarnings :portkey.aws.apigateway.-2015-07-09.put-rest-api-request/parameters]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-stages-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-stages-request/deployment-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-stages-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-stages-request/restApiId] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-stages-request/deploymentId]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.rest-api/id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.rest-api/name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.rest-api/description (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.rest-api/created-date (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.rest-api/version (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.rest-api/warnings (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.rest-api/binary-media-types (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/rest-api (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.rest-api/id :portkey.aws.apigateway.-2015-07-09.rest-api/name :portkey.aws.apigateway.-2015-07-09.rest-api/description :portkey.aws.apigateway.-2015-07-09.rest-api/createdDate :portkey.aws.apigateway.-2015-07-09.rest-api/version :portkey.aws.apigateway.-2015-07-09.rest-api/warnings :portkey.aws.apigateway.-2015-07-09.rest-api/binaryMediaTypes]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-domain-name-request/domain-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/delete-domain-name-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.delete-domain-name-request/domainName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-resource-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-resource-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/delete-resource-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.delete-resource-request/restApiId :portkey.aws.apigateway.-2015-07-09.delete-resource-request/resourceId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-usage-plan-request/usage-plan-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/delete-usage-plan-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.delete-usage-plan-request/usagePlanId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/unauthorized-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-documentation-part (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/documentation-part :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-resources-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-resources-request/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-resources-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-resources-request/embed (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-resources-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-resources-request/restApiId] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-resources-request/position :portkey.aws.apigateway.-2015-07-09.get-resources-request/limit :portkey.aws.apigateway.-2015-07-09.get-resources-request/embed]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.api-key-ids/ids (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.api-key-ids/warnings (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/api-key-ids (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.api-key-ids/ids :portkey.aws.apigateway.-2015-07-09.api-key-ids/warnings]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-request/authorizer-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-request/headers (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-header-values))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-request/path-with-query-string (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-request/body (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-request/stage-variables (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-request/additional-context (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/test-invoke-authorizer-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-request/restApiId :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-request/authorizerId] :opt-un [:portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-request/headers :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-request/pathWithQueryString :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-request/body :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-request/stageVariables :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-request/additionalContext]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-method-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-method-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-method-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-method-request/path-with-query-string (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-method-request/body (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-method-request/headers (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-header-values))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-method-request/client-certificate-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-method-request/stage-variables (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/test-invoke-method-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.test-invoke-method-request/restApiId :portkey.aws.apigateway.-2015-07-09.test-invoke-method-request/resourceId :portkey.aws.apigateway.-2015-07-09.test-invoke-method-request/httpMethod] :opt-un [:portkey.aws.apigateway.-2015-07-09.test-invoke-method-request/pathWithQueryString :portkey.aws.apigateway.-2015-07-09.test-invoke-method-request/body :portkey.aws.apigateway.-2015-07-09.test-invoke-method-request/headers :portkey.aws.apigateway.-2015-07-09.test-invoke-method-request/clientCertificateId :portkey.aws.apigateway.-2015-07-09.test-invoke-method-request/stageVariables]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/map-of-method-snapshot (clojure.spec.alpha/map-of :portkey.aws.apigateway.-2015-07-09/string :portkey.aws.apigateway.-2015-07-09/method-snapshot))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-sdk-type-request/id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-sdk-type-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-sdk-type-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.deployment/id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.deployment/description (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.deployment/created-date (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.deployment/api-summary (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/path-to-map-of-method-snapshot))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/deployment (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.deployment/id :portkey.aws.apigateway.-2015-07-09.deployment/description :portkey.aws.apigateway.-2015-07-09.deployment/createdDate :portkey.aws.apigateway.-2015-07-09.deployment/apiSummary]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/gateway-response-type (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {:integration-timeout "INTEGRATION_TIMEOUT", :default-4xx "DEFAULT_4XX", "REQUEST_TOO_LARGE" "REQUEST_TOO_LARGE", :unauthorized "UNAUTHORIZED", "INTEGRATION_TIMEOUT" "INTEGRATION_TIMEOUT", "RESOURCE_NOT_FOUND" "RESOURCE_NOT_FOUND", :invalid-api-key "INVALID_API_KEY", :integration-failure "INTEGRATION_FAILURE", "AUTHORIZER_CONFIGURATION_ERROR" "AUTHORIZER_CONFIGURATION_ERROR", "INTEGRATION_FAILURE" "INTEGRATION_FAILURE", "DEFAULT_5XX" "DEFAULT_5XX", "UNAUTHORIZED" "UNAUTHORIZED", :quota-exceeded "QUOTA_EXCEEDED", :invalid-signature "INVALID_SIGNATURE", :expired-token "EXPIRED_TOKEN", :bad-request-parameters "BAD_REQUEST_PARAMETERS", "AUTHORIZER_FAILURE" "AUTHORIZER_FAILURE", :unsupported-media-type "UNSUPPORTED_MEDIA_TYPE", "INVALID_API_KEY" "INVALID_API_KEY", "ACCESS_DENIED" "ACCESS_DENIED", "API_CONFIGURATION_ERROR" "API_CONFIGURATION_ERROR", "DEFAULT_4XX" "DEFAULT_4XX", "INVALID_SIGNATURE" "INVALID_SIGNATURE", :bad-request-body "BAD_REQUEST_BODY", :api-configuration-error "API_CONFIGURATION_ERROR", "EXPIRED_TOKEN" "EXPIRED_TOKEN", "UNSUPPORTED_MEDIA_TYPE" "UNSUPPORTED_MEDIA_TYPE", :authorizer-configuration-error "AUTHORIZER_CONFIGURATION_ERROR", :default-5xx "DEFAULT_5XX", :request-too-large "REQUEST_TOO_LARGE", :authorizer-failure "AUTHORIZER_FAILURE", :throttled "THROTTLED", "QUOTA_EXCEEDED" "QUOTA_EXCEEDED", "BAD_REQUEST_PARAMETERS" "BAD_REQUEST_PARAMETERS", "MISSING_AUTHENTICATION_TOKEN" "MISSING_AUTHENTICATION_TOKEN", :missing-authentication-token "MISSING_AUTHENTICATION_TOKEN", "BAD_REQUEST_BODY" "BAD_REQUEST_BODY", :resource-not-found "RESOURCE_NOT_FOUND", :access-denied "ACCESS_DENIED", "THROTTLED" "THROTTLED"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-client-certificate (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/client-certificate :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-sdk-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-sdk-request/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-sdk-request/sdk-type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-sdk-request/parameters (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-sdk-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-sdk-request/restApiId :portkey.aws.apigateway.-2015-07-09.get-sdk-request/stageName :portkey.aws.apigateway.-2015-07-09.get-sdk-request/sdkType] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-sdk-request/parameters]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/bad-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-stage-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-stage-request/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-stage-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/update-stage-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.update-stage-request/restApiId :portkey.aws.apigateway.-2015-07-09.update-stage-request/stageName] :opt-un [:portkey.aws.apigateway.-2015-07-09.update-stage-request/patchOperations]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-method-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-method-response-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-method-response-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-method-response-request/status-code (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-method-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-method-response-request/restApiId :portkey.aws.apigateway.-2015-07-09.get-method-response-request/resourceId :portkey.aws.apigateway.-2015-07-09.get-method-response-request/httpMethod :portkey.aws.apigateway.-2015-07-09.get-method-response-request/statusCode] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-response/client-status (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-response/log (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-response/latency (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/long))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-response/principal-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-response/policy (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-response/authorization (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-list))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-response/claims (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/test-invoke-authorizer-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-response/clientStatus :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-response/log :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-response/latency :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-response/principalId :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-response/policy :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-response/authorization :portkey.aws.apigateway.-2015-07-09.test-invoke-authorizer-response/claims]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-stage-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-stage-request/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/delete-stage-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.delete-stage-request/restApiId :portkey.aws.apigateway.-2015-07-09.delete-stage-request/stageName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method-setting/logging-level (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method-setting/metrics-enabled (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method-setting/caching-enabled (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method-setting/throttling-rate-limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/double))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method-setting/cache-ttl-in-seconds (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method-setting/unauthorized-cache-control-header-strategy (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/unauthorized-cache-control-header-strategy))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method-setting/cache-data-encrypted (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method-setting/throttling-burst-limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method-setting/require-authorization-for-cache-control (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method-setting/data-trace-enabled (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/method-setting (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.method-setting/loggingLevel :portkey.aws.apigateway.-2015-07-09.method-setting/metricsEnabled :portkey.aws.apigateway.-2015-07-09.method-setting/cachingEnabled :portkey.aws.apigateway.-2015-07-09.method-setting/throttlingRateLimit :portkey.aws.apigateway.-2015-07-09.method-setting/cacheTtlInSeconds :portkey.aws.apigateway.-2015-07-09.method-setting/unauthorizedCacheControlHeaderStrategy :portkey.aws.apigateway.-2015-07-09.method-setting/cacheDataEncrypted :portkey.aws.apigateway.-2015-07-09.method-setting/throttlingBurstLimit :portkey.aws.apigateway.-2015-07-09.method-setting/requireAuthorizationForCacheControl :portkey.aws.apigateway.-2015-07-09.method-setting/dataTraceEnabled]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-documentation-part-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-documentation-part-request/documentation-part-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/delete-documentation-part-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.delete-documentation-part-request/restApiId :portkey.aws.apigateway.-2015-07-09.delete-documentation-part-request/documentationPartId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/status-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__8151__auto__] (clojure.core/re-matches #"[1-5]\d\d" s__8151__auto__))))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.api-stage/api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.api-stage/stage (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/api-stage (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.api-stage/apiId :portkey.aws.apigateway.-2015-07-09.api-stage/stage]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-integration-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-integration-response-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-integration-response-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-integration-response-request/status-code (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-integration-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-integration-response-request/restApiId :portkey.aws.apigateway.-2015-07-09.get-integration-response-request/resourceId :portkey.aws.apigateway.-2015-07-09.get-integration-response-request/httpMethod :portkey.aws.apigateway.-2015-07-09.get-integration-response-request/statusCode] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/map-of-method (clojure.spec.alpha/map-of :portkey.aws.apigateway.-2015-07-09/string :portkey.aws.apigateway.-2015-07-09/method))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/map-of-header-values (clojure.spec.alpha/map-of :portkey.aws.apigateway.-2015-07-09/string :portkey.aws.apigateway.-2015-07-09/string))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.documentation-part/id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.documentation-part/location (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/documentation-part-location))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.documentation-part/properties (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/documentation-part (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.documentation-part/id :portkey.aws.apigateway.-2015-07-09.documentation-part/location :portkey.aws.apigateway.-2015-07-09.documentation-part/properties]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/map-of-string-to-list (clojure.spec.alpha/map-of :portkey.aws.apigateway.-2015-07-09/string :portkey.aws.apigateway.-2015-07-09/list-of-string))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-resource-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-resource-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-resource-request/embed (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-resource-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-resource-request/restApiId :portkey.aws.apigateway.-2015-07-09.get-resource-request/resourceId] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-resource-request/embed]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-usage-request/usage-plan-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-usage-request/key-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-usage-request/start-date (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-usage-request/end-date (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-usage-request/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-usage-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-usage-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-usage-request/usagePlanId :portkey.aws.apigateway.-2015-07-09.get-usage-request/startDate :portkey.aws.apigateway.-2015-07-09.get-usage-request/endDate] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-usage-request/keyId :portkey.aws.apigateway.-2015-07-09.get-usage-request/position :portkey.aws.apigateway.-2015-07-09.get-usage-request/limit]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method-snapshot/authorization-type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method-snapshot/api-key-required (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/method-snapshot (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.method-snapshot/authorizationType :portkey.aws.apigateway.-2015-07-09.method-snapshot/apiKeyRequired]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-base-path-mapping-request/domain-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-base-path-mapping-request/base-path (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-base-path-mapping-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/update-base-path-mapping-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.update-base-path-mapping-request/domainName :portkey.aws.apigateway.-2015-07-09.update-base-path-mapping-request/basePath] :opt-un [:portkey.aws.apigateway.-2015-07-09.update-base-path-mapping-request/patchOperations]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-model (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/model :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-sdk-types-request/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-sdk-types-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-sdk-types-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-sdk-types-request/position :portkey.aws.apigateway.-2015-07-09.get-sdk-types-request/limit]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.import-documentation-parts-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.import-documentation-parts-request/mode (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/put-mode))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.import-documentation-parts-request/fail-on-warnings (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.import-documentation-parts-request/body (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/blob))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/import-documentation-parts-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.import-documentation-parts-request/restApiId :portkey.aws.apigateway.-2015-07-09.import-documentation-parts-request/body] :opt-un [:portkey.aws.apigateway.-2015-07-09.import-documentation-parts-request/mode :portkey.aws.apigateway.-2015-07-09.import-documentation-parts-request/failOnWarnings]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.generate-client-certificate-request/description (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/generate-client-certificate-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.generate-client-certificate-request/description]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.rest-apis/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.rest-apis/items (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-rest-api))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/rest-apis (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.rest-apis/position :portkey.aws.apigateway.-2015-07-09.rest-apis/items]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-sdk-configuration-property (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/sdk-configuration-property :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-client-certificate-request/client-certificate-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-client-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-client-certificate-request/clientCertificateId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.base-path-mappings/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.base-path-mappings/items (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-base-path-mapping))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/base-path-mappings (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.base-path-mappings/position :portkey.aws.apigateway.-2015-07-09.base-path-mappings/items]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-deployment-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-deployment-request/deployment-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-deployment-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/update-deployment-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.update-deployment-request/restApiId :portkey.aws.apigateway.-2015-07-09.update-deployment-request/deploymentId] :opt-un [:portkey.aws.apigateway.-2015-07-09.update-deployment-request/patchOperations]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.documentation-versions/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.documentation-versions/items (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-documentation-version))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/documentation-versions (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.documentation-versions/position :portkey.aws.apigateway.-2015-07-09.documentation-versions/items]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-string (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/string :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-integration-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-integration-request/uri (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-integration-request/integration-http-method (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-integration-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-integration-request/request-templates (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-integration-request/request-parameters (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-integration-request/cache-namespace (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-integration-request/passthrough-behavior (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-integration-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-integration-request/type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/integration-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-integration-request/content-handling (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/content-handling-strategy))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-integration-request/cache-key-parameters (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-integration-request/credentials (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/put-integration-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.put-integration-request/restApiId :portkey.aws.apigateway.-2015-07-09.put-integration-request/resourceId :portkey.aws.apigateway.-2015-07-09.put-integration-request/httpMethod :portkey.aws.apigateway.-2015-07-09.put-integration-request/type] :opt-un [:portkey.aws.apigateway.-2015-07-09.put-integration-request/uri :portkey.aws.apigateway.-2015-07-09.put-integration-request/integrationHttpMethod :portkey.aws.apigateway.-2015-07-09.put-integration-request/requestTemplates :portkey.aws.apigateway.-2015-07-09.put-integration-request/requestParameters :portkey.aws.apigateway.-2015-07-09.put-integration-request/cacheNamespace :portkey.aws.apigateway.-2015-07-09.put-integration-request/passthroughBehavior :portkey.aws.apigateway.-2015-07-09.put-integration-request/contentHandling :portkey.aws.apigateway.-2015-07-09.put-integration-request/cacheKeyParameters :portkey.aws.apigateway.-2015-07-09.put-integration-request/credentials]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/documentation-part-type (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {:response "RESPONSE", "PATH_PARAMETER" "PATH_PARAMETER", :api "API", :response-header "RESPONSE_HEADER", :method "METHOD", "API" "API", "REQUEST_HEADER" "REQUEST_HEADER", :path-parameter "PATH_PARAMETER", "METHOD" "METHOD", :request-body "REQUEST_BODY", :resource "RESOURCE", :request-header "REQUEST_HEADER", "RESOURCE" "RESOURCE", :response-body "RESPONSE_BODY", :query-parameter "QUERY_PARAMETER", "RESPONSE_HEADER" "RESPONSE_HEADER", :authorizer "AUTHORIZER", "REQUEST_BODY" "REQUEST_BODY", "QUERY_PARAMETER" "QUERY_PARAMETER", "AUTHORIZER" "AUTHORIZER", "MODEL" "MODEL", "RESPONSE" "RESPONSE", "RESPONSE_BODY" "RESPONSE_BODY", :model "MODEL"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-usage-request/usage-plan-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-usage-request/key-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-usage-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/update-usage-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.update-usage-request/usagePlanId :portkey.aws.apigateway.-2015-07-09.update-usage-request/keyId] :opt-un [:portkey.aws.apigateway.-2015-07-09.update-usage-request/patchOperations]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-api-key-request/api-key (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/delete-api-key-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.delete-api-key-request/apiKey] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-documentation-part-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-documentation-part-request/documentation-part-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-documentation-part-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-documentation-part-request/restApiId :portkey.aws.apigateway.-2015-07-09.get-documentation-part-request/documentationPartId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.patch-operation/op (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/op))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.patch-operation/path (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.patch-operation/value (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.patch-operation/from (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/patch-operation (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.patch-operation/op :portkey.aws.apigateway.-2015-07-09.patch-operation/path :portkey.aws.apigateway.-2015-07-09.patch-operation/value :portkey.aws.apigateway.-2015-07-09.patch-operation/from]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-base-path-mappings-request/domain-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-base-path-mappings-request/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-base-path-mappings-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-base-path-mappings-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-base-path-mappings-request/domainName] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-base-path-mappings-request/position :portkey.aws.apigateway.-2015-07-09.get-base-path-mappings-request/limit]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-rest-api-request/name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-rest-api-request/description (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-rest-api-request/version (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-rest-api-request/clone-from (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-rest-api-request/binary-media-types (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/create-rest-api-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.create-rest-api-request/name] :opt-un [:portkey.aws.apigateway.-2015-07-09.create-rest-api-request/description :portkey.aws.apigateway.-2015-07-09.create-rest-api-request/version :portkey.aws.apigateway.-2015-07-09.create-rest-api-request/cloneFrom :portkey.aws.apigateway.-2015-07-09.create-rest-api-request/binaryMediaTypes]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-integration-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-integration-response-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-integration-response-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-integration-response-request/status-code (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-integration-response-request/selection-pattern (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-integration-response-request/response-parameters (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-integration-response-request/response-templates (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-integration-response-request/content-handling (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/content-handling-strategy))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/put-integration-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.put-integration-response-request/restApiId :portkey.aws.apigateway.-2015-07-09.put-integration-response-request/resourceId :portkey.aws.apigateway.-2015-07-09.put-integration-response-request/httpMethod :portkey.aws.apigateway.-2015-07-09.put-integration-response-request/statusCode] :opt-un [:portkey.aws.apigateway.-2015-07-09.put-integration-response-request/selectionPattern :portkey.aws.apigateway.-2015-07-09.put-integration-response-request/responseParameters :portkey.aws.apigateway.-2015-07-09.put-integration-response-request/responseTemplates :portkey.aws.apigateway.-2015-07-09.put-integration-response-request/contentHandling]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.stages/item (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-stage))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/stages (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.stages/item]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-request-validator (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/request-validator :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-gateway-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-gateway-response-request/response-type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/gateway-response-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-gateway-response-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/update-gateway-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.update-gateway-response-request/restApiId :portkey.aws.apigateway.-2015-07-09.update-gateway-response-request/responseType] :opt-un [:portkey.aws.apigateway.-2015-07-09.update-gateway-response-request/patchOperations]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-authorizer-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-authorizer-request/authorizer-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-authorizer-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-authorizer-request/restApiId :portkey.aws.apigateway.-2015-07-09.get-authorizer-request/authorizerId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-rest-api (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/rest-api :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-usage-plan-key (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/usage-plan-key :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.template/value (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/template (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.template/value]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.limit-exceeded-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.limit-exceeded-exception/retryAfterSeconds :portkey.aws.apigateway.-2015-07-09.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-export-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-export-request/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-export-request/export-type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-export-request/parameters (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-export-request/accepts (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-export-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-export-request/restApiId :portkey.aws.apigateway.-2015-07-09.get-export-request/stageName :portkey.aws.apigateway.-2015-07-09.get-export-request/exportType] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-export-request/parameters :portkey.aws.apigateway.-2015-07-09.get-export-request/accepts]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/nullable-boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-client-certificate-request/client-certificate-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/delete-client-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.delete-client-certificate-request/clientCertificateId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method-response/status-code (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method-response/response-parameters (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method-response/response-models (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/method-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.method-response/statusCode :portkey.aws.apigateway.-2015-07-09.method-response/responseParameters :portkey.aws.apigateway.-2015-07-09.method-response/responseModels]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-deployment (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/deployment :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-model-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-model-request/model-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-model-request/flatten (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-model-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-model-request/restApiId :portkey.aws.apigateway.-2015-07-09.get-model-request/modelName] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-model-request/flatten]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.request-validator/id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.request-validator/name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.request-validator/validate-request-body (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.request-validator/validate-request-parameters (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/request-validator (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.request-validator/id :portkey.aws.apigateway.-2015-07-09.request-validator/name :portkey.aws.apigateway.-2015-07-09.request-validator/validateRequestBody :portkey.aws.apigateway.-2015-07-09.request-validator/validateRequestParameters]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-documentation-version-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-documentation-version-request/documentation-version (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-documentation-version-request/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-documentation-version-request/description (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/create-documentation-version-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.create-documentation-version-request/restApiId :portkey.aws.apigateway.-2015-07-09.create-documentation-version-request/documentationVersion] :opt-un [:portkey.aws.apigateway.-2015-07-09.create-documentation-version-request/stageName :portkey.aws.apigateway.-2015-07-09.create-documentation-version-request/description]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-request-validators-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-request-validators-request/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-request-validators-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-request-validators-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-request-validators-request/restApiId] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-request-validators-request/position :portkey.aws.apigateway.-2015-07-09.get-request-validators-request/limit]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-usage-plan-request/name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-usage-plan-request/description (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-usage-plan-request/api-stages (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-api-stage))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-usage-plan-request/throttle (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/throttle-settings))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-usage-plan-request/quota (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/quota-settings))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/create-usage-plan-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.create-usage-plan-request/name] :opt-un [:portkey.aws.apigateway.-2015-07-09.create-usage-plan-request/description :portkey.aws.apigateway.-2015-07-09.create-usage-plan-request/apiStages :portkey.aws.apigateway.-2015-07-09.create-usage-plan-request/throttle :portkey.aws.apigateway.-2015-07-09.create-usage-plan-request/quota]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.sdk-type/id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.sdk-type/friendly-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.sdk-type/description (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.sdk-type/configuration-properties (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-sdk-configuration-property))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/sdk-type (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.sdk-type/id :portkey.aws.apigateway.-2015-07-09.sdk-type/friendlyName :portkey.aws.apigateway.-2015-07-09.sdk-type/description :portkey.aws.apigateway.-2015-07-09.sdk-type/configurationProperties]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-usage-plan-key-request/usage-plan-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-usage-plan-key-request/key-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-usage-plan-key-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-usage-plan-key-request/usagePlanId :portkey.aws.apigateway.-2015-07-09.get-usage-plan-key-request/keyId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/cache-cluster-status (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"DELETE_IN_PROGRESS" "DELETE_IN_PROGRESS", "AVAILABLE" "AVAILABLE", :flush-in-progress "FLUSH_IN_PROGRESS", "CREATE_IN_PROGRESS" "CREATE_IN_PROGRESS", :delete-in-progress "DELETE_IN_PROGRESS", :create-in-progress "CREATE_IN_PROGRESS", "NOT_AVAILABLE" "NOT_AVAILABLE", "FLUSH_IN_PROGRESS" "FLUSH_IN_PROGRESS", :not-available "NOT_AVAILABLE", :available "AVAILABLE"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.service-unavailable-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/service-unavailable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.service-unavailable-exception/retryAfterSeconds :portkey.aws.apigateway.-2015-07-09.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.client-certificates/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.client-certificates/items (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-client-certificate))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/client-certificates (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.client-certificates/position :portkey.aws.apigateway.-2015-07-09.client-certificates/items]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-gateway-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-gateway-response-request/response-type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/gateway-response-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-gateway-response-request/status-code (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-gateway-response-request/response-parameters (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-gateway-response-request/response-templates (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/put-gateway-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.put-gateway-response-request/restApiId :portkey.aws.apigateway.-2015-07-09.put-gateway-response-request/responseType] :opt-un [:portkey.aws.apigateway.-2015-07-09.put-gateway-response-request/statusCode :portkey.aws.apigateway.-2015-07-09.put-gateway-response-request/responseParameters :portkey.aws.apigateway.-2015-07-09.put-gateway-response-request/responseTemplates]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.flush-stage-cache-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.flush-stage-cache-request/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/flush-stage-cache-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.flush-stage-cache-request/restApiId :portkey.aws.apigateway.-2015-07-09.flush-stage-cache-request/stageName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-resource-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-resource-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-resource-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/update-resource-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.update-resource-request/restApiId :portkey.aws.apigateway.-2015-07-09.update-resource-request/resourceId] :opt-un [:portkey.aws.apigateway.-2015-07-09.update-resource-request/patchOperations]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-gateway-response (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/gateway-response :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/map-of-string-to-boolean (clojure.spec.alpha/map-of :portkey.aws.apigateway.-2015-07-09/string :portkey.aws.apigateway.-2015-07-09/nullable-boolean))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/map-of-method-settings (clojure.spec.alpha/map-of :portkey.aws.apigateway.-2015-07-09/string :portkey.aws.apigateway.-2015-07-09/method-setting))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/quota-period-type (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"DAY" "DAY", :day "DAY", "WEEK" "WEEK", :week "WEEK", "MONTH" "MONTH", :month "MONTH"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/put-mode (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"merge" "merge", :merge "merge", "overwrite" "overwrite", :overwrite "overwrite"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.request-validators/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.request-validators/items (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-request-validator))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/request-validators (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.request-validators/position :portkey.aws.apigateway.-2015-07-09.request-validators/items]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-method-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-method-response-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-method-response-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-method-response-request/status-code (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/delete-method-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.delete-method-response-request/restApiId :portkey.aws.apigateway.-2015-07-09.delete-method-response-request/resourceId :portkey.aws.apigateway.-2015-07-09.delete-method-response-request/httpMethod :portkey.aws.apigateway.-2015-07-09.delete-method-response-request/statusCode] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-method-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-method-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-method-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-method-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-method-request/restApiId :portkey.aws.apigateway.-2015-07-09.get-method-request/resourceId :portkey.aws.apigateway.-2015-07-09.get-method-request/httpMethod] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.usage-plan-keys/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.usage-plan-keys/items (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-usage-plan-key))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/usage-plan-keys (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.usage-plan-keys/position :portkey.aws.apigateway.-2015-07-09.usage-plan-keys/items]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.usage-plan/id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.usage-plan/name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.usage-plan/description (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.usage-plan/api-stages (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-api-stage))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.usage-plan/throttle (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/throttle-settings))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.usage-plan/quota (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/quota-settings))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.usage-plan/product-code (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/usage-plan (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.usage-plan/id :portkey.aws.apigateway.-2015-07-09.usage-plan/name :portkey.aws.apigateway.-2015-07-09.usage-plan/description :portkey.aws.apigateway.-2015-07-09.usage-plan/apiStages :portkey.aws.apigateway.-2015-07-09.usage-plan/throttle :portkey.aws.apigateway.-2015-07-09.usage-plan/quota :portkey.aws.apigateway.-2015-07-09.usage-plan/productCode]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-long (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/long :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-model-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-model-request/name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-model-request/description (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-model-request/schema (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-model-request/content-type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/create-model-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.create-model-request/restApiId :portkey.aws.apigateway.-2015-07-09.create-model-request/name :portkey.aws.apigateway.-2015-07-09.create-model-request/contentType] :opt-un [:portkey.aws.apigateway.-2015-07-09.create-model-request/description :portkey.aws.apigateway.-2015-07-09.create-model-request/schema]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.too-many-requests-exception/retry-after-seconds (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.too-many-requests-exception/retryAfterSeconds :portkey.aws.apigateway.-2015-07-09.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-rest-api-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/delete-rest-api-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.delete-rest-api-request/restApiId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-account-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/update-account-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.update-account-request/patchOperations]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-rest-apis-request/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-rest-apis-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-rest-apis-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-rest-apis-request/position :portkey.aws.apigateway.-2015-07-09.get-rest-apis-request/limit]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-model-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-model-request/model-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/delete-model-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.delete-model-request/restApiId :portkey.aws.apigateway.-2015-07-09.delete-model-request/modelName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.throttle-settings/burst-limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.throttle-settings/rate-limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/double))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/throttle-settings (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.throttle-settings/burstLimit :portkey.aws.apigateway.-2015-07-09.throttle-settings/rateLimit]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-sdk-type (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/sdk-type :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/cache-cluster-size (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"118" "118", "237" "237", "1.6" "1.6", :118 "118", "0.5" "0.5", :28.4 "28.4", :13.5 "13.5", "28.4" "28.4", "58.2" "58.2", :1.6 "1.6", "6.1" "6.1", :58.2 "58.2", :6.1 "6.1", :237 "237", :0.5 "0.5", "13.5" "13.5"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.gateway-response/response-type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/gateway-response-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.gateway-response/status-code (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.gateway-response/response-parameters (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.gateway-response/response-templates (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.gateway-response/default-response (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/gateway-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.gateway-response/responseType :portkey.aws.apigateway.-2015-07-09.gateway-response/statusCode :portkey.aws.apigateway.-2015-07-09.gateway-response/responseParameters :portkey.aws.apigateway.-2015-07-09.gateway-response/responseTemplates :portkey.aws.apigateway.-2015-07-09.gateway-response/defaultResponse]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-model-template-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-model-template-request/model-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-model-template-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-model-template-request/restApiId :portkey.aws.apigateway.-2015-07-09.get-model-template-request/modelName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-integration-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-integration-response-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-integration-response-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-integration-response-request/status-code (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/delete-integration-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.delete-integration-response-request/restApiId :portkey.aws.apigateway.-2015-07-09.delete-integration-response-request/resourceId :portkey.aws.apigateway.-2015-07-09.delete-integration-response-request/httpMethod :portkey.aws.apigateway.-2015-07-09.delete-integration-response-request/statusCode] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/integration-type (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {:aws "AWS", "AWS" "AWS", :aws-proxy "AWS_PROXY", "MOCK" "MOCK", "AWS_PROXY" "AWS_PROXY", "HTTP_PROXY" "HTTP_PROXY", :http "HTTP", :http-proxy "HTTP_PROXY", "HTTP" "HTTP", :mock "MOCK"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.base-path-mapping/base-path (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.base-path-mapping/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.base-path-mapping/stage (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/base-path-mapping (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.base-path-mapping/basePath :portkey.aws.apigateway.-2015-07-09.base-path-mapping/restApiId :portkey.aws.apigateway.-2015-07-09.base-path-mapping/stage]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-request-validator-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-request-validator-request/request-validator-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-request-validator-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-request-validator-request/restApiId :portkey.aws.apigateway.-2015-07-09.get-request-validator-request/requestValidatorId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-resource (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/resource :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/op (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {:remove "remove", :copy "copy", "copy" "copy", :replace "replace", :move "move", "replace" "replace", "remove" "remove", "move" "move", "add" "add", :add "add", :test "test", "test" "test"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.documentation-part-ids/ids (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.documentation-part-ids/warnings (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/documentation-part-ids (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.documentation-part-ids/ids :portkey.aws.apigateway.-2015-07-09.documentation-part-ids/warnings]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-authorizers-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-authorizers-request/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-authorizers-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-authorizers-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-authorizers-request/restApiId] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-authorizers-request/position :portkey.aws.apigateway.-2015-07-09.get-authorizers-request/limit]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.model/id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.model/name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.model/description (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.model/schema (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.model/content-type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/model (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.model/id :portkey.aws.apigateway.-2015-07-09.model/name :portkey.aws.apigateway.-2015-07-09.model/description :portkey.aws.apigateway.-2015-07-09.model/schema :portkey.aws.apigateway.-2015-07-09.model/contentType]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-domain-name-request/domain-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-domain-name-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/update-domain-name-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.update-domain-name-request/domainName] :opt-un [:portkey.aws.apigateway.-2015-07-09.update-domain-name-request/patchOperations]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-usage-plan-key-request/usage-plan-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-usage-plan-key-request/key-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/delete-usage-plan-key-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.delete-usage-plan-key-request/usagePlanId :portkey.aws.apigateway.-2015-07-09.delete-usage-plan-key-request/keyId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-base-path-mapping-request/domain-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-base-path-mapping-request/base-path (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-base-path-mapping-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-base-path-mapping-request/domainName :portkey.aws.apigateway.-2015-07-09.get-base-path-mapping-request/basePath] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/authorizer-type (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"TOKEN" "TOKEN", :token "TOKEN", "COGNITO_USER_POOLS" "COGNITO_USER_POOLS", :cognito-user-pools "COGNITO_USER_POOLS"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-method-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-method-response-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-method-response-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-method-response-request/status-code (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-method-response-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/update-method-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.update-method-response-request/restApiId :portkey.aws.apigateway.-2015-07-09.update-method-response-request/resourceId :portkey.aws.apigateway.-2015-07-09.update-method-response-request/httpMethod :portkey.aws.apigateway.-2015-07-09.update-method-response-request/statusCode] :opt-un [:portkey.aws.apigateway.-2015-07-09.update-method-response-request/patchOperations]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-ofarns (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/providerarn :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-api-stage (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/api-stage :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.domain-names/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.domain-names/items (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-domain-name))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/domain-names (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.domain-names/position :portkey.aws.apigateway.-2015-07-09.domain-names/items]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-integration-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-integration-response-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-integration-response-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-integration-response-request/status-code (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-integration-response-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/update-integration-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.update-integration-response-request/restApiId :portkey.aws.apigateway.-2015-07-09.update-integration-response-request/resourceId :portkey.aws.apigateway.-2015-07-09.update-integration-response-request/httpMethod :portkey.aws.apigateway.-2015-07-09.update-integration-response-request/statusCode] :opt-un [:portkey.aws.apigateway.-2015-07-09.update-integration-response-request/patchOperations]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-method-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-method-response-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-method-response-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-method-response-request/status-code (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-method-response-request/response-parameters (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-method-response-request/response-models (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/put-method-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.put-method-response-request/restApiId :portkey.aws.apigateway.-2015-07-09.put-method-response-request/resourceId :portkey.aws.apigateway.-2015-07-09.put-method-response-request/httpMethod :portkey.aws.apigateway.-2015-07-09.put-method-response-request/statusCode] :opt-un [:portkey.aws.apigateway.-2015-07-09.put-method-response-request/responseParameters :portkey.aws.apigateway.-2015-07-09.put-method-response-request/responseModels]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-domain-name-request/domain-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-domain-name-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-domain-name-request/domainName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.account/cloudwatch-role-arn (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.account/throttle-settings (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/throttle-settings))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.account/features (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.account/api-key-version (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/account (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.account/cloudwatchRoleArn :portkey.aws.apigateway.-2015-07-09.account/throttleSettings :portkey.aws.apigateway.-2015-07-09.account/features :portkey.aws.apigateway.-2015-07-09.account/apiKeyVersion]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-method-response/status (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-method-response/body (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-method-response/headers (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-header-values))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-method-response/log (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.test-invoke-method-response/latency (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/long))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/test-invoke-method-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.test-invoke-method-response/status :portkey.aws.apigateway.-2015-07-09.test-invoke-method-response/body :portkey.aws.apigateway.-2015-07-09.test-invoke-method-response/headers :portkey.aws.apigateway.-2015-07-09.test-invoke-method-response/log :portkey.aws.apigateway.-2015-07-09.test-invoke-method-response/latency]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-usage-plan-request/usage-plan-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-usage-plan-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/update-usage-plan-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.update-usage-plan-request/usagePlanId] :opt-un [:portkey.aws.apigateway.-2015-07-09.update-usage-plan-request/patchOperations]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-gateway-responses-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-gateway-responses-request/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-gateway-responses-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-gateway-responses-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-gateway-responses-request/restApiId] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-gateway-responses-request/position :portkey.aws.apigateway.-2015-07-09.get-gateway-responses-request/limit]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method/authorizer-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method/request-validator-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method/authorization-type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method/http-method (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method/operation-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method/request-parameters (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method/api-key-required (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method/request-models (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method/method-integration (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/integration))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.method/method-responses (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-method-response))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/method (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.method/authorizerId :portkey.aws.apigateway.-2015-07-09.method/requestValidatorId :portkey.aws.apigateway.-2015-07-09.method/authorizationType :portkey.aws.apigateway.-2015-07-09.method/httpMethod :portkey.aws.apigateway.-2015-07-09.method/operationName :portkey.aws.apigateway.-2015-07-09.method/requestParameters :portkey.aws.apigateway.-2015-07-09.method/apiKeyRequired :portkey.aws.apigateway.-2015-07-09.method/requestModels :portkey.aws.apigateway.-2015-07-09.method/methodIntegration :portkey.aws.apigateway.-2015-07-09.method/methodResponses]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-stage (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/stage :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-deployment-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-deployment-request/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-deployment-request/stage-description (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-deployment-request/description (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-deployment-request/cache-cluster-enabled (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-deployment-request/cache-cluster-size (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/cache-cluster-size))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-deployment-request/variables (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/create-deployment-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.create-deployment-request/restApiId] :opt-un [:portkey.aws.apigateway.-2015-07-09.create-deployment-request/stageName :portkey.aws.apigateway.-2015-07-09.create-deployment-request/stageDescription :portkey.aws.apigateway.-2015-07-09.create-deployment-request/description :portkey.aws.apigateway.-2015-07-09.create-deployment-request/cacheClusterEnabled :portkey.aws.apigateway.-2015-07-09.create-deployment-request/cacheClusterSize :portkey.aws.apigateway.-2015-07-09.create-deployment-request/variables]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/map-of-method-response (clojure.spec.alpha/map-of :portkey.aws.apigateway.-2015-07-09/string :portkey.aws.apigateway.-2015-07-09/method-response))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.resources/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.resources/items (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-resource))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/resources (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.resources/position :portkey.aws.apigateway.-2015-07-09.resources/items]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-usage (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/list-of-long :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-request-validator-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-request-validator-request/name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-request-validator-request/validate-request-body (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-request-validator-request/validate-request-parameters (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/create-request-validator-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.create-request-validator-request/restApiId] :opt-un [:portkey.aws.apigateway.-2015-07-09.create-request-validator-request/name :portkey.aws.apigateway.-2015-07-09.create-request-validator-request/validateRequestBody :portkey.aws.apigateway.-2015-07-09.create-request-validator-request/validateRequestParameters]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-documentation-version-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-documentation-version-request/documentation-version (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-documentation-version-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-documentation-version-request/restApiId :portkey.aws.apigateway.-2015-07-09.get-documentation-version-request/documentationVersion] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.stage-key/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.stage-key/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/stage-key (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.stage-key/restApiId :portkey.aws.apigateway.-2015-07-09.stage-key/stageName]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-api-keys-request/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-api-keys-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-api-keys-request/name-query (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-api-keys-request/customer-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-api-keys-request/include-values (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-api-keys-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-api-keys-request/position :portkey.aws.apigateway.-2015-07-09.get-api-keys-request/limit :portkey.aws.apigateway.-2015-07-09.get-api-keys-request/nameQuery :portkey.aws.apigateway.-2015-07-09.get-api-keys-request/customerId :portkey.aws.apigateway.-2015-07-09.get-api-keys-request/includeValues]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-usage-plan-keys-request/usage-plan-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-usage-plan-keys-request/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-usage-plan-keys-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-usage-plan-keys-request/name-query (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-usage-plan-keys-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-usage-plan-keys-request/usagePlanId] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-usage-plan-keys-request/position :portkey.aws.apigateway.-2015-07-09.get-usage-plan-keys-request/limit :portkey.aws.apigateway.-2015-07-09.get-usage-plan-keys-request/nameQuery]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-client-certificate-request/client-certificate-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-client-certificate-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/update-client-certificate-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.update-client-certificate-request/clientCertificateId] :opt-un [:portkey.aws.apigateway.-2015-07-09.update-client-certificate-request/patchOperations]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-api-key-request/name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-api-key-request/description (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-api-key-request/enabled (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-api-key-request/generate-distinct-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-api-key-request/value (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-api-key-request/stage-keys (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-stage-keys))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-api-key-request/customer-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/create-api-key-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.create-api-key-request/name :portkey.aws.apigateway.-2015-07-09.create-api-key-request/description :portkey.aws.apigateway.-2015-07-09.create-api-key-request/enabled :portkey.aws.apigateway.-2015-07-09.create-api-key-request/generateDistinctId :portkey.aws.apigateway.-2015-07-09.create-api-key-request/value :portkey.aws.apigateway.-2015-07-09.create-api-key-request/stageKeys :portkey.aws.apigateway.-2015-07-09.create-api-key-request/customerId]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-deployment-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-deployment-request/deployment-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-deployment-request/embed (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-deployment-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-deployment-request/restApiId :portkey.aws.apigateway.-2015-07-09.get-deployment-request/deploymentId] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-deployment-request/embed]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.sdk-types/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.sdk-types/items (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-sdk-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/sdk-types (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.sdk-types/position :portkey.aws.apigateway.-2015-07-09.sdk-types/items]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-documentation-version-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-documentation-version-request/documentation-version (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/delete-documentation-version-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.delete-documentation-version-request/restApiId :portkey.aws.apigateway.-2015-07-09.delete-documentation-version-request/documentationVersion] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-client-certificates-request/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-client-certificates-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-client-certificates-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-client-certificates-request/position :portkey.aws.apigateway.-2015-07-09.get-client-certificates-request/limit]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-base-path-mapping-request/domain-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-base-path-mapping-request/base-path (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/delete-base-path-mapping-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.delete-base-path-mapping-request/domainName :portkey.aws.apigateway.-2015-07-09.delete-base-path-mapping-request/basePath] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-documentation-version (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/documentation-version :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-model-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-model-request/model-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-model-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/update-model-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.update-model-request/restApiId :portkey.aws.apigateway.-2015-07-09.update-model-request/modelName] :opt-un [:portkey.aws.apigateway.-2015-07-09.update-model-request/patchOperations]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.quota-settings/limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.quota-settings/offset (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.quota-settings/period (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/quota-period-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/quota-settings (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.quota-settings/limit :portkey.aws.apigateway.-2015-07-09.quota-settings/offset :portkey.aws.apigateway.-2015-07-09.quota-settings/period]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-documentation-version-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-documentation-version-request/documentation-version (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-documentation-version-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/update-documentation-version-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.update-documentation-version-request/restApiId :portkey.aws.apigateway.-2015-07-09.update-documentation-version-request/documentationVersion] :opt-un [:portkey.aws.apigateway.-2015-07-09.update-documentation-version-request/patchOperations]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-stage-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-stage-request/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-stage-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-stage-request/restApiId :portkey.aws.apigateway.-2015-07-09.get-stage-request/stageName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/providerarn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/path-to-map-of-method-snapshot (clojure.spec.alpha/map-of :portkey.aws.apigateway.-2015-07-09/string :portkey.aws.apigateway.-2015-07-09/map-of-method-snapshot))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.usage-plan-key/id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.usage-plan-key/type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.usage-plan-key/value (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.usage-plan-key/name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/usage-plan-key (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.usage-plan-key/id :portkey.aws.apigateway.-2015-07-09.usage-plan-key/type :portkey.aws.apigateway.-2015-07-09.usage-plan-key/value :portkey.aws.apigateway.-2015-07-09.usage-plan-key/name]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string (clojure.spec.alpha/map-of :portkey.aws.apigateway.-2015-07-09/string :portkey.aws.apigateway.-2015-07-09/string))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-authorizer-request/authorizer-credentials (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-authorizer-request/identity-validation-expression (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-authorizer-request/name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-authorizer-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-authorizer-request/type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/authorizer-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-authorizer-request/authorizer-result-ttl-in-seconds (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-authorizer-request/authorizer-uri (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-authorizer-request/auth-type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-authorizer-request/identity-source (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-authorizer-request/providerarns (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-ofarns))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/create-authorizer-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.create-authorizer-request/restApiId :portkey.aws.apigateway.-2015-07-09.create-authorizer-request/name :portkey.aws.apigateway.-2015-07-09.create-authorizer-request/type :portkey.aws.apigateway.-2015-07-09.create-authorizer-request/identitySource] :opt-un [:portkey.aws.apigateway.-2015-07-09.create-authorizer-request/authorizerCredentials :portkey.aws.apigateway.-2015-07-09.create-authorizer-request/identityValidationExpression :portkey.aws.apigateway.-2015-07-09.create-authorizer-request/authorizerResultTtlInSeconds :portkey.aws.apigateway.-2015-07-09.create-authorizer-request/authorizerUri :portkey.aws.apigateway.-2015-07-09.create-authorizer-request/authType :portkey.aws.apigateway.-2015-07-09.create-authorizer-request/providerARNs]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-gateway-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-gateway-response-request/response-type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/gateway-response-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/delete-gateway-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.delete-gateway-response-request/restApiId :portkey.aws.apigateway.-2015-07-09.delete-gateway-response-request/responseType] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-gateway-response-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-gateway-response-request/response-type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/gateway-response-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-gateway-response-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-gateway-response-request/restApiId :portkey.aws.apigateway.-2015-07-09.get-gateway-response-request/responseType] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-domain-names-request/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-domain-names-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-domain-names-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-domain-names-request/position :portkey.aws.apigateway.-2015-07-09.get-domain-names-request/limit]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.documentation-part-location/type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/documentation-part-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.documentation-part-location/path (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.documentation-part-location/method (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.documentation-part-location/status-code (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/documentation-part-location-status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.documentation-part-location/name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/documentation-part-location (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.documentation-part-location/type] :opt-un [:portkey.aws.apigateway.-2015-07-09.documentation-part-location/path :portkey.aws.apigateway.-2015-07-09.documentation-part-location/method :portkey.aws.apigateway.-2015-07-09.documentation-part-location/statusCode :portkey.aws.apigateway.-2015-07-09.documentation-part-location/name]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-base-path-mapping-request/domain-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-base-path-mapping-request/base-path (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-base-path-mapping-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-base-path-mapping-request/stage (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/create-base-path-mapping-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.create-base-path-mapping-request/domainName :portkey.aws.apigateway.-2015-07-09.create-base-path-mapping-request/restApiId] :opt-un [:portkey.aws.apigateway.-2015-07-09.create-base-path-mapping-request/basePath :portkey.aws.apigateway.-2015-07-09.create-base-path-mapping-request/stage]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.client-certificate/client-certificate-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.client-certificate/description (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.client-certificate/pem-encoded-certificate (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.client-certificate/created-date (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.client-certificate/expiration-date (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/client-certificate (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.client-certificate/clientCertificateId :portkey.aws.apigateway.-2015-07-09.client-certificate/description :portkey.aws.apigateway.-2015-07-09.client-certificate/pemEncodedCertificate :portkey.aws.apigateway.-2015-07-09.client-certificate/createdDate :portkey.aws.apigateway.-2015-07-09.client-certificate/expirationDate]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.api-keys/warnings (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.api-keys/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.api-keys/items (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-api-key))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/api-keys (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.api-keys/warnings :portkey.aws.apigateway.-2015-07-09.api-keys/position :portkey.aws.apigateway.-2015-07-09.api-keys/items]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.usage-plans/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.usage-plans/items (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-usage-plan))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/usage-plans (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.usage-plans/position :portkey.aws.apigateway.-2015-07-09.usage-plans/items]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/map-of-key-usages (clojure.spec.alpha/map-of :portkey.aws.apigateway.-2015-07-09/string :portkey.aws.apigateway.-2015-07-09/list-of-usage))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-authorizer (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/authorizer :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-stage-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-stage-request/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-stage-request/deployment-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-stage-request/description (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-stage-request/cache-cluster-enabled (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-stage-request/cache-cluster-size (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/cache-cluster-size))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-stage-request/variables (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-stage-request/documentation-version (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/create-stage-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.create-stage-request/restApiId :portkey.aws.apigateway.-2015-07-09.create-stage-request/stageName :portkey.aws.apigateway.-2015-07-09.create-stage-request/deploymentId] :opt-un [:portkey.aws.apigateway.-2015-07-09.create-stage-request/description :portkey.aws.apigateway.-2015-07-09.create-stage-request/cacheClusterEnabled :portkey.aws.apigateway.-2015-07-09.create-stage-request/cacheClusterSize :portkey.aws.apigateway.-2015-07-09.create-stage-request/variables :portkey.aws.apigateway.-2015-07-09.create-stage-request/documentationVersion]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.authorizers/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.authorizers/items (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-authorizer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/authorizers (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.authorizers/position :portkey.aws.apigateway.-2015-07-09.authorizers/items]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-models-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-models-request/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-models-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-models-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-models-request/restApiId] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-models-request/position :portkey.aws.apigateway.-2015-07-09.get-models-request/limit]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-api-key-request/api-key (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-api-key-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/update-api-key-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.update-api-key-request/apiKey] :opt-un [:portkey.aws.apigateway.-2015-07-09.update-api-key-request/patchOperations]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.usage/usage-plan-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.usage/start-date (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.usage/end-date (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.usage/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.usage/items (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-key-usages))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/usage (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.usage/usagePlanId :portkey.aws.apigateway.-2015-07-09.usage/startDate :portkey.aws.apigateway.-2015-07-09.usage/endDate :portkey.aws.apigateway.-2015-07-09.usage/position :portkey.aws.apigateway.-2015-07-09.usage/items]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-rest-api-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-rest-api-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/update-rest-api-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.update-rest-api-request/restApiId] :opt-un [:portkey.aws.apigateway.-2015-07-09.update-rest-api-request/patchOperations]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/api-keys-format (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"csv" "csv", :csv "csv"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-documentation-versions-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-documentation-versions-request/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-documentation-versions-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-documentation-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-documentation-versions-request/restApiId] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-documentation-versions-request/position :portkey.aws.apigateway.-2015-07-09.get-documentation-versions-request/limit]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-deployments-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-deployments-request/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-deployments-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-deployments-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-deployments-request/restApiId] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-deployments-request/position :portkey.aws.apigateway.-2015-07-09.get-deployments-request/limit]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-account-request (portkey.aws/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-usage-plan (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/usage-plan :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.import-api-keys-request/body (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/blob))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.import-api-keys-request/format (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/api-keys-format))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.import-api-keys-request/fail-on-warnings (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/import-api-keys-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.import-api-keys-request/body :portkey.aws.apigateway.-2015-07-09.import-api-keys-request/format] :opt-un [:portkey.aws.apigateway.-2015-07-09.import-api-keys-request/failOnWarnings]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.resource/id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.resource/parent-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.resource/path-part (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.resource/path (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.resource/resource-methods (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-method))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/resource (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.resource/id :portkey.aws.apigateway.-2015-07-09.resource/parentId :portkey.aws.apigateway.-2015-07-09.resource/pathPart :portkey.aws.apigateway.-2015-07-09.resource/path :portkey.aws.apigateway.-2015-07-09.resource/resourceMethods]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-usage-plan-key-request/usage-plan-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-usage-plan-key-request/key-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-usage-plan-key-request/key-type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/create-usage-plan-key-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.create-usage-plan-key-request/usagePlanId :portkey.aws.apigateway.-2015-07-09.create-usage-plan-key-request/keyId :portkey.aws.apigateway.-2015-07-09.create-usage-plan-key-request/keyType] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/patch-operation :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.sdk-configuration-property/name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.sdk-configuration-property/friendly-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.sdk-configuration-property/description (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.sdk-configuration-property/required (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.sdk-configuration-property/default-value (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/sdk-configuration-property (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.sdk-configuration-property/name :portkey.aws.apigateway.-2015-07-09.sdk-configuration-property/friendlyName :portkey.aws.apigateway.-2015-07-09.sdk-configuration-property/description :portkey.aws.apigateway.-2015-07-09.sdk-configuration-property/required :portkey.aws.apigateway.-2015-07-09.sdk-configuration-property/defaultValue]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-integration-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-integration-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-integration-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/delete-integration-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.delete-integration-request/restApiId :portkey.aws.apigateway.-2015-07-09.delete-integration-request/resourceId :portkey.aws.apigateway.-2015-07-09.delete-integration-request/httpMethod] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.sdk-response/content-type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.sdk-response/content-disposition (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.sdk-response/body (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/blob))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/sdk-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.sdk-response/contentType :portkey.aws.apigateway.-2015-07-09.sdk-response/contentDisposition :portkey.aws.apigateway.-2015-07-09.sdk-response/body]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.import-rest-api-request/fail-on-warnings (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.import-rest-api-request/parameters (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.import-rest-api-request/body (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/blob))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/import-rest-api-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.import-rest-api-request/body] :opt-un [:portkey.aws.apigateway.-2015-07-09.import-rest-api-request/failOnWarnings :portkey.aws.apigateway.-2015-07-09.import-rest-api-request/parameters]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-documentation-parts-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-documentation-parts-request/type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/documentation-part-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-documentation-parts-request/name-query (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-documentation-parts-request/path (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-documentation-parts-request/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-documentation-parts-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-documentation-parts-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-documentation-parts-request/restApiId] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-documentation-parts-request/type :portkey.aws.apigateway.-2015-07-09.get-documentation-parts-request/nameQuery :portkey.aws.apigateway.-2015-07-09.get-documentation-parts-request/path :portkey.aws.apigateway.-2015-07-09.get-documentation-parts-request/position :portkey.aws.apigateway.-2015-07-09.get-documentation-parts-request/limit]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.api-key/created-date (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.api-key/enabled (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.api-key/id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.api-key/stage-keys (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.api-key/customer-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.api-key/name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.api-key/value (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.api-key/last-updated-date (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.api-key/description (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/api-key (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.api-key/createdDate :portkey.aws.apigateway.-2015-07-09.api-key/enabled :portkey.aws.apigateway.-2015-07-09.api-key/id :portkey.aws.apigateway.-2015-07-09.api-key/stageKeys :portkey.aws.apigateway.-2015-07-09.api-key/customerId :portkey.aws.apigateway.-2015-07-09.api-key/name :portkey.aws.apigateway.-2015-07-09.api-key/value :portkey.aws.apigateway.-2015-07-09.api-key/lastUpdatedDate :portkey.aws.apigateway.-2015-07-09.api-key/description]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/nullable-integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-method-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-method-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-method-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-method-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/update-method-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.update-method-request/restApiId :portkey.aws.apigateway.-2015-07-09.update-method-request/resourceId :portkey.aws.apigateway.-2015-07-09.update-method-request/httpMethod] :opt-un [:portkey.aws.apigateway.-2015-07-09.update-method-request/patchOperations]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.domain-name/domain-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.domain-name/certificate-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.domain-name/certificate-arn (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.domain-name/certificate-upload-date (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.domain-name/distribution-domain-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/domain-name (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.domain-name/domainName :portkey.aws.apigateway.-2015-07-09.domain-name/certificateName :portkey.aws.apigateway.-2015-07-09.domain-name/certificateArn :portkey.aws.apigateway.-2015-07-09.domain-name/certificateUploadDate :portkey.aws.apigateway.-2015-07-09.domain-name/distributionDomainName]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-base-path-mapping (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/base-path-mapping :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/blob (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-integration-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-integration-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-integration-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-integration-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-integration-request/restApiId :portkey.aws.apigateway.-2015-07-09.get-integration-request/resourceId :portkey.aws.apigateway.-2015-07-09.get-integration-request/httpMethod] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.documentation-parts/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.documentation-parts/items (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-documentation-part))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/documentation-parts (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.documentation-parts/position :portkey.aws.apigateway.-2015-07-09.documentation-parts/items]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.export-response/content-type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.export-response/content-disposition (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.export-response/body (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/blob))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/export-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.export-response/contentType :portkey.aws.apigateway.-2015-07-09.export-response/contentDisposition :portkey.aws.apigateway.-2015-07-09.export-response/body]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-method-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-method-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-method-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/delete-method-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.delete-method-request/restApiId :portkey.aws.apigateway.-2015-07-09.delete-method-request/resourceId :portkey.aws.apigateway.-2015-07-09.delete-method-request/httpMethod] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-api-key-request/api-key (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-api-key-request/include-value (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-api-key-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-api-key-request/apiKey] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-api-key-request/includeValue]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.gateway-responses/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.gateway-responses/items (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-gateway-response))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/gateway-responses (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.gateway-responses/position :portkey.aws.apigateway.-2015-07-09.gateway-responses/items]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-domain-name-request/domain-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-domain-name-request/certificate-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-domain-name-request/certificate-body (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-domain-name-request/certificate-private-key (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-domain-name-request/certificate-chain (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-domain-name-request/certificate-arn (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/create-domain-name-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.create-domain-name-request/domainName] :opt-un [:portkey.aws.apigateway.-2015-07-09.create-domain-name-request/certificateName :portkey.aws.apigateway.-2015-07-09.create-domain-name-request/certificateBody :portkey.aws.apigateway.-2015-07-09.create-domain-name-request/certificatePrivateKey :portkey.aws.apigateway.-2015-07-09.create-domain-name-request/certificateChain :portkey.aws.apigateway.-2015-07-09.create-domain-name-request/certificateArn]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.integration/integration-responses (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-integration-response))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.integration/uri (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.integration/http-method (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.integration/request-templates (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.integration/request-parameters (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.integration/cache-namespace (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.integration/passthrough-behavior (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.integration/type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/integration-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.integration/content-handling (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/content-handling-strategy))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.integration/cache-key-parameters (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.integration/credentials (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/integration (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.integration/integrationResponses :portkey.aws.apigateway.-2015-07-09.integration/uri :portkey.aws.apigateway.-2015-07-09.integration/httpMethod :portkey.aws.apigateway.-2015-07-09.integration/requestTemplates :portkey.aws.apigateway.-2015-07-09.integration/requestParameters :portkey.aws.apigateway.-2015-07-09.integration/cacheNamespace :portkey.aws.apigateway.-2015-07-09.integration/passthroughBehavior :portkey.aws.apigateway.-2015-07-09.integration/type :portkey.aws.apigateway.-2015-07-09.integration/contentHandling :portkey.aws.apigateway.-2015-07-09.integration/cacheKeyParameters :portkey.aws.apigateway.-2015-07-09.integration/credentials]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.flush-stage-authorizers-cache-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.flush-stage-authorizers-cache-request/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/flush-stage-authorizers-cache-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.flush-stage-authorizers-cache-request/restApiId :portkey.aws.apigateway.-2015-07-09.flush-stage-authorizers-cache-request/stageName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.documentation-version/version (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.documentation-version/created-date (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.documentation-version/description (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/documentation-version (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.documentation-version/version :portkey.aws.apigateway.-2015-07-09.documentation-version/createdDate :portkey.aws.apigateway.-2015-07-09.documentation-version/description]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-usage-plan-request/usage-plan-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-usage-plan-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-usage-plan-request/usagePlanId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/unauthorized-cache-control-header-strategy (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"FAIL_WITH_403" "FAIL_WITH_403", :fail-with-403 "FAIL_WITH_403", "SUCCEED_WITH_RESPONSE_HEADER" "SUCCEED_WITH_RESPONSE_HEADER", :succeed-with-response-header "SUCCEED_WITH_RESPONSE_HEADER", "SUCCEED_WITHOUT_RESPONSE_HEADER" "SUCCEED_WITHOUT_RESPONSE_HEADER", :succeed-without-response-header "SUCCEED_WITHOUT_RESPONSE_HEADER"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-deployment-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-deployment-request/deployment-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/delete-deployment-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.delete-deployment-request/restApiId :portkey.aws.apigateway.-2015-07-09.delete-deployment-request/deploymentId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-api-key (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/api-key :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.integration-response/status-code (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/status-code))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.integration-response/selection-pattern (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.integration-response/response-parameters (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.integration-response/response-templates (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.integration-response/content-handling (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/content-handling-strategy))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/integration-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.integration-response/statusCode :portkey.aws.apigateway.-2015-07-09.integration-response/selectionPattern :portkey.aws.apigateway.-2015-07-09.integration-response/responseParameters :portkey.aws.apigateway.-2015-07-09.integration-response/responseTemplates :portkey.aws.apigateway.-2015-07-09.integration-response/contentHandling]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-domain-name (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/domain-name :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-rest-api-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-rest-api-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.get-rest-api-request/restApiId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-integration-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-integration-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-integration-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-integration-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/update-integration-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.update-integration-request/restApiId :portkey.aws.apigateway.-2015-07-09.update-integration-request/resourceId :portkey.aws.apigateway.-2015-07-09.update-integration-request/httpMethod] :opt-un [:portkey.aws.apigateway.-2015-07-09.update-integration-request/patchOperations]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-method-request/authorizer-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-method-request/resource-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-method-request/request-validator-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-method-request/authorization-type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-method-request/http-method (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-method-request/operation-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-method-request/request-parameters (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-method-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-method-request/api-key-required (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.put-method-request/request-models (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/put-method-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.put-method-request/restApiId :portkey.aws.apigateway.-2015-07-09.put-method-request/resourceId :portkey.aws.apigateway.-2015-07-09.put-method-request/httpMethod :portkey.aws.apigateway.-2015-07-09.put-method-request/authorizationType] :opt-un [:portkey.aws.apigateway.-2015-07-09.put-method-request/authorizerId :portkey.aws.apigateway.-2015-07-09.put-method-request/requestValidatorId :portkey.aws.apigateway.-2015-07-09.put-method-request/operationName :portkey.aws.apigateway.-2015-07-09.put-method-request/requestParameters :portkey.aws.apigateway.-2015-07-09.put-method-request/apiKeyRequired :portkey.aws.apigateway.-2015-07-09.put-method-request/requestModels]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.models/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.models/items (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-model))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/models (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.models/position :portkey.aws.apigateway.-2015-07-09.models/items]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-authorizer-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-authorizer-request/authorizer-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/delete-authorizer-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.delete-authorizer-request/restApiId :portkey.aws.apigateway.-2015-07-09.delete-authorizer-request/authorizerId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.stage/cache-cluster-status (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/cache-cluster-status))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.stage/created-date (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.stage/documentation-version (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.stage/method-settings (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-method-settings))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.stage/deployment-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.stage/client-certificate-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.stage/last-updated-date (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/timestamp))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.stage/variables (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/map-of-string-to-string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.stage/cache-cluster-enabled (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/boolean))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.stage/stage-name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.stage/description (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.stage/cache-cluster-size (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/cache-cluster-size))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/stage (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.stage/cacheClusterStatus :portkey.aws.apigateway.-2015-07-09.stage/createdDate :portkey.aws.apigateway.-2015-07-09.stage/documentationVersion :portkey.aws.apigateway.-2015-07-09.stage/methodSettings :portkey.aws.apigateway.-2015-07-09.stage/deploymentId :portkey.aws.apigateway.-2015-07-09.stage/clientCertificateId :portkey.aws.apigateway.-2015-07-09.stage/lastUpdatedDate :portkey.aws.apigateway.-2015-07-09.stage/variables :portkey.aws.apigateway.-2015-07-09.stage/cacheClusterEnabled :portkey.aws.apigateway.-2015-07-09.stage/stageName :portkey.aws.apigateway.-2015-07-09.stage/description :portkey.aws.apigateway.-2015-07-09.stage/cacheClusterSize]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-authorizer-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-authorizer-request/authorizer-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-authorizer-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/update-authorizer-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.update-authorizer-request/restApiId :portkey.aws.apigateway.-2015-07-09.update-authorizer-request/authorizerId] :opt-un [:portkey.aws.apigateway.-2015-07-09.update-authorizer-request/patchOperations]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/list-of-stage-keys (clojure.spec.alpha/coll-of :portkey.aws.apigateway.-2015-07-09/stage-key :max-count nil))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/content-handling-strategy (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"CONVERT_TO_BINARY" "CONVERT_TO_BINARY", :convert-to-binary "CONVERT_TO_BINARY", "CONVERT_TO_TEXT" "CONVERT_TO_TEXT", :convert-to-text "CONVERT_TO_TEXT"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-request-validator-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.delete-request-validator-request/request-validator-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/delete-request-validator-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.delete-request-validator-request/restApiId :portkey.aws.apigateway.-2015-07-09.delete-request-validator-request/requestValidatorId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-documentation-part-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-documentation-part-request/location (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/documentation-part-location))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.create-documentation-part-request/properties (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/create-documentation-part-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.create-documentation-part-request/restApiId :portkey.aws.apigateway.-2015-07-09.create-documentation-part-request/location :portkey.aws.apigateway.-2015-07-09.create-documentation-part-request/properties] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-request-validator-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-request-validator-request/request-validator-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-request-validator-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/update-request-validator-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.update-request-validator-request/restApiId :portkey.aws.apigateway.-2015-07-09.update-request-validator-request/requestValidatorId] :opt-un [:portkey.aws.apigateway.-2015-07-09.update-request-validator-request/patchOperations]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/map-of-integration-response (clojure.spec.alpha/map-of :portkey.aws.apigateway.-2015-07-09/string :portkey.aws.apigateway.-2015-07-09/integration-response))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-usage-plans-request/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-usage-plans-request/key-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.get-usage-plans-request/limit (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/get-usage-plans-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.get-usage-plans-request/position :portkey.aws.apigateway.-2015-07-09.get-usage-plans-request/keyId :portkey.aws.apigateway.-2015-07-09.get-usage-plans-request/limit]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.authorizer/authorizer-credentials (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.authorizer/identity-validation-expression (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.authorizer/id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.authorizer/name (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.authorizer/type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/authorizer-type))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.authorizer/authorizer-result-ttl-in-seconds (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/nullable-integer))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.authorizer/authorizer-uri (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.authorizer/auth-type (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.authorizer/identity-source (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.authorizer/providerarns (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-ofarns))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/authorizer (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.authorizer/authorizerCredentials :portkey.aws.apigateway.-2015-07-09.authorizer/identityValidationExpression :portkey.aws.apigateway.-2015-07-09.authorizer/id :portkey.aws.apigateway.-2015-07-09.authorizer/name :portkey.aws.apigateway.-2015-07-09.authorizer/type :portkey.aws.apigateway.-2015-07-09.authorizer/authorizerResultTtlInSeconds :portkey.aws.apigateway.-2015-07-09.authorizer/authorizerUri :portkey.aws.apigateway.-2015-07-09.authorizer/authType :portkey.aws.apigateway.-2015-07-09.authorizer/identitySource :portkey.aws.apigateway.-2015-07-09.authorizer/providerARNs]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-documentation-part-request/rest-api-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-documentation-part-request/documentation-part-id (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.update-documentation-part-request/patch-operations (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-patch-operation))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/update-documentation-part-request (portkey.aws/json-keys :req-un [:portkey.aws.apigateway.-2015-07-09.update-documentation-part-request/restApiId :portkey.aws.apigateway.-2015-07-09.update-documentation-part-request/documentationPartId] :opt-un [:portkey.aws.apigateway.-2015-07-09.update-documentation-part-request/patchOperations]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.deployments/position (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/string))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09.deployments/items (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/list-of-deployment))
(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/deployments (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.apigateway.-2015-07-09.deployments/position :portkey.aws.apigateway.-2015-07-09.deployments/items]))

(clojure.spec.alpha/def :portkey.aws.apigateway.-2015-07-09/boolean clojure.core/boolean?)

(clojure.core/defn flush-stage-cache [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/restapis/{restapi_id}/stages/{stage_name}/cache/data" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/flush-stage-cache-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "stage_name" "stageName"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef flush-stage-cache :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/flush-stage-cache-request))

(clojure.core/defn get-usage-plan [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/usageplans/{usageplanId}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-usage-plan-request {:payload nil, :headers {}, :uri {"usageplanId" "usagePlanId"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/usage-plan {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-usage-plan :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-usage-plan-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/usage-plan))

(clojure.core/defn update-rest-api [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PATCH" "/restapis/{restapi_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/update-rest-api-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/rest-api {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef update-rest-api :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/update-rest-api-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/rest-api))

(clojure.core/defn update-account [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PATCH" "/account" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/update-account-request {:payload nil, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/account {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef update-account :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/update-account-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/account))

(clojure.core/defn delete-rest-api [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/restapis/{restapi_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/delete-rest-api-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception}))
(clojure.spec.alpha/fdef delete-rest-api :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/delete-rest-api-request))

(clojure.core/defn delete-method [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/delete-method-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod"}, :querystring {}} 204 nil {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception}))
(clojure.spec.alpha/fdef delete-method :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/delete-method-request))

(clojure.core/defn update-authorizer [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PATCH" "/restapis/{restapi_id}/authorizers/{authorizer_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/update-authorizer-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "authorizer_id" "authorizerId"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/authorizer {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef update-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/update-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/authorizer))

(clojure.core/defn get-sdk-type [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/sdktypes/{sdktype_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-sdk-type-request {:payload nil, :headers {}, :uri {"sdktype_id" "id"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/sdk-type {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-sdk-type :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-sdk-type-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/sdk-type))

(clojure.core/defn update-domain-name [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PATCH" "/domainnames/{domain_name}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/update-domain-name-request {:payload nil, :headers {}, :uri {"domain_name" "domainName"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/domain-name {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef update-domain-name :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/update-domain-name-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/domain-name))

(clojure.core/defn update-gateway-response [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PATCH" "/restapis/{restapi_id}/gatewayresponses/{response_type}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/update-gateway-response-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "response_type" "responseType"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/gateway-response {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef update-gateway-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/update-gateway-response-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/gateway-response))

(clojure.core/defn get-rest-apis [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-rest-apis-request {:payload nil, :headers {}, :uri {}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway.-2015-07-09/rest-apis {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-rest-apis :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-rest-apis-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/rest-apis))

(clojure.core/defn get-documentation-parts [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/documentation/parts" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-documentation-parts-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"type" "type", "name" "nameQuery", "path" "path", "position" "position", "limit" "limit"}} nil :portkey.aws.apigateway.-2015-07-09/documentation-parts {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-documentation-parts :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-documentation-parts-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/documentation-parts))

(clojure.core/defn get-deployment [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/deployments/{deployment_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-deployment-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "deployment_id" "deploymentId"}, :querystring {"embed" "embed"}} nil :portkey.aws.apigateway.-2015-07-09/deployment {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "ServiceUnavailableException" :portkey.aws.apigateway.-2015-07-09/service-unavailable-exception}))
(clojure.spec.alpha/fdef get-deployment :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-deployment-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/deployment))

(clojure.core/defn create-resource [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "POST" "/restapis/{restapi_id}/resources/{parent_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/create-resource-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "parent_id" "parentId"}, :querystring {}} 201 :portkey.aws.apigateway.-2015-07-09/resource {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef create-resource :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/create-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/resource))

(clojure.core/defn delete-documentation-version [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/restapis/{restapi_id}/documentation/versions/{doc_version}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/delete-documentation-version-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "doc_version" "documentationVersion"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef delete-documentation-version :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/delete-documentation-version-request))

(clojure.core/defn delete-usage-plan [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/usageplans/{usageplanId}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/delete-usage-plan-request {:payload nil, :headers {}, :uri {"usageplanId" "usagePlanId"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception}))
(clojure.spec.alpha/fdef delete-usage-plan :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/delete-usage-plan-request))

(clojure.core/defn get-stages [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/stages" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-stages-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"deploymentId" "deploymentId"}} nil :portkey.aws.apigateway.-2015-07-09/stages {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-stages :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-stages-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/stages))

(clojure.core/defn get-resource [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/resources/{resource_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-resource-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId"}, :querystring {"embed" "embed"}} nil :portkey.aws.apigateway.-2015-07-09/resource {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-resource :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/resource))

(clojure.core/defn update-documentation-part [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PATCH" "/restapis/{restapi_id}/documentation/parts/{part_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/update-documentation-part-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "part_id" "documentationPartId"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/documentation-part {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef update-documentation-part :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/update-documentation-part-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/documentation-part))

(clojure.core/defn import-api-keys [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "POST" "/apikeys?mode=import" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/import-api-keys-request {:payload "body", :headers {}, :uri {}, :querystring {"format" "format", "failonwarnings" "failOnWarnings"}} 201 :portkey.aws.apigateway.-2015-07-09/api-key-ids {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception}))
(clojure.spec.alpha/fdef import-api-keys :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/import-api-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/api-key-ids))

(clojure.core/defn get-client-certificate [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/clientcertificates/{clientcertificate_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-client-certificate-request {:payload nil, :headers {}, :uri {"clientcertificate_id" "clientCertificateId"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/client-certificate {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-client-certificate :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-client-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/client-certificate))

(clojure.core/defn create-authorizer [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "POST" "/restapis/{restapi_id}/authorizers" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/create-authorizer-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {}} 201 :portkey.aws.apigateway.-2015-07-09/authorizer {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef create-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/create-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/authorizer))

(clojure.core/defn get-usage-plan-keys [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/usageplans/{usageplanId}/keys" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-usage-plan-keys-request {:payload nil, :headers {}, :uri {"usageplanId" "usagePlanId"}, :querystring {"position" "position", "limit" "limit", "name" "nameQuery"}} nil :portkey.aws.apigateway.-2015-07-09/usage-plan-keys {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-usage-plan-keys :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-usage-plan-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/usage-plan-keys))

(clojure.core/defn get-gateway-response [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/gatewayresponses/{response_type}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-gateway-response-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "response_type" "responseType"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/gateway-response {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-gateway-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-gateway-response-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/gateway-response))

(clojure.core/defn get-deployments [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/deployments" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-deployments-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway.-2015-07-09/deployments {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "ServiceUnavailableException" :portkey.aws.apigateway.-2015-07-09/service-unavailable-exception}))
(clojure.spec.alpha/fdef get-deployments :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-deployments-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/deployments))

(clojure.core/defn update-resource [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PATCH" "/restapis/{restapi_id}/resources/{resource_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/update-resource-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/resource {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef update-resource :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/update-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/resource))

(clojure.core/defn get-authorizers [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/authorizers" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-authorizers-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway.-2015-07-09/authorizers {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-authorizers :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-authorizers-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/authorizers))

(clojure.core/defn get-base-path-mapping [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/domainnames/{domain_name}/basepathmappings/{base_path}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-base-path-mapping-request {:payload nil, :headers {}, :uri {"domain_name" "domainName", "base_path" "basePath"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/base-path-mapping {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-base-path-mapping :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-base-path-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/base-path-mapping))

(clojure.core/defn delete-integration [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/delete-integration-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod"}, :querystring {}} 204 nil {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception}))
(clojure.spec.alpha/fdef delete-integration :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/delete-integration-request))

(clojure.core/defn get-request-validators [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/requestvalidators" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-request-validators-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway.-2015-07-09/request-validators {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-request-validators :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-request-validators-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/request-validators))

(clojure.core/defn create-domain-name [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "POST" "/domainnames" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/create-domain-name-request {:payload nil, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.apigateway.-2015-07-09/domain-name {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef create-domain-name :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/create-domain-name-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/domain-name))

(clojure.core/defn put-integration-response [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PUT" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration/responses/{status_code}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/put-integration-response-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod", "status_code" "statusCode"}, :querystring {}} 201 :portkey.aws.apigateway.-2015-07-09/integration-response {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception}))
(clojure.spec.alpha/fdef put-integration-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/put-integration-response-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/integration-response))

(clojure.core/defn create-usage-plan [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "POST" "/usageplans" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/create-usage-plan-request {:payload nil, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.apigateway.-2015-07-09/usage-plan {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception}))
(clojure.spec.alpha/fdef create-usage-plan :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/create-usage-plan-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/usage-plan))

(clojure.core/defn create-api-key [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "POST" "/apikeys" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/create-api-key-request {:payload nil, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.apigateway.-2015-07-09/api-key {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception}))
(clojure.spec.alpha/fdef create-api-key :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/create-api-key-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/api-key))

(clojure.core/defn import-rest-api [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "POST" "/restapis?mode=import" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/import-rest-api-request {:payload "body", :headers {}, :uri {}, :querystring {"failonwarnings" "failOnWarnings", nil "parameters"}} 201 :portkey.aws.apigateway.-2015-07-09/rest-api {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception}))
(clojure.spec.alpha/fdef import-rest-api :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/import-rest-api-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/rest-api))

(clojure.core/defn delete-api-key [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/apikeys/{api_Key}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/delete-api-key-request {:payload nil, :headers {}, :uri {"api_Key" "apiKey"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef delete-api-key :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/delete-api-key-request))

(clojure.core/defn get-integration [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-integration-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/integration {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-integration :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-integration-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/integration))

(clojure.core/defn get-export [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/stages/{stage_name}/exports/{export_type}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-export-request {:payload nil, :headers {"accepts" ["Accept" nil]}, :uri {"restapi_id" "restApiId", "stage_name" "stageName", "export_type" "exportType"}, :querystring {nil "parameters"}} 200 :portkey.aws.apigateway.-2015-07-09/export-response {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-export :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-export-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/export-response))

(clojure.core/defn delete-stage [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/restapis/{restapi_id}/stages/{stage_name}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/delete-stage-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "stage_name" "stageName"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception}))
(clojure.spec.alpha/fdef delete-stage :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/delete-stage-request))

(clojure.core/defn delete-request-validator [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/restapis/{restapi_id}/requestvalidators/{requestvalidator_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/delete-request-validator-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "requestvalidator_id" "requestValidatorId"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception}))
(clojure.spec.alpha/fdef delete-request-validator :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/delete-request-validator-request))

(clojure.core/defn get-gateway-responses [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/gatewayresponses" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-gateway-responses-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway.-2015-07-09/gateway-responses {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-gateway-responses :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-gateway-responses-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/gateway-responses))

(clojure.core/defn put-method-response [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PUT" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/responses/{status_code}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/put-method-response-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod", "status_code" "statusCode"}, :querystring {}} 201 :portkey.aws.apigateway.-2015-07-09/method-response {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef put-method-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/put-method-response-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/method-response))

(clojure.core/defn get-model [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/models/{model_name}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-model-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "model_name" "modelName"}, :querystring {"flatten" "flatten"}} nil :portkey.aws.apigateway.-2015-07-09/model {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-model :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-model-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/model))

(clojure.core/defn create-model [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "POST" "/restapis/{restapi_id}/models" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/create-model-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {}} 201 :portkey.aws.apigateway.-2015-07-09/model {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef create-model :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/create-model-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/model))

(clojure.core/defn update-api-key [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PATCH" "/apikeys/{api_Key}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/update-api-key-request {:payload nil, :headers {}, :uri {"api_Key" "apiKey"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/api-key {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception}))
(clojure.spec.alpha/fdef update-api-key :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/update-api-key-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/api-key))

(clojure.core/defn create-deployment [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "POST" "/restapis/{restapi_id}/deployments" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/create-deployment-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {}} 201 :portkey.aws.apigateway.-2015-07-09/deployment {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "ServiceUnavailableException" :portkey.aws.apigateway.-2015-07-09/service-unavailable-exception}))
(clojure.spec.alpha/fdef create-deployment :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/create-deployment-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/deployment))

(clojure.core/defn update-method [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PATCH" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/update-method-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/method {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef update-method :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/update-method-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/method))

(clojure.core/defn test-invoke-authorizer [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "POST" "/restapis/{restapi_id}/authorizers/{authorizer_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/test-invoke-authorizer-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "authorizer_id" "authorizerId"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/test-invoke-authorizer-response {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef test-invoke-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/test-invoke-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/test-invoke-authorizer-response))

(clojure.core/defn create-documentation-part [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "POST" "/restapis/{restapi_id}/documentation/parts" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/create-documentation-part-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {}} 201 :portkey.aws.apigateway.-2015-07-09/documentation-part {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef create-documentation-part :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/create-documentation-part-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/documentation-part))

(clojure.core/defn update-stage [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PATCH" "/restapis/{restapi_id}/stages/{stage_name}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/update-stage-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "stage_name" "stageName"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/stage {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef update-stage :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/update-stage-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/stage))

(clojure.core/defn update-request-validator [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PATCH" "/restapis/{restapi_id}/requestvalidators/{requestvalidator_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/update-request-validator-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "requestvalidator_id" "requestValidatorId"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/request-validator {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef update-request-validator :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/update-request-validator-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/request-validator))

(clojure.core/defn get-sdk-types [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/sdktypes" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-sdk-types-request {:payload nil, :headers {}, :uri {}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway.-2015-07-09/sdk-types {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-sdk-types :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-sdk-types-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/sdk-types))

(clojure.core/defn update-client-certificate [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PATCH" "/clientcertificates/{clientcertificate_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/update-client-certificate-request {:payload nil, :headers {}, :uri {"clientcertificate_id" "clientCertificateId"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/client-certificate {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception}))
(clojure.spec.alpha/fdef update-client-certificate :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/update-client-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/client-certificate))

(clojure.core/defn update-model [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PATCH" "/restapis/{restapi_id}/models/{model_name}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/update-model-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "model_name" "modelName"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/model {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef update-model :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/update-model-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/model))

(clojure.core/defn get-documentation-versions [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/documentation/versions" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-documentation-versions-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway.-2015-07-09/documentation-versions {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-documentation-versions :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-documentation-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/documentation-versions))

(clojure.core/defn update-usage [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PATCH" "/usageplans/{usageplanId}/keys/{keyId}/usage" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/update-usage-request {:payload nil, :headers {}, :uri {"usageplanId" "usagePlanId", "keyId" "keyId"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/usage {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception}))
(clojure.spec.alpha/fdef update-usage :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/update-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/usage))

(clojure.core/defn create-usage-plan-key [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "POST" "/usageplans/{usageplanId}/keys" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/create-usage-plan-key-request {:payload nil, :headers {}, :uri {"usageplanId" "usagePlanId"}, :querystring {}} 201 :portkey.aws.apigateway.-2015-07-09/usage-plan-key {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef create-usage-plan-key :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/create-usage-plan-key-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/usage-plan-key))

(clojure.core/defn put-integration [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PUT" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/put-integration-request {:payload nil, :headers {}, :uri {"resource_id" "resourceId", "http_method" "httpMethod", "restapi_id" "restApiId"}, :querystring {}} 201 :portkey.aws.apigateway.-2015-07-09/integration {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef put-integration :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/put-integration-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/integration))

(clojure.core/defn get-usage [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/usageplans/{usageplanId}/usage" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-usage-request {:payload nil, :headers {}, :uri {"usageplanId" "usagePlanId"}, :querystring {"keyId" "keyId", "startDate" "startDate", "endDate" "endDate", "position" "position", "limit" "limit"}} nil :portkey.aws.apigateway.-2015-07-09/usage {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-usage :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-usage-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/usage))

(clojure.core/defn update-documentation-version [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PATCH" "/restapis/{restapi_id}/documentation/versions/{doc_version}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/update-documentation-version-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "doc_version" "documentationVersion"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/documentation-version {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef update-documentation-version :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/update-documentation-version-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/documentation-version))

(clojure.core/defn get-stage [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/stages/{stage_name}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-stage-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "stage_name" "stageName"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/stage {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-stage :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-stage-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/stage))

(clojure.core/defn update-method-response [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PATCH" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/responses/{status_code}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/update-method-response-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod", "status_code" "statusCode"}, :querystring {}} 201 :portkey.aws.apigateway.-2015-07-09/method-response {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef update-method-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/update-method-response-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/method-response))

(clojure.core/defn create-base-path-mapping [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "POST" "/domainnames/{domain_name}/basepathmappings" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/create-base-path-mapping-request {:payload nil, :headers {}, :uri {"domain_name" "domainName"}, :querystring {}} 201 :portkey.aws.apigateway.-2015-07-09/base-path-mapping {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef create-base-path-mapping :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/create-base-path-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/base-path-mapping))

(clojure.core/defn get-documentation-part [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/documentation/parts/{part_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-documentation-part-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "part_id" "documentationPartId"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/documentation-part {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-documentation-part :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-documentation-part-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/documentation-part))

(clojure.core/defn delete-model [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/restapis/{restapi_id}/models/{model_name}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/delete-model-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "model_name" "modelName"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception}))
(clojure.spec.alpha/fdef delete-model :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/delete-model-request))

(clojure.core/defn import-documentation-parts [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PUT" "/restapis/{restapi_id}/documentation/parts" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/import-documentation-parts-request {:payload "body", :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"mode" "mode", "failonwarnings" "failOnWarnings"}} nil :portkey.aws.apigateway.-2015-07-09/documentation-part-ids {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef import-documentation-parts :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/import-documentation-parts-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/documentation-part-ids))

(clojure.core/defn delete-method-response [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/responses/{status_code}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/delete-method-response-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod", "status_code" "statusCode"}, :querystring {}} 204 nil {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception}))
(clojure.spec.alpha/fdef delete-method-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/delete-method-response-request))

(clojure.core/defn get-client-certificates [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/clientcertificates" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-client-certificates-request {:payload nil, :headers {}, :uri {}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway.-2015-07-09/client-certificates {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-client-certificates :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-client-certificates-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/client-certificates))

(clojure.core/defn get-api-keys [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/apikeys" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-api-keys-request {:payload nil, :headers {}, :uri {}, :querystring {"position" "position", "limit" "limit", "name" "nameQuery", "customerId" "customerId", "includeValues" "includeValues"}} nil :portkey.aws.apigateway.-2015-07-09/api-keys {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-api-keys :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-api-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/api-keys))

(clojure.core/defn update-deployment [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PATCH" "/restapis/{restapi_id}/deployments/{deployment_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/update-deployment-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "deployment_id" "deploymentId"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/deployment {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "ServiceUnavailableException" :portkey.aws.apigateway.-2015-07-09/service-unavailable-exception}))
(clojure.spec.alpha/fdef update-deployment :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/update-deployment-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/deployment))

(clojure.core/defn delete-domain-name [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/domainnames/{domain_name}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/delete-domain-name-request {:payload nil, :headers {}, :uri {"domain_name" "domainName"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef delete-domain-name :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/delete-domain-name-request))

(clojure.core/defn create-rest-api [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "POST" "/restapis" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/create-rest-api-request {:payload nil, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.apigateway.-2015-07-09/rest-api {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef create-rest-api :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/create-rest-api-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/rest-api))

(clojure.core/defn delete-authorizer [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/restapis/{restapi_id}/authorizers/{authorizer_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/delete-authorizer-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "authorizer_id" "authorizerId"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception}))
(clojure.spec.alpha/fdef delete-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/delete-authorizer-request))

(clojure.core/defn get-usage-plan-key [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/usageplans/{usageplanId}/keys/{keyId}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-usage-plan-key-request {:payload nil, :headers {}, :uri {"usageplanId" "usagePlanId", "keyId" "keyId"}, :querystring {}} 200 :portkey.aws.apigateway.-2015-07-09/usage-plan-key {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-usage-plan-key :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-usage-plan-key-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/usage-plan-key))

(clojure.core/defn delete-resource [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/restapis/{restapi_id}/resources/{resource_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/delete-resource-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef delete-resource :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/delete-resource-request))

(clojure.core/defn test-invoke-method [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "POST" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/test-invoke-method-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/test-invoke-method-response {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef test-invoke-method :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/test-invoke-method-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/test-invoke-method-response))

(clojure.core/defn get-method-response [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/responses/{status_code}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-method-response-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod", "status_code" "statusCode"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/method-response {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-method-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-method-response-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/method-response))

(clojure.core/defn get-request-validator [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/requestvalidators/{requestvalidator_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-request-validator-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "requestvalidator_id" "requestValidatorId"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/request-validator {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-request-validator :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-request-validator-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/request-validator))

(clojure.core/defn get-authorizer [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/authorizers/{authorizer_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-authorizer-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "authorizer_id" "authorizerId"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/authorizer {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-authorizer :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-authorizer-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/authorizer))

(clojure.core/defn get-base-path-mappings [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/domainnames/{domain_name}/basepathmappings" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-base-path-mappings-request {:payload nil, :headers {}, :uri {"domain_name" "domainName"}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway.-2015-07-09/base-path-mappings {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-base-path-mappings :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-base-path-mappings-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/base-path-mappings))

(clojure.core/defn delete-base-path-mapping [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/domainnames/{domain_name}/basepathmappings/{base_path}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/delete-base-path-mapping-request {:payload nil, :headers {}, :uri {"domain_name" "domainName", "base_path" "basePath"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef delete-base-path-mapping :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/delete-base-path-mapping-request))

(clojure.core/defn get-account [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/account" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-account-request {:payload nil, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/account {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-account :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-account-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/account))

(clojure.core/defn get-integration-response [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration/responses/{status_code}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-integration-response-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod", "status_code" "statusCode"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/integration-response {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-integration-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-integration-response-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/integration-response))

(clojure.core/defn get-model-template [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/models/{model_name}/default_template" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-model-template-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "model_name" "modelName"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/template {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-model-template :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-model-template-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/template))

(clojure.core/defn get-rest-api [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-rest-api-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/rest-api {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-rest-api :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-rest-api-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/rest-api))

(clojure.core/defn delete-integration-response [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration/responses/{status_code}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/delete-integration-response-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod", "status_code" "statusCode"}, :querystring {}} 204 nil {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception}))
(clojure.spec.alpha/fdef delete-integration-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/delete-integration-response-request))

(clojure.core/defn delete-usage-plan-key [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/usageplans/{usageplanId}/keys/{keyId}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/delete-usage-plan-key-request {:payload nil, :headers {}, :uri {"usageplanId" "usagePlanId", "keyId" "keyId"}, :querystring {}} 202 nil {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef delete-usage-plan-key :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/delete-usage-plan-key-request))

(clojure.core/defn delete-documentation-part [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/restapis/{restapi_id}/documentation/parts/{part_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/delete-documentation-part-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "part_id" "documentationPartId"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception}))
(clojure.spec.alpha/fdef delete-documentation-part :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/delete-documentation-part-request))

(clojure.core/defn generate-client-certificate [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "POST" "/clientcertificates" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/generate-client-certificate-request {:payload nil, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.apigateway.-2015-07-09/client-certificate {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception}))
(clojure.spec.alpha/fdef generate-client-certificate :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/generate-client-certificate-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/client-certificate))

(clojure.core/defn get-method [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-method-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/method {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-method :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-method-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/method))

(clojure.core/defn get-models [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/models" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-models-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway.-2015-07-09/models {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-models :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-models-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/models))

(clojure.core/defn get-documentation-version [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/documentation/versions/{doc_version}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-documentation-version-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "doc_version" "documentationVersion"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/documentation-version {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-documentation-version :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-documentation-version-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/documentation-version))

(clojure.core/defn create-documentation-version [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "POST" "/restapis/{restapi_id}/documentation/versions" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/create-documentation-version-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {}} 201 :portkey.aws.apigateway.-2015-07-09/documentation-version {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef create-documentation-version :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/create-documentation-version-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/documentation-version))

(clojure.core/defn get-resources [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/resources" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-resources-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"position" "position", "limit" "limit", "embed" "embed"}} nil :portkey.aws.apigateway.-2015-07-09/resources {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-resources :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/resources))

(clojure.core/defn get-api-key [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/apikeys/{api_Key}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-api-key-request {:payload nil, :headers {}, :uri {"api_Key" "apiKey"}, :querystring {"includeValue" "includeValue"}} nil :portkey.aws.apigateway.-2015-07-09/api-key {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-api-key :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-api-key-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/api-key))

(clojure.core/defn create-stage [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "POST" "/restapis/{restapi_id}/stages" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/create-stage-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {}} 201 :portkey.aws.apigateway.-2015-07-09/stage {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef create-stage :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/create-stage-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/stage))

(clojure.core/defn delete-gateway-response [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/restapis/{restapi_id}/gatewayresponses/{response_type}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/delete-gateway-response-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "response_type" "responseType"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception}))
(clojure.spec.alpha/fdef delete-gateway-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/delete-gateway-response-request))

(clojure.core/defn update-integration [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PATCH" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/update-integration-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/integration {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception}))
(clojure.spec.alpha/fdef update-integration :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/update-integration-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/integration))

(clojure.core/defn flush-stage-authorizers-cache [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/restapis/{restapi_id}/stages/{stage_name}/cache/authorizers" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/flush-stage-authorizers-cache-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "stage_name" "stageName"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef flush-stage-authorizers-cache :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/flush-stage-authorizers-cache-request))

(clojure.core/defn delete-client-certificate [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/clientcertificates/{clientcertificate_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/delete-client-certificate-request {:payload nil, :headers {}, :uri {"clientcertificate_id" "clientCertificateId"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception}))
(clojure.spec.alpha/fdef delete-client-certificate :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/delete-client-certificate-request))

(clojure.core/defn put-gateway-response [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PUT" "/restapis/{restapi_id}/gatewayresponses/{response_type}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/put-gateway-response-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "response_type" "responseType"}, :querystring {}} 201 :portkey.aws.apigateway.-2015-07-09/gateway-response {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef put-gateway-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/put-gateway-response-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/gateway-response))

(clojure.core/defn get-domain-name [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/domainnames/{domain_name}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-domain-name-request {:payload nil, :headers {}, :uri {"domain_name" "domainName"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/domain-name {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "ServiceUnavailableException" :portkey.aws.apigateway.-2015-07-09/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-domain-name :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-domain-name-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/domain-name))

(clojure.core/defn update-base-path-mapping [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PATCH" "/domainnames/{domain_name}/basepathmappings/{base_path}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/update-base-path-mapping-request {:payload nil, :headers {}, :uri {"domain_name" "domainName", "base_path" "basePath"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/base-path-mapping {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef update-base-path-mapping :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/update-base-path-mapping-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/base-path-mapping))

(clojure.core/defn get-usage-plans [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/usageplans" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-usage-plans-request {:payload nil, :headers {}, :uri {}, :querystring {"position" "position", "keyId" "keyId", "limit" "limit"}} nil :portkey.aws.apigateway.-2015-07-09/usage-plans {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception}))
(clojure.spec.alpha/fdef get-usage-plans :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-usage-plans-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/usage-plans))

(clojure.core/defn update-usage-plan [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PATCH" "/usageplans/{usageplanId}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/update-usage-plan-request {:payload nil, :headers {}, :uri {"usageplanId" "usagePlanId"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/usage-plan {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception}))
(clojure.spec.alpha/fdef update-usage-plan :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/update-usage-plan-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/usage-plan))

(clojure.core/defn get-sdk [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/restapis/{restapi_id}/stages/{stage_name}/sdks/{sdk_type}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-sdk-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "stage_name" "stageName", "sdk_type" "sdkType"}, :querystring {nil "parameters"}} 200 :portkey.aws.apigateway.-2015-07-09/sdk-response {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-sdk :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-sdk-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/sdk-response))

(clojure.core/defn put-method [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PUT" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/put-method-request {:payload nil, :headers {}, :uri {"resource_id" "resourceId", "http_method" "httpMethod", "restapi_id" "restApiId"}, :querystring {}} 201 :portkey.aws.apigateway.-2015-07-09/method {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef put-method :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/put-method-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/method))

(clojure.core/defn update-integration-response [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PATCH" "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration/responses/{status_code}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/update-integration-response-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "resource_id" "resourceId", "http_method" "httpMethod", "status_code" "statusCode"}, :querystring {}} nil :portkey.aws.apigateway.-2015-07-09/integration-response {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef update-integration-response :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/update-integration-response-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/integration-response))

(clojure.core/defn get-domain-names [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "GET" "/domainnames" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/get-domain-names-request {:payload nil, :headers {}, :uri {}, :querystring {"position" "position", "limit" "limit"}} nil :portkey.aws.apigateway.-2015-07-09/domain-names {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef get-domain-names :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/get-domain-names-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/domain-names))

(clojure.core/defn put-rest-api [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "PUT" "/restapis/{restapi_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/put-rest-api-request {:payload "body", :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {"mode" "mode", "failonwarnings" "failOnWarnings", nil "parameters"}} nil :portkey.aws.apigateway.-2015-07-09/rest-api {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception, "ConflictException" :portkey.aws.apigateway.-2015-07-09/conflict-exception}))
(clojure.spec.alpha/fdef put-rest-api :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/put-rest-api-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/rest-api))

(clojure.core/defn create-request-validator [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "POST" "/restapis/{restapi_id}/requestvalidators" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/create-request-validator-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId"}, :querystring {}} 201 :portkey.aws.apigateway.-2015-07-09/request-validator {"BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "LimitExceededException" :portkey.aws.apigateway.-2015-07-09/limit-exceeded-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef create-request-validator :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/create-request-validator-request) :ret (clojure.spec.alpha/and :portkey.aws.apigateway.-2015-07-09/request-validator))

(clojure.core/defn delete-deployment [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.apigateway.-2015-07-09/endpoints "DELETE" "/restapis/{restapi_id}/deployments/{deployment_id}" input__8278__auto__ :portkey.aws.apigateway.-2015-07-09/delete-deployment-request {:payload nil, :headers {}, :uri {"restapi_id" "restApiId", "deployment_id" "deploymentId"}, :querystring {}} 202 nil {"UnauthorizedException" :portkey.aws.apigateway.-2015-07-09/unauthorized-exception, "NotFoundException" :portkey.aws.apigateway.-2015-07-09/not-found-exception, "BadRequestException" :portkey.aws.apigateway.-2015-07-09/bad-request-exception, "TooManyRequestsException" :portkey.aws.apigateway.-2015-07-09/too-many-requests-exception}))
(clojure.spec.alpha/fdef delete-deployment :args (clojure.spec.alpha/tuple :portkey.aws.apigateway.-2015-07-09/delete-deployment-request))
