package Week_1_Exercises.Design_and_Algorithms.AdapterPattern;

public class AdapterPattern {
    public static void main(String[] args) {
        StripePaymentGateway stripe = new StripePaymentGateway();
        PaypalPaymentGateway paypal = new PaypalPaymentGateway();

        StripeAdapter stripeAdapter = new StripeAdapter(stripe);
        PaypalAdapter paypalAdapter = new PaypalAdapter(paypal);

        System.out.println("Using stripe: ");
        stripeAdapter.processPayment(1000.0);

        System.out.println("Using paypal: ");
        paypalAdapter.processPayment(2000.0);
    }
}
