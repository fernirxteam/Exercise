package bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyCBGV qlcb = new QuanLyCBGV();
        String luaChon;
        int i = 0;
        do {
            System.out.println(" _____________________________ ");
            System.out.println("| 1. Them giao vien.          |");
            System.out.println("| 2. Xuat thong tin giao vien.|");
            System.out.println("| 3. Xoa giao vien.           |");
            System.out.println("| 4. So tien luong thuc linh. |");
            System.out.println("| 5. Thoat chuong trinh.      |");
            System.out.println("|_____________________________|");
            System.out.println(" ");
            System.out.print("Nhap vao chuc nang muon thuc hien : ");
            luaChon = sc.nextLine();
            System.out.println(" ");
            switch (luaChon) {
                case "1":
                    CBGV cb = new CBGV();
                    System.out.println("can bo " + (i + 1) + " : ");
                    System.out.println("nhap ho ten : ");
                    cb.setName(sc.nextLine());
                    System.out.println("nhap tuoi : ");
                    cb.setAge(sc.nextInt());
                    sc.nextLine();
                    System.out.println("nhap gioi tinh : ");
                    cb.setGender(sc.nextLine());
                    System.out.println("nhap dia chi : ");
                    cb.setAddress(sc.nextLine());
                    System.out.println("nhap ma code : ");
                    cb.setCode(sc.nextLine());
                    System.out.println("nhap luong cung : ");
                    cb.setFixedSalary(sc.nextDouble());
                    System.out.println("nhap luong thuong : ");
                    cb.setBonus(sc.nextDouble());
                    System.out.println("nhap tien phat : ");
                    cb.setBinance(sc.nextDouble());
                    sc.nextLine();
                    i++;
                    qlcb.addCBGV(cb);
                    break;
                case "2":
                    System.out.println("-------- thong tin cbgv --------");
                    qlcb.xuat();
                    break;
                case "3":
                    String code;
                    System.out.println("nhap ma nguoi ban muon xoa : ");
                    code = sc.nextLine();
                    while (qlcb.deleteCode(code) == 0){
                        System.out.println("khong tim thay ma !");
                        System.out.println("nhap lai ma nguoi ban muon xoa : ");
                        code = sc.nextLine();
                    }
                    System.out.println("da xoa thanh cong !");
                    break;
                case "4":
                    qlcb.xuatLuong();
                    break;
                case "5":
                    System.out.println("ban da chon thoat chuong trinh !");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while (true);
    }
}
