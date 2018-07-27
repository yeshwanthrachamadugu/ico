//package datadrivenTest;
//
//
//public class WorkBook {
//
//	public static void main(String[] args) throws Exception {
//		// Create Blank Workbook
//		/*// Creating new empty Work book
//		XSSFWorkbook wb =new XSSFWorkbook();
//		
//		//Creating a file system using specific name
//		File f= new File("R:\\workbook.xlsx");
//		FileOutputStream fos= new FileOutputStream(f);
//		
//		//write operation workbook using file out object 
//		System.out.println("createworkbook.xlsx written successfully");
//		*/
//		
//		//Open Existing Workbook
//		/*try {
//		
//		File f= new File("R:\\workbook.xlsx");
//		FileInputStream fos= new FileInputStream(f);
//		
//		XSSFWorkbook wb= new XSSFWorkbook(fos);
//		if(f.isFile() && f.exists()) {
//			System.out.println("openworkbook.xlsx file open successfully.");
//			
//		}else {
//			System.out.println("Error to open openworkbook.xlsx file.");
//			
//		}
//		}
//		catch(Exception e) {
//			System.out.println("Exception not handled");
//		}*/
//		
//		/*XSSFWorkbook workbook = new XSSFWorkbook();
//		//Create a blank sheet
//	      XSSFSheet spreadsheet = workbook.createSheet(" Employee Info ");
//
//	      //Create row object
//	      XSSFRow row;
//
//	      //This data needs to be written (Object[])
//	      Map < String, Object[] > empinfo = 
//	      new TreeMap < String, Object[] >();
//	      empinfo.put( "1", new Object[] { "EMP ID", "EMP NAME", "DESIGNATION" });
//	      empinfo.put( "2", new Object[] { "tp01", "Gopal", "Technical Manager" });
//	      empinfo.put( "3", new Object[] { "tp02", "Manisha", "Proof Reader" });
//	      empinfo.put( "4", new Object[] { "tp03", "Masthan", "Technical Writer" });
//	      empinfo.put( "5", new Object[] { "tp04", "Satish", "Technical Writer" });
//	      empinfo.put( "6", new Object[] { "tp05", "Krishna", "Technical Writer" });
//	      
//	      //Iterate over data and write to sheet
//	      Set < String > keyid = empinfo.keySet();
//	      int rowid = 0;
//
//	      for (String key : keyid) {
//	         row = spreadsheet.createRow(rowid++);
//	         Object [] objectArr = empinfo.get(key);
//	         int cellid = 0;
//
//	         for (Object obj : objectArr) {
//	            Cell cell = row.createCell(cellid++);
//	            cell.setCellValue((String)obj);
//	         }
//	      }
//		
//		
//		File f= new File("R:\\workbook.xlsx");
//		FileOutputStream fis = new FileOutputStream(f);
//		workbook.write(fis);
//		fis.close();
//	}
//
//}
//*/