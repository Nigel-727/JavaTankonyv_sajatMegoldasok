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
public class Pozitív2_3_4 {

  public static void main(String[] args) {
    System.out.println("\"Pozitív-e a megadott szám?\"");
    int szám = extra.Console.readInt("Szám (egész) = ? ");

    //if .. else ...
    if (szám > 0) {
      System.out.println("A szám pozitív.");
    } else {
      System.out.println("A szám NEM pozitív.");
    }    
    //feltételes kiértékelés; TODO: vajon a zárójel elhagyható?
    //a jelek szerint igen
    System.out.println("A szám " 
            + (szám<=0 ? "nem " : "")
            + "pozitív."
    );
    //
    
  }
}
