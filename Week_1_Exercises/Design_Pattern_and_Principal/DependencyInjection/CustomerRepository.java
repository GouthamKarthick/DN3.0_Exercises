package Week_1_Exercises.Design_Pattern_and_Principal.DependencyInjection;

public interface CustomerRepository {
    Customer findCustomerById(String id);
}
