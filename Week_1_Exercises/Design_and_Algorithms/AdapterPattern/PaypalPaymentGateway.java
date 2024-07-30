package Week_1_Exercises.Design_and_Algorithms.AdapterPattern;

public class PaypalPaymentGateway {
    public void pay(double amount) {
        System.out.println("Processing paypal payment of amount: Rs."+amount);
    }
}
