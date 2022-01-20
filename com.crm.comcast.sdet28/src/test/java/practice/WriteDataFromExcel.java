package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataFromExcel {

	public static void main(String[] args) throws Throwable, IOException {
		//Object representation of physical Excel sheet
		FileInputStream fis = new FileInputStream("./src/test/resources/vtigerTestData.xlsx");
		//create a workbook for physical file representation 
		Workbook workbook = WorkbookFactory.create(fis);
		//get the control of sheet
		Sheet sheet = workbook.getSheet("Sheet1");
		
		Row row = sheet.getRow(2);
		row.createCell(2).setCellValue("Wipro");
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/vtigerTestData.xlsx");
		workbook.write(fos);
		workbook.close();
		

	}

}
