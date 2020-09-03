package com.luruan.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;

/**
 2 * @Author: ZG
 3 * @Date: 2020/9/3 9:08
 4 */
@ApiModel(value="com-domain-User")
@Data
@Table(name = "`user`")
public class User implements Serializable {
    @Column(name = "`name`")
    @ApiModelProperty(value="")
    private String name;

    @Column(name = "age")
    @ApiModelProperty(value="")
    private Integer age;

    @Column(name = "sex")
    @ApiModelProperty(value="")
    private String sex;

    private static final long serialVersionUID = 1L;
}