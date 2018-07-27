package Datadrivethroughexcel;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Datadriven {
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	

	public static void main(String[] args) throws Exception {
		String Value =getCellValue(1, 1);
		String Value1 =getCellValue(1, 0);
		System.out.println(Value);
		System.out.println(Value1);
		String Value2 =setCellValue(1, 0);
		System.out.println(Value2);
		}
	
	public static String getCellValue(int rownum,int cellnum) throws Exception {
		 fis=new FileInputStream("C:\\Users\\Yeshwant\\Desktop\\DataDrivenExcel.xlsx");
		 wb= new XSSFWorkbook(fis);
		 sheet= wb.getSheet("Sheet1");
		 row=sheet.getRow(rownum);
		 cell=row.getCell(cellnum);
		 return cell.getStringCellValue();
		}
	
	public static String setCellValue(int rownum,int cellnum) throws Exception {
		 fis=new FileInputStream("C:\\Users\\Yeshwant\\Desktop\\DataDrivenExcel.xlsx");
		 wb= new XSSFWorkbook(fis);
		 sheet= wb.getSheet("Sheet1");
		 row=sheet.getRow(rownum);
		 cell=row.getCell(cellnum);
		 cell.setCellValue("Yesh");
		 return cell.getStringCellValue();
		
		
	}

}
 