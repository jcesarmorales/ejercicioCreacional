package com.desing_pattern.demo_reporting_system.domain.factoryMethod;

public class HTMLReport implements IReport{
    @Override
    public String generate(String content) {
        return "<html>\n<head><title>HTML Report</title></head>\n<body>\n<h1>HTML Report</h1>\n<p>" + content + "</p>\n</body>\n</html>";
    }
}
