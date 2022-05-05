package com.ghw.secondkill.exception;

import com.ghw.secondkill.vo.RespBeanEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author ifstyle
 * @Description
 * @Date 2022/5/5 19:18
 * @Version
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GlobalException extends RuntimeException{

    private RespBeanEnum respBeanEnum;

}
