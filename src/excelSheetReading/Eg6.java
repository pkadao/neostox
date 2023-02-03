package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import io.opentelemetry.sdk.logs.data.Body.Type;

public class Eg6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
File myFile=new File("C:\\Selenium1\\20AugEvining.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet5");
		
		int totalNoOfRows=mySheet.getLastRowNum();
		
		System.out.println("Total rows in Sheet are "+totalNoOfRows);
		
		short lastCellNum = mySheet.getRow(0).getLastCellNum();
		
		//.out.println(lastCellNum);
		
		int totalNoOfCell = lastCellNum-1;
		
		System.out.println("Total No Of Cells in Row 1 are "+totalNoOfRows);
			
		{
			for(int row=0;row<=totalNoOfRows;row++)
		
			for(int cell=0;cell<totalNoOfCell;cell++)
			{
		           Cell myCell = mySheet.getRow(row).getCell(cell);
       
			      CellType type = myCell.getCellType();
			      
			      if(type==CellType.STRING)
			      {
			        System.out.print(myCell.getStringCellValue()+" ");  
			      }
			      else if(type==CellType.NUMERIC)
			      {
			    	  System.out.print(myCell.getNumericCellValue()+" ");
			      }
			      else if(type==CellType.BOOLEAN)
			      {
			    	  System.out.println(myCell.getBooleanCellValue()+" ");
			      }
			      else if(type==CellType._NONE)
			      {
			    	  System.out.println("BLANK");
			      }
        }
			System.out.println();
	}

}
}
