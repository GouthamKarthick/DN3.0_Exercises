package Week_1_Exercises.Design_and_Algorithms.ObserverPattern;

public class MobileApp implements Observer {
    @Override
    public void update(double stockPrice) {
        System.out.println("MobileApp: Stock price updated to Rs." + stockPrice);
    }
}
