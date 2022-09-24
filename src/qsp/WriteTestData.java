package qsp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteTestData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//Create and Read Excel file
		File f=new File("./Data\\input.xlsx");
		FileInputStream fis=new FileInputStream(f);
			
		//Create the Workspace (means Grp of worksheets)
		Workbook wb=WorkbookFactory.create(fis); //use I/p Stream arg.
			
		//Get the sheet	//& for Sheet(I) import poi.ss not import poi.sl
		Sheet sh=wb.getSheet("Sheet1");//Consider String arg.
		
		//create the rows
		Row r=sh.createRow(1);
		
		//create the cell
		Cell c=r.createCell(2);
		
		//set the value
		c.setCellValue("Jamz");
		
		//Write the data
		FileOutputStream fos=new FileOutputStream("./Data\\input.xlsx");
		wb.write(fos);
		
		fos.close();
			
	}

}
