package array;

public class Q2 {

    public int solution(int n, int[] nums) {
        int answer = 1;
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                answer += 1;
            }
        }
        return answer;
    }

}
