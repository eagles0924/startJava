package part1.chapter2;

public class VariableExchangeExample {
  public static void main(String[] args) {
      int x = 3;
      int y = 5;
      System.out.println("x: " + x + ", y: " + y);

      // 파이썬과 달리, 자바에서는 두 변수를 바꾸기 위해서는 새로운 변수를 설정해야한다.
      int temp = x;
      x = y;
      y = temp;
      System.err.println("x: " + x + ", y: " + y);
  }

}
