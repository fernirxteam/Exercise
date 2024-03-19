package Baitap.Exercise;
import java.util.*;
public class Person {
    private String name;
    private int age;
    private String homeTown;
    private String teacherCode;

    public Person(){
        
    }

    public Person(String name, int age, String homeTown, String teacherCode) {
        this.name = name;
        this.age = age;
        this.homeTown = homeTown;
        this.teacherCode = teacherCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }
}
