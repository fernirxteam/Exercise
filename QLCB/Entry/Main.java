package Entry;

import java.util.*;

import QuanLyCanBo.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyCBGV qlcb = new QuanLyCBGV();
        int luaChon;
        int i = 0;
        CBGV cb;
        do {
            System.out.println("-------------------------------");
            System.out.println("| 1. Them giao vien.          |");
            System.out.println("| 2. Xuat thong tin giao vien.|");
            System.out.println("| 3. Xoa giao vien.           |");
            System.out.println("| 4. So tien luong thuc linh. |");
            System.out.println("| 5. Thoat khoi chuong trinh. |");
            System.out.println("-------------------------------");
            System.out.println(" ");
            System.out.print("Nhap vao chuc nang muon thuc hien : "); luaChon = sc.nextInt();
            System.out.println(" ");
            switch (luaChon) {
                case 1:
                    i++;
                    System.out.println("Nhap vao thong tin CBGV thu " + i + " !  ");
                    cb = new CBGV();
                    sc.nextLine();
                    System.out.print("Nhap vao ten GV : "); cb.setHoTen(sc.nextLine());
                    System.out.print("Nhap vao tuoi GV : "); cb.setTuoi(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Nhap vao que quan GV : "); cb.setQueQuan(sc.nextLine());
                    System.out.print("Nhap vao ma GV : "); cb.setMsGV(sc.nextLine());
                    System.out.print("Nhap vao luong cung : "); cb.setLuongCung(sc.nextInt()); 
                    System.out.print("Nhap vao luong thuong : "); cb.setLuongThuong(sc.nextInt());
                    System.out.print("Nhap vao tien phat : "); cb.setTienPhat(sc.nextInt());
                    qlcb.themCBGV(cb);
                    System.out.println(" ");
                    break;
                case 2:
                    i++;
                    System.out.println("DANH SACH CAN BO GIAO VIEN !!!");
                    qlcb.xuatCBGV();
                    break;
                case 3:
                    sc.nextLine();
                    String maCanTim;
                    System.out.print("Nhap vao ma giao vien can xoa : "); maCanTim = sc.nextLine();
                    while (qlcb.xoaCB(maCanTim) == 0) {
                        System.out.println("Khong tim thay ma can bo muon xoa.");
                        System.out.print("Vui long nhap lai ma CB : "); maCanTim = sc.nextLine();
                    }
                    System.out.println("DA XOA !!!");
                    break;
                case 5:
                    System.out.println(" TAM BIET BAE !!!!");
                    sc.close();
                    return;
                default:
                    break;
            }
        }while (true);
    }
}
