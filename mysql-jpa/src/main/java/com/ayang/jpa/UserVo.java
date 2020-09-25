package com.ayang.jpa;

import lombok.Data;

/**
 * @ClassName UserVo
 * @Author ayang
 * @Date 2020/9/24
 * @Version V1.0
 * @description
 **/
@Data
public class UserVo {

    private Long id;
    private String name;
    private String account;
    private String pwd;
}
