package Bai2;
import java.util.Scanner;
public class HinhTron {
	public int R;
	public float PI = 3.14f;
	public float ChuviC() {
		float C = (float) (2*R*PI);
		return C;
	};
	public float DientichS() {
		float S = (float) (PI*R*R);
		return S;
	};
	public static void main(String[]args) {
		HinhTron hinhtron = new HinhTron();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ban kinh R: ");
		int R = scanner.nextInt();
		hinhtron.R = R;
		float C = hinhtron.ChuviC();
		float S = hinhtron.DientichS();
		System.out.println("Chu vi hinh tron: "+C);
		System.out.println("Dien tich hinh tron: "+S);
	}

}
