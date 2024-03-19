package string;

public class Q3 {

  public String solution(String input) {
    String answer = "";
    String[] strs = input.split(" ");

    int len = strs[0].length();
    for (int i = 1; i < strs.length; i++) {
      if (strs[i].length() > len) {
        len = strs[i].length();
      }
    }

    for (String str : strs) {
      if (str.length() == len) {
        answer = str;
        break;
      }
    }

    return answer;
  }

  public static void main(String[] args) {

  }

}
