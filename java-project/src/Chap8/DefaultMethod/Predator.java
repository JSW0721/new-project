package Chap8.DefaultMethod;

/**
 * 디폴트 메소드 실습
 */
interface Predator {
    String getFood();

    default void printFood(){
        System.out.printf("my food is %s\n", getFood());
    };
}
