package string;

public class Q12 {
  public String solution(int n, String s) {
    String answer = "";
    // # -> 1, * -> 0
    String[] strs = new String[n];
    for (int i = 0; i < n; i++) {
      strs[i] = s.substring(i * 7, (i + 1) * 7);
    }
    for (int i = 0; i < strs.length; i++) {

      char[] ch = strs[i].toCharArray();
      for (int j = 0; j < ch.length; j++) {
        if (ch[j] == '#') {
          ch[j] = '1';
        } else if (ch[j] == '*') {
          ch[j] = '0';
        }
      }

      strs[i] = String.valueOf(ch);
    }

    for (String str : strs) {
      answer += (char) Integer.parseInt(str, 2);
    }

    return answer;
  }
}
