package main.java._02_array;

import java.util.Scanner;

public class SumMax {

    public int solution(int num, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int horizontalSum;
        int verticalSum;
        int leftCrossSum = 0;
        int rightCrossSum = 0;

        for (int i = 0; i < num; i++) {
            horizontalSum = 0;
            verticalSum = 0;

            for (int x = 0; x < num; x++) {
                horizontalSum += arr[i][x];
                verticalSum += arr[x][i];
                if (x == i) leftCrossSum += arr[x][i];
                if (x + i == num - 1) rightCrossSum += arr[x][i];
            }
            if (horizontalSum > answer) answer = horizontalSum;
            if (verticalSum > answer) answer = verticalSum;
        }
        if (leftCrossSum > answer) answer = leftCrossSum;
        if (rightCrossSum > answer) answer = rightCrossSum;

        return answer;
    }

    public static void main(String args[]) {
        SumMax T = new SumMax();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int x = 0; x < num; x++) {
                arr[i][x] = sc.nextInt();
            }
        }

        System.out.println(T.solution(num, arr));
    }
}
