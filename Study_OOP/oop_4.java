package Study_OOP;

public class oop_4 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv("LG video");    // Tv 클래스를 상속받은 SmartTv 타입 객체 생성
        stv.channel = 23;
        stv.welcomeSmartTv();
        int nowChannel = stv.showChannel();
        System.out.println("Tv 클래스에 있는 메서드 : " + nowChannel);
    }
}
