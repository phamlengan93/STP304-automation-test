package Bai3;
import java.util.Scanner;
public class kiemtraSoNguyenTo {
	public static boolean soNguyenTo (int k) {
		boolean isSoNguyenTo = true;
		if (k<2) {
			isSoNguyenTo = false;
		}
		for (int i = 2; i<=k/2; i++) {
			if(k%2==0) {
				isSoNguyenTo = false;
				break;
			}
		}
		
		return isSoNguyenTo;
	}
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so nguyen N>0: ");
		int k = scanner.nextInt();
		int dem = 0;
		if (soNguyenTo(k)) {
			System.out.println(k+" la so nguyen to");
			System.out.println("So nguyen to lan luot la: ");
			for (int i=1; i<=k;i++) {
				if (soNguyenTo(i)) {
					System.out.print(i+" ");	
				}
			}
		} else {
			System.out.print(k+" khong phai so nguyen to");
		
		
			}
		
	}
	}
	


