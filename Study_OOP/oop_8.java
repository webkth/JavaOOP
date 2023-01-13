package Study_OOP;

public class oop_8 {
    public static void main(String[] args) {
        MyParent p = new MyParent();
//      System.out.println(p.prv);    private는 같은 클래스 내에서만 접근
        System.out.println(p.dft);
        System.out.println(p.prt);
        System.out.println(p.pub);
    }
}
