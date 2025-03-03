CREATE TABLESPACE "JARDINERIA" LOGGING 
DATAFILE 'C:\oraclexe\app\oracle\oradata\XE\JARDINERIA.dbf' SIZE 24M 
EXTENT MANAGEMENT LOCAL SEGMENT SPACE MANAGEMENT AUTO;


DROP USER jardineria CASCADE;

CREATE USER jardineria IDENTIFIED BY jardineria
       DEFAULT TABLESPACE JARDINERIA  
       TEMPORARY TABLESPACE temp
       ACCOUNT UNLOCK;

GRANT "DBA" TO jardineria;
GRANT "CONNECT" TO jardineria;
GRANT "RESOURCE" TO jardineria;

GRANT ALTER ANY INDEX TO jardineria;
GRANT ALTER ANY SEQUENCE TO jardineria;
GRANT ALTER ANY TABLE TO jardineria;
GRANT ALTER ANY TRIGGER TO jardineria;
GRANT CREATE ANY INDEX TO jardineria;
GRANT CREATE ANY SEQUENCE TO jardineria;
GRANT CREATE ANY SYNONYM TO jardineria;
GRANT CREATE ANY TABLE TO jardineria;
GRANT CREATE ANY TRIGGER TO jardineria;
GRANT CREATE ANY VIEW TO jardineria;
GRANT CREATE PROCEDURE TO jardineria;
GRANT CREATE PUBLIC SYNONYM TO jardineria;
GRANT CREATE TRIGGER TO jardineria;
GRANT CREATE VIEW TO jardineria;
GRANT DELETE ANY TABLE TO jardineria;
GRANT DROP ANY INDEX TO jardineria;
GRANT DROP ANY SEQUENCE TO jardineria;
GRANT DROP ANY TABLE TO jardineria;