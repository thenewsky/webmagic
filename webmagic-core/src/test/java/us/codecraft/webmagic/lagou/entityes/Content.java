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
public class Content {

    @JsonProperty("pageNo")
    private int pageno;
    @JsonProperty("pageSize")
    private int pagesize;
    @JsonProperty("positionResult")
    private Positionresult positionresult;
    public void setPageno(int pageno) {
         this.pageno = pageno;
     }
     public int getPageno() {
         return pageno;
     }

    public void setPagesize(int pagesize) {
         this.pagesize = pagesize;
     }
     public int getPagesize() {
         return pagesize;
     }

    public void setPositionresult(Positionresult positionresult) {
         this.positionresult = positionresult;
     }
     public Positionresult getPositionresult() {
         return positionresult;
     }

}