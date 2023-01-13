package Study_OOP;

public class Tv {  // 설계도
    // 인스턴스 변수(iv) : 클래스 영역에서 선언, 인스턴스가 생성될 때 마다 iv가 새로 생성
    String color;   // null
    boolean power;  // false
    int channel;    // 0
    // 클래스 변수(cv) : 클래스 영역에서 'static'이 붙은 변수, 클래스가 메모리에 올라갈 때 생성
    static final String Company = "SAMSUNG";    // 상수

    // 메서드 : 반환타입 메서드명(매개변수)
    void powerOnOff() {     // 메서드 영역
        power = !power;  // iv는 클래스 안에서 어디서든 사용 가능
        // 지역 변수(lv) : 메서드 영역에서 선언, 메서드 영역에서만 사용 가능
        int pixel;
        // return; => 반환타입 void는 return 생략 가능
    }

    void changeChannel(int channel) {   // 매개변수가 있는 메서드
        this.channel = channel;
    }

    int showChannel() { // 반환값이 있는 메서드
        return this.channel;
    }

    String changeColor(String color) {  // 매개변수와 반환값이 둘 다 있는 메서드
        this.color = color;
        return this.color;
    }

    void channelUp() {  // 메서드는 하나의 작업만 => channel을 하나 더 해주는 작업
        ++channel;  // iv
    }
    void channelDown() {
        --channel;  // iv
    }

    // 생성자가 하나도 없다면 컴파일이 기본 생성자를 자동으로 추가
    Tv() {}     // 기본 생성자(Default Constructor) : 매개변수 X

    // 오버로딩
    Tv(String color, boolean power, int channel) {   // 매개변수가 있는 생성자
        System.out.println("Tv(String color, boolean power, int channel) 호출");
        // this 로 lv와 iv를 구분
        this.color = color;
        this.power = power;
        this.channel = channel;
    }

    Tv(String color) {
        // this()는 생성자를 호출하는 메서드
        this(color,false,0);
    }
}

class DVD {
    boolean power;

    void power() {
        power = !power;
    }
    void play() {
        System.out.println("play() 메서드 실행");
    }
    void stop() {
        System.out.println("stop() 메서드 실행");
    }
    void rew() {
        System.out.println("rew() 메서드 실행");
    }
    void ff() {
        System.out.println("ff() 메서드 실행");
    }
}

class SmartTv extends Tv {  // 상속 : 부모관계 맺어준다. (부모 - Tv, 자식 - SmartTv)
    // Tv 클래스에 있는 인스턴스 멤버 사용 가능 ( 생성자 예외 )
    String video, text;

    SmartTv() {}
    SmartTv(String video) {
        this.video = video;
    }

    void welcomeSmartTv() {
        System.out.println("SmartTv에 있는 메서드 : " + this.video + " 입니다.");
    }
    void caption() {
        System.out.println(text);
    }
}

// 비중이 높은 클래스 하나만 상속관계로, 나머지는 포함관계로 한다.
class TvDVD extends Tv {
    DVD dvd = new DVD();

    void play() {
        dvd.play();
    }
    void stop() {
        dvd.stop();
    }
    void rew() {
        dvd.rew();
    }
    void ff() {
        dvd.ff();
    }
}

class add {
    void print() {
        System.out.println("commit : ctrl + k");
        System.out.println("깃 commit 테스트");
        System.out.println("push : ctrl + shift + k");
        System.out.println("깃 push 테스트");
    }
}
