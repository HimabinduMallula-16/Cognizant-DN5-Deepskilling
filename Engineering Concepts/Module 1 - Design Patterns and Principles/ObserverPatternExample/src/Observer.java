/**
 * Observer interface for the Observer Pattern.
 * Concrete observers implement update() to react to subject state changes.
 */
public interface Observer {
    void update(String stockSymbol, double newPrice);
}
