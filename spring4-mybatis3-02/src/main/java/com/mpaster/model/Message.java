package com.mpaster.model;

import java.util.Date;

public class Message {
    private Integer mesgeId;

    private String mesgeContent;

    private String mesgeAuthor;

    private Date mesgeCreateTime;

    private Date mesgeDeleteTime;

    private Integer mesgeDelFlag;

    private String mesgeContact;

    public Integer getMesgeId() {
        return mesgeId;
    }

    public void setMesgeId(Integer mesgeId) {
        this.mesgeId = mesgeId;
    }

    public String getMesgeContent() {
        return mesgeContent;
    }

    public void setMesgeContent(String mesgeContent) {
        this.mesgeContent = mesgeContent == null ? null : mesgeContent.trim();
    }

    public String getMesgeAuthor() {
        return mesgeAuthor;
    }

    public void setMesgeAuthor(String mesgeAuthor) {
        this.mesgeAuthor = mesgeAuthor == null ? null : mesgeAuthor.trim();
    }

    public Date getMesgeCreateTime() {
        return mesgeCreateTime;
    }

    public void setMesgeCreateTime(Date mesgeCreateTime) {
        this.mesgeCreateTime = mesgeCreateTime;
    }

    public Date getMesgeDeleteTime() {
        return mesgeDeleteTime;
    }

    public void setMesgeDeleteTime(Date mesgeDeleteTime) {
        this.mesgeDeleteTime = mesgeDeleteTime;
    }

    public Integer getMesgeDelFlag() {
        return mesgeDelFlag;
    }

    public void setMesgeDelFlag(Integer mesgeDelFlag) {
        this.mesgeDelFlag = mesgeDelFlag;
    }

    public String getMesgeContact() {
        return mesgeContact;
    }

    public void setMesgeContact(String mesgeContact) {
        this.mesgeContact = mesgeContact == null ? null : mesgeContact.trim();
    }
}