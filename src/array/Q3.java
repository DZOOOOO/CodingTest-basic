package array;

import java.util.Arrays;

public class Q3 {

    public String[] solution(int n, int[] num1, int[] num2) {
        String[] answer = new String[n];
        Arrays.fill(answer, "D");
        for (int i = 0; i < n; i++) {
            int result = num1[i] - num2[i];
            if (result == -2 || result == 1) {
                answer[i] = "A";
            } else if (result == -1 || result == 2){
                answer[i] = "B";
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
