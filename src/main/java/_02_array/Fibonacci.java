package main.java._02_array;

import java.util.Scanner;

public class Fibonacci {

    public int[] solution(int num) {
        int[] arr = new int[num];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < num; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr;
    }

    public static void main(String args[]) {
        Fibonacci T = new Fibonacci();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int x : T.solution(num)) {
            System.out.print(x + " ");
        }
    }
}
