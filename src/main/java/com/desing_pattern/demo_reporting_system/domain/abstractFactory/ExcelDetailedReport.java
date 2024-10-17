package com.desing_pattern.demo_reporting_system.domain.abstractFactory;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelDetailedReport implements IDetailedReport{
    @Override
    public String createDetailed(String content) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Informe Detallado en Excel");

        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Informe Detallado en Excel");
        Row contentRow = sheet.createRow(1);
        contentRow.createCell(0).setCellValue(content + " - Información detallada incluida aquí.");

        try (FileOutputStream fileOut = new FileOutputStream("ExcelInformeDetallado.xlsx")) {
            workbook.write(fileOut);
            workbook.close();
            return "Informe Detallado en Excel generado con éxito!";
        } catch (IOException e) {
            return "Error al generar el Informe Detallado en Excel: " + e.getMessage();
        }
    }
}
