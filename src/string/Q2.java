package string;

public class Q2 {

  public String solution(String input) {
    String answer = "";
    String[] str = input.split("");
    for (int i = 0; i < str.length; i++) {
      if (str[i].toLowerCase().equals(str[i])) {
        str[i] = str[i].toUpperCase();
      } else {
        str[i] = str[i].toLowerCase();
      }
    }
    for (String s : str) {
      answer += s;
    }
    return answer;
  }

  public static void main(String[] args) {

  }
}
