package com.ghw.secondkill.vo;

import com.ghw.secondkill.validator.IsMobile;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * @Author ifstyle
 * @Description
 * @Date 2022/5/1 10:32
 * @Version
 */
@Data
public class LoginVo {

    @NotNull
    @IsMobile
    private String mobile;

    @NotNull
    @Length(min = 32)
    private String password;


}
