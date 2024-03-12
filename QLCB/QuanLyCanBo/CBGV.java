package QuanLyCanBo;

public class CBGV {
    private int luongCung;
    private int luongThuong;
    private int tienPhat;
    
    public CBGV() {

    }

    public CBGV(int luongCung, int luongThuong, int tienPhat) {
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.tienPhat =tienPhat;
    }

    public int getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }

    public int getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(int luongThuong) {
        this.luongThuong = luongThuong;
    }

    public int getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(int tienPhat) {
        this.tienPhat = tienPhat;
    }
}