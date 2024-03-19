package bai_tap;
import java.util.ArrayList;
public class QuanLyCBGV {
    private ArrayList<CBGV> ls;

    public QuanLyCBGV(){
        ls = new ArrayList<CBGV>();
    }

    public QuanLyCBGV(ArrayList<CBGV> ls){
        this();
        this.ls = ls;
    }

    public void addCBGV(CBGV cb){
        if (checkSame(cb.getCode())){
            System.out.println("ma nhan vien bi trung !");
        }
        else
         ls.add(cb);
    }

    public void xuat() {
        for (CBGV cb : ls) {
            cb.showInformation();
            System.out.println();
        }
    }

    public boolean checkSame(String code) {
        for (CBGV cb : ls){
            if (cb.getCode().equals(code)) {
                return true;
            }
        }
        return false;
    }

    public void xuatLuong() {
        for (CBGV cb : ls) {
            cb.showSalary();
            System.out.println();
        }
    }

    public boolean searchCode(String code){
        for (CBGV cb : ls){
            if (code.equals(cb.getCode())){
                return true;
            }
        }
        return false;
    }

    public int deleteCode(String code){
        for (CBGV cb : ls){
            if (code.equals(cb.getCode())){
                ls.remove(cb);
                return ls.indexOf(cb);
            }
        }
        return 0;
    }

}
