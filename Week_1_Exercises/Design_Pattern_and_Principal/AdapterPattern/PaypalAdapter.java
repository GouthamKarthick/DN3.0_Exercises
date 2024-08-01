package Week_1_Exercises.Design_Pattern_and_Principal.AdapterPattern;

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