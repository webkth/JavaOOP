package Study_OOP;  // 패키지 선언 : 소스파일의 첫 번째 문장으로 단 한번 선언

public class Parent {
    int x = 10; // super.x
}

class Child extends Parent {
    int x = 20; // this.x
    int y;

    // super : 객체 자신을 가리키는 참조변수. 인스턴스 메서드(생성자) 내에만 존재, static 메서드 사용 X
    void method() {
        System.out.println("x = " + x);     // 가장 가까운 x
        System.out.println("this.x = " + this.x);   // 객체의 x
        System.out.println("super.x = " + super.x); // 조상의 x
    }
}

class Parent2 {
    int x, y; // this.y, super.y 둘 다 가능

    Parent2() {}
    Parent2(int x) {
//      첫 줄에 생성자가 아니므로 컴파일러가 super(); 추가
        System.out.println("Parent(int x) 생성자 호출");
        this.x = x;
    }
}

class Child2 extends Parent2 {
    Child2() {}
    Child2(int x, int y) {
        super(x);   // 부모 클래스 생성자 호출, super()와 this()는 가장 첫 줄에 사용
        this.y = y;
    }

    void method() {
        System.out.println("y = " + y);
        System.out.println("this.x = " + this.y);
        System.out.println("super.x = " + super.y);
    }

    public String toString() {
        return "{ x : "+ this.x + ", y : " + this.y + " }";
    }
}