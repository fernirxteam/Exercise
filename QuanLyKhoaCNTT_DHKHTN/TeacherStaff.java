package QuanLyKhoaCNTT_DHKHTN;

public class TeacherStaff extends person {
    private int hardSalary;
    private int bonusSalary;
    private int netSalary;
    private String code;
    private int fine;

    public TeacherStaff() {

    }

    public TeacherStaff(int hardSalary, int bonusSalary, int netSalary, String code, int fine) {
        this.hardSalary = hardSalary;
        this.bonusSalary = bonusSalary;
        this.netSalary = netSalary;
        this.code = code;
        this.fine = fine;
    }

    public TeacherStaff(String name, int age, String adress, int hardSalary, int bonusSalary, int netSalary,
            String code, int fine) {
        super(name, age, adress);
        this.hardSalary = hardSalary;
        this.bonusSalary = bonusSalary;
        this.netSalary = netSalary;
        this.code = code;
        this.fine = fine;
    }

    public int getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(int hardSalary) {
        this.hardSalary = hardSalary;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public int getNetSalary() {
        return (hardSalary + bonusSalary - fine);
    }

    public void setNetSalary(int netSalary) {
        this.netSalary = netSalary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public void showTeacherStaff() {
        System.out.println("~~~~~~~~~~~~~~~~~");
        System.out.println("Ma giao vien: " + getCode());
        System.out.println("Ten giao vien: " + getName());
        System.out.println("Tuoi giao vien:" + getAge());
        System.out.println("Dia chi: " + getAdress());
        System.out.println("Luong cung: " + getHardSalary());
        System.out.println("Luong thuong: " + getBonusSalary());
        System.out.println("Tien phat: " + getFine());
        System.out.println("luong thuc linh: " + getNetSalary());
        System.out.println("~~~~~~~~~~~~~~~~~");
    }

}
