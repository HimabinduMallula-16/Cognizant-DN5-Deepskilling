/**
 * Subject interface for the Observer Pattern.
 * Defines methods to register, deregister, and notify observers.
 */
public interface Stock {
    void registerObserver(Observer observer);
    void deregisterObserver(Observer observer);
    void notifyObservers();
}
