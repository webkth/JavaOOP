package Study_OOP;

public class oop_6 {
    public static void main(String[] args) {
        Child child = new Child();
        child.method();
        System.out.println("참조변수 super은 조상의 멤버를 자신의 멤버와 구별할 때 사용");

        Child2 childTwo = new Child2();
        childTwo.method();

        // super() : 조상의 생성자를 호출, 조상의 멤버는 조상의 생성자를 호출해서 초기화
        Child2 child2 = new Child2(50,45);
        System.out.println(child2);

        System.out.println("생성자의 첫 줄에 반드시 생성자를 호출해야한다.");
        System.out.println("그렇지 않으면 컴파일러가 생성자의 첫 줄에 super()를 삽입");

        Point3D p3 = new Point3D(2,3,5);
        System.out.println(p3);
    }
}
