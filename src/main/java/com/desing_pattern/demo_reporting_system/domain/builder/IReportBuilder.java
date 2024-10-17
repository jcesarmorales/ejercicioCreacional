package com.desing_pattern.demo_reporting_system.domain.builder;

public interface IReportBuilder {
    CustomReport build(); // Método que construye el informe
    String generateReport(); // Método para generar el informe en el formato deseado
}
