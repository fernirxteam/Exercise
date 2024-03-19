

public class people
{
    private String Hoten;
    private String quequan;
    private String MS;
    private int age;
    public people(String hoten,String quequan,String MS,int age)
    {
        this.Hoten=hoten;
        this.quequan=quequan;
        this.MS=MS;
        this.age=age;
    }
    public String getTen()
    {
      return this.Hoten;
    }
    public String getMS()
    {
      return this.MS;
    }
    public String getquequan()
    {
     return this.quequan;
    }
    public int gettuoi()
    {
      return age;
    }
    public void Xuat()
    {
      System.out.println("xuat ten: "+Hoten);
      System.out.println("xuat que quan "+quequan);
      System.out.println("xuat ma so "+MS);
      System.out.println("tuoi=  "+age);
    }
  }