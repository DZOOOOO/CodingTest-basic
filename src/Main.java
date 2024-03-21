import java.util.Scanner;

public class Main {

  public String solution(int n, String s) {
    String answer = "";
    // # -> 1, * -> 0
    for (int i = 0; i < n; i++) {
      String tmp = "";
      tmp = s.substring(0, 7)
          .replace('#', '1')
          .replace('*', '0');
      answer += (char) Integer.parseInt(tmp, 2);
      s = s.substring(7);
    }

    return answer;
  }

  public static void main(String[] args) {
    Main main = new Main();
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String s = scanner.next();
    System.out.println(main.solution(n, s));
  }
}