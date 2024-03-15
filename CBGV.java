public class CBGV
{
    private int luongcung;
    private int luongthuong;
    private int tienphat;
    public CBGV(int luongcung,int luongthuong,int tienphat)
    {
       
       this.luongcung=luongcung;
       this.luongthuong=luongthuong;
       this.tienphat=tienphat;
    }
  public int getluong()
  {
    return luongcung+luongthuong-tienphat;
  }
 
}