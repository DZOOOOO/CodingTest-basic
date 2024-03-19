package string;

public class Q5 {

  public String solution(String input) {
    char[] ch = input.toCharArray();
    int lt = 0;
    int rt = input.length() - 1;

    while (lt < rt) {
      if (!Character.isAlphabetic(ch[lt])) {
        lt++;
      } else if (!Character.isAlphabetic(ch[rt])) {
        rt--;
      } else {
        char tmp = ch[lt];
        ch[lt] = ch[rt];
        ch[rt] = tmp;
        lt++;
        rt--;
      }
    }

    return String.valueOf(ch);
  }

  public static void main(String[] args) {

  }

}
