package string;

import java.util.ArrayList;
import java.util.List;

public class Q4 {

  public List<String> solution(int n, String[] str) {
    List<String> answer = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      answer.add(new StringBuilder(str[i]).reverse().toString());
    }
    return answer;
  }
  public List<String> solution1(int n, String[] str) {
    List<String> answer = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      char[] ch = str[i].toCharArray();
      int lt = 0;
      int rt = str[i].length() - 1;

      while (lt < rt) {
        char tmp = ch[lt];
        ch[lt] = ch[rt];
        ch[rt] = tmp;
        lt++;
        rt--;
      }
      answer.add(String.valueOf(ch));
    }

    return answer;
  }

  public static void main(String[] args) {

  }

}
