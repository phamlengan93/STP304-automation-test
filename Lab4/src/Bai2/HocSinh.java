package Bai2;
import java.util.Scanner;
public class HocSinh extends Person implements InterHienThi {
	//tao thuoc tinh cho HocSinh
	private String thoiKhoaBieuHoc;
	private String tenGVCN;
	private int lopDangHoc;
	//tao constructor cho HocSinh
	public HocSinh(String thoiKhoaBieuHoc, String tenGVCN, int lopDangHoc, String hoTen, String gioiTinh, String queQuan, int namSinh) {
		super(hoTen, gioiTinh, queQuan, namSinh);
		this.thoiKhoaBieuHoc = thoiKhoaBieuHoc;
		this.tenGVCN = tenGVCN;
		this.lopDangHoc = lopDangHoc;
	}
	//tao phuong thuc SET
	public void setThoiKhoaBieuHoc (String thoiKhoaBieuHoc) {
		this.thoiKhoaBieuHoc = thoiKhoaBieuHoc;
	}
	public void setTenGVCN (String tenGVCN) {
		this.tenGVCN = tenGVCN;
	}
	public void setLopDangHoc (int lopDangHoc) {
		this.lopDangHoc = lopDangHoc;
	}
	// tao phuong thuc GET
	public String getThoiKhoaBieuHoc() {
		return thoiKhoaBieuHoc;
	}
	public String getTenGVCN() {
		return tenGVCN;
	}
	public int getLopDangHoc() {
		return lopDangHoc;
	}
	//Override lại phương thức hiển thị thông tin tương ứng cho mỗi lớp.
	@Override
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("Thoi khoa bieu hoc: "+thoiKhoaBieuHoc);
		System.out.println("Ten GVCN: "+tenGVCN);
		System.out.println("Lop dang theo hoc: "+lopDangHoc);
	}
	public void nhapThongTin(Scanner scanner) {
		super.nhapThongTin(scanner);
		System.out.println("Nhap thoi khoa bieu hoc: ");
		thoiKhoaBieuHoc = scanner.nextLine();
		System.out.println("Nhap ten GVCN: ");
		tenGVCN = scanner.nextLine();
		System.out.println("Nhap lop dang theo hoc: ");
		lopDangHoc = Integer.parseInt(scanner.nextLine());
	}
	//implements tu interface
	public void hienThiThoiKhoaBieu() {
		System.out.println("Thoi khoa bieu hoc: "+thoiKhoaBieuHoc);
	}
	public void hienThiThongTinLop() {
		System.out.println("Thong tin lop hoc gom: Lop dang hoc: " + lopDangHoc);
		
	}

	
	
}
