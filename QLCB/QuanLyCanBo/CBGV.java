package QuanLyCanBo;


public class CBGV extends Person{
    private double luongCung;
    private double luongThuong;
    private double tienPhat;
    
    public CBGV() {

    }

    public CBGV(String hoTen, int tuoi, String queQuan, String msGV, double luongCung, double luongThuong, double tienPhat) {
        super(hoTen, tuoi, queQuan, msGV);
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.tienPhat =tienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    public double getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(double tienPhat) {
        this.tienPhat = tienPhat;
    }

    public void xuatThongTinGV() {
        System.out.println("Ten GV : " + getHoTen());
        System.out.println("Tuoi GV : " + getTuoi()); 
        System.out.println("Que quan GV : " + getQueQuan());
        System.out.println("Ma so GV : " + getMsGV()); 
        System.out.println("Luong cung : " + luongCung); 
        System.out.println("Luong thuong : " + luongThuong); 
        System.out.println("Tien phat :" + tienPhat);
        System.out.println("Luong thuc linh : " + (luongCung + luongThuong - tienPhat)); 
    }
}