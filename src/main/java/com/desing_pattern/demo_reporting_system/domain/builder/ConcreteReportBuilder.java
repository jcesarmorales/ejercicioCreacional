package com.desing_pattern.demo_reporting_system.domain.builder;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ConcreteReportBuilder implements IReportBuilder{

    private String title;
    private String header;
    private String body;
    private String footer;
    private String format; // Variable para almacenar el formato

    // Métodos para establecer las propiedades del informe
    public void setTitle(String title) {
        this.title = title;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public CustomReport build() {
        return new CustomReport(title, header, body, footer);
    }

    @Override
    public String generateReport() {
        switch (format.toLowerCase()) {
            case "pdf":
                return generatePDF();
            case "excel":
                return generateExcel();
            case "html":
                return generateHTML();
            default:
                return "Formato no soportado.";
        }
    }

    private String generatePDF() {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);

            // Crear el stream de contenido
            try (PDPageContentStream contentStream = new PDPageContentStream(document, page)) {
                contentStream.beginText();
                contentStream.setFont(PDType1Font.HELVETICA, 12);
                contentStream.newLineAtOffset(25, 700);
                contentStream.showText("Título: " + title);
                contentStream.newLineAtOffset(0, -15);
                contentStream.showText("Encabezado: " + header);
                contentStream.newLineAtOffset(0, -15);
                contentStream.showText("Cuerpo: " + body);
                contentStream.newLineAtOffset(0, -15);
                contentStream.showText("Pie: " + footer);
                contentStream.endText();
            } // El flujo se cierra automáticamente aquí

            // Guardar el documento PDF
            document.save(title.replace(" ", "_") + "_Report.pdf");
            return "Informe PDF generado con éxito!";
        } catch (IOException e) {
            return "Error al generar el informe PDF: " + e.getMessage();
        }
    }

    private String generateExcel() {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Informe Excel");

        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Título: " + title);
        Row contentRow = sheet.createRow(1);
        contentRow.createCell(0).setCellValue("Encabezado: " + header);
        Row bodyRow = sheet.createRow(2);
        bodyRow.createCell(0).setCellValue("Cuerpo: " + body);
        Row footerRow = sheet.createRow(3);
        footerRow.createCell(0).setCellValue("Pie: " + footer);

        try (FileOutputStream fileOut = new FileOutputStream(title.replace(" ", "_") + "_Report.xlsx")) {
            workbook.write(fileOut);
            workbook.close();
            return "Informe Excel generado con éxito!";
        } catch (IOException e) {
            return "Error al generar el informe Excel: " + e.getMessage();
        }
    }

    private String generateHTML() {
        String htmlContent = "<html><head><title>Informe HTML</title></head><body>" +
                "<h1>Título: " + title + "</h1>" +
                "<h2>Encabezado: " + header + "</h2>" +
                "<p>Cuerpo: " + body + "</p>" +
                "<footer>Pie: " + footer + "</footer></body></html>";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(title.replace(" ", "_") + "_Report.html"))) {
            writer.write(htmlContent);
            return "Informe HTML generado con éxito!";
        } catch (IOException e) {
            return "Error al generar el informe HTML: " + e.getMessage();
        }
    }

}
