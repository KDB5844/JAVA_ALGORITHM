package main.java._02_array;

import java.util.Scanner;

public class Rank {

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int rank = 1;
            for (int x = 0; x < arr.length; x++) {
                if (arr[i] < arr[x]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }

    public static void main(String args[]) {

        Rank T = new Rank();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : T.solution(arr)) {
            System.out.print(x + " ");
        }


    }
}
