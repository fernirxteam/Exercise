package Baitap.Exercise;

import java.util.Scanner;

public class CBGV extends Person  {
    public double hardSalary;
    public double salaryAndBonus;
    public double fine;
    public double staticFood;

    public CBGV (){

    }
    
    public CBGV (double hardSalary,double salaryAndBonus,double fine,double staticFood,String name, int age, String homeTown, String teacherCode){
        super( name, age, homeTown, teacherCode);
        this.hardSalary=hardSalary;
        this.salaryAndBonus=salaryAndBonus;
        this.fine=fine;
        this.staticFood=staticFood;
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

    public double getStaticFood() {
        return staticFood;
    }

    public void setStaticFood(double staticFood) {
        this.staticFood = staticFood;
    }
    
    public void showStaticFood(){
        System.out.println("StaticFood    : " + (hardSalary + salaryAndBonus - fine));
    }

    public void disPlay(){
        System.out.println("Name          : " + getName());
        System.out.println("Name          : " + getAge());
        System.out.println("Name          : " + getHomeTown());
        System.out.println("Name          : " + getTeacherCode());
        System.out.println("HardSalary    : " + hardSalary);
        System.out.println("SalaryAndBonus: " + salaryAndBonus);
        System.out.println("Fine          : " + fine );
        System.out.println("staticFood    : " + (hardSalary + salaryAndBonus - fine));
    }
}




