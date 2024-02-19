package ch11;

import java.util.Stack;

public class queue_ex1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("1");
        stack.push("2");
        stack.push("3");

        System.out.println(stack.pop());//최상단 제거
        System.out.println(stack.peek());//최상단 값 확인
        System.out.println(stack.pop());
    }
}
