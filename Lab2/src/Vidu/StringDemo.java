package Vidu;
import java.util.Scanner;
public class StringDemo {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		String chuoi = "Xi nc hao c a cba n";
		int totalSpace = 0; //Bien dem khoang trang
		int length = chuoi.length();
		for (int i=0;i<length; i++) {
			char kytu = chuoi.charAt(i);
			if (kytu == ' ') {
				totalSpace++;
			}
		}
		System.out.println("So luong khoang trang: "+totalSpace);
		//Xoa khoang trang
		String Xoa = chuoi.replace(" ", "");
		System.out.println("Chuoi sau khi xoa khoang trang: "+Xoa);
		//Chuyen in hoa
		String Inhoa = Xoa.toUpperCase();
		System.out.print("Chuoi sau khi chuyen in hoa: "+Inhoa);
		
	}

}
