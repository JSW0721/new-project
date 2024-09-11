package Chap8.Polymorphism;

public class ProfileService {
    ProfileRepository repo;
    void saveProfile() {
        repo = new ProfileDBRepository();
        repo.save();
    }

    void saveProfile(ProfileRepository repository) {
        repository.save();
    }
}
