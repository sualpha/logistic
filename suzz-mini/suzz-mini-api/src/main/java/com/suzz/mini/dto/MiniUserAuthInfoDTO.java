package com.suzz.mini.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author subo
 * @date 2022/5/2 14:19
 **/
@Data
@ApiModel
public class MiniUserAuthInfoDTO implements Serializable {

    private static final long serialVersionUID = -7927696646558905335L;

    @ApiModelProperty(value = "用户Id")
    private Integer miniUserId;

    /**
     * 语言
     */
    @ApiModelProperty(value = "语言")
    private String language;

    /**
     * 1.司机 2货主
     */
    @ApiModelProperty(value = "类型")
    private Integer type;
}
