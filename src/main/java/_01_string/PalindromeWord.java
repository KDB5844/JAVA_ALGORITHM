package main.java._01_string;

import java.util.Locale;
import java.util.Scanner;

public class PalindromeWord {

    public String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        String sb = new StringBuilder(str).reverse().toString();

        if (str.equals(sb)) return "YES";

        return answer;
    }

    public static void main(String[] args) {
        PalindromeWord T = new PalindromeWord();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(T.solution(input));
    }

}
