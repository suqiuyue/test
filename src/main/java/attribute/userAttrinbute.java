package attribute;

import java.util.List;

public class userAttrinbute {
    public List<String> gender;  //性别
    private List<String> political_status; //政治面貌
    private List<String> type_of_certificate; //证件类型
    private List<String> family_address; //家庭住址
    private List<String> department; //部门
    private List<String> degree; //学位
    private List<Integer> age; //年龄
    private List<String> phone_num; //电话号码
    private List<String> email; //邮箱
    private List<String>  position; //职位
    private List<Integer> work_age; //工龄
    private List<String> blood_type; //血型
    private int weight; //体重
    private boolean is_marry; //是否结婚
    private boolean is_criminal; //是否有犯罪前科
    private boolean is_working;//是否在职

    public List<String> getGender() {
        return gender;
    }

    public void setGender(List<String> gender) {
        this.gender = gender;
    }

    public List<String> getPolitical_status() {
        return political_status;
    }

    public void setPolitical_status(List<String> political_status) {
        this.political_status = political_status;
    }

    public List<String> getType_of_certificate() {
        return type_of_certificate;
    }

    public void setType_of_certificate(List<String> type_of_certificate) {
        this.type_of_certificate = type_of_certificate;
    }

    public List<String> getFamily_address() {
        return family_address;
    }

    public void setFamily_address(List<String> family_address) {
        this.family_address = family_address;
    }

    public List<String> getDepartment() {
        return department;
    }

    public void setDepartment(List<String> department) {
        this.department = department;
    }

    public List<String> getDegree() {
        return degree;
    }

    public void setDegree(List<String> degree) {
        this.degree = degree;
    }

    public List<Integer> getAge() {
        return age;
    }

    public void setAge(List<Integer> age) {
        this.age = age;
    }

    public List<String> getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(List<String> phone_num) {
        this.phone_num = phone_num;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public List<String> getPosition() {
        return position;
    }

    public void setPosition(List<String> position) {
        this.position = position;
    }

    public List<Integer> getWork_age() {
        return work_age;
    }

    public void setWork_age(List<Integer> work_age) {
        this.work_age = work_age;
    }

    public List<String> getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(List<String> blood_type) {
        this.blood_type = blood_type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isIs_marry() {
        return is_marry;
    }

    public void setIs_marry(boolean is_marry) {
        this.is_marry = is_marry;
    }

    public boolean isIs_criminal() {
        return is_criminal;
    }

    public void setIs_criminal(boolean is_criminal) {
        this.is_criminal = is_criminal;
    }

    public boolean isIs_working() {
        return is_working;
    }

    public void setIs_working(boolean is_working) {
        this.is_working = is_working;
    }
}
