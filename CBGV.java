
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
    public int getluongcung()
    {
      return this.luongcung;
    }
    public int getluongthuong()
    {
      return this.luongthuong;
    }
    public int gettienphat()
    {
      return this.tienphat;
    }
    public void Xuat()
    {
      System.out.println("luong cung = "+this.luongcung);
      System.out.println("luongthuong=  " + this.luongthuong);
      System.out.println(" tienphat= "+this.tienphat);
    }
  }

