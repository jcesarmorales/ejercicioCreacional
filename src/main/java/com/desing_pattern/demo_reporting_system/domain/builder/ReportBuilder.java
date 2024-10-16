package com.desing_pattern.demo_reporting_system.domain.builder;

public class ReportBuilder {

    private String title;
    private String header;
    private String body;
    private String footer;

    public ReportBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public ReportBuilder setHeader(String header) {
        this.header = header;
        return this;
    }

    public ReportBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    public ReportBuilder setFooter(String footer) {
        this.footer = footer;
        return this;
    }

    public CustomReport build() {
        return new CustomReport(title, header, body, footer);
    }

}
