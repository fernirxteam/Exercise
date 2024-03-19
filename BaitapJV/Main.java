package Baitap.Exercise;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Administer ad = new Administer();
        CBGV cb;
        String choose;
        do{
            System.out.println("_______________________MENU________________________ ");
            System.out.println("|             1)Them thong tin giao vien           |");
            choose=sc.next();
            switch (choose) {
                case "1":
                cb = new CBGV();
                sc.nextLine();
                System.out.println("Enter a name         : "); cb.setName(sc.next());
                System.out.println("Enter age            : "); cb.setAge(sc.nextInt());
                sc.nextLine();
                System.out.println("Enter a hometown     : "); cb.setHomeTown(sc.next());
                System.out.println("Enter teacherCode    : "); cb.setTeacherCode(sc.next());
                sc.nextLine();
                System.out.println("Enter hardSalary     : "); cb.setHardSalary(sc.nextDouble());
                System.out.println("Enter salaryAndBonus : "); cb.setSalaryAndBonus(sc.nextDouble());
                System.out.println("Enter fine           : "); cb.setFine(sc.nextDouble());
                ad.add(cb);
                System.out.println(" ");
                    break;
                case "2":
                System.out.println("List CBGV : ");
                ad.disPlayCBGV();
                    break;
            
                default:
                    break;
            }
        }while(choose !="-99");
    }
}
