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
public class Osztályzat2 {

  public static void main(String[] args) {
    System.out.println("\"Osztályzat számmal => Osztályzat szöveggel\"");
    int oszt = extra.Console.readInt("Osztályzat [egész] = ? ");
    if (!(0 <= oszt && oszt <= 6)) //engedek fölé is, alá is
    {
      System.out.println("Hülyeség, próbálkozz mással!");
    } else {
      System.out.println("Ugyanez szöveggel:");
      switch (oszt) {
        default: //FONTOS: a default ág akár elöl is lehet
          System.out.print("Hát, ez qrva");
          if (oszt == oszt * (-1)) { //vagyis NULLA
            System.out.println("SZAR");
          } else {
            System.out.println("JÓ");
          }
          break; //FONTOS: ha nem lenne, innen is továbbhullhatna a vezérlés
        case 1:
          System.out.println("(1) elégtelen");
          break;
        case 2:
          System.out.println("(2) elégsegges");
          break;
        case 3:
          System.out.println("(3) közeps, de mivel közepes nem létezik, ezért");
//          break; //ha nincs, továbbhullik a vezérlés
        case 4:
          System.out.println("(4) jóóóóóó, ami neked kivételesen");
//          break; //itt is
        case 5:
          System.out.println("(5) JELES");
          break;

      }
    }
  }
}
