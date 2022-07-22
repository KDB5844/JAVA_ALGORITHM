package main.java._03_twopointer;

import java.util.Scanner;

public class SequenceSumForMath {

    public int solution(int n) {
        int answer = 0, cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if (n % cnt == 0) answer++;

        }

        return answer;
    }

    public static void main(String args[]) {

        SequenceSum T = new SequenceSum();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(T.solution(num));
    }
}
