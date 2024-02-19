package Java_WQ2;

import java.util.Scanner;
import java.util.Stack;

public class Sample1 {
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);

        System.out.print("input : " );
        input = sc.next();

        Stack<String> pair = new Stack<>();
        for(int i=0;i<input.length();i++){
            if(String.valueOf(input.charAt(i)).equals("(")){
                pair.push("(");
            }
            else{
                if(pair == null || pair.isEmpty()) {
                    System.out.println("false");
                    return;
                }
                else {
                    pair.pop();
                }
            }
        }
        if(!pair.isEmpty()){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }
    }
}
