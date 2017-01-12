package fejezet_06;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class PitagorasziSzámhármasok {
  
  public static void main(String[] args) {
    System.out.println("Pitagoraszi számhármasok 1-50-ig behelyettetsítve");
    for (int x = 0; x < 50; x++) {
      for (int y = 0; y < 50; y++) {
        for (int z = 0; z < 50; z++) {
          if (Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2))
            System.out.println("x="+x+"; y="+y+"; z="+z);
        }
      }
    }
  }
}
