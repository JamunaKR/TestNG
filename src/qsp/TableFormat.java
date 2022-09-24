package qsp;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TableFormat 
{
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
			{
					//Create and Read Excel file
					File f=new File("./Data\\input.xlsx");
					FileInputStream fis=new FileInputStream(f);
						
					//Create the Workspace (means Grp of worksheets)
					Workbook wb=WorkbookFactory.create(fis); //use I/p Stream arg.
						
					//Get the sheet	//& for Sheet(I) import poi.ss not import poi.sl
					Sheet sh=wb.getSheet("Sheet1");//Consider String arg.
						
					//To print datas in table format
					int rc=sh.getLastRowNum();
					
					for (int i=0;i<rc;i++)
					{
						int cc=sh.getRow(i).getLastCellNum();
						for(int j=0;j<cc;j++)
						{
							String data=sh.getRow(i).getCell(j).toString();
							System.out.print(data+ "\t");
						}
						System.out.println();//Why not printing the last low i.e C!,C2,C3
				}
		}
}
