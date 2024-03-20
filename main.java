import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        CBGV[] cbgv=new CBGV[100];
        people[] peo=new people[100];
        int dem=0;
        int i=0;
        do{

        
        System.out.println("-----------MENU--------------");
        System.out.println("1 xuat");
        System.out.println("2 nhap");
        System.out.println("3 them nv");
        System.out.println("-99 exit" );
        System.out.println("------------END---------------");
        int chon;
        System.out.print("nhap chon = ");
        chon=sc.nextInt();
        if(chon==-99)
        break;
        switch (chon) {
            case 1:
            System.out.println("nhap so nv= ");;
            i=sc.nextInt();
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
                break;
        case 2:
        for(int j=0;j<i;j++)
        {
            cbgv[j].Xuat();
            peo[j].Xuat();
        }
        break;
        case 3:

        for(int j=i;j<i+1;j++)
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
           peo[j]=new people(ht, qq, ms, age);
         
        }
        i++;
        break;
        case 4:
          String machon;
          sc.nextLine();
          System.out.println("Nhap ma so can chon= ");
          machon=sc.nextLine();
          int count=0;
          for(int d=0;d<i;d++)
          {
             if(peo[i].getMS()==machon)
             {
                 break;
             }
             count++;        
          }

          if(count==i-1)
          i--;
          else
          {
          for(int d=count;d<i+1;d++)
          {
              peo[d]=peo[d+1];
              cbgv[d]=cbgv[d+1];
          }
          i--;
          break;
        }
            default:
                break;
    
       }
        
    }while(true);
}
}
