package com.desing_pattern.demo_reporting_system.domain.builder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CustomReport {

    private String title;
    private String header;
    private String body;
    private String footer;

    public CustomReport(String title, String header, String body, String footer) {
        this.title = title;
        this.header = header;
        this.body = body;
        this.footer = footer;
    }

    public String generate() {
        String reportContent = "====================\nInforme Personalizado\n====================\n" +
                "Título: " + title + "\n" +
                "Encabezado: " + header + "\n" +
                "Cuerpo: " + body + "\n" +
                "Pie de página: " + footer + "\n====================\n";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("InformePersonalizado.txt"))) {
            writer.write(reportContent);
            return "Informe Personalizado generado con éxito!";
        } catch (IOException e) {
            return "Error al generar el Informe Personalizado: " + e.getMessage();
        }
    }

}
