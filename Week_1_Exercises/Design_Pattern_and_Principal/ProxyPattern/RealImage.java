package Week_1_Exercises.Design_Pattern_and_Principal.ProxyPattern;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String filename) {
        this.fileName = filename;
        loadImageFromServer();
    }

    private void loadImageFromServer() {
        System.out.println("Loading image: " + fileName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + fileName);
    }
}
