package vt;

import java.util.Scanner;
public class sinhvien{
    String msv;
    String HoTen;
    String DiaChi;
    String Ngaysinh;
    Boolean GioiTinh;
    Scanner scanner = new Scanner(System.in);
    public void nhap() {
        System.out.println("nhap MSV: ");
        msv = scanner.nextLine();
        System.out.println("nhap Ho ten: ");
        HoTen = scanner.nextLine();
        System.out.println("nhap dia chi: ");
        DiaChi = scanner.nextLine();
        System.out.println("nhap ngay sinh: ");
        Ngaysinh = scanner.nextLine();
        System.out.println("nhap gioi tinh: ");
        GioiTinh = scanner.nextBoolean();
    }
    public void in() {
        System.out.println("ma sv: " + msv);
        System.out.println("ho ten: " + HoTen);
        System.out.println("dia chi: " + DiaChi);
        System.out.println("ngay sinh: " + Ngaysinh);
        if (GioiTinh == true)
        {
            System.out.println("nam");
        }
        else
        {
            System.out.println("nu");
        }
    }
}