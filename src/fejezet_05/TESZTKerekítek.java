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
public class TESZTKerekítek {
  public static void main(String[] args) {
    System.out.println("(int) típusátalakítások:\n"
            + (int)56.6 + '\t'
            + (int)-56.6 + '\t'
            + (int)56.9999
    );
    System.out.println("Léptető operátorok");
    int a = 2, 
        c=(a++)+(++a); //a=4 lesz, c=2+4 lesz
    System.out.println("a= "+a+"; c="+c);
  }
}
