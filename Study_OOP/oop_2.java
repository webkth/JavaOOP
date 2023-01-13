package Study_OOP;

public class oop_2 {
    public static void main(String[] args) {
        // 객체 배열
        Tv[] tvArr = new Tv[5];
        for(int i=0;i<tvArr.length;i++) {   // 배열.length : 배열의 길이
            tvArr[i] = new Tv();    // 모든 tvArr 배열 요소에 객체 생성
        }
        tvArr[0].channel = 10;
        System.out.println("tvArr[0].channel : " + tvArr[0].channel);   // 10
        System.out.println("tvArr[2].channel : " + tvArr[2].channel);   // 0

        Tv[] tvArr2 = {new Tv(), new Tv(), new Tv(), new Tv(), new Tv()};   // tvArr과 같은 방법
        for(int i=0;i<tvArr2.length;i++) {
            System.out.println("클래스 변수 : " + Tv.Company);
        }
    }
}
