package ch12;
interface Myfunc{
    void Mymethod();
}

public class Sample3 {
    public static void main(String[] args) {
        Myfunc f = ()->{}; // myfunc f = (myfunc) (() ->{})
        Object obj = (Myfunc)(() ->{});
        String str = ((Object) (Myfunc)(()->{})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);
    }
}
