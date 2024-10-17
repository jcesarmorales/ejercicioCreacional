package com.desing_pattern.demo_reporting_system.domain.factoryMethod;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLReport implements IReport{
    @Override
    public String generate(String content) {
        String htmlContent = "<html><head><title>HTML Report</title></head><body>" +
                "<h1>HTML Report</h1>" +
                "<p>" + content + "</p></body></html>";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("HTMLReport.html"))) {
            writer.write(htmlContent);
            return "HTML Report generated successfully!";
        } catch (IOException e) {
            return "Error generating HTML Report: " + e.getMessage();
        }
    }
}
