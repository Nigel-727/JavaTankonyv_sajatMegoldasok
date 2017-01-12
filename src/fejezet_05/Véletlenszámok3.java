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
public class Véletlenszámok3 {
  public static void main(String[] args) {
    System.out.println("Tetszőleges két szám közötti véletlenszám generálása\n"
            + "Adja meg a két EGÉSZ számot! [előbb a kisebbet, majd a nagyobbat]");
    int a, b; //az egyszerűség kedvéért egészeket kérek be
    a = extra.Console.readInt("alsó határ = ? ");
    b = extra.Console.readInt("felső határ = ? ");
    if ( a > b ) {
      int tmp;
      tmp = a; a = b; b = tmp; //csere
    }
    
    int vél = (int)( Math.random() * ( b-a+1 ) + a);
    System.out.println("egy véletlenszám: " + vél);
  }
}
