package ApachePOI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readData {
	public static void main(String[]args) throws EncryptedDocumentException, IOException {
		//B1: need to make connection w Excel file
		FileInputStream fis = new FileInputStream("/Users/aleph/Ngan Drive/Animal.xlsx");
		//B2: tao Workbook
		XSSFWorkbook wb = (XSSFWorkbook) WorkbookFactory.create(fis);
		//B3: lay Sheet
		XSSFSheet sheet = wb.getSheet("Breed");
		//B4: lay Row dau tien
		XSSFRow row = sheet.getRow(0);
		//B5: Cell dau tien
		XSSFCell cell = row.getCell(1);
		//B6: doc gia tri cell
		String data = cell.getStringCellValue();
		System.out.print(data);
	}

}
