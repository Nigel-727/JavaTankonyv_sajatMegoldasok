package fejezet_13;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Nigel-727
 */
public class SzámokElőfordulása2 {
  
  public static void main(String[] args) {
    System.out.println("\"Számokelőfordulása2\" ***\n"
            + "\tIlyet már írtam, de akkor csak sima tömbben tároltam,\n"
            + "\t\taz előfordulásszámot pedig logikai tömbbel számoltam\n");
    final int MÉRET = 30;
    ArrayList<Integer> tömblista = new ArrayList<>(MÉRET); //(x): "the specified initial capacity"
    for (int i = 0; i < MÉRET; i++) 
      tömblista.add((int)(Math.random()*90+10));
    System.out.println("a tömblista:\n"+tömblista);
    //lemásolom gyakorlásképpen
    ArrayList<Integer> tömblista2 = new ArrayList<>(MÉRET);
    tömblista2.addAll(tömblista);
    //kigyűjtjük (+kiírjuk) melyik szám hányszor fordul elő:
    System.out.println("\nAz előfordulásszámok:");
    int printCounter=1;
    for (int i = 10; i <= 99; i++) //a lehetséges legkisebb értéktől a lehetséges legnagyobbig
      if (tömblista2.contains(i)) {
        System.out.print(i+": ");
        int db=0;        
        do  {     
          db++;
//          tömblista.remove(i); //!: i itt index
          tömblista2.remove((Integer)i); //!: i itt elemérték
        } while (tömblista2.contains(i));
        System.out.print(db+" db" + (printCounter++%10!=0?"| ":"\n"));
      }
    System.out.println();
    //nem kérte a feladat, de rendezem is, gyakorlásféleképpen:
    Collections.sort(tömblista);
    System.out.println("\na tömblista rendezés után:\n"+tömblista);
  }//main()
}//class