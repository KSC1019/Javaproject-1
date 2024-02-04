public class Q9 {
    public static void main(String[] args) {
        int x = 1;
        int y = 20;
        int z = 300;

        int n1 = 0,n2;
        n1 = x;
        x = y;
        y = z;
        z = n1;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
