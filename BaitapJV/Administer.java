package Baitap.Exercise;

import java.util.ArrayList;

public class Administer{
    private ArrayList<CBGV> ds;

    public Administer(){
        ds = new ArrayList();
    }

    public Administer(ArrayList<CBGV>ds){
        this();
        this.ds=ds;
    }

    public boolean checkForDuplicates(String teachCode){
        if(ds.size()>=1){
            for (CBGV cbgv : ds) {
                if(cbgv.getTeacherCode().equals(teachCode)){
                    return true;
                }
            }
        } return false;
    } 

    public void add(CBGV cb){
        if(checkForDuplicates(cb.getTeacherCode())){
            System.out.println("Click again");
        }
        else{
            ds.add(cb);
        }
    }

    public void disPlayCBGV(){
        int i=0;
        for (CBGV cb : ds) {
            i++;
            System.out.println("CBGV : " + i  );
            cb.disPlay();
        }
    }

    
}