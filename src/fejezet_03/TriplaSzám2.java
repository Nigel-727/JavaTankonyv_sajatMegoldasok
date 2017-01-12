/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fejezet_03;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class TriplaSzám2 {
  public static void main(String[] args) {
    System.out.println("\"Triplaszám\"");
    double szám = extra.Console.readDouble("Adjad megfele a számot (de valós legyen ám)! Szám = ? ");
    System.out.println("4 tizedesjegyre kerekítve, jobbra igazítva: ->"
            + extra.Format.right(szám, 12, 4) + "<-"
    );
  }
}
