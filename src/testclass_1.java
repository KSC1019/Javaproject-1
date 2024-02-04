class Animal{
    String name;
    void getName(String name){
        this.name = name;
    }
    void setName(){
        this.name = "DoBoo";
    }
    void sleep(){
        System.out.println(name + " is sleeping");
    }
    void myname(String name){
        System.out.println("my name is "+ name);
    }
}
public class testclass_1 {
    public static void main(String[] args){
        Animal ani = new Animal();
        ani.setName();
        ani.sleep();
    }

}
