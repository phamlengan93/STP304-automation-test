package thucHanh;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dsNhanvien {
	//tao thong tin co ban cho nhan vien
	private int maNV;
	private String hoTen;
	private String gioiTinh;
	private int namSinh;
	private String queQuan;
	private String phongBan;
	private int luong;
	
	public dsNhanvien(int maNV, String hoTen, String gioiTinh, int namSinh, String queQuan, String phongBan, int luong) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.namSinh = namSinh;
		this.queQuan = queQuan;
		this.phongBan = phongBan;
		this.luong = luong;
	}
	
	//tao phuong thuc GET
	public int getMaNV() {
		return maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public String getPhongBan() {
		return phongBan;
	}
	public int getLuong() {
		return luong;
	}
	// tao phuong thuc SET
	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public void setGioiTinh (String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public void setNamSinh (int namSinh) {
		this.namSinh = namSinh;
	}
	public void setQueQuan (String queQuan) {
		this.queQuan = queQuan;
	}
	public void setPhongBan (String phongBan) {
		this.phongBan = phongBan;
	}
	public void setLuong (int luong) {
		this.luong = luong;
	}
	//tao thong tin trong file Excel
	public static void writeToExcelFile(ArrayList<dsNhanvien> danhsachnhanvien) {
		//khoi tao workbook cho tep Excel
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("staff info");
		XSSFRow titleRow = sheet.createRow(0);
		XSSFCell cell1 = titleRow.createCell(0);
		cell1.setCellValue("Ma NV");
		XSSFCell cell2 = titleRow.createCell(1);
		cell2.setCellValue("Ho Ten");
		XSSFCell cell3 = titleRow.createCell(2);
		cell3.setCellValue("Gioi Tinh");
		XSSFCell cell4 = titleRow.createCell(3);
		cell4.setCellValue("Nam Sinh");
		XSSFCell cell5 = titleRow.createCell(4);
		cell5.setCellValue("Que Quan");
		XSSFCell cell6 = titleRow.createCell(5);
		cell6.setCellValue("Phong Ban");
		XSSFCell cell7 = titleRow.createCell(6);
		cell7.setCellValue("Luong");
		//tao data
		for (int i = 0; i <danhsachnhanvien.size(); i++) {
			dsNhanvien ds = danhsachnhanvien.get(i);
			XSSFRow localRow = sheet.createRow(i+1);
			XSSFCell localCell1 = localRow.createCell(0);
			localCell1.setCellValue(String.valueOf(ds.getMaNV()));
			XSSFCell localCell2 = localRow.createCell(1);
			localCell2.setCellValue(ds.getHoTen());
			XSSFCell localCell3 = localRow.createCell(2);
			localCell3.setCellValue(ds.getGioiTinh());
			XSSFCell localCell4 = localRow.createCell(3);
			localCell4.setCellValue(String.valueOf(ds.getNamSinh()));
			XSSFCell localCell5 = localRow.createCell(4);
			localCell5.setCellValue(ds.getQueQuan());
			XSSFCell localCell6 = localRow.createCell(5);
			localCell6.setCellValue(ds.getPhongBan());
			XSSFCell localCell7 = localRow.createCell(6);
			localCell7.setCellValue(String.valueOf(ds.getLuong()));
		}
		try {
		//ghi data xuong file
			FileOutputStream out = new FileOutputStream(new File("/Users/aleph/Ngan Drive/danhsachnhanvien.xlsx"));
			wb.write(out);
			System.out.println("danhsachnhanvien.xlsx writen successfully on disk");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap tong so nhan vien N = ");
		int N = Integer.parseInt(scanner.nextLine());
		//tao ArrayList de luu data
		ArrayList<dsNhanvien> danhsachnhanvien = new ArrayList<dsNhanvien>();
		//nhap danh sach nhan vien
		String hoTen = "";
		String gioiTinh = "";
		int namSinh = 0;
		String queQuan = "";
		String phongBan = "";
		int luong = 0;
		for (int i=0; i<N; i++) {
			System.out.print("Nhan vien thu ["+(i+1)+"]: ");
			System.out.print("Nhap Ho Ten: ");
			hoTen = scanner.nextLine();
			System.out.print("Nhap Gioi Tinh: ");
			gioiTinh = scanner.nextLine();
			System.out.print("Nhap Nam Sinh: ");
			namSinh = Integer.parseInt(scanner.nextLine());
			System.out.print("Nhap Que Quan: ");
			queQuan = scanner.nextLine();
			System.out.print("Nhap Phong Ban: ");
			queQuan = scanner.nextLine();
			System.out.print("Nhap Luong: ");
			luong = Integer.parseInt(scanner.nextLine());
			dsNhanvien ds = new dsNhanvien (i+1, hoTen, gioiTinh, namSinh, queQuan, phongBan, luong);
			danhsachnhanvien.add(ds);
		//ghi file Excel
			writeToExcelFile(danhsachnhanvien);
		}
	}
}
