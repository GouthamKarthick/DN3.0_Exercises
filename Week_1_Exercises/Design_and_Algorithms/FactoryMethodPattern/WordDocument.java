package Week_1_Exercises.Design_and_Algorithms.FactoryMethodPattern;

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
