package Vidu;
import java.util.Scanner;
public class If_KiemTraChanLe {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so nguyen N: ");
		int N = scanner.nextInt();
		if (N % 2 == 0) {
			System.out.println("Day la so chan");
		} else {
			System.out.println("Day la so le");
		}
	}

}
