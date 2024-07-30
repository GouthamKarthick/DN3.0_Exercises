package Week_1_Exercises.Design_and_Algorithms.AdapterPattern;

public class StripeAdapter implements PaymentProcessor {
    private StripePaymentGateway stripe;
    
    public StripeAdapter(StripePaymentGateway stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        stripe.makePayment(amount);
    }
}
