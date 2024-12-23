-- !Ups

CREATE TYPE TEST AS STRUCT(
    test STRING,
    test2 TIMESTAMP
);

-- !Downs

DROP TYPE TEST;