package Bai2;
import java.util.Scanner;
public class Person {
	//khai bao thuoc tinh cho lop Person
	protected String hoTen;
	protected String gioiTinh;
	protected String queQuan;
	protected int namSinh;
	//phuong thuc khoi tao (Constructors)
	public Person (String hoTen, String gioiTinh, String queQuan, int namSinh) {
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.queQuan = queQuan;
		this.namSinh = namSinh;
	}
	// tao phuong thuc SET
	public void setHoTen (String hoTen) {
		this.hoTen = hoTen;
	}
	public void setGioiTinh (String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public void setQueQuan (String queQuan) {
		this.queQuan = queQuan;
	}
	public void setNamSinh (int namSinh) {
		this.namSinh = namSinh;
	}
	//tao phuong thuc GET
	public String getHoTen() {
		return hoTen;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public int getNamSinh() {
		return namSinh;
	}
	// tao phuong thuc hienThiThongTin(): hien thi cac thong tin co ban
	public void hienThiThongTin() {
		System.out.println("Ho Ten: "+ hoTen);
		System.out.println("Gioi Tinh: "+gioiTinh);
		System.out.println("Que Quan: "+queQuan);
		System.out.println("Nam Sinh: "+namSinh);
	}
	// tao phuong thuc nhapThongTin(Scanner scanner): Nhập thông tin từ bàn phím
	public void nhapThongTin (Scanner scanner) {
		System.out.println("Nhap ho ten: ");
		hoTen = scanner.nextLine();
		System.out.println("Nhap gioi tinh: ");
		gioiTinh = scanner.nextLine();
		System.out.println("Nhap que quan: ");
		queQuan = scanner.nextLine();
		System.out.println("Nhap nam sinh: ");
		namSinh = Integer.parseInt(scanner.nextLine());
	}

}
