package pl.ttpsc.factory;

import pl.ttpsc.factory.html.HtmlPage;
import pl.ttpsc.factory.html.HtmlTable;

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
