package Vidu;
import java.util.Scanner;

public class HinhChuNhat {
	public int dai;
	public int rong;
	//tinh chu vi
	public int tinhChuvi() {
		int chuvi = (this.dai + this.rong)*2;
		return chuvi;
	};
	//tinh dien tich
	public int tinhDientich() {
		int dientich = (this.dai * this.rong);
		return dientich;
	};
	
	public static void main(String[] args) {
		//Khoi tao hinh chu nhat
		HinhChuNhat hcn = new HinhChuNhat();
		//Su dung Scanner de lay du lieu tu ban phim
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap chieu dai: ");
		int chieudai = scanner.nextInt(); //lay chieu dai
		hcn.dai = chieudai; //gan cho thuoc tinh HinhChuNhat
		
		System.out.print("Nhap chieu rong: ");
		int chieurong = scanner.nextInt();
		hcn.rong = chieurong;
		
		int chuvi = hcn.tinhChuvi();
		int dientich = hcn.tinhDientich();
		
		System.out.println("Chu vi hcn = "+chuvi);
		System.out.println("Dien tich hcn = "+dientich);
		
	}

}
