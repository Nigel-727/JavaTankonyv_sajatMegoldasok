/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fejezet_05;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class Osztható15tel {
  public static void main(String[] args) {
    System.out.println("Írjon be egy legalább 3-jegyű pozitív egész számot!"
            + "\nMegmondom, osztható-e 15-tel.");
    int egész = extra.Console.readInt("szám = ? ");
    if (egész<100 || 999<egész)
      System.out.println("Nem megfelelő a szám.");
    else {
      boolean osztható15tel =
              egész%3==0 && egész%5==0;
      System.out.println("A szám "
              +(osztható15tel?"":"nem ")
              +"osztható 15-tel.");
    }
  }
}
