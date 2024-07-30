package Week_1_Exercises.Design_and_Algorithms.AdapterPattern;

public class StripePaymentGateway {
    public void makePayment(double amount) {
        System.out.println("Processing stripe payment of amount: Rs."+amount);
    }
}
