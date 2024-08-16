package com.vtiger.genericutility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
/**
 * this method is used to fetch data from excel
 * @param sheetname
 * @param rownum
 * @param cellnum
 * @return
 * @throws Throwable
 */
	public String readStringDatafromExcel(String sheetname,int rownum,int cellnum) throws Throwable {
		FileInputStream fis = new FileInputStream(Iconstantutility.excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();

		}


}
