package array;

public class Q2 {

    public int solution(int n, int[] nums) {
        int answer = 1;

        int first = nums[0];
        for (int i = 1; i < n; i++) {
            if (first < nums[i]) {
                first = nums[i];
                answer += 1;
            }
        }

        return answer;
    }
}
