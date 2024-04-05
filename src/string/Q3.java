package string;

public class Q3 {

    public String solution(String input) {
        String[] strs = input.split(" ");
        int max = strs[0].length();
        int maxIndex = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() > max) {
                max = strs[i].length();
                maxIndex = i;
            }
        }
        return strs[maxIndex];
    }

    public static void main(String[] args) {

    }
}
