package attribute;

import java.util.Date;
import java.util.List;

public class envattribute {

    private List<String> city; //城市
    private List<String> street; //街道
    private List<String> country; //国家
    private List<Date> access_time;  //访问时间
    private List<Date> expiry_time;  //过期时间
    private List<String> os_type; //操作系统
    private List<String> access_type;//访问类型
    private boolean browser; //浏览器

    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }

    public List<String> getStreet() {
        return street;
    }

    public void setStreet(List<String> street) {
        this.street = street;
    }

    public List<String> getCountry() {
        return country;
    }

    public void setCountry(List<String> country) {
        this.country = country;
    }

    public List<Date> getAccess_time() {
        return access_time;
    }

    public void setAccess_time(List<Date> access_time) {
        this.access_time = access_time;
    }

    public List<Date> getExpiry_time() {
        return expiry_time;
    }

    public void setExpiry_time(List<Date> expiry_time) {
        this.expiry_time = expiry_time;
    }

    public List<String> getOs_type() {
        return os_type;
    }

    public void setOs_type(List<String> os_type) {
        this.os_type = os_type;
    }

    public List<String> getAccess_type() {
        return access_type;
    }

    public void setAccess_type(List<String> access_type) {
        this.access_type = access_type;
    }

    public boolean isBrowser() {
        return browser;
    }

    public void setBrowser(boolean browser) {
        this.browser = browser;
    }
}
