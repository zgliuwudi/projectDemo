select * from bank_card;
DROP TABLE IF EXISTS bank_card;
CREATE TABLE bank_card (
id int primary key auto_increment,
gmt_create timestamp DEFAULT CURRENT_TIMESTAMP,
gmt_update timestamp DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
card_no varchar(256)  DEFAULT '' COMMENT '卡号',
phone varchar(256) NOT NULL DEFAULT '' COMMENT '手机号',
name varchar(256) NOT NULL DEFAULT '' COMMENT '姓名',
id_no varchar(256) NOT NULL DEFAULT '' COMMENT '证件号'
);