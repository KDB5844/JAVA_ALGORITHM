package main.java._00_programmers;

/**
 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
 * 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * phone_number는 길이 4 이상, 20이하인 문자열입니다.
 *
 * "01033334444"	"*******4444"
 * "027778888"	"*****8888"
 */

public class Lv1_Ex01 {

    public String solution(String phone_number) {
        if (phone_number.length() < 4 || phone_number.length() > 20 ) throw new IllegalStateException("4~20자를 입력해주세요.");

        String star = convertStar(phone_number.substring(0, phone_number.length() - 4));

        String answer = star + phone_number.substring(phone_number.length() - 4);
        return answer;
    }

    public String convertStar(String number) {
        return "*".repeat(number.length());
    }

    public static void main(String[] args) {

        Lv1_Ex01 T = new Lv1_Ex01();

        String str = "027778888";

        System.out.println(T.solution(str));


    }
}