package ch11.Stack_Queue;

import java.util.*;

public class StackQueue1 {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue qu = new LinkedList();

        st.push("0");
        st.push("1");
        st.push("2");

        qu.offer("0");
        qu.offer("2");
        qu.offer("4");

        System.out.println("Stack");
        while(!st.empty()){
            System.out.println(st.pop());
        }
        System.out.println("Queue");
        while (!qu.isEmpty()){
            System.out.println(qu.poll());
        }
    }
}

/*
스택과 큐의 출력 차이를 보여주는 코드이다.
스택의 경우 0 1 2 순서로 입력받았고 pop 된 순서는 들어온 순서의 반대로 나가는 반면
큐의 경우 0 2 4 순서로 offer 받았고 poll 된 순서는 들어온 순서와 같은 순서로 나간다.
 */