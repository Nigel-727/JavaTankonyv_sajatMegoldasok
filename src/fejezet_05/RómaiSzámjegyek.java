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
public class RómaiSzámjegyek {
  public static void main(String[] args) {
    System.out.println("Adjon meg egy 0..9 egész számot, "
            + "átírom római számmá!");
    int egész = extra.Console.readInt("szám = ? ");
    // i, ii, iii, iv, v, vi, vii, viii, ix
    if (0 < egész && egész < 10)
    {
      switch (egész) {
        case 1:
          System.out.print("I");
          break;
        case 2:
          System.out.print("II");
          break;
        case 3:
          System.out.print("III");
          break;
        case 4:
          System.out.print("IV");
          break;
        case 5:
          System.out.print("V");
          break;
        case 6:
          System.out.print("VI");
          break;
        case 7:
          System.out.print("VII");
          break;
        case 8:
          System.out.print("VIII");
          break;
        case 9:
          System.out.print("IX");
          break;
        default:
          throw new AssertionError();
      } 
      System.out.println(".\nKöszönöm a figyelmet.");
    } else
      System.out.println("Túl kicsi vagy túl nagy szám!");
  }
}
