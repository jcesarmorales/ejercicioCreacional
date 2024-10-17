package com.desing_pattern.demo_reporting_system.domain.abstractFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLDetailedReport implements IDetailedReport{
    @Override
    public String createDetailed(String content) {
        String htmlContent = "<html><head><title>Informe Detallado</title></head><body>" +
                "<h1>Informe Detallado en HTML</h1>" +
                "<p>" + content + "</p>" +
                "<p>* Información detallada sobre el contenido del informe va aquí.*</p>" +
                "</body></html>";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("HTMLInformeDetallado.html"))) {
            writer.write(htmlContent);
            return "Informe Detallado en HTML generado con éxito!";
        } catch (IOException e) {
            return "Error al generar el Informe Detallado en HTML: " + e.getMessage();
        }
    }
}
