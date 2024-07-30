public class SingletonPatternExample {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        if (log1 == log2) 
            System.out.println("Both log1 and log2 are from same instance. ");
        else 
            System.out.println("Log1 and Log2 are from different instances");

        log1.log("This is log1");
        log2.log("This is log2");
    }
}