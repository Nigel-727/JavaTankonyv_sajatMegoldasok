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
public class ElsőfokúEgyenlet1 {

  public static void main(String[] args) {
    System.out.println("Elsőfokú egyenlet ( a*x+b=0 )\nAdja meg egészként a változókat!");
    int a = extra.Console.readInt("a = ");
    int b = extra.Console.readInt("b = ");
    double x = -b / a;    // "a*x+b=0" miatt
    System.out.println("x = " + x);

  }
}
