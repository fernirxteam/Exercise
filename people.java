import java.util.Scanner;

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
  //   public people[] ThemNV(people peo,int i)
  //   {
  //    Scanner sc= new Scanner(System.in);
  //   int dem =i;

  //   String ht,ms,qq;
  //   int age;
  //     sc.nextLine();
  //     System.out.println("nhap ho ten nguoi thu "+dem+": ");
  //     ht=sc.nextLine();
  //     System.out.println("nhap que quan nguoi thu "+dem+": ");
  //     qq=sc.nextLine();
  //     System.out.println("nhap ma so nguoi thu "+dem+": ");
  //     ms=sc.nextLine();
  //     System.out.println("nhap tuoi nguoi thu "+dem+": ");
  //     age=sc.nextInt();
  //     i++;
  //      [] peo=new people[i];

  //     return peo;
     

  //   }
  // }
