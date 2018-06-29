user 생성 
create user koscom identified by koscom;

권한부여 
grant connect, resource to koscom; 

koscom user 접속
conn koscom/koscom

테이블 생성 
careate table member(
id varchar2(10) primary key, 
name varchar2(15) not null,
password varchar2(4) not null,
email varchar2(30) not null,
reg_date date);

  
Member 입력 
insert into member values ('carami','강경미','1234','carami@nate.com',sysdate);