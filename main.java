import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int i;
        System.out.println("nhap so nv= ");;
        i=sc.nextInt();
        CBGV[] cbgv=new CBGV[i];
        people[] peo=new people[i];
        int dem=0;
        for(int j=0;j<i;j++)
        { 
           dem++;
            int lc,lt,tp,age;
            String ht,ms,qq;
            System.out.println("nhap luong thuong nguoi thu "+dem+": ");
            lc=sc.nextInt();
            System.out.println("nhap luong thuong nguoi thu "+dem+": ");
            lt=sc.nextInt();
            System.out.println("nhap tien phat nguoi thu "+dem+": ");
            tp=sc.nextInt();
           cbgv[j] =new CBGV(lc,lt,tp);
            sc.nextLine();
           System.out.println("nhap ho ten nguoi thu "+dem+": ");
           ht=sc.nextLine();
           System.out.println("nhap que quan nguoi thu "+dem+": ");
           qq=sc.nextLine();
           System.out.println("nhap ma so nguoi thu "+dem+": ");
           ms=sc.nextLine();
           System.out.println("nhap tuoi nguoi thu "+dem+": ");
           age=sc.nextInt();
           peo[j]=new people(ht,qq,ms,age);

        }
        for(int j=0;j<i;j++)
        {
            cbgv[j].Xuat();
            peo[j].Xuat();
        }
    }
}