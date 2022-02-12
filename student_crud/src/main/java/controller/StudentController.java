package controller;

public class StudentController {

    int stu_id;
    String stu_name;
    String stu_address;
    Long stu_phone_no;
    String stu_course;

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public String getStu_address() {
        return stu_address;
    }

    public void setStu_address(String stu_address) {
        this.stu_address = stu_address;
    }

    public Long getStu_phone_no() {
        return stu_phone_no;
    }

    public void setStu_phone_no(Long stu_phone_no) {
        this.stu_phone_no = stu_phone_no;
    }

    public String getStu_course() {
        return stu_course;
    }

    public void setStu_course(String stu_course) {
        this.stu_course = stu_course;
    }
}
