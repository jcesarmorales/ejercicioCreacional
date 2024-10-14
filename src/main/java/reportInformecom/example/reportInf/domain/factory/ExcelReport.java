package reportInformecom.example.reportInf.domain.factory;

public class ExcelReport implements Report {
    @Override
    public String generate() {
        return "Generando informe en Excel a";
    }
}
