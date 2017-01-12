package fejezet_12;

/**
 *
 * @author Nigel-727
 */
public class Tömbtúlindexelés3 {
  
  static void doTúlindexel() /*throws Exception*/ { //#Question Kell v. nem kell?
    for (int i = 0; i <= tömb20.length; i++) {
        System.out.println(i+". indexű elem := "+(i+1));
        tömb20[i] = i+1;
      }
  }
  
  static int[] tömb20 = new int[20];
  
  public static void main(String[] args) throws Exception {
    try {
      doTúlindexel();
    }
    catch (ArrayIndexOutOfBoundsException aiE) {
      System.out.println("Indexelési hiba a tömbben, de valójában nem történt semmise!");
    }
    System.out.println("The show must go on...");
  }
}
