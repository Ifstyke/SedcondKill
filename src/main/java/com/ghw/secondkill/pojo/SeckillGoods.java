package com.ghw.secondkill.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 秒杀商品表
 * </p>
 *
 * @author 作者
 * @since 2022-04-30
 */
@Getter
@Setter
@TableName("t_seckill_goods")
@ApiModel(value = "SeckillGoods对象", description = "秒杀商品表")
public class SeckillGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("秒杀商品ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("商品ID")
    private Long goodsId;

    @ApiModelProperty("秒杀家")
    private BigDecimal seckillPrice;

    @ApiModelProperty("库存数量")
    private Integer stockCount;

    @ApiModelProperty("秒杀开始时间")
    private Date startDate;

    @ApiModelProperty("秒杀结束时间")
    private Date endDate;


}
