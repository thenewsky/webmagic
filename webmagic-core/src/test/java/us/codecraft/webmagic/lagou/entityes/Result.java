/**
 * Copyright 2016 aTool.org
 */
package us.codecraft.webmagic.lagou.entityes;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Auto-generated: 2016-10-17 17:22:16
 *
 * @author aTool.org (i@aTool.org)
 * @website http://www.atool.org/json2javabean.php
 */
public class Result {

    @JsonProperty("companyId")
    private int companyid;
    @JsonProperty("positionName")
    private String positionname;
    @JsonProperty("workYear")
    private String workyear;
    private String education;
    @JsonProperty("jobNature")
    private String jobnature;
    @JsonProperty("createTime")
    private String createtime;
    @JsonProperty("companyShortName")
    private String companyshortname;
    @JsonProperty("positionId")
    private int positionid;
    private String salary;
    private int approve;
    private String city;
    @JsonProperty("positionAdvantage")
    private String positionadvantage;
    @JsonProperty("companyLogo")
    private String companylogo;
    @JsonProperty("industryField")
    private String industryfield;
    @JsonProperty("financeStage")
    private String financestage;
    @JsonProperty("companyLabelList")
    private List<String> companylabellist;
    private String district;
    @JsonProperty("companySize")
    private String companysize;
    private int score;
    @JsonProperty("companyFullName")
    private String companyfullname;
    @JsonProperty("adWord")
    private int adword;
    @JsonProperty("lastLogin")
    public long lastlogin;
    @JsonProperty("publisherId")
    private int publisherid;
    private String explain;
    private String plus;
    @JsonProperty("pcShow")
    private int pcshow;
    @JsonProperty("appShow")
    private int appshow;
    private int deliver;
    @JsonProperty("gradeDescription")
    private String gradedescription;
    @JsonProperty("promotionScoreExplain")
    private String promotionscoreexplain;
    @JsonProperty("businessZones")
    private String businesszones;
    @JsonProperty("imState")
    private String imstate;
    @JsonProperty("formatCreateTime")
    private String formatcreatetime;


    private String content;

    private String adress;

    public int getCompanyid() {
        return companyid;
    }

    public void setCompanyid(int companyid) {
        this.companyid = companyid;
    }

    public String getPositionname() {
        return positionname;
    }

    public void setPositionname(String positionname) {
        this.positionname = positionname;
    }

    public String getWorkyear() {
        return workyear;
    }

    public void setWorkyear(String workyear) {
        this.workyear = workyear;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getJobnature() {
        return jobnature;
    }

    public void setJobnature(String jobnature) {
        this.jobnature = jobnature;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getCompanyshortname() {
        return companyshortname;
    }

    public void setCompanyshortname(String companyshortname) {
        this.companyshortname = companyshortname;
    }

    public int getPositionid() {
        return positionid;
    }

    public void setPositionid(int positionid) {
        this.positionid = positionid;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getApprove() {
        return approve;
    }

    public void setApprove(int approve) {
        this.approve = approve;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPositionadvantage() {
        return positionadvantage;
    }

    public void setPositionadvantage(String positionadvantage) {
        this.positionadvantage = positionadvantage;
    }

    public String getCompanylogo() {
        return companylogo;
    }

    public void setCompanylogo(String companylogo) {
        this.companylogo = companylogo;
    }

    public String getIndustryfield() {
        return industryfield;
    }

    public void setIndustryfield(String industryfield) {
        this.industryfield = industryfield;
    }

    public String getFinancestage() {
        return financestage;
    }

    public void setFinancestage(String financestage) {
        this.financestage = financestage;
    }

    public List<String> getCompanylabellist() {
        return companylabellist;
    }

    public void setCompanylabellist(List<String> companylabellist) {
        this.companylabellist = companylabellist;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCompanysize() {
        return companysize;
    }

    public void setCompanysize(String companysize) {
        this.companysize = companysize;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getCompanyfullname() {
        return companyfullname;
    }

    public void setCompanyfullname(String companyfullname) {
        this.companyfullname = companyfullname;
    }

    public int getAdword() {
        return adword;
    }

    public void setAdword(int adword) {
        this.adword = adword;
    }

    public long getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(long lastlogin) {
        this.lastlogin = lastlogin;
    }

    public int getPublisherid() {
        return publisherid;
    }

    public void setPublisherid(int publisherid) {
        this.publisherid = publisherid;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public String getPlus() {
        return plus;
    }

    public void setPlus(String plus) {
        this.plus = plus;
    }

    public int getPcshow() {
        return pcshow;
    }

    public void setPcshow(int pcshow) {
        this.pcshow = pcshow;
    }

    public int getAppshow() {
        return appshow;
    }

    public void setAppshow(int appshow) {
        this.appshow = appshow;
    }

    public int getDeliver() {
        return deliver;
    }

    public void setDeliver(int deliver) {
        this.deliver = deliver;
    }

    public String getGradedescription() {
        return gradedescription;
    }

    public void setGradedescription(String gradedescription) {
        this.gradedescription = gradedescription;
    }

    public String getPromotionscoreexplain() {
        return promotionscoreexplain;
    }

    public void setPromotionscoreexplain(String promotionscoreexplain) {
        this.promotionscoreexplain = promotionscoreexplain;
    }

    public String getBusinesszones() {
        return businesszones;
    }

    public void setBusinesszones(String businesszones) {
        this.businesszones = businesszones;
    }

    public String getImstate() {
        return imstate;
    }

    public void setImstate(String imstate) {
        this.imstate = imstate;
    }

    public String getFormatcreatetime() {
        return formatcreatetime;
    }

    public void setFormatcreatetime(String formatcreatetime) {
        this.formatcreatetime = formatcreatetime;
    }


    public Object[] logObj() {
        return new Object[]{
                companyid,
                positionadvantage
        };
    }

    @Override
    public String toString() {
        return    this.adress+ " "+ this.getHtmlUrl();
//        return JSON.toJSONString(this);
//        return "Result{" +
//                "companyid=" + companyid +
//                ", positionname='" + positionname + '\'' +
//                ", workyear='" + workyear + '\'' +
//                ", education='" + education + '\'' +
//                ", jobnature='" + jobnature + '\'' +
//                ", createtime='" + createtime + '\'' +
//                ", companyshortname='" + companyshortname + '\'' +
//                ", positionid=" + positionid +
//                ", salary='" + salary + '\'' +
//                ", approve=" + approve +
//                ", city='" + city + '\'' +
//                ", positionadvantage='" + positionadvantage + '\'' +
//                ", companylogo='" + companylogo + '\'' +
//                ", industryfield='" + industryfield + '\'' +
//                ", financestage='" + financestage + '\'' +
//                ", companylabellist=" + companylabellist +
//                ", district='" + district + '\'' +
//                ", companysize='" + companysize + '\'' +
//                ", score=" + score +
//                ", companyfullname='" + companyfullname + '\'' +
//                ", adword=" + adword +
//                ", lastlogin=" + lastlogin +
//                ", publisherid=" + publisherid +
//                ", explain='" + explain + '\'' +
//                ", plus='" + plus + '\'' +
//                ", pcshow=" + pcshow +
//                ", appshow=" + appshow +
//                ", deliver=" + deliver +
//                ", gradedescription='" + gradedescription + '\'' +
//                ", promotionscoreexplain='" + promotionscoreexplain + '\'' +
//                ", businesszones='" + businesszones + '\'' +
//                ", imstate='" + imstate + '\'' +
//                ", formatcreatetime='" + formatcreatetime + '\'' +
//                '}';
    }

    public String getContent() {
        return content;
    }


    public Set<String> getContentSet() {
        Set<String> set = new HashSet<String>();
        String[] ss = content.split("\n");
        for (String s : ss) {
            String  tmp = s.trim();
            if (!tmp.isEmpty()){
                set.add(tmp);
            }
        }
        return set;
    }


    public void setContent(String content) {

        this.content = content.replaceAll("</?[^<]+>", "").replaceAll("&nbsp;", "").replaceAll("</span", "");
        this.content = filterN(this.content);
//                content.replaceAll("dd class=\"job_bt\">","")
//        .replaceAll("<span class=\"\"><br></span><span class=\"\">","")
//        .replaceAll("</span>","\n")
//        .replaceAll("</p>","")
//                .replaceAll("<p>","")
//                .replaceAll("<br>","")
//                .replaceAll("</dd>","");
//        this.content = content;
    }


    public String filter(String content, Set<String> filters) {
        for (String filter : filters) {
            content = content.replaceAll(filter, "");
        }
        return content;
    }


    public String filterN(String content) {
//        return content.replaceAll("\\d+\\.", "\n");
        return content.replaceAll("\\d+(\\.|\\、)", "\n");
    }


    //http://www.lagou.com/jobs/5005509.html
    public String getHtmlUrl() {
        return "http://www.lagou.com/jobs/" + positionid + ".html";
    }


    public static void main(String[] args) {
        String str = "1.1.1.1.1.1";
        System.out.println(str.replaceAll("\\d+\\.", "\n"));

    }


    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}