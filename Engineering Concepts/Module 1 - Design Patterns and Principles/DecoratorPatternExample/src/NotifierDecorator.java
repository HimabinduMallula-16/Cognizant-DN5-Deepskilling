/**
 * Abstract Decorator class.
 * Implements Notifier and holds a reference to a wrapped Notifier object.
 * By default it just delegates the call, allowing concrete decorators
 * to override/extend behavior as needed.
 */
public abstract class NotifierDecorator implements Notifier {

    protected Notifier wrappedNotifier;

    public NotifierDecorator(Notifier notifier) {
        this.wrappedNotifier = notifier;
    }

    @Override
    public void send(String message) {
        // Delegate to the wrapped notifier by default.
        wrappedNotifier.send(message);
    }
}
