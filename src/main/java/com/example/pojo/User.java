package com.example.pojo;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author : bestrookie
 */
public class User {
    @ApiModelProperty("用户名")
    public String username;
    @ApiModelProperty("密码")
    public String password;
}
