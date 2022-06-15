package main.java._02_array;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] userA = new int[n];
        int[] userB = new int[n];

        for (int i = 0; i < n; i++) {
            userA[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            userB[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            String answer = "";
            int a = userA[i];
            int b = userB[i];

            // 비김
            if (a == b) {
                answer = "D";
            }

            // A 승
            else if (a > b) {
                if(a == 3 && b == 1) answer = "B";
                else answer = "A";
            }

            // B 승
            else if (b > a) {
                if(b == 3 && a == 1) answer = "A";
                else answer = "B";
            }

            System.out.println(answer);
        }
    }
}
