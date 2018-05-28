package pl.ttpsc.factory.xml;

import pl.ttpsc.factory.AbstractFactory;
import pl.ttpsc.factory.Page;
import pl.ttpsc.factory.Table;

public class XmlFactory implements AbstractFactory {
    @Override
    public Page createPage() {
        return new XmlPage();
    }

    @Override
    public Table createTable() {
        return new XmlTable();
    }
}
