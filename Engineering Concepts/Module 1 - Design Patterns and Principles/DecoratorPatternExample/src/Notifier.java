/**
 * Component interface for the Decorator Pattern.
 * Both concrete components and decorators implement this interface.
 */
public interface Notifier {
    void send(String message);
}
