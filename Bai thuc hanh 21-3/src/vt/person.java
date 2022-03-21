package vt;

import java.util.Scanner;

public class person {
    String PersonID;
    String PersonName;
    boolean Gender;
    String Address;
    Scanner sc = new Scanner(System.in);

    public void nhap(){
        System.out.println("Nhap ID:");
        PersonID = sc.nextLine();
        System.out.println("Nhap Name:");
        PersonName = sc.nextLine();
        System.out.println("Nhap Gender:");
        Gender = sc.nextBoolean();
        System.out.println("Nhap Address:");
        Address = sc.nextLine();
    }

    public void in(){
        System.out.println("ID:"+ PersonID);
        System.out.println("Name:"+ PersonName);
        System.out.println("Gender:"+ Gender);
        System.out.println("ID:"+ Address);
        if (Gender == true) {
        	System.out.println("nam");
        }
        else {
        	System.out.println("nu");
        }
        	
    }

}