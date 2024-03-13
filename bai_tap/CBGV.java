package bai_tap;

public class CBGV extends Person {
    private double fixedSalary;
    private double bonus;
    private double binance;

    public CBGV(){
    }

    public CBGV(String code, String name, int age, String gender, String address, double fixedSalary, double bonus, double binance){
        super(name, age, gender, address, code);
        this.fixedSalary = fixedSalary;
        this.bonus = bonus;
        this.binance = binance;
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

    public double getBinance() {
        return binance;
    }

    public void setBinance(double binance) {
        this.binance = binance ;
    }

    public void showInformation(){
        System.out.println("ho ten : " + getName());
        System.out.println("tuoi : " + getAge());
        System.out.println("gioi tinh : " + getGender());
        System.out.println("dia chi : " + getAddress());
        System.out.println("ma code : " + getCode());
        System.out.println("luong cung : " + fixedSalary);
        System.out.println("luong thuong : " + bonus);
        System.out.println("tien phat : " + binance);
    }

    public void showSalary(){
        System.out.println("ho ten : " + getName());
        System.out.println("luong thuc linh : " + (fixedSalary + bonus - binance));
    }
}
