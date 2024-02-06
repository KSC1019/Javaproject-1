package ch8_3;
/*
인터페이스 복습용으로 작성한 코드
인터페이스란 다른 클래스를 작성할 때 기본이 되는 틀을 제공하면서
다른 클래스 사이의 중간 매개역할을 하는 일종의 추상 클래스를 뜻한다.
예제)
1. 식당를 운영하는 사람이 있다.
2. 단골손님들은 매일 먹는 음식이 정해져 있다.
3. 단골손님 A는 항상 김치찌개를 주문한다.
4. 단골손님 B는 항상 제육볶음을 주문한다
출처: https://ittrue.tistory.com/136 [IT is True:티스토리]

*/

interface Customer{
    String getOrder();
}
/*
class CustomerA extends Customer {
}

class CustomerB extends Customer {
}
위와 같이 상소글 통해 클래스를 정의 할 경우 오버로딩을 활용해 give메서드를 호출하고
main클래스에서 객체를 생성시켜서 실행한다.
하지만 단골 손님이 계속 늘어나게 된다면 만들어야 할 오버로딩 메서드가 늘어나게 될것이다. 

*/

class CustomerA implements Customer{
    public String getOrder(){
        return "손님 A에게 김치찌개를 준다.";
    }
}
class CustomerB implements Customer{
    public String getOrder(){
        return "손님 B에게 제육볶음를 준다.";
    }
}

class CustomerC implements Customer{ 
    // <-가벼운 추가메서드지만 단순 상속을 썼다면 Owner 클래스에서 추가 오버로딩을 해야했음
    public String getOrder(){
        return "손님 C에게 부대찌개를 준다.";
    }
}
class Owner{
    public void give(Customer cust){
        System.out.println(cust.getOrder());
    }
}
public class Sample4 {
    public static void main(String[] args) {
        Owner own = new Owner();
        CustomerA a = new CustomerA();
        CustomerB b = new CustomerB();

        own.give(a);
        own.give(b);
    }
}
/*
인터페이스를 통해 작성한 경우 give 메서드를 한번만 사용해도 더이상 단골 손님이 늘어도
독립적으로 수행할수 있는 클래스가 되었다.
*/
