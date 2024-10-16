package com.desing_pattern.demo_reporting_system.domain.builder;

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
        return "====================\nCustom Report\n====================\n" +
                "Title: " + title + "\n" +
                "Header: " + header + "\n" +
                "Body: " + body + "\n" +
                "Footer: " + footer + "\n====================\n";
    }

}
