package Bai2;
import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		LopHoc lophoc = new LopHoc(null,0,0);
		Scanner sc = new Scanner (System.in);
		lophoc.nhapThongTin(sc);
		lophoc.thongtinlophoc();
		//System.out.println(lophoc);
		
		HocSinh hocsinh = new HocSinh(null, null, 0, null, null, null, 0);
		hocsinh.nhapThongTin(sc);
		hocsinh.hienThiThoiKhoaBieu();
		hocsinh.hienThiThongTinLop();
		hocsinh.hienThiThongTin();
		
		GiaoVien giaovien = new GiaoVien(0, null, null, null, null, null, 0);
		giaovien.nhapThongTin(sc);
		giaovien.hienThiThoiKhoaBieu();
		giaovien.hienThiThongTinLop();
		giaovien.hienThiThongTin();
		
		NhanVien nhanvien = new NhanVien(null, null, null, null, null, 0);
		nhanvien.nhapThongTin(sc);
		nhanvien.hienThiThongTin();
		
		
		
	}
	

}
