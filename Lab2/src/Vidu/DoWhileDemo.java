package Vidu;
import java.util.Scanner;
public class DoWhileDemo {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		int N;
		do {System.out.print("Nhap so nguyen N : ");
			N = scanner.nextInt();}
		while (N<=0);
		System.out.print("So nguyen N: "+N);

}
}
