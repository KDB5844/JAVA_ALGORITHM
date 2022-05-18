package main.java._01_string;

import java.util.Scanner;

/**
 * 회문 이면 "YES" 아니면 "NO"
 */
public class CircularWord {

    public String solution(String str) {

        String answer = "YES";
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            char frontWord = (str.charAt(i));
            char backWord = (str.charAt(length - (i + 1)));

            if (frontWord != backWord) return "NO";
        }

//        StringBuilder sb = new StringBuilder(str);
//        String reversStr = sb.reverse().toString();
//        if(!str.equalsIgnoreCase(reversStr)) {
//            return "NO";
//        }

        return answer;
    }

    public static void main(String[] args) {

        CircularWord T = new CircularWord();

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        String answer = "YES";

        System.out.println(T.solution(input));
    }

//        int lt = 0, rt = chars.length - 1;
//        while (lt < rt) {
//            char frontWord = Character.toLowerCase(chars[lt]);
//            char backWord = Character.toLowerCase(chars[rt]);
//            if (frontWord == backWord) {
//                lt++;
//                rt--;
//                continue;
//            }
//            else {
//                answer = "NO";
//                break;
//            }
//        }

}
