package com.example.emos.wx.db.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * sys_config
 * @author hcj
 */
@Data
public class TbPermission implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 参数名
     */
    private String paramKey;

    /**
     * 参数值
     */
    private String paramValue;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;
}