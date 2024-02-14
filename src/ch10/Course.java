package ch10;

public class Course<T>{
    private String name;
    private T[] std;
    public Course(String name,int capacity){
        this.name = name;
        std = (T[]) (new Object[capacity]);
    }
    public String getName(){
        return name;
    }
    public T[] getStd(){
        return std;
    }
    public void add(T t){
        for(int i=0;i<std.length;i++){
            if (std[i]==null){
                std[i]=t;
                break;
            }
        }
    }
    
}
/*
수강생이 될수 잇는 타입을 4가지라고 가정했을때,
person 하위로 worker와 student가 있고 student 하위에 highstudent가 존재한다.
- Course<?> : 수강생은 모든 타입(person,worker,student,highstudent)가 될수있다.
- Course<? extends std> : 수강생은 highstd와 std만 될수있다.
- Course<? super Worker> : 수강생은 worker와 person만 될수있다.
 */
