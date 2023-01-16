package Study_OOP;

public class oop_11 {
    public static void main(String[] args) {
        // instanceof 연산자 => 조상들도 모두 true => 형변환 가능
        FireEngine fe = new FireEngine();
        System.out.println(fe instanceof Object);           // true
        System.out.println(fe instanceof  Car);             // true
        System.out.println(fe instanceof  FireEngine);      // true

        Object obj = (Object) fe;   // Object는 모든 클래스의 조상이기 때문에 항상 가능
        Car c = (Car) fe;
    }

    void doWork(Car c) {    // 형변환 전 항상 확인
        if (c instanceof FireEngine) {  // true -> 형변환 가능
            FireEngine fe = (FireEngine) c;
            fe.water();    // FireEngine 참조변수로 water 메서드 호출
        }
    }
}
