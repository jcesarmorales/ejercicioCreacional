package com.desing_pattern.demo_reporting_system.domain.abstractFactory;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;

public class PDFSummaryReport implements ISummaryReport{
    @Override
    public String createSummary(String content) {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);
            PDPageContentStream contentStream = new PDPageContentStream(document, page);
            contentStream.beginText();
            contentStream.setFont(PDType1Font.HELVETICA, 12);
            contentStream.newLineAtOffset(25, 700);
            contentStream.showText("Informe Resumen en PDF");
            contentStream.newLineAtOffset(0, -15);
            contentStream.showText(content + "\n* Resumen de los datos y hallazgos clave.*");
            contentStream.endText();
            document.save("PDFInformeResumen.pdf");
            return "Informe Resumen en PDF generado con éxito!";
        } catch (IOException e) {
            return "Error al generar el Informe Resumen en PDF: " + e.getMessage();
        }
    }
}
