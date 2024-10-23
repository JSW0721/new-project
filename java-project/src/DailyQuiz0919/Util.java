package DailyQuiz0919;

public class Util{
    // Pair<k,v>,k
    // (제네릭 메소드를 작성해주세요)
    public static <T extends Pair<K,V>,K,V> V getValue(T pair,K key){
        if(pair.getKey() == key){
            return pair.getValue();
        }else{
            return null;
        }
    }
}