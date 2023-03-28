package Bai2;
import java.util.Scanner;
public class LopHoc {
	//tao thong tin cho doi tuong LopHoc
	private String tenLop;
	private int siSo;
	private int khoi;
	
	public LopHoc (String tenLop, int siSo, int khoi) {
		this.tenLop = tenLop;
		this.siSo = siSo;
		this.khoi = khoi;
	}
	
	//tao phuong thuc SET
	public void setTenLop (String tenLop) {
		this.tenLop = tenLop;
	}
	public void setSiSo (int siSo) {
		this.siSo = siSo;
	}
	public void setKhoi (int khoi) {
		this.khoi = khoi;
	}
	//tao phuong thuc GET
	public String getTenLop() {
		return tenLop;
	}
	public int getSiSo() {
		return siSo;
	}
	public int getKhoi() {
		return khoi;
	}
	
	public void thongtinlophoc() {
		System.out.println("Tenlop" + "\t" + "Si So" + "\t" + "Khoi");
		System.out.println(tenLop + "\t" + siSo + "\t" + khoi);
		//return tenLop + "\t" + siSo + "\t" + khoi;
	}
	//them phuong thuc nhap thong tin
	public void nhapThongTin(Scanner scanner) {
		System.out.println("Nhap ten lop: ");
		tenLop = scanner.nextLine();
		System.out.println("Nhap si so: ");
		siSo = Integer.parseInt(scanner.nextLine());
		System.out.println("Nhap khoi: ");
		khoi = Integer.parseInt(scanner.nextLine());
	}
}	
