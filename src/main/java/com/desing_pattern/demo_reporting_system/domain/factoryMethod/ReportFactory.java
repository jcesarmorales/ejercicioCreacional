package com.desing_pattern.demo_reporting_system.domain.factoryMethod;

public class ReportFactory {

    public IReport createReport(String type) {
        switch (type.toLowerCase()) {
            case "pdf":
                return new PDFReport();
            case "excel":
                return new ExcelReport();
            case "html":
                return new HTMLReport();
            default:
                throw new IllegalArgumentException("Tipo de reporte no soportado");
        }
    }

}
