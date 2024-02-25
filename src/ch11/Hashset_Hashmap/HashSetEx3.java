package ch11.Hashset_Hashmap;

import java.util.*;

public class HashSetEx3 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person("David",10));
        set.add(new Person("David",10));
        System.out.println(set);
        /*Person class는 name과 age의 맴버변수를 가지고 이름과 나이가 같으면 같은 사람으로 인식하려고 하지만
        해당 코드에서는 다른 사람으로 인식해서 중복의 결과값이 반복하게 된다
        중복 인스턴스를 방지하기 위해서는 어떻게 해야할까?
        */
    }

}
class Person{
    String name;
    int age;
    Person (String name,int age){
        this.name = name;
        this.age = age;
    }
    ////HastSetEx4 추가 사항
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person tmp = (Person) obj;
            return name.equals(tmp.name) && age == tmp.age;
        }
        return false;
    }
    public int hashCode(){
        return (name+age).hashCode();
    }

    /*
    Hashset의 add 메서드는 새로운 요소를 추가하기 저넹 기존에 저장된 요소와 같은 것인지 판별하기 위해 추가하려는 요소의 boolean equals메서드와
    hashCode 메서드를 호출하기 때문에 각각 목적에 맞는 오버라이딩을 시행해야 한다.
    그래서 String클래스에서 같은 내용의 문자열에 대한 equals의 호출 결과가 true인 것 같이 Person 클래스에서도 두 인스턴스인 이름과 나이가
    같으면 true를 반환한다. (true반환하면 중복이니까 HashSet에서는 자동으로 걸러진다.)
     */
    public String toString(){
        return name + " : " + age;
    }
}