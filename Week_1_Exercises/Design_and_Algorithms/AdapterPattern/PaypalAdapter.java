package Week_1_Exercises.Design_and_Algorithms.AdapterPattern;

public class PaypalAdapter implements PaymentProcessor {
    private PaypalPaymentGateway paypal;

    public PaypalAdapter(PaypalPaymentGateway paypal) {
        this.paypal = paypal;
    }

    @Override
    public void processPayment(double amount) {
        paypal.pay(amount);
    }
}