package part1.chapter3;

public class IncreaseDecreaseOperatorExample {
  public static void main(String[] args) {
      int x = 10;
      int y = 10;
      int z;

      x++;  //11
      ++x;  //12
      System.out.println("x=" + x); //12

      System.out.println("---------------------");
      y--;  //9
      --y;  //8
      System.out.println("y=" + y); //8

      System.out.println("---------------------");
      z = x++;  // z = 12, x = 13
      System.out.println("z=" + z); //12
      System.out.println("x=" + x); //13

      System.out.println("---------------------");
      z = ++x;  // x = 14, z = 13 -> 14
      System.out.println("z=" + z); //13 -> 14
      System.out.println("x=" + x); //14
      
      System.out.println("---------------------");
      z = ++x + ++y;  // x = 15, y = 9, z = 24
      System.out.println("z=" + z); //24
      System.out.println("x=" + x); //15
      System.out.println("y=" + y); //9
  }
}
