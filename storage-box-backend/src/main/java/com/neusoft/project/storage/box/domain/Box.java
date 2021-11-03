package com.neusoft.project.storage.box.domain;

import java.util.Date;

/**
 * @Description:
 * @date:2021/11/1/15:53
 * @author:谭珺
 */
public class Box {
    private Long id;
    private String boxStandard;
    private Long boxUnitPrice;
    private String remark;
    private Long sortNo;
    private Date createTime;
    private String createBy;
    private Date updateTime;
    private String updateBy;
    private Long version;
    private char delFlag;

    private Long inventoryNumber;


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



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getInventoryNumber() {
        return inventoryNumber;
    }
    public void setInventoryNumber(Long inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }



    //重写toSting
    @Override
    public String toString() {
        return "Box{" +
                "id=" + id +
                ", boxStandard='" + boxStandard + '\'' +
                ", boxUnitPrice=" + boxUnitPrice +
                ", remark='" + remark + '\'' +
                ", sortNo=" + sortNo +
                ", createTime=" + createTime +
                ", createBy='" + createBy + '\'' +
                ", updateTime=" + updateTime +
                ", updateBy='" + updateBy + '\'' +
                ", version=" + version +
                ", delFlag=" + delFlag +

                ", inventoryNumber=" + inventoryNumber +

                '}';
    }
}

