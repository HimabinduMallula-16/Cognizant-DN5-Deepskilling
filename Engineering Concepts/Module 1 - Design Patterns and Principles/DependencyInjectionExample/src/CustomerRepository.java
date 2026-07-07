/**
 * Repository interface defining data-access operations for Customer.
 * Depending on an abstraction (rather than a concrete class) is what
 * allows the dependency to be injected and swapped easily.
 */
public interface CustomerRepository {
    Customer findCustomerById(String id);
}
