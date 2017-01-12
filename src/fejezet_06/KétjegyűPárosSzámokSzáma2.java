package fejezet_06;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class KétjegyűPárosSzámokSzáma2 {
  public static void main(String[] args) {
    System.out.println("Megmondom, hány darab kétjegyű páros szám van");
    int db = 0;
    for (int i = 10; i < 98; i+=2) 
      db++;
    System.out.println("Hát, ennyi: "+db);
    //
    { //így néz ki egy for ciklus valójában
      int i = 10;
      while (i<98) {
        ; //utasítások
        i+=2; //utolsó sor
      }
    }
  }
}
