package com.eeyuva.screens.profile.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by hari on 08/10/16.
 */
public class AlertList {


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getThumbimg() {
        return thumbimg;
    }

    public void setThumbimg(String thumbimg) {
        this.thumbimg = thumbimg;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getArticleid() {
        return articleid;
    }

    public void setArticleid(String articleid) {
        this.articleid = articleid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @SerializedName("title")
    @Expose

    private String title;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("thumbimg")
    @Expose
    private String thumbimg;
    @SerializedName("module_id")
    @Expose
    private String moduleId;
    @SerializedName("module_name")
    @Expose
    private String moduleName;
    @SerializedName("articleid")
    @Expose
    private String articleid;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("msgtype")
    @Expose
    private String msgtype;
    @SerializedName("date")
    @Expose
    private String date;
}
