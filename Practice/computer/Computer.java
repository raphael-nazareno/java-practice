public class Computer {
    private String make;
    private String processor;
    private int memory;
    private int year;
    private double price;

    private String constructor;

    Computer(String make, String processor) {
        this.make = make;
        this.processor = processor;
    }

    Computer(String make, String processor, int memory, int year, double price) { // Re-use constructor with two
        this(make, processor); // parameters in constructor with
        if (memory <= 4 || memory >= 20) // three parameters with keyword this.
            this.memory = 0;
        else
            this.memory = memory;
        this.year = year;
        this.price = price;
    }

    // Make
    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return this.make;
    }

    // Processor
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getProcessor() {
        return this.processor;
    }

    // Memory
    public void setMemory(int memory) {
        if (memory <= 4 || memory >= 20)
            this.memory = 0;
        else
            this.memory = memory;
    }

    public int getMemory() {
        return this.memory;
    }

    // Year
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    // Price
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    // toString
    public String toString() {
        return String.format("Computer Info: Make - %s | Processor - %s | Memory - %d GB | Year - %d | Price - $%f",
                make, processor, memory, year, price);
    }

}
