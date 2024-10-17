package com.desing_pattern.demo_reporting_system.domain.abstractFactory;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelSummaryReport implements ISummaryReport{
    @Override
    public String createSummary(String content) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Informe Resumen en Excel");

        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Informe Resumen en Excel");
        Row contentRow = sheet.createRow(1);
        contentRow.createCell(0).setCellValue(content + " - Resumen y hallazgos clave aquí.");

        try (FileOutputStream fileOut = new FileOutputStream("ExcelInformeResumen.xlsx")) {
            workbook.write(fileOut);
            workbook.close();
            return "Informe Resumen en Excel generado con éxito!";
        } catch (IOException e) {
            return "Error al generar el Informe Resumen en Excel: " + e.getMessage();
        }
    }
}
