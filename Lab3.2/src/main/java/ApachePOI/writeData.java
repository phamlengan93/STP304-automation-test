package ApachePOI;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeData {
	public static void main(String[]args) throws IOException {
		//B1: Ket noi voi Excel file
		FileOutputStream fs = new FileOutputStream("/Users/aleph/Ngan Drive/Details.xlsx");
		//B2: tao Workbook
		XSSFWorkbook wb = new XSSFWorkbook();	
		//B3: tạo Sheet
		XSSFSheet sheet = wb.createSheet("Details");
		//B4: tao Row
		XSSFRow row = sheet.createRow(2);
		//B5: tao Cell
		XSSFCell cell = row.createCell(1);
		//B6: Set gia tri cho Cell
		cell.setCellValue("Hoc tot");
		//B7: luu du lieu
		wb.write(fs);
		//B8: dong
		wb.close();
	}

}
