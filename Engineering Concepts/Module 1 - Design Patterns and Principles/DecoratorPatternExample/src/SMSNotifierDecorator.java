/**
 * Concrete Decorator that adds SMS notification capability
 * on top of any existing Notifier.
 */
public class SMSNotifierDecorator extends NotifierDecorator {

    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);          // delegate to wrapped notifier(s)
        sendSMS(message);             // add new behavior
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
