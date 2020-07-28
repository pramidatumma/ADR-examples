# 3. Use H2 Db for Integration tests

Date: 2020-07-28

## Status

Accepted

## Context

The Integration tests are crrently using Postgres database in system. Developers have to install Postgres in their machines. We either make Postgres as part of our Docker or use H2

## Decision

Start using H2 DB for integration tests.

## Consequences

We may have to rewrite some of our existing integration tests