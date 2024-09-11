package Chap8;

public class Driver {
    void drive(Vehicle vehicle) {
/*        if (vehicle instanceof Bus) {
            System.out.println("Bus//");
        }else if (vehicle instanceof Taxi) {
            System.out.println("Taxi//");
        }
        vehicle.run();
        아래는 위와 동일하나 스위치 문으로 바꾼것*/

        switch (vehicle){
            case Bus bus -> System.out.println("Bus//");
            case Taxi taxi -> System.out.println("Taxi//");
            default -> System.out.println(" ");
        }
    }
}
