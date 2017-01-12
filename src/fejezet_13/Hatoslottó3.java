package fejezet_13;

import java.util.TreeSet;

/**
 *
 * @author Nigel-727 
 */
public class Hatoslottó3 {
  public static void main(String[] args) { //ez ám a legtömörebb lottókitöltő
    System.out.println("\"Hatoslottó3\" *** Kitöltök ám egy 6oslottószelvényt valóban RENDesen!!!\n");
    TreeSet szelvény = new TreeSet(); //TreeSet: RENDEZETThalmaz; típusnélküli
    while (szelvény.size() < 6) 
      System.out.print( //kikommentelhető; teszt
              szelvény.add((int)(Math.random()*45+1)) 
                      ? "x":".") //!: kikommentelhető; "x"/".": nem tartalmazta (hozzá tudta adni) / nem tartalmazta (nem tudta)
              ;    
    System.out.println(); //kikommentelhető
    System.out.println("Íme, a szelvény: " + szelvény);
  }
}//class