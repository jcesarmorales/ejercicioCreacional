package com.desing_pattern.demo_reporting_system.domain.abstractFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLSummaryReport implements ISummaryReport{
    @Override
    public String createSummary(String content) {
        String htmlContent = "<html><head><title>Informe Resumen</title></head><body>" +
                "<h1>Informe Resumen en HTML</h1>" +
                "<p>" + content + "</p>" +
                "<p>* Resumen de los datos y hallazgos clave aquí.*</p>" +
                "</body></html>";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("HTMLInformeResumen.html"))) {
            writer.write(htmlContent);
            return "Informe Resumen en HTML generado con éxito!";
        } catch (IOException e) {
            return "Error al generar el Informe Resumen en HTML: " + e.getMessage();
        }
    }
}
