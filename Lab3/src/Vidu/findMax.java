package Vidu;

import java.util.Scanner;

public class findMax {
	public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Nhap vao so phan tu N:");
	int N = scanner.nextInt();
	int []data = new int[N];
	for (int i = 0; i<N; i++) {
		System.out.print("Nhap phan tu thu ["+i+"]");
		data[i]=scanner.nextInt();
	}
		int max = data[0];
		for (int j=1; j<N; j++) {
			if(max < data[j]) {
				max = data[j];
			}
		}
		
	System.out.println("Gia tri lon nhat la: "+max);
	

}
}
