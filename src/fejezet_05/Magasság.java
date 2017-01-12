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
public class Magasság {
  public static void main(String[] args) {
    System.out.println("Írja be a tengerszint feletti magasságot méterben megadva!");
    int mag = extra.Console.readInt("magasság = ? ");
    if (mag<=0)
      System.out.println("Sajnálom, ezt nem tudom értelmezni.");
    else { //mag>0
      System.out.print("Ez bizony: ");
      if (mag<200)
        System.out.println("Alföld");
      else if (mag<500)
        System.out.println("Dombság");
      else if (mag<1500)
        System.out.println("Középhegység");
      else
        System.out.println("Hegység");
    }
  }
}
