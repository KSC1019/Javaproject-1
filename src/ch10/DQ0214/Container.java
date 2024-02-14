package ch10.DQ0214;

public class Container <T>{
    private T value;
    public void set(T value){
        this.value = value;
    }
    public T get(){
        return value;
    }
}
/*
Container 클래스는 제네릭 타입 T를 사용하여 일반화된 형태로 정의되었습니다. 이렇게 함으로써 클래스를 선언할 때 어떤 데이터 타입이든 사용할 수 있게 됩니다.

value는 제네릭 타입 T로 선언된 변수로, 이 변수에는 어떠한 타입의 값이라도 저장할 수 있습니다.

set 메소드는 제네릭 타입 T의 값을 받아 value에 할당합니다.

get 메소드는 value의 값을 반환합니다.
 */