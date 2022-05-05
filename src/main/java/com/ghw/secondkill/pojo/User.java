package com.ghw.secondkill.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author 作者
 * @since 2022-04-30
 */
@Getter
@Setter
@TableName("t_user")
@ApiModel(value = "User对象", description = "用户表")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户ID,手机号码")
    private Long id;

    private String nickname;

    @ApiModelProperty("MD5(MD5(pass明文+固定salt)+salt)")
    private String password;

    private String salt;

    @ApiModelProperty("头像")
    private String head;

    @ApiModelProperty("注册时间")
    private Date registerDate;

    @ApiModelProperty("最后一次登录事件")
    private Date lastLoginDate;

    @ApiModelProperty("登录次数")
    private Integer loginCount;


}
