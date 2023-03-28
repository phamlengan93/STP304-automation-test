package Bai1;
import java.util.Scanner;
public class Float {
	public static void main(String[]args) {
		String msg;
		do {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Nhap so thuc a: ");
			float a = scanner.nextFloat();
			System.out.print("Nhap so thuc b: ");
			float b = scanner.nextFloat();
			if(b==0) {
				throw new ArithmeticException();
			}
			System.out.println("KQ: " + (int)(a/b));
		} catch (ArithmeticException e) {
			System.out.print("b khong duoc bang 0");
		} catch (Exception ex) {
			System.out.println("khong dung dinh dang");
		}
		System.out.println("Ban co muon tiep tuc nhap hay k Y/N");
		msg = scanner.nextLine().toUpperCase();
		}while(msg.contains("Y"));
		}

}
