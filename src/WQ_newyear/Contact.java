package WQ_newyear;

public class Contact {
    String name;
    String phoneNum;

    public Contact(String name,String phoneNum){
        this.name = name;
        this.phoneNum = phoneNum;
    }
    public String getName(){
        return name;
    }
    public String getPhoneNum(){
        return phoneNum;
    }
    @Override
    public String toString(){
        String output = "이름: %s, 전화번호: %s".formatted(name, phoneNum);
        return output;
    }
}
