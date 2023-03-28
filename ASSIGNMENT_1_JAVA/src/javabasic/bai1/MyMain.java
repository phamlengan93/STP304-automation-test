package javabasic.bai1;
import java.util.Scanner;
public class MyMain {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String action;
		System.out.print("Nhap x = ");
		double x = scanner.nextDouble();
		System.out.print("Nhap y = ");
		double y = scanner.nextDouble();
		System.out.print("Nhap ACTION: ");
		action = scanner.next().toUpperCase();
		
		if("CONG".equalsIgnoreCase(action)) {
			System.out.println(CalculateUtils.tinhTong(x, y));
		} else if ("TRU".equalsIgnoreCase(action)) {
			System.out.println(CalculateUtils.tinhHieu(x, y));
		} else if ("NHAN".equalsIgnoreCase(action)) {
			System.out.println(CalculateUtils.tinhNhan(x, y));
		} else if ("CHIA".equalsIgnoreCase(action)){
			System.out.println(CalculateUtils.tinhChia(x, y));
		} else {
			System.out.println("Gia tri ACTION khong hop le");
		}
		
	}
}
