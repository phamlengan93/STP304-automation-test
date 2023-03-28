package Vidu;
import java.util.Scanner;
public class WhileDemo {
	public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Nhap so nguyen N: ");
	int N = scanner.nextInt();
	System.out.print("Day so giam dan: ");
	while (N>0) {
		System.out.print(" "+N);
		N--;
	};

}
}
