package com.ghw.secondkill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author ifstyle
 * @Description 测试
 * @Date 2022/4/30 09:39
 * @Version
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name", "xxxx");
        return "hello";
    }
}
