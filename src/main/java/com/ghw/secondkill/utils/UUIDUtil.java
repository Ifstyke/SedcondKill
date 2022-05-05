package com.ghw.secondkill.utils;

import java.util.UUID;

/**
 * @Author ifstyle
 * @Description
 * @Date 2022/5/5 19:35
 * @Version
 */
public class UUIDUtil {

    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
