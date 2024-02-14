package ch10;

public class Sample1 {
    public static void main(String[] args) {
        Box2<String> box = new Box2<>();
        box.set("hello");

        String str = box.get();
        System.out.println(str);
        //box2의 getter test

        Box2<Integer> box2 = new Box2<>();
        box2.set(9);
        //box2 의 setter test

        int value = box2.get();
        System.out.println(value);
    }
}
/*
제네릭 타입에 대해 공부하는 코드입니다.

 */