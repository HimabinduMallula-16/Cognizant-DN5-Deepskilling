/**
 * Test class demonstrating the Decorator Pattern.
 * Shows how notification channels can be combined dynamically at runtime.
 */
public class NotifierTest {

    public static void main(String[] args) {

        System.out.println("--- Email only ---");
        Notifier emailOnly = new EmailNotifier();
        emailOnly.send("Your order has been shipped.");

        System.out.println("\n--- Email + SMS ---");
        Notifier emailAndSMS = new SMSNotifierDecorator(new EmailNotifier());
        emailAndSMS.send("Your order has been shipped.");

        System.out.println("\n--- Email + SMS + Slack ---");
        Notifier allChannels = new SlackNotifierDecorator(
                                    new SMSNotifierDecorator(
                                        new EmailNotifier()));
        allChannels.send("Your order has been shipped.");

        System.out.println("\n--- Email + Slack (no SMS) ---");
        Notifier emailAndSlack = new SlackNotifierDecorator(new EmailNotifier());
        emailAndSlack.send("Your order has been shipped.");
    }
}
