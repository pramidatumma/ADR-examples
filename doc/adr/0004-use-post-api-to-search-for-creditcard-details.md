# 4. Use POST API to search for creditcard details

Date: 2020-07-28

## Status

Accepted

## Context

We need an end point to search for Credit Card details given a Credit Card number

## Decision

Instead of GET API, we will use POST API to search for a Credit Card details.

## Consequences

As the Credit Card number should be secure, we can't use the number in a GET URL.
Hence, we will have to use a POST API "creditCardSearch" instead. Thus, the credit card number will be sent in the Body which will be encrypted