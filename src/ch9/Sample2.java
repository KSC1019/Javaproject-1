package ch9;

public class Sample2{
    void finalMessage() {
        System.out.println("그럼 수고하세요.");
    }
    public static void main(String[] args) {
        Sample2 sample = new Sample2();
        int res;
        try{
            res = 5/0;
            sample.finalMessage();
        }catch (ArithmeticException e){
            res = -1;
            System.out.println("number cant divided by 0");
        }finally {
            sample.finalMessage();
        }
    }
}
