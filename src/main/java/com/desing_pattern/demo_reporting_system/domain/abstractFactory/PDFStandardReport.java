package com.desing_pattern.demo_reporting_system.domain.abstractFactory;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;

public class PDFStandardReport implements IStandardReport{
    @Override
    public String createStandard(String content) {
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage();
            document.addPage(page);
            PDPageContentStream contentStream = new PDPageContentStream(document, page);
            contentStream.beginText();
            contentStream.setFont(PDType1Font.HELVETICA, 12);
            contentStream.newLineAtOffset(25, 700);
            contentStream.showText("PDF Standard Report");
            contentStream.newLineAtOffset(0, -15);
            contentStream.showText(content);
            contentStream.endText();
            contentStream.close();
            document.save("PDFStandardReport.pdf");
            return "PDF Standard Report generated successfully!";
        } catch (IOException e) {
            return "Error generating PDF Standard Report: " + e.getMessage();
        }
    }
}
