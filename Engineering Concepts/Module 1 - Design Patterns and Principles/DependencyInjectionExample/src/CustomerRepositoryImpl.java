import java.util.HashMap;
import java.util.Map;

/**
 * Concrete implementation of CustomerRepository.
 * Simulates a data store using an in-memory map (in a real app,
 * this might talk to a database).
 */
public class CustomerRepositoryImpl implements CustomerRepository {

    private final Map<String, Customer> database = new HashMap<>();

    public CustomerRepositoryImpl() {
        // Seed with some sample data
        database.put("C001", new Customer("C001", "Maria Garcia", "maria.garcia@example.com"));
        database.put("C002", new Customer("C002", "Tom Becker", "tom.becker@example.com"));
    }

    @Override
    public Customer findCustomerById(String id) {
        Customer customer = database.get(id);
        if (customer == null) {
            System.out.println("No customer found with id: " + id);
        }
        return customer;
    }
}
