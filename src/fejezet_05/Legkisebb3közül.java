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
public class Legkisebb3közül {

  public static void main(String[] args) {
    System.out.println("Három valós szám közül megmondom melyik a legkisebb!");
    double v1 = extra.Console.readDouble("egyik = ? "),
            v2 = extra.Console.readDouble("másik = ? "),
            v3 = extra.Console.readDouble("harmadik = ? ");
    //
    if (v1 < v2) {
      if (v1 < v3) {
        System.out.println("egyik");
      } else //v1>=v3
      {
        System.out.println("harmadik");
      }
    } else //v1>=v2
    if (v2 < v3) {
      System.out.println("másik");
    } else //v2>=v3
    {
      System.out.println("harmadik");
    }
  }
}
