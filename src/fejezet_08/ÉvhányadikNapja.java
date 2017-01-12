package fejezet_08;

import fejezet_07.Szökőévek2; //import <package.class>

public class ÉvhányadikNapja {
  
  private static int[] napokszáma = //lehetne final is, de most növelni akarom a februári értéket 
      {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
          
  public static void main(String[] args) {
//    int év = 2016, hó = 12, nap = 8;
//    int év = 2016, hó = 12, nap = 31;
//    int év = 2016, hó = 1, nap = 1;
    int év = 2016, hó = 3, nap = 1;
//    int év = 2015, hó = 3, nap = 1;
    //nehézség: meg kell állapítani h szökőév-e
    //https://hu.wikipedia.org/wiki/H%C3%B3nap
    
    System.out.println(
            év+". év "+hó+". hónap "+nap+". nap"
            + "\nE nap az adott év " 
            +hanyadiknap(év, hó, nap)
            +". napja."
    );
  }

  private static int hanyadiknap(int év, int hó, int nap) {
    //Ezúttal nem itt foglalkozunk értékkészlet ellenőrzéssel (1<=hó<=12, 1<=nap<=28/30/31, stb).
    if (Szökőévek2.szökőév(év)) { //megtehetnénk h ide csak febr 28-nál későbbi dátum esetén jutunk
//      System.out.println("szökőév");
      napokszáma[1] += 1;
    }
    int napDb = 0; //gyűjtő, összegnek; ebből lesz a return value
    int h = 0; //ciklusszámláló a hónaphoz
    while (h < hó-1)  //indextranszformáció BELSŐ ábrázolásra
      napDb += napokszáma[h++]; //amíg nem járunk a "cél" hónál, a hó összes napját hozzá kell adni
    napDb += nap; //amikor már a "cél" hónál járunk, nem a hó összes napját, hanem csak a nap-ot kell hozzáadni
    return napDb;
  }
}
