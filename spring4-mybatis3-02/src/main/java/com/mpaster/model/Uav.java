package com.mpaster.model;

import java.util.Date;

public class Uav {
    private Integer uavId;

    private String uavTitle;

    private String uavType;

    private String uavAuthor;

    private Date uavCreateTime;

    private Date uavDeleteTime;

    private Integer uavDelFlag;

    private Integer userId;

    private String uavContent;

    public Integer getUavId() {
        return uavId;
    }

    public void setUavId(Integer uavId) {
        this.uavId = uavId;
    }

    public String getUavTitle() {
        return uavTitle;
    }

    public void setUavTitle(String uavTitle) {
        this.uavTitle = uavTitle == null ? null : uavTitle.trim();
    }

    public String getUavType() {
        return uavType;
    }

    public void setUavType(String uavType) {
        this.uavType = uavType == null ? null : uavType.trim();
    }

    public String getUavAuthor() {
        return uavAuthor;
    }

    public void setUavAuthor(String uavAuthor) {
        this.uavAuthor = uavAuthor == null ? null : uavAuthor.trim();
    }

    public Date getUavCreateTime() {
        return uavCreateTime;
    }

    public void setUavCreateTime(Date uavCreateTime) {
        this.uavCreateTime = uavCreateTime;
    }

    public Date getUavDeleteTime() {
        return uavDeleteTime;
    }

    public void setUavDeleteTime(Date uavDeleteTime) {
        this.uavDeleteTime = uavDeleteTime;
    }

    public Integer getUavDelFlag() {
        return uavDelFlag;
    }

    public void setUavDelFlag(Integer uavDelFlag) {
        this.uavDelFlag = uavDelFlag;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUavContent() {
        return uavContent;
    }

    public void setUavContent(String uavContent) {
        this.uavContent = uavContent == null ? null : uavContent.trim();
    }
}