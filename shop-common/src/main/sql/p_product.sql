-- ----------------------------
-- Table structure for file_tb
-- ----------------------------
DROP TABLE IF EXISTS "public"."p_product";
CREATE TABLE "public"."p_product"
(
    "p_id"    serial                                      NOT NULL,
    "p_name"  varchar(255)   NOT NULL,
    "p_price" int4  NOT NULL,
    "p_stock" float                                        NOT NULL,
);
COMMENT ON COLUMN "public"."p_product"."p_id" IS 'ID，主键';
COMMENT ON COLUMN "public"."p_product"."p_name" IS '商品名称';
COMMENT ON COLUMN "public"."p_product"."p_price" IS '商品价格';
COMMENT ON COLUMN "public"."p_product"."p_stock" IS '购买数量';

ALTER TABLE "public"."p_product" ADD CONSTRAINT "p_product_pkey" PRIMARY KEY ("p_id");

-- ----------------------------
-- insert
-- ----------------------------
INSERT INTO "public"."p_product" VALUES(1001,'小米',1000,5000);
INSERT INTO "public"."p_product" VALUES(1002,'华为',2000,5000);
INSERT INTO "public"."p_product" VALUES(1003,'苹果',3000,5000);
INSERT INTO "public"."p_product" VALUES(1004,'OPPO',4000,5000);