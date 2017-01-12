/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fejezet_04;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class KétSzámátlaga {
  public static void main(String[] args) {
    System.out.println("Két szám átlaga\n");
    double a = extra.Console.readDouble("Egyik szám (valós) = ? ");
    double b = extra.Console.readDouble("Másik szám (valós) = ? ");
    System.out.println("Átlaguk: " + (a + b) / 2);
    //tesztelek:
    System.out.println("\n" + a + b / 2); // output: "50.050.0"
  }
}
