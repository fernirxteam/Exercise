package QuanLyKhoaCNTT_DHKHTN;

import java.util.ArrayList;

public class ManagermentOfTeacherStaff {

    private ArrayList<TeacherStaff> teachers;

    public ManagermentOfTeacherStaff() {
        this.teachers = new ArrayList<>();
    }

    public ManagermentOfTeacherStaff(ArrayList<TeacherStaff> teachers) {
        this();
        this.teachers = teachers;
    }

    public boolean duplicationCode(String code) {
        if (teachers.size() >= 1) {
            for (TeacherStaff teacherStaff : teachers) {
                if (teacherStaff.getCode().equals(code)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean addTeacherStaff(TeacherStaff teachers) {
        if (duplicationCode(teachers.getCode())) {
            this.teachers.add(teachers);
            return true;
        } else {
            System.out.println("ma trung roi vui long nhap lai");
            return false;
        }
    }

    public void showALLTeacherStaff() {
        for (TeacherStaff teacherStaff : teachers) {
            teacherStaff.showTeacherStaff();
        }
    }

    public boolean removeTeacherStaff(String code) {
        for (TeacherStaff teacherStaff : teachers) {
            if (teacherStaff.getCode().equals(code)) {
                teachers.remove(teacherStaff);
                return true;
            }
        }
        return false;
    }
}