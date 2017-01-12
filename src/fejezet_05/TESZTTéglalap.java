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
public class TESZTTéglalap {

  public static void main(String[] args) {
    System.out.println("Téglalap kerülete, területe");
    int a, b;
    boolean tovább; 
    byte jóDb; //ha fontos számolni hány adatbevitel sikerült
    do {
      a = extra.Console.readInt("a: ");
      b = extra.Console.readInt("b: ");
      tovább = true;
      jóDb = 0;
      if (a > 0) {
//        jóDb++;
      } else { // a<=0
        System.out.println("a oldal pozitív kell legyen!");
        tovább = false;
      }
      if (tovább && b > 0) { //Mivel ez akkor is hamis lehet ha _a_ nem volt jó...
//        jóDb++;
      } else /* !tovább || b<=0 */ if (b <= 0) { //...emiatt kell ezt is vizsgálni.
        System.out.println("b oldal pozitív kell legyen!");
        tovább = false;
      }
      if (tovább) { //ha nem volt hiba
//      if (jóDb == 2) {
        int kerület = 2 * (a + b), terület = a * b;
        System.out.println("K: " + kerület + "\nT: " + terület);
      }
    } while (!tovább); //HUMOR: amíg netovább :) //amíg volt hiba

  }
}
