package Week_1_Exercises.Design_and_Algorithms.FactoryMethodPattern;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF document.");
    }

    @Override
    public void close() {
        System.out.println("Closing PDF document.");
    }
}
