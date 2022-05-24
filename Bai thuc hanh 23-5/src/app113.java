import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class app113 {
	public static void main(String[] args) {
		int n;
		Map<Integer,sinhvienn> h=new TreeMap();
		System.out.println("Nhập số sinh viên: ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i = 0;i<n;i++) {
			sinhvienn sv=new sinhvienn();
			sv.nhap();
			h.put(i, sv);
		}
        System.out.println("Nhập tên lớp cần tìm: ");
        int lop = sc.nextInt();
        System.out.println("Các sinh viên có trong lớp là: ");
        for(Map.Entry<Integer, sinhvienn> s : h.entrySet()) {
            if(s.getValue().getLop() == lop) {
                System.out.println(s.getValue());
            }
        }
        System.out.println("Nhập mã sinh viên cần tìm: ");
        int masv = sc.nextInt();
        System.out.println("Sinh viên cần tìm là: ");
        for(Map.Entry<Integer, sinhvienn> s : h.entrySet()) {
            if(s.getValue().getMasv() == masv) {
                System.out.println(s.getValue());
            }
        }
	}
}
