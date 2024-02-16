package ch11.Hash;

import java.util.HashSet;
import java.util.Set;

public class Sample5 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));

        //set.add("홍길동");의 경우에는 1로 출력됨

        System.out.println("총 객체수: " + set.size());
    }
}
class Member {
    String name;
    int age;
    public Member(String name,int age){
        this.name = name;
        this.age = age;
    }
}
