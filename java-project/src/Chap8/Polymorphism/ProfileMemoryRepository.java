package Chap8.Polymorphism;

public class ProfileMemoryRepository implements ProfileRepository {
    @Override
    public void save() {
        System.out.println("Saving profile Memory");
    }
}
