/*
Navicat PGSQL Data Transfer

Source Server         : HRD
Source Server Version : 90309
Source Host           : localhost:5432
Source Database       : AMS
Source Schema         : public

Target Server Type    : PGSQL
Target Server Version : 90309
File Encoding         : 65001

Date: 2017-07-11 13:46:18
*/


-- ----------------------------
-- Sequence structure for roles_rid_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "roles_rid_seq";
CREATE SEQUENCE "roles_rid_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;

-- ----------------------------
-- Sequence structure for users_uid_seq
-- ----------------------------
DROP SEQUENCE IF EXISTS "users_uid_seq";
CREATE SEQUENCE "users_uid_seq"
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;

-- ----------------------------
-- Table structure for articles
-- ----------------------------
DROP TABLE IF EXISTS "articles";
CREATE TABLE "articles" (
"id" int4 NOT NULL,
"title" varchar(255) COLLATE "default" NOT NULL,
"description" varchar(255) COLLATE "default" NOT NULL,
"author" varchar(255) COLLATE "default" NOT NULL,
"thumbnail" varchar(255) COLLATE "default" NOT NULL,
"category_id" int4
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of articles
-- ----------------------------
BEGIN;
INSERT INTO "articles" VALUES ('2', 'Now Sleeps the Crimson Petal', '[Odit temporibus saepe iste et nostrum dolores corrupti.]', 'Kenya Huels MD', '/resources/images/9de86543-ec74-4ac3-bf16-410520c23e7c.jpg', '2');
INSERT INTO "articles" VALUES ('3', 'The Torment of Others', '[Atque reiciendis impedit sit beatae mollitia delectus.]', 'Mose Feil', 'http://lorempixel.com/1600/1200/fashion/', '1');
INSERT INTO "articles" VALUES ('4', 'The Mirror Crack''d from Side to Side', '[Autem eum corrupti pariatur omnis odit.]', 'Bernita Gerhold', 'http://lorempixel.com/g/1024/768/food/', '1');
INSERT INTO "articles" VALUES ('5', 'Stranger in a Strange Land', '[Numquam exercitationem adipisci rerum doloremque deserunt omnis occaecati.]', 'Garett Fadel', 'http://lorempixel.com/g/720/348/city/', '1');
INSERT INTO "articles" VALUES ('6', 'In Death Ground', '[Sed sit excepturi ut.]', 'Amely Lowe', 'http://lorempixel.com/g/640/350/nature/', '1');
INSERT INTO "articles" VALUES ('7', 'To Sail Beyond the Sunset', '[Labore eos dolorum.]', 'Hudson Jerde', 'http://lorempixel.com/1920/1200/animals/', '1');
INSERT INTO "articles" VALUES ('8', 'Clouds of Witness', '[Qui a rerum.]', 'Joesph Dare Sr.', 'http://lorempixel.com/g/640/200/nature/', '1');
INSERT INTO "articles" VALUES ('9', 'The Violent Bear It Away', '[Quia omnis qui qui veritatis quaerat ut.]', 'Wilford Sauer', 'http://lorempixel.com/1280/1024/food/', '1');
INSERT INTO "articles" VALUES ('10', 'Things Fall Apart', '[Labore animi quasi aut.]', 'Savanna Pagac', 'http://lorempixel.com/720/348/sports/', '1');
INSERT INTO "articles" VALUES ('11', 'The Parliament of Man', '[Nulla exercitationem quam a et.]', 'Elyse Ratke', 'http://lorempixel.com/1280/1024/abstract/', '1');
INSERT INTO "articles" VALUES ('12', 'Blue Remembered Earth', '[Quasi ullam exercitationem placeat illo illum.]', 'Bettie Durgan', 'http://lorempixel.com/g/1366/768/food/', '1');
INSERT INTO "articles" VALUES ('13', 'Beyond the Mexique Bay', '[In vero est autem eius.]', 'Dee Dach', 'http://lorempixel.com/1600/1200/animals/', '1');
INSERT INTO "articles" VALUES ('14', 'Nine Coaches Waiting', '[Facere id ratione recusandae quo.]', 'Barry Cartwright', 'http://lorempixel.com/g/640/480/food/', '1');
INSERT INTO "articles" VALUES ('15', 'Of Human Bondage', '[Veniam officiis non id quod.]', 'Ms. Mohammed Hane', 'http://lorempixel.com/640/350/animals/', '2');
INSERT INTO "articles" VALUES ('16', 'A Catskill Eagle', '[Quia quia eum.]', 'Dr. Tad Goodwin', 'http://lorempixel.com/g/1680/1050/city/', '2');
INSERT INTO "articles" VALUES ('17', 'Vanity Fair', '[At ipsam quis et laudantium quod accusantium in.]', 'Clemens Russel', 'http://lorempixel.com/1680/1050/nightlife/', '2');
INSERT INTO "articles" VALUES ('18', 'The House of Mirth', '[Eos esse enim ea corporis sit.]', 'Keara Waelchi', 'http://lorempixel.com/1024/768/abstract/', '2');
INSERT INTO "articles" VALUES ('19', 'To Sail Beyond the Sunset', '[Animi eos vel et.]', 'Miss Shaun Weber', 'http://lorempixel.com/1024/768/animals/', '2');
INSERT INTO "articles" VALUES ('20', 'Consider Phlebas', '[Perspiciatis vitae rem esse voluptatem.]', 'Miss Matteo Barrows', 'http://lorempixel.com/g/1280/1024/transport/', '2');
INSERT INTO "articles" VALUES ('22', 'Eyeless in Gaza', '[Soluta provident explicabo praesentium tempora.]', 'Ashlynn Jast', 'http://lorempixel.com/640/480/technics/', '2');
INSERT INTO "articles" VALUES ('24', 'Arms and the Man', '[Itaque ad id dolorem nam placeat molestiae qui.]', 'Mrs. Jermaine Okuneva', 'http://lorempixel.com/g/640/480/abstract/', '2');
INSERT INTO "articles" VALUES ('25', 'If Not Now, When?', '[Quis et quasi et architecto.]', 'Clair Oberbrunner', 'http://lorempixel.com/1366/768/fashion/', '2');
INSERT INTO "articles" VALUES ('26', 'A Monstrous Regiment of Women', '[Fuga sint omnis sint illo est.]', 'Ken Koch', 'http://lorempixel.com/g/640/480/people/', '2');
INSERT INTO "articles" VALUES ('28', 'A Darkling Plain', '[Quis blanditiis ut aut ut quasi iusto.]', 'Emile Wiza', 'http://lorempixel.com/640/480/business/', '2');
INSERT INTO "articles" VALUES ('30', 'The Way Through the Woods', '[Sed eius et.]', 'Abigail Borer', 'http://lorempixel.com/g/1680/1050/cats/', '2');
INSERT INTO "articles" VALUES ('31', 'The House of Mirth', '[Soluta sed animi nihil omnis repellendus.]', 'Cecile Mayer', 'http://lorempixel.com/1920/1200/transport/', '2');
INSERT INTO "articles" VALUES ('32', 'Infinite Jest', '[Qui doloribus expedita.]', 'Eino Cormier', 'http://lorempixel.com/640/200/nature/', '2');
INSERT INTO "articles" VALUES ('33', 'Antic Hay', '[Qui mollitia necessitatibus aliquid vel iure voluptate magni.]', 'Chaz Purdy', 'http://lorempixel.com/g/1600/1200/fashion/', '2');
INSERT INTO "articles" VALUES ('34', 'A Catskill Eagle', '[Iste possimus et.]', 'Virgie Fay', 'http://lorempixel.com/720/348/city/', '2');
INSERT INTO "articles" VALUES ('37', 'A Darkling Plain', '[Similique qui provident.]', 'Mrs. Frederique Von', 'http://lorempixel.com/g/1024/768/food/', '3');
INSERT INTO "articles" VALUES ('40', 'The Road Less Traveled', '[Magnam et animi minus ut ratione sit ratione.]', 'Nannie Lind', 'http://lorempixel.com/g/1366/768/animals/', '3');
INSERT INTO "articles" VALUES ('42', 'A Time to Kill', '[Vero aliquam adipisci eum.]', 'Kevon Schumm', 'http://lorempixel.com/g/640/200/sports/', '3');
INSERT INTO "articles" VALUES ('44', 'Those Barren Leaves, Thrones, Dominations', '[Corporis animi tenetur illum sit recusandae vel.]', 'Joanny Johns', 'http://lorempixel.com/g/1280/1024/animals/', '3');
INSERT INTO "articles" VALUES ('47', 'A Summer Bird-Cage', '[Sit dolor enim.]', 'Hunter Watsica', 'http://lorempixel.com/1280/1024/transport/', '4');
INSERT INTO "articles" VALUES ('48', 'Fear and Trembling', '[Tempora sed vitae.]', 'Felicita Lockman', 'http://lorempixel.com/g/640/480/animals/', '4');
INSERT INTO "articles" VALUES ('49', 'Consider the Lilies', '[Dolores sit voluptatem laudantium non sint et.]', 'Magali Nikolaus', 'http://lorempixel.com/g/1680/1050/cats/', '4');
INSERT INTO "articles" VALUES ('50', 'Frequent Hearses', '[Voluptatem natus minus vel consectetur temporibus nostrum.]', 'Ms. Johan McGlynn', 'http://lorempixel.com/g/1366/768/city/', '4');
INSERT INTO "articles" VALUES ('51', 'Look to Windward', '[Ipsa nesciunt numquam quidem aut.]', 'Alvah Legros', 'http://lorempixel.com/640/480/abstract/', '4');
INSERT INTO "articles" VALUES ('52', 'Françoise Sagan', '[Ullam nulla ad tempore ea sit.]', 'Evalyn Feeney', 'http://lorempixel.com/g/640/480/nightlife/', '4');
INSERT INTO "articles" VALUES ('53', 'Look to Windward', '[Hic qui qui inventore numquam voluptatem non est.]', 'Abdul Schmidt', 'http://lorempixel.com/640/200/business/', '4');
INSERT INTO "articles" VALUES ('54', 'A Time of Gifts', '[Soluta in dolorem.]', 'Scot Roberts', 'http://lorempixel.com/g/1920/1200/food/', '4');
INSERT INTO "articles" VALUES ('55', 'The Road Less Traveled', '[Minima soluta corporis excepturi.]', 'Velda Swift', 'http://lorempixel.com/1680/1050/city/', '4');
INSERT INTO "articles" VALUES ('56', 'The Way Through the Woods', '[Amet maxime amet adipisci dignissimos voluptates qui.]', 'Alanis Kemmer', 'http://lorempixel.com/g/1280/1024/food/', '4');
INSERT INTO "articles" VALUES ('57', 'By Grand Central Station I Sat Down and Wept', '[Voluptatum aut dolorem velit ipsa rerum.]', 'Kaleb Beatty III', 'http://lorempixel.com/1920/1200/city/', '4');
INSERT INTO "articles" VALUES ('58', 'Postern of Fate', '[Possimus odit possimus.]', 'Arielle Williamson', 'http://lorempixel.com/g/640/480/city/', '4');
INSERT INTO "articles" VALUES ('59', 'Number the Stars', '[Ut suscipit delectus.]', 'Haskell Steuber', 'http://lorempixel.com/g/1280/1024/city/', '4');
INSERT INTO "articles" VALUES ('60', 'To Your Scattered Bodies Go', '[Corporis modi nam tempora libero eveniet.]', 'Keyshawn Hickle II', 'http://lorempixel.com/g/1680/1050/transport/', '4');
INSERT INTO "articles" VALUES ('61', 'Fight my way to hell', 'cruel worrier fight till his last breath', 'Onyx T', '/resources/images/2567c604-a8f5-4758-851c-d910c5d50178.jpg', '2');
INSERT INTO "articles" VALUES ('62', 'Jame in fire', 'jame is a ghost rider. He''s on fire', 'Draco Maf.f', '/resources/images/675ae5b6-110b-4054-8343-18d35d50f307.jpg', '4');
INSERT INTO "articles" VALUES ('63', 'Hal jordon', 'Green space corp', 'J.Mark', '/resources/images/958906ed-26b7-4b66-b528-140541539568.jpg', '2');
INSERT INTO "articles" VALUES ('64', 'the peal Halmberk', 'World war 2 in Peal Halmberk port', 'Leanghour tang', '/resources/images/5230b89b-3699-4b6f-af0f-e517b3962954.jpg', '3');
INSERT INTO "articles" VALUES ('65', 'jame ji', 'actor', 'Hour', '/resources/images/a65f6710-eda8-45c9-b7af-8fcc76c8e955.jpg', '3');
INSERT INTO "articles" VALUES ('66', 'Joker', 'Aman against batman', 'Hour', '/resources/images/633b6ab6-696d-43be-b756-f78f830423fb.jpg', '2');
INSERT INTO "articles" VALUES ('67', 'Tom And Jerry', 'cat and mouse', 'Tommy', '/resources/images/1e24062c-f94c-4040-89dd-a83ca63509d0.jpg', '1');
INSERT INTO "articles" VALUES ('68', 'the mist', 'The monster of the mysterious island', 'hulk', '/resources/images/d3513834-5e02-47c8-901a-3aacdd677bf0.jpg', '1');
COMMIT;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS "category";
CREATE TABLE "category" (
"id" int4 NOT NULL,
"name" varchar COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of category
-- ----------------------------
BEGIN;
INSERT INTO "category" VALUES ('1', 'Poem');
INSERT INTO "category" VALUES ('2', 'Fiction');
INSERT INTO "category" VALUES ('3', 'War');
INSERT INTO "category" VALUES ('4', 'History');
COMMIT;

-- ----------------------------
-- Table structure for roles
-- ----------------------------
DROP TABLE IF EXISTS "roles";
CREATE TABLE "roles" (
"rid" int4 DEFAULT nextval('roles_rid_seq'::regclass) NOT NULL,
"role" varchar COLLATE "default"
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of roles
-- ----------------------------
BEGIN;
INSERT INTO "roles" VALUES ('1', 'ADMIN');
INSERT INTO "roles" VALUES ('2', 'USER');
COMMIT;

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS "user_role";
CREATE TABLE "user_role" (
"uid" int4,
"rid" int4
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of user_role
-- ----------------------------
BEGIN;
INSERT INTO "user_role" VALUES ('1', '1');
INSERT INTO "user_role" VALUES ('2', '2');
COMMIT;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS "users";
CREATE TABLE "users" (
"uid" int4 DEFAULT nextval('users_uid_seq'::regclass) NOT NULL,
"username" varchar COLLATE "default",
"password" varchar COLLATE "default",
"status" bool
)
WITH (OIDS=FALSE)

;

-- ----------------------------
-- Records of users
-- ----------------------------
BEGIN;
INSERT INTO "users" VALUES ('1', 'leanghour', 'codehour', 't');
INSERT INTO "users" VALUES ('2', 'spector', 'codeghost', 't');
COMMIT;

-- ----------------------------
-- Alter Sequences Owned By 
-- ----------------------------
ALTER SEQUENCE "roles_rid_seq" OWNED BY "roles"."rid";
ALTER SEQUENCE "users_uid_seq" OWNED BY "users"."uid";

-- ----------------------------
-- Primary Key structure for table articles
-- ----------------------------
ALTER TABLE "articles" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table category
-- ----------------------------
ALTER TABLE "category" ADD PRIMARY KEY ("id");

-- ----------------------------
-- Primary Key structure for table roles
-- ----------------------------
ALTER TABLE "roles" ADD PRIMARY KEY ("rid");

-- ----------------------------
-- Primary Key structure for table users
-- ----------------------------
ALTER TABLE "users" ADD PRIMARY KEY ("uid");

-- ----------------------------
-- Foreign Key structure for table "articles"
-- ----------------------------
ALTER TABLE "articles" ADD FOREIGN KEY ("category_id") REFERENCES "category" ("id") ON DELETE NO ACTION ON UPDATE NO ACTION;

-- ----------------------------
-- Foreign Key structure for table "user_role"
-- ----------------------------
ALTER TABLE "user_role" ADD FOREIGN KEY ("uid") REFERENCES "users" ("uid") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "user_role" ADD FOREIGN KEY ("rid") REFERENCES "roles" ("rid") ON DELETE NO ACTION ON UPDATE NO ACTION;
