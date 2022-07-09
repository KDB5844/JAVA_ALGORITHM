package main.java._02_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReversePrimeNumber {

    public boolean isPrime(int num) {
        if (num == 1) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public List<Integer> solution(int num, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int tmp = arr[i];
            int res = 0;

            while(tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if(isPrime(res)) answer.add(res);
        }

        return answer;
    }

    public static void main(String args[]) {
        ReversePrimeNumber T = new ReversePrimeNumber();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : T.solution(num, arr)) {
            System.out.print(x + " ");
        }
    }
}
