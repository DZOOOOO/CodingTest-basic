package array;

import java.util.ArrayList;
import java.util.List;

public class Q1 {

    public List<Integer> solution(int n, int[] nums) {
        List<Integer> answer = new ArrayList<>();
        answer.add(nums[0]);

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                answer.add(nums[i + 1]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
