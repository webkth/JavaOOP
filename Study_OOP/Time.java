package Study_OOP;

public class Time {     // 캡슐화 : 메서드를 통한 간접 접근
    private int hour, minute, second;   // private 접근 제어자로 외부 접근 차단

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {     // pubilc 메서드로 iv에 간접 접근
        if (isValidHour(hour)) {
            return;
        }
        this.hour = hour;
    }

    // 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
    private boolean isValidHour(int hour) {
        return hour < 0 || hour > 23;
    }
}
