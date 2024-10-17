package com.desing_pattern.demo_reporting_system.domain.abstractFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLStandardReport implements IStandardReport{
    @Override
    public String createStandard(String content) {
        String htmlContent = "<html><head><title>Informe Estándar</title></head><body>" +
                "<h1>Informe Estándar en HTML</h1>" +
                "<p>" + content + "</p></body></html>";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("HTMLInformeEstandar.html"))) {
            writer.write(htmlContent);
            return "Informe Estándar en HTML generado con éxito!";
        } catch (IOException e) {
            return "Error al generar el Informe Estándar en HTML: " + e.getMessage();
        }
    }
}
