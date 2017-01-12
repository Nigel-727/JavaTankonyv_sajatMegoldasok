package fejezet_06;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class FejVagyÍrás1 {
  public static void main(String[] args) {
    System.out.println("Feldobok egy érmét 1000x, megmondom hány fej és hány írás \"jött ki\"");
    int fejDb, írásDb;
    fejDb = írásDb = 0; // :)
    for (int i = 0; i < 1000; i++) {
      double vél = Math.random();
      if (vél<1.0/2) 
        fejDb++;
      else
        írásDb++;      
    }
    System.out.println("fejek száma: " + fejDb + 
            "\nírások száma: " + írásDb);
  }
}
