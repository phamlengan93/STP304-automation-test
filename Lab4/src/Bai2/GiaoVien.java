package Bai2;
import java.util.Scanner;

public class GiaoVien extends Person implements InterHienThi {
	//khai bao them thuoc tinh cho doi tuong GiaoVien
	private int lopChuNhiem;
	private String tenMon;
	private String thoiKhoaBieuDay;
	//tao constructor
	public GiaoVien (int lopChuNhiem, String tenMon, String thoiKhoaBieuDay, String hoTen, String gioiTinh, String queQuan, int namSinh) {
		super(hoTen, gioiTinh, queQuan, namSinh);
		this.lopChuNhiem = lopChuNhiem;
		this.tenMon = tenMon;
		this.thoiKhoaBieuDay = thoiKhoaBieuDay;
	}
	//tao phuong thuc SET
	public void setLopChuNhiem (int lopChuNhiem) {
		this.lopChuNhiem = lopChuNhiem;
	}
	public void setTenMon (String tenMon) {
		this.tenMon = tenMon;
	}
	public void setThoiKhoaBieuDay (String thoiKhoaBieuDay) {
		this.thoiKhoaBieuDay = thoiKhoaBieuDay;
	}
	//tao phuong thuc GET
	public int getLopChuNhiem() {
		return lopChuNhiem;
	}
	public String getTenMon() {
		return tenMon;
	}
	public String thoiKhoaBieuDay() {
		return thoiKhoaBieuDay;
	}
	//Override lại phương thức hiển thị thông tin tương ứng cho mỗi lớp
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Lop dang chu nhiem: "+lopChuNhiem);
		System.out.println("Ten mon: "+tenMon);
		System.out.println("Thoi khoa bieu lich day: "+thoiKhoaBieuDay);
	}
	public void nhapThongTin(Scanner scanner) {
		super.nhapThongTin(scanner);
		System.out.println("Nhap lop dang chu nhiem: ");
		lopChuNhiem = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap ten mon: ");
		tenMon = scanner.nextLine();
		System.out.println("Nhap thoi khoa bieu day: ");
		thoiKhoaBieuDay = scanner.nextLine();
	}
	//implements tu interface
	public void hienThiThoiKhoaBieu() {
		System.out.println("Thoi khoa bieu lich day: "+thoiKhoaBieuDay);
	}
	public void hienThiThongTinLop() {
		System.out.println("Lop dang day "+lopChuNhiem);
	}
}
