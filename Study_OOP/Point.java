package Study_OOP;

// 부모가 없는 클래스는 자동적으로 Object 클래스를 상속받게 된다.
public class Point {    // 컴파일 시 'extends Object' 자동으로 추가
    int x, y;

    Point() {}
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void setX(int x) {
        this.x = x;
    }

    void setX() {   // 오버로딩(Overloading)
        this.x = 0;
    }

    String getLocation() {
        String location = "x : " + x + ", y : " + y;
        return location;
    }
}

class PointToString {
    int x, y;

    PointToString(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Object 클래스의 toString() 메서드를 오버라이딩
    public String toString() {
        System.out.println("toString() 오버라이딩");
        return "{ x : " + x + ", y : " + y + " }";
    }
}

class Point3D extends Point {   // 상속 : is-a 관계, 단일상속(조상은 하나만 허용)
    int z;

    Point3D() {}
    Point3D(int x, int y, int z) {
        super(x, y);    // Point(int x, int y) 호출
        this.z = z;
    }

    // 오버라이딩(Overriding) : 상속받은 조상의 메서드를 자신에 맞게 변경하는 것
    String getLocation() {  // 선언부는 변경할 수 없음.
        // 구현부만 변경
        String location = "x : " + x + ", y : " + y + ", z : " + z;
        return location;
    }

    void setX() {
        System.out.println("Point 클래스의 setX() 메서드 오버라이딩");
    }
    public String toString() {
        return "{ x : " + this.x + ", y : " + this.y + ", z : "+ this.z + " }";
    }
}

class Circle {
    Point point = new Point();  // 포함관계(has-a) : Circle 클래스가 Point 클래스를 포함
    int r;
}