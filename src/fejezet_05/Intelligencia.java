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
public class Intelligencia {
  public static void main(String[] args) {
    System.out.println("\"Intelligencica\"");
    int iq = extra.Console.readInt("Adja meg az IQ-t [egész]! Szám = ? ");
    if ( 0 < iq ) {
      //
      if ( iq < 90 )
        System.out.println("alacsony IQ");
      else if ( iq < 110 )
        System.out.println("átlagos IQ");
      else
        System.out.println("átlag feletti IQ");
    }
    else {
      System.out.println("Nempozitív IQ...");
    }
  }
}
