package com.ayang.jpa.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ClassName UserDO
 * @Author ayang
 * @Date 2020/9/22
 * @Version V1.0
 * @description
 **/
@Entity
@Table(name = "user_info")
@Data
public class UserDO {

    @Id
    private Long id;
    @Column(length = 32)
    private String name;
    @Column(length = 32)
    private String account;
    @Column(length = 64)
    private String pwd;

}
