package Java_2m;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();

        Lion lion = new Lion();
        zookeeper.feed(lion);

        Tiger tiger = new Tiger();
        zookeeper.feed(tiger);

        Crocodile crocodile = new Crocodile();
        zookeeper.feed(crocodile);

//        Predator[] predators = {lion, tiger, crocodile};
        Predator predator = new Lion();
    }
}
class Animal {
    String name;
    void setName(String name) {
        this.name = name;
    }
}
class Tiger extends Animal implements Predator {
    @Override
    public String getFood() {
        return "meat";
    }
}
class Lion extends Animal implements Predator {
    @Override
    public String getFood() {
        return "fish";
    }
}
class Crocodile extends Animal implements Predator {
    @Override
    public String getFood() {
        return "strawberry";
    }
}

class Zookeeper {
    void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }
}