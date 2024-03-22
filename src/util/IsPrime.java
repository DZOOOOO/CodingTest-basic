package util;

public class IsPrime {
  public static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    // 소수체크
    for (int i = 2; i < Math.sqrt(n); i++) {
      if (i % n == 0) {
        return false;
      }
    }
    return true;
  }

}
