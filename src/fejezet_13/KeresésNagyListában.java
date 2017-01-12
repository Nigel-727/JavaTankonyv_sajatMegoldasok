/*
 * Na, itt már keresési algoritmusok is bejátszanak...
 * nagyméretű Integer tömblista
 * feltölteni egyedi egészekkel (közben ügyelni a rendezettségre/utólag rendezni)
 * lineáris létezőre+nemlétezőre, bináris létetőre+nemlétezőre
 * közben mérni ezzel: System.CurrentTimeMillis()
 * lineárist ezzel: |obj ArrayList<>|.indexOf() //!?
 * binárist ezzel: Collections.binarySearch()
 */
package fejezet_13;

import java.util.*;

/**
 *
 * @author Nigel-727 
 */
public class KeresésNagyListában {

  static int maxDb = //a lista elemszáma
          2_000_000; //2m
//          500_000; 
//          250_000; //ennyi _vél.szám_ már elég sokáig eltarthat
//          100_000;
//          50_000; //50e
//          10; 
  static ArrayList<Integer> nagylista = new ArrayList<>(maxDb);

  private static int linearSearch(int érték) {
    return nagylista.indexOf(érték);
  }

  private static int binarySearch(int érték) {
    return Collections.binarySearch(nagylista, érték);
  }
  
  private static void listaFeltolt() { //1-esével; indexelt feltöltés; [1..db]
    int db = 0; 
    while (db < maxDb) 
      nagylista.add(++db);           
  }
  
  private static void listaFeltolt(int highestvalue) { //[1..paraméter] vél.számokkal feltöltés
    int db = 0; 
    while (db < maxDb) {
      int próba = (int)(Math.random()*highestvalue+1);
      if (!nagylista.contains(próba)) {
        nagylista.add(próba);       
        db++;
      }
    }//while
  }
  
  public static void main(String[] args) {
    System.out.println("\"KeresésNagyListában\" ***\n");
    final int KERESETT = //a keresendő érték
//            maxDb; //index-szel feltöltésnél: tuti benne van
            maxDb+1; //index-szel feltöltésnél: tuti nincs benne
//            maxDb/2; //index-szel feltöltésnél: tuti benne van
    final int MAXVÉL = //a legnagyobb véletlen érték
            maxDb * 1000; //mivel maxDb<=a választható értékek tartománya -> az értékek egyediek tudnak lenni
    String[] módok = {"", //0
      "indexekkel", //1
      "véletlenszámokkal [1.." + MAXVÉL + "]" //2
    };
    int mód = 1;
    System.out.println("a lista elemszáma:\t" + maxDb 
            + "\na keresett érték:\t" + KERESETT
            + "\na feltöltés módja:\t" + módok[mód]
    );
    System.out.print("feltöltés...");
    long timeFillBefore = System.currentTimeMillis();
    switch (mód) {
      case 1: 
        listaFeltolt(); //indexelt feltöltés (1..maxDb értékek)
        break;
      case 2:
        listaFeltolt(MAXVÉL); //vél.számos feltöltés; 
        break;
    }
    System.out.println("kész. (időtartam: "
            +(System.currentTimeMillis()-timeFillBefore)/1000+" s)");
    //
    if (nagylista.size()<10_000) { //ha nem túl hosszú, kiírjuk:
      System.out.println("nagylista:\n"+nagylista);
      Collections.sort(nagylista);
      System.out.println("nagylista, immár rendezve:\n"+nagylista);
      System.out.println();
    }
    //lineáris kereséssel:
    long timeLinBefore = System.currentTimeMillis();
    int lIndex = linearSearch(KERESETT);
    long timeLinAfter = System.currentTimeMillis();
    //bináris kereséssel:
    long timeBinBefore = System.currentTimeMillis();
    int bIndex = binarySearch(KERESETT);
    long timeBinAfter = System.currentTimeMillis();    
    //Hogy nem egészen ez volt a feladat, tudjuk. 
    //(a feladat szerint biztosan létezőt + biztosan nemlétezőt kell keresni mind2 módszerrel)
    //OUTPUT:
    System.out.println(""
            + "* Lineáris kereséssel: " 
            + (lIndex<0 ? "nincs benne " : "benne van, indexe: " + lIndex + " ")
            + "(keresési idő: " + (timeLinAfter-timeLinBefore) + " ms)"
    );
    System.out.println(""
            + "* Bináris kereséssel: " 
            + (bIndex<0 ? "nincs benne " : "benne van, indexe: " + bIndex + " ")
            + "(keresési idő: " + (timeBinAfter-timeBinBefore) + " ms)"
    );
  }
}//class