package string;

import java.util.Scanner;

public class Q1 {

  public int solution(String input, String ch) {
    int answer = 0;
    String[] strs = input.split("");
    for (String str : strs) {
      if (str.equalsIgnoreCase(ch)) {
        answer += 1;
      }
    }
    return answer;
  }

  public static void main(String[] args) {

  }

}
