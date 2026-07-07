/**
 * Concrete Observer representing a web app client that
 * receives stock price update notifications.
 */
public class WebApp implements Observer {

    private final String sessionId;

    public WebApp(String sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public void update(String stockSymbol, double newPrice) {
        System.out.println("[WebApp - session " + sessionId + "] Notification: "
                + stockSymbol + " is now $" + newPrice);
    }
}
