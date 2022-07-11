package main.java._00_programmers;

/**
 * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * x는 -10000000 이상, 10000000 이하인 정수입니다.
 * n은 1000 이하인 자연수입니다.
 *
 * 입출력 예
 * x	n	answer
 * 2	5	[2,4,6,8,10]
 * 4	3	[4,8,12]
 * -4	2	[-4, -8]
 */

public class Lv1_Ex02 {

    public long[] solution(int x, int n) {

        if (x < -10000000 || x > 10000000 || n > 1000)
            throw new IllegalStateException("-10000000 < x < 10000000, n > 1000 입니다.");

        long[] answer = new long[n];

        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + answer[0];
        }

        return answer;
    }


    public static void main(String[] args) {
        int x = -4, n = 2;
        Lv1_Ex02 T = new Lv1_Ex02();
        System.out.println(T.solution(x, n));
    }
}
