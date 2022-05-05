package com.ghw.secondkill.controller;

import com.ghw.secondkill.service.IUserService;
import com.ghw.secondkill.vo.LoginVo;
import com.ghw.secondkill.vo.RespBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

/**
 * @Author ifstyle
 * @Description
 * @Date 2022/4/30 14:48
 * @Version
 */
@Controller
@RequestMapping("/login")
@Slf4j
public class LoginController {

    @Autowired
    private IUserService userService;


    @RequestMapping("/toLogin")
    public String toLogin() {

        return "login";
    }

    @RequestMapping("/doLogin")
    @ResponseBody
    public RespBean doLogin(@Valid LoginVo loginVo, HttpServletRequest request, HttpServletResponse response) {

        return userService.doLogin(loginVo, request, response);
    }

}
