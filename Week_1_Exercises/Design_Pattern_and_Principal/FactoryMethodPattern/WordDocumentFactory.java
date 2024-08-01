package Week_1_Exercises.Design_Pattern_and_Principal.FactoryMethodPattern;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
