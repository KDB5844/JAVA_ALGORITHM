package main.java._01_string;

import java.util.Scanner;

/**
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 *
 * 입력
 * 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않습니다.
 *
 * 출력
 * 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 */
public class RemoveDuplicateWord {

    public String solution(String str) {

        StringBuilder sb = new StringBuilder(str.length());

        for (int i = 0; i < str.length(); i++) {
            if(i == str.indexOf(str.charAt(i))) sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        RemoveDuplicateWord T = new RemoveDuplicateWord();

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        isValid(input);

        System.out.println(T.solution(input));
    }

    private static void isValid(String input) {
        if(input.length() > 100) throw new IllegalStateException("길이는 100자를 넘을 수 없습니다.");

        for (char c : input.toCharArray()) {
            if(!Character.isLowerCase(c)) throw new IllegalStateException("소문자를 입력해주세요.");
        }

    }

}
