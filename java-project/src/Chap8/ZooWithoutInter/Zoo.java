package Chap8.ZooWithoutInter;

public class Zoo {
    public static void main(String[] args) {
        ZooKeeper zk = new ZooKeeper();

        Lion lion = new Lion();
        zk.feed(lion);

        Tiger tiger = new Tiger();
        zk.feed(tiger);
    }
}
