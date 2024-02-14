package ch10.DQ0214;

public class TwoContainer <K,V>{
    private K key;
    private V value;

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
/*
TwoContainer 클래스는 두 개의 제네릭 타입 K와 V를 가지고 있습니다. 이는 각각 key와 value의 타입을 나타냅니다.
set 메소드는 key와 value를 받아 각각의 인스턴스 변수에 할당합니다.
getKey 메소드는 key를 반환합니다.
getValue 메소드는 value를 반환합니다.
 */