create table userdata(
                         id int not null auto_increment,
                         username varchar(255) not null,
                         birthday date,
                         sex char(1),
                         address varchar(1000),
                         primary key (id)
) ENGINE=INNODB auto_increment=1 DEFAULT CHARSET=utf8;

select * from userdata where id=1;

insert into userdata (username,sex,address)  values('john','1','xxxxx');
insert into userdata (username,sex,address)  values('tom','2','xxxxx');
insert into userdata (username,sex,address)  values('lucy','1','xxxxx');