public class Radix {
  public static int nth(int n, int col) {
    return ((Math.abs(n)/(int)Math.pow(10,col))%10);
  }
  public static int length (int n) {
    String str = Integer.toString(Math.abs(n));
    return (str.length());
  }
}
