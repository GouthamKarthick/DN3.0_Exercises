package Week_1_Exercises.Design_and_Algorithms.DecoratorPattern;

public abstract class NotifierDecorator implements Notifier{
    protected Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message);
    }
}
