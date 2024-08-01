package Week_1_Exercises.Design_Pattern_and_Principal.BuilderPattern;

public class BuilderPattern {
    public static void main(String[] args) {
        Computer desktop = new Computer.Builder()
            .setCPU("Intel i5")
            .setRAM("8GB")
            .setStorage("256GB SSD")
            .build();
        System.out.println("Desktop Configuration: "+desktop);
    }
}
