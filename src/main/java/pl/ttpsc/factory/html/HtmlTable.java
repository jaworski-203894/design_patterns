package pl.ttpsc.factory.html;

import pl.ttpsc.factory.Table;
import pl.ttpsc.factory.TableCell;

public class HtmlTable extends Table {
    @Override
    public TableCell createTableCell() {
        return new TableCell();
    }
}
