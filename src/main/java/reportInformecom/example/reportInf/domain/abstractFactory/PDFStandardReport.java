package reportInformecom.example.reportInf.domain.abstractFactory;

public class PDFStandardReport implements StandardReport{
    @Override
    public String createStardard() {
        return "Informe estándar en PDF";
    }
}
