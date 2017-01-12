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
public class Abszolútérték {

  public static void main(String[] args) {
    System.out.println("Abszolútérték\n");
    int k = extra.Console.readInt("Adjad megfele az egész számot, de gyorsan! szám = ? ");
    int absz;
    //
    if (k < 0) {
      absz = k * (-1);
    } else {
      absz = k;
    }
    System.out.println("az abszolútérték: " + absz);
    //
    absz = k * (k < 0 ? -1 : 1);
    System.out.println("az abszolútérték: " + absz);
    
    absz = (k < 0 ? -k : k);
    System.out.println("az abszolútérték: " + absz);
  }
}
