package vt;

import java.util.Scanner;

public class hinhchunhat {
    float dai, rong, cv, dt;

    public void nhapchieudai() {
        System.out.println("nhap chieu dai hcn: ");
        Scanner scanner = new Scanner(System.in);
        dai = scanner.nextFloat();
    }

    public void nhapchieurong() {
        System.out.println("nhap chieu rong: ");
        Scanner scanner = new Scanner(System.in);
        rong = scanner.nextFloat();
    }

    public void tinhcv() {
        cv = 2 * (dai + rong);
    }

    public void tinhdt() {
        dt = dai * rong;
    }

    public void incv() {
        System.out.println("Chu vi hinh chu nhat la: " + cv);
    }

    public void indt() {
        System.out.println("Dien tich hinh chu nhat la: " + dt);
    }
}