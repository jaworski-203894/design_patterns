package pl.ttpsc.factory.xml;

import pl.ttpsc.factory.Table;
import pl.ttpsc.factory.TableCell;

public class XmlTable extends Table {
    @Override
    public TableCell createTableCell() {
        return new XmlTableCell();
    }
}
