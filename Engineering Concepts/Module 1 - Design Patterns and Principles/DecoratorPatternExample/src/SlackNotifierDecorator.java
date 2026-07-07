/**
 * Concrete Decorator that adds Slack notification capability
 * on top of any existing Notifier.
 */
public class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);          // delegate to wrapped notifier(s)
        sendSlackMessage(message);    // add new behavior
    }

    private void sendSlackMessage(String message) {
        System.out.println("Sending SLACK notification: " + message);
    }
}
