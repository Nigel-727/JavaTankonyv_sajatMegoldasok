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
public class Hatvány1 {

  public static void main(String[] args) {
    System.out.println("Adja meg az (egész) alapot és kitevőt!");
    int a = extra.Console.readInt("alap = ");
    int k = extra.Console.readInt("kitevő = ");
    System.out.println("Az eredmény: " + (int)Math.pow(a, k));

  }
}
