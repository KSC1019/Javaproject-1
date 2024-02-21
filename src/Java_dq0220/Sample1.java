package Java_dq0220;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sample1 {
    public List<Integer> solution(int n, int[] array) {
        List<Integer> answer = new ArrayList<>();

       /* for(int i=1;i<n;i++){
            if(array[i] > array[i-1]) answer.add(array[i]);
        } */
        // stream
        answer.add(array[0]);
        List<Integer> collect = IntStream.range(1,n) //1 ~ n-1까지
                .filter(index -> array[index] > array[index-1])
                .mapToObj(x->array[x]).collect(Collectors.toList()); // index 안에 들어있는 array[x]의 요소로 변환을 시켜줌
        answer.addAll(collect);
        return answer;
    }
    public static void main(String[] args) {
        Sample1 printMoreBigNumber = new Sample1();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        for (int x : printMoreBigNumber.solution(number, array)) {
            System.out.print(x + " ");
        }
    }
}
