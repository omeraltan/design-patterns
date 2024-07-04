package src.main.java.com.design.creational.builder;

class Computer {
    // Zorunlu özellikler
    private String CPU;
    private String RAM;

    // Opsiyonel özellikler
    private String storage;
    private String graphicsCard;

    // Özel bir constructor kullanıyoruz
    private Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }

    // Sadece getter metodları, setter yok
    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage + ", graphicsCard=" + graphicsCard + "]";
    }

    // Builder Sınıfı (Static Inner Class)
    public static class ComputerBuilder {
        // Zorunlu özellikler
        private String CPU;
        private String RAM;

        // Opsiyonel özellikler
        private String storage;
        private String graphicsCard;

        // Zorunlu özellikler için constructor
        public ComputerBuilder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        // Opsiyonel özellikler için setter benzeri metodlar
        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        // Build metodu
        public Computer build() {
            return new Computer(this);
        }
    }
}


public class ComputerTest {

    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("Intel i7", "16GB")
            .setStorage("1TB SSD")
            .setGraphicsCard("NVIDIA GTX 3080")
            .build();

        System.out.println(computer);
    }

}
