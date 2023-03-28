package thucHanh;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class viduUser {
	// tao thong tin co ban cho User
	private int id;
	private String firstName;
	private String lastName;
	
	public viduUser(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	// dat phuong thuc GET
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	// dat phuong thuc SET
	public void setId (int id) {
		this.id = id;
	}
	public void setFirstName (String firstName) {
		this.firstName = firstName;
	}
	public void setLastName (String lastName) {
		this.lastName = lastName;
	}
	public static void writeToExcelFile(ArrayList<viduUser> data) {
		// khoi tao Workbook cho tep xlsx
		XSSFWorkbook wb = new XSSFWorkbook();
		// khoi tao Sheet
		XSSFSheet Sheet = wb.createSheet("User Details");
		// tao tittle Id, firstName, lastName
		XSSFRow titleRow = Sheet.createRow(0);
		XSSFCell cell1 = titleRow.createCell(0);
		cell1.setCellValue("ID");
		XSSFCell cell2 = titleRow.createCell(1);
		cell2.setCellValue("FIRSTNAME");
		XSSFCell cell3 = titleRow.createCell(2);
		cell3.setCellValue("LASTNAME");
		
		// tao data
		for (int i = 0; i<data.size(); i++) {
			viduUser user = data.get(i);
			XSSFRow localRow = Sheet.createRow(i+1); //row 0 là titleRow
			XSSFCell localCell1 = localRow.createCell(0);
			localCell1.setCellValue(String.valueOf(user.getId()));
			XSSFCell localCell2 = localRow.createCell(1);
			localCell2.setCellValue(user.getFirstName());
			XSSFCell localCell3 = localRow.createCell(2);
			localCell3.setCellValue(user.getLastName());
		}
		try {
			// ghi data xuong file
			FileOutputStream out = new FileOutputStream(new File("/Users/aleph/Ngan Drive/data.xlsx"));
			wb.write(out);
			System.out.print("data.xlsx written successfully on disk");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao so User N = ");
		int N = Integer.parseInt(scanner.nextLine());
		// tao ArrayList de luu data
		ArrayList<viduUser> data = new ArrayList<viduUser>();
		// nhap danh sach User
		String firstName = "";
		String lastName = "";
		for (int i=0; i<N; i++) {
			System.out.println("Nhap User ["+i+"]: ");
			System.out.println("Nhap Firstname: ");
			firstName = scanner.nextLine();
			System.out.println("Nhap Lastname: ");
			lastName = scanner.nextLine();
			viduUser user = new viduUser(i+1, firstName, lastName);
			data.add(user);
		//ghi Excelfile
			writeToExcelFile(data);
		}
	}
	

}
