package ch13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sample1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e");

        Stream<String> stream1 = list.stream();
        stream1.forEach(System.out::println);
        System.out.println();
        String[] arr = new String[]{"f", "g", "h", "i", "j"};

        Stream<String> stream2 = Arrays.stream(arr);
        stream2.forEach(System.out::println);

        
    }
}
