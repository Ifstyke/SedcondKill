package com.ghw.secondkill.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghw.secondkill.pojo.SeckillOrder;
import com.ghw.secondkill.mapper.SeckillOrderMapper;
import com.ghw.secondkill.service.ISeckillOrderService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 秒杀订单表 服务实现类
 * </p>
 *
 * @author 作者
 * @since 2022-04-30
 */
@Service
public class SeckillOrderServiceImpl extends ServiceImpl<SeckillOrderMapper, SeckillOrder> implements ISeckillOrderService {

}
