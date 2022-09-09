-- ----------------------------
-- Table structure for p_order
-- ----------------------------
DROP TABLE IF EXISTS "public"."p_order";
CREATE TABLE "public"."p_order"
(
    "o_id"    serial                                      NOT NULL,
    "u_id"    int4                                        NOT NULL,
    "p_id"    int4                                        NOT NULL,
    "p_stock" float                                       NOT NULL
);
COMMENT ON COLUMN "public"."p_order"."o_id" IS 'ID，主键';
COMMENT ON COLUMN "public"."p_order"."u_id" IS '用户id';
COMMENT ON COLUMN "public"."p_order"."p_id" IS '商品id';
COMMENT ON COLUMN "public"."p_order"."p_stock" IS '购买数量';

ALTER TABLE "public"."p_order" ADD CONSTRAINT "p_order_pkey" PRIMARY KEY ("o_id");

