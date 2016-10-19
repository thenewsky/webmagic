package us.codecraft.webmagic.lagou.vo;

import com.sun.deploy.net.URLEncoder;

import java.io.UnsupportedEncodingException;

/**
 * Created by zhujin on 10/18/16.
 * blog:www.zhujin.me
 * email: zhujin.nova@gmail.com
 */
public class SearchVo {

    String base_url = "http://www.lagou.com/jobs/positionAjax.json?";

    String px = "default";
    String yx = "25k-50k";
    String city = "%E5%8C%97%E4%BA%AC";
    String needAddtionalResult = "false";
    String kd = "java";
    String pn = "1";

    public SearchVo(String yx, String city, String kd, String pn) {
        this.yx = yx;
        this.city = city;
        this.kd = kd;
        this.pn = pn;
    }

//    @Override
//    public String toString() {
//        final StringBuffer sb = new StringBuffer(base_url);
//        sb.append(px);
//        sb.append(yx).append('&');
//        sb.append(city).append('&');
//        sb.append(needAddtionalResult).append('&');;
//        sb.append(kd).append('&');;
//        sb.append(pn);
//        return sb.toString();
//    }


    public String getBase_url() {
        return base_url;
    }

    public void setBase_url(String base_url) {
        this.base_url = base_url;
    }

    public String getPx() {
        return px;
    }

    public void setPx(String px) {
        this.px = px;
    }

    public String getYx() {
        return yx;
    }

    public void setYx(String yx) {
        this.yx = yx;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeedAddtionalResult() {
        return needAddtionalResult;
    }

    public void setNeedAddtionalResult(String needAddtionalResult) {
        this.needAddtionalResult = needAddtionalResult;
    }

    public String getKd() {
        return kd;
    }

    public void setKd(String kd) {
        this.kd = kd;
    }

    public String getPn() {
        return pn;
    }

    public void setPn(String pn) {
        this.pn = pn;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(base_url);
        sb.append("px=").append(px);
        sb.append("&yx=").append(yx);
        try {
            sb.append("&city=").append(URLEncoder.encode(city,"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        sb.append("&needAddtionalResult=").append(needAddtionalResult);
        try {
            sb.append("&kd=").append(URLEncoder.encode(kd,"UTF-8")) ;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        sb.append("&pn=").append(pn) ;
        return sb.toString();
    }
}
