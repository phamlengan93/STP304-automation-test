package javabasic.bai2;
import java.util.Scanner;
public class MainScreen {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so nguyen duong N: ");
		int N = scanner.nextInt();
		int tongChan = 0;
		int tongLe = 0;
		int dem = 0;
		if (N>0) {
			for (int i = 1; i<=N; i++) {
				if (i%2==0) {
					tongChan+=i;
				} else {
					tongLe+=i;
					if (i%3==0) {
						dem+=1;
					}
				}
			}
		System.out.println("Tong chan tu 0 den "+ N+ " : "+ tongChan);
		System.out.println("Tong le tu 0 den "+N+" : "+ tongLe);
		System.out.println("Co "+dem+" so le chia het cho 3");
		} else {
			System.out.println("[Error] - Ban can nhap so nguyen duong");
		}
	}

}
