package Week_1_Exercises.Design_and_Algorithms.DependencyInjection;

public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer findCustomerById(String id) {
        return customerRepository.findCustomerById(id);
    }
}
