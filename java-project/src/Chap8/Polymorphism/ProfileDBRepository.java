package Chap8.Polymorphism;

public class ProfileDBRepository implements ProfileRepository {
    @Override
    public void save() {
        System.out.println("Saving profile DB");
    }
}
