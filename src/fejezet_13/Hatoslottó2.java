package fejezet_13;

import java.util.HashSet;

/**
 *
 * @author Nigel-727
 */
public class Hatoslottó2 { //set-et használva a legkevesebb a kódsor
  public static void main(String[] args) {
    System.out.println("\"Hasotlottó2\" *** Kitöltök ám egy 6oslottószelvényt rendesen!!!\n");
    HashSet szelvény = new HashSet(); //HashSet: RENDEZETLENhalmaz; típusnélküli
    while (szelvény.size() < 6) 
      System.out.print( //kikommentelhető; teszt
              szelvény.add((int)(Math.random()*45+1)) 
                      ? "x" : "." ) //!: kikommentelhető; "x": még nem volt eleme->hozzáadta, ".": már eleme volt->nem adta hozzá
              ;    
    System.out.println(); //kikommentelhető
    System.out.println("Íme, a szelvény: " + szelvény);
  }
}
