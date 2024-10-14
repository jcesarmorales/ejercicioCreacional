package reportInformecom.example.reportInf.domain.builder;

public class ReportConcreteBuilder implements ReportBuilder{

    private String title;
    private String header;
    private String body;
    private String footer;

    @Override
    public ReportBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public ReportBuilder setHeader(String header) {
        this.header = header;
        return this;
    }

    @Override
    public ReportBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public ReportBuilder setFooter(String footer) {
        this.footer = footer;
        return this;
    }

    @Override
    public ReportContentBuilder build() {
        return new ReportContentBuilder(title, header, body, footer);
    }
}
