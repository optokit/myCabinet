alter table MYCABINET_ATTACHMENT add constraint FK_MYCABINET_ATTACHMENT_RESPONSE foreign key (RESPONSE_ID) references MYCABINET_RESPONSE(ID);
create index IDX_MYCABINET_ATTACHMENT_RESPONSE on MYCABINET_ATTACHMENT (RESPONSE_ID);
