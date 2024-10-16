package com.desing_pattern.demo_reporting_system.controller;

import com.desing_pattern.demo_reporting_system.models.ReportData;
import com.desing_pattern.demo_reporting_system.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @PostMapping("/generate")
    public String generateReport(@RequestBody ReportData reportData) {
        return reportService.generateReport(reportData.getFormat(), reportData.getBody());
    }

    @PostMapping("/generate-style")
    public String generateStyledReport(@RequestBody ReportData reportData) {
        return reportService.generateStyledReport(reportData.getFormat(), reportData.getStyle(), reportData.getBody());
    }

    @PostMapping("/generate-custom")
    public String generateCustomReport(@RequestBody ReportData reportData) {
        return reportService.generateCustomReport(reportData.getTitle(), reportData.getHeader(), reportData.getBody(), reportData.getFooter());
    }
}