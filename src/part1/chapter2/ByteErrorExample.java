package part1.chapter2;

public class ByteErrorExample {
  public static void main(String[] args) {
      byte var1 = -128;
      byte var2 = 64;
      byte var3 = 127;
      //byte var4 = 128; 128은 byte에 할당할 수 없어서 오류남.

      System.out.println("var1 =" + var1 + ", var2 = " + var2 + ", var3 = " + var3);
  }
}
