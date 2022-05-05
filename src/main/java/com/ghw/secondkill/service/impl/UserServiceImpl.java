package com.ghw.secondkill.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghw.secondkill.exception.GlobalException;
import com.ghw.secondkill.pojo.User;
import com.ghw.secondkill.mapper.UserMapper;
import com.ghw.secondkill.service.IUserService;
import com.ghw.secondkill.utils.CookieUtil;
import com.ghw.secondkill.utils.MD5Util;
import com.ghw.secondkill.utils.UUIDUtil;
import com.ghw.secondkill.utils.ValidatorUtil;
import com.ghw.secondkill.vo.LoginVo;
import com.ghw.secondkill.vo.RespBean;
import com.ghw.secondkill.vo.RespBeanEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author 作者
 * @since 2022-04-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    // @Override
    // public RespBean doLogin(LoginVo loginVo) {
    //
    //
    //     String mobile = loginVo.getMobile();
    //     String password = loginVo.getPassword();
    //
    //     // 参数校验
    //
    //     // 参数校验不需要了，通过注解实现了
    //     // // 如果手机号或者密码为空
    //     // if (StringUtils.isEmpty(mobile) || StringUtils.isEmpty(password)) {
    //     //     return RespBean.error(RespBeanEnum.LOGIN_ERROR);
    //     // }
    //     // // 判断手机号格式是否正确
    //     // if (!ValidatorUtil.isMobile(mobile)) {
    //     //     return RespBean.error(RespBeanEnum.MOBILE_ERROR);
    //     // }
    //     // 如果通过以上验证了，则进行数据库查询
    //     // 根据手机号获取用户
    //     User user = userMapper.selectById(mobile);
    //     if (null == user) {
    //         // return RespBean.error(RespBeanEnum.LOGIN_ERROR);
    //         throw new GlobalException(RespBeanEnum.LOGIN_ERROR);
    //     }
    //     // 判断密码是否正确
    //     if (!MD5Util.formPassToDBPass(password, user.getSalt()).equals(user.getPassword())) {
    //         // return RespBean.error(RespBeanEnum.LOGIN_ERROR);
    //         throw new GlobalException(RespBeanEnum.LOGIN_ERROR);
    //     }
    //     return RespBean.success();
    // }

    @Override
    public RespBean doLogin(LoginVo loginVo, HttpServletRequest request, HttpServletResponse response) {


        String mobile = loginVo.getMobile();
        String password = loginVo.getPassword();

        // 参数校验

        // 参数校验不需要了，通过注解实现了
        // // 如果手机号或者密码为空
        // if (StringUtils.isEmpty(mobile) || StringUtils.isEmpty(password)) {
        //     return RespBean.error(RespBeanEnum.LOGIN_ERROR);
        // }
        // // 判断手机号格式是否正确
        // if (!ValidatorUtil.isMobile(mobile)) {
        //     return RespBean.error(RespBeanEnum.MOBILE_ERROR);
        // }
        // 如果通过以上验证了，则进行数据库查询
        // 根据手机号获取用户
        User user = userMapper.selectById(mobile);
        if (null == user) {
            // return RespBean.error(RespBeanEnum.LOGIN_ERROR);
            throw new GlobalException(RespBeanEnum.LOGIN_ERROR);
        }
        // 判断密码是否正确
        if (!MD5Util.formPassToDBPass(password, user.getSalt()).equals(user.getPassword())) {
            // return RespBean.error(RespBeanEnum.LOGIN_ERROR);
            throw new GlobalException(RespBeanEnum.LOGIN_ERROR);
        }

        // 生成Cookie
        String ticket = UUIDUtil.uuid();
        request.getSession().setAttribute(ticket, user);
        CookieUtil.setCookie(request, response, "userTicket", ticket);
        return RespBean.success();
    }
}
