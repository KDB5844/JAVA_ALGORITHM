package main.java._01_string;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWordSpecific {

    public String solution(String arr) {
        char[] c = arr.toCharArray();
        int lt = 0, rt = c.length - 1;

        while (lt < rt) {
            if (!isAlphabet(c[lt])) lt ++;
            else if (!isAlphabet(c[rt])) rt--;
            else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(c);
    }

    public boolean isAlphabet(char c) {
        if (64 <  c && c <= 122) return true;
        return false;
    }

    public static void main(String[] args) {
        ReverseWordSpecific T = new ReverseWordSpecific();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(T.solution(input));
    }

}
