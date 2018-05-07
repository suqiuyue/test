package attribute;

import java.util.Date;
import java.util.List;

public class serviceattribute {

    private List<String> type;
    private List<Date> create_time;
    private List<String> create_by;
    private List<String> object;

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public List<Date> getCreate_time() {
        return create_time;
    }

    public void setCreate_time(List<Date> create_time) {
        this.create_time = create_time;
    }

    public List<String> getCreate_by() {
        return create_by;
    }

    public void setCreate_by(List<String> create_by) {
        this.create_by = create_by;
    }

    public List<String> getObject() {
        return object;
    }

    public void setObject(List<String> object) {
        this.object = object;
    }
}
