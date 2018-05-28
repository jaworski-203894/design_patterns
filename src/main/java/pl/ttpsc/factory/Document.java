package pl.ttpsc.factory;

public class Document {
    private AbstractFactory documentFactory;

    public Document(AbstractFactory documentFactory) {
        this.documentFactory = documentFactory;
    }
}
