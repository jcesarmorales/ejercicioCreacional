package com.desing_pattern.demo_reporting_system.domain.abstractFactory;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;

public class PDFDetailedReport implements IDetailedReport{
    @Override
    public String createDetailed(String content) {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);
            PDPageContentStream contentStream = new PDPageContentStream(document, page);
            contentStream.beginText();
            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
            contentStream.newLineAtOffset(25, 700);
            contentStream.showText("Informe Detallado en PDF");
            contentStream.newLineAtOffset(0, -15);
            contentStream.showText(content + "\n* Información detallada sobre el contenido del informe va aquí.*");
            contentStream.endText();
            document.save("PDFInformeDetallado.pdf");
            return "Informe Detallado en PDF generado con éxito!";
        } catch (IOException e) {
            return "Error al generar el Informe Detallado en PDF: " + e.getMessage();
        }
    }
}
