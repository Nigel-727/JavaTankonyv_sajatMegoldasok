/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fejezet_04;

//import jdk.nashorn.internal.objects.NativeDebug;

/**
 *
 * @author Nigel-727 <nigel727@gmail.com>
 */
public class Százalék {
  public static void main(String[] args) {
    // System.out.println(toString()); //TODO: statikus maint-t tartalmazó osztály nevét hogyan lehet megkapni
    System.out.println("\"Százalék\"");
    double alap = extra.Console.readDouble("Alap=? ");
    int láb = extra.Console.readInt("Láb=? ");
    System.out.println("Nesze, itt a százalékérték: " + alap * láb / 100);
  }
}
