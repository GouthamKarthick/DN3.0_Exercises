package Week_1_Exercises.Design_and_Algorithms.ProxyPattern;

import java.util.HashMap;
import java.util.Map;

public class ProxyImage implements Image{
    private String fileName;
    private RealImage realImage;
    private static Map<String, RealImage> imageCache = new HashMap<>();

    public ProxyImage(String filename) {
        this.fileName = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = imageCache.get(fileName);
            if (realImage == null) {
                realImage = new RealImage(fileName);
                imageCache.put(fileName, realImage);
            }
        }
        realImage.display();
    }
}
