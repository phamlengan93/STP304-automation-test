package Bai1;
import java.util.Scanner;
public class TamGiac {
	public int canh_a;
	public int canh_b;
	public int canh_c;
	public int tinhchuvi() {
		int chuvi = canh_a + canh_b + canh_c;
		return chuvi;
	};
	public float tinhdientich() {
		float p = (float)(canh_a+canh_b+canh_c)/2;
		float dientich = (float)Math.sqrt(p*(p-canh_a)*(p-canh_b)*(p-canh_c));
		return dientich;
	};
	public static void main(String[]args) {
		TamGiac tamgiac = new TamGiac();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap canh a: ");
		int a = scanner.nextInt();
		tamgiac.canh_a = a;
		System.out.print("Nhap canh b: ");
		int b = scanner.nextInt();
		tamgiac.canh_b = b;
		System.out.print("Nhap canh c: ");
		int c = scanner.nextInt();
		tamgiac.canh_c = c;
		
		int chuvi = tamgiac.tinhchuvi();
		float dientich = tamgiac.tinhdientich();
		System.out.println("Chu vi tam giac: "+chuvi);
		System.out.println("Dien tich tam giac: "+dientich);
		
	}
}
