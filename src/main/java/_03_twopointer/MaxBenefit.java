package main.java._03_twopointer;

import java.util.Scanner;

public class MaxBenefit {

    public int solution(int day, int num, int[] arr) {

        int answer, sum = 0;
        for (int i = 0; i < num; i++) sum += arr[i];
        answer = sum;

        for (int i = num; i < day; i++) {
            sum += (arr[i] - arr[i - num]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }

    public static void main(String args[]) {

        MaxBenefit T = new MaxBenefit();

        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int num = sc.nextInt();

        int[] arr = new int[day];

        for (int i = 0; i < day; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print(T.solution(day, num, arr));

    }
}
