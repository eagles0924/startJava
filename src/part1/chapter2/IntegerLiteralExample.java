package part1.chap2;

public class IntegerLiteralExample {
  public static void main(String[] args) {
      int var1 = 0b1011;// 이진법: 1*2**3 + 0 + 1*2**1 + 1*2**0 = 11
      int var2 = 0206;  // 팔진법: 2*8**2 + 0 + 6*8**0 = 134
      int var3 = 365;   // 십진법: 365
      int var4 = 0xB3;  // 십육진법: 11*16**1 + 3*16**0 = 176 + 3 = 179

      System.out.println("var1: " + var1);
      System.out.println("var2: " + var2);
      System.out.println("var3: " + var3);
      System.out.println("var4: " + var4);
  }
}
