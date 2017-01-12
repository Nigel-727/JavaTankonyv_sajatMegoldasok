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
public class Szögtípus {

  public static void main(String[] args) {
    System.out.println("Szög típusa");
    double fok = extra.Console.readDouble(
            "Szög mértéke (fokban 0-tól 360-ig): ");
    if (0 <= fok && fok <= 360) {
      String szöv;
      if (fok == 360) {
        szöv = "teljesszög";
      } else if (180 < fok) {
        szöv = "homorúszög";
      } else if (fok == 180) {
        szöv = "egyenesszög";
      } else if (90 < fok) {
        szöv = "tompaszög";
      } else if (fok == 90) {
        szöv = "derékszög";
      } else if (0 < fok) {
        szöv = "hegyesszög";
      } else {
        szöv = "nullszög";
      }
      System.out.println("A szög ebbe a kategóriába esik: " + szöv);
    } else {
      System.out.println("Mással szórakozzál!");
    }
  }
}

//public class Szögtípus {
//  public static void main(String[] args) {
//    System.out.println("Szög típusa");
//    double fok=extra.Console.readDouble(
//      "Szög mértéke (fokban 0-tól 360-ig): ");
//    if(0<=fok && fok<=360) {
//      if(fok==0)
//        System.out.println("Nullszög.");
//      else if(fok<90)
//        System.out.println("Hegyesszög.");
//      else if(fok==90)
//        System.out.println("Derékszög.");
//      else if(fok<180)
//        System.out.println("Tompaszög.");
//      else if(fok==180)
//        System.out.println("Egyenesszög");
//      else if(fok<360)
//        System.out.println("Homorúszög.");
//      else //if(fok==360
//        System.out.println("Teljesszög.");
//    }
//    else
//      System.out.println("Hiba: a szögnek 0 és 360 közé kell esnie!");
//  }
//}
