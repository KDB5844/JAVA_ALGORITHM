package main.java._01_string;

import java.util.Scanner;

/**
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아
 * 대문자는 소문자로
 * 소문자는 대문자로
 * 변환하여 출력하는 프로그램 작성
 */

public class UpperToLower {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String letter = sc.next();

        String convertedLetter = LetterConverter.convert(letter);

        System.out.println(convertedLetter);

        sc.close();

    }

    // ASCII 대문자 : 65 ~ 90, 소문자 97 ~ 122   32 차이
    static class LetterConverter {

        public static String convert(String beforeLetter) {

            StringBuilder sb = new StringBuilder();

            for (char x : beforeLetter.toCharArray()) {
                if (Character.isUpperCase(x))               // 65 <= x <= 90 : 대문자
                    sb.append(Character.toLowerCase(x));    // sb.append((char)(x + 32))
                else                                        // 97 <= x <= 122 : 소문자
                    sb.append(Character.toUpperCase(x));    // sb.append((char)(x - 32))
            }

            return sb.toString();
        }

    }

}
