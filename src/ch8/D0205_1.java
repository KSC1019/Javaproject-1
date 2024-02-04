package ch8;

 class Dog implements Animal{
    @Override
    public void move(){
        System.out.println("슥슥~~");
    }

     @Override
     public void eat() {

     }

     @Override
    public void bark(){
        System.out.println("멍! 멍!");
    }
}
 class Cat implements Animal{
    @Override
    public void move(){
        System.out.println("사뿐사뿐~~");
    }

     @Override
     public void eat() {

     }

     @Override
    public void bark(){
        System.out.println("야옹~~");
    }
}
public class D0205_1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.move();
        c.move();

        d.bark();
        c.bark();
    }
}
