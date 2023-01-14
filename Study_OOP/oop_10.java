package Study_OOP;

public class oop_10 {   // 다형성(Polymorphism)
    public static void main(String[] args) {
        Tv t = new SmartTv();   // 타입 불일치. Tv 인스턴스 멤버만 사용 가능
        // SmartTv stv = new Tv();  자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 없음

        // 참조변수의 형변환 : 조상 자손 관계의 참조변수는 서로 형변환 가능
        FireEngine f = new FireEngine();
        Car c = (Car) f;     // 조상인 Car 타입으로 형변환(생략가능)
        FireEngine f2 = (FireEngine) c;    // 자손인 FireEngine 타입으로 형변환(생략불가)
//        Ambulance a = (Ambulance) f;      상속 관계가 아닌 클래스 간의 형변환 불가

        // 강의 예제
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;  // 실제 인스턴스가 무엇인지가 중요

        Car car2 = (Car) fe2;   // fe2는 null -> car2도 null -> 객체가 없으므로 멤버 사용 불가
//        car2.drive();     NullPointerException 발생
        System.out.println(car2);   // null

        fe.water();
        car = fe;   // car = (Car) fe; 에서 형변환 생략
        // car.water();     Car 타입의 참조변수인 car로는 water() 사용불가 => Error
        fe2 = (FireEngine) car; // 자손타입 <- 조상타입. 형변환 생략 불가
        fe2.water();

        // 형변환 주의 에러
        Car c2 = new Car();
        FireEngine fe3 = (FireEngine) c2;   // 형변환 실행 에러 : java.lang.ClassCastException
//        fe3.water();      Car 인스턴스이기 때문에 water 메서드가 없음
    }
}
