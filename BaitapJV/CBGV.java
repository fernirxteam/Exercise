package Baitap.Exercise;

import java.util.Scanner;

public class CBGV extends Person  {
    public double hardSalary;
    public double salaryAndBonus;
    public double fine;
    public double salary;

    public CBGV (){

    }
    
    public CBGV (double hardSalary,double salaryAndBonus,double fine,double salary,String name, int age, String homeTown, String teacherCode){
        super( name, age, homeTown, teacherCode);
        this.hardSalary=hardSalary;
        this.salaryAndBonus=salaryAndBonus;
        this.fine=fine;
        this.salary=salary;
    }

   
    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }

    public double getSalaryAndBonus() {
        return salaryAndBonus;
    }

    public void setSalaryAndBonus(double salaryAndBonus) {
        this.salaryAndBonus = salaryAndBonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void disPlay(){
        System.out.println("Name          : " + getName());
        System.out.println("Age           : " + getAge());
        System.out.println("HomeTown      : " + getHomeTown());
        System.out.println("TeachCode     : " + getTeacherCode());
        System.out.println("HardSalary    : " + hardSalary);
        System.out.println("SalaryAndBonus: " + salaryAndBonus);
        System.out.println("Fine          : " + fine );
        System.out.println("salary        : " + (hardSalary + salaryAndBonus - fine));
    }
}




