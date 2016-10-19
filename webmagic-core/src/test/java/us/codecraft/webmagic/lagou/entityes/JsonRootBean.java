/**
  * Copyright 2016 aTool.org 
  */
package us.codecraft.webmagic.lagou.entityes;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated: 2016-10-17 17:22:16
 *
 * @author aTool.org (i@aTool.org)
 * @website http://www.atool.org/json2javabean.php
 */
public class JsonRootBean {

    private String msg;
    @JsonProperty("resubmitToken")
    private String resubmittoken;
    private boolean success;
    @JsonProperty("requestId")
    private String requestid;
    private Content content;
    private int code;
    public void setMsg(String msg) {
         this.msg = msg;
     }
     public String getMsg() {
         return msg;
     }

    public void setResubmittoken(String resubmittoken) {
         this.resubmittoken = resubmittoken;
     }
     public String getResubmittoken() {
         return resubmittoken;
     }

    public void setSuccess(boolean success) {
         this.success = success;
     }
     public boolean getSuccess() {
         return success;
     }

    public void setRequestid(String requestid) {
         this.requestid = requestid;
     }
     public String getRequestid() {
         return requestid;
     }

    public void setContent(Content content) {
         this.content = content;
     }
     public Content getContent() {
         return content;
     }

    public void setCode(int code) {
         this.code = code;
     }
     public int getCode() {
         return code;
     }


    @Override
    public String toString() {
        return "JsonRootBean{" +
                "msg='" + msg + '\'' +
                ", resubmittoken='" + resubmittoken + '\'' +
                ", success=" + success +
                ", requestid='" + requestid + '\'' +
                ", content=" + content +
                ", code=" + code +
                '}';
    }
}