/**
 * Concrete Component: the base notifier that sends notifications via Email.
 * This is the core object that decorators will wrap to add extra behavior.
 */
public class EmailNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL notification: " + message);
    }
}
