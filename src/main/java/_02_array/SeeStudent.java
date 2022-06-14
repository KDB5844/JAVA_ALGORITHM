package main.java._02_array;

import java.util.Scanner;

public class SeeStudent {

    public int solution(int n, int[] arr) {
        int answer = 1;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String args[]) {
        SeeStudent T = new SeeStudent();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n, arr));
    }

}
