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
public class Locationinfo {

    @JsonProperty("queryByGisCode")
    private boolean querybygiscode;
    @JsonProperty("locationCode")
    private String locationcode;
    @JsonProperty("businessZone")
    private String businesszone;
    private String city;
    private String district;
    public void setQuerybygiscode(boolean querybygiscode) {
         this.querybygiscode = querybygiscode;
     }
     public boolean getQuerybygiscode() {
         return querybygiscode;
     }

    public void setLocationcode(String locationcode) {
         this.locationcode = locationcode;
     }
     public String getLocationcode() {
         return locationcode;
     }

    public void setBusinesszone(String businesszone) {
         this.businesszone = businesszone;
     }
     public String getBusinesszone() {
         return businesszone;
     }

    public void setCity(String city) {
         this.city = city;
     }
     public String getCity() {
         return city;
     }

    public void setDistrict(String district) {
         this.district = district;
     }
     public String getDistrict() {
         return district;
     }

}