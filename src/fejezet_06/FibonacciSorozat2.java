package fejezet_06;
/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class FibonacciSorozat2 {
  public static void main(String[] args) {
    final int DB = 80;
    System.out.println("a Fibonacci-sorozat első "
            + DB + " tagja sorszámozva");
    //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, etc
    long b = 1, 
            a = 0, 
                c; //összeg
    //F(_): b + a = c
    //F(1): 1 + 0 = 1 // << balra tolódnak az értékek
    //F(2): 0 + 1 = 1 // << balra tolódnak az értékek
    //F(3): 1 + 1 = 2
    //F(4): 1 + 2 = 3
    //F(5): 2 + 3 = 5;
    //F(n): a(n-1) + c(n-1)
    for (int i = 0; i < 80; i++) {
      c = b + a;
      System.out.println("F(" + (extra.Format.right(i+1,2)) + ") = " + c);
      //Csere:
      b = a;
      a = c;
    }
  }
}
