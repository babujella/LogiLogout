package com.tech.CSVtoExceL;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import com.opencsv.CSVReader;

public class CsvToExcel {
	public  void create() throws Exception {
		File f=new File("C:\\Users\\XlFile.xls");               //Creating  the file
		System.out.println(f.exists());
		try {
			f.createNewFile();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(f.exists());

		System.out.println("Success");
	}
	public static void main(String[] args) throws Exception{
		//
		String inputCSVFile = "C:\\Users\\Names.csv";
		CSVReader reader = new CSVReader(new FileReader(inputCSVFile));
		int lnNum = 0;
		HSSFWorkbook new_workbook = new HSSFWorkbook();
		HSSFSheet sheet = new_workbook.createSheet("XlFile");
		Map<String, Object[]> excel_data = new HashMap<String, Object[]>(); 
		while ((args = reader.readNext()) != null) {
			lnNum++;                        
			excel_data.put(Integer.toString(lnNum), new Object[] {args[0],args[1]});                        
		}
		Set<String> keyset = excel_data.keySet();
		int rownum = 0;
		for (String key : keyset) { 
			Row row = sheet.createRow(rownum++);
			Object [] objArr = excel_data.get(key);
			int cellnum = 0;
			for (Object obj : objArr) {
				Cell cell = row.createCell(cellnum++);
				if(obj instanceof Double)
					cell.setCellValue((Double)obj);
				else
					cell.setCellValue((String)obj);
			}
		}
		FileOutputStream output_file = new FileOutputStream(new File("C:\\Users\\XlFile.xlsx")); //create XLS file
		new_workbook.write(output_file);//write converted XLS file to output stream
		output_file.close();
		CsvToExcel obj=new CsvToExcel();
		obj.create();
	}
}
