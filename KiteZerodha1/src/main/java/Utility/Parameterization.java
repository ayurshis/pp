package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	
		public static String getdata(int row,int cell) throws EncryptedDocumentException, IOException
		{
		FileInputStream file=new FileInputStream("D:\\Raz.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Login").getRow(row).getCell(cell).getStringCellValue();
		System.out.println(value);
		return value;
		}
		}
