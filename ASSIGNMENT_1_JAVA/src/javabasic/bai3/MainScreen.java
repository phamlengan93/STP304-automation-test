package javabasic.bai3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class MainScreen {
	public static void main(String[]args) {
		
		//tao mang ArrayList luu du lieu 
		ArrayList<Student> studentList = new ArrayList<>();	
		String msg;
		
		do {
			Scanner scanner = new Scanner(System.in);
			Student student = new Student();
			System.out.println("Nhap day du thong tin hoc sinh");
			System.out.print("Nhap ho ten: ");
			String fullName = scanner.nextLine();
			student.setFullName(fullName);
			System.out.print("Nhap dia chi: ");
			student.setAddress(scanner.nextLine());
			System.out.print("Nhap ngay sinh: ");
			try {
				student.setDob(scanner.nextLine());
			} catch (ParseException e) {
				System.out.println("Sai dinh dang ngay sinh");
			}
			System.out.print("Nhap gioi tinh: ");
			student.setGender(scanner.nextLine());
			System.out.print("Nhap diem tong ket: ");
			try {
				student.setFinalGrade(scanner.nextLine());
			} catch (Exception e) {
				System.out.println("Sai dinh dang so");
			}
			studentList.add(student);
			
			System.out.print("Do you want to continue (Y/N)?");
			msg = scanner.next().toUpperCase();
			
		} while (msg.contains("Y"));
		
		//hien thi danh sach vua nhap
		System.out.println("DANH SACH HOC SINH");
		for (int i=0; i< studentList.size();i++) {
			System.out.println("Student "+(i+1)+": "+"\n"+studentList.get(i));
		}
		
		//Danh sach nang luc tung hoc vien
		for (int i=0; i< studentList.size(); i++) {
			if (studentList.get(i).getFinalGrade()>=4 && studentList.get(i).getFinalGrade()<5) {
				System.out.println("Hoc sinh "+studentList.get(i).getFullName()+" hoc luc yeu");
			} else if (studentList.get(i).getFinalGrade()>=5 && studentList.get(i).getFinalGrade()<5.5) {
				System.out.println("Hoc sinh "+studentList.get(i).getFullName()+" hoc luc trung binh yeu");
			} else if (studentList.get(i).getFinalGrade()>=5.5 && studentList.get(i).getFinalGrade()<6.5) {
				System.out.println("Hoc sinh "+studentList.get(i).getFullName()+" hoc luc trung binh");
			} else if (studentList.get(i).getFinalGrade()>=6.5 && studentList.get(i).getFinalGrade()<7) {
				System.out.println("Hoc sinh "+studentList.get(i).getFullName()+" hoc luc trung binh kha");
			} else if (studentList.get(i).getFinalGrade()>=7 && studentList.get(i).getFinalGrade()<8) {
				System.out.println("Hoc sinh "+studentList.get(i).getFullName()+" hoc luc kha");
			} else if (studentList.get(i).getFinalGrade()>=8 && studentList.get(i).getFinalGrade()<8.5) {
				System.out.println("Hoc sinh "+studentList.get(i).getFullName()+" hoc luc kha gioi");
			} else if (studentList.get(i).getFinalGrade()>=8.5 && studentList.get(i).getFinalGrade()<=10) {
				System.out.println("Hoc sinh "+studentList.get(i).getFullName()+" hoc luc gioi");
			} 
		}
		
		//hien tong diem TB cua tat ca hoc sinh
		float tong = 0;
		for (int i = 0; i<studentList.size();i++){
			tong += studentList.get(i).getFinalGrade();
		}
		float diemTB = (tong/studentList.size());
		System.out.println("\n"+"TB diem tong ket: " + diemTB);
		
	}
}
