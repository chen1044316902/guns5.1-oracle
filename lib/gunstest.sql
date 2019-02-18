-----------------------------------------------------
-- Export file for user GUNSTEST                   --
-- Created by Administrator on 2019/2/12, 14:27:52 --
-----------------------------------------------------

set define off
spool gunstest.log

prompt
prompt Creating table CHENCHAO
prompt =======================
prompt
create table GUNSTEST.CHENCHAO
(
  id          VARCHAR2(50) not null,
  name        VARCHAR2(50),
  description VARCHAR2(300),
  create_time TIMESTAMP(6),
  dept_id     VARCHAR2(50),
  login_user  VARCHAR2(50),
  user_name   VARCHAR2(50)
)
tablespace GUNSTEST
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
comment on table GUNSTEST.CHENCHAO
  is '������Ϣ';
comment on column GUNSTEST.CHENCHAO.id
  is 'ID';
comment on column GUNSTEST.CHENCHAO.name
  is 'NAME';
comment on column GUNSTEST.CHENCHAO.description
  is 'DESC';
comment on column GUNSTEST.CHENCHAO.create_time
  is '����ʱ��';
comment on column GUNSTEST.CHENCHAO.dept_id
  is '����ID';
comment on column GUNSTEST.CHENCHAO.login_user
  is '��½�û�';
comment on column GUNSTEST.CHENCHAO.user_name
  is '�û���';
alter table GUNSTEST.CHENCHAO
  add constraint ID_PK primary key (ID)
  using index 
  tablespace GUNSTEST
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table CODE_DBINFO
prompt ==========================
prompt
create table GUNSTEST.CODE_DBINFO
(
  id           NUMBER(10) not null,
  name         NVARCHAR2(20),
  db_driver    NVARCHAR2(100),
  db_url       NVARCHAR2(200),
  db_user_name NVARCHAR2(100),
  db_password  NVARCHAR2(100),
  db_type      NVARCHAR2(10),
  create_time  TIMESTAMP(6),
  update_time  TIMESTAMP(6)
)
tablespace GUNSTEST
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table JCZX_CHKBILL_MES
prompt ===============================
prompt
create table GUNSTEST.JCZX_CHKBILL_MES
(
  gid              VARCHAR2(32) not null,
  code             VARCHAR2(50) not null,
  dispatch_code    VARCHAR2(200) not null,
  product_name     VARCHAR2(64) not null,
  produ_uid        VARCHAR2(50) not null,
  op_name          VARCHAR2(50) not null,
  op_code          VARCHAR2(50) not null,
  workstation_code VARCHAR2(50) not null,
  result           NUMBER(1),
  citem_code       VARCHAR2(50) not null,
  citem_name       VARCHAR2(100) not null,
  citem_remark     VARCHAR2(200),
  check_model      NUMBER(1) not null,
  standard_value   NUMBER(18,5),
  min_value        NUMBER(18,5),
  max_value        NUMBER(18,5),
  chk_value        VARCHAR2(200),
  chk_result       NUMBER(1),
  remark           VARCHAR2(200),
  processer        VARCHAR2(32) not null,
  process_date     TIMESTAMP(6) not null,
  special_code     VARCHAR2(100),
  check_group      VARCHAR2(100),
  flag             NUMBER,
  file_content     BLOB
)
tablespace JC_DATA
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
comment on table GUNSTEST.JCZX_CHKBILL_MES
  is '�Լ�������(�����������)';
comment on column GUNSTEST.JCZX_CHKBILL_MES.gid
  is '�Լ�������';
comment on column GUNSTEST.JCZX_CHKBILL_MES.code
  is '��ⵥ�ݺ�';
comment on column GUNSTEST.JCZX_CHKBILL_MES.dispatch_code
  is '�ɹ������';
comment on column GUNSTEST.JCZX_CHKBILL_MES.product_name
  is '��Ʒ����';
comment on column GUNSTEST.JCZX_CHKBILL_MES.produ_uid
  is '��Ʒ����';
comment on column GUNSTEST.JCZX_CHKBILL_MES.op_name
  is '��������';
comment on column GUNSTEST.JCZX_CHKBILL_MES.op_code
  is '������';
comment on column GUNSTEST.JCZX_CHKBILL_MES.workstation_code
  is '��λ���';
comment on column GUNSTEST.JCZX_CHKBILL_MES.result
  is '���ݼ����(0δ�ж���1���ϸ�7�ϸ�)';
comment on column GUNSTEST.JCZX_CHKBILL_MES.citem_code
  is '��������';
comment on column GUNSTEST.JCZX_CHKBILL_MES.citem_name
  is '���������';
comment on column GUNSTEST.JCZX_CHKBILL_MES.citem_remark
  is '�����˵��';
comment on column GUNSTEST.JCZX_CHKBILL_MES.check_model
  is '���������(0���Լ��1�������2װ����Ϣ)';
comment on column GUNSTEST.JCZX_CHKBILL_MES.standard_value
  is '��׼ֵ��1������⣩';
comment on column GUNSTEST.JCZX_CHKBILL_MES.min_value
  is '�������ޣ�1������⣩';
comment on column GUNSTEST.JCZX_CHKBILL_MES.max_value
  is '�������ޣ�1������⣩';
comment on column GUNSTEST.JCZX_CHKBILL_MES.chk_value
  is '�������ޣ�1������⣩';
comment on column GUNSTEST.JCZX_CHKBILL_MES.chk_result
  is '�������ޣ�1������⣩';
comment on column GUNSTEST.JCZX_CHKBILL_MES.remark
  is '��ע��2װ����Ϣ-��д���кţ�';
comment on column GUNSTEST.JCZX_CHKBILL_MES.processer
  is '�����˹���';
comment on column GUNSTEST.JCZX_CHKBILL_MES.process_date
  is '����ʱ��';
comment on column GUNSTEST.JCZX_CHKBILL_MES.special_code
  is '�������';
comment on column GUNSTEST.JCZX_CHKBILL_MES.check_group
  is '��������';
comment on column GUNSTEST.JCZX_CHKBILL_MES.flag
  is '��־λ';

prompt
prompt Creating table SYS_DEPT
prompt =======================
prompt
create table GUNSTEST.SYS_DEPT
(
  id         NUMBER(11) not null,
  num        NUMBER(11),
  pid        NUMBER(11),
  pids       VARCHAR2(255),
  simplename VARCHAR2(45),
  fullname   VARCHAR2(255),
  tips       VARCHAR2(255),
  version    NUMBER(11)
)
tablespace GUNSTEST
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table GUNSTEST.SYS_DEPT
  add primary key (ID)
  using index 
  tablespace GUNSTEST
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table SYS_DICT
prompt =======================
prompt
create table GUNSTEST.SYS_DICT
(
  id   NUMBER(11) not null,
  num  NUMBER(11),
  pid  NUMBER(11),
  name VARCHAR2(255),
  tips VARCHAR2(255),
  code VARCHAR2(255)
)
tablespace GUNSTEST
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table GUNSTEST.SYS_DICT
  add primary key (ID)
  using index 
  tablespace GUNSTEST
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table SYS_EXPENSE
prompt ==========================
prompt
create table GUNSTEST.SYS_EXPENSE
(
  id         NUMBER(11) not null,
  money      NUMBER(20,2),
  detial     VARCHAR2(255) default '',
  createtime DATE,
  state      NUMBER(11),
  userid     NUMBER(11),
  processid  VARCHAR2(255)
)
tablespace GUNSTEST
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table GUNSTEST.SYS_EXPENSE
  add primary key (ID)
  using index 
  tablespace GUNSTEST
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table SYS_LOGIN_LOG
prompt ============================
prompt
create table GUNSTEST.SYS_LOGIN_LOG
(
  id         NUMBER(11) not null,
  logname    VARCHAR2(255),
  userid     NUMBER(11),
  createtime DATE,
  succeed    VARCHAR2(255),
  message    CLOB,
  ip         VARCHAR2(255)
)
tablespace GUNSTEST
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table GUNSTEST.SYS_LOGIN_LOG
  add primary key (ID)
  using index 
  tablespace GUNSTEST
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table SYS_MENU
prompt =======================
prompt
create table GUNSTEST.SYS_MENU
(
  id     NUMBER(20) not null,
  code   VARCHAR2(255),
  pcode  VARCHAR2(255),
  pcodes VARCHAR2(255),
  name   VARCHAR2(255),
  icon   VARCHAR2(255),
  url    VARCHAR2(255),
  num    NUMBER(11),
  levels NUMBER(11),
  ismenu NUMBER(11),
  tips   VARCHAR2(255),
  status NUMBER(11),
  isopen NUMBER(11)
)
tablespace GUNSTEST
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table GUNSTEST.SYS_MENU
  add primary key (ID)
  using index 
  tablespace GUNSTEST
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table SYS_NOTICE
prompt =========================
prompt
create table GUNSTEST.SYS_NOTICE
(
  id         NUMBER(11) not null,
  title      VARCHAR2(255),
  type       NUMBER(11),
  content    CLOB,
  createtime DATE,
  creater    NUMBER(11)
)
tablespace GUNSTEST
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table GUNSTEST.SYS_NOTICE
  add primary key (ID)
  using index 
  tablespace GUNSTEST
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table SYS_OPERATION_LOG
prompt ================================
prompt
create table GUNSTEST.SYS_OPERATION_LOG
(
  id         NUMBER(20) not null,
  logtype    VARCHAR2(255),
  logname    VARCHAR2(255),
  userid     NUMBER(20),
  classname  VARCHAR2(255),
  method     CLOB,
  createtime DATE,
  succeed    VARCHAR2(255),
  message    CLOB
)
tablespace GUNSTEST
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table GUNSTEST.SYS_OPERATION_LOG
  add primary key (ID)
  using index 
  tablespace GUNSTEST
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table SYS_RELATION
prompt ===========================
prompt
create table GUNSTEST.SYS_RELATION
(
  id     NUMBER(20) not null,
  menuid NUMBER(20),
  roleid NUMBER(11)
)
tablespace GUNSTEST
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table GUNSTEST.SYS_RELATION
  add primary key (ID)
  using index 
  tablespace GUNSTEST
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table SYS_ROLE
prompt =======================
prompt
create table GUNSTEST.SYS_ROLE
(
  id      NUMBER(11) not null,
  num     NUMBER(11),
  pid     NUMBER(11),
  name    VARCHAR2(255),
  deptid  NUMBER(11),
  tips    VARCHAR2(255),
  version NUMBER(11)
)
tablespace GUNSTEST
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table GUNSTEST.SYS_ROLE
  add primary key (ID)
  using index 
  tablespace GUNSTEST
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table SYS_USER
prompt =======================
prompt
create table GUNSTEST.SYS_USER
(
  id         NUMBER(11) not null,
  avatar     VARCHAR2(255),
  account    VARCHAR2(45),
  password   VARCHAR2(45),
  salt       VARCHAR2(45),
  name       VARCHAR2(45),
  birthday   DATE,
  sex        NUMBER(11),
  email      VARCHAR2(45),
  phone      VARCHAR2(45),
  roleid     VARCHAR2(255),
  deptid     NUMBER(11),
  status     NUMBER(11),
  createtime DATE,
  version    NUMBER(11)
)
tablespace GUNSTEST
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );
alter table GUNSTEST.SYS_USER
  add primary key (ID)
  using index 
  tablespace GUNSTEST
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating sequence GUNSIDSEQ
prompt ===========================
prompt
create sequence GUNSTEST.GUNSIDSEQ
minvalue 1
maxvalue 999999999999999999999999999
start with 13340
increment by 1
cache 20;

prompt
prompt Creating sequence MENUSEQ
prompt =========================
prompt
create sequence GUNSTEST.MENUSEQ
minvalue 1
maxvalue 100000000000000000000
start with 280
increment by 1
cache 20;

prompt
prompt Creating trigger SYS_DEPT_TRIGGER
prompt =================================
prompt
create or replace trigger GUNSTEST.SYS_DEPT_trigger
before insert on SYS_DEPT
for each row
when (new.id is null)
begin
  select gunsIdSeq.nextval into:NEW.ID from dual;
end;
/

prompt
prompt Creating trigger SYS_DICT_TRIGGER
prompt =================================
prompt
create or replace trigger GUNSTEST.SYS_DICT_trigger
before insert on SYS_DICT
for each row
when (new.id is null)
begin
  select gunsIdSeq.nextval into:NEW.ID from dual;
end;
/

prompt
prompt Creating trigger SYS_LOGIN_LOG_TRIGGER
prompt ======================================
prompt
create or replace trigger GUNSTEST.sys_login_log_trigger
before insert on sys_login_log
for each row
when (new.id is null)
begin
  select gunsIdSeq.nextval into:NEW.ID from dual;
end;
/

prompt
prompt Creating trigger SYS_NOTICE_TRIGGER
prompt ===================================
prompt
create or replace trigger GUNSTEST.SYS_NOTICE_trigger
before insert on SYS_NOTICE
for each row
when (new.id is null)
begin
  select gunsIdSeq.nextval into:NEW.ID from dual;
end;
/

prompt
prompt Creating trigger SYS_OPERATION_LOG_TRIGGER
prompt ==========================================
prompt
create or replace trigger GUNSTEST.SYS_OPERATION_LOG_trigger
before insert on SYS_OPERATION_LOG
for each row
when (new.id is null)
begin
  select gunsIdSeq.nextval into:NEW.ID from dual;
end;
/

prompt
prompt Creating trigger SYS_RELATION_TRIGGER
prompt =====================================
prompt
create or replace trigger GUNSTEST.SYS_RELATION_TRIGGER
before insert on SYS_RELATION
for each row
when (new.id is null)
begin
  select gunsIdSeq.nextval into:NEW.ID from dual;
end;
/

prompt
prompt Creating trigger SYS_ROLE_TRIGGER
prompt =================================
prompt
create or replace trigger GUNSTEST.SYS_ROLE_trigger
before insert on SYS_ROLE
for each row
when (new.id is null)
begin
  select gunsIdSeq.nextval into:NEW.ID from dual;
end;
/

prompt
prompt Creating trigger SYS_USER_TRIGGER
prompt =================================
prompt
create or replace trigger GUNSTEST.SYS_USER_trigger
before insert on SYS_USER
for each row
when (new.id is null)
begin
  select gunsIdSeq.nextval into:NEW.ID from dual;
end;
/


spool off
