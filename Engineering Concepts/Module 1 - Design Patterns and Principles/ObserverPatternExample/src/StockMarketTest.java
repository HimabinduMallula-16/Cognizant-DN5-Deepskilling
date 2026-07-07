/**
 * Test class demonstrating the Observer Pattern.
 * Shows registration, deregistration, and notification of observers
 * when stock prices change.
 */
public class StockMarketTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("Alice");
        Observer mobileApp2 = new MobileApp("Bob");
        Observer webApp1 = new WebApp("WEB-1001");

        // Register observers
        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp1);

        // Trigger a price change - all three observers should be notified
        stockMarket.setStockPrice("AAPL", 195.32);

        // Deregister one observer
        System.out.println("\n--- Deregistering Bob's MobileApp ---");
        stockMarket.deregisterObserver(mobileApp2);

        // Trigger another price change - only Alice and WebApp should be notified
        stockMarket.setStockPrice("AAPL", 198.10);

        // Trigger a price change for a different stock
        stockMarket.setStockPrice("GOOG", 2750.50);
    }
}
