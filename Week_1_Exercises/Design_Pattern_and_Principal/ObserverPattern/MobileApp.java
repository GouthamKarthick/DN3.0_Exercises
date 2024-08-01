package Week_1_Exercises.Design_Pattern_and_Principal.ObserverPattern;

public class MobileApp implements Observer {
    @Override
    public void update(double stockPrice) {
        System.out.println("MobileApp: Stock price updated to Rs." + stockPrice);
    }
}
