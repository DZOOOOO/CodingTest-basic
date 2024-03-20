import java.util.Scanner;

public class Main {

  public String solution(int n, int[] a, int[] b) {
    String answer = "";

    // 가위 1, 바위 2, 보3
    for (int i = 0; i < n; i++) {
      // A가 가위로 이기는 경우
      if (a[i] - b[i] == -2) {
        answer += "A";
        // A가 바위, 보로 이기는 경우
      } else if (a[i] - b[i] == 1) {
        answer += "A";
      } else if (a[i] == b[i]) {
        answer += "D";
      } else {
        answer += "B";
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Main main = new Main();
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }
    for (int i = 0; i < n; i++) {
      b[i] = scanner.nextInt();
    }
    for (char x : main.solution(n,a,b).toCharArray()) {
      System.out.println(x);
    }
  }
}