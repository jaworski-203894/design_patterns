package pl.ttpsc.factory.pdf;

import pl.ttpsc.factory.Table;
import pl.ttpsc.factory.TableCell;

public class PdfTable extends Table {
    @Override
    public TableCell createTableCell() {
        return new PdfTableCell();
    }
}
