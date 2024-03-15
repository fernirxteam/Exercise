public class Nguoi
{
    private String Hoten;
    private String quequan;
    private String MS;
    private int age;
    public CBGV(string hoten,string quequan,string MS,int age)
    {
        this.Hoten=hoten;
        this.quequan=quequan;
        this.MS=MS;
        this.age=age;
    }
    public void Ten()
    {
      System.out.println("Ten: "+hoten);
    }
    public void MS()
    {
      System.out.println("MSSV: "+MS );
    }
    public void quequan()
    {
      System.out.println("Que Quan: "+quequan);
    }
    public int tuoi()
    {
      return age;
    }
}