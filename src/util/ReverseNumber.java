package util;

public class ReverseNumber {

  public static int reverseNumber(int num) {

    int res = 0;

    while (num > 0) {
      // 1의 자리 숫자
      int t = num % 10;
      res = res * 10 + t;
      // 1의 자리 숫자 버림.
      num = num / 10;
    }

    return res;
  }

  public static void main(String[] args) {
    System.out.println(reverseNumber(123));
  }

}
