package attribute;

import java.util.Date;
import java.util.List;

public class serviceattribute {

    private String[] type;
    private Date[] create_time;
    private String[] create_by;
    private String[] object;

    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    public Date[] getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date[] create_time) {
        this.create_time = create_time;
    }

    public String[] getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String[] create_by) {
        this.create_by = create_by;
    }

    public String[] getObject() {
        return object;
    }

    public void setObject(String[] object) {
        this.object = object;
    }
}
