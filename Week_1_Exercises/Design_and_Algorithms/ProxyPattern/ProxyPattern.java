package Week_1_Exercises.Design_and_Algorithms.ProxyPattern;

public class ProxyPattern {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");
        Image image3 = new ProxyImage("image1.jpg");

        System.out.println("Displaying image1:");
        image1.display();
        System.out.println("\nDisplaying image2:");
        image2.display();
        System.out.println("\nDisplaying image3:");
        image3.display();
    }
}