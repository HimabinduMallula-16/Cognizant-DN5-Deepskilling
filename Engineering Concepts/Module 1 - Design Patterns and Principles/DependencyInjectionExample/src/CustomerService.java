/**
 * Service class that depends on CustomerRepository to perform its work.
 * The dependency is provided via constructor injection rather than
 * being created internally (e.g. "new CustomerRepositoryImpl()"),
 * which decouples CustomerService from any specific implementation
 * and makes it easy to substitute mocks/fakes for testing.
 */
public class CustomerService {

    private final CustomerRepository customerRepository;

    // Constructor Injection: the dependency is passed in from outside.
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomerDetails(String id) {
        return customerRepository.findCustomerById(id);
    }
}
