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
public class KamatosKamat {
  public static void main(String[] args) {
    System.out.println("\"Kamatos kamat\"\n"); //TODO: hogyan lehet a main-t tartalmazó osztály nevét kiíratni
    long betét = extra.Console.readInt("Betét (egész) = ? ");
    int fidő = extra.Console.readInt("Futamidő (egész) = ? ");
    double kamláb = extra.Console.readDouble("Kamatláb (valós) = ? ");
    System.out.println("A kamatos kamat: "
            + (betét + betét * fidő * (kamláb/100)));
    
  }
}
