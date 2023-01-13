package Study_OOP;

public class oop_1 {
    public static void main(String[] args) {
        Tv tv1 = new Tv();  // Tv 타입의 인스턴스 생성 후 그 주소를 참조변수 tv1에 저장
        System.out.println("tv1.color : " + tv1.color);     // null
        System.out.println("tv1.power : " + tv1.power);     // false
        System.out.println("tv1.channel : " + tv1.channel); // 0

        // 메서드 호출 : 메서드명;
        tv1.powerOnOff();   // false -> true로 바꿔주는 작업
        System.out.println("tv1.powerOnOff() 메서드 호출 후 : " + tv1.power);     // true
        tv1.channelUp();    // channel을 1 더해주는 작업
        System.out.println("tv1.channelUp() 메서드 호출 후 : " + tv1.channel);

        // 다른 객체 생성
        Tv tv2 = new Tv();
        System.out.println("tv1.channel : " + tv1.channel);     // 1
        System.out.println("tv2.channel : " + tv2.channel);     // 0

        // tv2 = tv1;  // tv1의 주소값을 tv2에 저장
        System.out.println("tv2.channel : " + tv2.channel);

        // 클래스 변수 사용 => 각 객체에 공통적인 속성
        System.out.println("클래스 변수의 사용 : " + Tv.Company);   // 클래스명.클래스변수
    }
}
