package Week_1_Exercises.Design_Pattern_and_Principal.ObserverPattern;

public class WebApp implements Observer {
    @Override
    public void update(double stockPrice) {
        System.out.println("WebApp: Stock price updated to Rs." + stockPrice);
    }
}
