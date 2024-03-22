import java.util.Scanner;

public class Main {

  // Q8. 부터~
  public int solution(int n, int[] arr) {
    int answer = 0;
    int score = 1;
    for (int i = 0; i < n; i++) {
      if (arr[i] == 1) {
        answer += score;
        score += 1;
      } else {
        score = 1;
      }
    }
    return answer;
  }


  public static void main(String[] args) {
    Main main = new Main();
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }
    System.out.println(main.solution(n, arr));
  }
}