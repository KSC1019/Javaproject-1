package ch11.ArrayList;

import java.util.ArrayList;
import java.util.*;

public class LinkTest1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(200000000);
        LinkedList ll = new LinkedList();

        System.out.println("== 순차적으로 추가하기 ==");
        System.out.println("array : " + add1(al));
        System.out.println("linked : "+ add1(ll));
        System.out.println();
        System.out.println("== 중간에 추가하기 ==");
        System.out.println("array : " + add2(al));
        System.out.println("linked : "+ add2(ll));
        System.out.println();
        System.out.println("== 중간에 삭제하기 ==");
        System.out.println("array : " + del1(al));
        System.out.println("linked : "+ del1(ll));
        System.out.println("== 순차적으로 삭제하기  ==");
        System.out.println("array : " + del2(al));
        System.out.println("linked : "+ del2(ll));
    }
    public static long add1(List list){
        long start = System.currentTimeMillis();
        for(int i=0;i<1000000;i++) list.add(i+"");
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long add2(List list){
        long start = System.currentTimeMillis();
        for(int i=0;i<10000;i++) list.add(500,"X");
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long del1(List list){
        long start = System.currentTimeMillis();
        for(int i=list.size();i >=0;i--) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long del2(List list){
        long start = System.currentTimeMillis();
        for(int i=0; i < 10000; i++) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
