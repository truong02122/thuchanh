package model;

import java.util.Scanner;
import util.configs;

public class nhanvienfulltime extends nhanvien {
	private Scanner scanner;
	private int ngayLamThem;
	private int loaiChucVu;

	public nhanvienfulltime(String ten) {
		this.ten = ten;
	}

	public nhanvienfulltime(String ten, int ngayLamThem) {
		this.ten = ten;
		this.ngayLamThem = ngayLamThem;
	}

	public void setLoaiChucVu(int loaiChucVu) {

		this.loaiChucVu = loaiChucVu;
	}

	@Override
	public String loaiNhanVien() {
		return "Nhan vien toan phan";
	}

	public void tinhLuong() {
		if (loaiChucVu == configs.NHAN_VIEN_LINH) {
			if (ngayLamThem >= 1) {
				luong = configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem * 800000;
			} else {
				luong = configs.LUONG_NHAN_VIEN_FULL_TIME_LINH;
			}

		} else {
			if (ngayLamThem >= 1) {
				luong = configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem * 800000;
			} else {
				luong = configs.LUONG_NHAN_VIEN_FULL_TIME_SEP;
			}
		}
	}

	public void xuatThongTin() {
		System.out.println("ten nhan vien : " + ten);
		System.out.println("loai chuc vu :" + loaiChucVu);
		System.out.println("ngay lam them :" + ngayLamThem);
		System.out.println("Luong:" + luong);
		System.out.println("=======================");

	}

}