/**
 * Strategy interface for the Strategy Pattern.
 * Defines a common method that all concrete payment strategies implement.
 */
public interface PaymentStrategy {
    void pay(double amount);
}
