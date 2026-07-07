import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Subject: maintains a list of observers and notifies them
 * whenever a stock's price changes.
 */
public class StockMarket implements Stock {

    private final List<Observer> observers = new ArrayList<>();
    private String stockSymbol;
    private double price;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockSymbol, price);
        }
    }

    /**
     * Updates the stock price and automatically notifies all
     * registered observers of the change.
     */
    public void setStockPrice(String stockSymbol, double price) {
        this.stockSymbol = stockSymbol;
        this.price = price;
        System.out.println("\n[StockMarket] " + stockSymbol + " price changed to $" + price);
        notifyObservers();
    }
}
