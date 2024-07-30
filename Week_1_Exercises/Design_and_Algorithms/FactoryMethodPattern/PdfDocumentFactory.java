package Week_1_Exercises.Design_and_Algorithms.FactoryMethodPattern;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
