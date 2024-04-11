create table tbl_board(
bno number(10, 0),
title varchar2(200) not null,
content varchar2(2000) not null,
writer varchar2(50) not null,
regdate date default sysdate, -- 작성일
updatedate date default sysdate  -- 수정일
);

alter table tbl_board add constraint pk_board primary key(bno);

create SEQUENCE seq_board;

insert into TBL_BOARD(bno, title, content, writer)
values(seq_board.nextval, '테스트제목', '테스트내용', 'user00');

commit;

select * from TBL_BOARD;

select seq_board.currval from dual; --시퀀스 조회
