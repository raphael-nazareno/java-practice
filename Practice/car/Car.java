public class Car {
    private String make;
    private String model;
    private int year;
    private int carID;
    private static int nextID = 1;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.carID = nextID;
    }

    // Make
    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return this.make;
    }

    // Model
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    // Year
    public void setYear(int year) {
        this.year = year;
    }

    public int setYear() {
        return this.year;
    }

    public int getCarID() {
        return this.carID;
    }

    public String toString() {
        return String.format("Car Make: %s. Car Model: %s. Car Year: %d. Car ID: %d.", make, model, year, carID);
    }

}
