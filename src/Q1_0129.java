public class Q1_0129 {
    public static void main(String args[]) {
        int number1 = 10;
        double number2 = 2.0;

        double result1 = number1 + number2;
        double result2 = number1 - number2;
        double result3 = number1 * number2;
        double result4 = number1 / number2;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        //Q2-1_0129
        System.out.println(10/2 + 3 * 4); //당연히 17이지 ㅇㅇ
        //Q2-2_0129
        int res1 = number1 + 1,res2= number1++,res3 = number1,res4=--number1;

        System.out.println(res1);//11
        System.out.println(res2);//11 --> 10을 입력한 후에 ++ 처리가 됬기 때문에
        System.out.println(res3);//10 --> 이미 num1++ 가 되어있어서 11인듯
        System.out.println(res4);//9 --> --를 먼저 선언해서 9로 입력되어있음
        //Q2-3_0129
        int num1 = 5, num2 = 7;
        System.out.println((num1>5)&&(num2 > 5)); // -> false
        System.out.println((num1 > 5) || (num2 > 5)); // ->true
        System.out.println(!((num1 > 5) && (num2 > 5)));// ->true
        //Q3_0129
        int i=6; // 2와 3의 배수
        System.out.println((i%2 == 0) || (i%3==0));

        //Q4_0129
        String str1 = new String("Hello world!");
        String str2 = new String("Hello world!");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        /*위의 각주가 false가 나오는 이유는 == 연산자는 참조비교를 수행하므로
        동일한 문자열을 가지더라도 새로운 객체가 생성되면 참조값이 다르게 되기때문에
        false값을 가지게 됨*/
    }
}
