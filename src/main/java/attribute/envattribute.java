package attribute;

import java.util.Date;

public class envattribute {

    private String city; //城市
    private String street; //街道
    private String country; //国家
    private Date access_time;  //访问时间
    private Date expiry_time;  //过期时间
    private String os_type; //操作系统
    private String access_type;//访问类型
    private boolean browser; //浏览器

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getAccess_time() {
        return access_time;
    }

    public void setAccess_time(Date access_time) {
        this.access_time = access_time;
    }

    public Date getExpiry_time() {
        return expiry_time;
    }

    public void setExpiry_time(Date expiry_time) {
        this.expiry_time = expiry_time;
    }

    public String getOs_type() {
        return os_type;
    }

    public void setOs_type(String os_type) {
        this.os_type = os_type;
    }

    public String getAccess_type() {
        return access_type;
    }

    public void setAccess_type(String access_type) {
        this.access_type = access_type;
    }

    public boolean isBrowser() {
        return browser;
    }

    public void setBrowser(boolean browser) {
        this.browser = browser;
    }
}
