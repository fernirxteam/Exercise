package bai_tap;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String code;

    public Person(){
    }

    public Person(String name, int age, String gender, String address, String code){
        this.name = name;
        this.age  = age;
        this.gender = gender;
        this.address = address;
        this.code = code;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }
}