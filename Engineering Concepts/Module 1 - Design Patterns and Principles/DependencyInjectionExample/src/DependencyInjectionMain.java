/**
 * Main class demonstrating Dependency Injection.
 * Creates a CustomerService with a CustomerRepositoryImpl dependency
 * injected via the constructor, then uses it to find customers.
 */
public class DependencyInjectionMain {

    public static void main(String[] args) {

        // Create the dependency
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject the dependency into the service via its constructor
        CustomerService customerService = new CustomerService(repository);

        // Use the service
        Customer customer1 = customerService.getCustomerDetails("C001");
        System.out.println("Found: " + customer1);

        Customer customer2 = customerService.getCustomerDetails("C002");
        System.out.println("Found: " + customer2);

        // Lookup for a non-existent customer
        Customer customer3 = customerService.getCustomerDetails("C999");
        System.out.println("Found: " + customer3);
    }
}
