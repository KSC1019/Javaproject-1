package WQ_newyear;

public class PersonalContact extends Contact{
    String relationship;
    public PersonalContact(String name, String phoneNum,String relationship) {
        super(name, phoneNum);
        this.relationship = relationship;
    }
    public String getRelationship(){
        return relationship;
    }
    @Override
    public String toString() {
        String output = "이름: %s, 전화번호: %s, 회사명: %s".formatted(getName(), getPhoneNum(),getRelationship());
        return output;
    }
}
