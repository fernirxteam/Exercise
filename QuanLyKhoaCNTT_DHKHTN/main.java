package QuanLyKhoaCNTT_DHKHTN;

import java.util.Scanner;

/**
 * main
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TeacherStaff tF = new TeacherStaff();
        ManagermentOfTeacherStaff mOTS = new ManagermentOfTeacherStaff();
        int option;
        String code, name, adress;
        int age, hardSalary, bonusSalary, fine;

        do {
            System.out.println(" ________________________________________________");
            System.out.println("|         (1).them thong tin giao vien           |");
            System.out.println("|     (2)Xoa thong tin giao vien theo ma         |");
            System.out.println("|    (3)Hien thi danh sách cán bo giang vien     |");
            System.out.println("|                 (4)thoát                       |");
            System.out.println("|________________________________________________|");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    sc.nextLine();
                    System.out.println("-------------+-------------");
                    System.out.print("Ma giáo vien: ");
                    code = sc.nextLine();
                    System.out.print("Ten giáo vien: ");
                    name = sc.nextLine();
                    System.out.print("Tuoi giáo vien: ");
                    age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Dia chi giáo vien: ");
                    adress = sc.nextLine();
                    System.out.print("Luong cung: ");
                    hardSalary = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Luong thuong: ");
                    bonusSalary = sc.nextInt();
                    System.out.print("Tien phat: ");
                    fine = sc.nextInt();
                    tF = new TeacherStaff(name, age, adress, hardSalary, bonusSalary, 0, code, fine);
                    System.out.println("-------------+-------------");
                    if (mOTS.addTeacherStaff(tF)) {
                        System.out.println(" _______________________");
                        System.out.println("|  DA THEM THANH CONG   |");
                        System.out.println("|_______________________|");
                    } else {
                        System.out.println(" _______________________");
                        System.out.println("|     MA DA TON TAI     |");
                        System.out.println("|_______________________|");
                    }
                    break;
                case 2:
                    System.out.println("Ma giao vien can xoá");
                    sc.nextLine();
                    code = sc.nextLine();

                    if (mOTS.removeTeacherStaff(code)) {
                        System.out.println(" _______________________");
                        System.out.println("|   DA XOA THANH CONG   |");
                        System.out.println("|_______________________|");
                    } else {
                        System.out.println(" _______________________");
                        System.out.println("|      XOA THAT BAI     |");
                        System.out.println("|_______________________|");
                    }
                    break;
                case 3:
                    mOTS.showALLTeacherStaff();
                    break;
            }

        } while (option != 4);

    }

}