package main.java._01_string;
/*
한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

입력
    첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
    문자열의 길이는 100을 넘지 않는다.

출력
    첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.

example
    입력
        teachermode e
    출력
        1 0 1 2 1 0 1 2 2 1 0
*/

import java.util.Scanner;

public class ShortestWord {

    public void solution(String letter, char word) {

        char[] letterArr = letter.toCharArray();
        int[] distance = new int[letterArr.length];

        int p = 1000;
        for (int i = 0; i < letterArr.length; i++) {
            if (letterArr[i] == word) {
                p = 0;
            } else {
                p++;
            }
            distance[i] = p;
        }

        System.out.println();
        p = 1000;
        for (int i = letterArr.length -1; i >= 0; i--) {
            if (letterArr[i] == word) {
                p = 0;
            } else {
                p++;
            }
            if (p < distance[i]) {
                distance[i] = p;
            }
        }
        for (int i : distance) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {

        ShortestWord T = new ShortestWord();

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char target = sc.next().charAt(0);

        T.solution(input, target);
    }

}
