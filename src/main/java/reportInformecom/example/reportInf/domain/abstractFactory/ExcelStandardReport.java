package reportInformecom.example.reportInf.domain.abstractFactory;

public class ExcelStandardReport implements StandardReport{
    @Override
    public String createStardard() {
        return "Informe estándar en Excel";
    }
}
