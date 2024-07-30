package Week_1_Exercises.Design_and_Algorithms.DecoratorPattern;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending email with message: " + message);
    }
}
