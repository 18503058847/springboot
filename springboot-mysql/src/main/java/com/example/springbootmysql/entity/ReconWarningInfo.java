package com.example.springbootmysql.entity;

import java.util.Date;

public class ReconWarningInfo {
    private Long id;

    private String tradeMobiles;

    private String interestMobiles;

    private String lotMobiles;

    private String remark;

    private Date finishTime;

    private Date createTime;

    private Date updateTime;

    private Byte deleteStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTradeMobiles() {
        return tradeMobiles;
    }

    public void setTradeMobiles(String tradeMobiles) {
        this.tradeMobiles = tradeMobiles == null ? null : tradeMobiles.trim();
    }

    public String getInterestMobiles() {
        return interestMobiles;
    }

    public void setInterestMobiles(String interestMobiles) {
        this.interestMobiles = interestMobiles == null ? null : interestMobiles.trim();
    }

    public String getLotMobiles() {
        return lotMobiles;
    }

    public void setLotMobiles(String lotMobiles) {
        this.lotMobiles = lotMobiles == null ? null : lotMobiles.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Byte deleteStatus) {
        this.deleteStatus = deleteStatus;
    }
}