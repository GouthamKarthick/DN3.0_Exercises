package Week_1_Exercises.Design_Pattern_and_Principal.ObserverPattern;

public class ObserverPattern {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        System.out.println("Updating stock price to Rs. 100.00");
        stockMarket.setStockPrice(100.00);

        stockMarket.deregisterObserver(webApp);
        System.out.println("\nUpdating stock price to Rs. 150.00");
        stockMarket.setStockPrice(150.00);
    }
}
