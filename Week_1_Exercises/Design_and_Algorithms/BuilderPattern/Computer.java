package Week_1_Exercises.Design_and_Algorithms.BuilderPattern;

public class Computer {
    private String CPU, RAM, storage, GPU;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public String getGPU() {
        return GPU;
    }

    public static class Builder {
        private String CPU, RAM, storage, GPU;
        public Builder setCPU (String CPU) {
            this.CPU = CPU;
            return this;
        }
        public Builder setRAM (String RAM) {
            this.RAM = RAM;
            return this;
        }
        public Builder setStorage (String storage) {
            this.storage = storage;
            return this;
        }
        public Builder setGPU (String GPU) {
            this.GPU = GPU;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", GPU='" + GPU + '\'' +
                '}';
    }
}
