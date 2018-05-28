package pl.ttpsc.factory.html;

import pl.ttpsc.factory.AbstractFactory;
import pl.ttpsc.factory.Page;
import pl.ttpsc.factory.Table;

public class HtmlFactory implements AbstractFactory {
    @Override
    public Page createPage() {
        return new HtmlPage();
    }

    @Override
    public Table createTable() {
        return new HtmlTable();
    }
}
