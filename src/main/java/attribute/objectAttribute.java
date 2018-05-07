package attribute;

import java.util.Date;
import java.util.List;

public class objectAttribute {

    private List<Date> type; //类型
    private List<Long> size; //大小
    private List<Date> create_time; //创建时间
    private List<Date> update_time; //修改时间
    private List<Date> create_by; //创建人
    private List<Date> security_level; //安全级别
    private List<Date> tag; //标签
    private List<Date> permission; //权限


    public List<Date> getType() {
        return type;
    }

    public void setType(List<Date> type) {
        this.type = type;
    }

    public List<Long> getSize() {
        return size;
    }

    public void setSize(List<Long> size) {
        this.size = size;
    }

    public List<Date> getCreate_time() {
        return create_time;
    }

    public void setCreate_time(List<Date> create_time) {
        this.create_time = create_time;
    }

    public List<Date> getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(List<Date> update_time) {
        this.update_time = update_time;
    }

    public List<Date> getCreate_by() {
        return create_by;
    }

    public void setCreate_by(List<Date> create_by) {
        this.create_by = create_by;
    }

    public List<Date> getSecurity_level() {
        return security_level;
    }

    public void setSecurity_level(List<Date> security_level) {
        this.security_level = security_level;
    }

    public List<Date> getTag() {
        return tag;
    }

    public void setTag(List<Date> tag) {
        this.tag = tag;
    }

    public List<Date> getPermission() {
        return permission;
    }

    public void setPermission(List<Date> permission) {
        this.permission = permission;
    }
}
