package ch10;

class Util2 {       //┌─▶ Number 포함 Number를 상속받은 짜식들 모두 가능
public static <T extends Number> int compare(T t1, T t2) {
    double v1 = t1.doubleValue();
    double v2 = t2.doubleValue();

    return Double.compare(v1, v2);
    }
}
public class Sample2 {
    public static void main(String[] args) {

        int result1 = Util2.compare(10, 20); // AutoBoxing(Integer)
        System.out.println(result1); // -1

        int result2 = Util2.compare(3.14, 3);
        System.out.println(result2); // 1

        //Util2.compare("C", "JAVA"); // String은 Number의 자손이 아니기때문에 에러
    }
}
