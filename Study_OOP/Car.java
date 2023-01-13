package Study_OOP;

public class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive() 메서드 호출");
    }
    void stop() {
        System.out.println("stop() 메서드 호출");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("FireEngine 클래스의 water() 메서드 호출");
    }
}

class Ambulance extends Car {
    void siren() {
        System.out.println("Ambulance 클래스의 siren() 메서드 호출");
    }
}