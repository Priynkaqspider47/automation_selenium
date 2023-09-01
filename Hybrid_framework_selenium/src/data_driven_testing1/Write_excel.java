package data_driven_testing1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fs=new FileInputStream("./excel/Book1.xlsx");
		Workbook book = WorkbookFactory.create(fs);
		Sheet sheet = book.getSheet("sheet1");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		 cell.setCellValue("API");
		  FileOutputStream fis = new FileOutputStream("./excel/Book1.xlsx");;
         book.write(fis);
	}

}
