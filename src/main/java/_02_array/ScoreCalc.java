package main.java._02_array;

import java.util.Scanner;

public class ScoreCalc {

    public int solution(int[] arr) {
        int answer = 0;
        int x = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) x = 0;
            else answer += ++x;
        }

        return answer;
    }

    public static void main(String args[]) {
        ScoreCalc T = new ScoreCalc();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(arr));

    }
}
