CREATE DATABASE AMD;


-- ----------------------------
-- Table structure for articles
-- ----------------------------
DROP TABLE IF EXISTS "articles";
CREATE TABLE "articles" (
"id" int4 primary key,
"title" varchar(255) COLLATE "default" NOT NULL,
"description" varchar(255) COLLATE "default" NOT NULL,
"author" varchar(255) COLLATE "default" NOT NULL,
"thumbnail" varchar(255) COLLATE "default" NOT NULL,
"category_id" int4 REFERENCES "category" ("id")
)
WITH (OIDS=FALSE)

;



-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS "category";
CREATE TABLE "category" (
"id" int4 primary key,
"name" varchar COLLATE "default"
)
WITH (OIDS=FALSE)

;


-- ----------------------------
-- Table structure for roles
-- ----------------------------
DROP TABLE IF EXISTS "roles";
CREATE TABLE "roles" (
"rid" int4 DEFAULT nextval('roles_rid_seq'::regclass) primary key,
"role" varchar COLLATE "default"
)
WITH (OIDS=FALSE)

;



-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS "user_role";
CREATE TABLE "user_role" (
"uid" int4 REFERENCES "users" ("uid"),
"rid" int4 REFERENCES "roles" ("rid")
)
WITH (OIDS=FALSE)

;


-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS "users";
CREATE TABLE "users" (
"uid" int4 DEFAULT nextval('users_uid_seq'::regclass) primary key,
"username" varchar COLLATE "default",
"password" varchar COLLATE "default",
"status" bool
)
WITH (OIDS=FALSE)

;



