package qsp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CellCount {
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
				//Create and Read Excel file
				File f=new File("./Data\\input.xlsx");
				FileInputStream fis=new FileInputStream(f);
					
				//Create the Workspace (means Grp of worksheets)
				Workbook wb=WorkbookFactory.create(fis); //use I/p Stream arg.
					
				//Get the sheet	//& for Sheet(I) import poi.ss not import poi.sl
				Sheet sh=wb.getSheet("Sheet1");//Consider String arg.
					
				//Get the row 
				Row r=sh.getRow(0);
				
				//Get Cell count
				int cc=r.getLastCellNum();
				System.out.println(cc); //As the index starts from 1, so produces o/p as 3
			}
	}
