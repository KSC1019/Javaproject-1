package ch8_2;

class ProfileService {
    ProfileRepository repository;

    public void saveProfile() {
        repository = new ProfileDBRepository();   // 이 부분만 바꿔 끼우면 됨
        repository.save();
    }
}
class ProfileDBRepository implements ProfileRepository {

    @Override
    public void save() {
        System.out.println("DB에 프로필 저장하는 기능");
    }
}
class ProfileMemoryRepository implements ProfileRepository {
    @Override
    public void save() {
        System.out.println("메모리에 프로필 저장하는 기능");
    }
}
public class Sample_3 {
    public static void main(String[] args) {

    }
}
