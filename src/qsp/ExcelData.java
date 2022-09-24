package qsp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//Create and Read Excel file
		File f=new File("./Data\\input.xlsx");
		FileInputStream fis=new FileInputStream(f);
		
		//Create the Workspace (means Grp of worksheets)
		Workbook wb=WorkbookFactory.create(fis); //use I/p Stream arg.
		
		//Get the sheet	//& for Sheet(I) import poi.ss not import poi.sl
		Sheet sh=wb.getSheet("Sheet1");//Consider String arg.
		
		//Get the Rows //for Row(I) import poi.ss 
		Row r=sh.getRow(1);
		
		//Get the cell
		Cell c=r.getCell(0);
		
		//Get the data
		String data=c.getStringCellValue();
		System.out.println(data);		
	}

}
