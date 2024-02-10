package WQ_newyear;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<Contact> contacts;
    public AddressBook(){
        contacts =  new ArrayList<>();
    }

    public void run(){
        int order;
        String name;
        String phoneNum;
        String company;
        String relationship;

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1. 비즈니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");
            System.out.print("메뉴를 선택해주세요: ");

            try{
                order = sc.nextInt();
                sc.nextLine();
                switch (order) {
                    case 1:

                        System.out.print("이름을 입력하세요: ");
                        name = sc.nextLine();

                        System.out.print("전화번호를 입력하세요: ");
                        phoneNum = sc.nextLine();

                        System.out.print("회사명을 입력하세요: ");
                        company = sc.nextLine();

                        addBusinessContact(name, phoneNum, company);

                        break;
                    case 2:

                        System.out.print("이름을 입력하세요: ");
                        name = sc.nextLine();

                        System.out.print("전화번호를 입력하세요: ");
                        phoneNum = sc.nextLine();

                        System.out.print("관계를 입력하세요: ");
                        relationship = sc.nextLine();

                        addPersonalContact(name, phoneNum, relationship);

                        break;
                    case 3:
                        displayContacts();
                        break;
                    case 4:
                        System.out.print("검색할 이름을 입력하세요: ");
                        name = sc.nextLine();
                        searchContact(name);
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("잘못된 번호를 입력하셨습니다\n다시 입력해주세요");
                }
            }catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("숫자가 아닌 다른 값을 입력하셨습니다\n다시 입력해주세요");
            }
        }
    }
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
            return;
        }

        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
    public void searchContact(String name) {
        boolean check = false;

        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                check = true;
                System.out.println(contact);
            }
        }

        if (check == false) {
            System.out.println("연락처를 찾을 수 없습니다.");
        }
    }

    public void addBusinessContact(String name, String phoneNumber, String company) {
        contacts.add(new BusinessContact(name, phoneNumber, company));
    }

    public void addPersonalContact(String name, String phoneNumber, String relationship) {
        contacts.add((new PersonalContact(name, phoneNumber, relationship)));
    }
}
