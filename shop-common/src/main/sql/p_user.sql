-- ----------------------------
-- Table structure for p_user
-- ----------------------------
DROP TABLE IF EXISTS "public"."p_user";
CREATE TABLE "public"."p_user"
(
    "u_id"        serial                                      NOT NULL,
    "u_name"      varchar(255)                                NOT NULL,
    "u_password"  varchar(255)                                NOT NULL,
    "u_telphone"  varchar(255)
);
COMMENT ON COLUMN "public"."p_user"."u_id" IS 'ID，主键';
COMMENT ON COLUMN "public"."p_user"."u_name" IS '用户id';
COMMENT ON COLUMN "public"."p_user"."u_password" IS '用户name';
COMMENT ON COLUMN "public"."p_user"."u_password" IS '用户密码';
COMMENT ON COLUMN "public"."p_user"."u_telphone" IS '用户联系方式';

ALTER TABLE "public"."p_user" ADD CONSTRAINT "p_user_pkey" PRIMARY KEY ("u_id");

-- ----------------------------
-- insert
-- ----------------------------
INSERT INTO "public"."p_user" VALUES(10001,'feilis1','feilis1','15291858911');
INSERT INTO "public"."p_user" VALUES(10002,'feilis2','feilis2','15291858911');
INSERT INTO "public"."p_user" VALUES(10003,'feilis3','feilis3','15291858911');