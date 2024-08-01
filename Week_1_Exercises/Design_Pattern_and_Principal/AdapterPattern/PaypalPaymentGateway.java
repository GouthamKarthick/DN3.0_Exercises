package Week_1_Exercises.Design_Pattern_and_Principal.AdapterPattern;

public class PaypalPaymentGateway {
    public void pay(double amount) {
        System.out.println("Processing paypal payment of amount: Rs."+amount);
    }
}
