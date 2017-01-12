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
public class Évszak {

  public static void main(String[] args) {
    System.out.println("Hónap sorszáma -> Évszak\n");
    int hó = extra.Console.readInt("hónap [egész] = ? ");
    if (1 <= hó && hó <= 12) {
      String évsz;
      switch (hó) {
        case 12:
        case 1:
        case 2:
          évsz = "tél";
          break;
        case 3:
        case 4:
        case 5:
          évsz = "tavasz";
          break;
        default:
          évsz = "ősz";
          break;
        case 6:
        case 7:
        case 8:
          évsz = "nyár";
          break;
      }
      System.out.println("A hónapsorszám szerinti évszak: " + évsz);
    } else {
      System.out.println("Ne szórakozz már!");
    }
  }
}
