package reportInformecom.example.reportInf.domain.builder;



public interface ReportBuilder {

    ReportBuilder setTitle(String title);
    ReportBuilder setHeader(String header);
    ReportBuilder setBody(String body);
    ReportBuilder setFooter(String footer);

    ReportContentBuilder build();

}
