import java.util.Scanner;

public class App003 {
	public static boolean check(int n){
		if(n<2)
		{
			return false;
		}
		for(int i=2;i< n;i++)
		{
			if(n%i==0)
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  n;
		do{
			System.out.println("Nhap so nguyen duong: ");
			n=sc.nextInt();	
		}
		while(n<=0);
		sc.close();
		if(check(n))
		{
			System.out.println(n+" la so nguyen to");
		}
		else
		{
			System.out.println(n+" khong la so nguyen to");
		}
	}

}