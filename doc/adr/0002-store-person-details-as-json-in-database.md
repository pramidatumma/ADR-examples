# 2. Store Person details as JSON in Database

Date: 2020-07-28

## Status

Accepted

## Context

Currently we are not yet sure of what all gets captured as part of Person details. But, we need to store them in out Relational database

## Decision

Use JSON field to capture all the Person details

## Consequences

This will make it easier to capture any details of a person.
The fetching and storing will be easier.
This will make it complex to search for fields within the Person details
We may have to add migrations to port this data once the Person details fields are finalized