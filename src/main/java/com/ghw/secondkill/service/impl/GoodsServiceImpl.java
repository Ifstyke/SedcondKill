package com.ghw.secondkill.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.ghw.secondkill.pojo.Goods;
import com.ghw.secondkill.mapper.GoodsMapper;
import com.ghw.secondkill.service.IGoodsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author 作者
 * @since 2022-04-30
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

}
