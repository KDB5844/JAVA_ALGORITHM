package main.java._02_array;

import java.util.Scanner;

public class MtTop {

    public int solution(int num, int[][] arr) {
        int answer = 0;

        for (int i = 1; i < num + 1; i++) {

            for (int j = 1; j < num + 1; j++) {
                if (arr[i][j] >= arr[i-1][j] &&
                    arr[i][j] >= arr[i+1][j] &&
                    arr[i][j] >= arr[i][j-1] &&
                    arr[i][j] >= arr[i][j+1]
                ) answer++;
            }
        }
        return answer;
    }

    public static void main(String args[]) {

        MtTop T = new MtTop();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num+2][num+2];

        for (int i = 1; i < num + 1; i++) {
            for (int j = 1; j < num + 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(num, arr));
    }
}
