package Week_1_Exercises.Design_Pattern_and_Principal.StrategyPattern;

class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying Rs. " + amount + " using PayPal.");
    }
}
