package fejezet_06;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class FejVagyÍrás3 {
  public static void main(String[] args) {
    System.out.println("''FejVagyÍrás3''");
    int fejDb = 0, írásDb = 0,
            valami; 
    for (int i = 0; i < 1000; i++) {
      valami = Math.random() < 0.5 ? fejDb++ : írásDb++;
    }
    System.out.println("fejek száma: "+fejDb
            +"\nírások száma: "+írásDb);
  }
}
