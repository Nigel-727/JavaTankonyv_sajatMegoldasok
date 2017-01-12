package fejezet_08;

public class LegkisebbPozitívSzám {

  public static void main(String[] args) {
    final int N = 20;
//    final int N = 300; //<-a feladatspecifikácóban ez a szám szerepel
    System.out.println(N+" db véletlenszám...");
    int[] tömb = new int[N]; //tömb
    //
    System.out.print("( ");
    for (int i = 0; i < N; i++) {
      tömb[i] = (int) (Math.random() * 101 - 50);
      System.out.print(tömb[i]+" ");
    }
    System.out.println(" )");
    //MINIMUMKIVÁLASZTÁS tétel
    int minHely = 0; //a legkisebb poz. szám indexe; a Java megköveteli a kezdőértékadást
    boolean voltpozitív = false; //plusz ELDÖNTÉS tétel 
    //...= minimumkeresés(!?) tétel
    for (int i = 0; i < N; i++) {
      if (0 < tömb[i]) {
        if (voltpozitív) { //MUSZÁJ a blokk (h az else ág jó if-hez tartozzon)
          if (tömb[i] < tömb[minHely])
            minHely = i;
        } else {
          voltpozitív = true;
          minHely = i;
        }
      }
    }
    if (voltpozitív)
      System.out.println("...között a legkisebb pozitív szám: "+tömb[minHely]
            + " indexe: "+minHely);
    else
      System.out.println("Sorry, de nem volt pozitív szám a tömbben.");
  }
}
