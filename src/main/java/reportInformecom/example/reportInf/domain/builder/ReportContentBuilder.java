package reportInformecom.example.reportInf.domain.builder;

public class ReportContentBuilder {

    private String title;
    private String header;
    private String body;
    private String footer;

    public ReportContentBuilder(String title, String header, String body, String footer) {
        this.title = title;
        this.header = header;
        this.body = body;
        this.footer = footer;
    }

    @Override
    public String toString() {
        return "ReportContentBuilder{" +
                "title='" + title + '\'' +
                ", header='" + header + '\'' +
                ", body='" + body + '\'' +
                ", footer='" + footer + '\'' +
                '}';
    }
}
