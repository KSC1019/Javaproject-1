package ch10;

import java.util.ArrayList;

class Fruit implements Eatable{ public String toString(){return "Fruit";}}
class Apple extends Fruit { public String toString(){return "Apple";}}
class Grape extends Fruit { public String toString(){return "Grape";}}
class Toy{ public String toString(){return "Toy";}}
interface Eatable{}
public class fruitbox1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Grape> grapeBox = new Box<Grape>();
        Box<Toy> toyBox = new Box<Toy>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        //appleBox.add(new Toy()); 에러사항 applebox에는 apple만 넣을수있음
        grapeBox.add(new Grape());
        toyBox.add(new Toy());
        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);

        System.out.println("fruitbox - "+fruitBox);
        System.out.println("applebox - "+appleBox);
        System.out.println("grapebox - "+grapeBox);
    }
}
/*
하단의 제네릭 클래스인 Box<T> 를 통해 Box객체를 생성했으며,
T타입의 객체만 저장할수있게 설정했다.
또한 Arraylist를 이용해 여러가지 객체를 저장할수있게 설정했다.
 */
class FruitBox<T extends Fruit & Eatable> extends Box<T>{}
class Box<T>{
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) {list.add(item);}
    T get(int i) {return list.get(i);}
    int size() {return list.size();}

    public String toString() {
        return list.toString();
    }
}
/*
제네릭 클래스의 객체 생성과 사용에 대해 알아보는 코드이다.
 */