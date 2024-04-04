package array;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1 {

    // 내 풀이
    public List<Integer> solution(int n, int[] nums) {
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] < nums[i]) {
                list.add(nums[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Q1 main = new Q1();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        for (int num : main.solution(n, nums)) {
            System.out.print(num + " ");
        }
    }
}
