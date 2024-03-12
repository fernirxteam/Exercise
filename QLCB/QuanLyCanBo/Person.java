package QuanLyCanBo;

public class Person {
    private String hoTen;
    private int tuoi;
    private String queQuan;
    private String msGV;

    public Person() {
        
    }

    public Person(String hoTen, int tuoi, String queQuan, String msGV) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.msGV = msGV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getMsGV() {
        return msGV;
    }

    public void setMsGV(String msGV) {
        this.msGV = msGV;
    }
}