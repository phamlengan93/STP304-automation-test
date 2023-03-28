package Bai1;
import java.util.Scanner;
public class PhuongTrinhBac2 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a = ");
		float a = scanner.nextFloat();
		System.out.println("Nhap b = ");
		float b = scanner.nextFloat();
		System.out.println("Nhap c = ");
		float c = scanner.nextFloat();
		//kiem tra cac he so
		if (a==0) {
			if(b==0) {
				System.out.println("Phuong trinh vo nghiem");
			} else {
				System.out.println("Phuong trinh co 1 nghiem x = "+(-c/b));
			}
		} else {
		//tinh Delta
		float Delta = (float) b*b - 4*a*c;
		float x1;
		float x2;
		//tinh nghiem
		if (Delta > 0) {
			x1 = (float) (-b + Math.sqrt(Delta)) / (2 * a);
			x2 = (float) (-b - Math.sqrt(Delta)) / (2 * a);
			System.out.println("Phuong trinh co 2 nghiem: x1 = "+x1+", x2 = "+x2);
		} else if (Delta ==0) {
			float x = (-b/(2*a));
			System.out.println("Phuong trinh co nghiem kep: x1 = x2 = "+x);
		} else {
			System.out.println("Phuong trinh vo nghiem");
		}
		
	}

}
}
