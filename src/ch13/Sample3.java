package ch13;

import java.util.Arrays;
import java.util.List;

public class Sample3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c","a","d");
        list.stream().distinct().forEach(System.out::println);//중복 제거

        List<String> lst = Arrays.asList("김밥","김밥","김치","나비","나방");
        lst.stream().filter(str -> str.startsWith("김")).forEach(System.out::println);

    }
}
