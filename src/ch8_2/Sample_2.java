package ch8_2;
/*
인터페이스도 다른 인터페이스를 상속할수 있으며 인터페이스는
클레스와 다르게 다중 상속도 허용한다는 것을 알수있다.
 */
interface InterA{
    void methodA();
}
interface InterB{
    void methodB();
}
interface InterC extends InterA,InterB{
    void methodC();
}
class InpleC implements InterC{

    @Override
    public void methodA() {
        System.out.println("A 메소드 실행");
    }

    @Override
    public void methodB() {
        System.out.println("B 메소드 실행");
    }

    @Override
    public void methodC() {
        System.out.println("C 메소드 실행");
    }
}
public class Sample_2 {
    public static void main(String[] args) {
        InpleC ic = new InpleC();

        InterA ia = ic;
        ia.methodA();
        System.out.println("===============");

        InterB ib = ic;
        ib.methodB();
        System.out.println("===============");

        InpleC interc = ic;
        interc.methodA();
        interc.methodB();
        interc.methodC();
    }
}
