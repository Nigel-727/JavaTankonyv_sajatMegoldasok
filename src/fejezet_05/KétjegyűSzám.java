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
public class KétjegyűSzám {
  public static void main(String[] args) {
    System.out.print("Eldöntöm egy egész számról h kétjegyű-e"
            + "\n\nÍrja be a számot! szám = ?");
    int a = extra.Console.readInt();
    if (
            ( -100<a  &&  a<-9 ) 
                    || 
            ( 9<a  &&  a<100 )
    ) 
      System.out.println("Igen, kétjegyű");
    else
      System.out.println("Nem kétjegyű.");
  }
}
