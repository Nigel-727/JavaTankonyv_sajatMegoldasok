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
public class LegkisebbSzám {

  public static void main(String[] args) {
    System.out.println("Adjon meg 3 db egész számot, kérem!");
    int[] egészTömb = new int[3];
    for (int i = 0; i < 3; i++) {
      egészTömb[i] = extra.Console.readInt(i+1 + ". szám = ");
    }
    System.out.println("Ezek közül a legkisebb szám: " +
            Math.min(
                    egészTömb[0], 
                    Math.min(egészTömb[1], egészTömb[2])
            )
    );
  }
}
