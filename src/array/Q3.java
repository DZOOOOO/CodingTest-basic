package array;

public class Q3 {

    public String[] solution(int n, int[] nums1, int[] nums2) {
        String[] answer = new String[n];
        // 1. 가위, 2. 바위, 3. 보

        // 가위 - 보 = -2
        // 바위 - 가위 = 1
        // 보 - 바위 = 1

        // 가위 - 바위 = -1
        // 바위 - 보 = -1
        // 보 - 가위 = 2

        for (int i = 0; i < n; i++) {
            if (nums1[i] - nums2[i] == -2 || nums1[i] - nums2[i] == 1) {
                answer[i] = "A";
            } else if (nums1[i] - nums2[i] == -1 || nums1[i] - nums2[i] == 2) {
                answer[i] = "B";
            } else {
                answer[i] = "D";
            }
        }
        return answer;
    }
    public static void main(String[] args) {

    }
}
