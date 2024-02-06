package ch8_3;

/*
해당 코드는 인터페이스와 상속을 같이 쓰는 것에 대해
공부하는 코드

8.1 예시로 쓰던 코드를 다시 사용해서 공부를 했다
Sample4와 유사하지만 다른 점이 있다면 Animal 클래스를 상속하면서
인터페이스를 구현했다는 점에 차이점이 있다.
 */

public class Sample5 {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();

        Tiger tiger = new Tiger();
        zooKeeper.feed(tiger);

        Lion lion = new Lion();
        zooKeeper.feed(lion);
    }
}
class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}
interface Predator{
    String getFood();
}
class Tiger extends Animal implements Predator{
    @Override
    public String getFood() {
        return "meat";
    }
}

class Lion extends Animal implements Predator{
    @Override
    public String getFood() {
        return "fish";
    }
}

class ZooKeeper {
    void feed(Predator predator) {
        System.out.println("feed : " + predator.getFood());
    }
}