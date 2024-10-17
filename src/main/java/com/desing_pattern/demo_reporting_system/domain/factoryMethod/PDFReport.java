package com.desing_pattern.demo_reporting_system.domain.factoryMethod;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;

public class PDFReport implements IReport{
    @Override
    public String generate(String content) {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);

            PDPageContentStream contentStream = new PDPageContentStream(document, page);
            contentStream.beginText();
            contentStream.setFont(PDType1Font.HELVETICA, 12);
            contentStream.newLineAtOffset(25, 700);
            contentStream.showText("PDF Report");
            contentStream.newLineAtOffset(0, -15);
            contentStream.showText(content);
            contentStream.endText();
            contentStream.close();

            document.save("PDFReport.pdf");
            return "PDF Report generated successfully!";
        } catch (IOException e) {
            return "Error generating PDF Report: " + e.getMessage();
        }
    }
}
