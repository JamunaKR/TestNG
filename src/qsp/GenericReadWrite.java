package qsp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class GenericReadWrite 
{
	public static String getData(String pathname, String sheet_name, int rn, int cn) throws FileNotFoundException
	{
		try
		{
		FileInputStream file=new FileInputStream(new File(pathname));
		String data=WorkbookFactory.create(file).getSheet(sheet_name).getRow(rn).getCell(cn).toString();
		return data;
		}
		catch (Exception e)
		{
			return "";
		}
	}
	@Test
	public void  testA() throws FileNotFoundException
	{
		String data=getData("./Data\\\\input.xlsx", "Sheet1", 2, 1);
		System.out.println(data);
		System.out.println(getData("./Data\\\\input.xlsx", "Sheet1", 1, 1));
	}	
}
