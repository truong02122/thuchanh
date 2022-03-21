package main;

import vt.*;

public class app2103 {

	public static void main(String[] args) {
		 System.out.println("********************");
		 System.out.println("******hinhchunhat***");
		 System.out.println("********************");
	     hinhchunhat hcn = new hinhchunhat();
	        hcn.nhapchieudai();
	        hcn.nhapchieurong();
	        hcn.tinhcv();
	        hcn.tinhdt();
	        hcn.incv();
	        hcn.indt();
	     System.out.println("*******************");
	     System.out.println("*******person******");
	     System.out.println("*******************");
	     person ps= new person();
	     ps.nhap();
	     ps.in();
	     System.out.println("*******************");
	     System.out.println("******sinhvien*****");
	     System.out.println("*******************");
	     sinhvien sv=new sinhvien();
	     sv.nhap();
	     sv.in();
	     System.out.println("*************************");
	     System.out.println("****phuongtrinhbachai****");
	     System.out.println("*************************");
	     phuongtrinhbachai ptb2 =new phuongtrinhbachai();
	     ptb2.nhap();
	     ptb2.tinhdelta();
	     ptb2.ht();
	    
	}

}
