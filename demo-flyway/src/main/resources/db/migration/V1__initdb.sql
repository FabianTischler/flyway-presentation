CREATE TABLE FW_BOOKS
(
    FW_ID   BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
    FW_NAME VARCHAR(255),
    CONSTRAINT pk_fw_books PRIMARY KEY (FW_ID)
);