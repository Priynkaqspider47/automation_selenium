package data_driven_testing1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data_excel2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fs=new FileInputStream("./excel/Book1.xlsx");
		Workbook book = WorkbookFactory.create(fs);
		Sheet sheet = book.getSheet("sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String value = cell.getStringCellValue();
		System.out.println(value);

}
}