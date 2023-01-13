package Study_OOP;

public class oop_5 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.point.y = 10;
        System.out.println("포함관계 변수 사용 : " + circle.point.y);

        // Object 클래스의 toString() 메서드
        Point pointOne = new Point();
        System.out.println("toString() 메서드 : " + pointOne.toString()); // 객체의 주소값 출력
        Point pointTwo = new Point();
        System.out.println("toString() 메서드 : " + pointTwo.toString());
        // println은 참조변수가 들어오면 toString()을 호출
        System.out.println("toString() 메서드는 생략 가능 : " + pointTwo);

        // 오버라이딩(Overriding)
        Point3D point3D = new Point3D();
        System.out.println("pointOne.getLocation() : " + pointOne.getLocation());
        System.out.println("Overriding : " + point3D.getLocation());

        // Object 클래스의 toString() 오버라이딩
        PointToString pointToString = new PointToString(2,3);
        System.out.println("toString() 오버라이딩 : " + pointToString);
        System.out.println("""
        - 오버라이딩의 조건
        1. 선언부가 조상 클래스의 메서드와 일치
        2. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없음
        3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없음
        """);

        // 오버로딩 vs 오버라이딩
        System.out.println("""
        오버로딩(Overloading) : 기존에 없는 새로운 메서드를 정의(new)
        오버라이딩(Overriding) : 상속받은 멧드의 내용을 변경(change,modify)
        """);
    }
}
