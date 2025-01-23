public class Hello {
  /**
   * @param args
   */
  public static void main(String[] args) {
    //System.out.println("Hello World");
    //System.out.println(3+4);

    //Primitive Data Types and variables and literals
    /*int num = 21;
    byte b = 127;
    short s = 345;
    long l = 6789l;
    float f = 5.8f;
    double d = 5.8;
    char c = 'c';
    boolean bool = true;

    double db = 10_00_00_000;*/

    //Casting on PRIMITIVE VALUES
    byte b = 125;
    int a = (int) b;
    byte c = (byte) a;
    System.out.println(c);

    float f = 5.6f;
    int d = (int) f;
    System.out.println(d);

    //Type Promotion
    byte a1 = 10;
    byte b1 = 40;

    int result = a1*b1;
    System.out.println(result);

  }
}