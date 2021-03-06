(ns portkey.aws.firehose.-2015-08-04 (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "firehose", :region "eu-west-1"},
    :ssl-common-name "firehose.eu-west-1.amazonaws.com",
    :endpoint "https://firehose.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "firehose", :region "us-west-2"},
    :ssl-common-name "firehose.us-west-2.amazonaws.com",
    :endpoint "https://firehose.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "firehose", :region "us-east-1"},
    :ssl-common-name "firehose.us-east-1.amazonaws.com",
    :endpoint "https://firehose.us-east-1.amazonaws.com",
    :signature-version :v4}})

(comment TODO support "json")
