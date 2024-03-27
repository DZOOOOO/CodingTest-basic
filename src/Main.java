import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public List<Integer> solution(int n, int[] nums, int n1, int[] nums1) {
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(nums);
        Arrays.sort(nums1);

        int p1 = 0;
        int p2 = 0;

        while (p1 < n && p2 < n1) {
            if (nums[p1] == nums1[p2]) {
                answer.add(nums[p1++]);
                p2++;
            } else if (nums[p1] < nums1[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        int n1 = scanner.nextInt();
        int[] nums1 = new int[n1];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = scanner.nextInt();
        }

        for (int i : main.solution(n, nums, n1, nums1)) {
            System.out.print(i + " ");
        }
    }
}