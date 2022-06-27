package main.java._02_array;

import java.util.Scanner;

public class PrimeNumber {

    public int solution(int num) {
        int[] arr = new int[num + 1];
        int answer = 0;
        for (int i = 2; i <= num; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int x = i; x <= num; x = x + i) arr[x] = 1;
            }
        }
        return answer;
    }

    public static void main(String args[]) {

        PrimeNumber T = new PrimeNumber();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(T.solution(num));

    }
}
