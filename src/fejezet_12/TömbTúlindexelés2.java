package fejezet_12;

/**
 *
 * @author Nigel-727
 */
public class TömbTúlindexelés2 {
  public static void main(String[] args) {
    int[] t = new int[5];
    t[-1] = 3; //"java.lang.ArrayIndexOutOfBoundsException"
  }
}
