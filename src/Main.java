// 항해 문제 26 ~ 30
public class Main {

    public static int solution(long num) {
        if (num == 1) return 0;

        int answer = 0;
        while (num > 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = (num * 3) + 1;
            }
            answer += 1;

            if (answer == 500) {
                answer = -1;
                break;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        System.out.println(solution(626331));

    }
}