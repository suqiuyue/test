package attribute;

import java.util.Date;
import java.util.List;

public class objectAttribute {

    private List<String> type; //类型
    private List<Long> size; //大小
    private List<Date> create_time; //创建时间
    private List<Date> update_time; //修改时间
    private List<String> create_by; //创建人
    private List<String> security_level; //安全级别
    private List<String> tag; //标签
    private List<String> permission; //权限


    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
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

    public List<String> getCreate_by() {
        return create_by;
    }

    public void setCreate_by(List<String> create_by) {
        this.create_by = create_by;
    }

    public List<String> getSecurity_level() {
        return security_level;
    }

    public void setSecurity_level(List<String> security_level) {
        this.security_level = security_level;
    }

    public List<String> getTag() {
        return tag;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }

    public List<String> getPermission() {
        return permission;
    }

    public void setPermission(List<String> permission) {
        this.permission = permission;
    }
}
