package com.desing_pattern.demo_reporting_system.domain.builder;

public class ReportDirector {

    private final ReportBuilder builder;

    public ReportDirector(ReportBuilder builder) {
        this.builder = builder;
    }

    public CustomReport constructStandardReport() {
        return builder.setTitle("Informe Estándar")
                .setHeader("Encabezado Estándar")
                .setBody("Cuerpo Estándar")
                .setFooter("Pie Estándar")
                .build();
    }

}
