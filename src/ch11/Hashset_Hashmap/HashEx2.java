package ch11.Hashset_Hashmap;

import java.util.*;

public class HashEx2 {
    public static void main(String[] args) {
        Set set = new HashSet();
        for(int i=0;set.size()<6;i++){
            int num = (int) (Math.random()*45) + 1; // 1~45까지의 랜덤값을 6개 출력
            set.add(new Integer(num));
        }
        List lst = new LinkedList(set);
        Collections.sort(lst);
        System.out.println(lst);

    }
}
/*
번호를 크기ㅣ순으로 정렬하기 위해 Conllection class의 sort를 사용해서 정렬을 했으며,
linkedList 클래스의 생성자 LinkedList(Collection c)를 이용해 HashSet에 저장된 객체들을 LinkedList에 담아서 처리했다.
 */