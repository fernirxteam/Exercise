package bai_tap;

public class CBGV extends Person {
    private double fixedSalary;
    private double bonus;
    private double Salary;

    public CBGV(){
    }

    public CBGV(String code, String name, int age, String gender, String address, double fixedSalary, double bonus, double Salary){
        super(name, age, gender, address, code);
        this.fixedSalary = fixedSalary;
        this.bonus = bonus;
        this.Salary = Salary;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

}
