package reportInformecom.example.reportInf.domain.abstractFactory;

public class ExcelDetailedreport implements DetailedReport{
    @Override
    public String createDetailed() {
        return "Informe detallado en Excel";
    }
}
