import java.util.Scanner;

public class sinhvienn {
	private String hoten;
	private int masv;
	private int lop;
	public sinhvienn(String hoten, int masv, int lop) {
		this.hoten = hoten;
		this.masv = masv;
		this.lop = lop;
	}
	public sinhvienn() {
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	@Override
	public String toString() {
		return "Họ tên: "+hoten+"\t"+"Mã sv: "+masv+"\t"+"Lớp: "+lop;
	}
	public int getMasv() {
		return masv;
	}
	public void setMasv(int masv) {
		this.masv = masv;
	}
	public int getLop() {
		return lop;
	}
	public void setLop(int lop) {
		this.lop = lop;
	}
	public void nhap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập họ tên: ");
		hoten =sc.next();
		System.out.println("Nhập mã sinh viên: ");
		masv =sc.nextInt();
		System.out.println("Nhập lớp: ");
		lop =sc.nextInt();
	}
}