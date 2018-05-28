package pl.ttpsc.factory.pdf;

import pl.ttpsc.factory.AbstractFactory;
import pl.ttpsc.factory.Page;
import pl.ttpsc.factory.Table;

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
