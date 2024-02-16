package ch11.Hash;
import java.util.*;

public class HashEx1 {
    public static void main(String[] args) {
        Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4"};
        Set set = new HashSet();
        for(int i=0;i<objArr.length;i++){
            set.add(objArr[i]);
        }
        System.out.println(set);
    }
}
/*
결과값 ) [1, 1, 2, 3, 4]
hashset 공부용 예시 코드
해당 코드를 통해 hashset에는 중복된 값은 저장되지 않는다는 것을 알 수 있다.
단 1이 지금 중복이 되어 있지만 하나는 String이고 다른 하나는 Integer값이기 때문에 서로 다른 객체 취급을 한다.
다만 Set을 구현한 HashSet은 순서유지가 안되기 때문에 저장순서가 다를수도 있다.
즉, 중복을 제거하는 동시에 저장된 순서를 유지하고자 한다면, Linked HashSet을 사용해야 한다.
 */