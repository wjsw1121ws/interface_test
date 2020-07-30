package com.wcc.intf.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 普惠组织部门同步表
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Syn implements Serializable {
    /**
     * 主键
     */
    private String idSyn;

    /**
     * 业务单位ID
     */
    private String setid;

    /**
     * 更新日期
     */
    private Date paicOutDate;

    /**
     * 接口更新标志
     */
    private String paicOutFlag;

    /**
     * 部门ID
     */
    private String deptid;

    /**
     * 业务单位描述
     */
    private String paicSetidDescr;

    /**
     * 部门描述
     */
    private String deptidDescr;

    /**
     * 部门短描述
     */
    private String deptidDescrShort;

    /**
     * 部门类型编号
     */
    private String paicDepttpNo;

    /**
     * 部门类型描述
     */
    private String paicDeptnoDesc;

    /**
     * 部门级别编号
     */
    private String paicDeptlevNo;

    /**
     * 部门级别描述
     */
    private String paicDeptlevDesc;

    /**
     * 地点描述
     */
    private String locationDescr;

    /**
     * 邮政编码
     */
    private String postal;

    /**
     * 部门开始时间
     */
    private String paicDeptStartdt;

    /**
     * 部门结束时间
     */
    private String paicDeptEnddt;

    /**
     * 部门添加时间
     */
    private String paicRowaddDttm;

    /**
     * 部门添加人员
     */
    private String hrsRowAddOprid;

    /**
     * 部门更新时间
     */
    private String paicRowupdDttm;

    /**
     * 部门更新人员
     */
    private String hrsRowUpdOprid;

    /**
     * 父节点
     */
    private String parentNodeName;

    /**
     * 父节点节点编号
     */
    private Integer parentNodeNum;

    /**
     * 树节点编号
     */
    private Integer treeNodeNum;

    /**
     * 树截止节点编号
     */
    private Integer treeNodeNumEnd;

    /**
     * 树节点级别编号，目前尚不能保证完全反映树层次
     */
    private Integer treeLevelNum;

    /**
     * 树节点变化；D：已删除，I：新增，PC：父节点变化，OC：其他树节点属性变化，U：只有部门属性变化
     */
    private String paicTreendFlg;

    /**
     * 唯一部门ID
     */
    private String paicUniqueDeptid;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private Date dateCreated;

    /**
     * 修改人
     */
    private String updatedBy;

    /**
     * 修改时间
     */
    private Date dateUpdated;

    private static final long serialVersionUID = 1L;
}