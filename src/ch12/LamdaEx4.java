package ch12;

import java.util.*;

public class LamdaEx4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        list.forEach(i->System.out.println(i+ " "));
        System.out.println();
        list.removeIf(x-> x%2==0 || x%3==0);
        System.out.println(list);

        Map<String,String> mp = new HashMap<>();
        mp.put("1","4");
        mp.put("2","2");
        mp.put("3","3");
        mp.put("4","2");

        mp.forEach((k,v)->System.out.println("{"+k+","+v+"},"));
        System.out.println();
    }
}
