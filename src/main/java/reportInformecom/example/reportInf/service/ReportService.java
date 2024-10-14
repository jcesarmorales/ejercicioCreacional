package reportInformecom.example.reportInf.service;

import org.springframework.stereotype.Service;
import reportInformecom.example.reportInf.domain.factory.ConcreteReportFactory;
import reportInformecom.example.reportInf.domain.factory.Report;
import reportInformecom.example.reportInf.domain.factory.ReportFactory;

@Service
public class ReportService {

    private final ReportFactory factory = new ConcreteReportFactory();

    public String generateReport(String format) {
        Report report = factory.createReport(format);
        return report.generate();
    }

}
