package Bai4;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Gói nào trong java chứa lớp Scanner dùng để nhập dữ liệu từ bàn phím ?\r\n"
				+ "A. java.net\r\n"
				+ "B. java.io\r\n"
				+ "C. java.util\r\n"
				+ "D. java.awt");
		
		System.out.println("Vui long nhap cau tra loi:");
		
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.next();
		System.out.print(answer);
		String msg = "";
		
		switch(answer.trim().toUpperCase()) {
		case "A": System.out.println("Ban tra loi sai");
			//msg = "Ban tra loi sai";
			break;
		case "B": //System.out.println("Ban tra loi sai");
			msg = "Ban tra loi sai";
			break;
		case "C": //System.out.println("Ban tra loi dung");
			msg = "Ban tra loi dung";
			break;
		case "D": //System.out.println("Ban tra loi sai");
			msg = "Ban tra loi sai";
			break;
		default: //System.out.println("Dap an khong hop le");
			msg = "Dap an khong hop le";
			break;
		}
		System.out.println(msg);		
	}

}