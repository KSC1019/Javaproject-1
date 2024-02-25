package ch11.Hashset_Hashmap;

import java.util.*;

public class HashSetEX5 {
    public static void main(String[] args) {
        HashSet set1 = new HashSet();
        HashSet set2 = new HashSet();
        HashSet inter = new HashSet();//교집합
        HashSet union = new HashSet();//합집합
        HashSet minus = new HashSet();//차집합
//집합 A B 교집합 차집합 합집합을 위한 HashSet
        set1.add("1"); set1.add("3"); set1.add("5");
        set1.add("7"); set1.add("9"); set1.add("11");
        System.out.println("setA = " + set1);

        set2.add("3"); set2.add("6"); set2.add("8");
        set2.add("9"); set2.add("11"); set2.add("12");
        System.out.println("setB = " + set2);

        Iterator it = set2.iterator();
        while(it.hasNext()){
            Object tmp = it.next();
            if(set1.contains(tmp))inter.add(tmp);
        }//교집합을 위해 작성한 Iterator, 만약 set2에 있는 원소 tmp가 set1에 있는가 확인하고 있으면 inter교집합에 넣는 모습을 보여줌
        it = set1.iterator();
        while(it.hasNext()){
            Object tmp = it.next();
            if(!set2.contains(tmp)) minus.add(tmp);
        }//차집합을 위해 작성한 Iterator, A집합을 기준으로 B집합의 원소와 중복이 되지 않는 A의 원소만 minus에 입력
        it = set1.iterator();
        while (it.hasNext()){
            union.add(it.next());
        }
        it = set2.iterator();
        while (it.hasNext()){
            union.add(it.next());
        }//합집합을 위해 작성한 Iterator, 그냥 각각의 집합에서 원소를 넣음 어차피 HashSet에서 알아서 중복을 걸러내주기 때문에 그냥 넣어도 지장 ㄴㄴ

        System.out.println("A ∩ B = " + union);
        System.out.println("A ∪ B = " + inter);
        System.out.println("A - B = "+ minus);

    }
}
