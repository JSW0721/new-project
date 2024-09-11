package Chap8.DefaultMethod;

public class Zoo2 {
    public static void main(String[] args) {
        ZooKeeper zk = new ZooKeeper();

        Lion lion = new Lion();
        zk.feed(lion);

        Tiger tiger = new Tiger();
        zk.feed(tiger);
    }
}
