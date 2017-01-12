package fejezet_06;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class AngolABCKisbetűi {
  public static void main(String[] args) {
    System.out.println("Az angol ABC kisbetűi");
    for (char c = 'a'; c < 'z'; c++) {
      System.out.println(c + "(" + (int)c + ")");
    }
  }
}
