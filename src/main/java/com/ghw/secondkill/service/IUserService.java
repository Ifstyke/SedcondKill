package com.ghw.secondkill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ghw.secondkill.pojo.User;
import com.ghw.secondkill.vo.LoginVo;
import com.ghw.secondkill.vo.RespBean;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author 作者
 * @since 2022-04-30
 */
public interface IUserService extends IService<User> {
    /**
     * 登录
     * @param loginVo
     * @return
     */
    RespBean doLogin(LoginVo loginVo);
}
