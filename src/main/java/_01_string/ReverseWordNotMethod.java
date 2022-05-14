package main.java._01_string;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성(직접)
 *
 * 입력
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력
 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 */
public class ReverseWordNotMethod {

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = s.length - 1;

            while(lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(s));
        }
        return answer;
    }

    public static void main(String[] args) {
        ReverseWordNotMethod T = new ReverseWordNotMethod();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String[] inputArray = new String[cnt];
        for (int i = 0; i < cnt; i++) {
            inputArray[i] = sc.next();
        }
        for (String x : T.solution(cnt, inputArray)) {
            System.out.println(x);
        }

    }

}
