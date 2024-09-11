package chap2;

public class AutoBoxingPerformanceExample {
    public static void main(String[] args) {
        //성능측정(오토박싱 VS 일반)
        long currentTimeMills = System.currentTimeMillis();

        Integer sum = 0;
        for (int i = 0; i < 2000000; i++) {
            sum = sum + i;
        }
        System.out.println("오토박싱 소요시간 : " + (System.currentTimeMillis()-currentTimeMills));

        long currentTimeMills2 = System.currentTimeMillis();

        int sum2 = 0;
        for (int i = 0; i < 2000000; i++) {
            sum2 = sum2 + i;
        }
        System.out.println("일반 소요시간 : " + (System.currentTimeMillis()-currentTimeMills2));
    }
}
