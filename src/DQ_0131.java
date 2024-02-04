import java.util.Scanner;

class Cal{
    int a=0,b=0;
    int sum(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
        return a-b;
    }
    int mul(int a,int b){
        return a*b;
    }
    int div(int a,int b){
        return a/b;
    }


}
public class DQ_0131 {

    public static void main(String[] args) {
    Cal c = new Cal();
        Scanner in = new Scanner(System.in);
    int a,b;
    a = in.nextInt();
    b = in.nextInt();

    System.out.println(c.sum(a,b));
    System.out.println(c.sub(a,b));
    System.out.println(c.mul(a,b));
    System.out.println(c.div(a,b));

    }
}
