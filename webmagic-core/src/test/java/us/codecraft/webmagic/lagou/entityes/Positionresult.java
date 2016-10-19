/**
  * Copyright 2016 aTool.org 
  */
package us.codecraft.webmagic.lagou.entityes;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
/**
 * Auto-generated: 2016-10-17 17:22:16
 *
 * @author aTool.org (i@aTool.org)
 * @website http://www.atool.org/json2javabean.php
 */
public class Positionresult {

    @JsonProperty("totalCount")
    private int totalcount;
    @JsonProperty("locationInfo")
    private Locationinfo locationinfo;
    @JsonProperty("resultSize")
    private int resultsize;
    @JsonProperty("queryAnalysisInfo")
    private Queryanalysisinfo queryanalysisinfo;
    @JsonProperty("strategyProperty")
    private Strategyproperty strategyproperty;
    private List<Result> result;
    public void setTotalcount(int totalcount) {
         this.totalcount = totalcount;
     }
     public int getTotalcount() {
         return totalcount;
     }

    public void setLocationinfo(Locationinfo locationinfo) {
         this.locationinfo = locationinfo;
     }
     public Locationinfo getLocationinfo() {
         return locationinfo;
     }

    public void setResultsize(int resultsize) {
         this.resultsize = resultsize;
     }
     public int getResultsize() {
         return resultsize;
     }

    public void setQueryanalysisinfo(Queryanalysisinfo queryanalysisinfo) {
         this.queryanalysisinfo = queryanalysisinfo;
     }
     public Queryanalysisinfo getQueryanalysisinfo() {
         return queryanalysisinfo;
     }

    public void setStrategyproperty(Strategyproperty strategyproperty) {
         this.strategyproperty = strategyproperty;
     }
     public Strategyproperty getStrategyproperty() {
         return strategyproperty;
     }

    public void setResult(List<Result> result) {
         this.result = result;
     }
     public List<Result> getResult() {
         return result;
     }

}