package app79main;

import model.nhanvienfulltime;
import model.nhanvienpartime;
import util.configs;

public class app79main {

	public static void main(String[] args) {

		nhanvienfulltime sep = new nhanvienfulltime("Tran Van Sep");
		sep.setLoaiChucVu(configs.NHAN_VIEN_SEP);
		nhanvienfulltime linh1 = new nhanvienfulltime("Nguyen Van Linh");
		nhanvienfulltime linh2 = new nhanvienfulltime("Le Thi Linh", 3);
		linh1.setLoaiChucVu(configs.NHAN_VIEN_LINH);
		linh2.setLoaiChucVu(configs.NHAN_VIEN_LINH);

		nhanvienpartime thoiVu = new nhanvienpartime("Phan Thi Thoi Vu", 240);

		System.out.println("Loai chuc vu :");
		System.out.println("\t1 = sep ");
		System.out.println("\t2 = linh");
		sep.tinhLuong();
		linh1.tinhLuong();
		linh2.tinhLuong();
		thoiVu.tinhLuong();

		sep.xuatThongTin();
		linh1.xuatThongTin();
		linh2.xuatThongTin();
		thoiVu.xuatThongTin();
	}

}
