package Week_1_Exercises.Design_and_Algorithms.StrategyPattern;

public class StrategyPattern {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe");
        PaymentStrategy paypalPayment = new PayPalPayment("john.doe@example.com");

        // Create payment contexts with different strategies
        PaymentContext paymentContext1 = new PaymentContext(creditCardPayment);
        PaymentContext paymentContext2 = new PaymentContext(paypalPayment);

        // Execute payments
        System.out.println("Executing credit card payment:");
        paymentContext1.executePayment(150.00);

        System.out.println("\nExecuting PayPal payment:");
        paymentContext2.executePayment(200.00);
    }
}
