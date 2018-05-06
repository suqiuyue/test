package attribute;

import java.util.Date;

public class objectAttribute {

    private String type; //类型
    private long size; //大小
    private Date create_time; //创建时间
    private Date update_time; //修改时间
    private String create_by; //创建人
    private String security_level; //安全级别
    private String tag; //标签
    private String permission; //权限


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public String getSecurity_level() {
        return security_level;
    }

    public void setSecurity_level(String security_level) {
        this.security_level = security_level;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
