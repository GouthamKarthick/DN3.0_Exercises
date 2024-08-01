package Week_1_Exercises.Design_Pattern_and_Principal.FactoryMethodPattern;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word document.");
    }

    @Override
    public void close() {
        System.out.println("Closing Word document.");
    }

}
