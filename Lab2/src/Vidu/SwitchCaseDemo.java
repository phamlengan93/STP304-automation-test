package Vidu;
import java.util.Scanner;
public class SwitchCaseDemo {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so nguyen N: ");
		int N = scanner.nextInt();
		String message = ""; //Tao bien luu thong bao
		switch (N) {
		case 2: 
			message = "Monday";
			break;
		case 3:
			message = "Tuesday";
			break;
		case 4:
			message = "Wednesday";
			break;
		case 5:
			message = "Thursday";
			break;
		case 6:
			message = "Friday";
			break;
		case 7:
			message = "Saturday";
			break;
		case 8:
			message = "Sunday";
			break;
		default:
			message = "Gia tri khong hop le";
			break;
		}
		System.out.println(message);
	}

}
