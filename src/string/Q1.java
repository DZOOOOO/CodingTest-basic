package string;

import java.util.Scanner;

public class Q1 {

    // 내 풀이
    public int solution(String s1, String s2) {
        int answer = 0;
        String[] str = s1.split("");
        for (String s : str) {
            if (s.equalsIgnoreCase(s2)) {
                answer += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        Q1 q1 = new Q1();
        System.out.println(q1.solution(input1, input2));
    }
}
