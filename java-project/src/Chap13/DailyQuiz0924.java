package Chap13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DailyQuiz0924 {
    public List<Integer> solution(int n, int[] array) {
        List<Integer> ans1 = new ArrayList<>();

        return ans1;
    }

    public static void main(String[] args) {
        DailyQuiz0924 dq1 = new DailyQuiz0924();
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int[] array = new int[number];// 최초 입력 받은 숫자 만큼 array생성

        for (int i = 0; i < number; i++) {
            array[i] = sc.nextInt();
        }//생성된 array에 입력 받는 숫자들 저장

        for (int x : dq1.solution(number, array)) {
            System.out.print(x + " ");
        }
    }
}
