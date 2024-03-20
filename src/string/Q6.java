package string;

// indexOf();
public class Q6 {

  public String solution(String input) {
    String answer = "";
    char[] ch = input.toCharArray();

    for (int i = 0; i < ch.length - 1; i++) {
      for (int j = i + 1; j < ch.length; j++) {
        if (ch[i] == ch[j]) {
          ch[j] = '_';
        }
      }
    }
    for (char c : ch) {
      if (c != '_') {
        answer += c;
      }
    }
    return answer;
  }

  public static void main(String[] args) {

  }

}
