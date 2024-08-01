package Week_1_Exercises.Design_Pattern_and_Principal.DecoratorPattern;

public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSlackNotification(message);
    }

    private void sendSlackNotification(String message) {
        System.out.println("Sending Slack notification with message: " + message);
    }
}
