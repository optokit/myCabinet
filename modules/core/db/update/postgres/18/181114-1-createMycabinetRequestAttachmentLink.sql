create table MYCABINET_REQUEST_ATTACHMENT_LINK (
    REQUEST_ID uuid,
    ATTACHMENT_ID uuid,
    primary key (REQUEST_ID, ATTACHMENT_ID)
);
