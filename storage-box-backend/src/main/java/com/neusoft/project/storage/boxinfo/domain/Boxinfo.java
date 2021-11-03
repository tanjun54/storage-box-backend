package com.neusoft.project.storage.boxinfo.domain;

import java.util.Date;

/**
 * @Description:
 * @date:2021/11/2/10:49
 * @author:谭珺
 */
public class Boxinfo {
    private Long id;
    private Long boxCode;
    private String boxStandard;
    private Long boxUnitPrice;
    private Long usedBy;
    private Long isUsed;
    private String remark;
    private Long sortNo;
    private Date createTime;
    private String createBy;
    private Date updateTime;
    private String updateBy;
    private Long version;
    private char delFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBoxCode() {
        return boxCode;
    }

    public void setBoxCode(Long boxCode) {
        this.boxCode = boxCode;
    }

    public String getBoxStandard() {
        return boxStandard;
    }

    public void setBoxStandard(String boxStandard) {
        this.boxStandard = boxStandard;
    }

    public Long getBoxUnitPrice() {
        return boxUnitPrice;
    }

    public void setBoxUnitPrice(Long boxUnitPrice) {
        this.boxUnitPrice = boxUnitPrice;
    }

    public Long getUsedBy() {
        return usedBy;
    }

    public void setUsedBy(Long usedBy) {
        this.usedBy = usedBy;
    }

    public Long getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Long isUsed) {
        this.isUsed = isUsed;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getSortNo() {
        return sortNo;
    }

    public void setSortNo(Long sortNo) {
        this.sortNo = sortNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public char getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(char delFlag) {
        this.delFlag = delFlag;
    }

    //重写toString方法

    @Override
    public String toString() {
        return "Boxinfo{" +
                "id=" + id +
                ", boxCode=" + boxCode +
                ", boxStandard='" + boxStandard + '\'' +
                ", boxUnitPrice=" + boxUnitPrice +
                ", usedBy=" + usedBy +
                ", isUsed=" + isUsed +
                ", remark='" + remark + '\'' +
                ", sortNo=" + sortNo +
                ", createTime=" + createTime +
                ", createBy='" + createBy + '\'' +
                ", updateTime=" + updateTime +
                ", updateBy='" + updateBy + '\'' +
                ", version=" + version +
                ", delFlag=" + delFlag +
                '}';
    }
}
