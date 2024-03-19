package QuanLyCanBo;
import java.util.*;

public class QuanLyCBGV {
    private ArrayList<CBGV> cb;


    public QuanLyCBGV() {
        cb = new ArrayList<CBGV>();
    }

    public QuanLyCBGV(ArrayList<CBGV> cb) {
        this();
        this.cb = cb;
    }

    public void themCBGV(CBGV gv) {
        System.out.println("   ");
        if(kTraMsGV(gv.getMsGV())) {
            System.out.println("Ma GV bi trung ! Nhap lai thong tin");
        }else cb.add(gv);
    }

   public void xuatCBGV() {
        int i = 0;
        for (CBGV gv : cb) {
            i++;
            System.out.println("CAN BO THU " + i + " !");
            gv.xuatThongTinGV();
                  System.out.println(" ");
        }
   }

    public boolean kTraMsGV(String maCanTim) {
        for (CBGV gv : cb) {
            if(gv.getMsGV().equals(maCanTim))
                return true;
        }
        return false;
    }

    public int xoaCB(String maCB){
        for (CBGV gv : cb){
                if (maCB.equals(gv.getMsGV())){
                    cb.remove(gv);
                return cb.indexOf(gv);
            }
        }
        return 0;
    }
}
