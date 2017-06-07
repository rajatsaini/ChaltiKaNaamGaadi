--------------------------------------------------------
--  File created - Tuesday-June-06-2017   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table USERBASE
--------------------------------------------------------

  CREATE TABLE "HR"."USERBASE" 
   (	"NAME" VARCHAR2(4000 BYTE), 
	"EMAIL" VARCHAR2(4000 BYTE), 
	"PASS" VARCHAR2(4000 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table TRAINS
--------------------------------------------------------

  CREATE TABLE "HR"."TRAINS" 
   (	"TRAIN_NO" NUMBER(5,0), 
	"TRAIN_NAME" VARCHAR2(40 BYTE), 
	"SOURCE" VARCHAR2(20 BYTE), 
	"DESTINATION" VARCHAR2(20 BYTE), 
	"TICKET_PRICE" NUMBER(8,2)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into HR.USERBASE
SET DEFINE OFF;
Insert into HR.USERBASE (NAME,EMAIL,PASS) values ('ixabhay','ixabhay@gmail.com','abhay123singh');
Insert into HR.USERBASE (NAME,EMAIL,PASS) values ('tazimul','tazimul@gmail.com','123');
Insert into HR.USERBASE (NAME,EMAIL,PASS) values ('eff','email@example.com','pass');
Insert into HR.USERBASE (NAME,EMAIL,PASS) values ('eff','IXABHAY','pass');
Insert into HR.USERBASE (NAME,EMAIL,PASS) values ('prem',null,'abhay');
Insert into HR.USERBASE (NAME,EMAIL,PASS) values ('eforeff','ixabhay@gmail.com','pass');
Insert into HR.USERBASE (NAME,EMAIL,PASS) values ('jforjatin','ix','pass');
Insert into HR.USERBASE (NAME,EMAIL,PASS) values ('u','xyz','p');
Insert into HR.USERBASE (NAME,EMAIL,PASS) values ('rajesh','raj@gmmail.com','abhay123singh');
Insert into HR.USERBASE (NAME,EMAIL,PASS) values ('faizan','faizan@gmail.com','abhay123singh');
Insert into HR.USERBASE (NAME,EMAIL,PASS) values ('jatin','jaitn@gmai.com','abhay123singh');
REM INSERTING into HR.TRAINS
SET DEFINE OFF;
Insert into HR.TRAINS (TRAIN_NO,TRAIN_NAME,SOURCE,DESTINATION,TICKET_PRICE) values (1001,'Shatabdi Express','Bangalore','Delhi',2500);
Insert into HR.TRAINS (TRAIN_NO,TRAIN_NAME,SOURCE,DESTINATION,TICKET_PRICE) values (1002,'Shatabdi Express','Delhi','Bangalore',2500);
Insert into HR.TRAINS (TRAIN_NO,TRAIN_NAME,SOURCE,DESTINATION,TICKET_PRICE) values (1003,'Udyan Express','Bangalore','Mumbai',1500);
Insert into HR.TRAINS (TRAIN_NO,TRAIN_NAME,SOURCE,DESTINATION,TICKET_PRICE) values (1004,'Udyan Express','Mumbai','Bangalore',1500);
Insert into HR.TRAINS (TRAIN_NO,TRAIN_NAME,SOURCE,DESTINATION,TICKET_PRICE) values (1005,'Brindavan Express','Bangalore','Chennai',1000);
Insert into HR.TRAINS (TRAIN_NO,TRAIN_NAME,SOURCE,DESTINATION,TICKET_PRICE) values (1006,'Brindavan Express','Chennai','Bangalore',1000);
--------------------------------------------------------
--  DDL for Index SYS_C007162
--------------------------------------------------------

  CREATE UNIQUE INDEX "HR"."SYS_C007162" ON "HR"."TRAINS" ("TRAIN_NO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table TRAINS
--------------------------------------------------------

  ALTER TABLE "HR"."TRAINS" ADD PRIMARY KEY ("TRAIN_NO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
