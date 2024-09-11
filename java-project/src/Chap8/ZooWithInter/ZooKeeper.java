package Chap8.ZooWithInter;

public class ZooKeeper {
    void feed(Predator pd){
        //System.out.println("feed meat");//지금은 한가지만 작동하도록 되어 있음.각각의 동물들은 다른걸 먹을때는 어떻게 해야 할까?
        System.out.println("feed " + pd.getFood());
    }
}
