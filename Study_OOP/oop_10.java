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
    }
}
