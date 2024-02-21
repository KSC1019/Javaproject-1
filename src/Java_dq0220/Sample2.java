package Java_dq0220;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Sample2 {
    public int[] solution(int[] array1, int[] array2) {
        // 두 배열을 합친 후 오름차순으로 정렬
        int[] result = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .sorted()
                .toArray();

        return result;
    }

    public static void main(String[] args) {
        Sample2 ascendingSort = new Sample2();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        int number2 = scanner.nextInt();
        int[] array2 = new int[number2];

        for (int i = 0; i < number2; i++) {
            array2[i] = scanner.nextInt();
        }

        // 정렬된 결과를 출력
        for (int x : ascendingSort.solution(array, array2)) {
            System.out.print(x + " ");
        }
    }
}
