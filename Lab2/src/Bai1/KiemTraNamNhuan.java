package Bai1;
import java.util.Scanner;
public class KiemTraNamNhuan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so nguyen duong N: ");
		int N = scanner.nextInt();
		
		//boolean dk1 = (N % 400 == 0);
		//boolean dk2 = (N % 4 == 0);
		//boolean dk3 = (N % 100 == 0);
		
		//dk1 là true
			if (N % 400 ==0) {
				System.out.println(N+ " Day la nam nhuan");
			} else if (N%4==0 && N%100==1) {
				//dk2 là true && dk3 la false
				System.out.println(N+" Khong phai nam nhuan");
			} else if (N%4==1 && N%100==0) {
				//dk2 la false && dk3 la true
				System.out.println(N+" Khong phai nam nhuan");
			} else {
				System.out.println(N+" Khong phai nam nhuan");
			}
		
	}

}