package ch11.ArrayList;

import ch10.DQ0214.Pair;

import java.util.ArrayList;
import java.util.List;

public class Sample3 {
    public static void main(String[] args) {
        final int limit = 10;
        String source = "0123456789abcdef";
        int len = source.length();

        List list = new ArrayList(len/limit + 10);
        for(int i = 0;i<len;i+=limit){
            if(i+limit <len){
                list.add(source.substring(i,i+limit));
            }
            else list.add(source.substring(i));
        }
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
    }
}
/*
위의 코드를 통해 ArrayList보다 LinkedList가 빠르다는 것을 알수 있다.
 */
