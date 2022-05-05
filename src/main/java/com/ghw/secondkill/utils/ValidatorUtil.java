package com.ghw.secondkill.utils;

import org.thymeleaf.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author ifstyle
 * @Description 手机号校验
 * @Date 2022/5/5 16:18
 * @Version
 */
public class ValidatorUtil {

    /**
     * 正则表达式语法：
     * ^ ：匹配输入字符串的开始位置
     * $ ：匹配输入字符串的结束位置
     * {n} ：n是一个非负整数。匹配确定的n次
     * [a-z] ： 字符范围，匹配指定范围内的任意字符。
     * \d ： 匹配一个数字字符，等价于[0-9]
     */
    private static final Pattern mobile_pattern = Pattern.compile("^1[3-9][0-9]{9}$");

    public static boolean isMobile(String mobile){
        // 如果手机号为空
        if (StringUtils.isEmpty(mobile)){
            return false;
        }
        Matcher matcher = mobile_pattern.matcher(mobile);
        return matcher.matches();
    }
}
