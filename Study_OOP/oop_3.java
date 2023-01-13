package Study_OOP;

public class oop_3 {
    public static void main(String[] args) {
        // 생성자(Constructor) : 하나의 클래스 안에 최소 하나의 생성자가 존재해야 한다.
        Tv tv1 = new Tv();  // 'new Tv()' 생성자
        Tv tv2 = new Tv("red",true,24);
        System.out.println("생성자로 자동 초기화 된 tv2 객체 : " + tv2.color);
        System.out.println("생성자로 자동 초기화 된 tv2 객체 : " + tv2.power);
        System.out.println("생성자로 자동 초기화 된 tv2 객체 : " + tv2.channel);

        // 매개변수가 있는 메서드
        tv2.changeChannel(53);
        System.out.println("tv2.changeChannel() : " + tv2.channel);

        // 반환값이 있는 메서드
        int nowChannel = tv2.showChannel();
        System.out.println("tv2.showChannel()의 반환값 : " + nowChannel);

        // 매개변수와 반환값이 있는 메서드
        String nowColor = tv2.changeColor("blue");
        System.out.println("tv2.changeColor()의 반환값 : " + nowColor);
    }
}
