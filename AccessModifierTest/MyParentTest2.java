package AccessModifierTest;

import Study_OOP.MyParent;

public class MyParentTest2 extends MyParent {
    public void printMembers() {
//      System.out.println(prv);    ERROR
//      System.out.println(dft);    ERROR : default는 다른 패키지에서 접근 불가
        System.out.println(prt);
        System.out.println(pub);
    }

    public static void main(String[] args) {
        MyParent p = new MyParent();
        // 아예 다른 패키지, 다른 클래스 이므로 'public' 만 접근 가능
//      System.out.println(p.prv);
//      System.out.println(p.dft);
//      System.out.println(p.prt);
        System.out.println(p.pub);
    }
}
