package Study_OOP;

public class MyParent {
    private int prv;    // private : 같은 클래스 내에서만 접근 가능
    int dft;            // default : 같은 패키지
    protected int prt;  // protected : 같은 패키지 + 자손 클래스(다른 패키지)
    public int pub;     // public : 접근 제한 X

    public void printMembers() {
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }
}