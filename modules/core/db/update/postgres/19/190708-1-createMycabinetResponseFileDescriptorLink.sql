create table MYCABINET_RESPONSE_FILE_DESCRIPTOR_LINK (
    RESPONSE_ID uuid,
    FILE_DESCRIPTOR_ID uuid,
    primary key (RESPONSE_ID, FILE_DESCRIPTOR_ID)
);
