package vt;

import java.util.Scanner;

public class phuongtrinhbachai {
	    double a, b, c, x1, x2,d;
	    Scanner scanner = new Scanner(System.in);
	   public void nhap(){
	        System.out.println("nhap a: ");
	        a = scanner.nextDouble();
	        System.out.println("nhap b: ");
	        b = scanner.nextDouble();
	        System.out.println("nhap c: ");
	        c= scanner.nextDouble();
}
	   public void tinhdelta() {
		    d = b*b - 4*a*c;
	   }
	   public void ht(){
	            if (d < 0) {
	                System.out.println("PT vo nghiem");
	            } 
	            else if (d== 0) {
	                x1 = x2 = -b / (2 * a);
	                System.out.println("PT co nghiem kep " + x1 +"="+x2);
	            } else {
	                x1 = (-b + Math.sqrt(d)) / (2 * a);
	                x2 = (-b - Math.sqrt(d)) / (2 * a);
	                System.out.println("PT co hai nghiem x1= " + x1 + "  x2 = " + x2);
	            }
        }
}