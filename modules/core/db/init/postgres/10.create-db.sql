-- begin SEC_USER
alter table SEC_USER add column BIRTHDAY date ^
alter table SEC_USER add column PHONE_NUMBER varchar(500) ^
alter table SEC_USER add column ORGANIZATION_NAME varchar(600) ^
alter table SEC_USER add column ACTIVITY_TYPE varchar(1000) ^
alter table SEC_USER add column LEGAL_ADDRESS varchar(600) ^
alter table SEC_USER add column ACTUAL_ADDRESS varchar(600) ^
alter table SEC_USER add column BUSINESS_CATEGORY varchar(50) ^
alter table SEC_USER add column MANUFACTURER_LEGAL_ADRESS varchar(255) ^
alter table SEC_USER add column FIRM_AGE integer ^
alter table SEC_USER add column PRODUCTION_VOLUME varchar(600) ^
alter table SEC_USER add column USER_TYPE varchar(50) ^
alter table SEC_USER add column GOODS_CATEGORY varchar(600) ^
alter table SEC_USER add column DTYPE varchar(100) ^
update SEC_USER set DTYPE = 'sec$User' where DTYPE is null ^
-- end SEC_USER
