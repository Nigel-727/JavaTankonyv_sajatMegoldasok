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
public class Oszthatóság {

  public static void main(String[] args) {
    int a = extra.Console.readInt("Egyik egész = ");
    int b = extra.Console.readInt("Másik egész = ");
    boolean osztható_e = 0 == a % b;
    System.out.println(a + " osztható " + b + " -val/vel: " +
            (osztható_e ? "igen" : "nem")
            );
  }
}
