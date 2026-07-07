/**
 * Concrete Observer representing a mobile app client that
 * receives stock price update notifications.
 */
public class MobileApp implements Observer {

    private final String userName;

    public MobileApp(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String stockSymbol, double newPrice) {
        System.out.println("[MobileApp - " + userName + "] Notification: "
                + stockSymbol + " is now $" + newPrice);
    }
}
