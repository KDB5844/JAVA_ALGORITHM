package main.java._01_string;

import java.util.Scanner;

/**
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 * 만약 "tge0a1h205er" 에 숫자만 추출하면 0,1,2,3,4,5이고 이것을 자연수로 만들면 1205이 됩니다.
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 *
 * 입력 (g0en2T0s8eSoft)
 * 첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
 *
 * 출력
 * 첫 줄에 자연수를 출력합니다.
 */
public class ExtractNumber {

    public Integer solution(String str) {
        // 정규식을 이용한 방법
//        return Integer.parseInt(str.replaceAll("[^0-9]", ""));

        // 문자를 비교하는 방법
        Integer answer = 0;
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (48 <= c && c <= 57) answer = answer * 10 + (c - 48);
        }

        return answer;
    }

    public static void main(String[] args) {

        ExtractNumber T = new ExtractNumber();

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(T.solution(input));
    }

}
