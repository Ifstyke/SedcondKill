package com.ghw.secondkill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ghw.secondkill.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author 作者
 * @since 2022-04-30
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
