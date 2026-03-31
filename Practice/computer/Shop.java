public class Shop {

    public static void main(String[] args) {
        Computer myComputer = new Computer("Lenovo", "AMD Ryzen 7 8840HS");
        myComputer.setMemory(16);
        myComputer.setYear(2024);
        myComputer.setPrice(1200);

        System.out.println(myComputer);
    }
}
