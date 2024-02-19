package ch12;

interface MyFunc{
    void run();
}
public class Sample1 {
    static void excute(MyFunc f){
        f.run();
    }
    static MyFunc getMyFunc(){
        MyFunc f = () -> System.out.println("f3.run()");
        return f;
    }
    public static void main(String[] args) {
        MyFunc f1 = ()->System.out.println("f1.run()");
        MyFunc f2 = new MyFunc() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };
        MyFunc f3 = getMyFunc();
        f1.run();
        f2.run();
        f3.run();
        excute(f1);
        excute( ()->System.out.println("run()"));
    }
}
