package Java_2m;

class Person{
    final String nation = "Korea";
    String name;
    public Person(String name){
        this.name = name;
    }
    Person(){
        this.name = "석찬";
    }
}
public class D0201_1 {
    public static void main(String[] args){

        Person p = new Person("계백");
        System.out.println(p.nation);
        System.out.println(p.name);
    }
}
