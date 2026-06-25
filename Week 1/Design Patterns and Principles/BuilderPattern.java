//Exercise 3
class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
    }
    public void display() {
        System.out.println("CPU: " + cpu + ", RAM: " + ram + ", Storage: " + storage);
    }
    static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        Builder setCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }
        Builder setRAM(String ram) {
            this.ram = ram;
            return this;
        }
        Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        Computer build() {
            return new Computer(this);
        }
    }
}
public class BuilderPattern{
    public static void main(String[] args) {
        Computer pc1 = new Computer.Builder()
                .setCPU("Intel i5")
                .setRAM("8GB")
                .setStorage("512GB SSD")
                .build();
        Computer pc2 = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .setStorage("1TB SSD")
                .build();
        pc1.display();
        pc2.display();
    }
}