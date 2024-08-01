package Week_1_Exercises.Design_Pattern_and_Principal.FactoryMethodPattern;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
