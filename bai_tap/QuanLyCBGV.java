package bai_tap;
import java.util.ArrayList;

public class QuanLyCBGV {
    private ArrayList<CBGV> ls;

    public QuanLyCBGV(){
        ls = new ArrayList<CBGV>();
    }

    public void addCBGV(CBGV cb){
        ls.add(cb);
    }

    public void xuat() {
        for (CBGV cb : ls) {
            cb.xuatThongTinHangHoa();
            System.out.println();
        }
    }
}
