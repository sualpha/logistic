package com.suzz.mini.dto.mgt;

import lombok.Data;

import java.io.Serializable;

@Data
public class AuditMgtDTO implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 订单id
     */
    private Integer fkOrder;

    /**
     * 审批人
     */
    private Long fkAuditUser;

    /**
     * 审批姓名
     */
    private String auditUserName;

    /**
     * 1.审核通过 2.审核拒绝
     */
    private Long status;

    /**
     * 审批拒绝理由
     */
    private String rejectRemark;

    /**
     * 审核内容
     */
    private String auditContent;
}
