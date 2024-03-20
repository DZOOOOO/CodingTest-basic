package string;

public class Q8 {

  public String solution(String input) {
    String answer = "NO";
    input = input.toLowerCase().replaceAll("[^a-z]", "");
    String reverse = new StringBuilder(input).reverse().toString();
    if (input.equalsIgnoreCase(reverse)) {
      answer = "YES";
    }
    return answer;
  }

  public static void main(String[] args) {

  }

}
