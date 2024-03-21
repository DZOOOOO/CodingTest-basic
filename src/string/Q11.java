package string;

public class Q11 {
  public String solution(String str) {
    String answer = "";
    str += " ";
    char[] ch = str.toCharArray();

    int count = 1;
    for (int i = 0; i < ch.length - 1; i++) {
      if (ch[i] == ch[i + 1]) {
        count += 1;
      } else {
        if (count == 1) {
          answer += ch[i];
        } else {
          answer += ch[i] + String.valueOf(count);
          count = 1;
        }
      }
    }

    return answer;
  }
}
