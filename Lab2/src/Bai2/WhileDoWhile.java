package Bai2;
import java.util.Scanner;
public class WhileDoWhile {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int N;
		int tong = 0;
		do {
			System.out.println("Nhap so nguyen N: ");
			N = scanner.nextInt();
			tong+=N;
			System.out.println("Tong cac gia tri nhap vao: "+tong);
			} while (tong <= 100);
		if (N % 2 ==1) {
			System.out.println("Day so le giam dan là ");
			while (N>0) {
				System.out.println(N+" ");
				N-=2;
			}
		}
			else {
				System.out.println("Day so chan giam dan la ");
				while (N>0) {
					System.out.println(N+" ");
					N-=2;
					}
			}
		
		
	}

}
