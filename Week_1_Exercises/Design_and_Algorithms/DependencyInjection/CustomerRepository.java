package Week_1_Exercises.Design_and_Algorithms.DependencyInjection;

public interface CustomerRepository {
    Customer findCustomerById(String id);
}
