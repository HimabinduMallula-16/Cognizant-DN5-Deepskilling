public class AdapterTest {

    public static void main(String[] args) {

        PaymentProcessor paypalProcessor =
                new PayPalAdapter(new PayPalGateway());

        PaymentProcessor stripeProcessor =
                new StripeAdapter(new StripeGateway());

        paypalProcessor.processPayment(5000);
        stripeProcessor.processPayment(10000);
    }
}