package Study_OOP;

import java.util.Arrays;

// 매개변수의 다형성 - 다형적 매개변수
class Product {
    int price, bonusPoint;

    Product(int price) {
        this.price = price;
        this.bonusPoint = (int)(price / 10.0);  // 보너스 점수는  제품가격의 10%
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}
class Audio extends Product {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}
class Tv1 extends Product {
    Tv1() {
        super(100); // 조상클래스의 생성자 Product(int price) 호출
    }
    // Object 클래스의 toString()을 오버라이딩
    public String toString() {
        return "Tv";
    }
}

class Buyer {
    int money = 1000, bonusPoint = 0, i = 0;

    Product[] cart = new Product[10];   // 하나의 배열에 여러 종류의 타입을 담을 수 있음

    void buy(Product p) {
        if (this.money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        this.money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;
        System.out.println(Arrays.toString(cart));
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for(int i=0; i<cart.length; i++) {
            if(cart[i] == null) {
                break;
            }
            sum += cart[i].price;
            itemList += cart[i] + ", ";
        }
        System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

public class oop_12 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        // 다형성 장점 1 - 매개변수로 조상인 Product 타입을 받기 때문에 자손타입 모두 가능
        // 하나의 메서드로 매개변수를 여러 개 받을 수 있음
        b.buy(new Tv1());           // buy(Product p)
        b.buy(new Computer());      // buy(Product p)
        b.summary();

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");

        // 다형성 장점 2 - 하나의 배열에 여러 객체를 저장할 수 있음
        Product p1 = new Tv1();
        Product p2 = new Computer();
        Product p3 = new Audio();

        Product[] pArr = new Product[3];
        pArr[0] = new Tv1();
        pArr[1] = new Computer();
        pArr[2] = new Audio();

        Product[] pArr2 = {new Tv1(), new Computer(), new Audio()};
    }
}
