package xyz.itwill.dto;

/*
create table review(review_num number primary key, review_member_num number constraint 
    review_member_num_fk references member(member_num), review_subject varchar2(500)
    , review_content varchar2(4000), review_image varchar2(100), review_register_date date
    , review_update_date date, review_ip varchar2(20), review_count number, review_ref number
    , review_restep number , review_relevel number, review_status number(1));
   
create sequence review_seq; 
*/

/*
이름                   널?       유형             
-------------------- -------- -------------- 
REVIEW_NUM           NOT NULL NUMBER         - 글번호         
REVIEW_MEMBER_NUM             NUMBER         - 작성자 : 로그인 사용자의 회원번호
REVIEW_SUBJECT                VARCHAR2(500)  
REVIEW_CONTENT                VARCHAR2(4000) 
REVIEW_IMAGE                  VARCHAR2(100)  
REVIEW_REGISTER_DATE          DATE           
REVIEW_UPDATE_DATE            DATE           
REVIEW_COUNT                  NUMBER         
REVIEW_REF                    NUMBER         
REVIEW_RESTEP                 NUMBER         
REVIEW_RELEVEL                NUMBER         
REVIEW_STATUS                 NUMBER(1)   
*/

public class ReviewDTO {

}
