package Vidu;
import java.util.Scanner;
public class ForDemo {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		int tongChan = 0;
		int tongLe = 0;
		System.out.print("Nhap so nguyen N: ");
		int N = scanner.nextInt();
		for (int i=1; i<=N; i++) {
			if(i%2==0) {
				tongChan+=i;
			}else {
				tongLe+=i;
			}
		}
		System.out.println("Tong cac so chan tu 1 den "+N+" = "+tongChan);
		System.out.println("Tong cac so le tu 1 den "+N+" = "+tongLe);
	}
	

}
