package string;

public class Q2 {

    // 내 풀이
    public String solution(String s1) {
        String answer = "";

        char[] c = s1.toCharArray();
        for (char c1 : c) {
            if (Character.isUpperCase(c1)) {
                answer += Character.toLowerCase(c1);
            } else {
                answer += Character.toUpperCase(c1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
