package Week_1_Exercises.Design_and_Algorithms.DependencyInjection;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public Customer findCustomerById(String id) {
        // Dummy implementation for example purposes
        return new Customer(id, "John Doe", "john.doe@example.com");
    }
}
