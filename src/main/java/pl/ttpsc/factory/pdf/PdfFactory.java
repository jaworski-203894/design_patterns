package pl.ttpsc.factory;

import pl.ttpsc.factory.pdf.PdfPage;
import pl.ttpsc.factory.pdf.PdfTable;

public class PdfFactory implements AbstractFactory {
    @Override
    public Page createPage() {
        return new PdfPage();
    }

    @Override
    public Table createTable() {
        return new PdfTable();
    }
}
