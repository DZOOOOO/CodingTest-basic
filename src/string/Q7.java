package string;

public class Q7 {

  public String solution(String input) {
    String answer = "YES";
    input = input.toLowerCase();

    int lt = 0;
    int rt = input.length() - 1;

    while (lt < input.length() / 2) {
      if (input.charAt(lt) == input.charAt(rt)) {
        lt++;
        rt--;
      } else {
        answer = "NO";
        break;
      }
    }

    return answer;
  }

  public static void main(String[] args) {

  }
}
