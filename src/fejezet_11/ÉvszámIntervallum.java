package fejezet_11;

/**
 * véletlentömb (évszámokkal) : bár a feladat konzolos beolvasást kér;
 * output: a legkisebb és a legnagyobb évszám; 
 * (ezek között) 4 db kategória (legyenek kb egyenlő hosszúak), 
 * amikbe eső évszámokat növekvő rendben írjuk ki!
 * 
 * @author Nigel727
 */
public class ÉvszámIntervallum {
  
  private static final int DB_ÉVSZÁMOK = 20;
  private static int[] évszámok = 
          new int[DB_ÉVSZÁMOK]; //0..alapú indexelés
//  {1975, 1977, 1984, 1987, 1987, 1991, 1992, 1995, 1997, 2001, 2001, 2003, 2005, 2005, 2007, 2010, 2011, 2013, 2014, 2016};
  
  private static void beolvasÉvszámok(int ah, int fh) {
    for (int i = 0; i < DB_ÉVSZÁMOK; i++) {
      évszámok[i] = (int)(Math.random()*(fh-ah+1)+ah);
    }
  }
  
  private static void kiírÉvszámok() {
    System.out.print("[ ");
    for (int i : évszámok) 
      System.out.print(i + " ");
    System.out.println("]");
  }
  
  //helyben rendezés; 
  private static void rendezÉvszámok() { //legyen ezúttal (eredeti) buborékos #forachange
    for (int i = DB_ÉVSZÁMOK-1; i >= 1; i--) { //legutolsótól a második elemig balra egyesével
      for (int j = 0; j <= i-1 ; j++) { //legelsőtől külső-1 -ig jobbra egyesével
        if (évszámok[i]-évszámok[j] < 0) { //!: ha rossz a sorrend, akkor csere:
          int csere=évszámok[i]; évszámok[i]=évszámok[j]; évszámok[j]=csere; 
        }
      }
    }
  }
  
  private static void besorolÉSkiírÉvszámok() { //először ez a változat készült el
    int   minÉv=évszámok[0], 
          maxÉv=évszámok[DB_ÉVSZÁMOK-1];
    int intervallumhossz = (maxÉv-minÉv+1)/4;
    if (intervallumhossz < 1) //lehetetlent kérsz
      return;
    System.out.println("a legkisebb évszám:\t" + minÉv
            + "\na legnagyobb évszám:\t" + maxÉv );
    System.out.println("Az évszámok, intervallumokba sorolva:");
    int[] határok = { //#iLoveJava
      minÉv, //5 szám -> 4 db vessző (intervallum)
      minÉv+1*intervallumhossz, 
      minÉv+2*intervallumhossz, 
      minÉv+3*intervallumhossz, 
      maxÉv+1 //a +1 kompenzáció, mivel a legutolsó határ: határok[határokIndex+1]-1, vagyis itt pedig levonunk egyet
    }; 
    int évszámokIndex=0; //az évszámok tömbön lépkedni
    for (int határokIndex = 0; határokIndex < határok.length-1; határokIndex++) { //most a length: 4
      System.out.print(határok[határokIndex]+"-"+(határok[határokIndex+1]-1)+" közé eső évszámok: ");  
      while (évszámokIndex<DB_ÉVSZÁMOK && évszámok[évszámokIndex]<határok[határokIndex+1]) {
        System.out.print(évszámok[évszámokIndex++]+" ");        
      }
      System.out.println();
    }
  }
  
  private static void besorolÉSkiírÉvszámok(int intervallumDb) {
    int   minÉv=évszámok[0], 
          maxÉv=évszámok[DB_ÉVSZÁMOK-1];
    int intervallumhossz = (maxÉv-minÉv+1)/intervallumDb;
    if (intervallumhossz < 1) //lehetetlent kérsz
      return;
    System.out.println("a legkisebb évszám:\t" + minÉv
            + "\na legnagyobb évszám:\t" + maxÉv );
    System.out.println("Az évszámok, intervallumokba (" + intervallumDb + " db)"
            + " sorolva:");
    //
    int[] határok = new int[intervallumDb+1]; //indexek: [0..intervallumDb]
    határok[0] = minÉv; 
    határok[intervallumDb] = maxÉv+1; //a legutolsó elem; kompenzáció
    for (int határokIndex = 1; határokIndex <= intervallumDb-1; határokIndex++) {
      határok[határokIndex] = minÉv+határokIndex*intervallumhossz;
    }
    //
    int évszámokIndex=0; //az évszámok tömbön lépkedni
    for (int határokIndex = 0; határokIndex < határok.length-1; határokIndex++) { 
      System.out.print(határok[határokIndex]+"-"+(határok[határokIndex+1]-1)+" közé eső évszámok: ");  
      while (évszámokIndex<DB_ÉVSZÁMOK && évszámok[évszámokIndex]<határok[határokIndex+1]) {
        System.out.print(évszámok[évszámokIndex++]+" ");        
      }
      System.out.println();
    }
  }
  
  static int[][] besorolÉvszámok(final int intervallumokSzáma) {
    int   minÉv=évszámok[0], 
          maxÉv=évszámok[DB_ÉVSZÁMOK-1];
    int intervallumhossz = (maxÉv-minÉv+1)/intervallumokSzáma;
    if (intervallumhossz < 1) //lehetetlent kérsz
      return null;
    //ÚJ(donság):
    int[][] ezkellneked = new int[intervallumokSzáma][]; //az eredménytáblázat; csak a sorok száma fix; #iLoveJava
    //határok beállítása:
    int[] határok = new int[intervallumokSzáma+1]; //indexek: [0..intervallumDb]
    határok[0] = minÉv; 
    határok[intervallumokSzáma] = maxÉv+1; //a legutolsó elem; kompenzáció
    for (int határokIndex = 1; határokIndex <= intervallumokSzáma-1; határokIndex++) 
      határok[határokIndex] = minÉv+határokIndex*intervallumhossz;
    //
    int évszámokIndex=0; //az évszámok tömbön lépkedni
    int intervallumIndex=0; //ÚJ; az eredménytáblázat SORindexe
    for (int határokIndex = 0; határokIndex < határok.length-1; határokIndex++) { 
//      System.out.print(határok[határokIndex]+"-"+(határok[határokIndex+1]-1)+" közé eső évszámok: ");  
      int intervallumbanDb=0; //ÚJ; az eredménytáblázat OSZLOPindexe (majdnem)
      int[] intervallumbanTömb = new int[DB_ÉVSZÁMOK]; //ÚJ; TODO csökkenteni a tömbkapacitást
      while (évszámokIndex<DB_ÉVSZÁMOK && évszámok[évszámokIndex]<határok[határokIndex+1]) {
//        System.out.print(évszámok[évszámokIndex]+" ");        
        intervallumbanTömb[intervallumbanDb++]=évszámok[évszámokIndex];
        évszámokIndex++;
      }//belső ciklus
      //ÚJ; Takarékos tömbbe másoljuk az intervallumbanTömb-öt, első két eleme az aktuális határok:
      ezkellneked[intervallumIndex] = new int[intervallumbanDb+2];
      ezkellneked[intervallumIndex][0]=határok[határokIndex];
      ezkellneked[intervallumIndex][1]=határok[határokIndex+1]-1;
      for (int i = 0; i < intervallumbanDb; i++) 
        ezkellneked[intervallumIndex][i+2]=intervallumbanTömb[i];
//      System.out.println();
      intervallumIndex++; //ÚJ
    }//külső ciklus
    return ezkellneked; 
  }
  
  public static void main(String[] args) {
    System.out.println("Intervallumokba (pontosan 4-be) sorolom ám befele az évszámokat!!!\n");
    beolvasÉvszámok(1975, 2016); //TODO bekérni/konstanssal
    System.out.println("* beolvasás után:");
    kiírÉvszámok();
    rendezÉvszámok(); //hasznos: ez az output sorrendje + min&max.kiválasztás egyben
    System.out.println("* rendezés után:");
    kiírÉvszámok();
//    besorolÉSkiírÉvszámok(); //4-es kategóriaszám beégetve
//    besorolÉSkiírÉvszámok(4); //kategóriaszám paraméterben
    //Paraméteres változat ami 2D-tömböt ad vissza: *********************
    int[][] évszámok_táblázat = besorolÉvszámok(4); //eredmény: tömbben
    //
    if (évszámok_táblázat!=null) {
      //a táblázat kiírása:
      for (int i = 0; i < évszámok_táblázat.length; i++) {
        System.out.print(
                évszámok_táblázat[i][0]+"-"+évszámok_táblázat[i][1]+" között: ");
        for (int j = 2; j < évszámok_táblázat[i].length; j++) 
          System.out.print(évszámok_táblázat[i][j] + " ");
        System.out.println();
      }//külső ciklus
    }//ha volt táblázat
  }//main()
}//class