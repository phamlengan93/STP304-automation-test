package Bai1;
import java.util.Scanner;

public class selectionSort{
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao N phan tu: ");
		int N = scanner.nextInt();
		int []data = new int[N];
		for (int i=0; i<N; i++) {
			System.out.print("Nhap phan tu thu "+i+":");
			data[i]=scanner.nextInt();
			};
		System.out.print("Mang ban dau: ");
		/*C1 for (int b: data) {
		
			System.out.print(b+" ");*/
		//C2
		for (int i=0; i<N; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
			
		
		for (int i=0;i<N;i++) {
			//Tim vi tri phan tu nho nhat trong mang chua duoc sap xep
			int min_idx=i;
			for (int j=i+1;j<N;j++) {
				if(data[j]<data[i]) {
					min_idx=j;					
							
			//Hoan doi phan tu nho nhat vao phan tu dau tien
				int temp = data[min_idx];
				data[min_idx] = data[i];
				data[i] = temp;
				}
				
					}
				
				}
		System.out.print("Mang sau khi sap xep: ");
		for (int a: data) {
			System.out.print(a+" ");
			
			}
		
	
		}
	}

