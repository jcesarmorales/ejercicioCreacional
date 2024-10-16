package com.desing_pattern.demo_reporting_system.service;

import com.desing_pattern.demo_reporting_system.domain.abstractFactory.factory.ExcelReportFactory;
import com.desing_pattern.demo_reporting_system.domain.abstractFactory.factory.HTMLReportFactory;
import com.desing_pattern.demo_reporting_system.domain.abstractFactory.factory.IReportStyleFactory;
import com.desing_pattern.demo_reporting_system.domain.abstractFactory.factory.PDFReportFactory;
import com.desing_pattern.demo_reporting_system.domain.builder.CustomReport;
import com.desing_pattern.demo_reporting_system.domain.builder.ReportBuilder;
import com.desing_pattern.demo_reporting_system.domain.builder.ReportDirector;
import com.desing_pattern.demo_reporting_system.domain.factoryMethod.IReport;
import com.desing_pattern.demo_reporting_system.domain.factoryMethod.ReportFactory;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    // Factory Method
    public String generateReport(String type, String content) {
        ReportFactory factory = new ReportFactory();
        IReport report = factory.createReport(type);
        return report.generate(content);
    }

    // Abstract Factory
    public String generateStyledReport(String format, String style, String content) {
        IReportStyleFactory factory;
        switch (format.toLowerCase()) {
            case "pdf":
                factory = new PDFReportFactory();
                break;
            case "excel":
                factory = new ExcelReportFactory();
                break;
            case "html":
                factory = new HTMLReportFactory();
                break;
            default:
                throw new IllegalArgumentException("Formato no soportado");
        }

        switch (style.toLowerCase()) {
            case "standard":
                return factory.createStandardReport().createStandard(content);
            case "detailed":
                return factory.createDetailedReport().createDetailed(content);
            case "summary":
                return factory.createSummaryReport().createSummary(content);
            default:
                throw new IllegalArgumentException("Estilo no soportado");
        }
    }

    // Builder Pattern
    public String generateCustomReport(String title, String header, String body, String footer) {
        ReportBuilder builder = new ReportBuilder();
        ReportDirector director = new ReportDirector(builder);
        CustomReport report = builder.setTitle(title)
                .setHeader(header)
                .setBody(body)
                .setFooter(footer)
                .build(); // Construimos el informe personalizado
        return report.generate(); // Devolvemos la generación del informe
    }

}
