package finalexam.task1;

public class Computer {

    private String brand;

    private int memory;


    public String toString() {
        return null;
    }

    public Computer(String brand, int memory) {
        this.brand = brand;
        this.memory = memory;
    }

    // Getters and setters for brand and memory
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
