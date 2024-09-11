package Chap6;

public class Car {
    String company;//번수 선언시 바로 초기화 하는것 보다는
    String model;
    int maxSpeed;

    Car(){//입력받는 값이 (매게 변수) 없는 생성자
        company = "Porche";//클래스 내에서 생성자를 통해 초기화를 진행해 주는것을 추천.
    }

    Car(String company){
        this.company = company;//this가 붙은 컴퍼니는 멤버변수의 컴퍼니. 컴퍼니는 입력값을 받을 컴퍼니(변수)
    }

    Car(String company, int maxSpeed){
        this.company = company;//this가 붙은 컴퍼니는 멤버변수의 컴퍼니. 컴퍼니는 입력값을 받을 컴퍼니(변수)
        this.maxSpeed = maxSpeed;
    }

    Car(String company, String model, int maxSpeed){
        this.company = company;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    String PrintField(){
        return "Company : " + company + ", Model : " + model + ", Max Speed : " +  maxSpeed;
    }

    void setmodel(String model){
        this.model = model;
    }
    //MaxSpeed 값 넣어주는 메소드.
    void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public static void main(String[] args){
        Car car = new Car();//클래스 객체 생성
        System.out.println(car.PrintField());

        Car car2 = new Car("Lamborgini",300);
        System.out.println(car2.company +" "+ car2.maxSpeed);
        System.out.println("car2 campany : " + car2);

        Car car3 = new Car("Henchel", "Tiger", 40);
        System.out.println(car3.company + " "+car3.maxSpeed + " " + car3.model);
    }
}
