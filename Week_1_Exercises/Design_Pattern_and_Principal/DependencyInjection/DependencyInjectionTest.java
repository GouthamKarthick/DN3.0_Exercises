package Week_1_Exercises.Design_Pattern_and_Principal.DependencyInjection;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create repository instance
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject repository instance into service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use service to find a customer
        Customer customer = customerService.findCustomerById("123");
        System.out.println(customer);
    }
}
