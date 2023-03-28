package Bai2;
import java.util.Scanner;
public class NhanVien extends Person {
	//khai bao thuoc tinh moi cho NhanVien
	private String phongBan;
	private String chucVu;
	//tao constructor cho NhanVien
	public NhanVien (String phongBan, String chucVu, String hoTen, String gioiTinh, String queQuan, int namSinh) {
		super(hoTen, gioiTinh, queQuan, namSinh);
		this.phongBan = phongBan;
		this.chucVu = chucVu;
	}
	//tao phuong thuc SET
	public void setPhongBan (String phongBan) {
		this.phongBan = phongBan;
	}
	public void setChucVu (String chucVu) {
		this.chucVu = chucVu;
	}
	//tao phuong thuc GET
	public String getPhongBan() {
		return phongBan;
	}
	public String getChucVu() {
		return chucVu;
	}
	@Override
	public void nhapThongTin(Scanner scanner) {
		super.nhapThongTin(scanner);
		System.out.println("Nhap phong ban: ");
		phongBan = scanner.nextLine();
		System.out.println("Nhap chuc vu: ");
		chucVu = scanner.nextLine();
	}
}
