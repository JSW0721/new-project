package Chap11.Queue;
import java.util.*;
public class QueueEx {
    public static void main(String[] args) {
        Queue<String> qu = new LinkedList<>();
        qu.offer("가");
        qu.offer("나");
        qu.offer("다");
        qu.offer("라");

        System.out.println(qu.poll());
        System.out.println(qu.poll());
        System.out.println(qu.poll());
        System.out.println(qu.poll());
        System.out.println(qu.poll());// 다 빠지고 나면 남은게 없으므로 null 출력

        Queue<Message> mesqu = new LinkedList<>();
        mesqu.offer(new Message("Send KaKaoTalk","Jeniffer"));
        mesqu.offer(new Message("Send Telegram","Lisa"));
        mesqu.offer(new Message("Send E-Mail","Rose"));

        //Switch-case문 이용해서 특정 cmd일 경우 각각 출력문 다르게.
        for(Message m : mesqu){
            switch(m.getCmd()){
                case "Send KaKaoTalk" -> System.out.println(m.getTo() + "에게 카톡.");
                case "Send Telegram" -> System.out.println(m.getTo() + "에게 텔레그램.");
                case "Send E-Mail" -> System.out.println(m.getTo() + "에게 메일.");
            }
        }

    }
}
