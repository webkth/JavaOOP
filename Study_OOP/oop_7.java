package Study_OOP;  // 패키지의 선언

import java.util.Date;  // import문 : 클래스를 사용할 때 패키지 이름을 생략할 수 있음, 프로그램 성능 영향 X
//import java.lang.*;   기본 패키지이므로 생략가능, '*'은 모든 클래스를 의미

//import static java.lang.System.out; // System.out을 out만으로 참조가능

public class oop_7 {
    // 하나의 대상에 여러 제어자를 같이 사용 가능 ( 접근 제어자는 하나만 )
    public static final int WIDTH = 200;

    public static void main(String[] args) {
        Date today = new Date();    // java.util.Date today = new java.util.Date();

        // java.lang 패키지의 클래스는 import 하지 않고도 사용할 수 있음 (String, Object, ...)
        System.out.println("static 멤버를 사용할 때 클래스 이름을 생략할 수 있다.");

        System.out.println("WIDTH : " + WIDTH);

//        Abstract a = new Abstract();     ERROR. 추상 클래스의 인스턴스 생성불가
    }
}

class StaticTest {
    // 클래스 변수(static 변수)
    static int width = 200;     // 간단 초기화(명시적)
    static int height = 120;

    // 클래스 초기화 블럭
    static {
        System.out.println("static 변수의 복잡한 초기화 수행");
    }

    static int max(int a, int b) {  // 클래스 메서드(static 메서드)
        // 인스턴스 멤버(iv, im) 사용 불가
        return a > b ? a : b;
    }
}

// 변경될 수 없는 클래스(확장될 수 없는 클래스) : 다른 클래스의 조상이 될 수 없음 (ex. String, Math ..)
final class FinalTest {
    final int MAX_SIZE = 10;    // 값을 변경할 수 없는 멤버변수(상수)

    final int getMaxSize() {    // 오버라이딩 할 수 없는 메서드(변경불가)
        final int LV = MAX_SIZE;    // 값을 변경할 수 없는 지역변수(상수)
        return MAX_SIZE;
    }
}

abstract class Abstract {   // 추상 클래스(추상 메서드를 포함한 클래스)
    abstract void move();   // 추상 메서드(구현부가 없는 메서드) -> 선언부만 있는 미완성 메서드
    // 추상클래스를 상속 받아서 완성된 클래스(구상 클래스)를 만든 후에 인스턴스 생성 가능
}