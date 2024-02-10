package WQ_newyear;

public class BusinessContact extends Contact{
    String company;
    public BusinessContact(String name, String phoneNum,String company) {
        super(name, phoneNum);
        this.company = company;
    }
    public String getCompany(){
        return company;
    }
    @Override
    public String toString() {
        String output = "이름: %s, 전화번호: %s, 회사명: %s".formatted(getName(), getPhoneNum(),getCompany());
        return output;
    }
}
