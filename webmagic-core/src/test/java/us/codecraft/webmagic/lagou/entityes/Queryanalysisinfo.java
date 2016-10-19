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
public class Queryanalysisinfo {

    @JsonProperty("industryName")
    private String industryname;
    @JsonProperty("usefulCompany")
    private boolean usefulcompany;
    @JsonProperty("positionName")
    private String positionname;
    @JsonProperty("companyName")
    private String companyname;
    public void setIndustryname(String industryname) {
         this.industryname = industryname;
     }
     public String getIndustryname() {
         return industryname;
     }

    public void setUsefulcompany(boolean usefulcompany) {
         this.usefulcompany = usefulcompany;
     }
     public boolean getUsefulcompany() {
         return usefulcompany;
     }

    public void setPositionname(String positionname) {
         this.positionname = positionname;
     }
     public String getPositionname() {
         return positionname;
     }

    public void setCompanyname(String companyname) {
         this.companyname = companyname;
     }
     public String getCompanyname() {
         return companyname;
     }

}