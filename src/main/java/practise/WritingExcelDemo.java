package practise;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelDemo {

	public static void main(String[] args) throws IOException {
		
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Emp Info");
		
		Object empdata[][]= { {"EmpId","Name","Job"},
				              {101,"Ramdas","Engineer"},
				              {102,"yogesh","HR"},
				              {103,"Akshay","Manager"},
				              {104,"Pundalik","Lead"}
				              };
		  
		//Using for loop
		
		int rows=empdata.length;
		int cols=empdata[0].length;
		
		System.out.println(rows);  //5
		System.out.println(cols);//3
		
		
		for(int r=0;r<rows;r++)
		{
			XSSFRow row=sheet.createRow(r);
			for(int c=0;c<cols;c++) 
			{
				XSSFCell cell=row.createCell(c);
				Object value=empdata[r][c];
				
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		
		 String filepath=".\\datafiles\\employee.xlsx";
		 FileOutputStream outstream=new FileOutputStream(filepath);
		 
		  workbook.write(outstream);
		  
		  outstream.close();
		  System.out.println("File created successfully");
		  

	}

}
