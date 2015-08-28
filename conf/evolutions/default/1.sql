# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table note (
  id                        varchar(255) not null,
  message                   TEXT,
  create_time               timestamp,
  user_id                   varchar(255),
  constraint pk_note primary key (id))
;

create table session (
  id                        varchar(255) not null,
  ip_address                varchar(255),
  location                  varchar(255),
  since                     bigint,
  user_id                   varchar(255),
  constraint pk_session primary key (id))
;

create table user (
  id                        varchar(255) not null,
  name                      varchar(255),
  email                     varchar(255),
  password_digest           varchar(255),
  constraint uq_user_email unique (email),
  constraint pk_user primary key (id))
;

create sequence note_seq;

create sequence session_seq;

create sequence user_seq;

alter table note add constraint fk_note_user_1 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_note_user_1 on note (user_id);
alter table session add constraint fk_session_user_2 foreign key (user_id) references user (id) on delete restrict on update restrict;
create index ix_session_user_2 on session (user_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists note;

drop table if exists session;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists note_seq;

drop sequence if exists session_seq;

drop sequence if exists user_seq;

