package Chap8;

public class DriverEx {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Vehicle bus = new Bus();
        driver.drive(bus);

        Vehicle taxi = new Taxi();
        driver.drive(taxi);
    }
}
