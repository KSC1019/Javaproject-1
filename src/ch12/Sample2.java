package ch12;

public class Sample2 {
    public static void main(String[] args) {
        MyFunctionalInterface finter;

        finter = () -> {
            String str = "method call 1";
            System.out.println(str);
        };
        finter.method();

        finter = () -> {
            System.out.println("method call 2");
        };
        finter.method();

        finter = () -> System.out.println("method call 3");
        finter.method();
    }
}
