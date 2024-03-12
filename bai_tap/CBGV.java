package bai_tap;

public class CBGV extends Person {
    private String code;
    private double fixedSalary;
    private double bonus;
    private double Salary;

    public CBGV(){
    }

    public CBGV(String code, double fixedSalary, double bonus, double Salary){
        this.code = code;
        this.fixedSalary = fixedSalary;
        this.bonus = bonus;
        this.Salary = Salary;
    }

}
