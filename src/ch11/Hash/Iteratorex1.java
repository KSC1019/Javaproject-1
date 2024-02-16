package ch11.Hash;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorex1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); //arraylist를 생성하고 list에 1~5까지 숫자를 입력함
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();//Iterator를 통해 저장된 Arraylist에 접근해서 Obj를 통해 출력을 하는 모습이다.
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
/*
Iterator 공부용 예제 코드
Iterator) 컬렉션 프레임 워크에서는 컬렉션에 저장된 요소들을 읽어 오는 방법을 표준화하였다.
해당 컬렉션에 저장된 각 요소에 접근하는 기능을 가진 인터페이스가 Iterator 인터페이스라고 한다.
Collection 인터페이스에서는 Iterator를 반환하는 iterator()를 정의하고 있다.

iterator()는 collection인터페이스에 정의된 메서드로 COllection 인터페이스의 자손인 List와 Set에도 포함되어 있다.
 */
