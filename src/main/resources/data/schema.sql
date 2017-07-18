

CREATE TABLE IF NOT EXISTS category (
id int primary key,
name varchar(255) 
);




-- ----------------------------
-- Table structure for articles
-- ----------------------------

CREATE TABLE IF NOT EXISTS articles (
id int primary key,
title varchar(255) NOT NULL,
description varchar(255) NOT NULL,
author varchar(255) NOT NULL,
thumbnail varchar(255) NOT NULL,
category_id int,Foreign key (category_id)  REFERENCES category(id)
);





-- ----------------------------
-- Table structure for users
-- ----------------------------

CREATE TABLE IF NOT EXISTS  users (
uid int primary key,
username varchar(255),
password varchar(255) ,
status boolean
);







-- ----------------------------
-- Table structure for roles
-- ----------------------------

CREATE TABLE IF NOT EXISTS roles (
rid int  primary key,
role varchar(255)
);






-- ----------------------------
-- Table structure for user_role
-- ----------------------------

CREATE TABLE IF NOT EXISTS user_role (
uid int REFERENCES users (uid),
rid int REFERENCES roles (rid),
Foreign key (uid)  REFERENCES users(uid),
Foreign key (rid)  REFERENCES roles(rid)
);








