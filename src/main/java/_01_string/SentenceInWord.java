package main.java._01_string;

import java.util.Scanner;

/**
 * 한 개의 문장이 주어지면
 * 그 문장 속에서 가장 긴 단어를 출력하는 프로그램 작성
 * 문장속의 각 단어는 공백으로 구분 됨
 * INPUT : it is time to study
 * OUTPUT : study
 */
public class SentenceInWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String longestWord = getLongestWord(sentence);
        System.out.println(longestWord);
        sc.close();
    }

    public static String getLongestWord(String sentence) {
        if (sentence.length() > 100) throw new IllegalStateException("100자를 초과할 수 없습니다");

        String[] splitSentence = sentence.split("\\s");

        String longestWord = "";
        for (String word : splitSentence) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

}
