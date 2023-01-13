package Study_OOP;

public class oop_9 {
    public static void main(String[] args) {
        Time time = new Time();
//        System.out.println(time.hour);    private 접근 제어자로 직접 접근 불가
        time.setHour(22);
        System.out.println("캡슐화된 클래스의 iv 접근 : " + time.getHour());
    }
}
