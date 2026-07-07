/**
 * Test class demonstrating the Strategy Pattern.
 * Shows selecting and switching payment strategies at runtime.
 */
public class PaymentTest {

    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(new CreditCardPayment("4111111111111234", "John Doe"));
        context.executePayment(150.75);

        // Switch strategy at runtime to PayPal
        context.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
        context.executePayment(89.99);

        // Strategy can also be passed directly via constructor
        PaymentContext anotherContext = new PaymentContext(new CreditCardPayment("5500000000005678", "Jane Smith"));
        anotherContext.executePayment(42.00);
    }
}
