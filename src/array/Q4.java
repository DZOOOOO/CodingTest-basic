package array;

public class Q4 {

    public int[] solution(int n) {
        int[] nums = new int[n];
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i < nums.length; i++) {
            nums[i] = nums[i - 2] + nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {

    }
}
